package com.lifesense.android.bluetooth.core.system.gatt.common;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.lifesense.android.bluetooth.core.bean.constant.CharacteristicStatus;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class b {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8637c;
    public BluetoothGatt d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8638e;
    public BluetoothGattCharacteristic f;
    public BluetoothGattDescriptor g;
    public CharacteristicStatus h;
    public com.lifesense.android.bluetooth.core.protocol.frame.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8639j = true;
    public String k;

    public b(BluetoothGatt bluetoothGatt) {
        this.d = bluetoothGatt;
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return;
        }
        this.f8638e = bluetoothGatt.getDevice().getAddress();
    }

    public CharacteristicStatus a() {
        return this.h;
    }

    public BluetoothGattCharacteristic b() {
        return this.f;
    }

    public UUID c() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f;
        if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
            return null;
        }
        return this.f.getService().getUuid();
    }

    public UUID d() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        return bluetoothGattCharacteristic.getUuid();
    }

    public com.lifesense.android.bluetooth.core.protocol.frame.b e() {
        return this.i;
    }

    public BluetoothGatt f() {
        return this.d;
    }

    public String g() {
        return this.k;
    }

    public boolean h() {
        return this.f8639j;
    }

    public String i() {
        return "BluetoothGattMessage [service=" + com.lifesense.android.bluetooth.core.tools.a.a(c()) + ", characteristic=" + com.lifesense.android.bluetooth.core.tools.a.a(d()) + ", action=" + this.h + ", dataPacket=" + this.i + "]";
    }

    public String toString() {
        try {
            return "BluetoothGattMessage [status=" + this.a + ", newState=" + this.b + ", rssi=" + this.f8637c + ", gatt=" + this.d + ", macAddress=" + this.f8638e + ", service=" + com.lifesense.android.bluetooth.core.tools.a.a(c()) + ", characteristic=" + com.lifesense.android.bluetooth.core.tools.a.a(d()) + ", descriptor=" + this.g + ", action=" + this.h + ", dataPacket=" + this.i + "]";
        } catch (Exception unused) {
            return "error";
        }
    }

    public b(BluetoothGatt bluetoothGatt, com.lifesense.android.bluetooth.core.protocol.frame.b bVar) {
        this.d = bluetoothGatt;
        this.i = bVar;
        if (bluetoothGatt != null && bluetoothGatt.getDevice() != null) {
            this.f8638e = bluetoothGatt.getDevice().getAddress();
        }
        if (bVar == null || bluetoothGatt == null) {
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicA = c.a(bluetoothGatt.getServices(), bVar.d());
        this.f = bluetoothGattCharacteristicA;
        if (bluetoothGattCharacteristicA != null) {
            this.f.setWriteType(1 != bVar.e() ? 2 : 1);
        }
    }

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f = bluetoothGattCharacteristic;
    }

    public void a(CharacteristicStatus characteristicStatus) {
        this.h = characteristicStatus;
    }

    public void a(String str) {
        this.k = str;
    }

    public void a(boolean z) {
        this.f8639j = z;
    }
}
