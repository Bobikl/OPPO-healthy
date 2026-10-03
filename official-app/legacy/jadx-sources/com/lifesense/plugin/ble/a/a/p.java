package com.lifesense.plugin.ble.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.text.TextUtils;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public final class p extends com.lifesense.plugin.ble.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8673c;
    private LSDeviceInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.lifesense.plugin.ble.device.proto.q f8674e;
    private n f;
    private Runnable g = new q(this);
    private Queue a = new LinkedList();
    private m b = null;

    public p(com.lifesense.plugin.ble.device.proto.q qVar, n nVar) {
        this.f8674e = qVar;
        this.f = nVar;
        if (qVar != null) {
            this.f8673c = qVar.a();
            this.d = qVar.l();
        }
    }

    private void f() {
        com.lifesense.plugin.ble.device.proto.q qVar = this.f8674e;
        if (qVar == null || qVar.n() == null) {
            return;
        }
        this.f8674e.n().removeCallbacks(this.g);
    }

    public synchronized m a(boolean z) {
        Queue queue = this.a;
        if (queue != null && queue.size() != 0) {
            m mVar = (m) this.a.peek();
            if (mVar == null) {
                return null;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("next gatt event:");
                sb.append(mVar.g());
            }
            return mVar;
        }
        return null;
    }

    public m e() {
        return this.b;
    }

    public Queue b() {
        return new LinkedList(this.a);
    }

    public void c() {
        this.a = new LinkedList();
    }

    public void d() {
        Queue queue;
        if (this.f == null || (queue = this.a) == null || queue.size() == 0) {
            return;
        }
        f();
        LinkedList linkedList = new LinkedList(this.a);
        this.a = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f.a((m) it.next());
        }
    }

    private void b(boolean z) {
        if (z) {
            f();
            this.f8674e.n().postDelayed(this.g, 10000L);
        }
    }

    private synchronized boolean b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor) {
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Close_Character;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        if (bluetoothGattDescriptor == null) {
            return false;
        }
        printLogMessage(getPrintLogInfo("try to disable characterisci >> " + com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getUuid()) + "; gatt obj==" + bluetoothGatt + "; characteristic =" + bluetoothGattCharacteristic, 1));
        String strA = com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getUuid());
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false)) {
            printLogMessage(getGeneralLogInfo(this.f8673c, "failed to disable characteristic notify,has exception...", aVar, strA, false));
            return false;
        }
        bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        if (!zWriteDescriptor) {
            printLogMessage(getGeneralLogInfo(this.f8673c, "failed to disable characteristic,has exception...", aVar, strA, false));
        }
        return zWriteDescriptor;
    }

    public synchronized void a() {
        if (this.b != null) {
            return;
        }
        boolean zA = true;
        m mVarA = a(true);
        this.b = mVarA;
        if (mVarA == null) {
            return;
        }
        f();
        BluetoothGatt bluetoothGattA = this.b.a();
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = this.b.b();
        if (o.ReadCharacteristic == this.b.c()) {
            zA = a(bluetoothGattA, bluetoothGattCharacteristicB);
        } else if (o.WriteCharacteristic == this.b.c() && this.b.d() != null) {
            bluetoothGattCharacteristicB.setValue(this.b.d().f());
            zA = a(bluetoothGattA, bluetoothGattCharacteristicB, this.b.f(), this.b.e());
        } else if (o.EnableCharacteristic == this.b.c()) {
            zA = a(bluetoothGattA, bluetoothGattCharacteristicB, bluetoothGattCharacteristicB.getDescriptor(com.lifesense.plugin.ble.device.proto.j.DESCRIPTOR_UUID));
        } else if (o.DisableCharacteristic == this.b.c()) {
            zA = b(bluetoothGattA, bluetoothGattCharacteristicB, bluetoothGattCharacteristicB.getDescriptor(com.lifesense.plugin.ble.device.proto.j.DESCRIPTOR_UUID));
        } else {
            if (o.ReadRssi != this.b.c()) {
                if (o.DisableDone != this.b.c() && o.EnableDone != this.b.c() && o.ReadDone != this.b.c()) {
                    if (o.RequestMtu == this.b.c()) {
                        zA = a(bluetoothGattA, this.b.j());
                    } else {
                        zA = false;
                    }
                }
                this.f.a(this.b, zA);
            }
            zA = bluetoothGattA.readRemoteRssi();
        }
        b(zA);
        this.f.a(this.b, zA);
    }

    public synchronized void a(m mVar) {
        try {
            if (mVar == null) {
                printLogMessage(getGeneralLogInfo(this.f8673c, "failed to add gatt affairs,is null...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            } else {
                this.a.add(mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b(m mVar) {
        if (mVar == null) {
            return false;
        }
        Queue queue = this.a;
        if (queue != null && queue.size() != 0) {
            m mVar2 = this.b;
            if (mVar2 == null) {
                printLogMessage(getGeneralLogInfo(this.f8673c, "failed to remove this gatt action=" + mVar.g(), com.lifesense.plugin.ble.b.a.a.Program_Exception, null, true));
                return false;
            }
            if (mVar.equals(mVar2)) {
                f();
                boolean zRemove = this.a.remove(mVar);
                this.b = null;
                return zRemove;
            }
            printLogMessage(getGeneralLogInfo(this.f8673c, "failed to remove this gatt action=" + mVar.toString() + "; current obj=" + this.b.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return false;
        }
        this.b = null;
        return false;
    }

    private synchronized boolean a(BluetoothGatt bluetoothGatt, int i) {
        try {
            if (bluetoothGatt == null) {
                printLogMessage(getGeneralLogInfo(this.f8673c, "failed request mtu2:" + i + "; status=" + i, com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
                return false;
            }
            if (i <= 20) {
                printLogMessage(getGeneralLogInfo(this.f8673c, "failed to request mtu:" + i + "; status=" + i, com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
                return true;
            }
            boolean zRequestMtu = bluetoothGatt.requestMtu(i);
            printLogMessage(getGeneralLogInfo(this.f8673c, "request mtu:" + i + "; status=" + zRequestMtu, com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
            return zRequestMtu;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Read_Character;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        String strA = com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getUuid());
        if (s.a(bluetoothGattCharacteristic)) {
            boolean characteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            if (!characteristic) {
                printLogMessage(getGeneralLogInfo(this.f8673c, "failed to read characteristic,has exception...", aVar, strA, false));
            }
            return characteristic;
        }
        printLogMessage(getGeneralLogInfo(this.f8673c, "no permission to read characteristic=[" + bluetoothGattCharacteristic + "] ; permission=" + bluetoothGattCharacteristic.getProperties(), aVar, strA, false));
        return false;
    }

    private synchronized boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor) {
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Enable_Character;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        if (bluetoothGattDescriptor == null) {
            return false;
        }
        String strA = com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getUuid());
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true)) {
            printLogMessage(getGeneralLogInfo(this.f8673c, "failed to enable characteristic notify,has exception...", aVar, strA, false));
            return false;
        }
        if ((bluetoothGattCharacteristic.getProperties() & 32) == 32) {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        } else {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        }
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        if (!zWriteDescriptor) {
            printLogMessage(getGeneralLogInfo(this.f8673c, "failed to enable characteristic,has exception...", aVar, strA, false));
        }
        return zWriteDescriptor;
    }

    private synchronized boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, String str) {
        String str2;
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Write_Response;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        byte[] value = bluetoothGattCharacteristic.getValue();
        String strA = com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getUuid());
        if (!s.b(bluetoothGattCharacteristic)) {
            printLogMessage(getGeneralLogInfo(this.f8673c, "no permission to write characteristic=[" + strA + "]; permission=" + bluetoothGattCharacteristic.getProperties() + "; data=" + com.lifesense.plugin.ble.c.a.e(value), aVar, strA, false));
            return false;
        }
        String strE = com.lifesense.plugin.ble.c.a.e(value);
        StringBuilder sb = new StringBuilder();
        sb.append("write value=");
        sb.append(strE);
        sb.append("; length=");
        sb.append(value.length);
        sb.append("; characteristic=");
        sb.append(strA);
        if (TextUtils.isEmpty(str)) {
            str2 = strE;
        } else {
            str2 = strE + "; status=" + str;
        }
        if (z) {
            com.lifesense.plugin.ble.b.d.a().a(this.f8673c, aVar, true, str2, strA);
        }
        boolean zWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        if (!zWriteCharacteristic) {
            printLogMessage(getGeneralLogInfo(this.f8673c, "failed to write characteristic,has exception >> {" + com.lifesense.plugin.ble.c.a.e(value) + "}", aVar, strA, false));
        }
        return zWriteCharacteristic;
    }

    private boolean a(com.lifesense.plugin.ble.b.a.a aVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        StringBuilder sb;
        String str;
        if (bluetoothGatt == null) {
            sb = new StringBuilder();
            sb.append("action=");
            sb.append(aVar);
            str = "; status=false; reason=gatt is null..";
        } else {
            if (bluetoothGattCharacteristic != null) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("action=");
            sb.append(aVar);
            str = "; status=false; reason=characteristic is null..";
        }
        sb.append(str);
        printLogMessage(getGeneralLogInfo(this.f8673c, sb.toString(), aVar, null, false));
        return false;
    }
}
