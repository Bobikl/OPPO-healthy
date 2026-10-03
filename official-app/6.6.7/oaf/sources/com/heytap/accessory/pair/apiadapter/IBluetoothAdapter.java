package com.heytap.accessory.pair.apiadapter;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IBluetoothAdapter {
    boolean cancelBondProcess(BluetoothDevice bluetoothDevice);

    String getAddress(Context context);

    boolean removeBond(BluetoothDevice bluetoothDevice);

    boolean setPairingConfirmation(BluetoothDevice bluetoothDevice, boolean z);
}
