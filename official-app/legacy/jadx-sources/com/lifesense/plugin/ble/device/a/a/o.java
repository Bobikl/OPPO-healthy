package com.lifesense.plugin.ble.device.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.lifesense.plugin.ble.OnSearchingListener;
import com.lifesense.plugin.ble.data.IBManagerConfig;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDeviceType;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.LSScanIntervalConfig;
import com.lifesense.plugin.ble.data.other.BleScanResults;
import com.lifesense.plugin.ble.data.other.BroadcastType;
import com.lifesense.plugin.ble.data.other.DeviceFilterInfo;
import com.lifesense.plugin.ble.data.other.ScanMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale"})
public class o extends com.lifesense.plugin.ble.device.a.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static List f8723j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static BroadcastType f8724l;
    private static ScanMode m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static o f8725n;
    private List A;
    private List B;
    private int C;
    private int D;
    private boolean E;
    private OnSearchingListener F;
    private LSManagerStatus G;
    private int H;
    private Map I;
    private LSScanIntervalConfig J;
    private LSScanIntervalConfig K;
    private com.lifesense.plugin.ble.device.a.b o;
    private BroadcastType p;
    private List q;
    private ScanMode r;
    private boolean s;
    private List t;
    private HandlerThread u;
    private t v;
    private boolean w;
    private List x;
    private Map z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8726c = 1;
    final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8727e = 3;
    final int f = 4;
    final int g = 5;
    final String h = "kScanRssi";
    final String i = "kScanRecord";
    private boolean k = true;
    private com.lifesense.plugin.ble.a.d L = new p(this);
    private Runnable M = new q(this);
    private Runnable N = new r(this);
    private Runnable O = new s(this);
    private boolean y = false;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LSDeviceType.FatScale);
        arrayList.add(LSDeviceType.WeightScale);
        arrayList.add(LSDeviceType.HeightMeter);
        arrayList.add(LSDeviceType.ActivityTracker);
        arrayList.add(LSDeviceType.KitchenScale);
        arrayList.add(LSDeviceType.BloodPressureMeter);
        arrayList.add(LSDeviceType.BloodGlucoseMeter);
        f8723j = Collections.unmodifiableList(arrayList);
        f8724l = BroadcastType.ALL;
        m = ScanMode.SCAN_FOR_NORMAL;
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        com.lifesense.plugin.ble.device.a.b bVar;
        if (this.o != null && ScanMode.SCAN_FOR_SYNC == this.r) {
            if (this.k) {
                List<LSDeviceInfo> listA = a(this.A, this.z);
                if (listA != null && listA.size() > 0) {
                    boolean z = false;
                    for (LSDeviceInfo lSDeviceInfo : listA) {
                        boolean zF = u.a().f(lSDeviceInfo.getBroadcastID());
                        if (!f(lSDeviceInfo.getDeviceName()) || zF) {
                            printLogMessage(getGeneralLogInfo(null, "no permission to callback scan results from caching:" + lSDeviceInfo.getDeviceName() + "[" + lSDeviceInfo.getMacAddress() + "];filter:" + this.I, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
                        } else {
                            printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "get device from scan caching,scan count =" + this.C, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
                            this.o.a(lSDeviceInfo.getMacAddress(), lSDeviceInfo);
                            z = true;
                        }
                    }
                    if (!z && this.A.size() != listA.size() && !l()) {
                        printLogMessage(getGeneralLogInfo(null, "no scan caching,scan count =" + this.C + "; tarDevices=" + this.A.size() + "; cacheDevices=" + listA.size(), com.lifesense.plugin.ble.b.a.a.Scan_Message, null, false));
                        this.o.a();
                        return;
                    }
                } else if (l()) {
                    printLogMessage(getGeneralLogInfo(null, "no permission to callback scan results from caching;filter info=" + this.I, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
                } else {
                    printLogMessage(getGeneralLogInfo(null, "no scan caching, call back scan response:" + this.C, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, false));
                    bVar = this.o;
                }
                return;
            }
            printLogMessage(getGeneralLogInfo(null, "no permission to use scan caching,call back scan failure, scan count =" + this.C, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, false));
            bVar = this.o;
            bVar.a();
            return;
        }
        printLogMessage(getGeneralLogInfo(null, "failed to handle scan failure event, scanMode=" + this.r, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
    }

    public static /* synthetic */ int o(o oVar) {
        int i = oVar.C;
        oVar.C = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long p() {
        LSScanIntervalConfig lSScanIntervalConfig = this.J;
        if (lSScanIntervalConfig != null) {
            return lSScanIntervalConfig.getScanTime();
        }
        return 10000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        t tVar = this.v;
        if (tVar != null) {
            this.E = false;
            tVar.removeCallbacks(this.M);
            this.v.removeCallbacks(this.N);
        }
    }

    private synchronized boolean l() {
        Map map = this.I;
        if (map != null && map.size() != 0) {
            List list = (List) this.I.get(this.r.toString().toUpperCase());
            return (list == null || list.size() == 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LSScanIntervalConfig lSScanIntervalConfig = this.J;
        if (lSScanIntervalConfig == null) {
            this.v.postDelayed(this.N, 10000L);
        } else if (lSScanIntervalConfig.isEnable()) {
            this.v.postDelayed(this.N, this.J.getScanTime() > 10000 ? this.J.getScanTime() : 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LSScanIntervalConfig lSScanIntervalConfig = this.J;
        if (lSScanIntervalConfig == null) {
            this.v.postDelayed(this.M, 10000L);
        } else if (lSScanIntervalConfig.isEnable()) {
            this.v.postDelayed(this.M, this.J.getPausesTime() > 3000 ? this.J.getPausesTime() : 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long o() {
        LSScanIntervalConfig lSScanIntervalConfig = this.J;
        if (lSScanIntervalConfig != null) {
            return lSScanIntervalConfig.getPausesTime();
        }
        return 10000L;
    }

    public String c(String str) {
        LSDeviceInfo lSDeviceInfoB = b(str);
        return (lSDeviceInfoB == null || lSDeviceInfoB.getDiscoveryTime() <= 0) ? "null" : com.lifesense.plugin.ble.c.b.a(lSDeviceInfoB.getDiscoveryTime());
    }

    public synchronized void e() {
        this.H = 0;
        t tVar = this.v;
        if (tVar != null) {
            tVar.removeCallbacks(this.O);
        }
    }

    public Map g() {
        return this.I;
    }

    public synchronized boolean h() {
        return this.s;
    }

    public String i() {
        LSScanIntervalConfig lSScanIntervalConfig = this.J;
        return lSScanIntervalConfig == null ? "LSScanIntervalConfig: default" : lSScanIntervalConfig.toString();
    }

    public LSDeviceInfo b(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA != null && (map = this.z) != null && map.size() != 0) {
            for (String str2 : this.z.keySet()) {
                if (strA.equalsIgnoreCase(str2)) {
                    return (LSDeviceInfo) this.z.get(str2);
                }
            }
        }
        return null;
    }

    public void c() {
        this.H = 0;
        this.v.removeCallbacks(this.O);
        k();
        com.lifesense.plugin.ble.a.e.a().e();
        if (h()) {
            a(false);
            Message messageObtainMessage = this.v.obtainMessage();
            messageObtainMessage.arg1 = 2;
            this.v.sendMessage(messageObtainMessage);
        }
    }

    @SuppressLint({"NewApi"})
    public synchronized void d() {
        List list = this.A;
        if (list != null) {
            list.clear();
        }
        Map map = this.z;
        if (map != null) {
            map.clear();
            this.z = new ConcurrentSkipListMap();
        }
        t tVar = this.v;
        if (tVar != null) {
            tVar.removeCallbacks(this.M);
            this.v.removeCallbacks(this.N);
        }
    }

    @SuppressLint({"NewApi"})
    public synchronized void f() {
        try {
            this.y = false;
            HandlerThread handlerThread = this.u;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.u = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0172 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x019c A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e5 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x021c A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0222 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0227 A[Catch: Exception -> 0x0237, all -> 0x0259, TryCatch #0 {Exception -> 0x0237, blocks: (B:9:0x0021, B:11:0x002e, B:13:0x0034, B:15:0x0043, B:16:0x004b, B:21:0x006c, B:23:0x0072, B:25:0x008a, B:26:0x008e, B:27:0x0091, B:29:0x00a8, B:31:0x00b4, B:34:0x00e0, B:36:0x00e6, B:39:0x00ee, B:41:0x00fa, B:44:0x0107, B:46:0x0113, B:48:0x0119, B:52:0x0133, B:74:0x01d9, B:76:0x01e5, B:78:0x01eb, B:80:0x01fc, B:79:0x01f0, B:81:0x0204, B:83:0x0210, B:85:0x021c, B:87:0x0222, B:89:0x0233, B:88:0x0227, B:51:0x0127, B:53:0x0138, B:55:0x0140, B:57:0x0148, B:58:0x0155, B:62:0x016b, B:61:0x015f, B:63:0x0172, B:65:0x019c, B:67:0x01a1, B:69:0x01b3, B:70:0x01bd, B:71:0x01c1, B:73:0x01cf, B:33:0x00bc, B:17:0x004f, B:18:0x0054, B:20:0x005c), top: B:98:0x0021, outer: #1 }] */
    private synchronized LSDeviceInfo a(BleScanResults bleScanResults, String str, String str2, List list) {
        byte[] bArrB;
        String strI;
        String strC;
        String strReplace;
        String strReplace2;
        String strB;
        String strSubstring = null;
        if (bleScanResults == null) {
            return null;
        }
        LSDeviceInfo lSDeviceInfo = new LSDeviceInfo();
        lSDeviceInfo.setMacAddress(bleScanResults.getAddress());
        lSDeviceInfo.setRssi(bleScanResults.getRssi());
        lSDeviceInfo.setServiceUuid(com.lifesense.plugin.ble.c.b.c(list));
        try {
            lSDeviceInfo.setDeviceName(str2);
            if (str2.charAt(0) != '0' || str2.length() <= 6) {
                if (str2.charAt(0) == '1') {
                    lSDeviceInfo.setDeviceName(com.lifesense.plugin.ble.c.c.b(bleScanResults.getScanRecord()).substring(1));
                } else {
                    if (str2.length() >= 6) {
                        strB = com.lifesense.plugin.ble.device.proto.e.a().b(str2.substring(1, 6));
                        if (LSProtocolType.A3_1.toString().equals(str)) {
                            strB = str2.substring(1);
                        }
                        lSDeviceInfo.setModelNumber(strB);
                    }
                    lSDeviceInfo.setDeviceType(com.lifesense.plugin.ble.c.c.a(list));
                    lSDeviceInfo.setProtocolType(str);
                    lSDeviceInfo.setManufactureData(com.lifesense.plugin.ble.c.c.g(bleScanResults.getScanRecord()));
                    if (str != null) {
                        if (LSProtocolType.UpgradeOfApollo.toString().equalsIgnoreCase(str) || str2.startsWith("LsD")) {
                            String strA = com.lifesense.plugin.ble.c.c.a(lSDeviceInfo.getMacAddress());
                            StringBuilder sb = new StringBuilder();
                            sb.append("Warning,reset mac address on upgrade model,old address=");
                            sb.append(bleScanResults.getAddress());
                            sb.append("; new address=");
                            sb.append(strA);
                            lSDeviceInfo.setMacAddress(strA);
                        }
                        if (!com.lifesense.plugin.ble.device.proto.e.a(str) || com.lifesense.plugin.ble.c.c.b(str2)) {
                            lSDeviceInfo.setDeviceName(com.lifesense.plugin.ble.c.c.b(bleScanResults.getScanRecord()));
                            lSDeviceInfo.setDeviceType(com.lifesense.plugin.ble.c.c.a(lSDeviceInfo.getDeviceName(), list));
                            lSDeviceInfo.setBroadcastID(str2);
                            lSDeviceInfo.setPairStatus(0);
                            bArrB = com.lifesense.plugin.ble.c.a.b(lSDeviceInfo.getManufactureData());
                            strI = com.lifesense.plugin.ble.c.c.i(bArrB);
                            if (bArrB != null || bArrB.length < 11) {
                                strC = com.lifesense.plugin.ble.device.proto.A5.parser.f.c(strI, bleScanResults.getAddress());
                                if (!TextUtils.isEmpty(strC)) {
                                    lSDeviceInfo.setDeviceId(strC);
                                    lSDeviceInfo.setDeviceSn(com.lifesense.plugin.ble.device.proto.A5.parser.f.d(strC));
                                }
                            } else {
                                int iH = com.lifesense.plugin.ble.c.c.h(bArrB);
                                String strC2 = com.lifesense.plugin.ble.device.proto.A5.parser.f.c(strI, bleScanResults.getAddress());
                                if (!TextUtils.isEmpty(strC2)) {
                                    lSDeviceInfo.setDeviceId(strC2);
                                    lSDeviceInfo.setDeviceSn(com.lifesense.plugin.ble.device.proto.A5.parser.f.d(strC2));
                                }
                                lSDeviceInfo.setHeartRate(iH);
                            }
                        } else if (str.equals(LSProtocolType.Kitchen.toString()) || str.equals(LSProtocolType.Universal.toString())) {
                            lSDeviceInfo.setDeviceName(str2);
                            if (bleScanResults.getAddress() != null) {
                                str2 = bleScanResults.getAddress().replace(":", "");
                            }
                            lSDeviceInfo.setBroadcastID(str2);
                            lSDeviceInfo.setPairStatus(0);
                        } else if (str.equals(LSProtocolType.BPMStart.toString()) && str2.charAt(0) == '0') {
                            lSDeviceInfo.setDeviceName(str2.substring(1));
                            if (bleScanResults.getAddress() != null) {
                                str2 = bleScanResults.getAddress().replace(":", "");
                            }
                            lSDeviceInfo.setBroadcastID(str2);
                        } else if (str2.startsWith("0") || str2.startsWith("1")) {
                            lSDeviceInfo.setPairStatus(Integer.parseInt(str2.substring(0, 1)));
                        }
                        if (str.equals(LSProtocolType.WechatGlucoseMeter.toString())) {
                            if (bleScanResults.getAddress() == null) {
                                strReplace2 = lSDeviceInfo.getBroadcastID();
                            } else {
                                strReplace2 = bleScanResults.getAddress().replace(":", "");
                            }
                            lSDeviceInfo.setBroadcastID(strReplace2);
                            lSDeviceInfo.setDeviceType("06");
                        }
                        if (str.equals(LSProtocolType.Standard.toString()) || str.equalsIgnoreCase(LSProtocolType.OP.toString())) {
                            if (bleScanResults.getAddress() == null) {
                                strReplace = lSDeviceInfo.getBroadcastID();
                            } else {
                                strReplace = bleScanResults.getAddress().replace(":", "");
                            }
                            lSDeviceInfo.setBroadcastID(strReplace);
                        }
                    }
                }
                return lSDeviceInfo;
            }
            lSDeviceInfo.setDeviceName(str2.substring(1));
            int length = str2.length() - 8;
            strSubstring = length >= 0 ? str2.substring(length, str2.length()) : str2.substring(6);
            lSDeviceInfo.setBroadcastID(strSubstring);
            if (str2.length() >= 6) {
                strB = com.lifesense.plugin.ble.device.proto.e.a().b(str2.substring(1, 6));
                if (LSProtocolType.A3_1.toString().equals(str)) {
                    strB = str2.substring(1);
                }
                lSDeviceInfo.setModelNumber(strB);
            }
            lSDeviceInfo.setDeviceType(com.lifesense.plugin.ble.c.c.a(list));
            lSDeviceInfo.setProtocolType(str);
            lSDeviceInfo.setManufactureData(com.lifesense.plugin.ble.c.c.g(bleScanResults.getScanRecord()));
            if (str != null) {
                if (LSProtocolType.UpgradeOfApollo.toString().equalsIgnoreCase(str)) {
                    String strA2 = com.lifesense.plugin.ble.c.c.a(lSDeviceInfo.getMacAddress());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Warning,reset mac address on upgrade model,old address=");
                    sb2.append(bleScanResults.getAddress());
                    sb2.append("; new address=");
                    sb2.append(strA2);
                    lSDeviceInfo.setMacAddress(strA2);
                } else {
                    String strA3 = com.lifesense.plugin.ble.c.c.a(lSDeviceInfo.getMacAddress());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Warning,reset mac address on upgrade model,old address=");
                    sb3.append(bleScanResults.getAddress());
                    sb3.append("; new address=");
                    sb3.append(strA3);
                    lSDeviceInfo.setMacAddress(strA3);
                }
                if (com.lifesense.plugin.ble.device.proto.e.a(str)) {
                    lSDeviceInfo.setDeviceName(com.lifesense.plugin.ble.c.c.b(bleScanResults.getScanRecord()));
                    lSDeviceInfo.setDeviceType(com.lifesense.plugin.ble.c.c.a(lSDeviceInfo.getDeviceName(), list));
                    lSDeviceInfo.setBroadcastID(str2);
                    lSDeviceInfo.setPairStatus(0);
                    bArrB = com.lifesense.plugin.ble.c.a.b(lSDeviceInfo.getManufactureData());
                    strI = com.lifesense.plugin.ble.c.c.i(bArrB);
                    if (bArrB != null) {
                        strC = com.lifesense.plugin.ble.device.proto.A5.parser.f.c(strI, bleScanResults.getAddress());
                        if (!TextUtils.isEmpty(strC)) {
                            lSDeviceInfo.setDeviceId(strC);
                            lSDeviceInfo.setDeviceSn(com.lifesense.plugin.ble.device.proto.A5.parser.f.d(strC));
                        }
                    } else {
                        strC = com.lifesense.plugin.ble.device.proto.A5.parser.f.c(strI, bleScanResults.getAddress());
                        if (!TextUtils.isEmpty(strC)) {
                            lSDeviceInfo.setDeviceId(strC);
                            lSDeviceInfo.setDeviceSn(com.lifesense.plugin.ble.device.proto.A5.parser.f.d(strC));
                        }
                    }
                } else {
                    lSDeviceInfo.setDeviceName(com.lifesense.plugin.ble.c.c.b(bleScanResults.getScanRecord()));
                    lSDeviceInfo.setDeviceType(com.lifesense.plugin.ble.c.c.a(lSDeviceInfo.getDeviceName(), list));
                    lSDeviceInfo.setBroadcastID(str2);
                    lSDeviceInfo.setPairStatus(0);
                    bArrB = com.lifesense.plugin.ble.c.a.b(lSDeviceInfo.getManufactureData());
                    strI = com.lifesense.plugin.ble.c.c.i(bArrB);
                    if (bArrB != null) {
                        strC = com.lifesense.plugin.ble.device.proto.A5.parser.f.c(strI, bleScanResults.getAddress());
                        if (!TextUtils.isEmpty(strC)) {
                            lSDeviceInfo.setDeviceId(strC);
                            lSDeviceInfo.setDeviceSn(com.lifesense.plugin.ble.device.proto.A5.parser.f.d(strC));
                        }
                    } else {
                        strC = com.lifesense.plugin.ble.device.proto.A5.parser.f.c(strI, bleScanResults.getAddress());
                        if (!TextUtils.isEmpty(strC)) {
                            lSDeviceInfo.setDeviceId(strC);
                            lSDeviceInfo.setDeviceSn(com.lifesense.plugin.ble.device.proto.A5.parser.f.d(strC));
                        }
                    }
                }
                if (str.equals(LSProtocolType.WechatGlucoseMeter.toString())) {
                    if (bleScanResults.getAddress() == null) {
                        strReplace2 = lSDeviceInfo.getBroadcastID();
                    } else {
                        strReplace2 = bleScanResults.getAddress().replace(":", "");
                    }
                    lSDeviceInfo.setBroadcastID(strReplace2);
                    lSDeviceInfo.setDeviceType("06");
                }
                if (str.equals(LSProtocolType.Standard.toString())) {
                    if (bleScanResults.getAddress() == null) {
                        strReplace = lSDeviceInfo.getBroadcastID();
                    } else {
                        strReplace = bleScanResults.getAddress().replace(":", "");
                    }
                    lSDeviceInfo.setBroadcastID(strReplace);
                } else {
                    if (bleScanResults.getAddress() == null) {
                        strReplace = lSDeviceInfo.getBroadcastID();
                    } else {
                        strReplace = bleScanResults.getAddress().replace(":", "");
                    }
                    lSDeviceInfo.setBroadcastID(strReplace);
                }
            }
        } catch (Exception e2) {
            printLogMessage(getPrintLogInfo("faield to parse scan results,has exception >>" + bleScanResults.toString(), 1));
            e2.printStackTrace();
        }
        return lSDeviceInfo;
    }

    public synchronized void b() {
        this.F = null;
        LSManagerStatus lSManagerStatus = this.G;
        LSManagerStatus lSManagerStatus2 = LSManagerStatus.Free;
        if (lSManagerStatus == lSManagerStatus2) {
            return;
        }
        this.G = lSManagerStatus2;
        c();
    }

    public static synchronized o a() {
        o oVar = f8725n;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o();
        f8725n = oVar2;
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.lifesense.plugin.ble.device.a.b bVar) {
        if (this.r != ScanMode.SCAN_FOR_SYNC || bVar == null) {
            return;
        }
        List<BluetoothDevice> listF = com.lifesense.plugin.ble.a.e.a().f();
        if (listF != null && !listF.isEmpty()) {
            for (BluetoothDevice bluetoothDevice : listF) {
                if (bluetoothDevice != null && bluetoothDevice.getAddress() != null) {
                    BleScanResults bleScanResults = new BleScanResults();
                    bleScanResults.setDevice(bluetoothDevice);
                    bleScanResults.setAddress(bluetoothDevice.getAddress());
                    bleScanResults.setName(bluetoothDevice.getName());
                    printLogMessage(getGeneralLogInfo(null, "scan connected device for sync=" + bluetoothDevice.getName() + "[" + bluetoothDevice.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    bVar.a(bleScanResults);
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
                printLogMessage(getGeneralLogInfo(null, "scan bond device for sync=" + bluetoothDevice2.getName() + "[" + bluetoothDevice2.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                bVar.a(bleScanResults2);
            }
        }
    }

    private synchronized boolean d(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (!this.w) {
                    return true;
                }
                List list = this.t;
                if (list == null || list.size() <= 0) {
                    return false;
                }
                if (str.length() > 5) {
                    str = str.substring(0, 5);
                }
                return this.t.contains(str);
            }
        }
        return false;
    }

    private synchronized boolean e(String str) {
        List list = this.x;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    private synchronized boolean f(String str) {
        Map map = this.I;
        if (map != null && map.size() != 0) {
            List list = (List) this.I.get(this.r.toString().toUpperCase());
            if (list != null && list.size() != 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (com.lifesense.plugin.ble.c.b.a(str, (DeviceFilterInfo) it.next())) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.lifesense.plugin.ble.device.a.b bVar) {
        if (this.r != ScanMode.SCAN_FOR_UPGRADE || bVar == null) {
            return;
        }
        List<BluetoothDevice> listF = com.lifesense.plugin.ble.a.e.a().f();
        if (listF != null && !listF.isEmpty()) {
            for (BluetoothDevice bluetoothDevice : listF) {
                if (bluetoothDevice != null && bluetoothDevice.getAddress() != null) {
                    BleScanResults bleScanResults = new BleScanResults();
                    bleScanResults.setDevice(bluetoothDevice);
                    bleScanResults.setAddress(bluetoothDevice.getAddress());
                    bleScanResults.setName(bluetoothDevice.getName());
                    printLogMessage(getGeneralLogInfo(null, "scan connected device for ota =" + bluetoothDevice.getName() + "[" + bluetoothDevice.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    bVar.a(bleScanResults);
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
                printLogMessage(getGeneralLogInfo(null, "scan bond device for ota=" + bluetoothDevice2.getName() + "[" + bluetoothDevice2.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                bVar.a(bleScanResults2);
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    private List a(List list, Map map) {
        if (list == null || list.size() == 0 || map == null || map.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setKeySet = map.keySet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            for (String str2 : setKeySet) {
                String upperCase = str.toUpperCase();
                String upperCase2 = str2.replace(":", "").toUpperCase();
                if (upperCase.contains(upperCase2) || upperCase.equalsIgnoreCase(upperCase2)) {
                    printLogMessage(getSupperLogInfo(str2, "success to get device form scan caching,mac = " + str2, com.lifesense.plugin.ble.b.a.a.Scan_Caching, null, true));
                    arrayList.add(map.get(str2));
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private synchronized void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LSDeviceType lSDeviceType = (LSDeviceType) it.next();
            if (lSDeviceType != null && lSDeviceType != LSDeviceType.Unknown) {
                List listE = com.lifesense.plugin.ble.device.proto.e.a().e(com.lifesense.plugin.ble.device.proto.e.a().a(lSDeviceType));
                if (listE != null && !this.x.containsAll(listE)) {
                    this.x.addAll(listE);
                }
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    private synchronized boolean b(BleScanResults bleScanResults) {
        if (bleScanResults == null) {
            return false;
        }
        if (bleScanResults.getAddress() != null && bleScanResults.getAddress().length() != 0) {
            if (bleScanResults.getScanRecord() != null && bleScanResults.getScanRecord().length != 0) {
                if (ScanMode.SCAN_FOR_SYNC != this.r) {
                    return true;
                }
                List list = this.A;
                if (list == null || list.size() <= 0) {
                    return false;
                }
                for (String str : this.A) {
                    String upperCase = str.toUpperCase();
                    String upperCase2 = bleScanResults.getAddress().replace(":", "").toUpperCase();
                    if (!upperCase.contains(upperCase2) && !upperCase.equalsIgnoreCase(upperCase2)) {
                        if (a(str, bleScanResults.getName())) {
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public synchronized void a(int i, com.lifesense.plugin.ble.device.a.c cVar) {
        this.H = 0;
        if (com.lifesense.plugin.ble.device.a.c.UPGRADING == cVar && this.v != null) {
            printLogMessage(getGeneralLogInfo(null, "init upgrading scan timeout...", com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
            this.v.removeCallbacks(this.O);
            this.H = i;
            this.v.postDelayed(this.O, i);
        }
    }

    @Override // com.lifesense.plugin.ble.device.a.a
    @SuppressLint({"NewApi"})
    public synchronized void a(Context context, com.lifesense.plugin.ble.device.a.b bVar) {
        super.a(context, bVar);
        if (this.y) {
            return;
        }
        this.G = LSManagerStatus.Free;
        HandlerThread handlerThread = new HandlerThread("ScanCentreThread");
        this.u = handlerThread;
        handlerThread.start();
        this.v = new t(this, this.u.getLooper());
        a(false);
        this.H = 0;
        this.E = false;
        this.D = 0;
        this.C = 0;
        this.y = true;
        this.w = false;
        this.t = null;
        this.r = m;
        this.p = f8724l;
        this.q = f8723j;
        this.x = null;
        this.z = new ConcurrentSkipListMap();
        this.A = null;
        this.B = new ArrayList();
    }

    public void a(IBManagerConfig iBManagerConfig) {
        if (iBManagerConfig == null) {
            this.J = null;
            this.K = null;
        } else if (iBManagerConfig instanceof LSScanIntervalConfig) {
            LSScanIntervalConfig lSScanIntervalConfig = (LSScanIntervalConfig) iBManagerConfig;
            if (lSScanIntervalConfig.getPairDevice() != null) {
                this.K = lSScanIntervalConfig;
            } else {
                this.J = lSScanIntervalConfig;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(BleScanResults bleScanResults) {
        if (b(bleScanResults)) {
            byte[] scanRecord = bleScanResults.getScanRecord();
            String address = bleScanResults.getAddress();
            List listA = com.lifesense.plugin.ble.c.c.a(scanRecord);
            String strB = com.lifesense.plugin.ble.c.c.b(com.lifesense.plugin.ble.c.c.b(scanRecord), listA);
            String strA = com.lifesense.plugin.ble.c.c.a(scanRecord, strB, address);
            if (a(listA, strA)) {
                LSDeviceInfo lSDeviceInfoA = a(bleScanResults, strB, strA, listA);
                if (lSDeviceInfoA == null) {
                    return;
                }
                lSDeviceInfoA.setDiscoveryTime(System.currentTimeMillis());
                if (lSDeviceInfoA.getProtocolType() != null && !LSProtocolType.A3.toString().equalsIgnoreCase(lSDeviceInfoA.getProtocolType())) {
                    if (this.z.containsKey(lSDeviceInfoA.getMacAddress())) {
                        this.z.remove(lSDeviceInfoA.getMacAddress());
                    }
                    this.z.put(lSDeviceInfoA.getMacAddress(), lSDeviceInfoA);
                }
                if (lSDeviceInfoA.getProtocolType() != null && LSProtocolType.A6.toString().equalsIgnoreCase(lSDeviceInfoA.getProtocolType())) {
                    lSDeviceInfoA.setRegisterStatus(com.lifesense.plugin.ble.c.c.c(scanRecord));
                    lSDeviceInfoA.setCompanyID(com.lifesense.plugin.ble.c.c.d(scanRecord));
                    lSDeviceInfoA.setManufactureId(com.lifesense.plugin.ble.c.c.e(scanRecord));
                }
                if (this.o != null && f(lSDeviceInfoA.getDeviceName())) {
                    com.lifesense.plugin.ble.b.d.a().a(lSDeviceInfoA.getMacAddress(), com.lifesense.plugin.ble.b.a.a.Scan_Results, true, lSDeviceInfoA.getBroadcastData(), null);
                    this.o.a(address, lSDeviceInfoA);
                } else if (this.F == null || this.G != LSManagerStatus.Scanning) {
                    printLogMessage(getPrintLogInfo("failed to callback scan resutls:" + lSDeviceInfoA.getDeviceName() + ";filter:" + this.I, 1));
                } else if (f(lSDeviceInfoA.getDeviceName())) {
                    this.F.onSearchResults(lSDeviceInfoA);
                }
            }
        }
    }

    public synchronized void a(BroadcastType broadcastType, List list) {
        this.p = f8724l;
        if (broadcastType != null) {
            this.p = broadcastType;
        }
        this.q = f8723j;
        if (list != null && list.size() > 0) {
            this.q = list;
        }
        this.x = new ArrayList();
        b(this.q);
    }

    public synchronized void a(BroadcastType broadcastType, List list, OnSearchingListener onSearchingListener) {
        if (onSearchingListener == null) {
            return;
        }
        if (this.G != LSManagerStatus.Free) {
            printLogMessage(getPrintLogInfo("failed to scan ble device,status error >> " + this.G, 1));
            return;
        }
        this.G = LSManagerStatus.Scanning;
        this.F = onSearchingListener;
        List<BluetoothDevice> listF = com.lifesense.plugin.ble.a.e.a().f();
        if (listF != null && listF.size() > 0) {
            for (BluetoothDevice bluetoothDevice : listF) {
                if (bluetoothDevice != null && bluetoothDevice.getAddress() != null && f(bluetoothDevice.getName())) {
                    onSearchingListener.onSystemConnectedDevice(bluetoothDevice.getName(), bluetoothDevice.getAddress());
                }
            }
        }
        Set<BluetoothDevice> setJ = com.lifesense.plugin.ble.a.e.a().j();
        if (setJ != null && setJ.size() > 0) {
            for (BluetoothDevice bluetoothDevice2 : setJ) {
                if (bluetoothDevice2 != null && f(bluetoothDevice2.getName())) {
                    onSearchingListener.onSystemBondDevice(bluetoothDevice2);
                }
            }
        }
        a(broadcastType, list);
        a(ScanMode.SCAN_FOR_NORMAL, (com.lifesense.plugin.ble.device.a.b) null);
    }

    public synchronized void a(ScanMode scanMode, com.lifesense.plugin.ble.device.a.b bVar) {
        a(true);
        this.o = bVar;
        if (scanMode != null) {
            this.r = scanMode;
        }
        if (ScanMode.SCAN_FOR_SYNC == scanMode && this.k) {
            a(bVar);
            LSScanIntervalConfig lSScanIntervalConfig = this.K;
            if (lSScanIntervalConfig != null && lSScanIntervalConfig.getPairDevice() != null) {
                printLogMessage(getGeneralLogInfo(null, "skip scanning and connect the device directly = " + this.K.getPairDevice().getBroadcastID(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                this.K = null;
                this.o.a();
                return;
            }
        }
        Message messageObtainMessage = this.v.obtainMessage();
        messageObtainMessage.arg1 = 1;
        this.v.sendMessage(messageObtainMessage);
    }

    private void a(com.lifesense.plugin.ble.device.a.b bVar) {
        List<LSDeviceInfo> listA = a(this.A, this.z);
        if (listA == null || listA.size() == 0) {
            return;
        }
        for (LSDeviceInfo lSDeviceInfo : listA) {
            if (lSDeviceInfo == null || !LSProtocolType.A3.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType())) {
                if (bVar != null) {
                    bVar.a(lSDeviceInfo.getMacAddress(), lSDeviceInfo);
                }
            }
        }
    }

    public void a(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.z) == null || map.size() <= 0 || !this.z.containsKey(strA)) {
            return;
        }
        this.z.remove(strA);
    }

    public synchronized void a(Map map) {
        if (map != null) {
            if (map.size() > 0) {
                Set<String> setKeySet = map.keySet();
                this.A = new ArrayList(setKeySet);
                for (String str : setKeySet) {
                    LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) map.get(str);
                    if (lSDeviceInfo.getMacAddress() != null) {
                        String strReplace = lSDeviceInfo.getMacAddress().replace(":", "");
                        if (str.equalsIgnoreCase(strReplace)) {
                            continue;
                        } else {
                            this.A.remove(str);
                            this.A.add(strReplace);
                        }
                    }
                }
            }
        }
    }

    private synchronized void a(boolean z) {
        this.s = z;
    }

    private boolean a(String str, String str2) {
        int length;
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && str2.startsWith("0") && (length = str2.length() - 8) >= 0 && length <= str2.length()) {
                String upperCase = str2.substring(length).toUpperCase();
                return upperCase.equalsIgnoreCase(str) || str.contains(upperCase) || str.endsWith(upperCase);
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private synchronized boolean a(List list) {
        boolean zE = false;
        if (list != null) {
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zE = e(((UUID) it.next()).toString());
                    if (zE) {
                        return true;
                    }
                }
                return zE;
            }
        }
        return false;
    }

    private synchronized boolean a(List list, String str) {
        if (str != null) {
            if (str.length() != 0) {
                char cCharAt = str.charAt(0);
                BroadcastType broadcastType = this.p;
                if (broadcastType == BroadcastType.UNKNOWN) {
                    return true;
                }
                if (broadcastType == BroadcastType.ALL) {
                    return a(list) | com.lifesense.plugin.ble.c.c.b(str);
                }
                if (broadcastType == BroadcastType.PAIR && cCharAt == '1') {
                    if (d(str.length() > 6 ? str.substring(1, 6) : str.substring(1))) {
                        return a(list);
                    }
                    return false;
                }
                if (broadcastType == BroadcastType.NORMAL && cCharAt == '0') {
                    return a(list);
                }
                return false;
            }
        }
        return false;
    }
}
