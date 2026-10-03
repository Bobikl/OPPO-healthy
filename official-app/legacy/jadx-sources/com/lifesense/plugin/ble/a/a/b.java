package com.lifesense.plugin.ble.a.a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.text.TextUtils;
import com.lifesense.plugin.ble.data.LSDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private String a;
    private BluetoothDevice b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothGattCallback f8664c;
    private LSDeviceInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8665e;

    public b(String str, BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        this.b = bluetoothDevice;
        this.f8664c = bluetoothGattCallback;
        this.a = str;
    }

    public void a(LSDeviceInfo lSDeviceInfo) {
        this.d = lSDeviceInfo;
    }

    public synchronized BluetoothDevice b() {
        return this.b;
    }

    public synchronized BluetoothGattCallback c() {
        return this.f8664c;
    }

    public synchronized String d() {
        return this.a;
    }

    public String toString() {
        return "IBGattConnect [macAddress=" + this.a + ", device=" + this.b + ", gattCallback=" + this.f8664c + ", mDevice=" + this.d + ", connectCount=" + this.f8665e + "]";
    }

    public boolean a() {
        BluetoothDevice bluetoothDevice = this.b;
        return bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress()) || this.f8664c == null;
    }
}
