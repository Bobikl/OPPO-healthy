package com.lifesense.android.bluetooth.core.business.push;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.business.g;
import com.lifesense.android.bluetooth.core.business.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale"})
public class c extends com.lifesense.android.bluetooth.core.business.push.a {
    public static c i;
    public HandlerThread a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8607c;
    public Map<String, com.lifesense.android.bluetooth.core.a> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, com.lifesense.android.bluetooth.core.business.push.b> f8608e;
    public Map<String, GattServiceType> f;
    public List<String> g;
    public g h;

    public class a extends PhoneStateListener {
        public a() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            Message messageObtainMessage = c.this.b.obtainMessage();
            messageObtainMessage.obj = str;
            messageObtainMessage.arg2 = i;
            messageObtainMessage.arg1 = 6;
            c.this.b.sendMessage(messageObtainMessage);
        }
    }

    public class b extends com.lifesense.android.bluetooth.core.protocol.parser.b {
        public b() {
        }

        @Override // com.lifesense.android.bluetooth.core.protocol.parser.b
        public synchronized void onMeasuredDataDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar) {
            if (aVar != null) {
                if (aVar.v()) {
                    if ("8000".equalsIgnoreCase(aVar.m())) {
                        c.this.a(str, aVar.l(), 0, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.business.push.c$c, reason: collision with other inner class name */
    public class C0827c implements g {
        public C0827c() {
        }

        @Override // com.lifesense.android.bluetooth.core.business.g
        public synchronized void a(String str, PacketProfile packetProfile) {
            String hexString = Integer.toHexString(packetProfile.getCommndValue());
            Message messageObtainMessage = c.this.b.obtainMessage();
            messageObtainMessage.arg1 = 3;
            Bundle bundle = new Bundle();
            bundle.putString("mac", str);
            bundle.putString("pushCmd", hexString);
            messageObtainMessage.setData(bundle);
            c.this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.lifesense.android.bluetooth.core.business.g
        public synchronized void a(String str, PacketProfile packetProfile, ErrorCode errorCode) {
            String hexString = Integer.toHexString(packetProfile.getCommndValue());
            Message messageObtainMessage = c.this.b.obtainMessage();
            messageObtainMessage.arg1 = 4;
            Bundle bundle = new Bundle();
            bundle.putString("mac", str);
            bundle.putString("pushCmd", hexString);
            bundle.putInt("errorCode", errorCode.getCode());
            messageObtainMessage.setData(bundle);
            c.this.b.sendMessage(messageObtainMessage);
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i = message.arg1;
            if (i == 1) {
                System.err.println("message,timeout.id=" + message.what + ",mac=" + message.obj);
                return;
            }
            if (i == 4) {
                Bundle data = message.getData();
                c.this.a(data.getString("mac"), data.getString("pushCmd"), data.getInt("errorCode"), false);
                return;
            }
            if (i == 3) {
                Bundle data2 = message.getData();
                c.this.a(data2.getString("mac"), data2.getString("pushCmd"), 0, true);
                return;
            }
            if (i == 5) {
                Bundle data3 = message.getData();
                c.this.a(data3.getString("mac"), data3.getString("pushCmd"), message.obj);
            }
        }
    }

    static {
        GattServiceType gattServiceType = GattServiceType.ALL;
    }

    public c() {
        new a();
        new b();
        this.h = new C0827c();
        this.f8607c = false;
    }

    public static synchronized c getInstance() {
        c cVar = i;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        i = cVar2;
        return cVar2;
    }

    public final synchronized void b(String str, String str2) {
        String str3;
        Map<String, com.lifesense.android.bluetooth.core.a> map;
        if (str != null) {
            str = str.replace(":", "");
            str3 = str2 + "-" + str;
            if (str3 != null && (map = this.d) != null) {
                map.remove(str3);
            }
        } else {
            str3 = str2 + "-" + str;
            if (str3 != null) {
                map.remove(str3);
            }
        }
        throw th;
    }

    public void d(String str) {
        this.b.removeCallbacksAndMessages(str);
    }

    public void e(String str) {
    }

    public final com.lifesense.android.bluetooth.core.business.push.b f(String str) {
        Map<String, com.lifesense.android.bluetooth.core.business.push.b> map;
        if (str == null || (map = this.f8608e) == null || !map.containsKey(str)) {
            return null;
        }
        return this.f8608e.get(str);
    }

    public g getPushCentreCallback() {
        return this.h;
    }

    @Override // com.lifesense.android.bluetooth.core.business.d
    @SuppressLint({"NewApi"})
    public void initBusinessCentre(Context context, j jVar) {
        if (this.f8607c) {
            return;
        }
        this.mAppContext = context;
        this.f8607c = true;
        this.d = new ConcurrentSkipListMap();
        this.f8608e = new ConcurrentSkipListMap();
        this.f = new HashMap();
        this.g = new ArrayList();
        HandlerThread handlerThread = this.a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.a = null;
        }
        HandlerThread handlerThread2 = new HandlerThread("PushCentreThread");
        this.a = handlerThread2;
        handlerThread2.start();
        this.b = new d(this.a.getLooper());
        this.a.setPriority(10);
    }

    public final synchronized com.lifesense.android.bluetooth.core.a a(String str, String str2) {
        String str3;
        Map<String, com.lifesense.android.bluetooth.core.a> map;
        if (str == null) {
            str3 = str2 + "-" + str;
            if (str3 == null) {
            }
            return null;
        }
        str = str.replace(":", "");
        str3 = str2 + "-" + str;
        if (str3 == null && (map = this.d) != null && map.containsKey(str3)) {
            return this.d.get(str3);
        }
        return null;
        throw th;
    }

    public void a(BluetoothDevice bluetoothDevice, DeviceConnectState deviceConnectState) {
        if (DeviceConnectState.CONNECTED_SUCCESS == deviceConnectState) {
            this.g = new ArrayList();
        } else {
            if (DeviceConnectState.DISCONNECTED != deviceConnectState || bluetoothDevice.getAddress() == null) {
                return;
            }
            this.g.remove(bluetoothDevice.getAddress());
            this.g.add(bluetoothDevice.getAddress());
        }
    }

    public synchronized void a(String str, GattServiceType gattServiceType) {
        if (str != null) {
            if (str.length() > 0) {
                String upperCase = str.toUpperCase();
                this.f.remove(upperCase);
                this.f.put(upperCase, gattServiceType);
            }
        }
    }

    public synchronized void a(String str, com.lifesense.android.bluetooth.core.business.push.b bVar) {
        if (str == null || bVar == null) {
            return;
        }
        Map<String, com.lifesense.android.bluetooth.core.business.push.b> map = this.f8608e;
        if (map != null) {
            map.remove(str);
            this.f8608e.put(str, bVar);
        }
    }

    public synchronized void a(String str, com.lifesense.android.bluetooth.core.business.push.msg.a aVar, com.lifesense.android.bluetooth.core.a aVar2) {
        com.lifesense.android.bluetooth.core.business.push.b bVarF = f(str);
        if (bVarF != null && a(aVar)) {
            a(str, Integer.toHexString(aVar.e().getCommndValue()), aVar2);
            bVarF.onPushMessageNotify(aVar);
        } else if (aVar != null) {
            printLogMessage(getPrintLogInfo("failed to set push command,device is no found >> " + aVar.toString(), 1));
            aVar2.onFailure(ErrorCode.DEVICE_NOT_CONNECTED.getCode());
        }
    }

    public final synchronized void a(String str, String str2, int i2, boolean z) {
        com.lifesense.android.bluetooth.core.a aVarA = a(str, str2);
        if (aVarA != null) {
            String str3 = "failed to write push command to device,status =" + i2;
            if (z) {
                str3 = "Done";
                aVarA.onSuccess(str);
            } else {
                aVarA.onFailure(i2);
            }
            com.lifesense.android.bluetooth.core.business.log.d.d().a(str, com.lifesense.android.bluetooth.core.business.log.report.a.Write_Push_Msg, z, str3, str2);
            b(str, str2);
        } else {
            Map<String, com.lifesense.android.bluetooth.core.a> map = this.d;
            printLogMessage(getSupperLogInfo(str, "failed to callback push results=" + str2 + "[" + str + "]; no listener=" + (map != null ? map.toString() : "null") + "; code=" + i2, com.lifesense.android.bluetooth.core.business.log.report.a.Push_Message, null, false));
        }
    }

    public final synchronized void a(String str, String str2, com.lifesense.android.bluetooth.core.a aVar) {
        String str3;
        Map<String, com.lifesense.android.bluetooth.core.a> map;
        if (aVar == null) {
            return;
        }
        if (str == null) {
            str3 = str2 + "-" + str;
            if (str3 != null) {
                map.remove(str3);
                this.d.put(str3, aVar);
            }
            return;
        }
        str = str.replace(":", "");
        str3 = str2 + "-" + str;
        if (str3 != null && (map = this.d) != null) {
            map.remove(str3);
            this.d.put(str3, aVar);
        }
        return;
        throw th;
    }

    public final void a(String str, String str2, Object obj) {
        com.lifesense.android.bluetooth.core.a aVarA = a(str, str2);
        if (aVarA == null) {
            System.err.println("error,failed to get push listener,is null......");
        } else {
            aVarA.onConfigInfo(obj);
            b(str, str2);
        }
    }

    public final boolean a(com.lifesense.android.bluetooth.core.business.push.msg.a aVar) {
        return (aVar == null || aVar.e() == null) ? false : true;
    }
}
