package com.example.opponotificationrelay;
import java.io.*;import java.time.*;import java.util.*;
public final class WatchSunshineTest {
    static int checks;static void check(boolean b){checks++;if(!b)throw new AssertionError("CHECK_"+checks);}
    static HealthProto.Node row(int stamp,int minutes,int target,int valid){return HealthProto.numbers(1,stamp,2,minutes,3,target,5,valid);}
    public static void main(String[] args)throws Exception {
        LocalDate today=LocalDate.now();int day=(int)(HealthMetricsData.time(today)/1000),end=day+7200;
        HealthSyncProtocol.Request request=HealthSyncProtocol.range(HealthSyncProtocol.Kind.SUNSHINE,day,end);
        int history=HealthSyncProtocol.initialHistoryStart(HealthSyncProtocol.Kind.SUNSHINE,end);
        check(history==end-63*86400&&history<day-13*86400);
        check(HealthSyncProtocol.initialHistoryStart(HealthSyncProtocol.Kind.HEART,end)==end-172800);
        check(HealthSyncProtocol.initialHistoryStart(HealthSyncProtocol.Kind.SLEEP,end)==end-172800);
        check(HealthSyncProtocol.initialHistoryStart(HealthSyncProtocol.Kind.SUNSHINE,1500000010)==1500000000);
        check(request.kind.cid==237&&request.kind.daily());
        HealthSyncProtocol.Summary summary=HealthSyncProtocol.parse(request,HealthProto.numbers(1,0,2,day,3,end).withMessages(4,Arrays.asList(row(day,12,20,0))).encode());
        check(summary.count==1&&summary.latest==day&&summary.lastValue==12);
        check(!WatchSunshineProjection.valid(row(day,0,20,0)));
        check(WatchSunshineProjection.valid(row(day,0,20,1)));
        check(WatchSunshineProjection.valid(row(day,3,20,0)));
        check(HealthSyncProtocol.parse(request,HealthProto.numbers(1,0,2,day,3,end).withMessages(4,Arrays.asList(row(day,0,20,0))).encode()).count==0);
        boolean rejected=false;try{WatchSunshineProjection.valid(row(day,1441,20,1));}catch(IOException e){rejected=true;}check(rejected);
        rejected=false;try{WatchSunshineProjection.valid(row(day,1,1441,1));}catch(IOException e){rejected=true;}check(rejected);
        HealthMetricsData data=new HealthMetricsData();data.window=HealthSnapshotWindow.home(today);
        WatchSunshineProjection.apply(data,day*1000L,row(day,12,20,0));check(data.find(today).sunshineMinutes==12&&data.find(today).sunshineTarget==20);
        WatchSunshineProjection.apply(data,day*1000L,row(day,0,30,0));check(data.find(today).sunshineMinutes==12);
        WatchSunshineProjection.apply(data,day*1000L,row(day,4,30,1));check(data.find(today).sunshineMinutes==12&&data.find(today).sunshineTarget==20);
        WatchSunshineProjection.apply(data,day*1000L,row(day,18,30,1));check(data.find(today).sunshineMinutes==18&&data.find(today).sunshineTarget==30);
        long yesterday=HealthMetricsData.time(today.minusDays(1));WatchSunshineProjection.apply(data,yesterday,row((int)(yesterday/1000),0,20,1));check(data.find(today.minusDays(1)).sunshineMinutes==0);
        WatchSunshineProjection.apply(data,data.window.to,row((int)(data.window.to/1000),99,20,1));check(data.find(today.plusDays(1))==null);
        long old=HealthMetricsData.time(today.minusDays(100));WatchSunshineProjection.apply(data,old,row((int)(old/1000),5,20,1));check(data.find(today.minusDays(100)).sunshineMinutes==5);
        System.out.println("WatchSunshineTest: "+checks+" checks passed");
    }
}
