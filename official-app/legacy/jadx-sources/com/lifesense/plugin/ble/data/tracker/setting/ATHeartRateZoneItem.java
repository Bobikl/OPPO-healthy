package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateZoneItem {
    private int max;
    private int min;

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public void setMin(int i) {
        this.min = i;
    }

    public String toString() {
        return "ATHeartRateZoneItem{min=" + this.min + ", max=" + this.max + '}';
    }
}
