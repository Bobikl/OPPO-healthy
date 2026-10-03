package com.example.opponotificationrelay;
import java.time.*;import java.util.*;
public final class HealthTimeTest {
 static int checks;static void check(boolean b,String m){checks++;if(!b)throw new AssertionError(m);}
 public static void main(String[] args){
  for(String name:new String[]{"Asia/Shanghai","Asia/Kolkata","Asia/Kathmandu","America/Los_Angeles","Australia/Lord_Howe"})for(LocalDate day:new LocalDate[]{LocalDate.of(2026,3,8),LocalDate.of(2026,4,5),LocalDate.of(2026,10,4),LocalDate.of(2026,11,1)}){
   ZoneId zone=ZoneId.of(name);long start=day.atStartOfDay(zone).toInstant().toEpochMilli(),end=day.plusDays(1).atStartOfDay(zone).toInstant().toEpochMilli();
   for(long t=start;t<end;t+=7*60000L)for(int width:new int[]{30,60}){long bucket=HealthTime.bucket(t,width,zone);check(bucket>=start&&bucket<=t&&t-bucket<width*60000L,"bucket civil boundary "+name);}
  }
  ZoneId la=ZoneId.of("America/Los_Angeles");long early=ZonedDateTime.parse("2026-11-01T01:40:00-07:00[America/Los_Angeles]").toInstant().toEpochMilli(),late=ZonedDateTime.parse("2026-11-01T01:40:00-08:00[America/Los_Angeles]").toInstant().toEpochMilli();check(HealthTime.bucket(late,60,la)-HealthTime.bucket(early,60,la)==3600000L,"overlap hours remain distinct");
  TimeZone original=TimeZone.getDefault();try{TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));LocalDate day=LocalDate.of(2026,5,1);long before=HealthMetricsData.time(day);HealthSnapshotWindow first=HealthSnapshotWindow.home(day);TimeZone.setDefault(TimeZone.getTimeZone(la));long after=HealthMetricsData.time(day);check(before!=after,"time conversion follows changed system zone");check(!first.same(HealthSnapshotWindow.home(day)),"zone change invalidates snapshot identity");check(HealthMetricsData.date(after).equals(day),"new zone roundtrip");}finally{TimeZone.setDefault(original);}
  System.out.println("HealthTimeTest: "+checks+" checks passed");
 }
}
