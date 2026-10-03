package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;

/* JADX INFO: loaded from: classes5.dex */
public class ATVibrationIntensity extends ATConfigItem {
    private int level;

    public ATVibrationIntensity(int i) {
        this.level = i;
        this.type = 2;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) this.type, 1, (byte) this.level};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String toString() {
        return "ATVibrationIntensity{level=" + this.level + '}';
    }

    public ATVibrationIntensity(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 2;
        this.level = a.a(bArr[0]);
    }
}
