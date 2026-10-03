package com.example.opponotificationrelay;
import java.io.*;
import java.util.*;
public final class SleepSettingsTest {
    static int checks;static void check(boolean b,String why){checks++;if(!b)throw new AssertionError(why);}
    interface Task{void run()throws Exception;}
    static void reject(Task t)throws Exception{try{t.run();throw new AssertionError("invalid sleep request accepted");}catch(IOException|IllegalArgumentException expected){checks++;}}
    public static void main(String[] args)throws Exception{
        for(int m=0;m<1440;m++)check(SleepSettingsProtocol.minutes(SleepSettingsProtocol.pack(m))==m,"packed time round trip");
        check(SleepSettingsProtocol.pack(23*60+1)==5889,"official 23:01");check(SleepSettingsProtocol.pack(7*60+29)==1821,"official 07:29");
        reject(()->SleepSettingsProtocol.pack(1440));reject(()->SleepSettingsProtocol.minutes(0x073c));reject(()->SleepSettingsProtocol.goal(SleepSettingsProtocol.pack(29)));reject(()->SleepSettingsProtocol.goal(SleepSettingsProtocol.pack(1321)));reject(()->SleepSettingsProtocol.bed(1,SleepSettingsProtocol.pack(181)));
        check(HealthProto.parse(SleepSettingsProtocol.syncMode(1,0,123).bytes()).number(2,-1)==1,"mode sync retains the phone-owned accord setting");
        check(SleepSettingsProtocol.goal(2078).cid==210,"sleep goal command");
        HealthProto.Node bed=HealthProto.parse(SleepSettingsProtocol.bed(1,15).bytes());check(bed.number(1,-1)==15 && bed.number(2,-1)==1,"bed offset and switch fields");
        check(SleepSettingsProtocol.stayUp(0,0).cid==78,"official stay-up legacy command");
        byte[] original=HealthProto.numbers(1,1700000000,2,1,3,1,4,1,5,1690000000,20,77).encode();
        SleepSettingsProtocol.Request mode=SleepSettingsProtocol.modeChange(original,0,1,1800000000);HealthProto.Node changed=HealthProto.parse(mode.bytes());
        check(changed.number(2,-1)==0 && changed.number(3,-1)==1 && changed.number(4,-1)==1 && changed.number(5,-1)==1690000000 && changed.number(20,-1)==77,"mode edit preserves current sleep state, sync clock and extensions");
        byte[] ack=HealthProto.numbers(1,100000).encode();check(mode.accepts(ack),"mode ack");reject(()->SleepSettingsProtocol.syncMode(1,0,0).accepts(ack));check(!mode.accepts(HealthProto.numbers(1,1800000000,2,1).encode()),"mismatched mode response");
        SleepSettingsProtocol.Rest rest=new SleepSettingsProtocol.Rest(1700000000,5889,1821,127,0,false);
        HealthProto.Node schedule=HealthProto.parse(SleepSettingsProtocol.rest(Collections.singletonList(rest)).bytes());check(schedule.number(1,-1)==1 && schedule.messages(2).size()==7,"rest settings root");check(schedule.messages(2).get(0).number(8,-1)==1 && schedule.messages(2).get(6).number(8,-1)==64 && schedule.messages(2).get(0).number(4,-1)==2,"per-day rest form");
        check(SleepSettingsProtocol.rest(Collections.singletonList(rest)).accepts(schedule.encode()),"matching schedule response confirms save");
        check(!SleepSettingsProtocol.rest(Collections.singletonList(rest)).accepts(HealthProto.numbers(1,1).encode()),"one alone is not a schedule confirmation");
        check(!SleepSettingsProtocol.rest(Collections.singletonList(rest)).accepts(schedule.withMessages(2,Collections.singletonList(schedule.messages(2).get(0).withNumber(3,1800))).encode()),"different wake time cannot confirm save");
        reject(()->new SleepSettingsProtocol.Rest(1,0,0,1,0,false));reject(()->new SleepSettingsProtocol.Rest(1,0,1,0,0,false));reject(()->SleepSettingsProtocol.rest(Arrays.asList(rest,rest)));
        List<SleepSettingsProtocol.Rest> tooMany=new ArrayList<>();for(int i=0;i<6;i++)tooMany.add(new SleepSettingsProtocol.Rest(i+1,5889,1821,1,0,false));reject(()->SleepSettingsProtocol.rest(tooMany));
        check(HealthProto.parse(SleepSettingsProtocol.rest(Collections.singletonList(new SleepSettingsProtocol.Rest(1,5889,1821,1,0,true))).bytes()).messages(2).get(0).number(9,0)==1,"legacy holiday flag preserved");
        ByteArrayOutputStream out=new ByteArrayOutputStream();long[] now={100};int[] calls={0};boolean[] result={false};
        OafHealthChannel channel=new OafHealthChannel(new OafWire(new ByteArrayInputStream(new byte[0]),out),new OafHealthChannel.Events(){public long now(){return now[0];}public void changed(){}public void status(String s){}});
        channel.refresh();channel.peer(17,OafHealthChannel.PROFILE);channel.start();int sid=channel.reserved();channel.control(HealthSettingsTest.control(2,17,OafCrypto.concat(new byte[]{0},OafWire.be16(1),OafWire.be16(sid))),HealthSettingsTest.end());channel.pump();channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},HealthSettingsTest.fixture()));
        OafHealthChannel.SleepReply cb=(ok,body,msg)->{calls[0]++;result[0]=ok;};
        check(channel.sleep(SleepSettingsProtocol.goal(2078),cb),"queue sleep transaction");check(!channel.sleep(SleepSettingsProtocol.goal(2078),cb),"no overlapping sleep write");check(!channel.change(HealthSetting.STEP,9000,channel.snapshot().revision),"monitoring write cannot overlap sleep write");channel.pump();
        channel.receive(OafCrypto.concat(new byte[]{0,(byte)208},ack));check(calls[0]==0,"different sleep command ack ignored");channel.receive(OafCrypto.concat(new byte[]{0,(byte)210},ack));check(calls[0]==1 && result[0] && !channel.snapshot().busy,"sleep success once");
        channel.receive(OafCrypto.concat(new byte[]{0,(byte)210},ack));check(calls[0]==1,"duplicate reply ignored");
        check(!channel.sleep(SleepSettingsProtocol.music(0),cb),"old endpoint cannot carry a new write");
        channel.refresh();channel.start();int fresh=channel.reserved();check(fresh!=sid,"sleep writes use distinct response endpoints");channel.control(HealthSettingsTest.control(2,17,OafCrypto.concat(new byte[]{0},OafWire.be16(1),OafWire.be16(fresh))),HealthSettingsTest.end());channel.pump();channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},HealthSettingsTest.fixture()));
        check(channel.sleep(SleepSettingsProtocol.music(0),cb),"second sequential transaction");channel.pump();now[0]+=16000;channel.pump();check(calls[0]==2&&!result[0],"timeout completes pending transaction once");channel.receive(OafCrypto.concat(new byte[]{0,(byte)207},ack));check(calls[0]==2,"late sleep ack ignored");channel.close();check(calls[0]==2,"close cannot complete timed-out request twice");
        System.out.println("Sleep settings checks passed: "+checks);
    }
}
