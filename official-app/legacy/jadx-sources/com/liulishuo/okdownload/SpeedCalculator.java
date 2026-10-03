package com.liulishuo.okdownload;

import android.os.SystemClock;
import com.liulishuo.okdownload.core.Util;

/* JADX INFO: loaded from: classes5.dex */
public class SpeedCalculator {
    long allIncreaseBytes;
    long beginTimestamp;
    long bytesPerSecond;
    long endTimestamp;
    long increaseBytes;
    long timestamp;

    private static String humanReadableSpeed(long j2, boolean z) {
        return Util.humanReadableBytes(j2, z) + "/s";
    }

    public String averageSpeed() {
        return speedFromBegin();
    }

    public synchronized void downloading(long j2) {
        if (this.timestamp == 0) {
            long jNowMillis = nowMillis();
            this.timestamp = jNowMillis;
            this.beginTimestamp = jNowMillis;
        }
        this.increaseBytes += j2;
        this.allIncreaseBytes += j2;
    }

    public synchronized void endTask() {
        this.endTimestamp = nowMillis();
    }

    public synchronized void flush() {
        long jNowMillis = nowMillis();
        long j2 = this.increaseBytes;
        long jMax = Math.max(1L, jNowMillis - this.timestamp);
        this.increaseBytes = 0L;
        this.timestamp = jNowMillis;
        this.bytesPerSecond = (long) ((j2 / jMax) * 1000.0f);
    }

    public synchronized long getBytesPerSecondAndFlush() {
        long jNowMillis = nowMillis() - this.timestamp;
        if (jNowMillis < 1000) {
            long j2 = this.bytesPerSecond;
            if (j2 != 0) {
                return j2;
            }
        }
        if (this.bytesPerSecond == 0 && jNowMillis < 500) {
            return 0L;
        }
        return getInstantBytesPerSecondAndFlush();
    }

    public synchronized long getBytesPerSecondFromBegin() {
        long jNowMillis;
        jNowMillis = this.endTimestamp;
        if (jNowMillis == 0) {
            jNowMillis = nowMillis();
        }
        return (long) ((this.allIncreaseBytes / Math.max(1L, jNowMillis - this.beginTimestamp)) * 1000.0f);
    }

    public long getInstantBytesPerSecondAndFlush() {
        flush();
        return this.bytesPerSecond;
    }

    public synchronized long getInstantSpeedDurationMillis() {
        return nowMillis() - this.timestamp;
    }

    public String getSpeedWithBinaryAndFlush() {
        return humanReadableSpeed(getInstantBytesPerSecondAndFlush(), false);
    }

    public String getSpeedWithSIAndFlush() {
        return humanReadableSpeed(getInstantBytesPerSecondAndFlush(), true);
    }

    public String instantSpeed() {
        return getSpeedWithSIAndFlush();
    }

    public String lastSpeed() {
        return humanReadableSpeed(this.bytesPerSecond, true);
    }

    public long nowMillis() {
        return SystemClock.uptimeMillis();
    }

    public synchronized void reset() {
        this.timestamp = 0L;
        this.increaseBytes = 0L;
        this.bytesPerSecond = 0L;
        this.beginTimestamp = 0L;
        this.endTimestamp = 0L;
        this.allIncreaseBytes = 0L;
    }

    public String speed() {
        return humanReadableSpeed(getBytesPerSecondAndFlush(), true);
    }

    public String speedFromBegin() {
        return humanReadableSpeed(getBytesPerSecondFromBegin(), true);
    }
}
