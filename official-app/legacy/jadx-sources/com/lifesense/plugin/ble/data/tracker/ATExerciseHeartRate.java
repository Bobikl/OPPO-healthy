package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseHeartRate extends ATHeartRateData {
    private ATExerciseType category;
    private int mode;

    public ATExerciseHeartRate(byte[] bArr) {
        super(bArr);
        this.mode = 0;
        this.type = 1;
    }

    public ATExerciseType getCategory() {
        return this.category;
    }

    public int getMode() {
        return this.mode;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATHeartRateData, com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        byte[] bArr2 = this.srcData;
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            this.cmd = unsignedInt;
            if (unsignedInt == 229) {
                this.category = ATExerciseType.getDataType(toUnsignedInt(byteBufferOrder.get()));
                this.mode = toUnsignedInt(byteBufferOrder.get());
            } else {
                this.category = ATExerciseType.Running;
            }
            long j2 = byteBufferOrder.getInt();
            this.utc = j2;
            this.measureTime = formatUtcTime(j2);
            this.offset = toUnsignedInt(byteBufferOrder.get()) * 5;
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            int iPosition = byteBufferOrder.position();
            byte[] bArr3 = this.srcData;
            int length = bArr3.length - iPosition;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, iPosition, bArr4, 0, length);
            this.heartRates = new ArrayList();
            for (int i = 0; i < this.dataSize; i++) {
                this.heartRates.add(i, Integer.valueOf(toUnsignedInt(bArr4[i])));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCategory(ATExerciseType aTExerciseType) {
        this.category = aTExerciseType;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATHeartRateData
    public String toString() {
        return "ATExerciseHeartRate{, category=" + this.category + ", mode=" + this.mode + ", type=" + this.type + ", utc=" + this.utc + ", offset=" + this.offset + ", remainCount=" + this.remainCount + ", dataSize=" + this.dataSize + ", heartRates=" + intArrayToString(this.heartRates) + ", cmd=" + this.cmd + ", measureTime=" + this.measureTime + '}';
    }
}
