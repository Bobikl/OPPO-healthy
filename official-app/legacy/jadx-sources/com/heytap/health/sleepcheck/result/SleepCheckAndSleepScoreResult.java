package com.heytap.health.sleepcheck.result;

import androidx.annotation.Keep;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SleepCheckAndSleepScoreResult {
    public static final int MAX_SLEEP_SEGMENT = 20;
    public int segment;
    public int[][] segmentInfo = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 20, 2);
    public SegmentSleepPara[] segmentSleepParas = new SegmentSleepPara[20];
    public int sleepScore;
    public int sleepScoreCheck;
    public int totalSleepMinutes;
    public int version;

    public String toString() {
        return "SleepCheckAndSleepScoreResult{version=" + this.version + ", sleepScore=" + this.sleepScore + ", sleepScoreCheck=" + this.sleepScoreCheck + ", totalSleepMinutes=" + this.totalSleepMinutes + ", segment=" + this.segment + ", segmentInfo=" + Arrays.toString(this.segmentInfo) + ", segmentSleepParas=" + Arrays.toString(this.segmentSleepParas) + '}';
    }
}
