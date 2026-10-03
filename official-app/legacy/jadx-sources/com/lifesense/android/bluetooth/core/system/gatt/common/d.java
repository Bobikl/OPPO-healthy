package com.lifesense.android.bluetooth.core.system.gatt.common;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public String a;
    public BluetoothDevice b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothGattCallback f8640c;
    public LsDeviceInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8641e;

    public d(String str, BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        this.b = bluetoothDevice;
        this.f8640c = bluetoothGattCallback;
        this.a = str;
    }

    public synchronized BluetoothDevice a() {
        return this.b;
    }

    public synchronized BluetoothGattCallback b() {
        return this.f8640c;
    }

    public LsDeviceInfo c() {
        return this.d;
    }

    public synchronized String d() {
        return this.a;
    }

    public boolean e() {
        BluetoothDevice bluetoothDevice = this.b;
        return bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress()) || this.f8640c == null;
    }

    public String toString() {
        return "DeviceConnectInfo [macAddress=" + this.a + ", device=" + this.b + ", gattCallback=" + this.f8640c + ", mDevice=" + this.d + ", connectCount=" + this.f8641e + "]";
    }

    public void a(LsDeviceInfo lsDeviceInfo) {
        this.d = lsDeviceInfo;
    }
}
