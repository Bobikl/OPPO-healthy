package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class u38 extends o38 {
    public static final UUID f = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public final BluetoothGattCharacteristic a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xs2<Void> f17279c;
    public final Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17280e;

    public class a implements Runnable {
        public final /* synthetic */ BluetoothGatt i;

        public a(BluetoothGatt bluetoothGatt) {
            this.i = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothGattDescriptor descriptor = u38.this.a.getDescriptor(u38.f);
            if (descriptor == null) {
                u38.this.c(new RuntimeException("Failed to set notification. Didn't find GATT descriptor!"));
                return;
            }
            if (u38.this.f17280e) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else {
                descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
            if (this.i.writeDescriptor(descriptor)) {
                return;
            }
            wil.b("GattSetNotificationCommand", "Failed to write to descriptor");
        }
    }

    public u38(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, xs2<Void> xs2Var) {
        this.a = bluetoothGattCharacteristic;
        this.b = z;
        this.f17280e = z2;
        this.f17279c = xs2Var;
        if (Looper.myLooper() == null) {
            this.d = new Handler(Looper.getMainLooper());
        } else {
            this.d = new Handler();
        }
    }

    @Override // com.oplus.aiunit.vision.o38
    public void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt.setCharacteristicNotification(this.a, this.b)) {
            this.d.postDelayed(new a(bluetoothGatt), 1000L);
        } else {
            c(new RuntimeException("Failed to initiate set characteristic notification"));
        }
    }

    @Override // com.oplus.aiunit.vision.o38
    public void b() {
        xs2<Void> xs2Var = this.f17279c;
        if (xs2Var != null) {
            xs2Var.onSuccess(null);
        }
    }

    @Override // com.oplus.aiunit.vision.o38
    public void c(Throwable th) {
        wil.a("GattSetNotificationCommand", th.getMessage());
        xs2<Void> xs2Var = this.f17279c;
        if (xs2Var != null) {
            xs2Var.a(th, 204);
        }
    }
}
