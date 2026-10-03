package com.lifesense.plugin.ble.device.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.text.TextUtils;
import androidx.camera.core.RetryPolicy;
import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSPhoneCallState;
import com.lifesense.plugin.ble.data.tracker.ATGattServiceType;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;
import com.lifesense.plugin.ble.data.tracker.setting.ATGpsStatus;
import com.lifesense.plugin.ble.device.proto.A5.parser.A5ProtoDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale"})
public class g extends com.lifesense.plugin.ble.device.a.a {
    private static final ATGattServiceType B = ATGattServiceType.All;
    private static g v;
    private Map C;
    private Map D;
    private Map E;
    private Map F;
    private int G;
    private List H;
    private Map I;
    private ATGpsStatus J;
    private int L;
    private Context w;
    private HandlerThread x;
    private Handler y;
    private Map z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8718c = 1;
    final int d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8719e = 2;
    final int f = 3;
    final int g = 4;
    final int h = 5;
    final int i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f8720j = 7;
    final String k = "mac";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f8721l = "data";
    final String m = "cmdVersion";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f8722n = "pushCmd";
    final String o = "errorCode";
    final String p = "PEDOMETER_USER_INFO";
    final String q = "PEDOMETER_ALARM_CLOCK";
    final String r = "WEIGHT_USER_INFO";
    final String s = "VIBRATION_VOICE";
    final long t = RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
    final int u = 1;
    private String K = "未知";
    private PhoneStateListener M = new h(this);
    private com.lifesense.plugin.ble.device.ancs.m N = new i(this);
    private com.lifesense.plugin.ble.device.proto.h O = new j(this);
    private com.lifesense.plugin.ble.device.a.b P = new k(this);
    private Runnable Q = new l(this);
    private Runnable R = new m(this);
    private boolean A = false;

    private g() {
    }

    public int e() {
        return this.G;
    }

