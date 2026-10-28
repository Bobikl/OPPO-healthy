package com.example.opponotificationrelay;
import java.time.*;

/** Keep the rendered date intact until its replacement snapshot is ready. */
final class HealthPageTransition {
    private boolean pending,keepScroll=true;
    private LocalDate start,end;
    void select(HealthMetricsData.Period period){
        select(period.start,period.end);
    }
    void select(LocalDate first,LocalDate last){
        pending=true;start=first.isBefore(LocalDate.of(2019,1,1))?LocalDate.of(2019,1,1):first;
        end=last.isAfter(LocalDate.now())?LocalDate.now():last;
    }
    private static boolean current(HealthMetricsData data,String device){return data!=null&&data.window!=null&&data.device.equalsIgnoreCase(device)&&data.window.zone.equals(ZoneId.systemDefault());}
    boolean update(HealthMetricsData next,HealthMetricsData previous,LocalDate date,String device,boolean settled){
        if(next==null){keepScroll=true;return previous!=null&&!current(previous,device);}
        if(start==null||!current(next,device)||!next.window.anchor.equals(date))return false;
        if(pending&&(!settled||next.window.start.isAfter(start)||!next.window.end.isAfter(end)))return false;
        if(next==previous&&!pending)return false;
        keepScroll=!pending;pending=false;return true;
    }
    boolean keepScroll(){return keepScroll;}
}
