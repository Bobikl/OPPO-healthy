package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATPairConfirmRequest extends ATDeviceData {
    private int cmd;
    private int cmdVersion;
    private int status;

    public ATPairConfirmRequest(byte[] bArr) {
        super(bArr);
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public int getCmd() {
        return this.cmd;
    }

    public int getCmdVersion() {
        return this.cmdVersion;
    }

    public int getStatus() {
        return this.status;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = a.a(byteBufferOrder.get());
            this.status = a.a(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATDeviceData
    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setCmdVersion(int i) {
        this.cmdVersion = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "ATPairConfirmRequest{cmdVersion=" + this.cmdVersion + ", cmd=" + this.cmd + ", status=" + this.status + '}';
    }
}
