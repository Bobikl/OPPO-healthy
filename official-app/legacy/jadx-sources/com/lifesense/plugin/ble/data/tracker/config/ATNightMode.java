package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATNightMode extends ATConfigItem {
    private boolean autoState;
    private boolean enable;
    private String endTime;
    private String startTime;

    public ATNightMode(boolean z, String str, String str2) {
        this.autoState = z;
        this.startTime = str;
        this.endTime = str2;
        this.type = 19;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put((byte) 5);
        boolean z = this.enable;
        int i = z;
        if (this.autoState) {
            i = (z ? 1 : 0) | 2;
        }
        byteBufferOrder.put((byte) i);
        int iA = f.a(this.startTime);
        int iB = f.b(this.startTime);
        byteBufferOrder.put((byte) iA);
        byteBufferOrder.put((byte) iB);
        int iA2 = f.a(this.endTime);
        int iB2 = f.b(this.endTime);
        byteBufferOrder.put((byte) iA2);
        byteBufferOrder.put((byte) iB2);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isAutoState() {
        return this.autoState;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setAutoState(boolean z) {
        this.autoState = z;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String toString() {
        return "ATNightMode{enable=" + this.enable + ", autoState=" + this.autoState + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "'}";
    }

    public ATNightMode(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 19;
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            int iA = a.a(byteBufferOrder.get());
            this.enable = (iA & 1) == 1;
            this.autoState = (iA & 2) == 2;
            this.startTime = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
            this.endTime = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
