package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATBloodOxygenMonitor extends ATConfigItem {
    private boolean enable;

    public ATBloodOxygenMonitor(boolean z) {
        this.enable = z;
        this.type = 32;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) this.type, 1, this.enable ? (byte) 1 : (byte) 0};
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

    public String toString() {
        return "ATBloodOxygenMonitor{enable=" + this.enable + '}';
    }

    public ATBloodOxygenMonitor(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 32;
        try {
            boolean z = true;
            if (a.a(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).get()) != 1) {
                z = false;
            }
            this.enable = z;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
