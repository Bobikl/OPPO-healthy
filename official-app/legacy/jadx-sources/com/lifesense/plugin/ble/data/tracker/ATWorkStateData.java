package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATWorkStateData extends ATDeviceData {
    private List items;
    private int state;
    private int type;

    public ATWorkStateData(byte[] bArr) {
        super(bArr);
    }

    public byte[] formatRespPacket(boolean z) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.cmd);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put((byte) this.state);
        byteBufferOrder.put(z ? (byte) 1 : (byte) 0);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public List getItems() {
        return this.items;
    }

    public int getState() {
        return this.state;
    }

    public int getType() {
        return this.type;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.type = toUnsignedInt(byteBufferOrder.get());
            this.state = toUnsignedInt(byteBufferOrder.get());
            if (toUnsignedInt(byteBufferOrder.get()) > 0) {
                this.items = new ArrayList();
                do {
                    ATWorkingItem aTWorkingItem = new ATWorkingItem();
                    aTWorkingItem.setAction(toUnsignedInt(byteBufferOrder.get()));
                    aTWorkingItem.setUtc(byteBufferOrder.get());
                    aTWorkingItem.setFlag(toUnsignedInt(byteBufferOrder.get()));
                    this.items.add(aTWorkingItem);
                } while (this.srcData.length - byteBufferOrder.position() >= 6);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ATWorkStateData{type=" + this.type + ", state=" + this.state + ", items=" + this.items + '}';
    }
}
