package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATTimeFormatSetting extends LSDeviceSyncSetting {
    public static final int TIME_FORMAT_12H = 1;
    public static final int TIME_FORMAT_24H = 0;
    private int timeFormat;

    private ATTimeFormatSetting() {
    }

    public ATTimeFormatSetting(int i) {
        this.timeFormat = i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) getCmd(), (byte) getTimeFormat()};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 121;
    }

    public int getTimeFormat() {
        return this.timeFormat;
    }

    public void setTimeFormat(int i) {
        this.timeFormat = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATTimeFormatSetting{timeFormat=" + this.timeFormat + '}';
    }
}
