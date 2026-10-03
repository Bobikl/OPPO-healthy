package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateAlertSetting extends LSDeviceSyncSetting {
    private boolean enableAll;
    private boolean enableMaxAlert;
    private boolean enableMinAlert;
    private int maxHeartRate;
    private int minHeartRate;

    public ATHeartRateAlertSetting(int i, int i2) {
        this.minHeartRate = i;
        this.maxHeartRate = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        int i;
        byte[] bArr = new byte[8];
        bArr[0] = (byte) getCmd();
        bArr[5] = (byte) this.maxHeartRate;
        bArr[6] = (byte) this.minHeartRate;
        if (this.enableAll) {
            bArr[7] = 3;
        } else {
            boolean z = this.enableMaxAlert;
            if (this.enableMinAlert) {
                i = z;
                i = (z ? 1 : 0) | 2;
            }
            i = z;
            bArr[7] = (byte) i;
        }
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 168;
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

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATHeartRateAlertSetting{enableAll=" + this.enableAll + ", enableMinAlert=" + this.enableMinAlert + ", enableMaxAlert=" + this.enableMaxAlert + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + '}';
    }
}
