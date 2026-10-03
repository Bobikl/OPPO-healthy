package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATHeartRateItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateSetting extends LSDeviceSyncSetting {
    private List items;
    private boolean stateOfAll;

    public ATHeartRateSetting(boolean z, List list) {
        this.stateOfAll = z;
        this.items = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (!this.stateOfAll) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(3).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) this.cmd);
            byteBufferOrder.put(this.stateOfAll ? (byte) 1 : (byte) 0);
            byteBufferOrder.put((byte) 0);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        }
        List list = this.items;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate((this.items.size() * 6) + 3).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder2.put((byte) this.cmd);
        byteBufferOrder2.put(this.stateOfAll ? (byte) 1 : (byte) 0);
        byteBufferOrder2.put((byte) this.items.size());
        Iterator it = this.items.iterator();
        while (it.hasNext()) {
            byteBufferOrder2.put(((ATHeartRateItem) it.next()).toBytes());
        }
        return Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 48;
        return 48;
    }

    public List getItems() {
        return this.items;
    }

    public boolean isStateOfAll() {
        return this.stateOfAll;
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setStateOfAll(boolean z) {
        this.stateOfAll = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATHeartRateSetting{stateOfAll=" + this.stateOfAll + ", items=" + this.items + '}';
    }
}
