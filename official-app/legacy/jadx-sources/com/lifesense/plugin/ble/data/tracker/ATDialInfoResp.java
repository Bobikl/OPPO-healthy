package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialInfoResp extends ATDeviceData {
    private int respStatus;

    public ATDialInfoResp(byte[] bArr) {
        super(bArr);
    }

    public int getRespStatus() {
        return this.respStatus;
    }

    public boolean isRespSuccess() {
        return this.respStatus == 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.respStatus = toUnsignedInt(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setRespStatus(int i) {
        this.respStatus = i;
    }

    public String toString() {
        return "ATDialInfoResp{respStatus=" + this.respStatus + '}';
    }
}
