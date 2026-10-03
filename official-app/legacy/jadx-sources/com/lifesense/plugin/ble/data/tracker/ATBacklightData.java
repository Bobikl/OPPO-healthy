package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATBacklightData extends ATDeviceData {
    private int daytimeBrightness;
    private boolean enable;
    private String endTime;
    private int nightBrightness;
    private String startTime;

    public ATBacklightData() {
        super(null);
    }

    public int getDaytimeBrightness() {
        return this.daytimeBrightness;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getNightBrightness() {
        return this.nightBrightness;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isEnable() {
        return this.enable;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.daytimeBrightness = toUnsignedInt(byteBufferOrder.get());
            this.nightBrightness = toUnsignedInt(byteBufferOrder.get());
            boolean z = true;
            if (toUnsignedInt(byteBufferOrder.get()) != 1) {
                z = false;
            }
            this.enable = z;
            this.startTime = toUnsignedInt(byteBufferOrder.get()) + ":" + toUnsignedInt(byteBufferOrder.get());
            this.endTime = toUnsignedInt(byteBufferOrder.get()) + ":" + toUnsignedInt(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDaytimeBrightness(int i) {
        this.daytimeBrightness = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setNightBrightness(int i) {
        this.nightBrightness = i;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String toString() {
        return "ATBacklightData{daytimeBrightness=" + this.daytimeBrightness + ", nightBrightness=" + this.nightBrightness + ", enable=" + this.enable + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "'}";
    }

    public ATBacklightData(byte[] bArr) {
        super(bArr);
    }
}
