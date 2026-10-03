package com.omron;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.MainThread;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public interface dz {
    void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j2);

    void onCycleEnd();
}
