package com.lifesense.plugin.ble.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public class m {
    private int a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8669c;
    private BluetoothGatt d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8670e;
    private BluetoothGattCharacteristic f;
    private BluetoothGattDescriptor g;
    private o h;
    private t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8671j;
    private boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f8672l;

    public m(BluetoothGatt bluetoothGatt) {
        this.d = bluetoothGatt;
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return;
        }
        this.f8670e = bluetoothGatt.getDevice().getAddress();
    }

    public BluetoothGatt a() {
        return this.d;
    }

    public BluetoothGattCharacteristic b() {
        return this.f;
    }

    public o c() {
        return this.h;
    }

    public t d() {
        return this.i;
    }

    public String e() {
        return this.f8672l;
    }

    public boolean f() {
        return this.k;
    }

    public String g() {
        return "IBGattMessage [gatt=" + com.lifesense.plugin.ble.c.b.a(this.d) + ", service=" + com.lifesense.plugin.ble.c.b.a(i()) + ", characteristic=" + com.lifesense.plugin.ble.c.b.a(h()) + ", action=" + this.h + ", mtuValue=" + this.f8671j + ", dataPacket=" + this.i + "]";
    }

    public UUID h() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        return bluetoothGattCharacteristic.getUuid();
    }

    public UUID i() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f;
        if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
            return null;
        }
        return this.f.getService().getUuid();
    }

    public int j() {
        return this.f8671j;
    }

    public String toString() {
        return "IBGattMessage [status=" + this.a + ", newState=" + this.b + ", rssi=" + this.f8669c + ", gatt=" + this.d + ", macAddress=" + this.f8670e + ", service=" + com.lifesense.plugin.ble.c.b.a(i()) + ", characteristic=" + com.lifesense.plugin.ble.c.b.a(h()) + ", descriptor=" + this.g + ", action=" + this.h + ", dataPacket=" + this.i + "]";
    }

    public m(BluetoothGatt bluetoothGatt, t tVar) {
        this.d = bluetoothGatt;
        this.i = tVar;
        if (bluetoothGatt != null && bluetoothGatt.getDevice() != null) {
            this.f8670e = bluetoothGatt.getDevice().getAddress();
        }
        if (tVar == null || bluetoothGatt == null) {
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicA = s.a(bluetoothGatt.getServices(), tVar.d());
        this.f = bluetoothGattCharacteristicA;
        if (bluetoothGattCharacteristicA != null) {
            this.f.setWriteType(1 != tVar.b() ? 2 : 1);
        }
    }

    public void a(int i) {
        this.f8671j = i;
    }

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f = bluetoothGattCharacteristic;
    }

    public void a(o oVar) {
        this.h = oVar;
    }

    public void a(String str) {
        this.f8672l = str;
    }

    public void a(boolean z) {
        this.k = z;
    }
}
