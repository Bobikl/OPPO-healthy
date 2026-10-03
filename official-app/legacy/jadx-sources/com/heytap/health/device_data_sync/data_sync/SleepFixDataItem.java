package com.heytap.health.device_data_sync.data_sync;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class SleepFixDataItem {
    private String deviceUniqueId;
    private int lastSleepTime;
    private int sleepCost;
    private int sleepInTime;
    private int sleepOriginalInTime;
    private int sleepOriginalOutTime;
    private int sleepOutTime;

    public int getLastSleepTime() {
        return this.lastSleepTime;
    }

    public int getSleepCost() {
        return this.sleepCost;
    }

    public int getSleepInTime() {
        return this.sleepInTime;
    }

    public int getSleepOriginalInTime() {
        return this.sleepOriginalInTime;
    }

    public int getSleepOriginalOutTime() {
        return this.sleepOriginalOutTime;
    }

    public int getSleepOutTime() {
        return this.sleepOutTime;
    }

    public void setLastSleepTime(int i) {
        this.lastSleepTime = i;
    }

    public void setSleepCost(int i) {
        this.sleepCost = i;
    }

    public void setSleepInTime(int i) {
        this.sleepInTime = i;
    }

    public void setSleepOriginalInTime(int i) {
        this.sleepOriginalInTime = i;
    }

    public void setSleepOriginalOutTime(int i) {
        this.sleepOriginalOutTime = i;
    }

    public void setSleepOutTime(int i) {
        this.sleepOutTime = i;
    }

    public String toString() {
        return "SleepFixDataItem{sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", sleepOriginalInTime=" + this.sleepOriginalInTime + ", sleepOriginalOutTime=" + this.sleepOriginalOutTime + ", sleepCost=" + this.sleepCost + ", lastSleepTime=" + this.lastSleepTime + '}';
    }
}
