package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATControlData extends ATDeviceData {
    private ATControlCmd controlCmd;
    private int volume;

    public ATControlData(byte[] bArr) {
        super(bArr);
    }

    public ATControlCmd getControlCmd() {
        return this.controlCmd;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        ATControlCmd controlCmd;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            if ((unsignedInt & 128) == 128) {
                this.volume = unsignedInt & 127;
                controlCmd = ATControlCmd.Volume;
            } else {
                this.volume = 0;
                controlCmd = ATControlCmd.getControlCmd(unsignedInt);
            }
            this.controlCmd = controlCmd;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setControlCmd(ATControlCmd aTControlCmd) {
        this.controlCmd = aTControlCmd;
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public String toString() {
        return "ATControlData{，controlCmd=" + this.controlCmd + ", volume=" + this.volume + '}';
    }
}
