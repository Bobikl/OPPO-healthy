package com.oplus.aiunit.vision;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes12.dex */
public class dhm {
    public static final long a = 3000;
    public static long b = -1;

    public static synchronized boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - b < 3000) {
            return true;
        }
        b = jElapsedRealtime;
        return false;
    }
}
