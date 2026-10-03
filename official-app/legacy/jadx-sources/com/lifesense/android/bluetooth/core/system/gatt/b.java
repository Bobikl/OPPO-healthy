package com.lifesense.android.bluetooth.core.system.gatt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.bean.constant.CharacteristicStatus;
import com.lifesense.android.bluetooth.core.tools.e;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class b extends com.lifesense.android.bluetooth.core.business.log.a {
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.lifesense.android.bluetooth.core.protocol.worker.a f8636e;
    public c f;
    public long a = 10000;
    public Runnable g = new a();
    public Queue<com.lifesense.android.bluetooth.core.system.gatt.common.b> b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.lifesense.android.bluetooth.core.system.gatt.common.b f8635c = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.b == null || b.this.b.size() == 0 || b.this.f == null || b.this.f8635c == null) {
                    return;
                }
                String str = "this event timeout >> " + b.this.f8635c;
                b bVar = b.this;
                bVar.printLogMessage(bVar.getGeneralLogInfo(bVar.d, str, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                b.this.f.a(b.this.f8635c);
            } catch (Exception unused) {
            }
        }
    }

    public b(com.lifesense.android.bluetooth.core.protocol.worker.a aVar, c cVar) {
        this.f8636e = aVar;
        this.f = cVar;
        if (aVar != null) {
            this.d = aVar.getSourceMacAddress();
            aVar.getCurrentDevice();
        }
    }

    public com.lifesense.android.bluetooth.core.system.gatt.common.b c() {
        return this.f8635c;
    }

    public void clearBluetoothGattEventQueue() {
        this.b = new LinkedList();
    }

    public com.lifesense.android.bluetooth.core.system.gatt.common.b d() {
        return this.b.peek();
    }

    public synchronized void e() {
        boolean remoteRssi = true;
        if (this.f8635c != null) {
            printLogMessage(getPrintLogInfo("failed to handle next event,waiting for  >> " + this.f8635c.i(), 1));
            return;
        }
        com.lifesense.android.bluetooth.core.system.gatt.common.b bVarA = a(true);
        this.f8635c = bVarA;
        if (bVarA == null) {
            return;
        }
        f();
        BluetoothGatt bluetoothGattF = this.f8635c.f();
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = this.f8635c.b();
        if (CharacteristicStatus.READ_CHARACTERISTIC == this.f8635c.a()) {
            remoteRssi = a(bluetoothGattF, bluetoothGattCharacteristicB);
        } else if (CharacteristicStatus.WRITE_CHARACTERISTIC != this.f8635c.a() || this.f8635c.e() == null) {
            if (CharacteristicStatus.ENABLE_CHARACTERISTIC == this.f8635c.a()) {
                remoteRssi = b(bluetoothGattF, bluetoothGattCharacteristicB, bluetoothGattCharacteristicB.getDescriptor(com.lifesense.android.bluetooth.core.protocol.c.DESCRIPTOR_UUID));
            } else {
                if (CharacteristicStatus.DISABLE_CHARACTERISTIC != this.f8635c.a()) {
                    if (CharacteristicStatus.READ_RSSI == this.f8635c.a()) {
                        remoteRssi = bluetoothGattF.readRemoteRssi();
                    } else if (CharacteristicStatus.DISABLE_DONE != this.f8635c.a() && CharacteristicStatus.ENABLE_DONE != this.f8635c.a() && CharacteristicStatus.READ_DONE != this.f8635c.a()) {
                        remoteRssi = false;
                    }
                    this.f.a(this.f8635c, remoteRssi);
                }
                remoteRssi = a(bluetoothGattF, bluetoothGattCharacteristicB, bluetoothGattCharacteristicB.getDescriptor(com.lifesense.android.bluetooth.core.protocol.c.DESCRIPTOR_UUID));
            }
        } else if (bluetoothGattCharacteristicB == null) {
            this.f.a(this.f8635c, false);
            return;
        } else {
            bluetoothGattCharacteristicB.setValue(this.f8635c.e().a());
            remoteRssi = a(bluetoothGattF, bluetoothGattCharacteristicB, this.f8635c.h(), this.f8635c.g());
        }
        b(remoteRssi);
        this.f.a(this.f8635c, remoteRssi);
    }

    public final void f() {
        com.lifesense.android.bluetooth.core.protocol.worker.a aVar = this.f8636e;
        if (aVar == null || aVar.getWorkerHandler() == null) {
            return;
        }
        this.f8636e.getWorkerHandler().removeCallbacks(this.g);
    }

    public void setEventTimeout(long j2) {
        this.a = j2;
    }

    public synchronized com.lifesense.android.bluetooth.core.system.gatt.common.b a(boolean z) {
        Queue<com.lifesense.android.bluetooth.core.system.gatt.common.b> queue = this.b;
        if (queue != null && queue.size() != 0) {
            com.lifesense.android.bluetooth.core.system.gatt.common.b bVarPeek = this.b.peek();
            if (bVarPeek == null) {
                return null;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("next gatt event:");
                sb.append(bVarPeek.i());
            }
            return bVarPeek;
        }
        return null;
    }

    public Queue<com.lifesense.android.bluetooth.core.system.gatt.common.b> b() {
        return new LinkedList(this.b);
    }

    public final void b(boolean z) {
        if (z) {
            f();
            this.f8636e.getWorkerHandler().postDelayed(this.g, this.a);
        }
    }

    public void a() {
        Queue<com.lifesense.android.bluetooth.core.system.gatt.common.b> queue;
        if (this.f == null || (queue = this.b) == null || queue.size() == 0) {
            return;
        }
        f();
        LinkedList<com.lifesense.android.bluetooth.core.system.gatt.common.b> linkedList = new LinkedList(this.b);
        this.b = new LinkedList();
        for (com.lifesense.android.bluetooth.core.system.gatt.common.b bVar : linkedList) {
            try {
                printLogMessage(getGeneralLogInfo(this.d, "unfinished event timeout >> " + bVar.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                this.f.a(bVar);
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized boolean b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Enable_Character;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        if (bluetoothGattDescriptor == null) {
            return false;
        }
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid());
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true)) {
            printLogMessage(getGeneralLogInfo(this.d, "failed to enable characteristic notify,has exception...", aVar, strA, false));
            return false;
        }
        if ((bluetoothGattCharacteristic.getProperties() & 32) == 32) {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        } else {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        }
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        if (!zWriteDescriptor) {
            printLogMessage(getGeneralLogInfo(this.d, "failed to enable characteristic,has exception...", aVar, strA, false));
        }
        return zWriteDescriptor;
    }

    public synchronized boolean b(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar) {
        if (bVar == null) {
            return false;
        }
        Queue<com.lifesense.android.bluetooth.core.system.gatt.common.b> queue = this.b;
        if (queue != null && queue.size() != 0) {
            com.lifesense.android.bluetooth.core.system.gatt.common.b bVar2 = this.f8635c;
            if (bVar2 == null) {
                printLogMessage(getGeneralLogInfo(this.d, "failed to remove this gatt affairs=" + bVar.i(), com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception, null, true));
                return false;
            }
            if (bVar.equals(bVar2)) {
                f();
                boolean zRemove = this.b.remove(bVar);
                this.f8635c = null;
                return zRemove;
            }
            try {
                printLogMessage(getGeneralLogInfo(this.d, "failed to remove this gatt affairs=" + bVar.toString() + "; current obj=" + this.f8635c.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            } catch (Exception unused) {
            }
            return false;
        }
        this.f8635c = null;
        return false;
    }

    public synchronized void a(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar) {
        try {
            if (bVar == null) {
                printLogMessage(getGeneralLogInfo(this.d, "failed to add gatt affairs,is null...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            } else {
                this.b.add(bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Read_Character;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid());
        if (com.lifesense.android.bluetooth.core.system.gatt.common.c.b(bluetoothGattCharacteristic)) {
            boolean characteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            if (!characteristic) {
                printLogMessage(getGeneralLogInfo(this.d, "failed to read characteristic,has exception...", aVar, strA, false));
            }
            return characteristic;
        }
        printLogMessage(getGeneralLogInfo(this.d, "no permission to read characteristic=[" + bluetoothGattCharacteristic + "] ; permission=" + bluetoothGattCharacteristic.getProperties(), aVar, strA, false));
        return false;
    }

    public final synchronized boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Close_Character;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        if (bluetoothGattDescriptor == null) {
            return false;
        }
        printLogMessage(getPrintLogInfo("try to disable characterisci >> " + com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid()) + "; gatt obj==" + bluetoothGatt + "; characteristic =" + bluetoothGattCharacteristic, 1));
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid());
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false)) {
            printLogMessage(getGeneralLogInfo(this.d, "failed to disable characteristic notify,has exception...", aVar, strA, false));
            return false;
        }
        bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        if (!zWriteDescriptor) {
            printLogMessage(getGeneralLogInfo(this.d, "failed to disable characteristic,has exception...", aVar, strA, false));
        }
        return zWriteDescriptor;
    }

    public final synchronized boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, String str) {
        String str2;
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_Response;
        if (!a(aVar, bluetoothGatt, bluetoothGattCharacteristic)) {
            return false;
        }
        byte[] value = bluetoothGattCharacteristic.getValue();
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid());
        if (!com.lifesense.android.bluetooth.core.system.gatt.common.c.c(bluetoothGattCharacteristic)) {
            printLogMessage(getGeneralLogInfo(this.d, "no permission to write characteristic=[" + strA + "]; permission=" + bluetoothGattCharacteristic.getProperties() + "; data=" + e.b(value), aVar, strA, false));
            return false;
        }
        String strB = e.b(value);
        StringBuilder sb = new StringBuilder();
        sb.append("write value=");
        sb.append(strB);
        sb.append("; length=");
        sb.append(value.length);
        sb.append("; characteristic=");
        sb.append(strA);
        if (TextUtils.isEmpty(str)) {
            str2 = strB;
        } else {
            str2 = strB + "; status=" + str;
        }
        if (z) {
            com.lifesense.android.bluetooth.core.business.log.d.d().a(this.d, aVar, true, str2, strA);
        }
        boolean zWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        if (!zWriteCharacteristic) {
            printLogMessage(getGeneralLogInfo(this.d, "failed to write characteristic,has exception >> {" + e.b(value) + "}", aVar, strA, false));
        }
        return zWriteCharacteristic;
    }

    public final boolean a(com.lifesense.android.bluetooth.core.business.log.report.a aVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
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
        printLogMessage(getGeneralLogInfo(this.d, sb.toString(), aVar, null, false));
        return false;
    }
}
