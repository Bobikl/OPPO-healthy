package com.lifesense.android.bluetooth.core.system.connect;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.business.sync.DeviceSyncCentre;
import com.lifesense.android.bluetooth.core.system.gatt.common.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class a extends com.lifesense.android.bluetooth.core.business.log.a implements b {
    public static a f;
    public HandlerThread a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Queue<d> f8632c = new ConcurrentLinkedQueue();
    public d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, BluetoothGatt> f8633e;

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.system.connect.a$a, reason: collision with other inner class name */
    public class RunnableC0832a implements Runnable {
        public final /* synthetic */ d a;
        public final /* synthetic */ String b;

        public RunnableC0832a(d dVar, String str) {
            this.a = dVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.a, this.b);
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("GattClientThread", 10);
        this.a = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.a.getLooper());
        this.f8633e = new HashMap();
    }

    public static synchronized a getInstance() {
        a aVar = f;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        f = aVar2;
        return aVar2;
    }

    public final synchronized d a() {
        Queue<d> queue = this.f8632c;
        if (queue != null && !queue.isEmpty()) {
            this.f8632c.remove(this.d);
            d dVarPeek = this.f8632c.peek();
            this.d = dVarPeek;
            if (dVarPeek == null) {
                this.d = null;
                return null;
            }
            printLogMessage(getSupperLogInfo(null, "next connect device is[" + dVarPeek.d() + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return this.d;
        }
        this.d = null;
        return null;
    }

    public void b() {
        Queue<d> queue = this.f8632c;
        if (queue != null) {
            queue.clear();
            this.f8632c = new ConcurrentLinkedQueue();
            printLogMessage(getGeneralLogInfo(null, "remove all connecting obj....", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        }
    }

    public BluetoothGatt d(String str) {
        Map<String, BluetoothGatt> map;
        if (!TextUtils.isEmpty(str) && (map = this.f8633e) != null && map.size() != 0) {
            for (String str2 : this.f8633e.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    return this.f8633e.get(str2);
                }
            }
        }
        return null;
    }

    public final d e(String str) {
        Queue<d> queue;
        if (!TextUtils.isEmpty(str) && (queue = this.f8632c) != null && !queue.isEmpty()) {
            for (d dVar : this.f8632c) {
                if (dVar != null && dVar.d() != null && str.equalsIgnoreCase(dVar.d())) {
                    return dVar;
                }
            }
        }
        return null;
    }

    public void f(String str) {
        d dVar;
        if (this.b == null || TextUtils.isEmpty(str) || (dVar = this.d) == null || TextUtils.isEmpty(dVar.d())) {
            return;
        }
        if (str.equalsIgnoreCase(this.d.d())) {
            this.d = a();
            return;
        }
        printLogMessage(getPrintLogInfo("request connect next device from [" + str + "]; current connecting device[" + this.d.d() + "]", 1));
    }

    public void g(String str) {
        Map<String, BluetoothGatt> map;
        if (TextUtils.isEmpty(str) || (map = this.f8633e) == null || map.size() == 0) {
            return;
        }
        String str2 = str;
        for (String str3 : this.f8633e.keySet()) {
            if (str3.equalsIgnoreCase(str)) {
                str2 = str3;
            }
        }
        this.f8633e.remove(str2);
    }

    public final void h(String str) {
        Queue<d> queue = this.f8632c;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        d dVarE = e(str);
        if (dVarE != null) {
            this.f8632c.remove(dVarE);
            return;
        }
        printLogMessage(getPrintLogInfo("failed to remove device from connecting queue:" + this.f8632c.toString() + "; key=" + str, 3));
    }

    public void b(String str, BluetoothGatt bluetoothGatt, boolean z) {
        if (d(str) == null) {
            printLogMessage(getPrintLogInfo("no permission to send close gatt again:" + bluetoothGatt + "; device=" + str, 1));
            return;
        }
        if (bluetoothGatt != null) {
            g(str);
            com.lifesense.android.bluetooth.core.system.b.getInstance().a(bluetoothGatt, str, this);
        } else {
            BluetoothGatt bluetoothGattD = d(str);
            g(str);
            com.lifesense.android.bluetooth.core.system.b.getInstance().a(bluetoothGattD, str, this);
        }
    }

    public final void a(d dVar, String str) {
        if (dVar.b() != null && (dVar.b() instanceof com.lifesense.android.bluetooth.core.system.gatt.common.a)) {
            printLogMessage(getGeneralLogInfo(str, "notify reconnect from gatt client,device=" + str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
            ((com.lifesense.android.bluetooth.core.system.gatt.common.a) dVar.b()).b(str);
        }
    }

    public void a(String str, BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || TextUtils.isEmpty(str) || this.f8633e == null) {
            return;
        }
        BluetoothGatt bluetoothGattD = d(str);
        if (bluetoothGattD != null) {
            printLogMessage(getGeneralLogInfo(str, "not released gatt obj:" + bluetoothGattD, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            this.f8633e.remove(str);
        }
        this.f8633e.put(str, bluetoothGatt);
    }

    @Override // com.lifesense.android.bluetooth.core.system.connect.b
    public void a(String str, BluetoothGatt bluetoothGatt, boolean z) {
        if (this.b == null) {
            return;
        }
        if (bluetoothGatt == null && !z) {
            printLogMessage(getGeneralLogInfo(str, "failed to create gatt obj,is null..." + str, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            f(str);
            return;
        }
        if (bluetoothGatt == null || !z) {
            return;
        }
        d dVar = this.d;
        if (dVar != null && dVar.b() != null && (this.d.b() instanceof com.lifesense.android.bluetooth.core.system.gatt.common.a)) {
            ((com.lifesense.android.bluetooth.core.system.gatt.common.a) this.d.b()).a(bluetoothGatt, str);
        }
        a(str, bluetoothGatt);
    }

    @Override // com.lifesense.android.bluetooth.core.system.connect.b
    public void a(String str, boolean z) {
        if (z) {
            g(str);
        }
        f(str);
    }

    public boolean a(BluetoothGatt bluetoothGatt, String str, boolean z) {
        h(str);
        if (bluetoothGatt == null) {
            b(str, d(str), true);
            return true;
        }
        com.lifesense.android.bluetooth.core.system.b.getInstance().a(bluetoothGatt, str);
        return true;
    }

    public final boolean a(d dVar) {
        Queue<d> queue;
        if (this.d != null && (queue = this.f8632c) != null && queue.size() != 0 && dVar != null && dVar.b() != null && dVar.d() != null) {
            String strD = dVar.d();
            if (dVar.b() instanceof com.lifesense.android.bluetooth.core.system.gatt.common.a) {
                ((com.lifesense.android.bluetooth.core.system.gatt.common.a) dVar.b()).a(strD);
            }
            BluetoothGatt bluetoothGattD = d(strD);
            if (bluetoothGattD == null) {
                com.lifesense.android.bluetooth.core.system.b.getInstance().a(this.d, this);
                return true;
            }
            d dVar2 = new d(strD, dVar.a(), dVar.b());
            printLogMessage(getGeneralLogInfo(strD, "released gatt {" + strD + "}", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            com.lifesense.android.bluetooth.core.system.b.getInstance().a(bluetoothGattD, strD, this);
            if (com.lifesense.android.bluetooth.core.system.b.getInstance().i()) {
                this.b.postDelayed(new RunnableC0832a(dVar2, strD), 3000L);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean a(String str, LsDeviceInfo lsDeviceInfo, BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice != null && bluetoothGattCallback != null) {
            if (BluetoothAdapter.checkBluetoothAddress(bluetoothDevice.getAddress())) {
                if (lsDeviceInfo != null && StringUtils.isNotEmpty(lsDeviceInfo.getBroadcastID()) && DeviceSyncCentre.getInstance().isDisableConnectDevice(lsDeviceInfo.getBroadcastID().toLowerCase())) {
                    Log.i("BLUETOOTH", "Already Connected");
                    return true;
                }
                if (e(str) != null) {
                    printLogMessage(getSupperLogInfo(str, "no permission to add device in queue again,is exist :" + str, com.lifesense.android.bluetooth.core.business.log.report.a.Connection_Queue, null, true));
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("connecting device now >> ");
                sb.append(str);
                d dVar = new d(str, bluetoothDevice, bluetoothGattCallback);
                this.d = dVar;
                dVar.a(lsDeviceInfo);
                this.f8632c.add(this.d);
                return a(this.d);
            }
        }
        printLogMessage(getGeneralLogInfo(null, "failed to send connect request with device [" + (bluetoothDevice == null ? "null" : bluetoothDevice.getAddress()) + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
        return false;
    }
}
