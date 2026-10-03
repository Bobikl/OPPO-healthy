package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATBuriedPointData extends ATDeviceData {
    private int dataOffset;
    private int dataSize;
    private List items;
    private int remainCount;

    public ATBuriedPointData(byte[] bArr) {
        super(bArr);
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public List getItems() {
        return this.items;
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
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataOffset = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            int length = bArr.length - byteBufferOrder.position();
            byte[] bArr2 = new byte[length];
            byteBufferOrder.get(bArr2, 0, length);
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(byteOrder);
            this.items = new ArrayList();
            do {
                long j2 = byteBufferOrder2.getInt();
                int unsignedInt = toUnsignedInt(byteBufferOrder2.getShort());
                int unsignedInt2 = toUnsignedInt(byteBufferOrder2.getShort());
                ATBuriedPointItem aTBuriedPointItem = new ATBuriedPointItem();
                aTBuriedPointItem.setUtc(j2);
                aTBuriedPointItem.setEventCode(unsignedInt2);
                aTBuriedPointItem.setMenuCode(unsignedInt);
                this.items.add(aTBuriedPointItem);
            } while (length - byteBufferOrder2.position() > 8);
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

    public void setItems(List list) {
        this.items = list;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public String toString() {
        return "ATBuriedPointData{remainCount=" + this.remainCount + ", dataOffset=" + this.dataOffset + ", dataSize=" + this.dataSize + ", items=" + this.items + '}';
    }
}
