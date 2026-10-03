package com.omron;

import android.bluetooth.BluetoothGattDescriptor;
import android.support.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class z extends q {

    @NonNull
    private final t b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final BluetoothGattDescriptor f9104c;

    public z(@NonNull t tVar, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(bluetoothGattDescriptor.getUuid());
        this.b = tVar;
        this.f9104c = bluetoothGattDescriptor;
    }

    @NonNull
    public BluetoothGattDescriptor b() {
        return this.f9104c;
    }

    @NonNull
    public byte[] c() {
        return this.f9104c.getValue();
    }

    public String toString() {
        return "CBDescriptor{" + a().toString() + '}';
    }
}
