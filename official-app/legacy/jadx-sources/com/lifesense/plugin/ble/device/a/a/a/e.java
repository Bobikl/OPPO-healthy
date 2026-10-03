package com.lifesense.plugin.ble.device.a.a.a;

import android.os.Handler;
import com.lifesense.plugin.ble.LSBluetoothManager;
import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.OnSyncingListener;
import com.lifesense.plugin.ble.data.IDeviceSetting;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceMessage;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.tracker.ATImageMessage;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;
import com.lifesense.plugin.ble.data.tracker.setting.ATFileSetting;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes5.dex */
public class e extends com.lifesense.plugin.ble.b.a {
    private String a;
    private Handler f;
    private OnSyncingListener g = new f(this);
    private Runnable h = new i(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f8709c = null;
    private Queue b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f8710e = null;
    private Queue d = new ConcurrentLinkedQueue();

    public e(String str, Handler handler) {
        this.a = str;
        this.f = handler;
    }

    private c e() {
        Queue queue = this.d;
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        return (c) this.d.peek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        g();
        Handler handler = this.f;
        if (handler != null) {
            handler.postDelayed(this.h, 5000L);
        }
    }

    private String h() {
        c cVar = this.f8710e;
        return cVar == null ? "null" : cVar.d();
    }

    private String i() {
        j jVar = this.f8709c;
        return jVar == null ? "null" : jVar.d();
    }

    public OnSyncingListener a() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        if (this.f8709c != null) {
            c(this.f8709c);
            return;
        }
        j jVarD = d();
        this.f8709c = jVarD;
        if (jVarD == null) {
            return;
        }
        a(jVarD.a(), this.f8709c.b(), this.f8709c.c());
    }

