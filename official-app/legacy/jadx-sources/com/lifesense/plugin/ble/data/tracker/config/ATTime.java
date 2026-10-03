package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.b;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATTime extends ATConfigItem {
    private int timeZone;
    private int utc;

    public ATTime(int i, int i2) {
        this.utc = i;
        this.timeZone = i2;
        this.type = 11;
    }

    public static int getCurrentTimeZone() {
        try {
            return Integer.parseInt(f.c(b.d()), 16);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (this.timeZone < 0) {
            this.timeZone = getCurrentTimeZone();
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put((byte) 5);
        byteBufferOrder.putInt(this.utc);
        byteBufferOrder.put((byte) this.timeZone);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getTimeZone() {
        return this.timeZone;
    }

    public int getUtc() {
        return this.utc;
    }

    public void setTimeZone(int i) {
        this.timeZone = i;
    }

    public void setUtc(int i) {
        this.utc = i;
    }

    public String toString() {
        return "ATTime{utc=" + this.utc + ", timeZone=" + this.timeZone + '}';
    }
}
