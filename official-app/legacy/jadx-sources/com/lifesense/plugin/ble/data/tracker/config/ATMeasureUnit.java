package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATMeasureUnit extends ATConfigItem {
    public static final int UNIT_IMPERIAL = 1;
    public static final int UNIT_METRIC = 0;
    private int unit;
    private int unitType;

    public ATMeasureUnit(int i) {
        this.unit = i;
        this.type = 5;
        this.unitType = 5;
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

    public int getUnitType() {
        return this.unitType;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public void setUnitType(int i) {
        this.unitType = i;
        this.type = i;
    }

    public String toString() {
        return "ATMeasureUnit{unit=" + this.unit + ", unitType=" + this.unitType + '}';
    }

    public ATMeasureUnit(byte[] bArr, int i) {
        this.type = i;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.unitType = i;
        try {
            this.unit = a.a(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
