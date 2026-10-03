package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATWatchFace extends ATConfigItem {
    private int index;
    private List items;

    public ATWatchFace(int i, List list) {
        this.index = i;
        this.items = list;
        this.type = 10;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.items;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put((byte) 6);
        byteBufferOrder.put((byte) this.index);
        byteBufferOrder.put((byte) this.items.size());
        Iterator it = this.items.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((ATDisplayItem) it.next()).getValue();
        }
        byteBufferOrder.putInt(value);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getIndex() {
        return this.index;
    }

    public List getItems() {
        return this.items;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setItems(List list) {
        this.items = list;
    }

    public String toString() {
        return "ATWatchFace{index=" + this.index + ", items=" + this.items + '}';
    }

    public ATWatchFace(byte[] bArr) {
        this.index = 1;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 10;
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.index = a.a(byteBufferOrder.get());
            a.a(byteBufferOrder.get());
            int i = byteBufferOrder.getInt();
            this.items = new ArrayList();
            for (ATDisplayItem aTDisplayItem : ATDisplayItem.values()) {
                if ((aTDisplayItem.getValue() & i) == aTDisplayItem.getValue()) {
                    this.items.add(aTDisplayItem);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
