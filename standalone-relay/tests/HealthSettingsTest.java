package com.example.opponotificationrelay;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public final class HealthSettingsTest {
    static int checks;
    static void check(boolean ok,String why){checks++;if(!ok)throw new AssertionError(why);}
    interface Call{void run()throws Exception;}
    static void reject(Call c)throws Exception{try{c.run();throw new AssertionError("accepted malformed data");}catch(IOException expected){checks++;}}
    static byte[] hex(String s){byte[] b=new byte[s.length()/2];for(int i=0;i<b.length;i++)b[i]=(byte)Integer.parseInt(s.substring(i*2,i*2+2),16);return b;}
    static byte[] fixture() {return HealthProto.empty().withMessage(1,HealthProto.numbers(1,8000,2,100))
        .withMessage(10,HealthProto.numbers(1,1,2,2,3,100)).withMessage(11,HealthProto.numbers(1,1,2,120,3,45,4,100))
        .withMessage(14,HealthProto.empty().withMessage(1,HealthProto.numbers(1,1)).withMessage(2,HealthProto.numbers(1,0)))
        .withMessage(16,HealthProto.numbers(1,1,2,90)).withMessage(19,HealthProto.numbers(1,0)).encode();}
    static byte[] control(int command,int peer,byte[] tail){return OafCrypto.concat(new byte[]{(byte)command},OafWire.be16(OafHealthChannel.LOCAL_AGENT),OafWire.be16(peer),(OafHealthChannel.PROFILE+";").getBytes(StandardCharsets.UTF_8),tail);}
    static int end(){return 5+OafHealthChannel.PROFILE.length();}
    public static void main(String[] args)throws Exception{
        Map<HealthSetting,Integer> v=HealthSettingsProtocol.read(fixture());
        check(v.get(HealthSetting.STEP)==8000,"step goal decoded");check(v.get(HealthSetting.QUIET_LOW)==45,"quiet threshold decoded");check(v.get(HealthSetting.MIND_NOTICE)==0,"nested off preserved");check(v.get(HealthSetting.REM)==0,"explicit present zero");check(!v.containsKey(HealthSetting.CALORIE),"absent is unknown");
        check(Arrays.equals(HealthSettingsProtocol.change(v,HealthSetting.QUIET_HIGH,130),hex("088201102d180a2001")),"quiet write field order independent, untouched low/duration/switch");
        check(Arrays.equals(HealthSettingsProtocol.change(v,HealthSetting.HEART_AUTO,0),hex("08001002")),"heart toggle preserves interval");
        for(int type:new int[]{3,4}){Map<HealthSetting,Integer> m=new EnumMap<>(v);m.put(HealthSetting.HEART_TYPE,type);check(HealthProto.parse(HealthSettingsProtocol.change(m,HealthSetting.HEART_AUTO,0)).number(2,-1)==type,"Watch X2 heart mode preserved");}
        check(Arrays.equals(HealthSettingsProtocol.query(),hex("0800")),"read-all request is zero");
        check(HealthSettingsProtocol.acknowledgement(hex("08a08d06"))==100000,"official success code");
        for(HealthSetting k:HealthSetting.values()){check(k.valid(k.min),"minimum "+k);check(k.valid(k.max),"maximum "+k);check(!k.valid(k.min-1),"below minimum "+k);check(!k.valid(k.max+1),"above maximum "+k);}
        reject(()->HealthSettingsProtocol.change(v,HealthSetting.OXYGEN_LOW,88));reject(()->HealthSettingsProtocol.change(v,HealthSetting.CALORIE,300));
        for(String bad:new String[]{"00","0f","0a7f","0880808080808080808080","08010802","0a0208"})reject(()->HealthProto.parse(hex(bad)).number(1,0));
        reject(()->HealthProto.parse(new byte[32769]));reject(()->HealthSettingsProtocol.read(new byte[0]));
        HealthProto.Node unknown=HealthProto.parse(hex("0801920303010203"));check(Arrays.equals(unknown.withNumber(1,2).encode(),hex("9203030102030802")),"unknown fields preserved");
        ByteArrayOutputStream output=new ByteArrayOutputStream();final long[] now={100};OafHealthChannel channel=new OafHealthChannel(new OafWire(new ByteArrayInputStream(new byte[0]),output),new OafHealthChannel.Events(){public long now(){return now[0];}public void changed(){}public void status(String s){}});
        channel.start(40,41,42);check(output.size()==0,"no page means no health query");channel.refresh();channel.peer(17,OafHealthChannel.PROFILE,40,41,42);channel.start(40,41,42);int sid=channel.reserved();check(sid==43,"avoids all reserved sessions");
        channel.control(control(2,17,OafCrypto.concat(new byte[]{0},OafWire.be16(1),OafWire.be16(sid))),end(),40,41,42);channel.pump();
        channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},fixture()));OafHealthChannel.Snapshot first=channel.snapshot();check(first.writable(now[0]),"only fresh device read writable");
        check(!channel.change(HealthSetting.STEP,9000,first.revision-1),"stale dialog rejected");check(channel.change(HealthSetting.STEP,9000,first.revision),"valid write queued");check(!channel.change(HealthSetting.STEP,10000,first.revision),"second write rejected");channel.pump();
        channel.control(control(1,17,OafCrypto.concat(OafWire.be16(1),OafWire.be16(99),OafWire.be16(1),new byte[]{4,2,0})),end(),40,41,42);check(channel.reserved()==sid,"unsolicited connection cannot replace pending write");
        channel.receive(OafCrypto.concat(new byte[]{0,(byte)173},hex("08a08d06")));check(channel.snapshot().busy,"wrong command ack ignored");
        channel.receive(OafCrypto.concat(new byte[]{0,(byte)172},hex("08a08d06")));check(channel.snapshot().values.get(HealthSetting.STEP)==8000,"ack does not commit guessed value");channel.pump();
        byte[] confirmed=HealthProto.parse(fixture()).withMessage(1,HealthProto.numbers(1,9000)).encode();channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},confirmed));check(channel.snapshot().values.get(HealthSetting.STEP)==9000 && !channel.snapshot().busy,"read-after-write confirms result");
        now[0]+=61000;check(!channel.change(HealthSetting.STEP,10000,channel.snapshot().revision),"old reading not writable");channel.refresh();channel.pump();now[0]+=16000;channel.pump();check(channel.snapshot().values.isEmpty(),"timeout invalidates values");channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},fixture()));check(channel.snapshot().values.isEmpty(),"late response ignored after timeout");
        channel.close();check(!channel.change(HealthSetting.STEP,10000,channel.snapshot().revision),"closed generation cannot replay write");
        System.out.println("Health settings checks passed: "+checks);
    }
}