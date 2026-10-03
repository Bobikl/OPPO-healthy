package com.example.opponotificationrelay;

import java.io.IOException;
import java.time.LocalDate;

/** Official 6.6.7 merges cumulative daily values by maximum, never by addition. */
public final class ActivityBridgePolicy {
    private ActivityBridgePolicy(){}
    public static void valid(int date,long[] values)throws IOException {
        try {LocalDate d=LocalDate.of(date/10000,(date/100)%100,date%100);if(d.isAfter(LocalDate.now())||d.getYear()<2015)throw new IOException("ACTIVITY_DATE");}
        catch(java.time.DateTimeException e){throw new IOException("ACTIVITY_DATE");}
        if(values.length!=8)throw new IOException("ACTIVITY_VALUES");
        long[] max={200000,20000000,1440,1440,200000,20000000,1440,1440};
        for(int i=0;i<8;i++)if(values[i]<0||values[i]>max[i])throw new IOException("ACTIVITY_RANGE");
    }
    public static long[] merge(long[] old,long[] incoming) {
        long[] result=old.clone();for(int i=0;i<4;i++)result[i]=Math.max(old[i],incoming[i]);
        // Preserve known historical targets; only fill an absent target from the watch.
        for(int i=4;i<8;i++)if(result[i]<=0&&incoming[i]>0)result[i]=incoming[i];return result;
    }
    public static int[] completed(long[] values){int[] out=new int[5];out[4]=1;for(int i=0;i<4;i++){out[i]=values[i+4]>0&&values[i]>=values[i+4]?1:0;out[4]&=out[i];}return out;}
}
