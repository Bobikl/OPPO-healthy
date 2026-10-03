package com.lifesense.plugin.ble.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public final class c extends com.lifesense.plugin.ble.b.a implements g {
    private static c a;
    private HandlerThread b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f8666c;
    private Queue d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f8667e;
    private Map f;

    private c() {
        HandlerThread handlerThread = new HandlerThread("GattClientThread", 10);
        this.b = handlerThread;
        handlerThread.start();
        this.f8666c = new Handler(this.b.getLooper());
        this.f = new HashMap();
    }

    private synchronized b c() {
        Queue queue = this.d;
        if (queue != null && !queue.isEmpty()) {
            this.d.remove(this.f8667e);
            b bVar = (b) this.d.peek();
            this.f8667e = bVar;
            if (bVar == null) {
                this.f8667e = null;
                return null;
            }
            printLogMessage(getSupperLogInfo(null, "next connect device is[" + bVar.d() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return this.f8667e;
        }
        this.f8667e = null;
        return null;
    }

    private b d(String str) {
        Queue queue;
        if (!TextUtils.isEmpty(str) && (queue = this.d) != null && !queue.isEmpty()) {
            for (b bVar : this.d) {
                if (bVar != null && bVar.d() != null && str.equalsIgnoreCase(bVar.d())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    private void e(String str) {
        Queue queue = this.d;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        b bVarD = d(str);
        if (bVarD != null) {
            this.d.remove(bVarD);
            return;
        }
        printLogMessage(getPrintLogInfo("failed to remove device from connecting queue:" + this.d.toString() + "; key=" + str, 3));
    }

    public BluetoothGatt b(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f) != null && map.size() != 0) {
            for (String str2 : this.f.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    return (BluetoothGatt) this.f.get(str2);
                }
            }
        }
        return null;
    }

    public static synchronized c a() {
        c cVar = a;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        a = cVar2;
        return cVar2;
    }

    public void c(String str) {
        Map map;
        if (TextUtils.isEmpty(str) || (map = this.f) == null || map.size() == 0) {
            return;
        }
        String str2 = str;
        for (String str3 : this.f.keySet()) {
            if (str3.equalsIgnoreCase(str)) {
                str2 = str3;
            }
        }
        this.f.remove(str2);
    }

    public void b() {
        Queue queue = this.d;
        if (queue != null) {
            queue.clear();
            this.d = new ConcurrentLinkedQueue();
            printLogMessage(getGeneralLogInfo(null, "remove all connecting obj....", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        }
    }

    public void a(String str) {
        b bVar;
        if (this.f8666c == null || TextUtils.isEmpty(str) || (bVar = this.f8667e) == null || TextUtils.isEmpty(bVar.d())) {
            return;
        }
        if (str.equalsIgnoreCase(this.f8667e.d())) {
            b bVarC = c();
            this.f8667e = bVarC;
            if (bVarC == null) {
                return;
            }
            this.f8666c.postDelayed(new d(this), 5000L);
            return;
        }
        printLogMessage(getPrintLogInfo("request connect next device from [" + str + "]; current connecting device[" + this.f8667e.d() + "]", 1));
    }

    public void b(String str, BluetoothGatt bluetoothGatt, boolean z) {
        if (b(str) == null) {
            printLogMessage(getPrintLogInfo("no permission to send close gatt again:" + bluetoothGatt + "; device=" + str, 1));
            return;
        }
        if (bluetoothGatt != null) {
            c(str);
            com.lifesense.plugin.ble.a.e.a().a(bluetoothGatt, str, this);
        } else {
            BluetoothGatt bluetoothGattB = b(str);
            c(str);
            com.lifesense.plugin.ble.a.e.a().a(bluetoothGattB, str, this);
        }
    }

    public void a(String str, BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || TextUtils.isEmpty(str) || this.f == null) {
            return;
        }
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        BluetoothGatt bluetoothGattB = b(strA);
        if (bluetoothGattB != null) {
            printLogMessage(getGeneralLogInfo(str, "not released gatt obj:" + bluetoothGattB, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.f.remove(strA);
        }
        this.f.put(strA, bluetoothGatt);
    }

    @Override // com.lifesense.plugin.ble.a.a.g
    public void a(String str, BluetoothGatt bluetoothGatt, boolean z) {
        if (this.f8666c == null) {
            return;
        }
        if (bluetoothGatt == null && !z) {
            printLogMessage(getGeneralLogInfo(str, "failed to create gatt obj,is null..." + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            a(str);
            return;
        }
        if (bluetoothGatt == null || !z) {
            return;
        }
        b bVar = this.f8667e;
        if (bVar != null && bVar.c() != null && (this.f8667e.c() instanceof a)) {
            ((a) this.f8667e.c()).a(bluetoothGatt, str);
        }
        a(str, bluetoothGatt);
    }

    @Override // com.lifesense.plugin.ble.a.a.g
    public void a(String str, boolean z) {
        if (z) {
            c(str);
        }
        a(str);
    }

    public boolean a(BluetoothGatt bluetoothGatt, String str, boolean z) {
        e(str);
        if (bluetoothGatt == null) {
            b(str, b(str), true);
            return true;
        }
        com.lifesense.plugin.ble.a.e.a().b(bluetoothGatt, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(b bVar) {
        Queue queue;
        if (this.f8667e == null || (queue = this.d) == null || queue.size() == 0 || bVar == null || bVar.c() == null || bVar.d() == null) {
            return false;
        }
        String strD = bVar.d();
        if (bVar.c() instanceof a) {
            ((a) bVar.c()).a(strD);
        }
        this.f8666c.post(new e(this));
        BluetoothGatt bluetoothGattB = b(strD);
        if (bluetoothGattB == null) {
            com.lifesense.plugin.ble.a.e.a().a(this.f8667e, this);
            return true;
        }
        b bVar2 = new b(strD, bVar.b(), bVar.c());
        printLogMessage(getGeneralLogInfo(strD, "released gatt obj=" + com.lifesense.plugin.ble.c.b.a(bluetoothGattB) + " {" + strD + "}", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        com.lifesense.plugin.ble.a.e.a().a(bluetoothGattB, strD, this);
        this.f8666c.postDelayed(new f(this, bVar2, strD), 5000L);
        return true;
    }

    public synchronized boolean a(String str, LSDeviceInfo lSDeviceInfo, BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice != null && bluetoothGattCallback != null) {
            if (BluetoothAdapter.checkBluetoothAddress(bluetoothDevice.getAddress())) {
                if (!this.d.isEmpty() && this.d.size() != 0) {
                    if (d(str) != null) {
                        printLogMessage(getSupperLogInfo(str, "no permission to add device in queue again,is exist :" + str, com.lifesense.plugin.ble.b.a.a.Connection_Queue, null, true));
                        return false;
                    }
                    b bVar = new b(str, bluetoothDevice, bluetoothGattCallback);
                    bVar.a(lSDeviceInfo);
                    this.d.add(bVar);
                    printLogMessage(getSupperLogInfo(str, "waiting for connect,queue=[" + com.lifesense.plugin.ble.c.b.a(this.d) + "]", com.lifesense.plugin.ble.b.a.a.Connection_Queue, null, true));
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("connecting device now >> ");
                sb.append(str);
                b bVar2 = new b(str, bluetoothDevice, bluetoothGattCallback);
                this.f8667e = bVar2;
                bVar2.a(lSDeviceInfo);
                this.d.add(this.f8667e);
                return a(this.f8667e);
            }
        }
        printLogMessage(getGeneralLogInfo(null, "failed to send connect request with device [" + (bluetoothDevice == null ? "null" : bluetoothDevice.getAddress()) + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        return false;
    }
}
