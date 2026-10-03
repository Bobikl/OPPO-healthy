package com.lifesense.plugin.ble.data.other;

import android.bluetooth.BluetoothDevice;
import com.lifesense.plugin.ble.data.LSDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class MultiProtocolDevice {
    private BluetoothDevice bleDevice;
    private LSDeviceInfo lsDevcie;

    public synchronized BluetoothDevice getBleDevice() {
        return this.bleDevice;
    }

    public synchronized LSDeviceInfo getLsDevcie() {
        return this.lsDevcie;
    }

    public synchronized void setBleDevice(BluetoothDevice bluetoothDevice) {
        this.bleDevice = bluetoothDevice;
    }

    public synchronized void setLsDevcie(LSDeviceInfo lSDeviceInfo) {
        this.lsDevcie = lSDeviceInfo;
    }
}
