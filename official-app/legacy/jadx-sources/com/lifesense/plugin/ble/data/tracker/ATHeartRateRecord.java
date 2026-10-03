package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateRecord extends ATDeviceData {
    private int dataOffset;
    private int dataSize;
    private int frequency;
    private List heartRates;
    private int remainCount;
    private long utc;

    public ATHeartRateRecord(byte[] bArr) {
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

    public List getHeartRates() {
        return this.heartRates;
    }

    public int getRemainCount() {
        return this.remainCount;
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
            this.heartRates = new ArrayList();
            do {
                this.heartRates.add(Integer.valueOf(toUnsignedInt(byteBufferOrder.get())));
            } while (this.srcData.length - byteBufferOrder.position() >= 1);
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

    public void setHeartRates(List list) {
        this.heartRates = list;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATHeartRateRecord{utc=" + this.utc + ", frequency=" + this.frequency + ", remainCount=" + this.remainCount + ", dataOffset=" + this.dataOffset + ", dataSize=" + this.dataSize + ", heartRates=" + this.heartRates + '}';
    }
}
