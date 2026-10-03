package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IDeviceSetting implements IPacketEncoder {
    protected int cmd;
    protected String deviceModel;

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public String toString() {
        return "LSDeviceSyncSetting{cmd=" + this.cmd + '}';
    }
}
