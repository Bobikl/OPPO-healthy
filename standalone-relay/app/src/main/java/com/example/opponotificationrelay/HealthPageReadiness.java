package com.example.opponotificationrelay;
import java.time.*;

/** Metric capabilities decide completeness; local readiness and stale-request guards stay shared. */
final class HealthPageReadiness {
    enum Content { SUMMARY, OXYGEN_DAY }
    static boolean complete(HealthMetricsData value,Content content,LocalDate date){
        if(value==null||value.window==null||!date.equals(value.window.anchor)||!value.window.zone.equals(ZoneId.systemDefault()))return false;
        return content==Content.SUMMARY?value.summaryComplete:OxygenChartData.completeDay(value,date);
    }
}
