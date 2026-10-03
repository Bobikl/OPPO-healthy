package com.heytap.health.sleepcheck.result;

import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SegmentSleepPara {
    public int check_inSleepPoint;
    public int check_num;
    public int check_outSleepPoint;
    public int check_sleepLatency;
    public long[][] check_start_finish_ts;
    public int deepMinutes;
    public int lowMinutes;
    public int remMinutes;
    public int sleepInPoint;
    public int sleepMinutes;
    public int sleepOutPoint;
    public int usePhoneInfoType;
    public int wakeCount;
    public int wakeMinutes;

    public String toString() {
        return "SegmentSleepPara{usePhoneInfoType=" + this.usePhoneInfoType + ", sleepInPoint=" + this.sleepInPoint + ", sleepOutPoint=" + this.sleepOutPoint + ", sleepMinutes=" + this.sleepMinutes + ", deepMinutes=" + this.deepMinutes + ", lowMinutes=" + this.lowMinutes + ", remMinutes=" + this.remMinutes + ", check_sleepLatency=" + this.check_sleepLatency + ", wakeMinutes=" + this.wakeMinutes + ", wakeCount=" + this.wakeCount + ", check_inSleepPoint=" + this.check_inSleepPoint + ", check_outSleepPoint=" + this.check_outSleepPoint + ", check_num=" + this.check_num + ", check_start_finish_ts=" + Arrays.toString(this.check_start_finish_ts) + '}';
    }
}
