package com.lifesense.plugin.ble.data.tracker.config;

/* JADX INFO: loaded from: classes5.dex */
public class ATTemperatureUnit extends ATConfigItem {
    private int unit;

    public ATTemperatureUnit(int i) {
        this.unit = i;
        this.type = 1;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) this.type, 1, (byte) this.unit};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public String toString() {
        return "ATTemperatureUnit{unit=" + this.unit + ", type=" + this.type + '}';
    }
}
