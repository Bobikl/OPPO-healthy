package com.example.opponotificationrelay;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 根据静态分析得到的字段号生成官方通知消息的 protobuf wire payload。
 * 外层 MessageEvent 的 service id / command id 由 EventEnvelope 表示。
 */
public final class RelayPayloadEncoder {
    public static final int SERVICE_ID = 2;
    public static final int COMMAND_POSTED = 1;
    public static final int COMMAND_REMOVED = 3;
    public static final int COMMAND_POST_PARSED = 200;
    public static final int COMMAND_DISMISS = 201;
    public static final int COMMAND_PICTURE = 202;
    public static final int COMMAND_NOTIFICATION_SWITCHES = 84;
    public static final int COMMAND_PHONE_SCREEN = 146;

    private RelayPayloadEncoder() {}
    /** Official ScreenStatus.status field 1: 1 for interactive and unlocked, otherwise 0. */
    public static EventEnvelope encodePhoneScreen(boolean usingPhone,String sourcePackage) {
        if(sourcePackage==null || sourcePackage.isEmpty())throw new IllegalArgumentException("missing screen source");
        ProtoWriter out=new ProtoWriter();out.int32(1,usingPhone?1:0);
        return new EventEnvelope(SERVICE_ID,COMMAND_PHONE_SCREEN,out.toByteArray(),sourcePackage);
    }

    /** NotificationSwitchData.switchData 是 field1/uint32，最高位未佩戴开关用五字节 varint。 */
    public static EventEnvelope encodeNotificationSwitches(int bitmap,String sourcePackage) {
        if(sourcePackage==null || sourcePackage.isEmpty()) throw new IllegalArgumentException("missing settings source");
        ProtoWriter out=new ProtoWriter();out.int32(1,bitmap);
        return new EventEnvelope(SERVICE_ID,COMMAND_NOTIFICATION_SWITCHES,out.toByteArray(),sourcePackage);
    }

    public static EventEnvelope encode(RelayEvent event) {
        return encode(event, COMMAND_POST_PARSED);
    }

    public static EventEnvelope encode(RelayEvent event, int preferCid) {
        return encode(event,preferCid,null,false);
    }

    public static EventEnvelope encode(RelayEvent event,int preferCid,RelayIcon icon,boolean sourceInTitle) {
        if (event.removed) {
            int cid = (preferCid == COMMAND_POST_PARSED) ? COMMAND_DISMISS : COMMAND_REMOVED;
            return new EventEnvelope(SERVICE_ID, cid, encodeRemoved(event), event.packageName);
        }
        if (preferCid == COMMAND_POST_PARSED) {
            if(icon!=null && !event.packageName.equals(icon.sourcePackage)) throw new IllegalArgumentException("icon source mismatch");
            byte[] payload=encodeParsedPosted(event,icon,sourceInTitle);
            // Icon and post stay in one queue item; never enqueue the reference without its picture.
            EventEnvelope picture=icon==null ? null : new EventEnvelope(SERVICE_ID,COMMAND_PICTURE,picture(icon,true),event.packageName);
            return new EventEnvelope(SERVICE_ID, COMMAND_POST_PARSED, payload, event.packageName,picture);
        }
        return new EventEnvelope(SERVICE_ID, COMMAND_POSTED, encodePosted(event), event.packageName);
    }

    /** 本次实测官方_large主图是216像素；按PNG分支做新键对照，保留field17。 */
    public static EventEnvelope encodeOfficialMainProbe(RelayEvent event,RelayIcon icon) {
        if(event.removed || icon==null || !event.packageName.equals(icon.sourcePackage)
                || icon.width!=216 || icon.height!=216 || icon.data[0]!=(byte)137)
            throw new IllegalArgumentException("invalid main icon probe");
        return encode(event,COMMAND_POST_PARSED,icon,false);
    }

    /** 按实测BMP签名做主图对照，复用field17完整消息路径。 */
    public static EventEnvelope encodeBitmapMainProbe(RelayEvent event,RelayIcon icon) {
        if(event.removed || icon==null || !event.packageName.equals(icon.sourcePackage)
                || !WatchIconBitmap.valid(icon.data)) throw new IllegalArgumentException("invalid BMP main probe");
        return encode(event,COMMAND_POST_PARSED,icon,false);
    }

