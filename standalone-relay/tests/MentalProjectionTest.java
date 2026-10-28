package com.example.opponotificationrelay;
import java.time.*;
public final class MentalProjectionTest {
    static int checks;static void check(boolean valid,String message){checks++;if(!valid)throw new AssertionError(message);}
    public static void main(String[] args)throws Exception {
        LocalDate date=LocalDate.of(2026,10,7);long start=HealthMetricsData.time(date);
        HealthMetricsData data=new HealthMetricsData();data.window=HealthSnapshotWindow.home(date);
        HealthProto.Node raw=HealthProto.numbers(1,30,2,2,3,650,4,42,5,2);
        HealthMetricsData.Mental point=WatchMentalProjection.raw(start+1800000,raw);
        check(point.value==42&&point.state==2&&point.type==2&&point.hrv==650,"verified raw fields");
        WatchMentalProjection.point(data,point);WatchMentalProjection.point(data,point);
        check(data.mental.size()==1,"same timestamp stored once");
        HealthMetricsData.Day day=data.find(date);check(day.mentalLatest==42&&day.mentalLatestState==2&&day.mentalTime==point.time,"latest card values");
        check(day.mentalAverage==0&&day.mentalState==0,"raw points never fabricate daily averages");
        WatchMentalProjection.point(data,WatchMentalProjection.raw(start+60000,raw.withNumber(4,70)));
        check(day.mentalLatest==42&&day.mentalMin.value==42&&day.mentalMax.value==70,"older point changes extrema only");
        WatchMentalProjection.point(data,WatchMentalProjection.raw(start+3600000,raw.withNumber(4,30).withNumber(5,1)));
        check(day.mentalLatest==30&&day.mentalLatestState==1&&day.mentalMin.value==30,"new point updates latest and minimum");
        HealthProto.Node index=HealthProto.numbers(1,(int)(start/1000),2,720,3,46,4,2);
        WatchMentalProjection.index(data,start,index);
        check(day.mentalAverage==46&&day.mentalState==2&&day.mentalHrv==720,"daily field mapping differs from raw");
        day.mentalBaseLow=300;WatchMentalProjection.index(data,start,index.withNumber(3,50));
        check(day.mentalAverage==46&&day.mentalBaseLow==300,"richer official summary preserved");
        check(WatchMentalProjection.raw(start,raw.withNumber(4,0))==null,"empty samples ignored");
        check(WatchMentalProjection.raw(start,raw.withNumber(4,101))==null,"out-of-range values ignored");
        check(WatchMentalProjection.raw(start,raw.withNumber(5,5))==null,"unknown states ignored");
        LocalDate old=date.minusDays(10);WatchMentalProjection.point(data,WatchMentalProjection.raw(HealthMetricsData.time(old)+60000,raw));
        check(data.find(old).mentalLatest==42&&data.mental.size()==3,"historical summary retained without dense history");
        WatchMentalProjection.point(data,WatchMentalProjection.raw(data.window.to,raw));WatchMentalProjection.index(data,data.window.from-1,index);
        check(data.find(date.plusDays(1))==null&&data.find(data.window.start.minusDays(1))==null,"exclusive window boundaries");
        HealthMetricsData invalid=new HealthMetricsData();invalid.window=data.window;WatchMentalProjection.index(invalid,start,index.withNumber(4,0));
        check(invalid.days.isEmpty(),"invalid daily row remains missing");
        System.out.println(checks+" mental projection checks passed");
    }
}
