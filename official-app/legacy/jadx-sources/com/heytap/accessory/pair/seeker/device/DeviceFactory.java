package com.heytap.accessory.pair.seeker.device;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceFactory {
    public static BaseDevice createDevice(@NonNull BluetoothDevice bluetoothDevice, @NonNull int i) {
        return new ModelIdDevice(bluetoothDevice, i);
    }
}
