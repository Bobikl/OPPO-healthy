package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public class LSScanIntervalConfig extends IBManagerConfig {
    private boolean enable;
    private LSDeviceInfo pairDevice;
    private long scanTime = 10000;
    private long pausesTime = 10000;

    public LSScanIntervalConfig() {
    }

    private String getDeviceMac() {
        LSDeviceInfo lSDeviceInfo = this.pairDevice;
        if (lSDeviceInfo != null) {
            return lSDeviceInfo.getBroadcastID();
        }
        return null;
    }

    public LSDeviceInfo getPairDevice() {
        return this.pairDevice;
    }

    public long getPausesTime() {
        return this.pausesTime;
    }

    public long getScanTime() {
        return this.scanTime;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPairDevice(LSDeviceInfo lSDeviceInfo) {
        this.pairDevice = lSDeviceInfo;
    }

    public void setPausesTime(long j2) {
        this.pausesTime = j2;
    }

    public void setScanTime(long j2) {
        this.scanTime = j2;
    }

    public String toString() {
        return "LSScanIntervalConfig{enable=" + this.enable + ", scanTime=" + this.scanTime + ", pausesTime=" + this.pausesTime + ", pairDevice=" + getDeviceMac() + '}';
    }

    public LSScanIntervalConfig(boolean z) {
        this.enable = z;
    }
}
