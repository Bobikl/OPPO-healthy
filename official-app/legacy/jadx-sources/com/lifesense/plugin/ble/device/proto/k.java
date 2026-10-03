package com.lifesense.plugin.ble.device.proto;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.lifesense.plugin.ble.a.a.r;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDisconnectStatus;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.data.other.TimePeriod;
import com.lifesense.plugin.ble.data.tracker.ATGattServiceType;
import com.lifesense.plugin.ble.device.a.a.u;
import com.oplus.aiunit.vision.mla;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale", "NewApi"})
public abstract class k extends com.lifesense.plugin.ble.a.a.h implements com.lifesense.plugin.ble.device.a.a.a.d, q {
    protected Context a;
    protected String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f8766c;
    protected com.lifesense.plugin.ble.device.a.c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f8767e;
    protected Queue f;
    protected f g;
    protected LSDisconnectStatus h;
    protected String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ATGattServiceType f8768j;
    protected int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Handler f8769l;
    protected HandlerThread m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected LSUpgradeState f8770n;
    protected boolean o;
    protected com.lifesense.plugin.ble.device.a.b p;
    protected boolean q;
    protected p r;
    protected int s;
    protected Queue t;
    protected Runnable u;
    protected Runnable v;
    protected Runnable w;

    public k(String str) {
        super(str);
        this.u = new l(this);
        this.v = new m(this);
        this.w = new n(this);
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            this.b = new String(str).replace(":", "").toUpperCase();
        }
        HandlerThread handlerThread = new HandlerThread("WorkerHandler[" + this.b + "]");
        this.m = handlerThread;
        handlerThread.start();
        this.f8769l = new o(this, this.m.getLooper());
        this.m.setPriority(10);
        super.a((q) this);
    }

    public void A() {
        Handler handler;
        if (this.m == null || (handler = this.f8769l) == null) {
            return;
        }
        handler.removeCallbacks(this.v);
        this.f8769l.postDelayed(this.v, 60000L);
    }

    public void B() {
        Handler handler;
        if (this.m == null || (handler = this.f8769l) == null) {
            return;
        }
        handler.removeCallbacks(this.w);
        this.f8769l.postDelayed(this.w, 120000L);
    }

    public void C() {
        this.o = true;
        Handler handler = this.f8769l;
        if (handler != null) {
            handler.removeCallbacks(this.u);
        }
    }

    public void D() {
        Handler handler = this.f8769l;
        if (handler != null) {
            handler.removeCallbacks(this.v);
            this.f8769l.removeCallbacks(this.u);
            this.f8769l.removeCallbacks(this.w);
        }
    }

    public synchronized boolean E() {
        return this.C && this.H;
    }

    public boolean F() {
        r rVar = this.x;
        return rVar != null && rVar.g();
    }

    public LSUpgradeState G() {
        q qVarD = u.a().d(this.z);
        if (qVarD != null && qVarD.h() == LSConnectState.ConnectSuccess) {
            return qVarD.d();
        }
        return null;
    }

    public int c() {
        return this.k;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public String e() {
        return null;
    }

    public LSConnectState h() {
        return this.A;
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void k() {
        String simpleName = getClass().getSimpleName();
        try {
            this.o = true;
            r();
            if (this.m != null) {
                this.f8769l.removeCallbacks(null);
                printLogMessage(getSupperLogInfo(this.z, "clear worker:" + simpleName + "[" + this.b + "]", com.lifesense.plugin.ble.b.a.a.Release_Resources, null, true));
                this.m.quitSafely();
                this.m = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getSupperLogInfo(this.z, "failed to clear handler,has exception:" + simpleName, com.lifesense.plugin.ble.b.a.a.Release_Resources, null, true));
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public LSDeviceInfo l() {
        return this.B;
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public com.lifesense.plugin.ble.a.a.o m() {
        return this.G;
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public Handler n() {
        return this.f8769l;
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public Queue o() {
        return this.t;
    }

    public synchronized void p() {
        printLogMessage(getGeneralLogInfo(this.z, "send disconnect request from app now...." + this.D, com.lifesense.plugin.ble.b.a.a.Request_Disconnect, null, true));
        this.C = true;
        if (this.D == null) {
            this.H = true;
            this.h = LSDisconnectStatus.Unknown;
            this.f8767e = a.FREE;
            this.d = com.lifesense.plugin.ble.device.a.c.FREE;
            com.lifesense.plugin.ble.a.a.c.a().a(this.D, this.y, true);
        } else {
            a(LSDisconnectStatus.Request);
        }
    }

    public synchronized void q() {
        com.lifesense.plugin.ble.a.a.c cVarA;
        BluetoothGatt bluetoothGatt;
        String str;
        printLogMessage(getSupperLogInfo(this.y, "connection timeout!device=" + this.y + "; obj=" + com.lifesense.plugin.ble.c.b.a(this.D), com.lifesense.plugin.ble.b.a.a.Connect_Timeout, null, true));
        if (this.D == null) {
            this.H = true;
            this.h = LSDisconnectStatus.Unknown;
            this.f8767e = a.FREE;
            this.d = com.lifesense.plugin.ble.device.a.c.FREE;
            cVarA = com.lifesense.plugin.ble.a.a.c.a();
            bluetoothGatt = this.D;
            str = this.y;
        } else {
            LSDisconnectStatus lSDisconnectStatus = LSDisconnectStatus.Cancel;
            if (this.H) {
                return;
            }
            printLogMessage(getPrintLogInfo("cancel gatt connection with status =" + lSDisconnectStatus + "; current flow=" + x(), 3));
            this.H = true;
            cVarA = com.lifesense.plugin.ble.a.a.c.a();
            bluetoothGatt = this.D;
            str = this.y;
        }
        cVarA.a(bluetoothGatt, str, true);
    }

    public void r() {
        try {
            this.o = true;
            Handler handler = this.f8769l;
            if (handler != null) {
                handler.removeCallbacks(this.v);
                this.f8769l.removeCallbacks(this.u);
                this.f8769l.removeCallbacks(this.w);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public com.lifesense.plugin.ble.device.a.b s() {
        return com.lifesense.plugin.ble.device.a.a.g.a().b();
    }

    public String t() {
        return com.lifesense.plugin.ble.device.a.a.o.a().c(this.y);
    }

    public String u() {
        long j2 = this.I;
        return j2 <= 0 ? "0" : com.lifesense.plugin.ble.c.b.b(j2);
    }

    public TimePeriod v() {
        long j2 = this.I;
        return j2 <= 0 ? TimePeriod.UNKNOWN : com.lifesense.plugin.ble.c.b.c(j2);
    }

    public String w() {
        String str = this.y;
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.y.replace(":", "").toUpperCase();
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public String x() {
        try {
            a aVar = this.f8767e;
            return (aVar == null || TextUtils.isEmpty(aVar.toString())) ? "null" : new String(this.f8767e.toString()).replace('_', mla.SEPARATOR).replace("XOR", "default").toLowerCase();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception";
        }
    }

    public com.lifesense.plugin.ble.device.a.b y() {
        return this.p;
    }

    public synchronized a z() {
        Queue queue = this.f;
        if (queue == null) {
            this.g = null;
            this.f8767e = null;
            return null;
        }
        queue.remove(this.g);
        f fVar = (f) this.f.peek();
        this.g = fVar;
        if (fVar == null || fVar.a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to get next protocol message from queue >> ");
            sb.append(this.g);
            return null;
        }
        this.f8767e = this.g.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("next step is :");
        sb2.append(this.f8767e);
        return this.f8767e;
    }

    @SuppressLint({"NewApi"})
    private void i() {
        this.h = null;
        this.G = com.lifesense.plugin.ble.a.a.o.Unknown;
        this.A = LSConnectState.Unknown;
        this.F = false;
        this.C = false;
        this.D = null;
        this.I = 0L;
        this.s = 0;
        super.a((q) this);
    }

    public String a() {
        return this.z;
    }

    public LSUpgradeState d() {
        return this.f8770n;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void b(LSDisconnectStatus lSDisconnectStatus) {
        a(lSDisconnectStatus);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(BluetoothGatt bluetoothGatt) {
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void d(com.lifesense.plugin.ble.a.a.m mVar) {
        if (mVar == null || mVar.d() == null) {
            return;
        }
        printLogMessage(getGeneralLogInfo(this.z, "write timeout >> " + mVar.d().e(), com.lifesense.plugin.ble.b.a.a.Write_Timeout, com.lifesense.plugin.ble.c.b.a(mVar.d().d()), true));
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(BluetoothGatt bluetoothGatt, int i, int i2) {
        p pVar = this.r;
        if (pVar != null) {
            pVar.a(bluetoothGatt, i, i2);
        }
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void b(String str) {
        p pVar = this.r;
        if (pVar != null) {
            pVar.a(str);
        }
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void c(String str) {
        if (E()) {
            printLogMessage(getGeneralLogInfo(str, "no permission to handle reconnect request,has stop!" + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        if (this.m == null) {
            printLogMessage(getGeneralLogInfo(this.y, "failed to post device reconnect message,has stop", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        C();
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
        f();
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(BluetoothGatt bluetoothGatt, int i, r rVar) {
        String str;
        if (rVar == null) {
            str = "failed to discover gatt service,gattStatus=" + i + "; obj=" + bluetoothGatt;
        } else {
            if (rVar.e()) {
                p pVar = this.r;
                if (pVar != null) {
                    pVar.a(rVar);
                    return;
                }
                return;
            }
            str = "failed to discover gatt service,incomplete...";
        }
        printLogMessage(getGeneralLogInfo(this.z, str, com.lifesense.plugin.ble.b.a.a.Discover_Service, null, false));
        a(LSDisconnectStatus.Cancel);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void b(UUID uuid, UUID uuid2, byte[] bArr) {
        p pVar = this.r;
        if (pVar != null) {
            pVar.b(uuid, uuid2, bArr);
        }
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void c(UUID uuid, UUID uuid2, byte[] bArr) {
        p pVar = this.r;
        if (pVar != null) {
            pVar.a(uuid, uuid2, bArr);
        }
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(BluetoothGatt bluetoothGatt, LSConnectState lSConnectState, int i, int i2) {
        if (LSConnectState.GattConnected == lSConnectState) {
            try {
                Thread.sleep(1000L);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (E()) {
                printLogMessage(getAdvancedLogInfo(this.z, "no permission to sent discover service request,devcie is disconnect...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                return;
            }
            D();
            B();
            this.x = null;
            com.lifesense.plugin.ble.a.e.a().a(bluetoothGatt, bluetoothGatt.getDevice().getAddress());
        } else if (LSConnectState.Disconnect == lSConnectState) {
            D();
        }
        p pVar = this.r;
        if (pVar != null) {
            pVar.a(w(), lSConnectState);
        }
    }

    public synchronized void b(byte[] bArr, UUID uuid, UUID uuid2, int i, int i2, com.lifesense.plugin.ble.a.a.u uVar) {
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Write_Response;
        if (1 == i) {
            aVar = com.lifesense.plugin.ble.b.a.a.Write_No_Response;
        }
        com.lifesense.plugin.ble.b.a.a aVar2 = aVar;
        String strA = com.lifesense.plugin.ble.c.b.a(uuid2);
        if (bArr != null && bArr.length != 0) {
            if (uuid != null && uuid2 != null) {
                LSConnectState lSConnectState = LSConnectState.ConnectSuccess;
                LSConnectState lSConnectState2 = this.A;
                if (lSConnectState == lSConnectState2 || LSConnectState.GattConnected == lSConnectState2) {
                    b(com.lifesense.plugin.ble.c.a.d(bArr), uuid, uuid2, i, i2, uVar, bArr);
                    return;
                }
                printLogMessage(getGeneralLogInfo(this.z, "failed to add response packet,device is not connected..." + this.A + " ,status >>" + x(), aVar2, strA, false));
                return;
            }
            printLogMessage(getGeneralLogInfo(this.z, "failed to write response packet with error service or characteristic,status >>" + x(), aVar2, strA, false));
            return;
        }
        printLogMessage(getGeneralLogInfo(this.z, "failed to write response packet with null,status >>" + x(), aVar2, strA, false));
    }

    public synchronized void a(Context context, String str, Queue queue) {
        this.a = context;
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
        this.f8767e = a.FREE;
        this.A = LSConnectState.Unknown;
        this.C = false;
        this.z = str.toUpperCase();
        this.t = queue;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(com.lifesense.plugin.ble.a.a.o oVar, UUID uuid, UUID uuid2) {
        if (com.lifesense.plugin.ble.a.a.o.EnableDone == oVar) {
            D();
        }
        p pVar = this.r;
        if (pVar != null) {
            pVar.a(oVar, true, uuid, uuid2);
            return;
        }
        printLogMessage(getPrintLogInfo("faield to callback characteristic status change >>" + oVar, 1));
    }

    public void a(LSConnectState lSConnectState) {
        this.A = lSConnectState;
    }

    public synchronized void a(LSDisconnectStatus lSDisconnectStatus) {
        if (LSDisconnectStatus.Close == lSDisconnectStatus) {
            this.E = null;
            com.lifesense.plugin.ble.a.a.c.a().b(this.y, this.D, false);
        }
        if (this.H) {
            return;
        }
        this.E = null;
        printLogMessage(getPrintLogInfo("cancel gatt connection with status =" + lSDisconnectStatus + "; current flow=" + x(), 3));
        this.H = true;
        com.lifesense.plugin.ble.a.a.c.a().a(this.D, this.y, false);
    }

    public void a(com.lifesense.plugin.ble.device.a.b bVar) {
        this.p = bVar;
    }

    public synchronized void a(String str, LSDeviceInfo lSDeviceInfo, Context context) {
        this.a = context;
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
        this.f8767e = a.FREE;
        this.A = LSConnectState.Unknown;
        this.C = false;
        this.q = false;
        this.I = 0L;
        if (context != null) {
            new IntentFilter().addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        }
        if (str == null || str.length() <= 0 || lSDeviceInfo == null) {
            this.B = null;
            this.z = null;
        } else {
            this.B = lSDeviceInfo;
            this.y = str.toUpperCase();
            this.z = str.toUpperCase();
            com.lifesense.plugin.ble.device.a.a.g.a().a(this.z, this);
        }
    }

    public synchronized void a(String str, Queue queue, p pVar, com.lifesense.plugin.ble.device.a.c cVar) {
        i();
        this.d = com.lifesense.plugin.ble.device.a.c.SYNCING;
        if (cVar != null) {
            this.d = cVar;
        }
        this.q = false;
        this.H = false;
        this.A = LSConnectState.Connecting;
        this.y = str.toUpperCase();
        this.r = pVar;
        LinkedList linkedList = new LinkedList(queue);
        this.f = linkedList;
        this.f8768j = ATGattServiceType.All;
        f fVar = (f) linkedList.remove();
        this.g = fVar;
        this.f8767e = fVar.a();
        BluetoothDevice bluetoothDeviceA = com.lifesense.plugin.ble.a.e.a().a(this.y);
        if (bluetoothDeviceA == null) {
            bluetoothDeviceA = com.lifesense.plugin.ble.a.e.a().c(this.y);
        }
        com.lifesense.plugin.ble.a.a.c.a().a(this.y, this.B, bluetoothDeviceA, this.L);
    }

    public void a(UUID uuid, UUID uuid2, byte[] bArr) {
        StringBuilder sb;
        String str;
        String strTrim;
        if (this.B == null) {
            return;
        }
        if (!uuid2.equals(j.DEVICEINFO_SERVICE_MANUFACTURER_CHARACTERISTIC_UUID)) {
            if (uuid2.equals(j.DEVICEINFO_SERVICE_MODEL_CHARACTERISTIC_UUID)) {
                strTrim = new String(bArr).trim();
                this.B.setModelNumber(strTrim);
                sb = new StringBuilder();
                sb.append("Device information-ModelNumber-");
            } else {
                if (uuid2.equals(j.DEVICEINFO_SERVICE_SERIAL_NUMBER_CHARACTERISTIC_UUID)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Device information-DeviceId-");
                    sb2.append(this.B.getDeviceId());
                    sb2.append(";DeviceSn-");
                    sb2.append(this.B.getDeviceSn());
                    return;
                }
                if (uuid2.equals(j.DEVICEINFO_SERVICE_HARDWARE_REVISION_CHARACTERISTIC_UUID)) {
                    this.B.setHardwareVersion(com.lifesense.plugin.ble.c.a.c(bArr));
                    sb = new StringBuilder();
                    str = "Device information-HardwareVersion-";
                } else if (uuid2.equals(j.DEVICEINFO_SERVICE_FIRMWARE_REVISION_CHARACTERISTIC_UUID)) {
                    this.B.setFirmwareVersion(com.lifesense.plugin.ble.c.a.c(bArr));
                    sb = new StringBuilder();
                    str = "Device information-FirmwareVersion-";
                } else {
                    if (!uuid2.equals(j.DEVICEINFO_SERVICE_SOFTWARE_REVISION_CHARACTERISTIC_UUID)) {
                        if (uuid2.equals(j.CHARACTERISTIC_UUID_ANCS_TEXT_READ)) {
                            System.err.println("unhandle device info===" + com.lifesense.plugin.ble.c.a.e(bArr));
                            return;
                        }
                        return;
                    }
                    this.B.setSoftwareVersion(com.lifesense.plugin.ble.c.a.c(bArr));
                    sb = new StringBuilder();
                    str = "Device information-SoftwareVersion-";
                }
            }
            sb.append(strTrim);
        }
        this.B.setManufactureName(com.lifesense.plugin.ble.c.a.c(bArr));
        sb = new StringBuilder();
        str = "Device information-ManufactureName-";
        sb.append(str);
        strTrim = com.lifesense.plugin.ble.c.a.c(bArr);
        sb.append(strTrim);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(UUID uuid, UUID uuid2, byte[] bArr, com.lifesense.plugin.ble.a.a.u uVar) {
        p pVar = this.r;
        if (pVar != null) {
            pVar.a(uuid, uuid2, bArr, uVar);
        }
    }

    public synchronized void a(byte[] bArr, UUID uuid, UUID uuid2, int i, int i2, com.lifesense.plugin.ble.a.a.u uVar) {
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Write_Response;
        if (1 == i) {
            aVar = com.lifesense.plugin.ble.b.a.a.Write_No_Response;
        }
        com.lifesense.plugin.ble.b.a.a aVar2 = aVar;
        String strA = com.lifesense.plugin.ble.c.b.a(uuid2);
        if (bArr != null && bArr.length != 0) {
            if (uuid != null && uuid2 != null) {
                LSConnectState lSConnectState = LSConnectState.ConnectSuccess;
                LSConnectState lSConnectState2 = this.A;
                if (lSConnectState == lSConnectState2 || LSConnectState.GattConnected == lSConnectState2) {
                    a(com.lifesense.plugin.ble.c.a.d(bArr), uuid, uuid2, i, i2, uVar, bArr);
                    return;
                }
                printLogMessage(getGeneralLogInfo(this.z, "failed to add response packet,device is not connected..." + this.A + " ,status >>" + x(), aVar2, strA, false));
                return;
            }
            printLogMessage(getGeneralLogInfo(this.z, "failed to write response packet with error service or characteristic,status >>" + x(), aVar2, strA, false));
            return;
        }
        printLogMessage(getGeneralLogInfo(this.z, "failed to write response packet with null,status >>" + x(), aVar2, strA, false));
    }

    public boolean a(int i, int i2) {
        LSDeviceInfo lSDeviceInfoB = com.lifesense.plugin.ble.device.a.a.o.a().b(this.y);
        int i3 = this.k;
        if (lSDeviceInfoB != null) {
            return i3 < i;
        }
        return i3 < i2;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public boolean a(UUID uuid, int i, byte[] bArr) {
        return true;
    }
}
