package com.omron;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ai extends q {

    @NonNull
    private final ad b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final BluetoothGattService f8805c;

    public ai(@NonNull ad adVar, @NonNull BluetoothGattService bluetoothGattService) {
        super(bluetoothGattService.getUuid());
        this.b = adVar;
        this.f8805c = bluetoothGattService;
    }

    @NonNull
    public List<t> b() {
        ArrayList arrayList = new ArrayList();
        List<BluetoothGattCharacteristic> characteristics = this.f8805c.getCharacteristics();
        if (characteristics == null) {
            return arrayList;
        }
        Iterator<BluetoothGattCharacteristic> it = characteristics.iterator();
        while (it.hasNext()) {
            arrayList.add(new t(this, it.next()));
        }
        return arrayList;
    }

    @NonNull
    public List<ai> c() {
        ArrayList arrayList = new ArrayList();
        List<BluetoothGattService> includedServices = this.f8805c.getIncludedServices();
        if (includedServices == null) {
            return arrayList;
        }
        Iterator<BluetoothGattService> it = includedServices.iterator();
        while (it.hasNext()) {
            arrayList.add(new ai(this.b, it.next()));
        }
        return arrayList;
    }

    public boolean d() {
        return this.f8805c.getType() == 0;
    }

    public String toString() {
        return "CBService{" + a().b() + ", isPrimary=" + d() + ", characteristics=" + b().toString() + ", includedServices=" + c().toString() + '}';
    }
}
