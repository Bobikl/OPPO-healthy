package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATBloodOxygenItem {
    private int bloodOxygen;
    private int heartRate;
    private int type;
    private long utc;

    public int getBloodOxygen() {
        return this.bloodOxygen;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public int getType() {
        return this.type;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setBloodOxygen(int i) {
        this.bloodOxygen = i;
    }

    public void setHeartRate(int i) {
        this.heartRate = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATBloodOxygenItem{utc=" + this.utc + ", bloodOxygen=" + this.bloodOxygen + ", heartRate=" + this.heartRate + ", type=" + this.type + '}';
    }
}
