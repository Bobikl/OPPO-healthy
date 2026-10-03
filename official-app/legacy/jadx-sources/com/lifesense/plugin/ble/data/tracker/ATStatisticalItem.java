package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATStatisticalItem {
    private int sedentaryTime;
    private long utc;

    public int getSedentaryTime() {
        return this.sedentaryTime;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setSedentaryTime(int i) {
        this.sedentaryTime = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATStatisticalItem [utc=" + this.utc + ", sedentaryTime=" + this.sedentaryTime + "]";
    }
}
