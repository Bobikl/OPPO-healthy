package com.example.opponotificationrelay;
import java.time.*;
import java.util.*;
public final class OxygenChartDataTest {
    private static int checks;
    private static void check(boolean value,String name){checks++;if(!value)throw new AssertionError(name);}
    private static HealthMetricsData.Day day(HealthMetricsData data,LocalDate date,int low,int high){HealthMetricsData.Day d=data.day(date);d.oxygenCount=3;d.oxygenMin=low;d.oxygenMax=high;d.oxygenMean=(low+high)/2;return d;}
    public static void main(String[] args){
        LocalDate date=LocalDate.of(2026,10,3);long start=HealthMetricsData.time(date);HealthMetricsData data=new HealthMetricsData();
        data.oxygen.put(start-1,75);data.oxygen.put(start,96);data.oxygen.put(start+3599999,99);data.oxygen.put(start+3600000,92);data.oxygen.put(start+2*3600000,0);data.oxygen.put(start+3*3600000,101);data.oxygen.put(start+23*3600000,98);data.oxygen.put(HealthMetricsData.time(date.plusDays(1)),80);
        List<HealthMetricsData.Point> points=OxygenChartData.ranges(data,new HealthMetricsData.Period(date,0));
        check(points.size()==3,"Only three measured hours; invalid/future-day data excluded");
        check(points.get(0).x==0&&points.get(0).low==96&&points.get(0).high==99,"Hourly min/max kept, no averaging");
        check(points.get(1).x==1&&points.get(1).low==92&&points.get(1).high==92,"Exact hour boundary is a new range");
        check(points.get(2).x==23,"Missing hours remain gaps");
        check(points.get(0).label.equals("00:00–01:00"),"Hour marker label");
        check(OxygenChartData.summary(points).equals("92–99"),"Header spans full range");
        day(data,date,91,100);day(data,date.plusDays(1),95,98);day(data,date.minusDays(1),89,96);day(data,date.minusMonths(1),85,94);
        HealthMetricsData.Day invalid=day(data,date.plusDays(2),0,0);invalid.oxygenCount=0;
        points=OxygenChartData.ranges(data,new HealthMetricsData.Period(date,1));
        check(points.size()==3,"Week keeps only valid days within boundaries");check(points.get(0).x==4,"Friday index on Monday-based week");
        check(OxygenChartData.summary(points).equals("89–100"),"Week range excludes previous month");
        points=OxygenChartData.ranges(data,new HealthMetricsData.Period(date,2));check(points.size()==3,"Month excludes September");check(points.get(0).x==1,"Calendar days stay in place");
        points=OxygenChartData.ranges(data,new HealthMetricsData.Period(date,3));check(points.size()==2,"Year has one range per measured month");
        check(points.get(0).x==8&&points.get(1).x==9,"Month positions stay September/October");check(points.get(1).low==89&&points.get(1).high==100,"Monthly range spans all recorded days");
        check(points.get(1).label.equals("2026年10月"),"Month marker label");
        check(OxygenChartData.ranges(data,new HealthMetricsData.Period(LocalDate.of(2023,1,1),3)).isEmpty(),"Historical empty year");
        check(OxygenChartData.ranges(null,new HealthMetricsData.Period(date,0)).isEmpty(),"Loading state stays empty");
        check(OxygenChartData.summary(Collections.emptyList()).equals("—"),"No invented values");check(OxygenChartData.label(96,96).equals("96"),"Single reading label");
        System.out.println("OxygenChartDataTest: "+checks+" checks passed");
    }
}
