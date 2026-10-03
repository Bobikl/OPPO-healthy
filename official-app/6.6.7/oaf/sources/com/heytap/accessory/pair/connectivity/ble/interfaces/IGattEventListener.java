package com.heytap.accessory.pair.connectivity.ble.interfaces;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IGattEventListener {
    void onCharacteristicChanged(byte[] bArr);

    void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    void onConnectionStateChanged(int i, int i2);

    void onDescriptorRead(BluetoothGattDescriptor bluetoothGattDescriptor);

    void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor);

    void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2);

    void onServicesDiscovered(BluetoothGatt bluetoothGatt);
}
