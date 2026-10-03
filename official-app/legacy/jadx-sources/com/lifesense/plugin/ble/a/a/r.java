package com.lifesense.plugin.ble.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public class r {
    private List a = new ArrayList();
    private Queue b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Queue f8675c = new LinkedList();
    private Queue d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Queue f8676e = new LinkedList();
    private boolean f;

    public r(List list) {
        this.f = a(list);
    }

    public List a() {
        return this.a;
    }

    public Queue b() {
        return this.b;
    }

    public Queue c() {
        return this.f8675c;
    }

    public Queue d() {
        return this.d;
    }

    public boolean e() {
        return this.f;
    }

    public Queue f() {
        return this.f8676e;
    }

    public boolean g() {
        Queue queue = this.b;
        return (queue == null || queue.size() == 0) ? false : true;
    }

    public boolean h() {
        Queue queue = this.d;
        return (queue == null || queue.size() == 0) ? false : true;
    }

    public String toString() {
        return "IBGattService [gattServices=" + this.a + ", readCharacteristics=" + this.b + ", writeCharacteristics=" + this.f8675c + ", enableCharacteristics=" + this.d + ", isDiscoveredSucceed=" + this.f + "]";
    }

    public void a(Queue queue) {
        this.d = queue;
    }

    private boolean a(List list) {
        boolean z = false;
        if (list != null && list.size() != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BluetoothGattService bluetoothGattService = (BluetoothGattService) it.next();
                if (com.lifesense.plugin.ble.device.proto.e.a().a(bluetoothGattService.getUuid()) || com.lifesense.plugin.ble.device.proto.j.DEVICEINFO_SERVICE_UUID.equals(bluetoothGattService.getUuid())) {
                    if (bluetoothGattService.getUuid() != null) {
                        this.a.add(bluetoothGattService.getUuid());
                    }
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                        this.f8676e.add(bluetoothGattCharacteristic);
                        if (s.a(bluetoothGattCharacteristic)) {
                            this.b.add(bluetoothGattCharacteristic);
                        }
                        if (s.b(bluetoothGattCharacteristic)) {
                            this.f8675c.add(bluetoothGattCharacteristic);
                        }
                        if (bluetoothGattCharacteristic.getDescriptors() != null) {
                            Iterator<BluetoothGattDescriptor> it2 = bluetoothGattCharacteristic.getDescriptors().iterator();
                            while (it2.hasNext()) {
                                if (it2.next().getUuid().equals(com.lifesense.plugin.ble.device.proto.j.DESCRIPTOR_UUID) && s.c(bluetoothGattCharacteristic)) {
                                    this.d.add(bluetoothGattCharacteristic);
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
