package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;

/* JADX INFO: loaded from: classes5.dex */
public class ATBatteryInfo {
    public static final int BATTERY_STATE_CHARGING = 1;
    public static final int BATTERY_STATE_NON = -1;
    public static final int BATTERY_STATE_NORMAL = 0;
    private int battery;
    private int flag;
    private byte[] srcData;
    private float voltage;

    public ATBatteryInfo(byte[] bArr) {
        float fG;
        this.srcData = bArr;
        this.flag = -1;
        this.voltage = -1.0f;
        this.battery = 0;
        if (bArr == null || bArr.length <= 6) {
            return;
        }
        int i = bArr[6] & 255;
        this.flag = i;
        if ((i & 2) == 2) {
            this.battery = a.a(bArr[7]);
            fG = 0.0f;
        } else {
            fG = a.g(new byte[]{bArr[7], bArr[8]}) / 1000.0f;
        }
        this.voltage = fG;
    }

    public int getBattery() {
        return this.battery;
    }

    public int getFlag() {
        return this.flag;
    }

    public byte[] getSrcData() {
        return this.srcData;
    }

    public float getVoltage() {
        return this.voltage;
    }

    public void setBattery(int i) {
        this.battery = i;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setSrcData(byte[] bArr) {
        this.srcData = bArr;
    }

    public void setVoltage(float f) {
        this.voltage = f;
    }

    public String toString() {
        return "ATBatteryInfo{srcData=" + a.d(this.srcData) + ", flag=" + this.flag + ", voltage=" + this.voltage + ", battery=" + this.battery + '}';
    }

    public static String toString(int i) {
        if (i == -1) {
            return "BATTERY_STATE_NON";
        }
        if (i != 0) {
            return i != 1 ? "" : "BATTERY_STATE_CHARGING";
        }
        return "BATTERY_STATE_NORMAL";
    }
}
