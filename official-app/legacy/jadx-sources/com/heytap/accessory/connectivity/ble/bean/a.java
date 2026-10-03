package com.heytap.accessory.connectivity.ble.bean;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public BluetoothDevice a;
    public BluetoothGattCharacteristic b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothGattCharacteristic f2477c = null;

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.b = bluetoothGattCharacteristic;
    }

    public BluetoothGattCharacteristic b() {
        return this.b;
    }

    public BluetoothGattCharacteristic c() {
        return this.f2477c;
    }

    public BluetoothDevice a() {
        return this.a;
    }

    public void b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f2477c = bluetoothGattCharacteristic;
    }

    public void a(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }
}
