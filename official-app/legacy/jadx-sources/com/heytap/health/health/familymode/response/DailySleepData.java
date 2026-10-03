package com.heytap.health.health.familymode.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailySleepData {
    private int averageSleepBloodOxygen;
    private int maxSleepTime;
    private int minSleepTime;
    private int sleepRecoverRate;
    private int sleepScore;
    private int snoreNameType;
    private int snoreRiskLevel;
    private long totalSleepTime;

    public int getAverageSleepBloodOxygen() {
        return this.averageSleepBloodOxygen;
    }

    public int getMaxSleepTime() {
        return this.maxSleepTime;
    }

    public int getMinSleepTime() {
        return this.minSleepTime;
    }

    public int getSleepRecoverRate() {
        return this.sleepRecoverRate;
    }

    public int getSleepScore() {
        return this.sleepScore;
    }

    public int getSnoreNameType() {
        return this.snoreNameType;
    }

    public int getSnoreRiskLevel() {
        return this.snoreRiskLevel;
    }

    public long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public String toString() {
        return "DailySleepData{totalSleepTime=" + this.totalSleepTime + ", minSleepTime=" + this.minSleepTime + ", maxSleepTime=" + this.maxSleepTime + ", sleepScore=" + this.sleepScore + ", snoreRiskLevel=" + this.snoreRiskLevel + ", averageSleepBloodOxygen=" + this.averageSleepBloodOxygen + ", sleepRecoverRate=" + this.sleepRecoverRate + ", snoreNameType=" + this.snoreNameType + '}';
    }
}
