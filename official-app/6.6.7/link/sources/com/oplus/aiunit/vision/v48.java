package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class v48 extends r48 {
    public lt2<Void> a;
    public boolean b = false;

    public class a implements Runnable {
        public final /* synthetic */ BluetoothGatt i;

        public a(BluetoothGatt bluetoothGatt) {
            this.i = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v48.this.b) {
                return;
            }
            v48.this.i(this.i);
        }
    }

    public v48(lt2<Void> lt2Var) {
        this.a = lt2Var;
    }

    @Override // com.oplus.aiunit.vision.r48
    public void a(BluetoothGatt bluetoothGatt) {
        (Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler()).postDelayed(new a(bluetoothGatt), 1600L);
    }

    @Override // com.oplus.aiunit.vision.r48
    public void c(Throwable th) {
        this.a.a(th, 207);
        this.b = true;
    }

    @Override // com.oplus.aiunit.vision.r48
    public void e() {
        this.a.onSuccess(null);
    }

    public final void i(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null && bluetoothGatt.discoverServices()) {
            return;
        }
        uml.k("GattDiscoverServicesCommand", "Discover services did not successfully start! gatt = " + bluetoothGatt);
    }
}
