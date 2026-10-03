package com.oplus.aiunit.vision;

import com.coloros.platformalarmclock.PlatformClockInfo;

/* JADX INFO: loaded from: classes13.dex */
public interface xke {
    void a(boolean z);

    void alarmClockRing(PlatformClockInfo platformClockInfo);

    void dismissClock(long j2);

    void onDataChanged(int i, int i2, long j2);

    void snoozeClock(long j2);
}
