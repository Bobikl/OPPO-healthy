package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATSensorItem {
    private int gSensorX;
    private int gSensorY;
    private int gSensorZ;
    private int heartRate;
    private int step;

    public ATSensorItem(int i, int i2, int i3, int i4, int i5) {
        this.gSensorX = i;
        this.gSensorY = i2;
        this.gSensorZ = i3;
        this.heartRate = i4;
        this.step = i5;
    }

    public String toString() {
        return "ATSensorItem [gSensorX=" + this.gSensorX + ", gSensorY=" + this.gSensorY + ", gSensorZ=" + this.gSensorZ + ", heartRate=" + this.heartRate + ", step=" + this.step + "]";
    }
}
