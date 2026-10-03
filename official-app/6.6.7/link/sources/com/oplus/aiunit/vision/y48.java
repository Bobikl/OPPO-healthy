package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class y48 extends r48 {
    public final BluetoothGattCharacteristic a;
    public final byte[] b;
    public final lt2<Void> c;

    public y48(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, lt2<Void> lt2Var) {
        this.a = bluetoothGattCharacteristic;
        this.b = bArr;
        this.c = lt2Var;
    }

    @Override // com.oplus.aiunit.vision.r48
    public void a(BluetoothGatt bluetoothGatt) {
        uml.a("GattCommandWrite", "Writing " + this.b.length + " bytes ," + if8.a(this.b) + " to " + this.a.getUuid());
        this.a.setValue(this.b);
        if (bluetoothGatt.writeCharacteristic(this.a)) {
            return;
        }
        uml.b("GattCommandWrite", "Failed to initiate write characteristic");
    }

    @Override // com.oplus.aiunit.vision.r48
    public void c(Throwable th) {
        uml.k("GattCommandWrite", "onWrite onError : " + th);
        lt2<Void> lt2Var = this.c;
        if (lt2Var != null) {
            lt2Var.a(th, 205);
        }
    }

    @Override // com.oplus.aiunit.vision.r48
    public void f() {
        lt2<Void> lt2Var = this.c;
        if (lt2Var != null) {
            lt2Var.onSuccess(null);
        }
    }
}
