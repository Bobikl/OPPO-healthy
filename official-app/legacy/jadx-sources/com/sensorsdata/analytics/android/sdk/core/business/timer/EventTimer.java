package com.sensorsdata.analytics.android.sdk.core.business.timer;

import android.os.SystemClock;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class EventTimer {
    private long startTime;
    private final TimeUnit timeUnit;
    private boolean isPaused = false;
    private long eventAccumulatedDuration = 0;
    private long endTime = -1;

    public EventTimer(TimeUnit timeUnit, long j2) {
        this.startTime = j2;
        this.timeUnit = timeUnit;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:14:0x002c, B:16:0x0034, B:30:0x0054, B:17:0x0036, B:19:0x003a, B:20:0x003d, B:22:0x0043, B:23:0x0045, B:24:0x0047, B:26:0x004b), top: B:36:0x002c }] */
    public float duration() {
        float f;
        float f2;
        if (this.isPaused) {
            this.endTime = this.startTime;
        } else {
            long jElapsedRealtime = this.endTime;
            if (jElapsedRealtime < 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            this.endTime = jElapsedRealtime;
        }
        long j2 = (this.endTime - this.startTime) + this.eventAccumulatedDuration;
        if (j2 >= 0 && j2 <= 86400000) {
            try {
                TimeUnit timeUnit = this.timeUnit;
                if (timeUnit == TimeUnit.MILLISECONDS) {
                    f2 = j2;
                } else if (timeUnit == TimeUnit.SECONDS) {
                    f2 = j2 / 1000.0f;
                } else {
                    if (timeUnit == TimeUnit.MINUTES) {
                        f = j2 / 1000.0f;
                    } else if (timeUnit == TimeUnit.HOURS) {
                        f = (j2 / 1000.0f) / 60.0f;
                    } else {
                        f2 = j2;
                    }
                    f2 = f / 60.0f;
                }
                if (f2 < 0.0f) {
                    return 0.0f;
                }
                return Math.round(f2 * 1000.0f) / 1000.0f;
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
        return 0.0f;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getEventAccumulatedDuration() {
        return this.eventAccumulatedDuration;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setEventAccumulatedDuration(long j2) {
        this.eventAccumulatedDuration = j2;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setTimerState(boolean z, long j2) {
        this.isPaused = z;
        if (z) {
            this.eventAccumulatedDuration = (this.eventAccumulatedDuration + j2) - this.startTime;
        }
        this.startTime = j2;
    }
}
