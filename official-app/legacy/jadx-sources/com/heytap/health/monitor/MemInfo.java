package com.heytap.health.monitor;

import android.os.Debug;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ax7;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MemInfo {
    public int dalvikPss;
    public String day;
    public boolean foreground;
    public int nativePss;
    public int otherPss;
    public long time;
    public int totalPss;

    public static MemInfo with(Debug.MemoryInfo memoryInfo) {
        MemInfo memInfo = new MemInfo();
        memInfo.foreground = ax7.j().l();
        memInfo.totalPss = memoryInfo.getTotalPss();
        memInfo.dalvikPss = memoryInfo.dalvikPss;
        memInfo.nativePss = memoryInfo.nativePss;
        memInfo.otherPss = memoryInfo.otherPss;
        return memInfo;
    }

    public String toString() {
        return "MemInfo{dalvikPss=" + this.dalvikPss + ", nativePss=" + this.nativePss + ", totalPss=" + this.totalPss + ", otherPss=" + this.otherPss + ", day='" + this.day + "', time=" + this.time + ", foreground=" + this.foreground + '}';
    }
}
