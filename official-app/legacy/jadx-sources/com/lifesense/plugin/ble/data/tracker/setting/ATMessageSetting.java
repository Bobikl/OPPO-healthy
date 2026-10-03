package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATMessageItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATMessageSetting extends LSDeviceSyncSetting {
    private List items;

    public ATMessageSetting() {
    }

    public ATMessageSetting(List list) {
        this.items = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.items;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.items.size() * 2).order(ByteOrder.BIG_ENDIAN);
        Iterator it = this.items.iterator();
        while (it.hasNext()) {
            byte[] bArrEncodeCmdBytes = ((ATMessageItem) it.next()).encodeCmdBytes();
            if (bArrEncodeCmdBytes != null && bArrEncodeCmdBytes.length > 0) {
                byte[] bArr = new byte[2];
                System.arraycopy(bArrEncodeCmdBytes, 2, bArr, 0, 2);
                byteBufferOrder.put(bArr);
            }
        }
        byte[] bArrCopyOf = Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(bArrCopyOf.length + 4).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder2.put((byte) getCmd());
        byteBufferOrder2.put((byte) 1);
        byteBufferOrder2.put((byte) 33);
        byteBufferOrder2.put((byte) bArrCopyOf.length);
        byteBufferOrder2.put(bArrCopyOf);
        return Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position());
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
        return "ATMessageSetting{items=" + this.items + '}';
    }
}