    /** 仅用于手动对照官方 large144IconBitmap 路径，不改变日常通知编码。 */
    public static EventEnvelope encodeLarge144Probe(RelayEvent event,RelayIcon icon) {
        if(event.removed || icon==null || !event.packageName.equals(icon.sourcePackage)
                || icon.width!=144 || icon.height!=144) throw new IllegalArgumentException("invalid 144 icon probe");
        String type="_large_144";
        EventEnvelope image=new EventEnvelope(SERVICE_ID,COMMAND_PICTURE,picture(icon,true,type),event.packageName);
        return new EventEnvelope(SERVICE_ID,COMMAND_POST_PARSED,encodeParsedPosted(event,icon,false,type,30),event.packageName,image);
    }

    private static byte[] encodeParsedPosted(RelayEvent event,RelayIcon icon,boolean sourceInTitle) {
        return encodeParsedPosted(event,icon,sourceInTitle,"_large",17);
    }
    private static byte[] encodeParsedPosted(RelayEvent event,RelayIcon icon,boolean sourceInTitle,String iconType,int iconField) {
        ProtoWriter out = new ProtoWriter();
        // ParsedNotificationProto 的字段号和 wire type 必须与官方 proto 一致。
        out.int32(1, event.id);
        out.string(2, event.key);
        out.string(3, event.groupKey);
        out.bool(4, event.isGroupSummary);
        out.string(5, event.tag);
        out.string(6,sourceInTitle && !event.appName.isEmpty() ? "【"+event.appName+"】"+event.title : event.title);
        out.int64(7, event.whenTimeMillis);
        out.int64(8, event.postTime);
        out.string(9, event.packageName);
        out.string(10, event.appName);
        out.int32(11, event.notificationFlags);
        out.string(13, event.group);
        out.bool(14, event.isWorkProfile);
        if(icon!=null) {
            out.message(iconField,picture(icon,false,iconType));
        }
        out.bool(19, event.isInterruptible);
        out.bool(20, event.shouldOnlyAlertOnce);
        out.int32(21, event.groupAlertBehavior);
        out.string(23, event.subContent);
        // ParsedNotificationProto 没有顶层 content 字段，正文在 style.standardStyle.body。
        out.message(26, buildStandardStyle(event.content));
        return out.toByteArray();
    }

    private static byte[] picture(RelayIcon icon,boolean includeData) {
        return picture(icon,includeData,"_large");
    }
    private static byte[] picture(RelayIcon icon,boolean includeData,String type) {
        ProtoWriter p=new ProtoWriter();
        p.string(1,icon.key+type);p.string(2,type);
        if(includeData) {p.message(3,icon.data);p.int32(4,icon.width);p.int32(5,icon.height);}
        return p.toByteArray();
    }

    /** 仅在实际发送CID200时添加官方flags静默位，保持图片/正文和其他字段字节。 */
    public static EventEnvelope withSilentFlag(EventEnvelope event) {
        if(event==null || event.commandId!=COMMAND_POST_PARSED || event.serviceId!=SERVICE_ID) return event;
        byte[] payload=event.payload;int[] pos={0};int start=-1,end=-1,flags=0;
        while(pos[0]<payload.length) {
            int begin=pos[0];long tag=readVarint(payload,pos);
            int field=(int)(tag>>>3),kind=(int)(tag&7);
            if(field<=0) throw new IllegalArgumentException("invalid notification field");
            if(kind==0) {
                long value=readVarint(payload,pos);
                if(field==11) {
                    if(start!=-1 || value<0 || value>0xffffffffL) throw new IllegalArgumentException("invalid flags");
                    start=begin;end=pos[0];flags=(int)value;
                }
            } else {
                long length=kind==2?readVarint(payload,pos):kind==1?8:kind==5?4:-1;
                if(length<0 || length>payload.length-pos[0]) throw new IllegalArgumentException("invalid notification length");
                pos[0]+=(int)length;
            }
        }
        if((flags&NapQuietPolicy.SILENT_FLAG)!=0) return event;
        ProtoWriter silent=new ProtoWriter();silent.int32(11,flags|NapQuietPolicy.SILENT_FLAG);
        ByteArrayOutputStream bytes=new ByteArrayOutputStream();
        if(start<0) {bytes.write(payload,0,payload.length);}
        else {bytes.write(payload,0,start);}
        byte[] encoded=silent.toByteArray();bytes.write(encoded,0,encoded.length);
        if(start>=0) bytes.write(payload,end,payload.length-end);
        return new EventEnvelope(event.serviceId,event.commandId,bytes.toByteArray(),event.sourcePackage,event.picture);
    }
    private static long readVarint(byte[] payload,int[] pos) {
        long value=0;
        for(int shift=0;shift<64;shift+=7) {
            if(pos[0]>=payload.length) throw new IllegalArgumentException("truncated notification");
            int b=payload[pos[0]++]&255;
            if(shift==63 && b>1) throw new IllegalArgumentException("overflow notification");
            value|=(long)(b&127)<<shift;
            if((b&128)==0) return value;
        }
        throw new IllegalArgumentException("invalid notification varint");
    }

