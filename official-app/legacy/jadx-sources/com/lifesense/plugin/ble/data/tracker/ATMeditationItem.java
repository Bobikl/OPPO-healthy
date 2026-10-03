package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATMeditationItem {
    private int time;
    private long utc;

    public ATMeditationItem(long j2, int i) {
        this.utc = j2;
        this.time = i;
    }

    public int getTime() {
        return this.time;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATMeditationItem{utc=" + this.utc + ", time=" + this.time + '}';
    }
}
