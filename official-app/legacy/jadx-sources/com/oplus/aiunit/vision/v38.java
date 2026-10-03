package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes5.dex */
public class v38 extends o38 {
    public final BluetoothGattCharacteristic a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xs2<Void> f17691c;

    public v38(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, xs2<Void> xs2Var) {
        this.a = bluetoothGattCharacteristic;
        this.b = bArr;
        this.f17691c = xs2Var;
    }

    @Override // com.oplus.aiunit.vision.o38
    public void a(BluetoothGatt bluetoothGatt) {
        wil.a("GattCommandWrite", "Writing " + this.b.length + " bytes ," + fe8.a(this.b) + " to " + this.a.getUuid());
        this.a.setValue(this.b);
        if (bluetoothGatt.writeCharacteristic(this.a)) {
            return;
        }
        wil.b("GattCommandWrite", "Failed to initiate write characteristic");
    }

    @Override // com.oplus.aiunit.vision.o38
    public void c(Throwable th) {
        wil.k("GattCommandWrite", "onWrite onError : " + th);
        xs2<Void> xs2Var = this.f17691c;
        if (xs2Var != null) {
            xs2Var.a(th, 205);
        }
    }

    @Override // com.oplus.aiunit.vision.o38
    public void f() {
        xs2<Void> xs2Var = this.f17691c;
        if (xs2Var != null) {
            xs2Var.onSuccess(null);
        }
    }
}
