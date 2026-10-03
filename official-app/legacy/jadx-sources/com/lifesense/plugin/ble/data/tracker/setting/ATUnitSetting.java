package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATConfigItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class ATUnitSetting extends LSDeviceSyncSetting {
    private List items;

    public ATUnitSetting(List list) {
        this.items = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.items;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator it = this.items.iterator();
        int length = 0;
        while (it.hasNext()) {
            byte[] bArrEncodeCmdBytes = ((ATConfigItem) it.next()).encodeCmdBytes();
            if (bArrEncodeCmdBytes != null && bArrEncodeCmdBytes.length > 0) {
                length += bArrEncodeCmdBytes.length;
            }
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + 2).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
        byteBufferOrder.put((byte) this.items.size());
        Iterator it2 = this.items.iterator();
        while (it2.hasNext()) {
            byteBufferOrder.put(((ATConfigItem) it2.next()).encodeCmdBytes());
        }
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
        return Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
    }

    public List getItems() {
        return this.items;
    }

    public void setItems(List list) {
        this.items = list;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATUnitSetting{items=" + this.items + '}';
    }
}
