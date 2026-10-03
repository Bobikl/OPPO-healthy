package com.lifesense.plugin.ble.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDisconnectStatus;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale", "NewApi"})
public abstract class h extends l {
    protected LSConnectState A;
    protected LSDeviceInfo B;
    protected boolean C;
    protected BluetoothGatt D;
    protected BluetoothGatt E;
    protected boolean F;
    protected o G;
    protected boolean H;
    protected long I;
    protected boolean J;
    protected boolean K;
    private p a;
    protected r x;
    protected String y;
    protected String z;
    private n b = new i(this);

    @SuppressLint({"NewApi"})
    protected a L = new j(this);

    public h(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m j() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.e();
        }
        return null;
    }

    public synchronized void H() {
        p pVar = this.a;
        if (pVar != null) {
            pVar.a();
        }
    }

    public Queue I() {
        p pVar = this.a;
        if (pVar == null) {
            return null;
        }
        return pVar.b();
    }

    public boolean J() {
        p pVar = this.a;
        if (pVar == null) {
            return false;
        }
        pVar.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (this.C) {
            c.a().a(bluetoothGatt, this.y, false);
            c.a().b(this.y, bluetoothGatt, false);
        } else if (this.F) {
            printLogMessage(getAdvancedLogInfo(this.z, "no permission to sent discover service request repeatedly...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        } else {
            this.F = true;
            b(bluetoothGatt, LSConnectState.GattConnected, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        r rVar = this.x;
        if (rVar == null) {
            return;
        }
        Iterator it = rVar.b().iterator();
        while (it.hasNext()) {
            printLogMessage(getSupperLogInfo(this.z, s.a((BluetoothGattCharacteristic) it.next(), "Read"), com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
        }
        Iterator it2 = this.x.c().iterator();
        while (it2.hasNext()) {
            printLogMessage(getSupperLogInfo(this.z, s.a((BluetoothGattCharacteristic) it2.next(), "Write"), com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
        }
        Iterator it3 = this.x.d().iterator();
        while (it3.hasNext()) {
            printLogMessage(getSupperLogInfo(this.z, s.a((BluetoothGattCharacteristic) it3.next(), "Enable"), com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
        }
    }

    public synchronized m c(boolean z) {
        p pVar = this.a;
        if (pVar == null) {
            return null;
        }
        return pVar.a(z);
    }

    private void b(BluetoothGatt bluetoothGatt, LSConnectState lSConnectState, int i, int i2) {
        if (lSConnectState == this.A) {
            return;
        }
        this.A = lSConnectState;
        a(bluetoothGatt, lSConnectState, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.a.d();
        this.K = true;
        if (this.H) {
            this.K = false;
        }
        this.F = false;
        b(LSDisconnectStatus.Close);
        b(bluetoothGatt, LSConnectState.Disconnect, i, i2);
    }

    public boolean c(int i) {
        if (this.D == null || i <= 20) {
            return false;
        }
        m mVarE = this.a.e();
        printLogMessage(getGeneralLogInfo(this.z, "try to request MTU:" + i + "; obj=" + com.lifesense.plugin.ble.c.b.a(this.D) + "; task=" + (mVarE != null ? mVarE.g() : "null"), com.lifesense.plugin.ble.b.a.a.Gatt_Message, null, true));
        m mVar = new m(this.D);
        mVar.a(o.RequestMtu);
        mVar.a(i);
        this.a.a(mVar);
        this.a.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(o oVar, UUID uuid, UUID uuid2) {
        if (o.EnableDone == oVar || o.DisableDone == oVar || o.ReadDone == oVar) {
            if (oVar == this.G) {
                return;
            }
            printLogMessage(getSupperLogInfo(this.z, "characteristic status change=" + oVar, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
            this.G = oVar;
        }
        a(oVar, uuid, uuid2);
    }

    public void a(com.lifesense.plugin.ble.device.proto.q qVar) {
        this.a = new p(qVar, this.b);
        com.lifesense.plugin.ble.a.h.a(new k(this));
    }

    public void a(String str, UUID uuid, UUID uuid2, int i, int i2, u uVar, byte[] bArr) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = str.length() / 40;
        int length2 = str.length() % 40;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 40;
            String strSubstring = str.substring(i4, i4 + 40);
            t tVar = new t();
            tVar.b(i2);
            tVar.a(strSubstring);
            tVar.a(uuid);
            tVar.b(uuid2);
            tVar.a(i);
            tVar.a(uVar);
            m mVar = new m(this.D, tVar);
            mVar.a(o.WriteCharacteristic);
            mVar.a(e());
            mVar.a(a(uuid2, i, bArr));
            this.a.a(mVar);
        }
        if (length2 > 0) {
            String strSubstring2 = str.substring(length * 40, str.length());
            t tVar2 = new t();
            tVar2.b(i2);
            tVar2.a(uuid);
            tVar2.a(strSubstring2);
            tVar2.b(uuid2);
            tVar2.a(i);
            tVar2.a(uVar);
            m mVar2 = new m(this.D, tVar2);
            mVar2.a(o.WriteCharacteristic);
            mVar2.a(e());
            mVar2.a(a(uuid2, i, bArr));
            this.a.a(mVar2);
        }
    }

    public void b(String str, UUID uuid, UUID uuid2, int i, int i2, u uVar, byte[] bArr) {
        if (str == null || str.length() == 0) {
            return;
        }
        t tVar = new t();
        tVar.b(i2);
        tVar.a(str);
        tVar.a(uuid);
        tVar.b(uuid2);
        tVar.a(i);
        tVar.a(uVar);
        m mVar = new m(this.D, tVar);
        mVar.a(o.WriteCharacteristic);
        mVar.a(e());
        mVar.a(a(uuid2, i, bArr));
        this.a.a(mVar);
    }

    public synchronized boolean a(List list) {
        r rVar = this.x;
        if (rVar != null && rVar.g()) {
            this.G = o.ReadCharacteristic;
            bluetoothGattCharacteristicA = null;
            boolean z = true;
            if (list == null || list.size() == 0) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristicA : this.x.b()) {
                    m mVar = new m(this.D);
                    mVar.a(bluetoothGattCharacteristicA);
                    mVar.a(o.ReadCharacteristic);
                    this.a.a(mVar);
                }
                m mVar2 = new m(this.D);
                mVar2.a(o.ReadDone);
                mVar2.a(bluetoothGattCharacteristicA);
                this.a.a(mVar2);
                this.a.a();
            } else {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    bluetoothGattCharacteristicA = s.a((String) it.next(), this.x.b());
                    if (bluetoothGattCharacteristicA != null) {
                        i++;
                        m mVar3 = new m(this.D);
                        mVar3.a(bluetoothGattCharacteristicA);
                        mVar3.a(o.ReadCharacteristic);
                        this.a.a(mVar3);
                    }
                }
                if (i > 0) {
                    m mVar4 = new m(this.D);
                    mVar4.a(o.ReadDone);
                    mVar4.a(bluetoothGattCharacteristicA);
                    this.a.a(mVar4);
                    this.a.a();
                }
                z = i > 0;
            }
            if (!z) {
                printLogMessage(getGeneralLogInfo(this.z, "failed to read characteristic:" + list + "; does not exist,status=" + z, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            }
            return z;
        }
        printLogMessage(getSupperLogInfo(this.z, "failed to read characteristic,unsupported...", com.lifesense.plugin.ble.b.a.a.Read_Character, null, false));
        return false;
    }

    public synchronized boolean b(List list, Queue queue) {
        r rVar = this.x;
        if (rVar != null && rVar.h()) {
            if (queue == null || queue.size() == 0) {
                queue = this.x.d();
            }
            this.G = o.EnableCharacteristic;
            bluetoothGattCharacteristicA = null;
            boolean z = true;
            if (list == null || list.size() == 0) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristicA : queue) {
                    m mVar = new m(this.D);
                    mVar.a(bluetoothGattCharacteristicA);
                    mVar.a(o.EnableCharacteristic);
                    this.a.a(mVar);
                }
                m mVar2 = new m(this.D);
                mVar2.a(o.EnableDone);
                mVar2.a(bluetoothGattCharacteristicA);
                this.a.a(mVar2);
                this.a.a();
            } else {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    bluetoothGattCharacteristicA = s.a((String) it.next(), queue);
                    if (bluetoothGattCharacteristicA != null) {
                        i++;
                        m mVar3 = new m(this.D);
                        mVar3.a(bluetoothGattCharacteristicA);
                        mVar3.a(o.EnableCharacteristic);
                        this.a.a(mVar3);
                    }
                }
                if (i > 0) {
                    m mVar4 = new m(this.D);
                    mVar4.a(o.EnableDone);
                    mVar4.a(bluetoothGattCharacteristicA);
                    this.a.a(mVar4);
                    this.a.a();
                }
                z = i > 0;
            }
            if (!z) {
                printLogMessage(getGeneralLogInfo(this.z, "failed to enable characteristic:" + list + "; from{" + queue + "}", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            }
            return z;
        }
        printLogMessage(getSupperLogInfo(this.z, "failed to enable characteristic,unsupported...", com.lifesense.plugin.ble.b.a.a.Enable_Character, null, false));
        return false;
    }

    public synchronized boolean a(List list, Queue queue) {
        r rVar = this.x;
        if (rVar != null && rVar.h()) {
            if (queue == null || queue.size() == 0) {
                queue = this.x.d();
            }
            this.G = o.DisableCharacteristic;
            bluetoothGattCharacteristicA = null;
            boolean z = true;
            if (list == null || list.size() == 0) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristicA : queue) {
                    m mVar = new m(this.D);
                    mVar.a(bluetoothGattCharacteristicA);
                    mVar.a(o.DisableCharacteristic);
                    this.a.a(mVar);
                }
                m mVar2 = new m(this.D);
                mVar2.a(o.DisableDone);
                mVar2.a(bluetoothGattCharacteristicA);
                this.a.a(mVar2);
                this.a.a();
            } else {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    bluetoothGattCharacteristicA = s.a((String) it.next(), queue);
                    if (bluetoothGattCharacteristicA != null) {
                        i++;
                        m mVar3 = new m(this.D);
                        mVar3.a(bluetoothGattCharacteristicA);
                        mVar3.a(o.DisableCharacteristic);
                        this.a.a(mVar3);
                    }
                }
                if (i > 0) {
                    m mVar4 = new m(this.D);
                    mVar4.a(o.DisableDone);
                    mVar4.a(bluetoothGattCharacteristicA);
                    this.a.a(mVar4);
                    this.a.a();
                }
                z = i > 0;
            }
            if (!z) {
                printLogMessage(getGeneralLogInfo(this.z, "failed to disable characteristic:" + list + "; from{" + queue + "}", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            }
            return z;
        }
        printLogMessage(getSupperLogInfo(this.z, "failed to disable characteristic,unsupported...", com.lifesense.plugin.ble.b.a.a.Close_Character, null, false));
        return false;
    }
}
