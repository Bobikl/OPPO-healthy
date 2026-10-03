package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialStatusSetting extends LSDeviceSyncSetting {
    public static final int STATUS_CANCEL_SYNC = 2;
    public static final int STATUS_DOWNLOAD_DONE = 1;
    private int status;

    public ATDialStatusSetting(int i) {
        this.status = i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(10).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) this.status);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 250;
        return 250;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATDialStatusSetting{status=" + this.status + '}';
    }
}
