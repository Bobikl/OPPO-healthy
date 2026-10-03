package com.omron.lib;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class BleScanDevice {
    private final String address;
    private final BluetoothDevice bleDevice;
    private String deviceType;
    private final String name;
    private String userIndex;

    public BleScanDevice(BluetoothDevice bluetoothDevice, String str, String str2) {
        this.bleDevice = bluetoothDevice;
        this.name = str;
        this.address = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleScanDevice) {
            return this.address.equals(((BleScanDevice) obj).address);
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public BluetoothDevice getBleDevice() {
        return this.bleDevice;
    }

    public int getDeviceCategory() {
        return OMRONLib.getInstance().a(this);
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getName() {
        return this.name;
    }

    public String getUserIndex() {
        return this.userIndex;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        return Objects.hash(this.address);
    }

    public void setUserIndex(String str) {
        this.userIndex = str;
    }

    public BleScanDevice(String str, BluetoothDevice bluetoothDevice, String str2, String str3) {
        this.deviceType = str;
        this.bleDevice = bluetoothDevice;
        this.name = str2;
        this.address = str3;
    }

    public BleScanDevice(String str, String str2, String str3) {
        this.deviceType = str;
        this.name = str2;
        this.address = str3;
        this.bleDevice = null;
    }
}
