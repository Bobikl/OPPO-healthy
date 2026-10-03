package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialStyleData extends ATDeviceData {
    private List dialStyles;
    private int index;
    private int len;

    public ATDialStyleData(byte[] bArr) {
        super(bArr);
    }

    public List getDialStyles() {
        return this.dialStyles;
    }

    public int getIndex() {
        return this.index;
    }

    public int getLen() {
        return this.len;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.index = toUnsignedInt(byteBufferOrder.get());
            this.len = toUnsignedInt(byteBufferOrder.get());
            this.dialStyles = new ArrayList();
            for (int i = 0; i < this.len; i++) {
                this.dialStyles.add(i, Integer.valueOf(toUnsignedInt(byteBufferOrder.get())));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDialStyles(List list) {
        this.dialStyles = list;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setLen(int i) {
        this.len = i;
    }

    public String toString() {
        return "ATDialStyleData{index=" + this.index + ", len=" + this.len + ", dialStyles=" + this.dialStyles + '}';
    }
}
