package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class hu5 {
    public Handler b;
    public List<fy3> a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap<String, xtk> f12274c = new ConcurrentHashMap<>();

    public hu5(Looper looper) {
        this.b = new Handler(looper);
    }

    public void c(fy3 fy3Var) {
        if (this.a.contains(fy3Var)) {
            return;
        }
        this.a.add(fy3Var);
    }

    public final String d(UUID uuid, UUID uuid2) {
        return uuid.toString() + uuid2.toString();
    }

    public void e() {
        this.a.clear();
        this.f12274c.clear();
    }

    public void f(final String str, final boolean z) {
        if (Looper.myLooper() == this.b.getLooper()) {
            j(str, z);
        } else {
            this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.fu5
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.j(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void j(String str, boolean z) {
        Iterator<fy3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(str, z);
        }
    }

    public void h(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Looper.myLooper() == this.b.getLooper()) {
            k(bluetoothGatt, bluetoothGattCharacteristic);
        } else {
            this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.gu5
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.k(bluetoothGatt, bluetoothGattCharacteristic);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void k(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        UUID uuid = bluetoothGattCharacteristic.getService().getUuid();
        UUID uuid2 = bluetoothGattCharacteristic.getUuid();
        for (xtk xtkVar : this.f12274c.values()) {
            if (xtkVar.d(uuid, uuid2)) {
                xtkVar.c(bluetoothGattCharacteristic.getValue());
            }
        }
    }

    public void l(fy3 fy3Var) {
        this.a.remove(fy3Var);
    }

    public xtk m(UUID uuid, UUID uuid2) {
        xtk xtkVar = this.f12274c.get(d(uuid, uuid2));
        if (xtkVar != null) {
            return xtkVar;
        }
        xtk xtkVar2 = new xtk(uuid, uuid2);
        this.f12274c.put(d(uuid, uuid2), xtkVar2);
        return xtkVar2;
    }
}
