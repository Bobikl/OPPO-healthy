package com.heytap.accessory.pair.connectivity.ble.bean;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.util.ArrayMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class FPBleDeviceInfo {
    private Map<String, BluetoothGattCharacteristic> mCharacteristicMap = new ArrayMap();
    private BluetoothDevice mDevice;

    public void addCharac(UUID uuid, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.mCharacteristicMap.put(uuid.toString(), bluetoothGattCharacteristic);
    }

    public void clear() {
        this.mCharacteristicMap.clear();
    }

    public BluetoothDevice getBLEDevice() {
        return this.mDevice;
    }

    public BluetoothGattCharacteristic getCharac(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        return this.mCharacteristicMap.get(uuid.toString());
    }

    public void setBLEDevice(BluetoothDevice bluetoothDevice) {
        this.mDevice = bluetoothDevice;
    }
}
