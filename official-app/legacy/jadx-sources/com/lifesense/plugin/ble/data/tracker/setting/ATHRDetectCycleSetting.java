package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATHRDetectCycleSetting extends LSDeviceSyncSetting {
    private int detectCycle;
    private boolean enable;

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(3).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) (this.enable ? 1 : 0));
            byteBufferOrder.put((byte) this.detectCycle);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 246;
        return 246;
    }

    public int getDetectCycle() {
        return this.detectCycle;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setDetectCycle(int i) {
        this.detectCycle = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATHRDetectCycleSetting{enable=" + this.enable + ", detectCycle=" + this.detectCycle + '}';
    }
}
