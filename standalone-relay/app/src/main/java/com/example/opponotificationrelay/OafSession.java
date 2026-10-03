package com.example.opponotificationrelay;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 通知服务与可选只读设备状态服务共用一条 OAF 连接。 */
public final class OafSession {
    public interface Events { void status(String value); void ready(); default boolean traceEnabled(){return false;} }
    private static final String PROFILE = "wear:notification";
    private static final int LOCAL_AGENT = 32101;
    private final OafWire wire;
    private final Events events;
    private final OafDeviceChannel device;
    private final OafHealthChannel health;
    private final Map<Integer, ByteArrayOutputStream> fragments = new HashMap<>();
    private volatile int notificationSession = -1;
    private int maxFragment = 960;
    private boolean discoveryQueried;
    private boolean connectionRequested;
    private int requestedSession;
    private int peerAgent;
    public OafSession(OafWire wire, Events events) { this(wire,events,null); }
    public OafSession(OafWire wire, Events events,OafDeviceChannel device) {this(wire,events,device,null);}
    public OafSession(OafWire wire, Events events,OafDeviceChannel device,OafHealthChannel health) {this.wire=wire;this.events=events;this.device=device;this.health=health;}
    public void pumpHealthSettings() throws IOException {if(health!=null){health.start(notificationSession,requestedSession,device==null?-1:device.reserved());health.pump();}}
    public void startDeviceStatus() throws IOException {if(device!=null)device.start(notificationSession,requestedSession,health==null?-1:health.reserved());}
    private static byte[] text(String value) { return value.getBytes(StandardCharsets.UTF_8); }
    private static byte[] hex(String value) {
        byte[] out = new byte[value.length() / 2];
        for (int i = 0; i < out.length; i++) out[i] = (byte)Integer.parseInt(value.substring(i*2, i*2+2), 16);
        return out;
    }
    public void authenticate(byte[] key, byte[] localId, byte[] alias, String peerId, long time) throws Exception {
        // 对端可能首先使用缓存探测；拒绝缓存以重新协商，避免沿用过期服务列表。
        byte[] offer = wire.read();
        if (offer[0] == 3) { wire.write(hex("04000103")); offer = wire.read(); }
        if (offer.length < 41 || offer[0] != 1) throw new IOException("未收到 OAF 端点协商");
        if ((offer[39] & 3) != 0) throw new IOException("当前端点要求 CRC，尚未协商此模式");
        events.status("OAF-WIRE offer " + OafTraceMetadata.endpoint(offer) + " localTL=0 localCL=0 fragmentLimit=" + maxFragment);
        events.status("端点协商成功，验证配对身份");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream answer = new DataOutputStream(bytes);
        answer.writeByte(2); answer.writeShort(1);
        byte[] id = text(peerId);
        if (id.length != 36) throw new IOException("OAF peer id length");
        answer.write(id); answer.writeByte(0); answer.writeByte(6);
        answer.writeByte(6); answer.writeByte(5); answer.write(text("Relay"));
        answer.writeByte(7); answer.writeByte(7); answer.write(text("Android"));
        answer.writeByte(8); answer.writeByte(10); answer.write(text("OAF Relay" + " "));
        answer.writeByte(10); answer.writeByte(8);
        answer.writeByte(12); answer.writeByte(1);
        answer.writeByte(13); answer.writeByte(0);
        wire.write(bytes.toByteArray());
        byte[] qc = new byte[8]; new SecureRandom().nextBytes(qc);
        wire.write(OafCrypto.request(key, qc, time, localId, alias));
        byte[] qs = OafCrypto.verifyResponse(key, qc, wire.read());
        wire.write(OafCrypto.confirm(key, qs, time));
        events.status("配对身份验证通过，发现通知服务");
    }
    public boolean isReady() { return notificationSession >= 32; }
    public void readAndHandle() throws IOException {
        byte[] frame = wire.read();
        if (frame.length < 3 || (frame[0] & 224) != 0) throw new IOException("OAF invalid TL frame");
        int sid = ((frame[0] & 15) << 6) | ((frame[1] & 252) >>> 2);
        if ((frame[0] & 16) != 0) { events.status("收到 OAF 传输控制帧 session=" + sid); return; }
        int flag = frame[1] & 3;
        byte[] data = Arrays.copyOfRange(frame, 2, frame.length);
        if (flag != 0) {
            // OAF：1=首片，2=中片，3=末片。
            if (flag == 1) fragments.put(sid, new ByteArrayOutputStream());
            ByteArrayOutputStream partial = fragments.get(sid);
            if (partial == null || partial.size() + data.length > 20480) throw new IOException("OAF invalid fragments");
            partial.write(data);
            if (flag != 3) return;
            data = partial.toByteArray(); fragments.remove(sid);
        }
        if (sid == 2) discovery(data);
        else if (sid == 1) control(data);
        else if (device!=null && device.matches(sid)) device.receive(data);
        else if (health!=null && health.matches(sid)) health.receive(data);
        else if (sid == notificationSession && data.length >= 2)
            events.status("收到通知通道应答 CID=" + (data[1] & 255) + " bytes=" + data.length);
    }
    private void discovery(byte[] data) throws IOException {
        if (data.length < 2) return;
        events.status("OAF 服务发现消息 type=" + (data[0] & 255) + " query=" + (data[1] & 255));
        if (data[0] == 2) {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(data));
            in.readUnsignedByte(); int query = in.readUnsignedByte();
            if (query == 2 || query == 3) in.readInt();
            int records = in.readUnsignedShort();
            if (records > 128) throw new IOException("OAF too many service records");
            for (int i = 0; i < records; i++) {
                readString(in); readString(in);
                int agents = in.readUnsignedShort();
                if (agents > 128) throw new IOException("OAF too many agents");
                for (int j = 0; j < agents; j++) {
                    int agent = in.readUnsignedShort();
                    String profile = readString(in);
                    in.readUnsignedShort(); in.readUnsignedByte(); in.readUnsignedShort();
                    if (PROFILE.equals(profile)) peerAgent = agent;
                    if(device!=null)device.peer(agent,profile,notificationSession,requestedSession,health==null?-1:health.reserved());
                    if(health!=null)health.peer(agent,profile,notificationSession,requestedSession,device==null?-1:device.reserved());
                }
            }
            if (peerAgent != 0 && !isReady() && !connectionRequested) {
                connectionRequested = true;
                do {requestedSession = 32 + new SecureRandom().nextInt(992);} while((device!=null && device.reserved()==requestedSession) || (health!=null && health.reserved()==requestedSession));
                wire.send(1, OafCrypto.concat(new byte[]{1}, OafWire.be16(peerAgent), OafWire.be16(LOCAL_AGENT), text(PROFILE + ";"),
                    OafWire.be16(1), OafWire.be16(requestedSession), OafWire.be16(1), new byte[]{4,2,0}));
                events.status("主动建立通知服务 session=" + requestedSession);
            }
            return;
        }
        if (data[0] != 1) return;
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bytes);
        out.writeByte(2); out.writeByte(3); out.writeInt(0x4f414631); out.writeShort(1);
        out.write(text("com.example.opponotificationrelay;;")); out.writeShort(1+(device==null?0:1)+(health==null?0:1));
        out.writeShort(LOCAL_AGENT); out.write(text(PROFILE + ";")); out.writeShort(0x100);
        out.writeByte(0x15); out.writeShort(10);
        if(device!=null){out.writeShort(OafDeviceChannel.LOCAL_AGENT);out.write(text(OafDeviceChannel.PROFILE+";"));out.writeShort(0x100);out.writeByte(0x15);out.writeShort(10);}
        if(health!=null){out.writeShort(OafHealthChannel.LOCAL_AGENT);out.write(text(OafHealthChannel.PROFILE+";"));out.writeShort(0x100);out.writeByte(0x15);out.writeShort(10);}
        wire.send(2, bytes.toByteArray());
        events.status("已声明独立通知服务，等待手表建连");
        if (!discoveryQueried) {
            discoveryQueried = true;
            wire.send(2, OafCrypto.concat(hex("01030000000001"), text(PROFILE + ";")));
            wire.send(1, hex("0700000000000000"));
        }
    }
    private static String readString(DataInputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = in.readUnsignedByte()) != ';') {
            if (out.size() >= 256) throw new IOException("OAF service string too long");
            out.write(b);
        }
        return new String(out.toByteArray(), StandardCharsets.UTF_8);
    }
    private void control(byte[] data) throws IOException {
        if (data.length < 1) return;
        int command = data[0] & 255;
        events.status("OAF 服务控制 type=" + command + " bytes=" + data.length);
        if (command == 7) {
            if (data.length < 7) throw new IOException("OAF truncated session config");
            wire.send(1, OafCrypto.concat(new byte[]{8}, Arrays.copyOfRange(data,3,5), Arrays.copyOfRange(data,1,3), new byte[]{1,0,0}));
            return;
        }
        if (command == 8) return;
        if (data.length < 6) throw new IOException("OAF truncated service command");
        int end = 5;
        while (end < data.length && data[end] != ';') end++;
        if (end == data.length) throw new IOException("OAF invalid profile");
        String profile = new String(data, 5, end - 5, StandardCharsets.UTF_8);
        if(device!=null && OafDeviceChannel.PROFILE.equals(profile)){device.control(data,end,notificationSession,requestedSession,health==null?-1:health.reserved());return;}
        if(health!=null && OafHealthChannel.PROFILE.equals(profile)){health.control(data,end,notificationSession,requestedSession,device==null?-1:device.reserved());return;}
        if (command == 1) {
            int p = end + 1;
            if (p + 2 > data.length) throw new IOException("OAF truncated channel count");
            int count = OafWire.u16(data,p); p += 2;
            if (count > 32 || p + count * 7 > data.length) throw new IOException("OAF malformed channels");
            boolean accept = PROFILE.equals(profile) && count == 1 && OafWire.u16(data,1) == LOCAL_AGENT;
            int sid = count == 1 ? OafWire.u16(data,p) : -1;
            accept = accept && sid >= 32 && sid <= 1023 && OafWire.u16(data,p + count*2) == 1
                && (device==null || device.reserved()!=sid) && (health==null || health.reserved()!=sid);
            byte[] response = OafCrypto.concat(new byte[]{2}, Arrays.copyOfRange(data,3,5), Arrays.copyOfRange(data,1,3),
                text(profile + ";"), new byte[]{(byte)(accept ? 0 : 1)}, OafWire.be16(accept ? 1 : 0), accept ? OafWire.be16(sid) : new byte[0]);
            wire.send(1,response);
            if (accept) {
                notificationSession = sid;
                events.status("通知服务已建立 session=" + sid); events.ready();
            }
        } else if (command == 2 && PROFILE.equals(profile)) {
            int p = end + 1;
            if (p + 3 > data.length) throw new IOException("OAF truncated connection response");
            int result = data[p] & 255;
            events.status("主动建连响应 status=" + result);
            if (result == 0 && OafWire.u16(data,p+1) == 1 && p+5 <= data.length
                    && OafWire.u16(data,1) == LOCAL_AGENT && OafWire.u16(data,p+3) == requestedSession
                    && (device==null || !device.matches(requestedSession))) {
                notificationSession = requestedSession;
                events.ready();
            }
        } else if (command == 3 && PROFILE.equals(profile)) {
            wire.send(1,OafCrypto.concat(new byte[]{4}, Arrays.copyOfRange(data,3,5), Arrays.copyOfRange(data,1,3), text(profile + ";"), new byte[]{0}));
            notificationSession = -1;
            throw new IOException("手表关闭通知服务");
        } else if (command == 5 && PROFILE.equals(profile)) {
            throw new IOException("手表要求额外应用身份认证，当前服务未就绪");
        }
    }
    public synchronized void send(RelayPayloadEncoder.EventEnvelope event) throws IOException {
        if (!isReady()) throw new IOException("通知服务尚未建立");
        MessageBudget.validate(event);
        byte[] cid = event.commandId < 255 ? new byte[]{(byte)event.commandId}
            : new byte[]{(byte)255,(byte)event.commandId,(byte)(event.commandId >>> 8)};
        byte[] data = OafCrypto.concat(new byte[]{0}, cid, event.payload); // SDK 标志 + CID + protobuf，无 SID。
        if (data.length > 20480) throw new IOException("通知超过手表 APDU 上限");
        if(event.picture!=null) {
            if(event.commandId!=RelayPayloadEncoder.COMMAND_POST_PARSED || event.picture.commandId!=RelayPayloadEncoder.COMMAND_PICTURE
                    || event.picture.picture!=null || !event.sourcePackage.equals(event.picture.sourcePackage))
                throw new IOException("图标与通知来源不匹配");
            send(event.picture);
        }
        boolean trace=events.traceEnabled() && (event.commandId==RelayPayloadEncoder.COMMAND_PICTURE || event.commandId==RelayPayloadEncoder.COMMAND_POST_PARSED);
        if(trace) events.status("OAF-WIRE message " + OafTraceMetadata.message(data,0,data.length)
            + " fragments=" + ((data.length+maxFragment-1)/maxFragment));
        int fragment=0;
        for (int p = 0; p < data.length; p += maxFragment) {
            int end = Math.min(p + maxFragment, data.length);
            int flag = data.length <= maxFragment ? 0 : p == 0 ? 1 : end == data.length ? 3 : 2;
            byte[] frame=OafCrypto.concat(new byte[]{(byte)(notificationSession >>> 6),(byte)((notificationSession << 2) | flag)}, Arrays.copyOfRange(data,p,end));
            wire.write(frame);
            if(trace) events.status("OAF-WIRE written CID="+event.commandId+" fragment="+(++fragment)+" offset="+p
                + " " + OafTraceMetadata.frame(frame,0,frame.length,false));
        }
    }
}
