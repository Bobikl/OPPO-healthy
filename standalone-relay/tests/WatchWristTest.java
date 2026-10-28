package com.example.opponotificationrelay;
import java.time.*;import java.util.*;
public final class WatchWristTest {
    static int checks;static void check(boolean value){checks++;if(!value)throw new AssertionError("WRIST_"+checks);}
    static HealthProto.Node row(int stamp,int value,int baseline){return HealthProto.numbers(1,stamp,2,value,3,95,4,baseline);}
    public static void main(String[] args)throws Exception {
        LocalDate date=LocalDate.now();int start=(int)(HealthMetricsData.time(date)/1000),end=start+7200;
        HealthSyncProtocol.Kind kind=HealthSyncProtocol.Kind.WRIST_INDEX;
        check(kind.cid==123&&kind.daily());check(HealthSyncProtocol.initialHistoryStart(kind,end)==end-63*86400);
        HealthSyncProtocol.Request request=HealthSyncProtocol.range(kind,start,end);
        HealthSyncProtocol.Summary summary=HealthSyncProtocol.parse(request,HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Arrays.asList(row(start,3542,3500))).encode());
        check(summary.count==1&&summary.latest==start&&!summary.more);
        summary=HealthSyncProtocol.parse(request,HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Arrays.asList(row(start,0,3500),row(start,3500,0))).encode());
        check(summary.count==0&&summary.latest==0);
        HealthMetricsData out=new HealthMetricsData();out.window=HealthSnapshotWindow.home(date);
        WatchWristProjection.apply(out,start*1000L,row(start,3542,3500));
        check(out.find(date).wristValue==3542&&out.find(date).wristBase==3500&&out.find(date).wristConfidence==95);
        WatchWristProjection.apply(out,start*1000L,row(start,3470,3500));check(out.find(date).wristValue-out.find(date).wristBase==-30);
        WatchWristProjection.apply(out,start*1000L,row(start,3500,3500));check(out.find(date).wristValue==out.find(date).wristBase);
        for(int[] invalid:new int[][]{{0,3500},{3500,0},{65535,3500},{3500,65535}}){
            check(!WatchWristProjection.valid(row(start,invalid[0],invalid[1])));
            WatchWristProjection.apply(out,start*1000L,row(start,invalid[0],invalid[1]));check(out.find(date).wristValue==3500);
        }
        WatchWristProjection.apply(out,out.window.to,row((int)(out.window.to/1000),3600,3500));check(out.find(date.plusDays(1))==null);
        long old=out.window.from-86400000L;WatchWristProjection.apply(out,old,row((int)(old/1000),3600,3500));check(!out.days.containsKey(HealthMetricsData.date(old)));
        HealthSyncProtocol.Kind rawKind=HealthSyncProtocol.Kind.WRIST_RAW;check(rawKind.cid==121&&!rawKind.daily());check(HealthSyncProtocol.initialHistoryStart(rawKind,end)==end-63*86400);
        HealthProto.Node raw=HealthProto.numbers(1,5,2,(3542<<3)|4|3);
        check(WatchWristProjection.rawValue(raw)==3542); // Baseline omitted, status bits do not change the temperature.
        check(WatchWristProjection.rawValue(HealthProto.numbers(2,(3542<<3)|3))==0);
        check(WatchWristProjection.rawValue(HealthProto.numbers(2,4))==0);
        check(WatchWristProjection.rawValue(HealthProto.numbers(2,65536|4))==0);
        HealthSyncProtocol.Request rawRequest=HealthSyncProtocol.range(rawKind,start,end);
        summary=HealthSyncProtocol.parse(rawRequest,HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Arrays.asList(raw,HealthProto.numbers(1,6,2,(3500<<3)))).encode());
        check(summary.count==1&&summary.latest==start+300&&summary.lastValue==3542);
        boolean rejected=false;try{HealthSyncProtocol.parse(rawRequest,HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Arrays.asList(raw.withNumber(1,1000))).encode());}catch(java.io.IOException expected){rejected=true;}check(rejected);
        WatchWristProjection.applyRaw(out,start*1000L,raw);WatchWristProjection.applyRaw(out,(start+60)*1000L,raw.withNumber(2,(3500<<3)|4));
        check(out.find(date).wristRawCount==2&&out.find(date).wristRawMin==3500&&out.find(date).wristRawMax==3542);
        check(out.wristRaw.size()==2&&out.wristRaw.get(start*1000L)==3542);
        check(out.find(date).wristBase==3500&&out.find(date).wristValue==3500); // Absolute measurements never replace the relative summary.
        WatchWristProjection.applyRaw(out,start*1000L,raw.withNumber(2,3542<<3));check(out.find(date).wristRawCount==2);
        WatchWristProjection.applyRaw(out,out.window.to,raw);check(out.find(date.plusDays(1))==null);
        WatchWristProjection.applyRaw(out,old,raw);check(!out.days.containsKey(HealthMetricsData.date(old)));
        long history=HealthMetricsData.time(date.minusDays(5));WatchWristProjection.applyRaw(out,history,raw);
        check(out.find(date.minusDays(5)).wristRawCount==1&&!out.wristRaw.containsKey(history));
        check(out.find(date.minusDays(5)).wristBase==0&&out.find(date.minusDays(5)).wristValue==0);
        System.out.println("WatchWristTest: "+checks+" checks passed");
    }
}
