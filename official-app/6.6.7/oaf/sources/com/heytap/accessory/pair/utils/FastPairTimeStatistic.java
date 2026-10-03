package com.heytap.accessory.pair.utils;

import com.heytap.accessory.pair.logging.PairLog;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FastPairTimeStatistic {
    public static final String TAG = "FastPairTimeStatistic";

    public static long countGatt2Time(long j, String str) {
        long kVar = tok(j);
        PairLog.i(TAG, "fp gatt2 cost: " + kVar + " ms, desc: " + str);
        return kVar;
    }

    public static long countGattTime(long j, String str) {
        long kVar = tok(j);
        PairLog.i(TAG, "fp gatt cost: " + kVar + " ms, desc: " + str);
        return kVar;
    }

    public static long countPairTime(long j, String str) {
        long kVar = tok(j);
        PairLog.i(TAG, "fp pair cost: " + kVar + " ms, desc: " + str);
        return kVar;
    }

    public static long countTotalTime(long j, long j2, long j3, String str) {
        long kVar = tok(j);
        PairLog.i(TAG, "fp total cost: " + kVar + " ms, desc: " + str);
        PairLog.i(TAG, "fp system cost percent: " + new DecimalFormat("0.00%").format((((double) (j2 + j3)) * 1.0d) / ((double) kVar)) + ", desc: " + str);
        return kVar;
    }

    public static long tick() {
        return System.currentTimeMillis();
    }

    public static long tok(long j) {
        return System.currentTimeMillis() - j;
    }
}