    private synchronized List f(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA != null && (map = this.I) != null) {
            List list = (List) map.get(strA);
            return (list == null || list.size() == 0) ? new ArrayList() : list;
        }
        return null;
    }

    public String g() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OnSettingListener a(String str, String str2) {
        Map map;
        if (str != null) {
            str = str.replace(":", "");
        }
        String strA = com.lifesense.plugin.ble.c.b.a(str2 + "-" + str);
        if (strA == null || (map = this.C) == null || !map.containsKey(strA)) {
            return null;
        }
        return (OnSettingListener) this.C.get(strA);
    }

    private com.lifesense.plugin.ble.device.a.a.a.d e(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA != null && (map = this.D) != null && map.size() > 0) {
            for (String str2 : this.D.keySet()) {
                if (str2.replace(":", "").equalsIgnoreCase(strA.replace(":", ""))) {
                    return (com.lifesense.plugin.ble.device.a.a.a.d) this.D.get(str2);
                }
            }
        }
        return null;
    }

    public void c() {
        Context context = this.w;
        if (context == null) {
            return;
        }
        com.lifesense.plugin.ble.a.a.a(context, this.M);
        com.lifesense.plugin.ble.device.ancs.e.a().a(this.w, this.N);
    }

    public void d() {
        Context context = this.w;
        if (context == null) {
            return;
        }
        com.lifesense.plugin.ble.a.a.a(context, (PhoneStateListener) null);
        com.lifesense.plugin.ble.device.ancs.e.a().a(this.w);
    }

    @SuppressLint({"NewApi"})
    public void f() {
        try {
            this.A = false;
            HandlerThread handlerThread = this.x;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.x = null;
            }
            Context context = this.w;
            if (context != null) {
                com.lifesense.plugin.ble.a.a.a(context);
                d();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public com.lifesense.plugin.ble.device.a.b b() {
        return this.P;
    }

    private synchronized ATTextMessage a(String str, ATTextMessage aTTextMessage, List list) {
        if (list != null) {
            if (list.size() != 0 && aTTextMessage != null) {
                if (aTTextMessage.getMsgCategory() == null) {
                    return null;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ATTextMessage aTTextMessage2 = (ATTextMessage) it.next();
                    if (aTTextMessage.getMsgCategory() != LSAppCategory.Other) {
                        if (aTTextMessage2.getMsgCategory() == aTTextMessage.getMsgCategory()) {
                            return aTTextMessage2;
                        }
                    } else if (aTTextMessage2.getMsgCategory() == aTTextMessage.getMsgCategory() && !TextUtils.isEmpty(aTTextMessage.getPackageName()) && aTTextMessage.getPackageName().equalsIgnoreCase(aTTextMessage2.getPackageName())) {
                        return aTTextMessage2;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, com.lifesense.plugin.ble.device.ancs.a aVar) {
        try {
            Handler handler = this.y;
            if (handler != null) {
                handler.removeMessages(i, aVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "failed to remove timeout of message," + e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.lifesense.plugin.ble.device.ancs.a aVar) {
        List listC;
        if (aVar == null || (listC = com.lifesense.plugin.ble.device.proto.e.a().c(u.a().c())) == null || listC.size() <= 0) {
            return;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            String macAddress = ((LSDeviceInfo) it.next()).getMacAddress();
            if (u.a().a(macAddress) == LSConnectState.ConnectSuccess) {
                com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
                bVar.a(aVar);
                bVar.a(macAddress);
                bVar.a(3);
                a(macAddress, bVar, (OnSettingListener) null);
            } else {
                printLogMessage(getAdvancedLogInfo(macAddress, "failed to send message notify to pedometer,not connected...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            }
        }
    }

    public void d(String str) {
        this.L = 0;
        com.lifesense.plugin.ble.device.a.a.a.e eVarA = com.lifesense.plugin.ble.device.a.a.a.a.a().a(str);
        if (eVarA != null) {
            eVarA.a(str);
        }
    }

    public static synchronized g a() {
        g gVar = v;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        v = gVar2;
        return gVar2;
    }

    public boolean c(String str) {
        Map map;
        try {
            if (TextUtils.isEmpty(str) && (map = this.I) != null && map.size() != 0) {
                for (Object obj : this.I.values().toArray()) {
                    if ((obj instanceof ATTextMessage) && str.equalsIgnoreCase(((ATTextMessage) obj).getPackageName())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private void a(int i, com.lifesense.plugin.ble.device.ancs.a aVar) {
        try {
            Handler handler = this.y;
            if (handler != null) {
                this.y.sendMessageDelayed(handler.obtainMessage(i, 1, 0, aVar), RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "failed to init timeout of message," + e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    private void b(com.lifesense.plugin.ble.device.ancs.a aVar) {
        try {
            Handler handler = this.y;
            if (handler != null) {
                this.y.sendMessageDelayed(handler.obtainMessage(aVar.g(), 8, 0, aVar), RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "failed to init timeout of incoming call message," + e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        StringBuilder sb;
        List<LSDeviceInfo> listC = com.lifesense.plugin.ble.device.proto.e.a().c(u.a().c());
        if (listC == null || listC.size() <= 0) {
            return;
        }
        if (1 == i) {
            if (1 != this.G) {
                this.G = i;
                String strG = g();
                if (str != null && str.length() > 0 && ((strG = com.lifesense.plugin.ble.c.f.c(this.w, str)) == null || strG.length() == 0)) {
                    strG = str;
                }
                for (LSDeviceInfo lSDeviceInfo : listC) {
                    com.lifesense.plugin.ble.b.d.a().a(lSDeviceInfo.getMacAddress(), com.lifesense.plugin.ble.b.a.a.Warning_Message, true, "check device connect state >>" + u.a().a(lSDeviceInfo.getMacAddress()) + "; disconnect list >>" + this.H.toString(), null);
                    com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Call_State_Changed, true, strG + "(" + str + ")", "Ring");
                    ATTextMessage aTTextMessage = new ATTextMessage(LSAppCategory.IncomingCall);
                    aTTextMessage.setTitle(strG);
                    aTTextMessage.setPhoneState(LSPhoneCallState.Ringing);
                    b(lSDeviceInfo.getMacAddress(), aTTextMessage);
                }
                return;
            }
            sb = new StringBuilder();
        } else {
            if (2 != i && i != 0) {
                return;
            }
            int i2 = this.G;
            if (2 != i2 && i2 != 0) {
                this.G = i;
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Call_State_Changed, true, str, "Idle");
                for (LSDeviceInfo lSDeviceInfo2 : listC) {
                    com.lifesense.plugin.ble.b.d.a().a(lSDeviceInfo2.getMacAddress(), com.lifesense.plugin.ble.b.a.a.Warning_Message, true, "check device connect state >>" + u.a().a(lSDeviceInfo2.getMacAddress()) + "; disconnect list >>" + this.H.toString(), null);
                    ATTextMessage aTTextMessage2 = new ATTextMessage(LSAppCategory.IncomingCall);
                    aTTextMessage2.setTitle(null);
                    aTTextMessage2.setPhoneState(LSPhoneCallState.Offhook);
                    b(lSDeviceInfo2.getMacAddress(), aTTextMessage2);
                }
                return;
            }
            sb = new StringBuilder();
        }
        sb.append("Wraning,repeat receive call state change with number:");
        sb.append(str);
        sb.append("; status:");
        sb.append(i);
    }

    public void b(String str) {
        this.y.removeCallbacksAndMessages(str);
    }

    private void b(String str, ATTextMessage aTTextMessage) {
        if (com.lifesense.plugin.ble.c.b.a(str) == null || aTTextMessage == null) {
            return;
        }
        com.lifesense.plugin.ble.device.ancs.a aVar = new com.lifesense.plugin.ble.device.ancs.a(aTTextMessage.getTitle(), aTTextMessage.getContent(), aTTextMessage.getMsgCategory().getValue());
        aVar.b(aTTextMessage.getPhoneState().getValue());
        com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
        bVar.a(aVar);
        bVar.a(2);
        a(str, bVar, (OnSettingListener) null);
    }

    public void a(BluetoothDevice bluetoothDevice, LSConnectState lSConnectState) {
        String strA;
        if (LSConnectState.ConnectSuccess == lSConnectState) {
            this.H = new ArrayList();
        } else {
            if (LSConnectState.Disconnect != lSConnectState || (strA = com.lifesense.plugin.ble.c.b.a(bluetoothDevice.getAddress())) == null) {
                return;
            }
            if (this.H.contains(strA)) {
                this.H.remove(strA);
            }
            this.H.add(strA);
        }
    }

    private boolean b(String str, String str2) {
        Map map;
        if (str != null) {
            str = str.replace(":", "");
        }
        String strA = com.lifesense.plugin.ble.c.b.a(str2 + "-" + str);
        if (strA == null || (map = this.C) == null || !map.containsKey(strA)) {
            return false;
        }
        this.C.remove(strA);
        return true;
    }

    @Override // com.lifesense.plugin.ble.device.a.a
    @SuppressLint({"NewApi"})
    public void a(Context context, com.lifesense.plugin.ble.device.a.b bVar) {
        if (this.A) {
            return;
        }
        this.w = context;
        this.A = true;
        this.C = new ConcurrentSkipListMap();
        this.D = new ConcurrentSkipListMap();
        this.E = new HashMap();
        this.F = new ConcurrentSkipListMap();
        this.H = new ArrayList();
        this.z = new HashMap();
        this.I = new HashMap();
        HandlerThread handlerThread = this.x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.x = null;
        }
        HandlerThread handlerThread2 = new HandlerThread("PushCentreThread");
        this.x = handlerThread2;
        handlerThread2.start();
        this.y = new n(this, this.x.getLooper());
        this.x.setPriority(10);
        this.G = 0;
        a(com.lifesense.plugin.ble.c.f.b(this.w) ? ATGpsStatus.PositioningFailure : ATGpsStatus.Unavailable);
    }

    public void a(ATGpsStatus aTGpsStatus) {
        printLogMessage(getGeneralLogInfo(null, "Gps Status:" + aTGpsStatus, com.lifesense.plugin.ble.b.a.a.Update_Gps_Status, null, true));
        this.J = aTGpsStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.lifesense.plugin.ble.device.ancs.a aVar) {
        try {
            a(aVar.g(), aVar);
            com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
            bVar.a(aVar.b());
            bVar.a(3);
            bVar.a(aVar);
            aVar.c().a(bVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.F) == null) {
            return;
        }
        if (map.containsKey(strA)) {
            this.F.remove(strA);
        }
        this.F.put(strA, new A5ProtoDecoder(str, this.O));
    }

    public void a(String str, ATTextMessage aTTextMessage) {
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        List listF = f(strA);
        if (listF == null || aTTextMessage == null) {
            return;
        }
        if (aTTextMessage.getMsgCategory() == LSAppCategory.All) {
            listF.clear();
            listF = new ArrayList();
        } else {
            if (aTTextMessage.getMsgCategory() == LSAppCategory.Other && TextUtils.isEmpty(aTTextMessage.getPackageName())) {
                printLogMessage(getPrintLogInfo("failed to set custom app message,is null:" + aTTextMessage.filterString(), 1));
                return;
            }
            ATTextMessage aTTextMessageA = a(str, aTTextMessage, listF);
            if (aTTextMessageA != null) {
                listF.remove(aTTextMessageA);
            }
            listF.add(aTTextMessage);
        }
        this.I.remove(strA);
        this.I.put(strA, listF);
    }

    public void a(String str, com.lifesense.plugin.ble.device.a.a.a.b bVar, OnSettingListener onSettingListener) {
        com.lifesense.plugin.ble.device.a.a.a.d dVarE = e(str);
        if (dVarE == null || !a(bVar)) {
            if (onSettingListener != null) {
                printLogMessage(getSupperLogInfo(str, "failed to send push msg,device is no connected >> " + dVarE, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
                onSettingListener.onFailure(LSErrorCode.DeviceNotConnected.getCode());
                return;
            }
            if (bVar != null) {
                printLogMessage(getPrintLogInfo("failed to set push command,device is no found >> " + bVar.toString(), 1));
                return;
            }
            return;
        }
        a(str, Integer.toHexString(bVar.c()), onSettingListener);
        if (3 == bVar.c()) {
            bVar.d().a(str);
            bVar.d().a(dVarE);
            a(bVar.d());
            return;
        }
        if (2 == bVar.c()) {
            bVar.d().a(str);
            bVar.d().a(dVarE);
            b(bVar.d());
        } else if (249 == bVar.c() || 65535 == bVar.c()) {
            int i = this.L;
            if (i == 65535 || i == 249) {
                printLogMessage(getSupperLogInfo(str, "failed to download dial file or upgrade again." + this.L, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
                onSettingListener.onFailure(LSErrorCode.DeviceUnsupported.getCode());
                return;
            }
            this.L = bVar.c();
        }
        dVarE.a(bVar);
    }

    public void a(String str, com.lifesense.plugin.ble.device.a.a.a.d dVar) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || dVar == null || (map = this.D) == null) {
            return;
        }
        if (map.containsKey(strA)) {
            this.D.remove(strA);
        }
        this.D.put(strA, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, boolean z) {
        OnSettingListener onSettingListenerA = a(str, str2);
        if (onSettingListenerA == null) {
            Map map = this.C;
            printLogMessage(getSupperLogInfo(str, "failed to callback push results=" + str2 + "[" + str + "]; no listener=" + (map != null ? map.toString() : "null") + "; code=" + i, com.lifesense.plugin.ble.b.a.a.Push_Message, null, false));
            return;
        }
        boolean zB = b(str, str2);
        String str3 = "failed to write push command to device,status =" + i + "; listener=" + zB;
        if (z) {
            str3 = "Done,listener=" + zB;
            onSettingListenerA.onSuccess(str);
        } else {
            onSettingListenerA.onFailure(i);
        }
        com.lifesense.plugin.ble.b.d.a().a(str, com.lifesense.plugin.ble.b.a.a.Write_Push_Msg, z, str3, str2);
    }

    private void a(String str, String str2, OnSettingListener onSettingListener) {
        Map map;
        if (onSettingListener == null) {
            return;
        }
        if (str != null) {
            str = str.replace(":", "");
        }
        String strA = com.lifesense.plugin.ble.c.b.a(str2 + "-" + str);
        if (strA == null || (map = this.C) == null) {
            return;
        }
        if (map.containsKey(strA)) {
            this.C.remove(strA);
        }
        this.C.put(strA, onSettingListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Object obj) {
        OnSettingListener onSettingListenerA = a(str, str2);
        if (onSettingListenerA == null) {
            System.err.println("error,failed to get push listener,is null......");
        } else {
            onSettingListenerA.onDataUpdate(obj);
            b(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, byte[] bArr, String str2) {
        Map map;
        A5ProtoDecoder a5ProtoDecoder;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.F) == null || bArr == null || (a5ProtoDecoder = (A5ProtoDecoder) map.get(strA)) == null) {
            return;
        }
        if (bArr.length < 20) {
            System.arraycopy(bArr, 0, new byte[20], 0, bArr.length);
        }
        a5ProtoDecoder.parsingDataPackage(null, bArr, str2);
    }

    private boolean a(com.lifesense.plugin.ble.device.a.a.a.b bVar) {
        return (bVar == null || bVar.c() == 0) ? false : true;
    }
}
