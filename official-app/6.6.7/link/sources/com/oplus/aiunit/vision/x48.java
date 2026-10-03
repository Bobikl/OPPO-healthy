package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class x48 extends r48 {
    public static final UUID f = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public final BluetoothGattCharacteristic a;
    public final boolean b;
    public final lt2<Void> c;
    public final Handler d;
    public final boolean e;

    public class a implements Runnable {
        public final /* synthetic */ BluetoothGatt i;

        public a(BluetoothGatt bluetoothGatt) {
            this.i = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothGattDescriptor descriptor = x48.this.a.getDescriptor(x48.f);
            if (descriptor == null) {
                x48.this.c(new RuntimeException("Failed to set notification. Didn't find GATT descriptor!"));
                return;
            }
            if (x48.this.e) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else {
                descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
            if (this.i.writeDescriptor(descriptor)) {
                return;
            }
            uml.b("GattSetNotificationCommand", "Failed to write to descriptor");
        }
    }

    public x48(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, lt2<Void> lt2Var) {
        this.a = bluetoothGattCharacteristic;
        this.b = z;
        this.e = z2;
        this.c = lt2Var;
        if (Looper.myLooper() == null) {
            this.d = new Handler(Looper.getMainLooper());
        } else {
            this.d = new Handler();
        }
    }

    @Override // com.oplus.aiunit.vision.r48
    public void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt.setCharacteristicNotification(this.a, this.b)) {
            this.d.postDelayed(new a(bluetoothGatt), 1000L);
        } else {
            c(new RuntimeException("Failed to initiate set characteristic notification"));
        }
    }

    @Override // com.oplus.aiunit.vision.r48
    public void b() {
        lt2<Void> lt2Var = this.c;
        if (lt2Var != null) {
            lt2Var.onSuccess(null);
        }
    }

    @Override // com.oplus.aiunit.vision.r48
    public void c(Throwable th) {
        uml.a("GattSetNotificationCommand", th.getMessage());
        lt2<Void> lt2Var = this.c;
        if (lt2Var != null) {
            lt2Var.a(th, 204);
        }
    }
}
