package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialSyncStatusData extends ATDeviceData {
    private ATDialSyncStatus status;

    public ATDialSyncStatusData(byte[] bArr) {
        super(bArr);
    }

    public ATDialSyncStatus getStatus() {
        return this.status;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.status = ATDialSyncStatus.getSyncStatus(toUnsignedInt(byteBufferOrder.get()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setStatus(ATDialSyncStatus aTDialSyncStatus) {
        this.status = aTDialSyncStatus;
    }

    public String toString() {
        return "ATDialSyncStatusData{status=" + this.status + '}';
    }
}
