package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseNotify extends ATDeviceData {
    private ATExerciseType category;
    private int flag;
    private int status;

    public ATExerciseNotify(byte[] bArr) {
        super(bArr);
    }

    public ATExerciseType getCategory() {
        return this.category;
    }

    public int getFlag() {
        return this.flag;
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
            this.flag = toUnsignedInt(byteBufferOrder.get());
            this.status = toUnsignedInt(byteBufferOrder.get());
            this.category = ATExerciseType.getDataType(toUnsignedInt(byteBufferOrder.get()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCategory(ATExerciseType aTExerciseType) {
        this.category = aTExerciseType;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "ATExerciseNotify{flag=" + this.flag + ", status=" + this.status + ", category=" + this.category + ", cmd=" + this.cmd + '}';
    }
}
