package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATTakePicturesSetting extends LSDeviceSyncSetting {
    private boolean enable;
    private int reserve;
    private int statusOfRefresh;

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(7).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) (this.enable ? 1 : 0));
            byteBufferOrder.put((byte) this.statusOfRefresh);
            byteBufferOrder.putInt((byte) this.reserve);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 178;
        return 178;
    }

    public int getReserve() {
        return this.reserve;
    }

    public int getStatusOfRefresh() {
        return this.statusOfRefresh;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setReserve(int i) {
        this.reserve = i;
    }

    public void setStatusOfRefresh(int i) {
        this.statusOfRefresh = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATTakePicturesSetting{enable=" + this.enable + ", statusOfRefresh=" + this.statusOfRefresh + ", reserve=" + this.reserve + '}';
    }
}
