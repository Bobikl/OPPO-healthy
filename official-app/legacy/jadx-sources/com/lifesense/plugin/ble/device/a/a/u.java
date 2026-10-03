package com.lifesense.plugin.ble.device.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.lifesense.plugin.ble.OnReadingListener;
import com.lifesense.plugin.ble.OnSyncingListener;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDeviceType;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.other.BroadcastType;
import com.lifesense.plugin.ble.data.other.HandlerMessage;
import com.lifesense.plugin.ble.data.other.MultiProtocolDevice;
import com.lifesense.plugin.ble.data.other.ScanMode;
import com.lifesense.plugin.ble.data.tracker.ATBatteryInfo;
import com.lifesense.plugin.ble.data.tracker.ATControlData;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.lifesense.plugin.ble.data.tracker.ATDeviceData;
import com.lifesense.plugin.ble.data.tracker.ATHeartRateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale"})
public class u extends com.lifesense.plugin.ble.device.a.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static u f8728l;
    private HandlerThread m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f8732n;
    private LSManagerStatus o;
    private Map p;
    private Map q;
    private boolean r;
    private BroadcastType t;
    private OnSyncingListener u;
    private int v;
    private LSManagerStatus w;
    private List x;
    private List y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8729c = 1;
    final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8730e = 3;
    final int f = 4;
    final int g = 5;
    final int h = 7;
    final int i = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f8731j = 16;
    final int k = 17;
    private com.lifesense.plugin.ble.device.a.b z = new v(this);
    private com.lifesense.plugin.ble.device.a.b A = new w(this);
    private List s = new ArrayList();

    private u() {
    }

    private synchronized boolean i() {
        if (!com.lifesense.plugin.ble.a.e.a().c()) {
            printLogMessage(getGeneralLogInfo(null, "faield to startup syncing service,bluetooth unavailiable..", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return false;
        }
        LSManagerStatus lSManagerStatusB = b();
        LSManagerStatus lSManagerStatus = LSManagerStatus.Syncing;
        if (lSManagerStatusB == lSManagerStatus && o.a().h()) {
            printLogMessage(getGeneralLogInfo(null, "try to startup syncing service again,isScanning.....", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return true;
        }
        a(lSManagerStatus, "start up data sync");
        this.t = BroadcastType.ALL;
        o.a().a(this.t, this.s);
        o.a().a(this.q);
        List listC = com.lifesense.plugin.ble.device.proto.e.a().c(this.q);
        if (listC != null && listC.size() != 0) {
            Set setJ = com.lifesense.plugin.ble.a.e.a().j();
            if (setJ != null && setJ.size() > 0) {
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    printLogMessage(getSupperLogInfo(null, "system bond device= " + com.lifesense.plugin.ble.c.b.a((BluetoothDevice) it.next()), com.lifesense.plugin.ble.b.a.a.Check_Connected, null, true));
                }
            }
            List<MultiProtocolDevice> listA = com.lifesense.plugin.ble.device.proto.e.a().a(listC, setJ);
            if (listA != null && listA.size() != 0) {
                for (MultiProtocolDevice multiProtocolDevice : listA) {
                    String address = multiProtocolDevice.getBleDevice().getAddress();
                    String protocolType = multiProtocolDevice.getLsDevcie().getProtocolType();
                    printLogMessage(getGeneralLogInfo(address, "system connected devices:" + multiProtocolDevice.getLsDevcie().formatStringValue(), com.lifesense.plugin.ble.b.a.a.Check_Connected, null, true));
                    if (LSProtocolType.A5.toString().equalsIgnoreCase(protocolType) || LSProtocolType.WechatCallAT.toString().equalsIgnoreCase(protocolType)) {
                        a(multiProtocolDevice, true);
                    }
                }
                if (this.q.size() != listA.size()) {
                    printLogMessage(getGeneralLogInfo(null, "scan other device broadcast....", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                    o.a().a(ScanMode.SCAN_FOR_SYNC, this.z);
                }
                return true;
            }
            printLogMessage(getGeneralLogInfo(null, "no system connected devices,startup syncing service:" + this.q.size(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            o.a().a(ScanMode.SCAN_FOR_SYNC, this.z);
            return true;
        }
        printLogMessage(getGeneralLogInfo(null, "startup syncing service:" + this.q.size(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        o.a().a(ScanMode.SCAN_FOR_SYNC, this.z);
        return true;
    }

    public synchronized void e() {
        if (this.u == null) {
            printLogMessage(getGeneralLogInfo(null, "faield to restart data sync service,call back obj is null..." + this.u, com.lifesense.plugin.ble.b.a.a.Restart_Service, null, false));
            d();
            return;
        }
        this.v++;
        printLogMessage(getGeneralLogInfo(null, "restart data sync service,count >>" + this.v, com.lifesense.plugin.ble.b.a.a.Restart_Service, null, true));
        d();
        a(this.u);
    }

    public synchronized void f() {
        Map map = this.p;
        if (map != null && !map.isEmpty()) {
            Iterator it = this.p.entrySet().iterator();
            while (it.hasNext()) {
                com.lifesense.plugin.ble.device.proto.q qVar = (com.lifesense.plugin.ble.device.proto.q) ((Map.Entry) it.next()).getValue();
                if (qVar != null) {
                    qVar.b();
                }
            }
            this.p.clear();
        }
    }

    @SuppressLint({"NewApi"})
    public synchronized void g() {
        try {
            HandlerThread handlerThread = this.m;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.m = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public Handler h() {
        return this.f8732n;
    }

    private synchronized LSDeviceInfo b(LSDeviceInfo lSDeviceInfo) {
        LSDeviceInfo lSDeviceInfo2;
        Map map = this.q;
        if (map == null || map.size() <= 0) {
            lSDeviceInfo2 = null;
        } else {
            Iterator it = this.q.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = lSDeviceInfo.getDeviceType() + lSDeviceInfo.getBroadcastID();
                    if (str2 != null && lSDeviceInfo.getBroadcastID() != null && (str.contains(lSDeviceInfo.getBroadcastID()) || str.contains(str2))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("success to get device from map with key=");
                        sb.append(str);
                        lSDeviceInfo2 = (LSDeviceInfo) this.q.get(str);
                    }
                } else {
                    lSDeviceInfo2 = null;
                }
            }
        }
        if (lSDeviceInfo2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("find device by broacast name(");
            sb2.append(lSDeviceInfo.getBroadcastID());
            sb2.append(") has device ? no");
        }
        return lSDeviceInfo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(String str) {
        Map map = this.p;
        if (map != null && !map.isEmpty()) {
            if (str != null && str.length() > 0) {
                String upperCase = str.toUpperCase();
                if (this.p.containsKey(upperCase)) {
                    printLogMessage(getPrintLogInfo("cancel protocol handler with broadcastID=" + upperCase, 1));
                    com.lifesense.plugin.ble.device.proto.q qVar = (com.lifesense.plugin.ble.device.proto.q) this.p.get(upperCase);
                    if (qVar != null) {
                        qVar.b();
                    }
                    this.p.remove(upperCase);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LSDeviceInfo h(String str) {
        Map map;
        if (TextUtils.isEmpty(str) || (map = this.q) == null || map.size() == 0) {
            return null;
        }
        for (String str2 : this.q.keySet()) {
            String strReplace = str.replace(":", "");
            if (str2 != null && (str2.contains(strReplace) || str2.equalsIgnoreCase(strReplace))) {
                return (LSDeviceInfo) this.q.get(str2);
            }
        }
        return null;
    }

    public synchronized Map c() {
        return this.q;
    }

    public com.lifesense.plugin.ble.device.proto.q d(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.p) == null || map.size() == 0) {
            return null;
        }
        return (com.lifesense.plugin.ble.device.proto.q) this.p.get(strA.replace(":", "").toUpperCase());
    }

    public synchronized boolean e(String str) {
        List list;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA != null && (list = this.x) != null && list.size() != 0) {
            return this.x.contains(strA);
        }
        return false;
    }

    public boolean f(String str) {
        Map map = this.p;
        if (map == null || map.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.p.containsKey(str.toUpperCase());
    }

    private synchronized void c(LSDeviceInfo lSDeviceInfo) {
        try {
            if (lSDeviceInfo == null) {
                printLogMessage(getPrintLogInfo("faield to create connection,is null...", 1));
                return;
            }
            if (TextUtils.isEmpty(lSDeviceInfo.getBroadcastID())) {
                printLogMessage(getPrintLogInfo("faield to create connection with device=" + lSDeviceInfo.getBroadcastID(), 1));
                return;
            }
            String macAddress = lSDeviceInfo.getMacAddress();
            Queue queueA = com.lifesense.plugin.ble.device.proto.c.a(lSDeviceInfo);
            if (queueA != null) {
                com.lifesense.plugin.ble.device.proto.q qVarA = com.lifesense.plugin.ble.device.proto.b.a().a(this.a, lSDeviceInfo);
                qVarA.a(this.A);
                this.p.put(lSDeviceInfo.getBroadcastID().toUpperCase(), qVarA);
                qVarA.a(macAddress, queueA, com.lifesense.plugin.ble.device.a.c.SYNCING);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(LSDeviceInfo lSDeviceInfo) {
        if (b() == LSManagerStatus.Syncing) {
            if (f(lSDeviceInfo.getBroadcastID())) {
                printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "no permission to connect again with scan results,mac=" + lSDeviceInfo.getBroadcastID() + ";protocol=" + lSDeviceInfo.getProtocolType(), com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
                return;
            }
            LSDeviceInfo lSDeviceInfoB = b(lSDeviceInfo);
            if (lSDeviceInfoB != null) {
                lSDeviceInfoB.setMacAddress(lSDeviceInfo.getMacAddress());
                if (lSDeviceInfo.getProtocolType() != null && lSDeviceInfo.getProtocolType().length() > 0) {
                    com.lifesense.plugin.ble.b.d.a().a(lSDeviceInfo.getMacAddress(), com.lifesense.plugin.ble.b.a.a.Reset_Protocol, true, "source protocol=" + lSDeviceInfoB.getProtocolType() + ";target protcol=" + lSDeviceInfo.getProtocolType(), null);
                    lSDeviceInfoB.setProtocolType(lSDeviceInfo.getProtocolType());
                }
                o.a().c();
                c(lSDeviceInfoB);
            }
        }
    }

    public LSConnectState a(String str) {
        if (TextUtils.isEmpty(str)) {
            return LSConnectState.Unknown;
        }
        Map map = this.p;
        if (map == null || map.size() <= 0) {
            return LSConnectState.Unknown;
        }
        String upperCase = str.toUpperCase();
        if (str.lastIndexOf(":") != -1) {
            upperCase = str.replace(":", "").toUpperCase();
        }
        if (!this.p.containsKey(upperCase)) {
            return LSConnectState.Unknown;
        }
        com.lifesense.plugin.ble.device.proto.q qVar = (com.lifesense.plugin.ble.device.proto.q) this.p.get(upperCase);
        LSConnectState lSConnectStateH = LSConnectState.Unknown;
        if (qVar != null) {
            lSConnectStateH = qVar.h();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("check device connect status with mac:[");
        sb.append(str);
        sb.append("] >> state=");
        sb.append(lSConnectStateH);
        return lSConnectStateH;
    }

    public synchronized LSManagerStatus b() {
        return this.o;
    }

    public com.lifesense.plugin.ble.device.proto.q b(String str) {
        Map map;
        if (TextUtils.isEmpty(str) || (map = this.p) == null || map.size() <= 0) {
            return null;
        }
        return (com.lifesense.plugin.ble.device.proto.q) this.p.get(str.replace(":", "").toUpperCase());
    }

    public synchronized boolean c(String str) {
        Map map;
        if (str != null) {
            if (str.length() != 0 && (map = this.q) != null) {
                if (map.size() == 0) {
                    printLogMessage(getPrintLogInfo("failed to delete device,no devices...", 1));
                    return false;
                }
                String strReplace = str.toUpperCase().replace(":", "");
                for (String str2 : this.q.keySet()) {
                    if (str2.contains(strReplace) || str2.equalsIgnoreCase(strReplace)) {
                        strReplace = str2;
                        break;
                    }
                }
                if (!this.q.containsKey(strReplace)) {
                    printLogMessage(getGeneralLogInfo(strReplace, "failed to remove device with mac=" + strReplace, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    return false;
                }
                this.q.remove(strReplace);
                printLogMessage(getGeneralLogInfo(strReplace, "remove device with mac=" + strReplace, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                g(strReplace);
                com.lifesense.plugin.ble.b.d.a().a(strReplace);
                return true;
            }
        }
        printLogMessage(getPrintLogInfo("failed to delete device,is null...", 1));
        return false;
    }

    public synchronized boolean d() {
        try {
            LSManagerStatus lSManagerStatusB = b();
            LSManagerStatus lSManagerStatus = LSManagerStatus.Free;
            if (lSManagerStatusB == lSManagerStatus && this.r) {
                return true;
            }
            printLogMessage(getGeneralLogInfo(null, "stop data syncing service now...", com.lifesense.plugin.ble.b.a.a.Stop_Service, null, true));
            a(lSManagerStatus, "stop data sync service");
            this.r = true;
            com.lifesense.plugin.ble.a.e.a().e();
            f();
            o.a().c();
            com.lifesense.plugin.ble.a.a.c.a().b();
            com.lifesense.plugin.ble.device.ancs.e.a().b();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static synchronized u a() {
        u uVar = f8728l;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        f8728l = uVar2;
        return uVar2;
    }

    @Override // com.lifesense.plugin.ble.device.a.a
    @SuppressLint({"NewApi"})
    public synchronized void a(Context context, com.lifesense.plugin.ble.device.a.b bVar) {
        super.a(context, bVar);
        LSManagerStatus lSManagerStatus = LSManagerStatus.Free;
        a(lSManagerStatus, "init device centre");
        this.w = lSManagerStatus;
        this.v = 0;
        this.x = new ArrayList();
        this.p = new ConcurrentSkipListMap();
        this.q = new ConcurrentSkipListMap();
        HandlerThread handlerThread = new HandlerThread("DataSyncCentreHandler");
        this.m = handlerThread;
        handlerThread.start();
        this.f8732n = new x(this, this.m.getLooper());
    }

    public synchronized void b(OnSyncingListener onSyncingListener) {
        this.u = onSyncingListener;
    }

    public synchronized void a(LSDeviceInfo lSDeviceInfo, OnSyncingListener onSyncingListener) {
        if (lSDeviceInfo != null) {
            if (lSDeviceInfo.getProtocolType() != null && lSDeviceInfo.getMacAddress() != null) {
                this.u = onSyncingListener;
                if (f(lSDeviceInfo.getBroadcastID())) {
                    com.lifesense.plugin.ble.device.proto.q qVarD = d(lSDeviceInfo.getMacAddress());
                    if (qVarD != null && qVarD.h() == LSConnectState.ConnectSuccess) {
                        printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "no permission to connect again on scan failure,mac =" + lSDeviceInfo.getBroadcastID(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                        return;
                    }
                    if (qVarD != null) {
                        qVarD.b();
                    }
                }
                printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "connect device without scan process,mac=" + lSDeviceInfo.getMacAddress() + "; protocol=" + lSDeviceInfo.getProtocolType(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                c(lSDeviceInfo);
                return;
            }
        }
        printLogMessage(getGeneralLogInfo(null, "no permission to connect device,info invalid...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    private synchronized void a(LSManagerStatus lSManagerStatus, String str) {
        printLogMessage(getPrintLogInfo("set manager status in device centre >> " + str, 3));
        this.o = lSManagerStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HandlerMessage handlerMessage) {
        ATDeviceData realtimeData;
        if (this.u == null || handlerMessage == null || handlerMessage.getData() == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to callback device data,no listener..." + this.u, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            return;
        }
        try {
            LSDeviceInfo lsDevice = handlerMessage.getLsDevice();
            if (handlerMessage.getData() instanceof String) {
                byte[] bArrB = com.lifesense.plugin.ble.c.a.b((String) handlerMessage.getData());
                realtimeData = handlerMessage.getPacketType() == 65533 ? ATHeartRateData.parseRealtimeData(bArrB, lsDevice.getBroadcastID()) : ATDataProfile.parseData(bArrB, lsDevice.getBroadcastID());
            } else {
                realtimeData = handlerMessage.getData() instanceof ATControlData ? (ATControlData) handlerMessage.getData() : null;
            }
            if (realtimeData == null) {
                printLogMessage(getGeneralLogInfo(null, "undefined data:" + handlerMessage.getData(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                return;
            }
            printLogMessage(getGeneralLogInfo(lsDevice.getBroadcastID(), "# " + realtimeData.toString(), com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
            com.lifesense.plugin.ble.device.a.a.a.e eVarA = com.lifesense.plugin.ble.device.a.a.a.a.a().a(lsDevice.getMacAddress());
            if (eVarA != null) {
                eVarA.a().onActivityTrackerDataUpdate(lsDevice.getBroadcastID(), realtimeData.getCmd(), realtimeData);
            }
            this.u.onActivityTrackerDataUpdate(lsDevice.getBroadcastID(), realtimeData.getCmd(), realtimeData);
        } catch (Exception e2) {
            printLogMessage(getGeneralLogInfo(null, "failed to parse measure data,has exception...data obj >> {" + handlerMessage.toString() + "}; exception obj >> { " + e2.toString() + " }", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            e2.printStackTrace();
        }
    }

    public void b(String str, OnReadingListener onReadingListener) {
        StringBuilder sb;
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (com.lifesense.plugin.ble.c.b.a(str) == null) {
            generalLogInfo = getGeneralLogInfo(str, "faield to read device image,mac is null..." + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false);
        } else {
            String upperCase = str.replace(":", "").toUpperCase();
            if (a(str) != LSConnectState.ConnectSuccess) {
                sb = new StringBuilder();
                sb.append("failed to read device's image info,not connected...");
                sb.append(upperCase);
            } else {
                com.lifesense.plugin.ble.device.proto.q qVarD = d(upperCase);
                if (qVarD != null && (qVarD instanceof com.lifesense.plugin.ble.device.proto.A5.o)) {
                    ((com.lifesense.plugin.ble.device.proto.A5.o) qVarD).b(onReadingListener);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("failed to read device's battery,unsupported.");
                    sb.append(qVarD);
                }
            }
            generalLogInfo = getGeneralLogInfo(str, sb.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false);
        }
        printLogMessage(generalLogInfo);
        onReadingListener.onDeviceImageInfoUpdate(str, null);
    }

    private void a(MultiProtocolDevice multiProtocolDevice, boolean z) {
        if (multiProtocolDevice == null || multiProtocolDevice.getBleDevice() == null || multiProtocolDevice.getLsDevcie() == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to connect again,no system obj...", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            return;
        }
        BluetoothDevice bleDevice = multiProtocolDevice.getBleDevice();
        LSDeviceInfo lsDevcie = multiProtocolDevice.getLsDevcie();
        if (TextUtils.isEmpty(lsDevcie.getBroadcastID())) {
            printLogMessage(getGeneralLogInfo(null, "failed to connect again,unknown device=" + lsDevcie.formatStringValue(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            return;
        }
        if (f(lsDevcie.getBroadcastID())) {
            printLogMessage(getGeneralLogInfo(lsDevcie.getMacAddress(), "no permission to connect again:" + lsDevcie.getBroadcastID() + "; device=" + bleDevice, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        printLogMessage(getGeneralLogInfo(lsDevcie.getMacAddress(), "try to connect again,device[" + bleDevice.getAddress() + "]", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        String address = bleDevice.getAddress();
        Queue queueA = com.lifesense.plugin.ble.device.proto.c.a(lsDevcie);
        com.lifesense.plugin.ble.device.proto.A5.o oVar = new com.lifesense.plugin.ble.device.proto.A5.o(address, lsDevcie, this.a);
        this.p.put(lsDevcie.getBroadcastID().toUpperCase(), oVar);
        oVar.a(this.A);
        oVar.a(bleDevice, queueA, true, com.lifesense.plugin.ble.device.a.c.SYNCING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        StringBuilder sb;
        String str;
        if (obj == null) {
            return;
        }
        if (this.u == null) {
            sb = new StringBuilder();
            str = "failed to callback device's measure data,no listener >> ";
        } else {
            sb = new StringBuilder();
            str = "failed to callback undefine measure data >> ";
        }
        sb.append(str);
        sb.append(obj.toString());
        printLogMessage(getGeneralLogInfo(null, sb.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    public void a(String str, OnReadingListener onReadingListener) {
        ATBatteryInfo aTBatteryInfo;
        if (com.lifesense.plugin.ble.c.b.a(str) == null) {
            printLogMessage(getGeneralLogInfo(str, "failed to read device's battery,mac is null..." + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            aTBatteryInfo = new ATBatteryInfo(null);
        } else {
            String upperCase = str.replace(":", "").toUpperCase();
            if (a(str) != LSConnectState.ConnectSuccess) {
                printLogMessage(getGeneralLogInfo(str, "failed to read device's battery,not connected..." + upperCase, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
                aTBatteryInfo = new ATBatteryInfo(null);
            } else {
                com.lifesense.plugin.ble.device.proto.q qVarD = d(upperCase);
                if (qVarD != null && (qVarD instanceof com.lifesense.plugin.ble.device.proto.A5.o)) {
                    ((com.lifesense.plugin.ble.device.proto.A5.o) qVarD).a(onReadingListener);
                    return;
                }
                printLogMessage(getGeneralLogInfo(str, "failed to read device's battery,unsupported." + qVarD, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
                aTBatteryInfo = new ATBatteryInfo(null);
            }
        }
        onReadingListener.onDeviceBatteryInfoUpdate(str, aTBatteryInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, LSConnectState lSConnectState, com.lifesense.plugin.ble.device.proto.q qVar) {
        if (com.lifesense.plugin.ble.c.b.a(str) == null || this.u == null) {
            return;
        }
        printLogMessage(getGeneralLogInfo(str, "onStateChanged=" + lSConnectState + "; mac=" + str, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
        this.u.onStateChanged(str, lSConnectState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z) {
        if (this.r || b() != LSManagerStatus.Syncing) {
            printLogMessage(getPrintLogInfo("no permission to start up data sync service again,status=" + b() + "; isStop=" + this.r, 1));
            return;
        }
        if (this.p.size() == this.q.size()) {
            printLogMessage(getPrintLogInfo("there is no other deivce,size=" + this.p.size(), 1));
            return;
        }
        if (this.q.size() <= 1) {
            if (z && this.q.size() == 1) {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                if (this.r || b() != LSManagerStatus.Syncing) {
                    printLogMessage(getPrintLogInfo("no permission to start up data sync service again,status=" + b() + "; isStop=" + this.r, 1));
                    return;
                }
                printLogMessage(getPrintLogInfo("start scan again,connection device size=" + this.p.size() + "; devices size=" + this.q.size(), 1));
            }
        }
        printLogMessage(getPrintLogInfo("start scan again,there has other deivce,connection device size=" + this.p.size() + "; devices size=" + this.q.size(), 1));
        i();
    }

    public synchronized boolean a(OnSyncingListener onSyncingListener) {
        try {
            if (onSyncingListener == null) {
                printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,no callback...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                return false;
            }
            if (b() != LSManagerStatus.Free) {
                printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,working status=" + this.o, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                return false;
            }
            a(LSManagerStatus.Syncing, "start data sync service");
            this.u = onSyncingListener;
            this.r = false;
            com.lifesense.plugin.ble.b.d.a().c();
            com.lifesense.plugin.ble.b.d.a().a(this.q);
            com.lifesense.plugin.ble.b.d.a().b();
            this.y = com.lifesense.plugin.ble.device.proto.e.a(this.q);
            printLogMessage(getGeneralLogInfo(null, "start data syncing service now...", com.lifesense.plugin.ble.b.a.a.Start_Service, null, true));
            return i();
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean a(LSDeviceInfo lSDeviceInfo) {
        if (lSDeviceInfo == null || this.q == null) {
            printLogMessage(getPrintLogInfo("failed to add measure device,is null..", 1));
            return false;
        }
        if (lSDeviceInfo.getMacAddress() != null && lSDeviceInfo.getMacAddress().length() > 0) {
            lSDeviceInfo.setMacAddress(lSDeviceInfo.getMacAddress().toUpperCase());
        }
        String upperCase = lSDeviceInfo.getDeviceType() + lSDeviceInfo.getBroadcastID();
        if (lSDeviceInfo.getMacAddress() != null && lSDeviceInfo.getMacAddress().length() > 0 && (LSProtocolType.A5.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatActivityTracker.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatCallAT.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatScale.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatGlucoseMeter.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.Standard.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || lSDeviceInfo.getProtocolType() == null || lSDeviceInfo.getProtocolType().length() == 0 || LSProtocolType.Unknown.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()))) {
            upperCase = lSDeviceInfo.getMacAddress().replace(":", "").toUpperCase();
            lSDeviceInfo.setBroadcastID(upperCase);
        }
        if (this.q.containsKey(upperCase)) {
            this.q.remove(upperCase);
        }
        this.q.put(upperCase, lSDeviceInfo);
        printLogMessage(getSupperLogInfo(null, "add measure device" + lSDeviceInfo.getDeviceSimplifyInfo() + "; forKey=" + upperCase, com.lifesense.plugin.ble.b.a.a.Add_Device, null, true));
        return a(com.lifesense.plugin.ble.device.proto.e.a().f(lSDeviceInfo.getDeviceType()));
    }

    private boolean a(LSDeviceType lSDeviceType) {
        List list;
        if (lSDeviceType == null || lSDeviceType == LSDeviceType.Unknown || (list = this.s) == null) {
            return false;
        }
        if (list.contains(lSDeviceType)) {
            return true;
        }
        this.s.add(lSDeviceType);
        return true;
    }

    public synchronized boolean a(List list) {
        printLogMessage(getSupperLogInfo(null, "reset measure device list," + com.lifesense.plugin.ble.c.b.a(list), com.lifesense.plugin.ble.b.a.a.Set_Measure_Device, null, true));
        Map map = this.q;
        if (map != null && map.size() > 0) {
            f();
            this.q.clear();
        }
        this.s = new ArrayList();
        if (list != null && list.size() != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) it.next();
                if (com.lifesense.plugin.ble.device.proto.e.b(lSDeviceInfo)) {
                    if (lSDeviceInfo.getMacAddress() != null && lSDeviceInfo.getMacAddress().length() > 0) {
                        lSDeviceInfo.setMacAddress(lSDeviceInfo.getMacAddress().toUpperCase());
                    }
                    String upperCase = lSDeviceInfo.getDeviceType() + lSDeviceInfo.getBroadcastID();
                    if (lSDeviceInfo.getMacAddress() != null && lSDeviceInfo.getMacAddress().length() > 0 && (LSProtocolType.A5.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatActivityTracker.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatCallAT.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatScale.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || LSProtocolType.WechatGlucoseMeter.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) || lSDeviceInfo.getProtocolType() == null || lSDeviceInfo.getProtocolType().length() == 0 || LSProtocolType.Unknown.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()))) {
                        upperCase = lSDeviceInfo.getMacAddress().replace(":", "").toUpperCase();
                        lSDeviceInfo.setBroadcastID(upperCase);
                    }
                    if (this.q.containsKey(upperCase)) {
                        this.q.remove(upperCase);
                    }
                    this.q.put(upperCase, lSDeviceInfo);
                    a(com.lifesense.plugin.ble.device.proto.e.a().f(lSDeviceInfo.getDeviceType()));
                } else {
                    printLogMessage(getGeneralLogInfo(null, "faield to set measure devices,info error >>" + lSDeviceInfo.toString(), com.lifesense.plugin.ble.b.a.a.Add_Device, null, false));
                }
            }
            return true;
        }
        return false;
    }
}
