package com.example.opponotificationrelay;
import java.time.*;import java.util.*;
public final class HealthReadWindowTest {
 static int checks;static void check(boolean b){checks++;if(!b)throw new AssertionError("window check "+checks);}
 public static void main(String[] args){
  for(int year:new int[]{2023,2024}){LocalDate from=LocalDate.of(year,1,1),end=from.plusYears(1);List<HealthReadWindow> pages=new HealthReadWindow(from,end).pages();LocalDate cursor=end;
   for(HealthReadWindow p:pages){check(p.end.equals(cursor));check(java.time.temporal.ChronoUnit.DAYS.between(p.start,p.end)<=31);cursor=p.start;}check(cursor.equals(from));}
  HealthReadWindow one=new HealthReadWindow(LocalDate.of(2024,2,29),LocalDate.of(2024,3,1));check(one.midpoint()==null);
  check(HealthReadWindow.capacity("HEALTH_OUTPUT_LIMIT"));check(!HealthReadWindow.capacity("BUSY"));check(!HealthReadWindow.capacity(null));
  check(HealthReadWindow.covered(10,40,new ArrayList<>(Arrays.asList(new long[]{30,50},new long[]{0,20},new long[]{20,35}))));
  check(!HealthReadWindow.covered(10,40,new ArrayList<>(Arrays.asList(new long[]{0,20},new long[]{21,50}))));
  check(!HealthReadWindow.covered(10,40,new ArrayList<>()));
  System.out.println("HealthReadWindowTest: "+checks+" checks passed");
 }
}
