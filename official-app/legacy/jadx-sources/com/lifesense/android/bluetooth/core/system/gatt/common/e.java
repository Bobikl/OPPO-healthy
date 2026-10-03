package com.lifesense.android.bluetooth.core.system.gatt.common;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.lifesense.android.bluetooth.core.enums.DeviceGattServiceUUID;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import org.apache.commons.collections4.CollectionUtils;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class e {
    public static final UUID i = UUID.fromString("0000BBB0-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final UUID f8642j = UUID.fromString("0000BBB1-0000-1000-8000-00805F9B34FB");
    public BluetoothGattCharacteristic a;
    public BluetoothGattCharacteristic b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<UUID> f8643c = new ArrayList();
    public Queue<BluetoothGattCharacteristic> d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Queue<BluetoothGattCharacteristic> f8644e = new LinkedList();
    public Queue<BluetoothGattCharacteristic> f = new LinkedList();
    public Queue<BluetoothGattCharacteristic> g = new LinkedList();
    public boolean h;

    public e(List<BluetoothGattService> list) {
        this.h = a(list);
    }

    public Queue<BluetoothGattCharacteristic> a() {
        return this.g;
    }

    public BluetoothGattCharacteristic b() {
        return this.b;
    }

    public BluetoothGattCharacteristic c() {
        return this.a;
    }

    public Queue<BluetoothGattCharacteristic> d() {
        return this.f;
    }

    public List<UUID> e() {
        return this.f8643c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!eVar.a(this)) {
            return false;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicC = c();
        BluetoothGattCharacteristic bluetoothGattCharacteristicC2 = eVar.c();
        if (bluetoothGattCharacteristicC != null ? !bluetoothGattCharacteristicC.equals(bluetoothGattCharacteristicC2) : bluetoothGattCharacteristicC2 != null) {
            return false;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = b();
        BluetoothGattCharacteristic bluetoothGattCharacteristicB2 = eVar.b();
        if (bluetoothGattCharacteristicB != null ? !bluetoothGattCharacteristicB.equals(bluetoothGattCharacteristicB2) : bluetoothGattCharacteristicB2 != null) {
            return false;
        }
        List<UUID> listE = e();
        List<UUID> listE2 = eVar.e();
        if (listE != null ? !listE.equals(listE2) : listE2 != null) {
            return false;
        }
        Queue<BluetoothGattCharacteristic> queueF = f();
        Queue<BluetoothGattCharacteristic> queueF2 = eVar.f();
        if (queueF != null ? !queueF.equals(queueF2) : queueF2 != null) {
            return false;
        }
        Queue<BluetoothGattCharacteristic> queueG = g();
        Queue<BluetoothGattCharacteristic> queueG2 = eVar.g();
        if (queueG != null ? !queueG.equals(queueG2) : queueG2 != null) {
            return false;
        }
        Queue<BluetoothGattCharacteristic> queueD = d();
        Queue<BluetoothGattCharacteristic> queueD2 = eVar.d();
        if (queueD != null ? !queueD.equals(queueD2) : queueD2 != null) {
            return false;
        }
        Queue<BluetoothGattCharacteristic> queueA = a();
        Queue<BluetoothGattCharacteristic> queueA2 = eVar.a();
        if (queueA != null ? queueA.equals(queueA2) : queueA2 == null) {
            return h() == eVar.h();
        }
        return false;
    }

    public Queue<BluetoothGattCharacteristic> f() {
        return this.d;
    }

    public Queue<BluetoothGattCharacteristic> g() {
        return this.f8644e;
    }

    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        BluetoothGattCharacteristic bluetoothGattCharacteristicC = c();
        int iHashCode = bluetoothGattCharacteristicC == null ? 43 : bluetoothGattCharacteristicC.hashCode();
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = b();
        int iHashCode2 = ((iHashCode + 59) * 59) + (bluetoothGattCharacteristicB == null ? 43 : bluetoothGattCharacteristicB.hashCode());
        List<UUID> listE = e();
        int iHashCode3 = (iHashCode2 * 59) + (listE == null ? 43 : listE.hashCode());
        Queue<BluetoothGattCharacteristic> queueF = f();
        int iHashCode4 = (iHashCode3 * 59) + (queueF == null ? 43 : queueF.hashCode());
        Queue<BluetoothGattCharacteristic> queueG = g();
        int iHashCode5 = (iHashCode4 * 59) + (queueG == null ? 43 : queueG.hashCode());
        Queue<BluetoothGattCharacteristic> queueD = d();
        int iHashCode6 = (iHashCode5 * 59) + (queueD == null ? 43 : queueD.hashCode());
        Queue<BluetoothGattCharacteristic> queueA = a();
        return (((iHashCode6 * 59) + (queueA != null ? queueA.hashCode() : 43)) * 59) + (h() ? 79 : 97);
    }

    public boolean i() {
        Queue<BluetoothGattCharacteristic> queue = this.f;
        return (queue == null || queue.size() == 0) ? false : true;
    }

    public boolean j() {
        Queue<BluetoothGattCharacteristic> queue = this.d;
        return (queue == null || queue.size() == 0) ? false : true;
    }

    public String toString() {
        return "LSDeviceGattService [gattServices=" + this.f8643c + ", readCharacteristics=" + this.d + ", writeCharacteristics=" + this.f8644e + ", enableCharacteristics=" + this.f + ", isDiscoveredSucceed=" + this.h + "]";
    }

    public boolean a(Object obj) {
        return obj instanceof e;
    }

    public final boolean a(List<BluetoothGattService> list) {
        this.h = false;
        if (CollectionUtils.isEmpty(list)) {
            return this.h;
        }
        for (BluetoothGattService bluetoothGattService : list) {
            if (DeviceGattServiceUUID.isDeviceServiceUUID(bluetoothGattService.getUuid())) {
                if (!this.f8643c.contains(bluetoothGattService.getUuid())) {
                    this.f8643c.add(bluetoothGattService.getUuid());
                }
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                    if (i.equals(bluetoothGattCharacteristic.getUuid())) {
                        this.a = bluetoothGattCharacteristic;
                    } else if (f8642j.equals(bluetoothGattCharacteristic.getUuid())) {
                        this.b = bluetoothGattCharacteristic;
                        this.f.add(bluetoothGattCharacteristic);
                    }
                    if (!this.g.contains(bluetoothGattCharacteristic)) {
                        this.g.add(bluetoothGattCharacteristic);
                    }
                    if (c.b(bluetoothGattCharacteristic) && !this.d.contains(bluetoothGattCharacteristic)) {
                        this.d.add(bluetoothGattCharacteristic);
                    }
                    if (c.c(bluetoothGattCharacteristic) && !this.f8644e.contains(bluetoothGattCharacteristic)) {
                        this.f8644e.add(bluetoothGattCharacteristic);
                    }
                    if (!CollectionUtils.isEmpty(bluetoothGattCharacteristic.getDescriptors())) {
                        for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                            this.h = true;
                            if (bluetoothGattDescriptor.getUuid().equals(com.lifesense.android.bluetooth.core.protocol.c.DESCRIPTOR_UUID) && c.a(bluetoothGattCharacteristic) && !this.f.contains(bluetoothGattCharacteristic)) {
                                this.f.add(bluetoothGattCharacteristic);
                            }
                        }
                    }
                }
            }
        }
        return this.h;
    }
}
