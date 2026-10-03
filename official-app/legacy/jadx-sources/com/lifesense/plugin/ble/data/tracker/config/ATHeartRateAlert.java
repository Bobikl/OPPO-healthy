package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateAlert extends ATConfigItem {
    private boolean enableAll;
    private boolean enableMaxAlert;
    private boolean enableMinAlert;
    private int maxHeartRate;
    private int minHeartRate;

    public ATHeartRateAlert(byte[] bArr) {
        this.type = 21;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            int iA = a.a(byteBufferOrder.get());
            if ((iA & 3) != 3) {
                if ((iA & 1) == 1) {
                    this.enableAll = false;
                    this.enableMaxAlert = true;
                    this.enableMinAlert = false;
                } else if ((iA & 2) == 2) {
                    this.enableAll = false;
                    this.enableMaxAlert = false;
                }
                this.maxHeartRate = a.a(byteBufferOrder.get());
                this.minHeartRate = a.a(byteBufferOrder.get());
            }
            this.enableAll = true;
            this.enableMaxAlert = true;
            this.enableMinAlert = true;
            this.maxHeartRate = a.a(byteBufferOrder.get());
            this.minHeartRate = a.a(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return null;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public boolean isEnableAll() {
        return this.enableAll;
    }

    public boolean isEnableMaxAlert() {
        return this.enableMaxAlert;
    }

    public boolean isEnableMinAlert() {
        return this.enableMinAlert;
    }

    public void setEnableAll(boolean z) {
        this.enableAll = z;
    }

    public void setEnableMaxAlert(boolean z) {
        this.enableMaxAlert = z;
    }

    public void setEnableMinAlert(boolean z) {
        this.enableMinAlert = z;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public String toString() {
        return "ATHeartRateAlert{enableAll=" + this.enableAll + ", enableMinAlert=" + this.enableMinAlert + ", enableMaxAlert=" + this.enableMaxAlert + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + '}';
    }
}
