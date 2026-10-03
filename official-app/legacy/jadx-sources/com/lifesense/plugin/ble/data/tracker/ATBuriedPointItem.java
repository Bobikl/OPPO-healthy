package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATBuriedPointItem {
    private int count;
    private long endUtc;
    private int eventCode;
    private int menuCode;
    private long startUtc;
    private long utc;

    public int getCount() {
        return this.count;
    }

    public long getEndUtc() {
        return this.endUtc;
    }

    public int getEventCode() {
        return this.eventCode;
    }

    public int getMenuCode() {
        return this.menuCode;
    }

    public long getStartUtc() {
        return this.startUtc;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setEndUtc(long j2) {
        this.endUtc = j2;
    }

    public void setEventCode(int i) {
        this.eventCode = i;
    }

    public void setMenuCode(int i) {
        this.menuCode = i;
    }

    public void setStartUtc(long j2) {
        this.startUtc = j2;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATBuriedPointItem{utc=" + this.utc + ", menuCode=" + this.menuCode + ", eventCode=" + this.eventCode + ", count=" + this.count + ", startUtc=" + this.startUtc + ", endUtc=" + this.endUtc + '}';
    }
}
