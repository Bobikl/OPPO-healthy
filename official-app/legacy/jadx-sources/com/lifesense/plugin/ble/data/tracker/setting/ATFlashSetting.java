package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATFlashData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATFlashSetting extends LSDeviceSyncSetting {
    private ATFlashData flash;

    public ATFlashSetting(ATFlashData aTFlashData) {
        this.flash = aTFlashData;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ATFlashData aTFlashData = this.flash;
        if (aTFlashData == null || aTFlashData.getStartAddress() <= 0 || this.flash.getEndAddress() <= 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(9).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.flash.getType());
        byteBufferOrder.putInt(this.flash.getStartAddress());
        byteBufferOrder.putInt(this.flash.getEndAddress());
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public ATFlashData getFlash() {
        return this.flash;
    }

    public void setFlash(ATFlashData aTFlashData) {
        this.flash = aTFlashData;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATFlashSetting{flash=" + this.flash + '}';
    }

    public ATFlashSetting(byte[] bArr) {
        this.flash = new ATFlashData(bArr);
    }
}
