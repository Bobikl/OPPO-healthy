package com.lifesense.android.bluetooth.core.bean;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class BleScanResults {
    public String address;
    public BluetoothDevice device;
    public String name;
    public int rssi;
    public byte[] scanRecord;

    public boolean canEqual(Object obj) {
        return obj instanceof BleScanResults;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BleScanResults)) {
            return false;
        }
        BleScanResults bleScanResults = (BleScanResults) obj;
        if (!bleScanResults.canEqual(this)) {
            return false;
        }
        BluetoothDevice device = getDevice();
        BluetoothDevice device2 = bleScanResults.getDevice();
        if (device != null ? !device.equals(device2) : device2 != null) {
            return false;
        }
        String name = getName();
        String name2 = bleScanResults.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String address = getAddress();
        String address2 = bleScanResults.getAddress();
        if (address != null ? address.equals(address2) : address2 == null) {
            return Arrays.equals(getScanRecord(), bleScanResults.getScanRecord()) && getRssi() == bleScanResults.getRssi();
        }
        return false;
    }

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

    public int hashCode() {
        BluetoothDevice device = getDevice();
        int iHashCode = device == null ? 43 : device.hashCode();
        String name = getName();
        int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
        String address = getAddress();
        return (((((iHashCode2 * 59) + (address != null ? address.hashCode() : 43)) * 59) + Arrays.hashCode(getScanRecord())) * 59) + getRssi();
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
        return "BleScanResults(device=" + getDevice() + ", name=" + getName() + ", address=" + getAddress() + ", scanRecord=" + Arrays.toString(getScanRecord()) + ", rssi=" + getRssi() + ")";
    }
}
