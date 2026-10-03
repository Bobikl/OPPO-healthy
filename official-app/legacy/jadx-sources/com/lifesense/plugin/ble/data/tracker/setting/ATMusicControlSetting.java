package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATMusicControlSetting extends LSDeviceSyncSetting {
    private boolean enable;

    public ATMusicControlSetting(boolean z) {
        this.enable = z;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 34);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put(this.enable ? (byte) 1 : (byte) 0);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
        return Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATMusicControlSetting{enable=" + this.enable + ", cmd=" + this.cmd + '}';
    }
}
