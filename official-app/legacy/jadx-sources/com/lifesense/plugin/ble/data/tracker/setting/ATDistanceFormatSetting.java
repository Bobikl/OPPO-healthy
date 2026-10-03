package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATDistanceFormatSetting extends LSDeviceSyncSetting {
    public static final int DISTANCE_FORMAT_KILOMETER = 0;
    public static final int DISTANCE_FORMAT_MILE = 1;
    private int distacneFormat;

    private ATDistanceFormatSetting() {
    }

    public ATDistanceFormatSetting(int i) {
        this.distacneFormat = i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) getCmd(), (byte) getDistacneFormat()};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 120;
    }

    public int getDistacneFormat() {
        return this.distacneFormat;
    }

    public void setDistacneFormat(int i) {
        this.distacneFormat = i;
    }
}
