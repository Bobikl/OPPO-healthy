package com.lifesense.android.bluetooth.core.system.broadcast;

import android.bluetooth.BluetoothDevice;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    void a(int i);

    void a(BluetoothDevice bluetoothDevice, DeviceConnectState deviceConnectState);
}
