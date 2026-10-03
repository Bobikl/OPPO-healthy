package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATStatisticalData extends ATDeviceData {
    private List items;
    private int len;
    private int type;

    public ATStatisticalData(byte[] bArr) {
        super(bArr);
    }

    public List getItems() {
        return this.items;
    }

    public int getLen() {
        return this.len;
    }

    public int getType() {
        return this.type;
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
            this.type = toUnsignedInt(byteBufferOrder.get());
            this.len = toUnsignedInt(byteBufferOrder.get());
            if (this.type == 1) {
                this.items = new ArrayList();
                do {
                    ATStatisticalItem aTStatisticalItem = new ATStatisticalItem();
                    aTStatisticalItem.setUtc(byteBufferOrder.getInt());
                    aTStatisticalItem.setSedentaryTime(toUnsignedInt(byteBufferOrder.getShort()));
                    this.items.add(aTStatisticalItem);
                } while (this.srcData.length - byteBufferOrder.position() >= 5);
            } else {
                System.err.println("undefined type of statistical data:" + this.type);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setLen(int i) {
        this.len = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ATStatisticalData [type=" + this.type + ", len=" + this.len + ", items=" + this.items + "]";
    }
}
