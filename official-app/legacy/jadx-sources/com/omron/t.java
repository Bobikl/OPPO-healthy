package com.omron;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class t extends q {

    @NonNull
    private final ai b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final BluetoothGattCharacteristic f9081c;

    public t(@NonNull ai aiVar, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(bluetoothGattCharacteristic.getUuid());
        this.b = aiVar;
        this.f9081c = bluetoothGattCharacteristic;
    }

    @Nullable
    public z a(@NonNull aj ajVar) {
        BluetoothGattDescriptor descriptor = this.f9081c.getDescriptor(ajVar.a());
        if (descriptor == null) {
            return null;
        }
        return new z(this, descriptor);
    }

    @NonNull
    public List<z> b() {
        ArrayList arrayList = new ArrayList();
        List<BluetoothGattDescriptor> descriptors = this.f9081c.getDescriptors();
        if (descriptors == null) {
            return arrayList;
        }
        Iterator<BluetoothGattDescriptor> it = descriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(new z(this, it.next()));
        }
        return arrayList;
    }

    @NonNull
    public BluetoothGattCharacteristic c() {
        return this.f9081c;
    }

    public boolean d() {
        int properties = this.f9081c.getProperties();
        return u.Notify.a(properties) || u.Indicate.a(properties);
    }

    @NonNull
    public EnumSet<u> e() {
        return u.b(this.f9081c.getProperties());
    }

    @NonNull
    public String f() {
        return this.f9081c.getStringValue(0);
    }

    @NonNull
    public byte[] g() {
        return this.f9081c.getValue();
    }

    public String toString() {
        return "CBCharacteristic{" + a().toString() + ", properties=" + e().toString() + ", isNotifying=" + d() + ", descriptors=" + b().toString() + '}';
    }
}
