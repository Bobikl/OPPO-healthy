package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialQuerySetting extends LSDeviceSyncSetting {
    private ATDialStyle index;

    public ATDialQuerySetting(ATDialStyle aTDialStyle) {
        this.index = aTDialStyle;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (this.index == null) {
            return null;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) this.index.getCommand());
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 248;
        return 248;
    }

    public ATDialStyle getIndex() {
        return this.index;
    }

    public void setIndex(ATDialStyle aTDialStyle) {
        this.index = aTDialStyle;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATDialQuerySetting{index=" + this.index + '}';
    }
}
