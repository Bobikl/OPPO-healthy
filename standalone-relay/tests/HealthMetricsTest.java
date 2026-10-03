package com.example.opponotificationrelay;
import java.time.*;import java.util.*;
public final class HealthMetricsTest {
 static int checks;static void check(boolean b,String s){checks++;if(!b)throw new AssertionError(s);}
 public static void main(String[] args){
  LocalDate today=LocalDate.of(2026,10,2);HealthMetricsData data=new HealthMetricsData();
  check(data.trends(today).isEmpty(),"empty history must not create trends");
  check(data.average(today.minusDays(6),today,4)==0,"empty average");
  HealthMetricsData.Period week=new HealthMetricsData.Period(today,1);check(week.start.equals(LocalDate.of(2026,9,28))&&week.end.equals(LocalDate.of(2026,10,4)),"Monday-based heart week crosses month");
  check(week.previous().start.equals(LocalDate.of(2026,9,21))&&week.next().equals(LocalDate.of(2026,10,5)),"week navigation");
  check(new HealthMetricsData.Period(LocalDate.of(2024,2,29),2).count()==29,"leap February");
  check(new HealthMetricsData.Period(LocalDate.of(2025,2,28),2).count()==28,"ordinary February");
  check(new HealthMetricsData.Period(LocalDate.of(2026,1,1),2).previous().start.equals(LocalDate.of(2025,12,1)),"month navigation crosses year");
  check(new HealthMetricsData.Period(today,3).previous().start.equals(LocalDate.of(2025,1,1)),"year navigation");
  for(int i=0;i<14;i++){HealthMetricsData.Day d=data.day(today.minusDays(14-i));d.steps=i<7?9000:6000;d.calories=i<7?400:200;d.range(50+i,100+i);d.rest=50+i;}
  HealthMetricsData.Trend t=new HealthMetricsData.Trend(data,today,4,false);check(t.start.equals(today.minusDays(7))&&t.end.equals(today.minusDays(1)),"activity trend excludes incomplete today");check(t.beforeStart.equals(today.minusDays(14))&&t.beforeEnd.equals(today.minusDays(8)),"previous rolling week");check(t.before==9000&&t.after==6000&&t.delta()==-3000,"weekly activity values");check(t.visible(data),"valid step trend");
  data.day(today).steps=100000;check(new HealthMetricsData.Trend(data,today,4,false).after==6000,"today cannot distort completed activity trend");
  check(new HealthMetricsData.Trend(data,today,5,false).delta()==-200,"calorie comparison");
  check(data.range(week,0)[0]==60&&data.range(week,0)[1]==113,"heart range spans only actual period records");
  for(int i=0;i<14;i++)data.day(today.minusDays(13-i)).sleepScore=i<7?77:72;
  HealthMetricsData.Trend sleep=new HealthMetricsData.Trend(data,today,6,false);check(sleep.start.equals(today.minusDays(6))&&sleep.end.equals(today),"sleep includes selected morning");check(sleep.delta()==-5&&sleep.visible(data),"official sleep threshold five");
  for(int i=0;i<5;i++)data.day(today.minusDays(i)).sleepScore=0;check(!new HealthMetricsData.Trend(data,today,6,false).visible(data),"two valid days cannot form sleep trend");
  data.day(today).sleepScore=70;check(data.average(today.minusDays(6),today,6)==71,"missing sleep values excluded; integer truncation");
  HealthMetricsData.Bin b=new HealthMetricsData.Bin(HealthMetricsData.time(today));b.add(0,b.stamp);b.add(301,b.stamp);check(b.count==0,"invalid pulse not charted");b.add(60,b.stamp);b.add(90,b.stamp+60000);check(b.min==60&&b.max==90&&b.mean()==75&&b.last==90,"candle aggregation");data.bins.put(b.stamp,b);
  check(data.heartPoints(new HealthMetricsData.Period(today,0),false).size()==1,"missing half hours remain absent");
  data.raw.put(b.stamp,61);data.raw.put(b.stamp+61000,80);check(data.heartPoints(new HealthMetricsData.Period(today,0),true).size()==2,"raw line retains measured timestamps");
  data.activityHours.put(b.stamp,new int[]{100,2000});check(data.metricPoints(new HealthMetricsData.Period(today,0),4).get(0).value==100,"day steps use real hourly projection");check(data.metricPoints(new HealthMetricsData.Period(today,0),5).get(0).value==2,"calorie units converted once");
  check(data.metricPoints(new HealthMetricsData.Period(today.plusDays(1),0),4).isEmpty(),"no invented hourly data on missing day");
  check(HealthMetricsData.rangeText(new int[]{0,0}).equals("—")&&HealthMetricsData.rangeText(new int[]{58,58}).equals("58"),"missing and single value labels");
  HealthMetricsData.Trend month=new HealthMetricsData.Trend(data,LocalDate.of(2026,10,2),4,true);check(month.start.equals(LocalDate.of(2026,9,1))&&month.end.equals(LocalDate.of(2026,9,30))&&month.beforeStart.equals(LocalDate.of(2026,8,1)),"official month boundary special case");
  HealthMetricsData.Trend rolling=new HealthMetricsData.Trend(data,LocalDate.of(2026,10,3),4,true);check(rolling.start.equals(LocalDate.of(2026,9,2))&&rolling.end.equals(LocalDate.of(2026,10,2)),"otherwise 31-day rolling windows");
  System.out.println("Health metric calendar/data checks passed: "+checks);
 }
}
