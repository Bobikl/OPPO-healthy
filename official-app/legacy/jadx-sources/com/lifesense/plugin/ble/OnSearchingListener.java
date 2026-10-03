package com.lifesense.plugin.ble;

import android.bluetooth.BluetoothDevice;
import com.lifesense.plugin.ble.data.LSDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OnSearchingListener {
    public void onSearchResults(LSDeviceInfo lSDeviceInfo) {
    }

    public void onSystemBondDevice(BluetoothDevice bluetoothDevice) {
    }

    public void onSystemConnectedDevice(String str, String str2) {
    }
}
