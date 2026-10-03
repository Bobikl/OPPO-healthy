package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public class ATDisturbItem {
    private boolean enable;
    private String endTime;
    private String startTime;

    public ATDisturbItem() {
    }

    public ATDisturbItem(boolean z, String str, String str2) {
        this.enable = z;
        this.startTime = str;
        this.endTime = str2;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String toString() {
        return "ATDisturbItem{enable=" + this.enable + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "'}";
    }
}
