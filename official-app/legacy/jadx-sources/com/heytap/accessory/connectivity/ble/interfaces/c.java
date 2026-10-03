package com.heytap.accessory.connectivity.ble.interfaces;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public interface c {
    void a(int i, int i2);

    void a(BluetoothGatt bluetoothGatt);

    void a(BluetoothGatt bluetoothGatt, int i, int i2);

    void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    void a(BluetoothGattDescriptor bluetoothGattDescriptor);

    void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    void b(byte[] bArr);

    void d();
}
