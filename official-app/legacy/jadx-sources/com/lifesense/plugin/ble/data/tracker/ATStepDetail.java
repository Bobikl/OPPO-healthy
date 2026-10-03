package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATStepDetail extends ATDeviceData {
    private int dataSize;
    private int offset;
    private int remainCount;
    private int[] steps;
    private long utc;

    public ATStepDetail(byte[] bArr) {
        super(bArr);
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public int getCmd() {
        return this.cmd;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public int[] getSteps() {
        return this.steps;
    }

    public long getUtc() {
        return this.utc;
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
            long j2 = byteBufferOrder.getInt();
            this.utc = j2;
            this.measureTime = formatUtcTime(j2);
            this.offset = toUnsignedInt(byteBufferOrder.get());
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            int iPosition = byteBufferOrder.position();
            byte[] bArr3 = this.srcData;
            int length = bArr3.length - iPosition;
            byte[] bArr4 = new byte[length];
            int i = 0;
            System.arraycopy(bArr3, iPosition, bArr4, 0, length);
            this.steps = new int[this.dataSize];
            int i2 = 0;
            do {
                byte[] bArr5 = new byte[4];
                System.arraycopy(bArr4, i, bArr5, 1, 3);
                this.steps[i2] = byte2Uint32(bArr5, ByteOrder.BIG_ENDIAN);
                i += 3;
                i2++;
            } while (length - i > 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setSteps(int[] iArr) {
        this.steps = iArr;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATStepDetail [cmd=" + this.cmd + ", srcData=" + Arrays.toString(this.srcData) + ", utc=" + this.utc + ", offset=" + this.offset + ", remainCount=" + this.remainCount + ", dataSize=" + this.dataSize + ", steps=" + Arrays.toString(this.steps) + "]";
    }
}
