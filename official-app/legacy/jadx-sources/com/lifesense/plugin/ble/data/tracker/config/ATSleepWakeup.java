package com.lifesense.plugin.ble.data.tracker.config;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATSleepWakeup extends ATConfigItem {
    private boolean enable;
    private int wakeupTime;

    public ATSleepWakeup() {
    }

    public ATSleepWakeup(boolean z, int i) {
        this.enable = z;
        this.wakeupTime = i;
        this.type = 12;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(5).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put((byte) 3);
        byteBufferOrder.put(this.enable ? (byte) 1 : (byte) 0);
        byteBufferOrder.putShort((short) this.wakeupTime);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getWakeupTime() {
        return this.wakeupTime;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setWakeupTime(int i) {
        this.wakeupTime = i;
    }

    public String toString() {
        return "ATSleepWakeup{enable=" + this.enable + ", wakeupTime=" + this.wakeupTime + '}';
    }
}
