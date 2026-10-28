package com.example.opponotificationrelay;
import java.time.*;import java.util.*;
public final class HealthPageTransitionTest {
    static int checks;static final String DEVICE="AA:BB:CC:DD:EE:01";
    static void check(boolean b){checks++;if(!b)throw new AssertionError("CHECK_"+checks);}
    static HealthMetricsData snapshot(LocalDate day){HealthMetricsData d=new HealthMetricsData();d.device=DEVICE;d.window=new HealthSnapshotWindow(day.minusDays(1),day.plusDays(1),day);return d;}
    public static void main(String[] args){
        LocalDate today=LocalDate.now(),day=today.minusDays(3);HealthMetricsData previous=snapshot(day),next=snapshot(day.plusDays(1));HealthPageTransition t=new HealthPageTransition();
        check(!t.update(previous,null,day,DEVICE,true));
        t.select(new HealthMetricsData.Period(day,0));
        check(t.update(previous,null,day,DEVICE,true)&&!t.keepScroll());check(!t.update(previous,previous,day,DEVICE,true));
        t.select(new HealthMetricsData.Period(day.plusDays(1),0));check(!t.update(null,previous,day.plusDays(1),DEVICE,true));check(!t.update(previous,previous,day.plusDays(1),DEVICE,true));
        check(!t.update(next,previous,day.plusDays(1),DEVICE,false));check(t.update(next,previous,day.plusDays(1),DEVICE,true)&&!t.keepScroll());check(!t.update(null,next,day.plusDays(1),DEVICE,true));
        t.select(new HealthMetricsData.Period(day,0));check(!t.update(next,next,day,DEVICE,true));check(t.update(previous,next,day,DEVICE,true)&&!t.keepScroll());
        t.select(new HealthMetricsData.Period(day.plusDays(1),0));t.select(new HealthMetricsData.Period(day,0));check(!t.update(next,previous,day,DEVICE,true));check(t.update(previous,previous,day,DEVICE,true)&&!t.keepScroll());
        HealthMetricsData empty=snapshot(day.plusDays(1));t.select(new HealthMetricsData.Period(day.plusDays(1),0));check(t.update(empty,previous,day.plusDays(1),DEVICE,true));check(empty.days.isEmpty());
        HealthMetricsData updated=snapshot(day.plusDays(1));check(t.update(updated,empty,day.plusDays(1),DEVICE,true)&&t.keepScroll());
        check(t.update(null,updated,day.plusDays(1),"AA:BB:CC:DD:EE:02",true));check(!t.update(updated,null,day.plusDays(1),"AA:BB:CC:DD:EE:02",true));
        TimeZone original=TimeZone.getDefault();try{TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.systemDefault().equals(ZoneId.of("Pacific/Honolulu"))?"UTC":"Pacific/Honolulu"));check(t.update(null,updated,day.plusDays(1),DEVICE,true));check(!t.update(updated,null,day.plusDays(1),DEVICE,true));}finally{TimeZone.setDefault(original);}
        HealthMetricsData.Period month=new HealthMetricsData.Period(today,2);t.select(month);HealthMetricsData shortWindow=snapshot(today);check(!t.update(shortWindow,null,today,DEVICE,true));
        HealthMetricsData full=snapshot(today);full.window=new HealthSnapshotWindow(month.start,today.plusDays(1),today);check(t.update(full,null,today,DEVICE,true)&&!t.keepScroll());
        t.select(new HealthMetricsData.Period(day,0));HealthMetricsData missingWindow=new HealthMetricsData();missingWindow.device=DEVICE;check(!t.update(missingWindow,previous,day,DEVICE,true));check(t.update(null,missingWindow,day,DEVICE,true));
        HealthMetricsData first=snapshot(LocalDate.of(2019,1,1));first.window=new HealthSnapshotWindow(LocalDate.of(2019,1,1),LocalDate.of(2019,1,3),LocalDate.of(2019,1,1));t.select(new HealthMetricsData.Period(LocalDate.of(2019,1,1),1));check(!t.update(first,null,LocalDate.of(2019,1,1),DEVICE,true));
        for(int mode=0;mode<4;mode++){
            HealthPageTransition entry=new HealthPageTransition();
            check(!entry.update(shortWindow,null,today,DEVICE,true));
            HealthMetricsData.Period required=new HealthMetricsData.Period(today,mode);entry.select(required);
            check(!entry.update(shortWindow,null,today,DEVICE,false));
            HealthMetricsData covered=snapshot(today);covered.window=new HealthSnapshotWindow(required.start,today.plusDays(1),today);
            check(entry.update(covered,null,today,DEVICE,true));
        }
        HealthPageTransition trend=new HealthPageTransition();trend.select(day.minusDays(62),day);
        check(!trend.update(snapshot(day),null,day,DEVICE,true));
        HealthMetricsData completeTrend=snapshot(day);completeTrend.window=new HealthSnapshotWindow(day.minusDays(62),day.plusDays(1),day);
        check(!trend.update(completeTrend,null,day,DEVICE,false));
        check(trend.update(completeTrend,null,day,DEVICE,true));
        System.out.println("HealthPageTransitionTest: "+checks+" checks passed");
    }
}
