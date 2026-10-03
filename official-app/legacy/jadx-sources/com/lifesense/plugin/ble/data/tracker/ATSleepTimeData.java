package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATSleepTimeData extends ATDeviceData {
    private int endUtc;
    private int startUtc;
    private int status;

    public ATSleepTimeData(byte[] bArr) {
        super(bArr);
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public int getCmd() {
        return this.cmd;
    }

    public int getEndUtc() {
        return this.endUtc;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public byte[] getSrcData() {
        return this.srcData;
    }

    public int getStartUtc() {
        return this.startUtc;
    }

    public int getStatus() {
        return this.status;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        byte[] bArr2 = this.srcData;
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.status = toUnsignedInt(byteBufferOrder.get());
            this.startUtc = byteBufferOrder.getInt();
            this.endUtc = byteBufferOrder.getInt();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setEndUtc(int i) {
        this.endUtc = i;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public void setSrcData(byte[] bArr) {
        this.srcData = bArr;
    }

    public void setStartUtc(int i) {
        this.startUtc = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "ATSleepTimeData [cmd=" + this.cmd + ", srcData=" + Arrays.toString(this.srcData) + ", status=" + this.status + ", startUtc=" + this.startUtc + ", endUtc=" + this.endUtc + "]";
    }
}
