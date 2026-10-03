package com.lifesense.android.bluetooth.core.enums;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public enum DeviceGattServiceUUID {
    DEVICE_A6_SERVICE_UUID_BP(UUID.fromString("0000A610-0000-1000-8000-00805f9b34fb")),
    DEVICE_A6_SERVICE_UUID(UUID.fromString("0000A602-0000-1000-8000-00805f9b34fb")),
    DEVICE_DFU_SERVICE_UUID(UUID.fromString("00001530-1212-EFDE-1523-785FEABCD123")),
    DEVICE_INFO_SERVICE_UUID(UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb")),
    DEVICE_WIFI_BLE_UUID(UUID.fromString("0000AAAA-0000-1000-8000-00805F9B34FB")),
    PEDOMETER_SERVICE_UUID_A5(UUID.fromString("0000A500-0000-1000-8000-00805f9b34fb"));

    public UUID serviceUUID;

    DeviceGattServiceUUID(UUID uuid) {
        this.serviceUUID = uuid;
    }

    public static boolean isDeviceServiceUUID(UUID uuid) {
        if (uuid != null) {
            for (DeviceGattServiceUUID deviceGattServiceUUID : values()) {
                if (deviceGattServiceUUID.serviceUUID.equals(uuid)) {
                    return true;
                }
            }
        }
        return false;
    }

    public UUID getServiceUUID() {
        return this.serviceUUID;
    }
}
