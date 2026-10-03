package com.lifesense.plugin.ble.data.other;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BleScanResults {
    private String address;
    private BluetoothDevice device;
    private String name;
    private int rssi;
    private byte[] scanRecord;

    public String getAddress() {
        return this.address;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public String getName() {
        return this.name;
    }

    public int getRssi() {
        return this.rssi;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setScanRecord(byte[] bArr) {
        this.scanRecord = bArr;
    }

    public String toString() {
        return "BleScanResults [device=" + this.device + ", name=" + this.name + ", address=" + this.address + ", scanRecord=" + Arrays.toString(this.scanRecord) + ", rssi=" + this.rssi + "]";
    }
}
