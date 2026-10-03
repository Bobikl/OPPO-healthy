package com.heytap.accessory.connectivity.ble.bean;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public BluetoothDevice a;
    public BluetoothGattCharacteristic b = null;
    public BluetoothGattCharacteristic c = null;

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.b = bluetoothGattCharacteristic;
    }

    public BluetoothGattCharacteristic b() {
        return this.b;
    }

    public BluetoothGattCharacteristic c() {
        return this.c;
    }

    public BluetoothDevice a() {
        return this.a;
    }

    public void b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.c = bluetoothGattCharacteristic;
    }

    public void a(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }
}
