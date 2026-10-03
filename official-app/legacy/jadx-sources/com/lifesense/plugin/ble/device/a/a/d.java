package com.lifesense.plugin.ble.device.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.lifesense.plugin.ble.OnPairingListener;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.other.BleScanResults;
import com.lifesense.plugin.ble.data.tracker.ATPairConfirmState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends com.lifesense.plugin.ble.device.a.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static d f8713n;
    private com.lifesense.plugin.ble.device.a.b o;
    private HandlerThread p;
    private Handler q;
    private LSManagerStatus r;
    private Map s;
    private Map t;
    private String u;
    private String v;
    private List w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8714c = -1;
    final int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8715e = 8;
    final int f = 9;
    final int g = 12;
    final int h = 20;
    final int i = 21;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f8716j = 22;
    final int k = 23;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f8717l = "deviceMac";
    final String m = "pairingMode";
    private com.lifesense.plugin.ble.device.a.b x = new e(this);

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OnPairingListener c(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.t) == null || map.size() == 0 || !this.t.containsKey(strA)) {
            return null;
        }
        return (OnPairingListener) this.t.get(strA);
    }

    @SuppressLint({"NewApi"})
    private void e() {
        if (this.p == null) {
            HandlerThread handlerThread = new HandlerThread("DevicePairCentreHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new f(this, this.p.getLooper());
        }
        if (this.s == null) {
            this.s = new ConcurrentSkipListMap();
        }
        if (this.t == null) {
            this.t = new ConcurrentSkipListMap();
        }
    }

    private void f() {
        List<BluetoothDevice> listF = com.lifesense.plugin.ble.a.e.a().f();
        if (listF != null && !listF.isEmpty()) {
            for (BluetoothDevice bluetoothDevice : listF) {
                if (bluetoothDevice != null && bluetoothDevice.getAddress() != null) {
                    BleScanResults bleScanResults = new BleScanResults();
                    bleScanResults.setDevice(bluetoothDevice);
                    bleScanResults.setAddress(bluetoothDevice.getAddress());
                    bleScanResults.setName(bluetoothDevice.getName());
                    printLogMessage(getGeneralLogInfo(null, "scan for pairing,connected device=" + bluetoothDevice.getName() + "[" + bluetoothDevice.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                }
            }
        }
        Set<BluetoothDevice> setJ = com.lifesense.plugin.ble.a.e.a().j();
        if (setJ == null || setJ.isEmpty()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice2 : setJ) {
            if (bluetoothDevice2 != null && bluetoothDevice2.getAddress() != null) {
                BleScanResults bleScanResults2 = new BleScanResults();
                bleScanResults2.setDevice(bluetoothDevice2);
                bleScanResults2.setAddress(bluetoothDevice2.getAddress());
                bleScanResults2.setName(bluetoothDevice2.getName());
                printLogMessage(getGeneralLogInfo(null, "scan for pairing,bond device=" + bluetoothDevice2.getName() + "[" + bluetoothDevice2.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            }
        }
    }

    public int a(String str, String str2) {
        com.lifesense.plugin.ble.device.proto.q qVarB = b(str);
        if (qVarB == null || !(qVarB instanceof com.lifesense.plugin.ble.device.proto.A5.i)) {
            printLogMessage(getGeneralLogInfo(str, "pairWorker error", com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
            return 11;
        }
        if (qVarB.h() == LSConnectState.ConnectSuccess) {
            return ((com.lifesense.plugin.ble.device.proto.A5.i) qVarB).a(str2);
        }
        printLogMessage(getGeneralLogInfo(str, "connect status error, status=" + qVarB.h(), com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
        return 14;
    }

    public LSManagerStatus b() {
        return this.r;
    }

    @SuppressLint({"NewApi"})
    public void d() {
        try {
            if (this.s == null && this.t == null) {
                return;
            }
            c();
            HandlerThread handlerThread = this.p;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.p = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.lifesense.plugin.ble.device.proto.q b(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || !BluetoothAdapter.checkBluetoothAddress(str) || (map = this.s) == null || map.size() == 0 || !this.s.containsKey(strA)) {
            return null;
        }
        return (com.lifesense.plugin.ble.device.proto.q) this.s.get(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.t) == null || !map.containsKey(strA)) {
            return;
        }
        this.t.remove(strA);
    }

    public void c() {
        a(LSManagerStatus.Free, "cancel all pairing process");
        Map map = this.s;
        if (map == null || map.size() == 0) {
            return;
        }
        Iterator it = this.s.keySet().iterator();
        while (it.hasNext()) {
            ((com.lifesense.plugin.ble.device.proto.q) this.s.get((String) it.next())).b();
        }
    }

    private LSDeviceInfo a(LSDeviceInfo lSDeviceInfo) {
        String str = this.u;
        if (str != null && str.length() > 0) {
            lSDeviceInfo.setBroadcastID(this.u);
        }
        String str2 = this.v;
        if (str2 != null && str2.length() > 0) {
            if (this.v.equals(lSDeviceInfo.getDeviceName())) {
                lSDeviceInfo.setBroadcastID(this.u);
            } else {
                lSDeviceInfo.setBroadcastID(null);
            }
        }
        List list = this.w;
        if (list != null && list.size() > 0) {
            if (this.w.contains(com.lifesense.plugin.ble.device.proto.e.a().f(lSDeviceInfo.getDeviceType()))) {
                lSDeviceInfo.setBroadcastID(this.u);
            } else {
                lSDeviceInfo.setBroadcastID(null);
            }
        }
        return lSDeviceInfo;
    }

    public static synchronized d a() {
        d dVar = f8713n;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        f8713n = dVar2;
        return dVar2;
    }

    @Override // com.lifesense.plugin.ble.device.a.a
    public void a(Context context, com.lifesense.plugin.ble.device.a.b bVar) {
        super.a(context, bVar);
        a(LSManagerStatus.Free, "init device centre");
        this.p = null;
        this.t = null;
        this.o = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(LSManagerStatus lSManagerStatus, String str) {
        this.r = lSManagerStatus;
        com.lifesense.plugin.ble.device.a.b bVar = this.o;
        if (bVar != null) {
            bVar.a(this, lSManagerStatus);
        }
    }

    public void a(String str) {
        printLogMessage(getGeneralLogInfo(str, "cancel pairing process, mac=" + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        a(LSManagerStatus.Free, "cancel pairing process with address");
        com.lifesense.plugin.ble.device.proto.q qVarB = b(str);
        if (qVarB != null) {
            qVarB.b();
        }
    }

    public void a(String str, int i, ATPairConfirmState aTPairConfirmState) {
        String str2;
        com.lifesense.plugin.ble.device.proto.q qVarB = b(str);
        if (qVarB == null || !(qVarB instanceof com.lifesense.plugin.ble.device.proto.A5.i)) {
            str2 = "pairWorker error";
        } else {
            if (qVarB.h() == LSConnectState.ConnectSuccess) {
                ((com.lifesense.plugin.ble.device.proto.A5.i) qVarB).a(aTPairConfirmState == ATPairConfirmState.Success);
                return;
            }
            str2 = "connect status error, status=" + qVarB.h();
        }
        printLogMessage(getGeneralLogInfo(str, str2, com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
    }

    private void a(String str, OnPairingListener onPairingListener) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.t) == null) {
            return;
        }
        if (map.containsKey(strA)) {
            this.t.remove(strA);
        }
        this.t.put(strA, onPairingListener);
    }

    private void a(String str, com.lifesense.plugin.ble.device.proto.q qVar) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || qVar == null || (map = this.s) == null) {
            return;
        }
        if (map.containsKey(strA)) {
            ((com.lifesense.plugin.ble.device.proto.q) this.s.get(strA)).b();
            this.s.remove(strA);
        }
        this.s.put(strA, qVar);
    }

    public void a(String str, boolean z) {
        com.lifesense.plugin.ble.device.proto.q qVarB = b(str);
        if (qVarB == null || !(qVarB instanceof com.lifesense.plugin.ble.device.proto.A5.i)) {
            printLogMessage(getGeneralLogInfo(str, "pairWorker error", com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
            return;
        }
        if (qVarB.h() == LSConnectState.ConnectSuccess) {
            ((com.lifesense.plugin.ble.device.proto.A5.i) qVarB).b(z);
            return;
        }
        printLogMessage(getGeneralLogInfo(str, "connect status error, status=" + qVarB.h(), com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
    }

    public boolean a(LSDeviceInfo lSDeviceInfo, OnPairingListener onPairingListener) {
        if (onPairingListener == null) {
            return false;
        }
        if (lSDeviceInfo == null || lSDeviceInfo.getMacAddress() == null || lSDeviceInfo.getDeviceType() == null) {
            printLogMessage(getPrintLogInfo("failed to send pairing device request,info error", 1));
            onPairingListener.onStateChanged(null, -1);
            return false;
        }
        if (b() != LSManagerStatus.Free) {
            printLogMessage(getPrintLogInfo("failed to send pairing device request,status error >> " + b(), 1));
            onPairingListener.onStateChanged(null, -1);
            return false;
        }
        a(LSManagerStatus.Pairing, "pairing ble device");
        e();
        LSDeviceInfo lSDeviceInfoA = a(lSDeviceInfo);
        Queue queueB = com.lifesense.plugin.ble.device.proto.c.b(lSDeviceInfoA);
        if (queueB == null) {
            printLogMessage(getPrintLogInfo("failed to send pairing device request,protocol stack error...", 1));
            onPairingListener.onStateChanged(null, -1);
            return false;
        }
        f();
        if (b(lSDeviceInfoA.getMacAddress()) == null) {
            a(lSDeviceInfoA.getMacAddress(), onPairingListener);
            com.lifesense.plugin.ble.device.proto.q qVarB = com.lifesense.plugin.ble.device.proto.b.a().b(this.a, lSDeviceInfoA);
            a(lSDeviceInfoA.getMacAddress(), qVarB);
            qVarB.a(this.x);
            qVarB.a(lSDeviceInfoA.getMacAddress(), queueB, com.lifesense.plugin.ble.device.a.c.PAIRING);
            return true;
        }
        printLogMessage(getPrintLogInfo("failed to send pairing device request,repeat the pairing error...", 1));
        onPairingListener.onStateChanged(lSDeviceInfoA, -1);
        return false;
    }
}
