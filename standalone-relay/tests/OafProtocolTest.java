package com.example.opponotificationrelay;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.*;

public final class OafProtocolTest {
    private static int assertions;
    private static void check(boolean ok, String message) {
        assertions++;
        if (!ok) throw new AssertionError(message);
    }
    private static byte[] bytes(String value) { return value.getBytes(StandardCharsets.UTF_8); }
    private static byte[] cat(byte[]... parts) { return OafCrypto.concat(parts); }
    // Serialization fixture only, not an image-decoder test.
    private static byte[] jpegFixture() {
        byte[] b=new byte[4096];b[0]=(byte)255;b[1]=(byte)216;b[b.length-2]=(byte)255;b[b.length-1]=(byte)217;return b;
    }
    private static byte[] readFragmented(OafWire watch,int sid) throws IOException {
        ByteArrayOutputStream assembled=new ByteArrayOutputStream();int count=0;
        while(true) {
            byte[] frame=watch.read();int flag=frame[1]&3;
            check(frame.length<=962,"fragment size bounded");
            check((((frame[0]&15)<<6)|((frame[1]&252)>>>2))==sid,"notification session id");
            if(count++==0) check(flag==1,"first fragment flag");
            else check(flag==2||flag==3,"middle/end fragment flags");
            assembled.write(frame,2,frame.length-2);
            if(flag==3) return assembled.toByteArray();
        }
    }
    private static byte[] hex(String s) {
        byte[] b = new byte[s.length()/2];
        for (int i=0;i<b.length;i++) b[i]=(byte)Integer.parseInt(s.substring(2*i,2*i+2),16);
        return b;
    }
    private static void crypto() throws Exception {
        byte[] key = hex("000102030405060708090a0b0c0d0e0f");
        byte[] qc = hex("1011121314151617"), qs = hex("2021222324252627");
        OafCrypto a = new OafCrypto(key,qc,qs), b = new OafCrypto(key,qc,qs);
        byte[] encrypted = a.encrypt(bytes("中文通知 / message"));
        check(ByteBuffer.wrap(encrypted).getLong()==1,"first counter");
        check(Arrays.equals(b.decrypt(encrypted),bytes("中文通知 / message")),"AES GCM roundtrip");
        try { b.decrypt(encrypted); throw new AssertionError("replay accepted"); } catch (GeneralSecurityException expected) { assertions++; }
        byte[] second = a.encrypt(bytes("second")), corrupted = second.clone(); corrupted[12]^=1;
        try { b.decrypt(corrupted); throw new AssertionError("bad tag accepted"); } catch (GeneralSecurityException expected) { assertions++; }
        check(Arrays.equals(b.decrypt(second),bytes("second")),"failed tag must not advance counter");
        byte[] request=OafCrypto.request(key,qc,42,new byte[6],new byte[6]);
        check(request.length==38 && ByteBuffer.wrap(request,10,8).getLong()==42,"auth wire endian");
        byte[] response=cat(hex("110100"),qs,ByteBuffer.allocate(8).putLong(87).array(),OafCrypto.challengeMac(key,cat(qc,qs),87));
        check(Arrays.equals(OafCrypto.verifyResponse(key,qc,response),qs),"auth server verify");
        response[26]^=1;
        try { OafCrypto.verifyResponse(key,qc,response); throw new AssertionError("bad auth accepted"); }
        catch (GeneralSecurityException expected) { assertions++; }
    }
    private static void framing() throws Exception {
        check(OafWire.crc16(bytes("123456789"))==0xbb3d,"CRC16 ARC check vector");
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        OafWire sender=new OafWire(new ByteArrayInputStream(new byte[0]),out); sender.crc=true;
        sender.write(bytes("通知")); byte[] raw=out.toByteArray();
        InputStream fragmented=new FilterInputStream(new ByteArrayInputStream(raw)) {
            @Override public int read(byte[] b,int off,int len) throws IOException { return super.read(b,off,Math.min(1,len)); }
        };
        OafWire receiver=new OafWire(fragmented,new ByteArrayOutputStream());receiver.crc=true;
        check(Arrays.equals(receiver.read(),bytes("通知")),"split RFCOMM reads");
        raw[raw.length-1]^=1;
        receiver=new OafWire(new ByteArrayInputStream(raw),new ByteArrayOutputStream());receiver.crc=true;
        try {receiver.read();throw new AssertionError("bad crc accepted");}catch(IOException expected){assertions++;}
        try {new OafWire(new ByteArrayInputStream(hex("000501")),out).read();throw new AssertionError("truncation accepted");}
        catch(EOFException expected){assertions++;}
    }
    private static void session(boolean large144) throws Exception {
        PipedInputStream phoneIn = new PipedInputStream(65536), watchIn = new PipedInputStream(65536);
        PipedOutputStream phoneOut = new PipedOutputStream(watchIn), watchOut = new PipedOutputStream(phoneIn);
        OafWire watch = new OafWire(watchIn,watchOut);
        byte[] key=hex("000102030405060708090a0b0c0d0e0f");
        RelayIcon probe=new RelayIcon("test","test",jpegFixture(),144,144).withFreshKey();
        ExecutorService executor=Executors.newSingleThreadExecutor();
        Future<?> remote=executor.submit(() -> {
            try {
                watch.write(cat(hex("010000"),bytes("OAFP0123456789ABCDEF0123456789ABCDEF"),hex("1000")));
                byte[] offerAnswer=watch.read();
                check(offerAnswer[0]==2 && offerAnswer[39]==0,"endpoint answer");
                byte[] request=watch.read();
                byte[] qc=Arrays.copyOfRange(request,2,10),qs=hex("2021222324252627");
                long tc=ByteBuffer.wrap(request,10,8).getLong();
                check(Arrays.equals(Arrays.copyOfRange(request,18,26),OafCrypto.challengeMac(key,qc,tc)),"live request mac");
                watch.write(cat(hex("110100"),qs,ByteBuffer.allocate(8).putLong(456).array(),OafCrypto.challengeMac(key,cat(qc,qs),456)));
                check(Arrays.equals(watch.read(),OafCrypto.confirm(key,qs,tc)),"live confirm mac");
                watch.send(2,cat(hex("01020000000001"),bytes("wear:notification;")));
                byte[] advert=watch.read();
                check(advert[2]==2 && new String(advert,StandardCharsets.UTF_8).contains("wear:notification"),"notification declaration");
                check(watch.read()[2]==1,"service query");
                check(watch.read()[2]==7,"session wake request");
                watch.send(2,cat(hex("0202000000000001"),bytes(";;"),hex("00010004"),bytes("wear:notification;"),hex("000010000a")));
                byte[] connection=watch.read();
                check(connection[2]==1 && OafWire.u16(connection,3)==4,"active reconnect request");
                int end=7;while(connection[end]!=';')end++;
                int sid=OafWire.u16(connection,end+3);
                watch.send(1,cat(hex("027d650004"),bytes("wear:notification;"),hex("000001"),OafWire.be16(sid)));
                byte[] switches=watch.read();
                check((((switches[0]&15)<<6)|((switches[1]&252)>>>2))==sid && (switches[1]&3)==0,"CID84 uses established notification session");
                check(switches[2]==0 && (switches[3]&255)==84,"CID84 precedes first image and notification after connection");
                check(Arrays.equals(Arrays.copyOfRange(switches,4,switches.length),hex("08818080d00b")),"high-bit settings use uint32 five-byte varint on wire");
                byte[] picture=readFragmented(watch,sid);
                check(picture[0]==0 && (picture[1]&255)==202,"CID202 picture must precede CID200 post");
                byte[] pictureProto=Arrays.copyOfRange(picture,2,picture.length);
                check(Arrays.equals(field(pictureProto,1),bytes(probe.key+(large144 ? "_large_144" : "_large"))),"fresh picture key survives transport fragmentation");
                check(Arrays.equals(field(pictureProto,3),jpegFixture()),"separate JPEG survives fragment reassembly");
                byte[] notification=readFragmented(watch,sid);
                byte[] postProto=Arrays.copyOfRange(notification,2,notification.length);
                check(Arrays.equals(field(field(postProto,large144 ? 30 : 17),1),field(pictureProto,1)),"post refers to already sent picture key");
                check(notification[0]==0 && (notification[1]&255)==200,"SDK flags and CID without SID");
                check(new String(notification,StandardCharsets.UTF_8).contains("中文正文"),"UTF8 survives protocol");
            } catch(Exception e) { throw new RuntimeException(e); }
        });
        try {
            OafSession session=new OafSession(new OafWire(phoneIn,phoneOut),new OafSession.Events(){
                public void status(String s){} public void ready(){}
            });
            session.authenticate(key,new byte[6],new byte[6],"OAFP11111111111111111111111111111111",123);
            session.readAndHandle(); session.readAndHandle();session.readAndHandle();
            check(session.isReady(),"active reconnect is ready only after response");
            session.send(RelayPayloadEncoder.encodeNotificationSwitches(0xba000001,"test"));
            StringBuilder body=new StringBuilder("中文正文");for(int i=0;i<4000;i++)body.append('a');
            RelayEvent post=RelayEvent.posted(1,"t","k","test","Test","Title",body.toString(),"",1,false);
            session.send(large144 ? RelayPayloadEncoder.encodeLarge144Probe(post,probe)
                : RelayPayloadEncoder.encode(post,200,probe,false));
            remote.get(3,TimeUnit.SECONDS);
        } finally {phoneIn.close();phoneOut.close();watchIn.close();watchOut.close();executor.shutdownNow();}
    }
    private static void handover() {
        HandoverPolicy p=new HandoverPolicy();
        check(!p.canOwn(0),"unknown startup must yield");
        p.sample(HandoverPolicy.Presence.OFFLINE,0);
        check(p.presence()==HandoverPolicy.Presence.UNKNOWN,"closed channel rejects stale messages");
        p.open();
        p.sample(HandoverPolicy.Presence.OFFLINE,0);
        check(!p.canOwn(0),"no immediate takeover");
        long rev=p.revision();
        check(!p.confirmOffline(rev,8999),"early confirmation rejected");
        check(!p.canOwn(9000) && p.needsConfirmation(9000),"grace alone cannot authorize ownership");
        check(p.confirmOffline(rev,9000),"matching second confirmation accepted");
        check(p.canOwn(9000),"confirmed offline takeover");
        check(p.canOwn(900000),"quiet healthy event subscription does not expire");
        p.sample(HandoverPolicy.Presence.ONLINE,900001);
        check(!p.canOwn(900001),"official immediately preempts");
        check(!p.confirmOffline(rev,900002),"stale confirmation cannot override online");
        p.sample(HandoverPolicy.Presence.OFFLINE,910000);
        long beforeDirty=p.revision();
        p.sample(HandoverPolicy.Presence.UNKNOWN,911000);
        check(!p.canOwn(920000),"Binder event or unknown must not claim offline");
        p.sample(HandoverPolicy.Presence.OFFLINE,920000);
        check(!p.confirmOffline(beforeDirty,930000),"unknown invalidates outstanding confirmation");
        check(p.confirmOffline(p.revision(),930000),"recovery with new confirmation");
        p.close();
        check(!p.canOwn(930001),"pipe EOF immediately revokes ownership");
        p.open();
        check(!p.canOwn(940000),"new channel does not inherit prior offline state");
        p.sample(HandoverPolicy.Presence.OFFLINE,940000);
        p.sample(HandoverPolicy.Presence.OFFLINE,944000);
        check(p.remaining(944000)==5000,"duplicate offline event preserves grace");
        p.sample(HandoverPolicy.Presence.ONLINE,945000);
        check(p.remaining(999000)==-1,"online cancels grace");
        check(ObserverMessage.parse("su: permission denied")==null,"non-protocol output never means offline");
        check("READY".equals(ObserverMessage.parse("OAFMON1 READY").type),"ready frame");
        ObserverMessage m=ObserverMessage.parse("OAFMON1 STATE 8 OFFLINE 0 CONFIRM");
        check(m.request==8 && m.presence==HandoverPolicy.Presence.OFFLINE,"confirmation frame");
        check(ObserverMessage.parse("OAFMON1 STATE 0 ONLINE 2 INITIAL").binders==2,"Binder count frame");
        for(String bad:new String[]{"OAFMON1 STATE 0 OFFLINE -1 INITIAL","OAFMON1 STATE -1 OFFLINE 0 INITIAL",
            "OAFMON1 STATE 0 FALSE 0 INITIAL","OAFMON1 STATE 1 OFFLINE","OAFMON1 STATE 0 OFFLINE 5 INITIAL"}) {
            try {ObserverMessage.parse(bad);throw new AssertionError("bad frame accepted");}
            catch(IllegalArgumentException expected) {assertions++;}
        }
        RelayPayloadEncoder.EventEnvelope e=RelayPayloadEncoder.encode(RelayEvent.posted(1,"","","test.selected","Test","T","B","",1,false));
        check("test.selected".equals(e.sourcePackage),"queued events keep package for latest selection check");
    }
    private static long varint(ByteArrayInputStream in) {
        long result=0;int shift=0,b;
        do {b=in.read();if(b<0 || shift>63) throw new AssertionError("invalid varint");result|=(long)(b&127)<<shift;shift+=7;} while((b&128)!=0);
        return result;
    }
    private static byte[] field(byte[] input,int wanted) {
        ByteArrayInputStream in=new ByteArrayInputStream(input);
        while(in.available()>0) {
            int tag=(int)varint(in);
            if((tag&7)==0) {varint(in);continue;}
            if((tag&7)!=2) throw new AssertionError("unexpected wire type");
            int length=(int)varint(in);byte[] b=new byte[length];
            if(in.read(b,0,length)!=length) throw new AssertionError("truncated field");
            if((tag>>>3)==wanted) return b;
        }
        return new byte[0];
    }
    private static void regression102() {
        RelayEvent e=RelayEvent.posted(1,"tag","key","com.test.chat","聊天应用","消息","正文","",1,false);
        byte[] jpeg=jpegFixture();
        RelayIcon icon=new RelayIcon(e.packageName,e.packageName,jpeg,144,144);
        RelayPayloadEncoder.EventEnvelope envelope=RelayPayloadEncoder.encode(e,200,icon,true);
        byte[] payload=envelope.payload;
        check(Arrays.equals(field(payload,9),bytes(e.packageName)),"real source package");
        check(Arrays.equals(field(payload,10),bytes("聊天应用")),"real source label");
        check(Arrays.equals(field(payload,6),bytes("【聊天应用】消息")),"source title compatibility");
        check(field(payload,15).length==0 && field(payload,16).length==0,"remove unsupported inline app/small icon path");
        check(envelope.picture!=null && envelope.picture.commandId==202,"picture travels atomically with its post queue item");
        check(Arrays.equals(field(envelope.picture.payload,3),jpeg),"standalone JPEG data");
        check(Arrays.equals(field(field(payload,17),1),bytes(e.packageName+"_large")),"official picture reference key");
        check(Arrays.equals(field(field(payload,17),2),bytes("_large")),"official picture type");
        check(field(field(payload,17),3).length==0,"post carries reference only, no inline bitmap");
        RelayIcon probe=icon.withFreshKey(),nextProbe=icon.withFreshKey();
        RelayPayloadEncoder.EventEnvelope fresh=RelayPayloadEncoder.encode(e,200,probe,false);
        check(!probe.key.equals(icon.key) && !probe.key.equals(nextProbe.key),"each icon probe avoids old and prior probe keys");
        check(Arrays.equals(field(fresh.payload,9),bytes(e.packageName)),"probe retains real application source");
        check(Arrays.equals(field(fresh.picture.payload,3),field(envelope.picture.payload,3))
            && probe.width==icon.width && probe.height==icon.height,"probe only changes key, preserves image data and dimensions");
        check(Arrays.equals(field(fresh.picture.payload,1),field(field(fresh.payload,17),1)),"fresh upload and post reference use the same key");
        check(!Arrays.equals(field(fresh.picture.payload,1),field(envelope.picture.payload,1)),"fresh upload cannot refer to normal package icon cache");
        check(Arrays.equals(field(RelayPayloadEncoder.encode(e,200,icon,false).picture.payload,1),bytes(e.packageName+"_large")),"probe does not mutate regular icon cache entry");
        RelayPayloadEncoder.EventEnvelope large144=RelayPayloadEncoder.encodeLarge144Probe(e,probe);
        check(large144.commandId==200 && large144.picture.commandId==202,"144 probe carries image atomically before post");
        check(field(large144.payload,17).length==0 && field(large144.payload,30).length>0,"144 probe uses official field30 instead of field17");
        check(Arrays.equals(field(large144.picture.payload,1),field(field(large144.payload,30),1)),"144 upload and reference keys match");
        check(Arrays.equals(field(large144.picture.payload,2),bytes("_large_144"))
            && Arrays.equals(field(field(large144.payload,30),2),bytes("_large_144")),"144 type matches on upload and reference");
        check(Arrays.equals(field(large144.picture.payload,3),jpeg),"144 probe preserves original JPEG bytes");
        check(Arrays.equals(field(large144.payload,9),bytes(e.packageName)),"144 probe keeps source package");
        for(RelayIcon invalid:new RelayIcon[]{null,new RelayIcon("relay","relay",jpeg,144,144),new RelayIcon(e.packageName,e.packageName,jpeg,96,96)}) {
            try {RelayPayloadEncoder.encodeLarge144Probe(e,invalid);throw new AssertionError("invalid probe accepted");}
            catch(IllegalArgumentException expected) {assertions++;}
        }
        check(RelayPayloadEncoder.encode(e,200).picture==null,"missing icon preserves text-only post");
        check(RelayPayloadEncoder.encode(e,1,icon,true).picture==null,"legacy CID1 cannot send iWatch picture");
        check(RelayPayloadEncoder.encode(RelayEvent.removed(1,"t","k",e.packageName),200,icon,true).picture==null,"removals carry no picture");
        check(Arrays.equals(field(RelayPayloadEncoder.encode(e,200,icon,false).payload,6),bytes("消息")),"prefix optional");
        check(field(RelayPayloadEncoder.encode(e,200).payload,15).length==0,"no relay icon fallback");
        try {RelayPayloadEncoder.encode(e,200,new RelayIcon("relay","relay",jpeg,32,32),true);throw new AssertionError("wrong icon accepted");}
        catch(IllegalArgumentException expected) {assertions++;}
        try {new RelayIcon(e.packageName,e.packageName,hex("89504e470d0a1a0a"),32,32);throw new AssertionError("PNG incorrectly accepted as JPEG");}
        catch(IllegalArgumentException expected) {assertions++;}
        String mac="AA:BB:CC:DD:EE:FF";
        String record="001122334455;"+mac+";aabbccddeeff;2;0;com.heytap.health;1";
        check(PairingRecord.find(record,mac.toLowerCase()).alias.equals("AABBCCDDEEFF"),"MCU pairing normalized");
        check(PairingRecord.find(record.replace(";1",";0")+"_"+record,mac).deviceId.equals("001122334455"),"ignore other endpoint");
        for(String bad:new String[]{record.replace(";1",";0"),record.replace(mac,"11:22:33:44:55:66"),record+"_"+record.replace("001122334455","112233445566"),record.replace("aabbccddeeff","zzbbccddeeff")}) {
            try {PairingRecord.find(bad,mac);throw new AssertionError("invalid pairing accepted");}
            catch(IllegalArgumentException expected) {assertions++;}
        }
        HandoverNoticePolicy n=new HandoverNoticePolicy();
        check(!n.ready(),"no takeover announcement before offline");
        check(n.presence(HandoverPolicy.Presence.ONLINE),"first online notification");
        check(!n.presence(HandoverPolicy.Presence.ONLINE),"deduplicate online");
        n.presence(HandoverPolicy.Presence.UNKNOWN);
        check(!n.ready(),"unknown never implies takeover");
        n.presence(HandoverPolicy.Presence.OFFLINE);
        check(n.ready() && !n.ready(),"one takeover per cycle");
        n.presence(HandoverPolicy.Presence.UNKNOWN);n.presence(HandoverPolicy.Presence.OFFLINE);
        check(!n.ready(),"no repeated takeover on reconnect");
        check(n.presence(HandoverPolicy.Presence.ONLINE),"official return announcement");
        n.presence(HandoverPolicy.Presence.OFFLINE);
        check(n.ready(),"next takeover cycle");
    }
    private static void screenPolicy() {
        for(boolean enabled:new boolean[]{false,true})
            for(boolean interactive:new boolean[]{false,true})
                for(boolean removed:new boolean[]{false,true})
                    for(boolean own:new boolean[]{false,true})
                        check(ScreenForwardPolicy.block(enabled,interactive,removed,own)==(enabled&&interactive&&!removed&&!own),"screen policy truth table");
        check(!ScreenForwardPolicy.block(true,false,false,false),"screen off delivers");
        check(ScreenForwardPolicy.block(true,true,false,false),"queued post dropped if phone wakes before send");
    }
    private static void startupPolicy() {
        check(StartupPolicy.restore(true,true),"restore previous enabled session");
        check(!StartupPolicy.restore(true,false),"explicit user Stop survives reboot and reopen");
        check(!StartupPolicy.restore(false,true),"auto restore toggle respected");
        check(!StartupPolicy.restore(false,false),"fresh disabled app stays stopped");
    }
    public static void main(String[] args) throws Exception {crypto();framing();session(false);session(true);handover();regression102();screenPolicy();startupPolicy();System.out.println("PASS "+assertions+" protocol/policy assertions");}
}
