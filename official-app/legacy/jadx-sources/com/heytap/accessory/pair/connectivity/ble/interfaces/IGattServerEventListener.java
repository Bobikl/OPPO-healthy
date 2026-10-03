package com.heytap.accessory.pair.connectivity.ble.interfaces;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;

/* JADX INFO: loaded from: classes14.dex */
public interface IGattServerEventListener {
    void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr);

    void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z, int i2, byte[] bArr);

    void onConnectionStateChanged(BluetoothDevice bluetoothDevice, int i);

    void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr);

    void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z, int i2, byte[] bArr);

    void onMtuChanged(int i);

    void onNotificationSent(BluetoothDevice bluetoothDevice, int i);

    void onServiceAdded(int i, BluetoothGattService bluetoothGattService);
}
