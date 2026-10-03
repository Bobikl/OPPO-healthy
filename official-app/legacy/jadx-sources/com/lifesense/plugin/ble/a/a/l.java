package com.lifesense.plugin.ble.a.a;

import android.bluetooth.BluetoothGatt;
import android.os.Message;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDisconnectStatus;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l extends com.lifesense.plugin.ble.b.a {
    public abstract void a(BluetoothGatt bluetoothGatt);

    public abstract void a(BluetoothGatt bluetoothGatt, int i, int i2);

    public abstract void a(BluetoothGatt bluetoothGatt, int i, r rVar);

    public abstract void a(BluetoothGatt bluetoothGatt, LSConnectState lSConnectState, int i, int i2);

    public abstract void a(Message message);

    public abstract void a(m mVar);

    public abstract void a(o oVar, UUID uuid, UUID uuid2);

    public abstract void a(UUID uuid, UUID uuid2, byte[] bArr, u uVar);

    public abstract boolean a(UUID uuid, int i, byte[] bArr);

    public abstract void b(m mVar);

    public abstract void b(LSDisconnectStatus lSDisconnectStatus);

    public abstract void b(String str);

    public abstract void b(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void c(m mVar);

    public abstract void c(String str);

    public abstract void c(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void d(m mVar);

    public abstract String e();

    public abstract void e(m mVar);

    public abstract void f();

    public abstract void g();

    public abstract String x();
}