    private static byte[] buildStandardStyle(String content) {
        ProtoWriter standard = new ProtoWriter();
        standard.string(1, content);

        ProtoWriter style = new ProtoWriter();
        style.string(1, "standard");
        style.message(2, standard.toByteArray());
        return style.toByteArray();
    }

    private static byte[] encodePosted(RelayEvent event) {
        ProtoWriter out = new ProtoWriter();
        out.int32(1, event.id);
        out.string(2, event.packageName);
        out.string(3, event.tag);
        out.string(4, event.title);
        out.string(5, event.content);
        out.string(6, event.subContent);
        out.string(7, event.key);
        out.int64(8, event.postTime);
        out.string(12, "android");
        out.string(13, event.appName);
        out.bool(14, event.hasRemoteInput);
        return out.toByteArray();
    }

    private static byte[] encodeRemoved(RelayEvent event) {
        ProtoWriter out = new ProtoWriter();
        out.int32(1, event.id);
        out.string(2, event.tag);
        out.string(3, event.packageName);
        out.string(4, event.key);
        return out.toByteArray();
    }

    public static final class EventEnvelope {
        public final int serviceId;
        public final int commandId;
        public final byte[] payload;
        public final String sourcePackage;
        public final EventEnvelope picture;

        EventEnvelope(int serviceId, int commandId, byte[] payload, String sourcePackage) {
            this(serviceId,commandId,payload,sourcePackage,null);
        }
        EventEnvelope(int serviceId,int commandId,byte[] payload,String sourcePackage,EventEnvelope picture) {
            this.serviceId = serviceId;
            this.commandId = commandId;
            this.payload = payload;
            this.sourcePackage = sourcePackage;
            this.picture=picture;
        }

        public byte[] toBytesWithHeader() {
            int len = (payload != null) ? payload.length : 0;
            byte[] bytes = new byte[len + 2];
            bytes[0] = (byte) (serviceId & 0xff);
            bytes[1] = (byte) (commandId & 0xff);
            if (payload != null && len > 0) {
                System.arraycopy(payload, 0, bytes, 2, len);
            }
            return bytes;
        }
    }

    private static final class ProtoWriter {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private void room(int count) {
            if(count<0 || out.size()>MessageBudget.MAX_APDU_BYTES-10-count) throw new MessageBudget.Rejected("通知超过手表消息上限");
        }

        void int32(int field, int value) {
            if (value != 0) {
                key(field, 0);
                varint(value & 0xffffffffL);
            }
        }

        void int64(int field, long value) {
            if (value != 0L) {
                key(field, 0);
                varint(value);
            }
        }

        void bool(int field, boolean value) {
            if (value) {
                key(field, 0);
                varint(1L);
            }
        }

        void string(int field, String value) {
            if (value != null && !value.isEmpty()) {
                MessageBudget.identifier(value,MessageBudget.MAX_APDU_BYTES-10);
                byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
                room(bytes.length+6);
                key(field, 2);
                varint(bytes.length);
                out.write(bytes, 0, bytes.length);
            }
        }

        void message(int field, byte[] message) {
            if (message != null && message.length > 0) {
                room(message.length+6);
                key(field, 2);
                varint(message.length);
                out.write(message, 0, message.length);
            }
        }

        private void key(int field, int wireType) {
            varint(((long) field << 3) | wireType);
        }

        private void varint(long value) {
            room(10);
            while ((value & ~0x7fL) != 0L) {
                out.write((int) ((value & 0x7fL) | 0x80L));
                value >>>= 7;
            }
            out.write((int) value);
        }

        byte[] toByteArray() {
            return out.toByteArray();
        }
    }
}
