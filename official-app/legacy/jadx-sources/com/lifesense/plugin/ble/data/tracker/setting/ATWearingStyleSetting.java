package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATWearingStyleSetting extends LSDeviceSyncSetting {
    public static final int WEARING_STYLE_LEFT = 0;
    public static final int WEARING_STYLE_RIGHT = 1;
    private int wearStyle;

    private ATWearingStyleSetting() {
    }

    public ATWearingStyleSetting(int i) {
        this.wearStyle = i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) getCmd(), (byte) this.wearStyle};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 122;
    }

    public int getWearStyle() {
        return this.wearStyle;
    }

    public void setWearStyle(int i) {
        this.wearStyle = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATWearingStyleSetting{wearStyle=" + this.wearStyle + '}';
    }
}
