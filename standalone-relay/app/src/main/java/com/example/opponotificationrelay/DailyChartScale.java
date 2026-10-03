package com.example.opponotificationrelay;
/** Axis ceilings from official DailyActBaseCard.w and DailyActiveCard.G. */
final class DailyChartScale {
    static float maximum(int metric,float peak) {
        switch(metric) {
            case 0:return peak<=500?500:peak<1000?1000:(float)Math.ceil(peak/1000)*1000;
            case 1:return Math.max(20000,(float)Math.ceil(peak/10000)*10000);
            case 2:return Math.max(10,(float)Math.ceil(peak/10)*10);
            case 3:return (peak>0?peak:1)+.176f;
            default:throw new IllegalArgumentException("metric");
        }
    }
}
