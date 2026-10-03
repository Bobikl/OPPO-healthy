package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes13.dex */
public final class p6b {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j2) {
        return (b() - j2) * a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
