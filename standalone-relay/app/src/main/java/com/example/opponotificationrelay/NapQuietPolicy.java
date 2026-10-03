package com.example.opponotificationrelay;

import java.time.LocalTime;
import java.util.Locale;

/** 对齐官方yxc.v的白天静默窗口；手机本地时钟判断，不停止通知转发。 */
public final class NapQuietPolicy {
    public static final int SILENT_FLAG=0x10000000;
    private NapQuietPolicy() { }
    public static boolean valid(int start,int end) {
        return start>=0 && end<1440 && start<end;
    }
    public static boolean active(boolean enabled,int start,int end,LocalTime now) {
        if(!enabled || !valid(start,end) || now==null) return false;
        return !now.isBefore(LocalTime.of(start/60,start%60)) && !now.isAfter(LocalTime.of(end/60,end%60));
    }
    public static String time(int minute) {
        if(minute<0 || minute>=1440) throw new IllegalArgumentException("invalid time");
        return String.format(Locale.ROOT,"%02d:%02d",minute/60,minute%60);
    }
}
