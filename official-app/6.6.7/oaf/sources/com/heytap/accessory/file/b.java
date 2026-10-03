package com.heytap.accessory.file;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.Constant;
import com.heytap.accessory.file.model.CtrlRequest;
import com.heytap.accessory.file.model.CtrlResponse;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.accessory.file.model.SetupResponse;
import com.heytap.accessory.sdp.service.protocol.ServiceDiscoveryUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class b implements com.heytap.accessory.transport.control.a {
    public static final String l = "b";
    public Handler a;
    public com.heytap.accessory.file.a b;
    public Map<Integer, SetupRequest> c = new HashMap();
    public Map<Integer, e> d = new HashMap();
    public Map<Integer, a> e = new HashMap();
    public Map<Integer, b> f = new HashMap();
    public Map<Integer, c> g = new HashMap();
    public Map<Integer, com.heytap.accessory.file.c> h = new HashMap();
    public Handler i;
    public d j;
    public com.heytap.accessory.file.utils.c k;

    public class a implements Runnable {
        public int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c(this.a);
        }
    }

    public class b implements Runnable {
        public int a;

        public b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.a);
        }
    }

    public class c implements Runnable {
        public int a;

        public c(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.e(this.a);
        }
    }

    public enum d {
        a,
        b
    }

    public class e implements Runnable {
        public int a;

        public e(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.g(this.a);
        }
    }

    public b(com.heytap.accessory.file.a aVar, Handler handler, d dVar, Looper looper, com.heytap.accessory.file.utils.c cVar, String str) {
        this.k = cVar;
        this.b = aVar;
        this.i = handler;
        this.j = dVar;
        if (looper != null) {
            this.a = new Handler(looper);
        }
    }

    public final void e(int i) {
        Message messageObtainMessage = this.i.obtainMessage(503);
        messageObtainMessage.arg1 = com.heytap.accessory.file.model.c.b.ordinal();
        messageObtainMessage.arg2 = 4;
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        messageObtainMessage.setData(data);
        this.i.sendMessage(messageObtainMessage);
        com.heytap.accessory.base.logging.a.b(l, "CompletionTimeout");
    }

    public void f(int i) {
        if (this.e.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.e.remove(Integer.valueOf(i)));
        }
        a aVar = new a(i);
        this.e.put(Integer.valueOf(i), aVar);
        this.a.postDelayed(aVar, com.heytap.accessory.file.utils.a.b());
    }

    public final void g(int i) {
        Message messageObtainMessage = this.i.obtainMessage(501);
        messageObtainMessage.arg1 = com.heytap.accessory.file.model.c.b.ordinal();
        messageObtainMessage.arg2 = 4;
        this.i.sendMessage(messageObtainMessage);
        a(new CancelRequest(this.c.get(Integer.valueOf(i)).l(), 4, this.c.get(Integer.valueOf(i)).g()));
        com.heytap.accessory.base.logging.a.b(l, "SetupTimeout,transactionId:" + i);
    }

    public void h(int i) {
        this.a.removeCallbacks(this.e.get(Integer.valueOf(i)));
        SetupRequest setupRequest = this.c.get(Integer.valueOf(i));
        if (b(i).a() == 13 || b(i).a() == 12 || b(i).a() == 11 || setupRequest == null) {
            com.heytap.accessory.base.logging.a.a(l, "Trying to send completion request in wrong state");
            return;
        }
        CtrlRequest ctrlRequest = new CtrlRequest("filetransfer-complete-req", setupRequest.l(), setupRequest.g());
        try {
            b(i).a(7);
            a(setupRequest.a(), 100, ctrlRequest.b().toString());
            c cVar = new c(i);
            this.g.put(Integer.valueOf(i), cVar);
            this.a.postDelayed(cVar, com.heytap.accessory.file.utils.a.c(b()));
            com.heytap.accessory.base.logging.a.d(l, "[sfcmd]FT_COMPLETE_REQ sent, scheduled completion timer, transId: " + i);
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.b(l, "sendCompletionRequest: Marshalling JSON failed");
            com.heytap.accessory.file.utils.a.a(this.i, 1, i);
            b(i).a(7);
        }
    }

    public String toString() {
        return "Command Manager mCallerState State";
    }

    @Override // com.heytap.accessory.transport.control.a
    public void a(com.heytap.accessory.transport.control.b bVar) {
        try {
            com.heytap.accessory.base.logging.a.a(l, "[sfcmd]filetransfer-window-size sent, request: " + bVar);
            a(bVar.a(), bVar.b(), bVar.d().toString());
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(l, e2);
        }
    }

    public int b() {
        com.heytap.accessory.file.utils.c cVar = this.k;
        if (cVar != null) {
            return cVar.a();
        }
        return -1;
    }

    public final void c(int i) {
        Message messageObtainMessage = this.i.obtainMessage(4);
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        messageObtainMessage.setData(data);
        this.i.sendMessage(messageObtainMessage);
        com.heytap.accessory.base.logging.a.b(l, "AliveCtrlTimeout");
    }

    public final void d(int i) {
        Message messageObtainMessage = this.i.obtainMessage(507);
        messageObtainMessage.arg1 = com.heytap.accessory.file.model.c.b.ordinal();
        messageObtainMessage.arg2 = 4;
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        messageObtainMessage.setData(data);
        this.i.sendMessage(messageObtainMessage);
        com.heytap.accessory.base.logging.a.b(l, "CancelTimeout");
    }

    public final com.heytap.accessory.file.c b(int i) {
        com.heytap.accessory.file.c cVar = this.h.get(Integer.valueOf(i));
        if (cVar != null) {
            return cVar;
        }
        com.heytap.accessory.file.c cVar2 = new com.heytap.accessory.file.c();
        cVar2.a(1);
        this.h.put(Integer.valueOf(i), cVar2);
        return cVar2;
    }

    public synchronized void a(SetupRequest setupRequest) {
        if (setupRequest != null) {
            String str = l;
            com.heytap.accessory.base.logging.a.c(str, "[sfcmd]FT_SETUP_REQ sent,connId:" + setupRequest.c() + ",transId:" + setupRequest.l());
            this.c.put(Integer.valueOf(setupRequest.l()), setupRequest);
            try {
                a(setupRequest.a(), 100, setupRequest.m().toString());
                e eVar = new e(setupRequest.l());
                this.d.put(Integer.valueOf(setupRequest.l()), eVar);
                long jG = com.heytap.accessory.file.utils.a.g(b());
                this.a.postDelayed(eVar, jG);
                com.heytap.accessory.base.logging.a.d(str, "FT_SETUP_REQ sent. Scheduled setup timer: " + jG + "; transId: " + setupRequest.l());
            } catch (JSONException e2) {
                com.heytap.accessory.base.logging.a.b(l, "Marshalling JSON failed in sendSetupRequest " + e2);
                com.heytap.accessory.file.utils.a.a(this.i, 1, setupRequest.l());
            }
            b(setupRequest.l()).a(3);
            return;
        }
        com.heytap.accessory.base.logging.a.a(l, "current request has been set to null. Ignoring setup.");
    }

    public boolean a(int i, int i2, long j, boolean z) {
        return a(i, i2, j, 0, z);
    }

    public boolean a(int i, int i2, long j, int i3, boolean z) {
        SetupResponse setupResponse;
        SetupRequest setupRequest = this.c.get(Integer.valueOf(i));
        if (setupRequest == null) {
            com.heytap.accessory.base.logging.a.b(l, "mCurrentRequest is null, transId:" + i + ", map:" + this.c.keySet());
            return false;
        }
        if (z) {
            setupResponse = new SetupResponse(setupRequest.l(), setupRequest.g(), j, i3);
        } else {
            SetupResponse setupResponse2 = new SetupResponse(setupRequest.l(), com.heytap.accessory.file.model.c.b, i2, setupRequest.g());
            this.c.remove(Integer.valueOf(i));
            setupResponse = setupResponse2;
        }
        try {
            if (b(i).a() == 2) {
                String string = setupResponse.g().toString();
                a(setupRequest.a(), 100, string);
                com.heytap.accessory.base.logging.a.d(l + " - tcTrack", "[sfcmd]FT_SETUP_RSP sent: " + string);
                if (z) {
                    b(i).a(4);
                } else {
                    b(i).a(5);
                }
                return true;
            }
            com.heytap.accessory.base.logging.a.d(l, "ignoring receiveFile() as it is an invalid request at this point");
            return false;
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(l, "confirmSetup: Marshalling JSON failed " + e2);
            com.heytap.accessory.file.utils.a.a(this.i, 1, i);
            return false;
        }
    }

    public void a(@NonNull CancelRequest cancelRequest) {
        int iA = b(cancelRequest.d()).a();
        try {
            d dVar = this.j;
            if (dVar == d.a) {
                if (iA != 1 && iA != 12 && iA != 13 && iA != 11 && iA != 10 && iA != 6 && iA != 9) {
                    a(this.c.get(Integer.valueOf(cancelRequest.d())).a(), 100, cancelRequest.e().toString());
                }
                com.heytap.accessory.base.logging.a.b(l, "invalid request for cancel, state:" + iA);
                return;
            }
            if (dVar == d.b) {
                if (iA != 1 && iA != 2 && iA != 12 && iA != 13 && iA != 11 && iA != 10 && iA != 7 && iA != 8) {
                    a(this.c.get(Integer.valueOf(cancelRequest.d())).a(), 100, cancelRequest.e().toString());
                }
                com.heytap.accessory.base.logging.a.b(l, "[send]invalid request for cancel state:" + iA);
                return;
            }
            if (iA == 3) {
                this.a.removeCallbacks(this.d.get(Integer.valueOf(cancelRequest.d())));
            } else if (this.j == d.b) {
                this.a.removeCallbacks(this.e.get(Integer.valueOf(cancelRequest.d())));
            }
            b bVar = new b(cancelRequest.d());
            this.f.put(Integer.valueOf(cancelRequest.d()), bVar);
            this.a.postDelayed(bVar, com.heytap.accessory.file.utils.a.c(b()));
            com.heytap.accessory.base.logging.a.d(l, "[sfcmd]FT_CANCEL_REQ sent, scheduled cancel timer at " + this.j.toString());
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.b(l, "[sfcmd]sendCancelRequest: Marshalling JSON failed");
            com.heytap.accessory.file.utils.a.a(this.i, 1, cancelRequest.d());
        }
        b(cancelRequest.d()).a(12);
    }

    public void a(int i, long j) {
        SetupRequest setupRequest = this.c.get(Integer.valueOf(i));
        if (setupRequest == null) {
            com.heytap.accessory.base.logging.a.e(l, "process wrong " + i);
            return;
        }
        try {
            com.heytap.accessory.base.logging.a.d(l, "FT_PROGRESS_SEND sent " + i);
            a(setupRequest.a(), 100, new com.heytap.accessory.file.model.a(setupRequest.l(), j, setupRequest.g()).c().toString());
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.b(l, "sendProgressToSender: Marshalling JSON failed");
            com.heytap.accessory.file.utils.a.a(this.i, 1, i);
        }
    }

    public void a(int i, int i2) {
        CtrlResponse ctrlResponse;
        SetupRequest setupRequest = this.c.get(Integer.valueOf(i));
        if (setupRequest == null) {
            return;
        }
        if (i2 == -1) {
            ctrlResponse = new CtrlResponse("filetransfer-complete-rsp", setupRequest.l(), com.heytap.accessory.file.model.c.a, i2, setupRequest.g());
            b(i).a(9);
        } else {
            ctrlResponse = new CtrlResponse("filetransfer-complete-rsp", setupRequest.l(), com.heytap.accessory.file.model.c.b, i2, setupRequest.g());
        }
        try {
            com.heytap.accessory.base.logging.a.d(l, "[sfcmd]FT_COMPLETE_RSP sent,transId:" + i);
            a(setupRequest.a(), 100, ctrlResponse.g().toString());
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.b(l, "sendCompletionResponse: Marshalling JSON failed");
            com.heytap.accessory.file.utils.a.a(this.i, 1, i);
        }
    }

    public final void a(long j, int i, String str) {
        if (this.a == null) {
            com.heytap.accessory.base.logging.a.b(l, "sendCommand : commandHandler == null");
            return;
        }
        com.heytap.accessory.file.a aVar = this.b;
        if (aVar != null) {
            if (aVar.a(j, i, str.getBytes(StandardCharsets.UTF_8))) {
                return;
            }
            com.heytap.accessory.base.logging.a.d(l, "sendCommand: writing failed..");
            return;
        }
        com.heytap.accessory.base.logging.a.d(l, "sendCommand: Command Channel writer not available.Command ignored");
    }

    public void a() {
        Iterator<a> it = this.e.values().iterator();
        while (it.hasNext()) {
            this.a.removeCallbacks(it.next());
        }
        Iterator<c> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            this.a.removeCallbacks(it2.next());
        }
        Iterator<e> it3 = this.d.values().iterator();
        while (it3.hasNext()) {
            this.a.removeCallbacks(it3.next());
        }
        Iterator<b> it4 = this.f.values().iterator();
        while (it4.hasNext()) {
            this.a.removeCallbacks(it4.next());
        }
        this.e.clear();
        this.g.clear();
        this.d.clear();
        this.f.clear();
        com.heytap.accessory.base.logging.a.d(l, "CommandManager: cleaned up()");
    }

    public void a(int i) {
        if (this.e.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.e.get(Integer.valueOf(i)));
        }
        if (this.g.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.g.get(Integer.valueOf(i)));
        }
        if (this.d.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.g.get(Integer.valueOf(i)));
        }
        if (this.f.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.g.get(Integer.valueOf(i)));
        }
        com.heytap.accessory.base.logging.a.d(l, "CommandManager: cleaned up timeout " + i);
    }

    public void a(long j, long j2, byte[] bArr) {
        try {
            String str = new String(bArr, StandardCharsets.UTF_8);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("msgId");
            int i = jSONObject.getInt("transId");
            Bundle bundle = new Bundle();
            String str2 = l;
            com.heytap.accessory.base.logging.a.a(str2, "[handleIncomingCommand], msgType:" + string + ", connId: " + j2 + ", transId:" + i + ", state:" + b(i).a() + " ,json:" + str);
            if (string.equalsIgnoreCase("filetransfer-setup-req")) {
                if (b(i).a() != 2 && b(i).a() != 4) {
                    b(i).a(2);
                    SetupRequest setupRequestA = SetupRequest.a(jSONObject);
                    setupRequestA.a(j);
                    setupRequestA.b(j2);
                    Message messageObtainMessage = this.i.obtainMessage(ServiceDiscoveryUtils.ATTEMPT_INTERVAL);
                    bundle.putParcelable("setupRequest", setupRequestA);
                    messageObtainMessage.setData(bundle);
                    this.i.sendMessage(messageObtainMessage);
                    this.c.put(Integer.valueOf(setupRequestA.l()), setupRequestA);
                    return;
                }
                com.heytap.accessory.base.logging.a.a(str2, "In invalid/busy state, dismiss Setup Request");
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-setup-rsp")) {
                SetupResponse setupResponseB = SetupResponse.b(jSONObject);
                e eVar = this.d.get(Integer.valueOf(setupResponseB.f()));
                if (eVar != null) {
                    this.a.removeCallbacks(eVar);
                }
                if (b(i).a() != 3) {
                    com.heytap.accessory.base.logging.a.d(str2, "Setup response came in invalid state");
                    return;
                }
                Message messageObtainMessage2 = this.i.obtainMessage(501);
                if (setupResponseB.e() == com.heytap.accessory.file.model.c.a) {
                    b(i).a(4);
                } else {
                    b(i).a(5);
                }
                bundle.putParcelable("parcelable_setup_response", setupResponseB);
                messageObtainMessage2.setData(bundle);
                this.i.sendMessage(messageObtainMessage2);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-cancel-req")) {
                com.heytap.accessory.base.logging.a.a(str2, "FT_CANCEL_REQ Received " + b(i).a() + jSONObject.toString());
                int iA = b(i).a();
                CancelRequest cancelRequest = new CancelRequest();
                cancelRequest.a(jSONObject);
                b(i).a(13);
                if (this.j == d.b) {
                    this.a.removeCallbacks(this.e.get(Integer.valueOf(cancelRequest.d())));
                }
                SetupRequest setupRequest = this.c.get(Integer.valueOf(cancelRequest.d()));
                if (setupRequest == null) {
                    com.heytap.accessory.base.logging.a.b(str2, "FT_CANCEL_REQ request==null, ignore this request!");
                    return;
                }
                a(setupRequest.a(), 100, new CtrlResponse("filetransfer-cancel-rsp", cancelRequest.d(), com.heytap.accessory.file.model.c.a, cancelRequest.c(), cancelRequest.b()).g().toString());
                b(i).a(11);
                com.heytap.accessory.base.logging.a.d(str2, "[sfcmd]Sent Cancel response from " + this.j.toString());
                Message messageObtainMessage3 = this.i.obtainMessage(506);
                messageObtainMessage3.arg1 = cancelRequest.c();
                messageObtainMessage3.arg2 = iA;
                Bundle data = messageObtainMessage3.getData();
                data.putInt("transId", cancelRequest.d());
                messageObtainMessage3.setData(data);
                this.i.sendMessage(messageObtainMessage3);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-cancel-rsp")) {
                this.a.removeCallbacks(this.f.get(Integer.valueOf(i)));
                if (b(i).a() != 12) {
                    com.heytap.accessory.base.logging.a.d(str2, "Cancel response came in invalid state");
                    return;
                }
                b(i).a(10);
                CtrlResponse ctrlResponseA = CtrlResponse.a(jSONObject);
                Message messageObtainMessage4 = this.i.obtainMessage(507);
                messageObtainMessage4.arg1 = ctrlResponseA.e().ordinal();
                messageObtainMessage4.arg2 = ctrlResponseA.c();
                Bundle data2 = messageObtainMessage4.getData();
                data2.putInt("transId", ctrlResponseA.f());
                messageObtainMessage4.setData(data2);
                this.i.sendMessage(messageObtainMessage4);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-appalive-req")) {
                com.heytap.accessory.base.logging.a.a(str2, "FT_APPALIVE_REQ Received from consumer ");
                CtrlRequest ctrlRequest = new CtrlRequest();
                ctrlRequest.a(jSONObject);
                SetupRequest setupRequest2 = this.c.get(Integer.valueOf(i));
                if (setupRequest2 == null) {
                    com.heytap.accessory.base.logging.a.b(str2, "FT_APPALIVE_REQ request==null, ignore this request!");
                    return;
                }
                com.heytap.accessory.base.logging.a.d(str2, "[sfcmd]filetransfer-appalive-rsp, transId: " + ctrlRequest.a());
                a(setupRequest2.a(), 100, new CtrlResponse("filetransfer-appalive-rsp", ctrlRequest.a(), com.heytap.accessory.file.model.c.a, -1, setupRequest2.g()).g().toString());
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-appalive-rsp")) {
                this.a.removeCallbacks(this.e.get(Integer.valueOf(i)));
                CtrlResponse.a(jSONObject);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-complete-req")) {
                new CtrlRequest().a(jSONObject);
                if (b(i).a() == 12) {
                    com.heytap.accessory.base.logging.a.d(str2, "Completion request received in wrong state: " + b(i).a());
                    a(i, 3);
                    return;
                }
                b(i).a(6);
                a(i, -1);
                Message messageObtainMessage5 = this.i.obtainMessage(502);
                Bundle data3 = messageObtainMessage5.getData();
                data3.putInt("transId", i);
                messageObtainMessage5.setData(data3);
                this.i.sendMessage(messageObtainMessage5);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-complete-rsp")) {
                this.a.removeCallbacks(this.g.get(Integer.valueOf(i)));
                if (b(i).a() != 7) {
                    com.heytap.accessory.base.logging.a.d(str2, "Complete response came in wrong state: " + b(i).a());
                    return;
                }
                b(i).a(8);
                CtrlResponse ctrlResponseA2 = CtrlResponse.a(jSONObject);
                Message messageObtainMessage6 = this.i.obtainMessage(503);
                messageObtainMessage6.arg1 = ctrlResponseA2.e().ordinal();
                messageObtainMessage6.arg2 = ctrlResponseA2.c();
                Bundle data4 = messageObtainMessage6.getData();
                data4.putInt("transId", i);
                messageObtainMessage6.setData(data4);
                this.i.sendMessage(messageObtainMessage6);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-receive-progress")) {
                com.heytap.accessory.file.model.a aVar = new com.heytap.accessory.file.model.a();
                aVar.a(jSONObject);
                long jA = aVar.a();
                Bundle bundle2 = new Bundle();
                bundle2.putLong(Constant.PROGRESS, jA);
                bundle2.putInt("transId", aVar.b());
                Message messageObtainMessage7 = this.i.obtainMessage(508);
                messageObtainMessage7.setData(bundle2);
                this.i.sendMessage(messageObtainMessage7);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-window-size")) {
                SetupRequest setupRequest3 = this.c.get(Integer.valueOf(i));
                if (setupRequest3 == null) {
                    com.heytap.accessory.base.logging.a.b(str2 + " - TCTrack", "TCRequest error: setupRequest is null");
                    return;
                }
                com.heytap.accessory.transport.control.c.a(new com.heytap.accessory.transport.control.b(setupRequest3.a(), setupRequest3.b(), jSONObject));
                return;
            }
            com.heytap.accessory.base.logging.a.e(str2, "receive unknown msgType:" + string);
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(l, "handleIncomingData: Unable to parse incoming json " + e2);
            com.heytap.accessory.file.utils.a.a(this.i, 1, 0);
        }
    }
}
