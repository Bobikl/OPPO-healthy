package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATBloodOxygenData extends ATDeviceData {
    private List bloodOxygens;
    private int dataOffset;
    private int dataSize;
    private int remainCount;
    private int utcOffset;

    public ATBloodOxygenData(byte[] bArr) {
        super(bArr);
    }

    public List getBloodOxygens() {
        return this.bloodOxygens;
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public int getUtcOffset() {
        return this.utcOffset;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            this.cmd = unsignedInt;
            if (unsignedInt == 142) {
                this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
                this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
                this.bloodOxygens = new ArrayList();
                int i = byteBufferOrder.getInt();
                this.utcOffset = toUnsignedInt(byteBufferOrder.get()) * 5;
                int i2 = 0;
                do {
                    ATBloodOxygenItem aTBloodOxygenItem = new ATBloodOxygenItem();
                    aTBloodOxygenItem.setType(toUnsignedInt(byteBufferOrder.get()));
                    aTBloodOxygenItem.setBloodOxygen(toUnsignedInt(byteBufferOrder.get()));
                    aTBloodOxygenItem.setHeartRate(toUnsignedInt(byteBufferOrder.get()));
                    aTBloodOxygenItem.setUtc((this.utcOffset * i2) + i);
                    this.bloodOxygens.add(aTBloodOxygenItem);
                    i2++;
                } while (this.srcData.length - byteBufferOrder.position() >= 3);
            } else {
                this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
                this.dataOffset = toUnsignedInt(byteBufferOrder.getShort());
                this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
                this.bloodOxygens = new ArrayList();
                do {
                    ATBloodOxygenItem aTBloodOxygenItem2 = new ATBloodOxygenItem();
                    long j2 = byteBufferOrder.getInt();
                    int unsignedInt2 = toUnsignedInt(byteBufferOrder.get());
                    int unsignedInt3 = toUnsignedInt(byteBufferOrder.get());
                    aTBloodOxygenItem2.setUtc(j2);
                    aTBloodOxygenItem2.setBloodOxygen(unsignedInt2);
                    aTBloodOxygenItem2.setHeartRate(unsignedInt3);
                    this.bloodOxygens.add(aTBloodOxygenItem2);
                } while (this.srcData.length - byteBufferOrder.position() >= 6);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setBloodOxygens(List list) {
        this.bloodOxygens = list;
    }

    public void setDataOffset(int i) {
        this.dataOffset = i;
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setUtcOffset(int i) {
        this.utcOffset = i;
    }

    public String toString() {
        return "ATBloodOxygenData{remainCount=" + this.remainCount + ", dataOffset=" + this.dataOffset + ", dataSize=" + this.dataSize + ", utcOffset=" + this.utcOffset + ", bloodOxygens=" + this.bloodOxygens + '}';
    }
}
