package com.lifesense.plugin.ble.data.other;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceFilterInfo {
    private String broadcastName;
    private BroadcastNameMatchWay matchWay;

    public synchronized String getBroadcastName() {
        return this.broadcastName;
    }

    public synchronized BroadcastNameMatchWay getMatchWay() {
        return this.matchWay;
    }

    public String logString() {
        return "[matchWay=" + this.matchWay + ",value=" + this.broadcastName + "]";
    }

    public synchronized void setBroadcastName(String str) {
        this.broadcastName = str;
    }

    public synchronized void setMatchWay(BroadcastNameMatchWay broadcastNameMatchWay) {
        this.matchWay = broadcastNameMatchWay;
    }

    public String toString() {
        return "DeviceFiterInfo [broadcastName=" + this.broadcastName + ", matchWay=" + this.matchWay + "]";
    }
}
