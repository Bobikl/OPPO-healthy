package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;

/* JADX INFO: loaded from: classes5.dex */
public class ATBrightness extends ATConfigItem {
    private int value;

    public ATBrightness(int i) {
        this.value = i;
        this.type = 3;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) this.type, 1, (byte) this.value};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public String toString() {
        return "ATBrightness{value=" + this.value + '}';
    }

    public ATBrightness(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 3;
        this.value = a.a(bArr[0]);
    }
}
