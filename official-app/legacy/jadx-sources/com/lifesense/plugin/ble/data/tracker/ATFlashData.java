package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATFlashData extends ATDeviceData {
    private byte[] content;
    private int endAddress;
    private int startAddress;
    private int type;

    public ATFlashData(byte[] bArr) {
        super(bArr);
    }

    public byte[] getContent() {
        return this.content;
    }

    public int getEndAddress() {
        return this.endAddress;
    }

    public int getStartAddress() {
        return this.startAddress;
    }

    public int getType() {
        return this.type;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.type = toUnsignedInt(byteBufferOrder.get());
            this.startAddress = byteBufferOrder.getInt();
            this.endAddress = byteBufferOrder.getInt();
            byte[] bArr2 = new byte[bArr.length - byteBufferOrder.position()];
            this.content = bArr2;
            byteBufferOrder.get(bArr2, 0, bArr2.length);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setContent(byte[] bArr) {
        this.content = bArr;
    }

    public void setEndAddress(int i) {
        this.endAddress = i;
    }

    public void setStartAddress(int i) {
        this.startAddress = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ATFlashData{type=" + this.type + ", startAddress=" + this.startAddress + ", endAddress=" + this.endAddress + ", content=" + Arrays.toString(this.content) + '}';
    }
}
