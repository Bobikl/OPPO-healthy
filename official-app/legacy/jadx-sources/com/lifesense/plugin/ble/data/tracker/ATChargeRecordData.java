package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATChargeRecordData extends ATDeviceData {
    private int currentBattery;
    private long endUtc;
    private int oldBattery;
    private long startUtc;

    public ATChargeRecordData(byte[] bArr) {
        super(bArr);
    }

    public int getCurrentBattery() {
        return this.currentBattery;
    }

    public long getEndUtc() {
        return this.endUtc;
    }

    public int getOldBattery() {
        return this.oldBattery;
    }

    public long getStartUtc() {
        return this.startUtc;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.startUtc = byteBufferOrder.getInt();
            this.oldBattery = toUnsignedInt(byteBufferOrder.get());
            this.endUtc = byteBufferOrder.getInt();
            this.currentBattery = toUnsignedInt(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCurrentBattery(int i) {
        this.currentBattery = i;
    }

    public void setEndUtc(long j2) {
        this.endUtc = j2;
    }

    public void setOldBattery(int i) {
        this.oldBattery = i;
    }

    public void setStartUtc(long j2) {
        this.startUtc = j2;
    }

    public String toString() {
        return "ATChargeRecordData{startUtc=" + this.startUtc + ", oldBattery=" + this.oldBattery + ", endUtc=" + this.endUtc + ", currentBattery=" + this.currentBattery + '}';
    }
}