    private j d() {
        Queue queue = this.b;
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        return (j) this.b.peek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Handler handler = this.f;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.h);
    }

    private String c(j jVar) {
        if (jVar == null) {
            return "null";
        }
        try {
            if (jVar.b() == null) {
                return "null";
            }
            return "cmd=" + String.format("%X", Integer.valueOf(jVar.b().getCmd())) + "; cls=" + jVar.b().getClass().getSimpleName();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception= " + e2.toString();
        }
    }

    public void b(c cVar) {
        Queue queue;
        if (cVar == null || (queue = this.d) == null || queue.isEmpty()) {
            this.f8710e = null;
            return;
        }
        c cVar2 = this.f8710e;
        if (cVar2 == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to remove message,undefined.." + cVar.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        if (cVar2.equals(cVar)) {
            this.d.remove(cVar);
            this.f8710e = null;
            return;
        }
        printLogMessage(getGeneralLogInfo(null, "failed to remove message,unsupported.reqObj=" + cVar.toString() + "; srcObj=" + this.f8710e.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        if (this.f8710e != null) {
            c(this.f8709c);
            return;
        }
        c cVarE = e();
        this.f8710e = cVarE;
        if (cVarE == null) {
            return;
        }
        a(cVarE.b(), this.f8710e.a(), this.f8710e.c());
    }

    public void a(c cVar) {
        if (cVar == null || cVar.a() == null) {
            return;
        }
        try {
            printLogMessage(getGeneralLogInfo(cVar.b(), "add message=" + cVar.a().getMsgCategory() + "; queueSize=" + this.d.size() + "; processing=" + h(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.d.add(cVar);
            c();
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "clear message queue,has exception=" + e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    public void a(j jVar) {
        if (jVar == null || jVar.b() == null) {
            return;
        }
        try {
            printLogMessage(getGeneralLogInfo(jVar.a(), "add setting =" + c(jVar) + "; queueSize=" + this.b.size() + "; processing=" + i(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.b.add(jVar);
            b();
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "clear message queue,has exception=" + e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    public void b(j jVar) {
        Queue queue;
        if (jVar == null || (queue = this.b) == null || queue.isEmpty()) {
            this.f8709c = null;
            return;
        }
        j jVar2 = this.f8709c;
        if (jVar2 == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to setting message,undefined.." + jVar.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        if (jVar2.equals(jVar)) {
            this.b.remove(jVar);
            this.f8709c = null;
            return;
        }
        printLogMessage(getGeneralLogInfo(null, "failed to setting message,unsupported.reqObj=" + jVar.toString() + "; srcObj=" + this.f8709c.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    public void a(String str) {
        try {
            this.f8710e = null;
            this.f8709c = null;
            Queue queue = this.b;
            if (queue != null && !queue.isEmpty()) {
                printLogMessage(getGeneralLogInfo(str, "clear setting  queue...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                this.b = new ConcurrentLinkedQueue();
            }
            Queue queue2 = this.d;
            if (queue2 == null || queue2.isEmpty()) {
                return;
            }
            printLogMessage(getGeneralLogInfo(str, "clear message queue...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.d = new ConcurrentLinkedQueue();
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "clear queue has exception=" + e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    private void a(String str, IDeviceSetting iDeviceSetting, OnSettingListener onSettingListener) {
        if (onSettingListener == null) {
            return;
        }
        if (iDeviceSetting == null || iDeviceSetting.encodeCmdBytes() == null) {
            onSettingListener.onFailure(LSErrorCode.ParameterError.getCode());
            return;
        }
        String str2 = String.format("%X", Integer.valueOf(iDeviceSetting.getCmd()));
        if (LSBluetoothManager.getInstance().checkConnectState(str) != LSConnectState.ConnectSuccess) {
            printLogMessage(getGeneralLogInfo(str, "failed to push sync setting,not connected. " + str2 + "[" + str + "]", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            onSettingListener.onFailure(LSErrorCode.DeviceNotConnected.getCode());
            return;
        }
        printLogMessage(getGeneralLogInfo(str, "post setting info=" + String.format("%X", Integer.valueOf(iDeviceSetting.getCmd())) + "; device[" + str + "]; cmd=" + com.lifesense.plugin.ble.c.a.d(iDeviceSetting.encodeCmdBytes()), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        g();
        b bVar = new b();
        bVar.a(iDeviceSetting.encodeCmdBytes());
        bVar.a(str);
        bVar.a(iDeviceSetting.getCmd());
        if (iDeviceSetting instanceof ATFileSetting) {
            bVar.a(((ATFileSetting) iDeviceSetting).getFile());
        }
        com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, new h(this, onSettingListener, iDeviceSetting));
    }

    private void a(String str, LSDeviceMessage lSDeviceMessage, OnSettingListener onSettingListener) {
        com.lifesense.plugin.ble.device.ancs.a aVar;
        b bVar;
        if (com.lifesense.plugin.ble.c.b.a(str) == null || lSDeviceMessage == null) {
            if (onSettingListener != null) {
                onSettingListener.onFailure(LSErrorCode.ParameterError.getCode());
                return;
            }
            return;
        }
        g gVar = new g(this, onSettingListener);
        if (!(lSDeviceMessage instanceof ATImageMessage)) {
            if (lSDeviceMessage instanceof ATTextMessage) {
                ATTextMessage aTTextMessage = (ATTextMessage) lSDeviceMessage;
                aVar = new com.lifesense.plugin.ble.device.ancs.a(aTTextMessage.getTitle(), aTTextMessage.getContent(), aTTextMessage.getMsgCategory().getValue());
                if (aTTextMessage.getMsgCategory() == LSAppCategory.IncomingCall) {
                    if (aTTextMessage.getPhoneState() != null) {
                        aVar.b(aTTextMessage.getPhoneState().getValue());
                    }
                    bVar = new b();
                    bVar.a(aVar);
                    bVar.a(2);
                } else {
                    bVar = new b();
                }
                com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, gVar);
            }
            return;
        }
        ATImageMessage aTImageMessage = (ATImageMessage) lSDeviceMessage;
        aVar = new com.lifesense.plugin.ble.device.ancs.a(aTImageMessage.getTitle(), aTImageMessage.getContent(), aTImageMessage.getMsgCategory().getValue());
        aVar.a(aTImageMessage);
        bVar = new b();
        bVar.a(aVar);
        bVar.a(3);
        com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, gVar);
    }
}
