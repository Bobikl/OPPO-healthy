package com.example.opponotificationrelay;
import java.io.IOException;
/** Verified V2 fields; daily averages and states are supplied by the watch, never inferred. */
final class WatchMentalProjection {
    static boolean valid(int value,int state){return value>=1&&value<=100&&state>=1&&state<=4;}
    static HealthMetricsData.Mental raw(long stamp,HealthProto.Node row)throws IOException {
        int value=row.number(4,0),state=row.number(5,0);
        return valid(value,state)?new HealthMetricsData.Mental(stamp,value,state,row.number(2,0),row.number(3,0)):null;
    }
    static boolean validIndex(HealthProto.Node row)throws IOException {return valid(row.number(3,0),row.number(4,0));}
    static void index(HealthMetricsData out,long stamp,HealthProto.Node row)throws IOException {
        if(stamp<out.window.from||stamp>=out.window.to||!validIndex(row))return;
        HealthMetricsData.Day day=out.day(HealthMetricsData.date(stamp));
        // Keep the richer imported summary when present, including its personalized baselines.
        if(valid(day.mentalAverage,day.mentalState))return;
        day.mentalAverage=row.number(3,0);day.mentalState=row.number(4,0);day.mentalHrv=row.number(2,0);
    }
    static void point(HealthMetricsData out,HealthMetricsData.Mental point){
        if(point==null||!valid(point.value,point.state)||point.time<out.window.from||point.time>=out.window.to)return;
        if(out.window.detail(point.time))out.mental.put(point.time,point);
        HealthMetricsData.Day day=out.day(HealthMetricsData.date(point.time));
        if(day.mentalMin==null||point.value<=day.mentalMin.value)day.mentalMin=point;
        if(day.mentalMax==null||point.value>=day.mentalMax.value)day.mentalMax=point;
        if(point.time>=day.mentalTime){day.mentalTime=point.time;day.mentalLatest=point.value;day.mentalLatestState=point.state;}
    }
}
