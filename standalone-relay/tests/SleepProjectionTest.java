package com.example.opponotificationrelay;
import java.time.*;import java.util.*;import java.io.*;
public final class SleepProjectionTest {
 static int checks;static void check(boolean b,String text){checks++;if(!b)throw new AssertionError(text);}
 public static void main(String[] args)throws Exception{
  LocalDate date=LocalDate.of(2026,10,2);long t=HealthMetricsData.time(date)-3600000;TreeMap<Long,Integer> raw=new TreeMap<>();
  raw.put(t,0);raw.put(t+60000,1);raw.put(t+120000,1);raw.put(t+180000,2);raw.put(t+240000,4);raw.put(t+300000,3);raw.put(t+360000,0);
  HealthMetricsData d=new HealthMetricsData();WatchSleepProjection.apply(d,raw);HealthMetricsData.Day night=d.find(date);
  check(night!=null,"overnight belongs to following sleep day");check(night.sleepMinutes==4,"duration excludes awake");check(night.light==2&&night.deep==1&&night.rem==1&&night.awake==1,"four stages");check(night.wakes==1,"awake episodes");check(night.sleepIn==t+60000&&night.sleepOut==t+360000,"trim outside wake states");check(d.sleep(date).size()==4,"merge consecutive identical states");
  List<HealthMetricsData.SleepSegment> original=d.sleep(date);raw.put(t+420000,2);WatchSleepProjection.apply(d,raw);check(d.sleep(date)==original,"assembled official intervals preserved");
  check(WatchSleepProjection.rawStage(16)==0&&WatchSleepProjection.rawStage(32)==0,"flagged wake minutes");check(WatchSleepProjection.rawStage(0)==-1&&WatchSleepProjection.rawStage(7)==-1,"unknown and outside sleep excluded");
  HealthMetricsData gap=new HealthMetricsData();TreeMap<Long,Integer> split=new TreeMap<>();split.put(t,1);split.put(t+600000,1);WatchSleepProjection.apply(gap,split);check(gap.sleep(date).size()==2&&gap.sleep(date).get(0).last,"missing minutes stay gaps");check(gap.find(date).sleepMinutes==2,"gaps are not sleep duration");
  HealthMetricsData empty=new HealthMetricsData();TreeMap<Long,Integer> awake=new TreeMap<>();awake.put(t,4);WatchSleepProjection.apply(empty,awake);check(empty.days.isEmpty(),"awake-only data is not a sleep session");
  int start=(int)(HealthMetricsData.time(date)/1000);HealthSyncProtocol.Request request=HealthSyncProtocol.range(HealthSyncProtocol.Kind.SLEEP_STAGE,start,start+7200);HealthProto.Node body=HealthProto.numbers(1,0,2,start,3,start+7200).withMessages(4,Arrays.asList(HealthProto.numbers(1,5,2,17),HealthProto.numbers(1,6,2,2)));HealthSyncProtocol.Summary parsed=HealthSyncProtocol.parse(request,body.encode());check(parsed.count==2&&parsed.latest==start+360&&parsed.lastValue==2,"V2 minute offsets and values");
  try{HealthSyncProtocol.parse(request,body.withMessages(4,Arrays.asList(HealthProto.numbers(1,0,2,256))).encode());throw new AssertionError("invalid state accepted");}catch(IOException expected){checks++;}
  try{HealthSyncProtocol.parse(request,body.withMessages(4,Arrays.asList(HealthProto.numbers(1,1000,2,2))).encode());throw new AssertionError("invalid offset accepted");}catch(IOException expected){checks++;}
  System.out.println(checks+" sleep projection checks passed");
 }
}
