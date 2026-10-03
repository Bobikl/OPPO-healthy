package com.example.opponotificationrelay;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

/** Official oxygen grouping: hourly ranges, daily ranges, then monthly ranges. */
final class OxygenChartData {
    static List<HealthMetricsData.Point> ranges(HealthMetricsData data,HealthMetricsData.Period period) {
        List<HealthMetricsData.Point> result=new ArrayList<>();if(data==null)return result;
        TreeMap<Long,int[]> bins=new TreeMap<>();long start=HealthMetricsData.time(period.start);
        if(period.mode==0) {
            long end=HealthMetricsData.time(period.end.plusDays(1));
            for(Map.Entry<Long,Integer> row:data.oxygen.subMap(start,true,end,false).entrySet()) {
                int value=row.getValue();if(value<=0||value>100)continue;
                long hour=start+(row.getKey()-start)/3600000L*3600000L;
                add(bins,hour,value,value);
            }
        } else {
            for(HealthMetricsData.Day day:data.days.subMap(period.start,true,period.end,true).values()) {
                if(day.oxygenCount<=0||day.oxygenMin<=0||day.oxygenMax<day.oxygenMin||day.oxygenMax>100)continue;
                LocalDate date=period.mode==3?day.date.withDayOfMonth(1):day.date;
                add(bins,HealthMetricsData.time(date),day.oxygenMin,day.oxygenMax);
            }
        }
        for(Map.Entry<Long,int[]> row:bins.entrySet()) {
            long time=row.getKey();LocalDate date=HealthMetricsData.date(time);int[] bounds=row.getValue();
            float x=period.mode==0?(time-start)/3600000f:period.mode==3?date.getMonthValue()-1:ChronoUnit.DAYS.between(period.start,date);
            String label=period.mode==0?HealthMetricsData.timeLabel(time)+"–"+HealthMetricsData.timeLabel(time+3600000L):period.mode==3?date.getYear()+"年"+date.getMonthValue()+"月":HealthMetricsData.shortDate(date);
            result.add(new HealthMetricsData.Point(x,bounds[0],bounds[1],(bounds[0]+bounds[1])/2f,time,label));
        }
        return result;
    }
    private static void add(TreeMap<Long,int[]> bins,long time,int low,int high) {
        int[] bounds=bins.get(time);if(bounds==null)bins.put(time,new int[]{low,high});else {bounds[0]=Math.min(bounds[0],low);bounds[1]=Math.max(bounds[1],high);}
    }
    static String label(float low,float high) {int a=Math.round(low),b=Math.round(high);return a==b?Integer.toString(a):a+"–"+b;}
    static String summary(List<HealthMetricsData.Point> points) {
        if(points.isEmpty())return "—";float low=100,high=0;
        for(HealthMetricsData.Point point:points){low=Math.min(low,point.low);high=Math.max(high,point.high);}return label(low,high);
    }
}
