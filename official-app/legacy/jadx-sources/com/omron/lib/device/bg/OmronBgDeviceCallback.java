package com.omron.lib.device.bg;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.NonNull;
import com.omron.lib.BleScanDevice;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBgDeviceCallback {
    void bindBgDevice(@NonNull String str, @NonNull BluetoothDevice bluetoothDevice, @NonNull OmronBgBleCallBack omronBgBleCallBack);

    void getBgDeviceData(@NonNull String str, @NonNull BluetoothDevice bluetoothDevice, @NonNull OmronBgBleCallBack omronBgBleCallBack);

    void startBgMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBgBleCallBack omronBgBleCallBack);

    void stopBgConnect();

    void stopBgMonitoring();
}
