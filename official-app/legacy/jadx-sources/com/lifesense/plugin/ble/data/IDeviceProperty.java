package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public class IDeviceProperty {
    protected String broadcastId;
    protected String deviceId;
    protected String deviceSn;
    protected String macAddress;

    public String getBroadcastId() {
        return this.broadcastId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public void setBroadcastId(String str) {
        this.broadcastId = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public String toString() {
        return "BaseDeviceInfo [macAddress=" + this.macAddress + ", deviceId=" + this.deviceId + ", deviceSn=" + this.deviceSn + ", broadcastId=" + this.broadcastId + "]";
    }
}
