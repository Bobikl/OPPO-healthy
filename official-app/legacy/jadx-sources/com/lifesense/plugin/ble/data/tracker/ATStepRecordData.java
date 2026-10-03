package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATStepRecordData extends ATDeviceData {
    private int dataOffset;
    private int dataSize;
    private int frequency;
    private int remainCount;
    private List steps;
    private long utc;

    public ATStepRecordData(byte[] bArr) {
        super(bArr);
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public List getSteps() {
        return this.steps;
    }

    public long getUtc() {
        return this.utc;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.utc = byteBufferOrder.getInt();
            this.frequency = toUnsignedInt(byteBufferOrder.get());
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataOffset = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            this.steps = new ArrayList();
            do {
                this.steps.add(Integer.valueOf(byteBufferOrder.getInt()));
            } while (this.srcData.length - byteBufferOrder.position() >= 4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDataOffset(int i) {
        this.dataOffset = i;
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setSteps(List list) {
        this.steps = list;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATStepRecordData{utc=" + this.utc + ", frequency=" + this.frequency + ", remainCount=" + this.remainCount + ", dataOffset=" + this.dataOffset + ", dataSize=" + this.dataSize + ", steps=" + this.steps + '}';
    }
}
