package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATBuriedPointSummary extends ATDeviceData {
    public static final int TYPE_1 = 0;
    public static final int TYPE_2 = 1;
    public static final int TYPE_3 = 2;
    private List items;
    private int type;

    public ATBuriedPointSummary(byte[] bArr) {
        super(bArr);
    }

    private int getItemLen() {
        return this.type == 2 ? 16 : 8;
    }

    public List getItems() {
        return this.items;
    }

    public int getType() {
        return this.type;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        int unsignedInt;
        int unsignedInt2;
        int i;
        int i2;
        int i3;
        int i4;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.type = toUnsignedInt(byteBufferOrder.get());
            int length = bArr.length - byteBufferOrder.position();
            byte[] bArr2 = new byte[length];
            byteBufferOrder.get(bArr2, 0, length);
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(byteOrder);
            this.items = new ArrayList();
            do {
                int i5 = this.type;
                if (i5 == 0) {
                    unsignedInt = toUnsignedInt(byteBufferOrder2.getShort());
                    unsignedInt2 = toUnsignedInt(byteBufferOrder2.getShort());
                    i4 = 0;
                    i3 = 0;
                    i2 = byteBufferOrder2.getInt();
                    i = 0;
                } else {
                    if (1 == i5) {
                        unsignedInt = toUnsignedInt(byteBufferOrder2.getShort());
                        unsignedInt2 = toUnsignedInt(byteBufferOrder2.getShort());
                        i = byteBufferOrder2.getInt();
                        i2 = 0;
                    } else if (2 == i5) {
                        unsignedInt = toUnsignedInt(byteBufferOrder2.getShort());
                        unsignedInt2 = toUnsignedInt(byteBufferOrder2.getShort());
                        i = byteBufferOrder2.getInt();
                        int i6 = byteBufferOrder2.getInt();
                        i3 = byteBufferOrder2.getInt();
                        i4 = i6;
                        i2 = 0;
                    } else {
                        unsignedInt = 0;
                        unsignedInt2 = 0;
                        i = 0;
                        i2 = 0;
                    }
                    i4 = i2;
                    i3 = i4;
                }
                ATBuriedPointItem aTBuriedPointItem = new ATBuriedPointItem();
                aTBuriedPointItem.setEventCode(unsignedInt2);
                aTBuriedPointItem.setMenuCode(unsignedInt);
                aTBuriedPointItem.setCount(i);
                aTBuriedPointItem.setStartUtc(i4);
                aTBuriedPointItem.setEndUtc(i3);
                aTBuriedPointItem.setUtc(i2);
                this.items.add(aTBuriedPointItem);
            } while (length - byteBufferOrder2.position() >= getItemLen());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ATBuriedPointSummary{type=" + this.type + ", items=" + this.items + '}';
    }
}
