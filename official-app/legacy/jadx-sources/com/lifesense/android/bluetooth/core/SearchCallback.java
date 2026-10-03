package com.lifesense.android.bluetooth.core;

import android.bluetooth.BluetoothDevice;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SearchCallback {
    public void onSearchResults(LsDeviceInfo lsDeviceInfo) {
    }

    public void onSystemBindedDevice(BluetoothDevice bluetoothDevice) {
    }

    public void onSystemConnectedDevice(String str, String str2) {
    }
}
