package com.lifesense.plugin.ble.data.tracker.config;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATStrideInfo extends ATConfigItem {
    private int runningStride;
    private int walkingStride;

    public ATStrideInfo() {
        this.type = 13;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 2;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        byte[] bArr = {14, 1, (byte) this.runningStride};
        byte[] bArr2 = {13, 1, (byte) this.walkingStride};
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.put(bArr2);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getRunningStride() {
        return this.runningStride;
    }

    public int getWalkingStride() {
        return this.walkingStride;
    }

    public void setRunningStride(int i) {
        this.runningStride = i;
    }

    public void setStrideType(int i) {
        this.type = i;
    }

    public void setWalkingStride(int i) {
        this.walkingStride = i;
    }

    public String toString() {
        return "ATStrideInfo{runningStride=" + this.runningStride + ", walkingStride=" + this.walkingStride + '}';
    }
}
