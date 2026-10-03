package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATWorkingItem {
    private int action;
    private int flag;
    private long utc;

    public int getAction() {
        return this.action;
    }

    public int getFlag() {
        return this.flag;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATWorkingItem{action=" + this.action + ", utc=" + this.utc + ", flag=" + this.flag + '}';
    }
}
