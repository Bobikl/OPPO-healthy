package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATRestingHeartRate extends ATDeviceData {
    private int dataOffset;
    private int dataSize;
    private List heartRates;
    private int remainCount;

    public ATRestingHeartRate(byte[] bArr) {
        super(bArr);
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public List getHeartRates() {
        return this.heartRates;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataOffset = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            this.heartRates = new ArrayList();
            do {
                long j2 = byteBufferOrder.getInt();
                int unsignedInt = toUnsignedInt(byteBufferOrder.get());
                int unsignedInt2 = toUnsignedInt(byteBufferOrder.get());
                ATBloodOxygenItem aTBloodOxygenItem = new ATBloodOxygenItem();
                aTBloodOxygenItem.setUtc(j2);
                aTBloodOxygenItem.setBloodOxygen(unsignedInt);
                aTBloodOxygenItem.setHeartRate(unsignedInt2);
                this.heartRates.add(aTBloodOxygenItem);
            } while (this.srcData.length - byteBufferOrder.position() >= 6);
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

    public void setHeartRates(List list) {
        this.heartRates = list;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public String toString() {
        return "ATRestingHeartRate{remainCount=" + this.remainCount + ", dataOffset=" + this.dataOffset + ", dataSize=" + this.dataSize + ", heartRates=" + this.heartRates + '}';
    }
}
