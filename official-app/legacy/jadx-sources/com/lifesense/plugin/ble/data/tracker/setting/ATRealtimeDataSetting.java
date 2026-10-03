package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATRealtimeDataSetting extends LSDeviceSyncSetting {
    private boolean enable;

    public ATRealtimeDataSetting(boolean z) {
        this.enable = z;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[0];
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATRealtimeDataSetting{enable=" + this.enable + '}';
    }
}
