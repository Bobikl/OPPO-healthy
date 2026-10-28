package com.example.opponotificationrelay;
import java.io.IOException;
/** Pinned 6.6.7 SunlightStat: absolute day timestamp, durations already in minutes. */
final class WatchSunshineProjection {
    static boolean valid(HealthProto.Node row)throws IOException {
        int minutes=row.number(2,0),target=row.number(3,0);
        if(minutes>1440||target>1440)throw new IOException("SYNC_SUNSHINE_VALUE");
        // Official SunlightStatDataFetcher accepts positive totals or an explicit valid zero.
        return minutes>0||row.number(5,0)==1;
    }
    static void apply(HealthMetricsData out,long stamp,HealthProto.Node row)throws IOException {
        if(stamp>=out.window.to||!valid(row))return;
        HealthMetricsData.Day day=out.day(HealthMetricsData.date(stamp));int minutes=row.number(2,0);
        // A partial watch snapshot must not reduce an already imported cumulative daily total.
        if(minutes>=day.sunshineMinutes){day.sunshineMinutes=minutes;day.sunshineTarget=row.number(3,0);}
    }
}
