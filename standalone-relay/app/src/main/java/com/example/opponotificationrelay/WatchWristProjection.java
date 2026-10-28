package com.example.opponotificationrelay;
import java.io.IOException;
/** Pinned 6.6.7 WristTemperatureIndex: timestamp, typical value, confidence, daily baseline. */
final class WatchWristProjection {
    /** CID121 packs hundredths Celsius in bits 3..15 and usable confidence in bit 2. */
    static int rawValue(HealthProto.Node row)throws IOException {
        int packed=row.number(2,0);return packed>0&&packed<=65535&&(packed&4)!=0?(packed>>>3)&8191:0;
    }
    static void applyRaw(HealthMetricsData out,long stamp,HealthProto.Node row)throws IOException {
        if(stamp<out.window.from||stamp>=out.window.to)return;int value=rawValue(row);if(value<=0)return;
        HealthMetricsData.Day day=out.day(HealthMetricsData.date(stamp));
        day.wristRawMin=day.wristRawCount==0?value:Math.min(day.wristRawMin,value);day.wristRawMax=Math.max(day.wristRawMax,value);day.wristRawCount++;
        if(out.window.detail(stamp))out.wristRaw.put(stamp,value);
    }
    static boolean valid(HealthProto.Node row)throws IOException {
        int value=row.number(2,0),baseline=row.number(4,0);
        return value>0&&value<=10000&&baseline>0&&baseline<=10000;
    }
    static void apply(HealthMetricsData out,long stamp,HealthProto.Node row)throws IOException {
        if(stamp<out.window.from||stamp>=out.window.to||!valid(row))return;
        HealthMetricsData.Day day=out.day(HealthMetricsData.date(stamp));
        day.wristValue=row.number(2,0);day.wristConfidence=row.number(3,0);day.wristBase=row.number(4,0);
    }
}
