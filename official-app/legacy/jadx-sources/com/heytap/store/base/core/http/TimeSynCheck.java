package com.heytap.store.base.core.http;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class TimeSynCheck {
    private static TimeSynCheck instance = null;
    public static long minResponseTime = Long.MAX_VALUE;
    private long differenceTime;
    private boolean isServerTime;

    private TimeSynCheck() {
    }

    public static TimeSynCheck getInstance() {
        if (instance == null) {
            synchronized (TimeSynCheck.class) {
                if (instance == null) {
                    instance = new TimeSynCheck();
                }
            }
        }
        return instance;
    }

    public synchronized long getServiceTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + this.differenceTime;
        if (this.isServerTime && jElapsedRealtime >= 1506566462000L) {
            return jElapsedRealtime;
        }
        return System.currentTimeMillis();
    }

    public synchronized long initServerTime(long j2) {
        this.differenceTime = j2 - SystemClock.elapsedRealtime();
        this.isServerTime = true;
        return j2;
    }
}
