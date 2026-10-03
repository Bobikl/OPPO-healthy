package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDataQueryRequest;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATConfigQuerySetting extends LSDataQueryRequest {
    private ATConfigQueryCmd item;
    private LSDeviceSyncSetting itemSetting;

    public ATConfigQuerySetting(ATConfigQueryCmd aTConfigQueryCmd) {
        this.item = aTConfigQueryCmd;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ATConfigQueryCmd aTConfigQueryCmd = this.item;
        if (aTConfigQueryCmd == null) {
            return null;
        }
        if (aTConfigQueryCmd == ATConfigQueryCmd.Flash) {
            LSDeviceSyncSetting lSDeviceSyncSetting = this.itemSetting;
            if (lSDeviceSyncSetting == null || lSDeviceSyncSetting.encodeCmdBytes() == null) {
                return null;
            }
            byte[] bArrEncodeCmdBytes = this.itemSetting.encodeCmdBytes();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) this.item.getValue());
            byteBufferOrder.put(bArrEncodeCmdBytes);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        }
        if (aTConfigQueryCmd == ATConfigQueryCmd.NightMode || aTConfigQueryCmd == ATConfigQueryCmd.DisturbMode || aTConfigQueryCmd == ATConfigQueryCmd.Stride) {
            int value = (aTConfigQueryCmd.getValue() & 65280) >> 8;
            int value2 = this.item.getValue() & 255;
            ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(10).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder2.put((byte) getCmd());
            byteBufferOrder2.put((byte) value);
            byteBufferOrder2.putInt(value2);
            byteBufferOrder2.putInt(0);
            return Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position());
        }
        if (aTConfigQueryCmd != ATConfigQueryCmd.Settings) {
            ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder3.put((byte) getCmd());
            byteBufferOrder3.put((byte) this.item.getValue());
            return Arrays.copyOf(byteBufferOrder3.array(), byteBufferOrder3.position());
        }
        ByteBuffer byteBufferOrder4 = ByteBuffer.allocate(10).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder4.put((byte) getCmd());
        byteBufferOrder4.put((byte) this.item.getValue());
        byteBufferOrder4.putInt(-1);
        byteBufferOrder4.putInt(0);
        return Arrays.copyOf(byteBufferOrder4.array(), byteBufferOrder4.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 102;
        return 102;
    }

    public ATConfigQueryCmd getItem() {
        return this.item;
    }

    public LSDeviceSyncSetting getItemSetting() {
        return this.itemSetting;
    }

    public void setItem(ATConfigQueryCmd aTConfigQueryCmd) {
        this.item = aTConfigQueryCmd;
    }

    public void setItemSetting(LSDeviceSyncSetting lSDeviceSyncSetting) {
        this.itemSetting = lSDeviceSyncSetting;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATConfigQuerySetting{item=" + this.item + ", itemSetting=" + this.itemSetting + '}';
    }
}
