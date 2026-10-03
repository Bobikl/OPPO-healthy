package com.example.opponotificationrelay;
import java.io.*;import java.util.*;
public final class HealthSyncTest {
 static int checks;static void check(boolean x,String s){checks++;if(!x)throw new AssertionError(s);}interface Task{void run()throws Exception;}
 static void reject(Task t)throws Exception{try{t.run();throw new AssertionError("accepted invalid history");}catch(IOException expected){checks++;}}
 public static void main(String[] args)throws Exception{
  int start=1790910000,end=start+7200;HealthSyncProtocol.Request r=HealthSyncProtocol.range(HealthSyncProtocol.Kind.HEART,start,end);
  reject(()->HealthSyncProtocol.range(HealthSyncProtocol.Kind.HEART,start,start));reject(()->HealthSyncProtocol.range(null,start,end));reject(()->HealthSyncProtocol.range(HealthSyncProtocol.Kind.HEART,start,start+172801));
  byte[] sample=HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Arrays.asList(HealthProto.numbers(1,10,2,70),HealthProto.numbers(1,45,2,83))).encode();
  HealthSyncProtocol.Summary summary=HealthSyncProtocol.parse(r,sample);check(summary.count==2&&summary.latest==start+45&&summary.lastValue==83&&!summary.more,"record time is offset in seconds, not request end");
  reject(()->HealthSyncProtocol.parse(r,HealthProto.numbers(1,100000).encode()));reject(()->HealthSyncProtocol.parse(r,HealthProto.numbers(1,1).encode()));
  byte[] future=HealthProto.numbers(1,0,2,start,3,end+301).encode();reject(()->HealthSyncProtocol.parse(r,future));
  check(HealthSyncProtocol.parse(r,HealthProto.numbers(1,0,2,start,3,end).encode()).count==0,"empty response is not latest measurement");
  HealthSyncProtocol.Request mind=HealthSyncProtocol.range(HealthSyncProtocol.Kind.MIND,start,end);
  check(HealthSyncProtocol.parse(mind,sample).latest==start+45*60,"mind offset is minutes");
  HealthSyncProtocol.Request daily=HealthSyncProtocol.range(HealthSyncProtocol.Kind.ACTIVITY_SUMMARY,start,end);
  HealthSyncProtocol.Summary day=HealthSyncProtocol.parse(daily,HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Collections.singletonList(HealthProto.numbers(1,start,3,1234))).encode());check(day.count==1 && day.latest==start && day.lastValue==1234 && daily.kind.daily(),"daily summary date distinct from measurement time");
  HealthSyncProtocol.Summary empty=HealthSyncProtocol.parse(r,new byte[0]);check(empty.count==0&&!empty.more&&empty.start==start&&empty.end==end&&empty.latest==0,"official empty V2 final packet advances only requested range without inventing measurements");
  check(HealthSyncProtocol.parse(r,HealthProto.numbers(1,0).encode()).count==0,"explicit success with omitted optional range");
  check(HealthSyncProtocol.parse(r,HealthProto.numbers(1,0,2,0,3,0).encode()).count==0,"default-valued empty range");
  ByteArrayOutputStream out=new ByteArrayOutputStream();long[] now={100};int[] calls={0};boolean[] ok={false};
  OafHealthChannel channel=new OafHealthChannel(new OafWire(new ByteArrayInputStream(new byte[0]),out),new OafHealthChannel.Events(){public long now(){return now[0];}public void changed(){}public void status(String s){}});
  channel.refresh();channel.peer(17,OafHealthChannel.PROFILE);channel.start();int sid=channel.reserved();channel.control(HealthSettingsTest.control(2,17,OafCrypto.concat(new byte[]{0},OafWire.be16(1),OafWire.be16(sid))),HealthSettingsTest.end());channel.pump();channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},HealthSettingsTest.fixture()));
  Map<HealthSetting,Integer> goalsBeforeHistory=new EnumMap<>(HealthSetting.class);goalsBeforeHistory.putAll(channel.snapshot().values);
  check(channel.history(r,(accepted,body,msg)->{calls[0]++;ok[0]=accepted;}),"history queued");check(!channel.sleep(SleepSettingsProtocol.goal(2078),(a,b,c)->{}),"history excludes settings write");channel.pump();channel.receive(OafCrypto.concat(new byte[]{0,10},sample));check(calls[0]==0,"wrong command ignored");channel.receive(OafCrypto.concat(new byte[]{0,12},sample));check(calls[0]==1&&ok[0],"history response once");channel.receive(OafCrypto.concat(new byte[]{0,12},sample));check(calls[0]==1,"duplicate cannot complete new transaction");check(!channel.snapshot().connected,"endpoint retired after read");check(channel.snapshot().values.isEmpty()&&!goalsBeforeHistory.isEmpty(),"archive must capture targets before history reply retires settings snapshot");channel.close();check(calls[0]==1,"close no duplicate callback");
  System.out.println("Health sync checks passed: "+checks);
 }
}
