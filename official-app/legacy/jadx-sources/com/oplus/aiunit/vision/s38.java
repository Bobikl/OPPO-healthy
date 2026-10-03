package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public class s38 extends o38 {
    public xs2<Void> a;
    public boolean b = false;

    public class a implements Runnable {
        public final /* synthetic */ BluetoothGatt i;

        public a(BluetoothGatt bluetoothGatt) {
            this.i = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s38.this.b) {
                return;
            }
            s38.this.i(this.i);
        }
    }

    public s38(xs2<Void> xs2Var) {
        this.a = xs2Var;
    }

    @Override // com.oplus.aiunit.vision.o38
    public void a(BluetoothGatt bluetoothGatt) {
        (Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler()).postDelayed(new a(bluetoothGatt), 1600L);
    }

    @Override // com.oplus.aiunit.vision.o38
    public void c(Throwable th) {
        this.a.a(th, 207);
        this.b = true;
    }

    @Override // com.oplus.aiunit.vision.o38
    public void e() {
        this.a.onSuccess(null);
    }

    public final void i(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null && bluetoothGatt.discoverServices()) {
            return;
        }
        wil.k("GattDiscoverServicesCommand", "Discover services did not successfully start! gatt = " + bluetoothGatt);
    }
}
