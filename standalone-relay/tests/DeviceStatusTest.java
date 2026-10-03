package com.example.opponotificationrelay;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

public final class DeviceStatusTest {
    static int checks;static final String MAC="AA:BB:CC:DD:EE:FF";
    static void check(boolean value,String message){checks++;if(!value)throw new AssertionError(message);}
    interface Action{void run()throws Exception;}
    static void reject(Action action,String why)throws Exception{try{action.run();throw new AssertionError(why);}catch(IOException expected){checks++;}}
    static byte[] hex(String s){byte[] b=new byte[s.length()/2];for(int i=0;i<b.length;i++)b[i]=(byte)Integer.parseInt(s.substring(2*i,2*i+2),16);return b;}
    static byte[] text(String s){return s.getBytes(StandardCharsets.UTF_8);}
    static byte[] cat(byte[]... values){return OafCrypto.concat(values);}
    static List<byte[]> frames(byte[] raw)throws Exception{ByteArrayInputStream in=new ByteArrayInputStream(raw);OafWire wire=new OafWire(in,new ByteArrayOutputStream());List<byte[]> out=new ArrayList<>();while(in.available()>0)out.add(wire.read());return out;}
    static void protocol()throws Exception{
        check(Arrays.equals(DeviceStatusProtocol.batteryRequest(MAC),cat(hex("0a11"),text(MAC))),"official battery requester field 1");
        check(Arrays.equals(DeviceStatusProtocol.modeRequest(300,1),hex("10ac0220012801")),"mode query includes sequence and official primary/Android fields, no workMode write");
        check(Arrays.equals(DeviceStatusProtocol.modeRequest(1,2),hex("100120012802")),"secondary role encoding");
        for(int n:new int[]{0,1,14,99,100})check(DeviceStatusProtocol.battery(new byte[]{8,(byte)n},MAC).percent==n,"battery boundaries");
        check(DeviceStatusProtocol.battery(new byte[0],MAC).percent==0,"proto3 omitted zero");
        check(DeviceStatusProtocol.battery(hex("1801"),MAC).charging,"charging true");
        check(!DeviceStatusProtocol.battery(hex("0864"),MAC).charging,"charging omitted false");
        check(DeviceStatusProtocol.battery(cat(hex("08091211"),text(MAC.toLowerCase(Locale.ROOT))),MAC).percent==9,"case insensitive target");
        check(DeviceStatusProtocol.battery(hex("0864a00109"),MAC).percent==100,"unknown fields skipped");
        for(String bad:new String[]{"0865","18ff01","08010802","1001","0a0100","00","0880808080808080808080","128001","08ffffffffffffffffff01","0701"})reject(()->DeviceStatusProtocol.battery(hex(bad),MAC),"invalid battery "+bad);
        reject(()->DeviceStatusProtocol.battery(cat(hex("08091211"),text("11:22:33:44:55:66")),MAC),"another device");
        reject(()->DeviceStatusProtocol.battery(cat(hex("1202"),hex("c328")),MAC),"invalid UTF-8");
        reject(()->DeviceStatusProtocol.battery(new byte[513],MAC),"body bound");
        for(int n:new int[]{1,2,3,5,6,7})check("全智能模式".equals(DeviceStatusProtocol.mode(new byte[]{8,(byte)n}).display()),"official high/mix bitmask");
        check("长续航模式".equals(DeviceStatusProtocol.mode(hex("0804")).display()),"official RX bitmask");
        for(int n:new int[]{0,8,9,127})check(DeviceStatusProtocol.mode(new byte[]{8,(byte)n}).display()==null,"unknown mode remains unknown");
        reject(()->DeviceStatusProtocol.mode(hex("08040801")),"duplicate mode");
        reject(()->DeviceStatusProtocol.mode(hex("0a0101")),"mode wrong wire");
    }
    static final class Fixture implements OafDeviceChannel.Events{
        long now=1000;int changes;final ByteArrayOutputStream output=new ByteArrayOutputStream();
        final OafDeviceChannel channel=new OafDeviceChannel(new OafWire(new ByteArrayInputStream(new byte[0]),output),this,MAC,1);
        public void status(String s){}public void changed(){changes++;}public long now(){return now;}
        void control(byte[] b)throws Exception{int end=5;while(b[end]!=';')end++;channel.control(b,end,70,70);}
        byte[] response(int agent,int status,int sid){return cat(new byte[]{2},OafWire.be16(OafDeviceChannel.LOCAL_AGENT),OafWire.be16(agent),text(OafDeviceChannel.PROFILE+";"),new byte[]{(byte)status},OafWire.be16(1),OafWire.be16(sid));}
        void connect()throws Exception{channel.peer(8,OafDeviceChannel.PROFILE,70,70);channel.start(70,70);control(response(8,0,32));}
    }
    static void channel()throws Exception{
        Fixture f=new Fixture();f.channel.refresh(true);check(f.output.size()==0,"no query before optional service ready");
        f.channel.peer(8,"wear:notification",70,70);f.channel.start(70,70);check(frames(f.output.toByteArray()).size()==1,"only discovery without device peer");
        f.channel.peer(8,OafDeviceChannel.PROFILE,70,70);f.control(f.response(9,0,32));check(!f.channel.matches(32),"wrong peer ignored");
        f.control(f.response(8,0,33));check(!f.channel.matches(33),"wrong negotiated session rejected");
        Fixture live=new Fixture();live.connect();check(live.channel.matches(32),"optional session established");
        live.output.reset();live.channel.refresh(false);List<byte[]> requests=frames(live.output.toByteArray());
        check(requests.size()==2,"two read-only requests");check(requests.get(0)[3]==8 && requests.get(1)[3]==35,"only battery and mode CIDs");
        check(OafWire.u16(requests.get(0),0)==128,"device payload uses its own session");
        check(Arrays.equals(Arrays.copyOfRange(requests.get(1),4,requests.get(1).length),hex("100120012801")),"query has no work mode field");
        live.channel.receive(hex("0008083b1801"));live.channel.receive(hex("0023080410011801"));
        check(live.channel.snapshot().batteryPercent==59 && Boolean.TRUE.equals(live.channel.snapshot().charging),"live battery callback");
        check("长续航模式".equals(live.channel.snapshot().mode),"live mode callback");
        live.channel.receive(hex("0023080110091802"));check("长续航模式".equals(live.channel.snapshot().mode),"stale request sequence rejected");
        live.channel.receive(hex("0023080110021801"));check("长续航模式".equals(live.channel.snapshot().mode),"future request sequence rejected");
        live.channel.receive(hex("002308011802"));check("全智能模式".equals(live.channel.snapshot().mode),"unsolicited mode update");
        live.channel.receive(hex("002308041801"));check("全智能模式".equals(live.channel.snapshot().mode),"old replay sequence ignored");
        live.channel.receive(hex("01080801"));check(live.channel.snapshot().batteryPercent==59,"SDK non-data flag ignored");
        live.channel.receive(hex("00080865"));check(live.channel.snapshot().batteryPercent==59,"malformed reply does not replace last valid value");
        live.channel.receive(cat(hex("000808021211"),text("11:22:33:44:55:66")));check(live.channel.snapshot().batteryPercent==59,"cross-device reply rejected");
        live.output.reset();live.now+=100;live.channel.refresh(true);check(live.output.size()==0,"foreground rate limit");
        live.now+=30000;live.channel.refresh(true);check(frames(live.output.toByteArray()).size()==2,"foreground stale read refresh");
        live.output.reset();live.now+=30000;live.channel.refresh(false);check(live.output.size()==0,"background rate limit independent of foreground request");
        live.now+=DeviceTelemetry.MAX_AGE;check(live.channel.snapshot().batteryPercent==null && live.channel.snapshot().mode==null,"stale values hidden");
        live.channel.close();live.channel.receive(hex("0008083b"));live.channel.refresh(true);check(!live.channel.matches(32) && live.channel.snapshot().batteryPercent==null && live.output.size()==0,"closed channel cannot publish or send");
        Fixture rejected=new Fixture();rejected.channel.peer(8,OafDeviceChannel.PROFILE,70,70);rejected.channel.start(70,70);rejected.control(rejected.response(8,1,32));check(!rejected.channel.matches(32),"peer rejection leaves status unknown");
    }
    static void integration()throws Exception{
        ByteArrayOutputStream incoming=new ByteArrayOutputStream(),out=new ByteArrayOutputStream();OafWire remote=new OafWire(new ByteArrayInputStream(new byte[0]),incoming);
        remote.send(2,cat(hex("01020000000001"),text("wear:notification;")));
        remote.send(1,cat(new byte[]{1},OafWire.be16(32101),OafWire.be16(4),text("wear:notification;"),hex("000100460001040200")));
        remote.send(1,cat(new byte[]{1},OafWire.be16(32102),OafWire.be16(8),text(OafDeviceChannel.PROFILE+";"),hex("000100480001040200")));
        remote.send(72,hex("00080836"));remote.send(72,hex("00230804"));
        OafWire wire=new OafWire(new ByteArrayInputStream(incoming.toByteArray()),out);Fixture clock=new Fixture();OafDeviceChannel device=new OafDeviceChannel(wire,clock,MAC,1);
        OafSession session=new OafSession(wire,new OafSession.Events(){public void status(String s){}public void ready(){}},device);
        session.readAndHandle();check(new String(out.toByteArray(),StandardCharsets.UTF_8).contains(OafDeviceChannel.PROFILE),"optional service advertised");
        session.readAndHandle();check(session.isReady(),"notifications ready without optional peer");session.send(RelayPayloadEncoder.encodeNotificationSwitches(1,"test"));
        session.startDeviceStatus();session.readAndHandle();device.refresh(false);session.readAndHandle();session.readAndHandle();
        check(device.snapshot().batteryPercent==54 && "长续航模式".equals(device.snapshot().mode),"optional frames dispatched to device parser");
        check(session.isReady(),"status updates preserve notifications");
        byte[] close=cat(new byte[]{3},OafWire.be16(32102),OafWire.be16(8),text(OafDeviceChannel.PROFILE+";"));int end=5;while(close[end]!=';')end++;device.control(close,end,70,70);
        check(device.snapshot().batteryPercent==null && session.isReady(),"optional close never closes notification service");
    }
    static void state()throws Exception{
        DeviceIdentity correct=new DeviceIdentity("OWW251","E6E8FA21","星河国内蓝色","OPPO Watch X2");check(correct.blueWatchX2(),"model/SKU mapped official asset");
        check(!new DeviceIdentity("OWW251","OTHER","其他颜色","Watch").blueWatchX2(),"other SKU never shows known blue asset");
        check(!new DeviceIdentity("OWW242","E6E8FA21","蓝色","Watch").blueWatchX2(),"other model never shows known blue asset");
        DeviceTelemetry t=DeviceTelemetry.EMPTY.battery(DeviceStatusProtocol.battery(hex("0800"),MAC),100).mode(DeviceStatusProtocol.mode(hex("0804")),100);
        DeviceUiState ready=DeviceUiState.create(true,true,true,3,HandoverPolicy.Presence.OFFLINE,true,true,true,1,true).withDevice(correct,t);
        check(ready.metrics().contains("0%") && ready.metrics().contains("长续航模式"),"zero battery displayed as real reading");
        for(int channel:new int[]{0,1,2,4})check(DeviceUiState.create(true,true,true,channel,HandoverPolicy.Presence.OFFLINE,true,true,true,1,true).withDevice(correct,t).batteryPercent==null,"non-ready masks old telemetry");
        check(DeviceUiState.create(true,true,true,3,HandoverPolicy.Presence.ONLINE,true,true,true,1,true).withDevice(correct,t).operatingMode==null,"official takeover masks old mode");
        check(DeviceUiState.create(false,true,true,3,HandoverPolicy.Presence.OFFLINE,true,true,true,1,true).withDevice(correct,t).identity==null,"unconfigured hides old appearance");
        check(t.fresh(99).batteryPercent==null,"clock rollback invalidates telemetry");
    }
    static void queue()throws Exception{
        ConnectionQueue<String> q=new ConnectionQueue<>(1);ConnectionQueue.Session s=q.open();q.offer("notification");q.wake(s);
        check(q.size()==1 && "notification".equals(q.poll(s,100)),"control wake preserves full notification queue");
        ExecutorService worker=Executors.newSingleThreadExecutor();CountDownLatch started=new CountDownLatch(1);
        try{Future<String> result=worker.submit(()->{started.countDown();return q.poll(s,10000);});started.await();q.wake(s);check(result.get(1,TimeUnit.SECONDS)==null,"explicit control wake releases idle worker");
            q.close(s);q.offer("later");check(q.poll(s,100)==null && q.closed(s),"closed connection cannot consume later notifications");
            ConnectionQueue.Session next=q.open();check("later".equals(q.poll(next,100)),"new connection consumes its queue");
        }finally{worker.shutdownNow();}
    }
    public static void main(String[] args)throws Exception{protocol();channel();integration();state();queue();System.out.println("Device status checks passed: "+checks);}
}
