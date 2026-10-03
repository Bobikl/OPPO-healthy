package com.heytap.store.base.core.util;

/* JADX INFO: loaded from: classes3.dex */
public class FrequeControl {
    private int mCounts = 0;
    private int mSeconds = 0;
    private int mCurrentCounts = 0;
    private long mFirstTriggerTime = 0;

    public boolean canTrigger() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.mFirstTriggerTime;
        if (j2 == 0 || jCurrentTimeMillis - j2 > this.mSeconds * 1000) {
            this.mFirstTriggerTime = jCurrentTimeMillis;
            this.mCurrentCounts = 0;
        }
        int i = this.mCurrentCounts;
        if (i >= this.mCounts) {
            return false;
        }
        this.mCurrentCounts = i + 1;
        return true;
    }

    public void init(int i, int i2) {
        this.mCounts = i;
        this.mSeconds = i2;
        this.mCurrentCounts = 0;
        this.mFirstTriggerTime = 0L;
    }
}
