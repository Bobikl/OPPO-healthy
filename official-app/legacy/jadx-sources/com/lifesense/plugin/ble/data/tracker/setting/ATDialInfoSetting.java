package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.tracker.ATDialInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialInfoSetting extends ATFileSetting {
    private ATDialInfo info;

    public ATDialInfoSetting(ATDialInfo aTDialInfo) {
        this.info = aTDialInfo;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.setting.ATFileSetting, com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ATDialInfo aTDialInfo = this.info;
        if (aTDialInfo != null && aTDialInfo.getId() != null) {
            byte[] bArrA = a.a(this.info.getId());
            byte[] bArrA2 = a.a(this.info.getName());
            byte[] bArrA3 = a.a(this.info.getBackgroundName());
            int length = 7;
            if (bArrA != null && bArrA.length > 0) {
                length = 7 + bArrA.length;
            }
            if (bArrA2 != null && bArrA2.length > 0) {
                length += bArrA2.length;
            }
            if (bArrA3 != null && bArrA3.length > 0) {
                length += bArrA3.length;
            }
            try {
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(length).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.put((byte) getCmd());
                byteBufferOrder.put((byte) this.info.getIndex());
                byteBufferOrder.put((byte) bArrA.length);
                byteBufferOrder.put(bArrA);
                byteBufferOrder.put((byte) this.info.getType());
                byteBufferOrder.put((byte) bArrA2.length);
                byteBufferOrder.put(bArrA2);
                byteBufferOrder.put((byte) bArrA3.length);
                byteBufferOrder.put(bArrA3);
                byteBufferOrder.put((byte) this.info.getStyleId());
                return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.setting.ATFileSetting, com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 249;
        return 249;
    }

    public ATDialInfo getInfo() {
        return this.info;
    }

    public void setInfo(ATDialInfo aTDialInfo) {
        this.info = aTDialInfo;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.setting.ATFileSetting, com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATDialInfoSetting{info=" + this.info + ", file=" + this.file + '}';
    }
}
