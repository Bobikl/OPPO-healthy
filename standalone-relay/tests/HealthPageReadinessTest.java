package com.example.opponotificationrelay;
import java.time.*;import java.util.*;
public final class HealthPageReadinessTest {
    static int checks;static void check(boolean value){checks++;if(!value)throw new AssertionError("READINESS_"+checks);}
    public static void main(String[] args){
        LocalDate date=LocalDate.now();HealthMetricsData data=new HealthMetricsData();data.window=new HealthSnapshotWindow(date.minusDays(14),date.plusDays(1),date);
        check(!HealthPageReadiness.complete(null,HealthPageReadiness.Content.SUMMARY,date));
        check(!HealthPageReadiness.complete(data,HealthPageReadiness.Content.SUMMARY,date));
        data.officialLoaded=true;check(!HealthPageReadiness.complete(data,HealthPageReadiness.Content.SUMMARY,date));
        data.summaryComplete=true;check(HealthPageReadiness.complete(data,HealthPageReadiness.Content.SUMMARY,date));
        check(data.days.isEmpty());check(!HealthPageReadiness.complete(data,HealthPageReadiness.Content.SUMMARY,date.minusDays(1)));
        check(!HealthPageReadiness.complete(data,HealthPageReadiness.Content.OXYGEN_DAY,date));
        TimeZone previous=TimeZone.getDefault();try{TimeZone.setDefault(TimeZone.getTimeZone(data.window.zone.equals(ZoneId.of("UTC"))?"Asia/Singapore":"UTC"));check(!HealthPageReadiness.complete(data,HealthPageReadiness.Content.SUMMARY,date));}finally{TimeZone.setDefault(previous);}
        data.summaryComplete=false;check(!HealthPageReadiness.complete(data,HealthPageReadiness.Content.SUMMARY,date));
        System.out.println("HealthPageReadinessTest: "+checks+" checks passed");
    }
}
