package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseCalories extends ATDeviceData {
    private float[] calories;
    private ATExerciseType category;
    private int dataSize;
    private int mode;
    private int offset;
    private int remainCount;
    private long utc;

    public ATExerciseCalories(byte[] bArr) {
        super(bArr);
    }

    public float[] getCalories() {
        return this.calories;
    }

    public ATExerciseType getCategory() {
        return this.category;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getMode() {
        return this.mode;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRemainCount() {
        return this.remainCount;
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
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            this.cmd = unsignedInt;
            if (unsignedInt == 230) {
                this.category = ATExerciseType.getDataType(toUnsignedInt(byteBufferOrder.get()));
                this.mode = toUnsignedInt(byteBufferOrder.get());
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
            this.calories = new float[this.dataSize];
            int i = 0;
            int i2 = 0;
            do {
                byte[] bArr5 = new byte[2];
                System.arraycopy(bArr4, i, bArr5, 0, 2);
                this.calories[i2] = (float) (((double) byte2Uint16(bArr5, ByteOrder.BIG_ENDIAN)) * 0.1d);
                i += 2;
                i2++;
            } while (length - i > 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCalories(float[] fArr) {
        this.calories = fArr;
    }

    public void setCategory(ATExerciseType aTExerciseType) {
        this.category = aTExerciseType;
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATExerciseCalories{, category=" + this.category + ", mode=" + this.mode + ", utc=" + this.utc + ", offset=" + this.offset + ", remainCount=" + this.remainCount + ", dataSize=" + this.dataSize + ", calories=" + floatArrayToString(this.calories) + ", cmd=" + this.cmd + ", measureTime=" + this.measureTime + '}';
    }
}
