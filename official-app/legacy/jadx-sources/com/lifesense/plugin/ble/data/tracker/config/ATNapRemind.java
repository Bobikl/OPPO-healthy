package com.lifesense.plugin.ble.data.tracker.config;

/* JADX INFO: loaded from: classes5.dex */
public class ATNapRemind {
    private boolean enable;
    private int napTime;

    public int getNapTime() {
        return this.napTime;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setNapTime(int i) {
        this.napTime = i;
    }

    public String toString() {
        return "ATNapRemind{enable=" + this.enable + ", napTime=" + this.napTime + '}';
    }
}
