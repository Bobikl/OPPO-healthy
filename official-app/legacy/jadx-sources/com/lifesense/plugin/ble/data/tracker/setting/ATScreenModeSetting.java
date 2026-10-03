package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATScreenModeSetting extends LSDeviceSyncSetting {
    public static final int SCREEN_MODE_HORIZONTAL = 0;
    public static final int SCREEN_MODE_VERTICAL = 1;
    private int screenMode;

    private ATScreenModeSetting() {
    }

    public ATScreenModeSetting(int i) {
        this.screenMode = i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) getCmd(), (byte) this.screenMode};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 125;
    }

    public int getScreenMode() {
        return this.screenMode;
    }

    public void setScreenMode(int i) {
        this.screenMode = i;
    }
}
