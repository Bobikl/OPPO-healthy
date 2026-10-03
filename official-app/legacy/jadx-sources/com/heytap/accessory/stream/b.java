package com.heytap.accessory.stream;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.CompleteRequest;
import com.heytap.accessory.stream.model.CtrlResponse;
import com.heytap.accessory.stream.model.SetupRequest;
import com.heytap.accessory.stream.model.SetupResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b implements com.heytap.accessory.transport.control.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f2714l = "b";
    public Handler a;
    public com.heytap.accessory.stream.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Integer, SetupRequest> f2715c = new HashMap();
    public Map<Integer, d> d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<Integer, a> f2716e = new HashMap();
    public Map<Integer, RunnableC0264b> f = new HashMap();
    public Map<Integer, c> g = new HashMap();
    public Map<Integer, com.heytap.accessory.stream.model.a> h = new HashMap();
    public Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f2717j;
    public com.heytap.accessory.stream.utils.c k;

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

    /* JADX INFO: renamed from: com.heytap.accessory.stream.b$b, reason: collision with other inner class name */
    public class RunnableC0264b implements Runnable {
        public int a;

        public RunnableC0264b(int i) {
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

    public class d implements Runnable {
        public int a;

        public d(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.g(this.a);
        }
    }

    public enum e {
        SENDER,
        RECEIVER
    }

    public b(com.heytap.accessory.stream.a aVar, Handler handler, e eVar, Looper looper, com.heytap.accessory.stream.utils.c cVar) {
        this.k = cVar;
        this.b = aVar;
        this.i = handler;
        this.f2717j = eVar;
        if (looper != null) {
            this.a = new Handler(looper);
        }
    }

    public final void e(int i) {
        Message messageObtainMessage = this.i.obtainMessage(503);
        messageObtainMessage.arg1 = com.heytap.accessory.stream.model.c.RESULT_FAILURE.ordinal();
        messageObtainMessage.arg2 = 4;
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        messageObtainMessage.setData(data);
        this.i.sendMessage(messageObtainMessage);
        com.heytap.accessory.base.logging.a.b(f2714l, "CompletionTimeout");
    }

    public void f(int i) {
        if (this.f2716e.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.f2716e.remove(Integer.valueOf(i)));
        }
        a aVar = new a(i);
        this.f2716e.put(Integer.valueOf(i), aVar);
        this.a.postDelayed(aVar, com.heytap.accessory.stream.utils.b.b(b()));
    }

    public final void g(int i) {
        Message messageObtainMessage = this.i.obtainMessage(501);
        Bundle data = messageObtainMessage.getData();
        data.putParcelable("parcelable_setup_response", new SetupResponse(i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 4));
        messageObtainMessage.setData(data);
        this.i.sendMessage(messageObtainMessage);
        a(new CancelRequest(i, 4));
        com.heytap.accessory.base.logging.a.b(f2714l, "SetupTimeout");
    }

    public String toString() {
        return "Command Manager mCallerState State";
    }

    public synchronized void a(SetupRequest setupRequest) {
        if (setupRequest == null) {
            com.heytap.accessory.base.logging.a.e(f2714l, "current request has been set to null. Ignoring setup.");
            return;
        }
        this.f2715c.put(Integer.valueOf(setupRequest.f()), setupRequest);
        try {
            a(setupRequest.a(), 200, setupRequest.g().toString());
            d dVar = new d(setupRequest.f());
            this.d.put(Integer.valueOf(setupRequest.f()), dVar);
            this.a.postDelayed(dVar, com.heytap.accessory.stream.utils.b.f(b()));
            com.heytap.accessory.base.logging.a.a(f2714l, "ST_SETUP_REQ sent. Scheduled setup timer");
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(f2714l, "Marshalling JSON failed in sendSetupRequest " + e2);
            com.heytap.accessory.stream.utils.b.a(this.i, 1, null);
        }
        b(setupRequest.f()).a(3);
    }

    public int b() {
        com.heytap.accessory.stream.utils.c cVar = this.k;
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
        com.heytap.accessory.base.logging.a.a(f2714l, "AliveTimeout");
    }

    public final void d(int i) {
        Message messageObtainMessage = this.i.obtainMessage(507);
        messageObtainMessage.arg1 = com.heytap.accessory.stream.model.c.RESULT_FAILURE.ordinal();
        messageObtainMessage.arg2 = 4;
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        messageObtainMessage.setData(data);
        this.i.sendMessage(messageObtainMessage);
        com.heytap.accessory.base.logging.a.b(f2714l, "CancelTimeout");
    }

    public final com.heytap.accessory.stream.model.a b(int i) {
        com.heytap.accessory.stream.model.a aVar = this.h.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        com.heytap.accessory.stream.model.a aVar2 = new com.heytap.accessory.stream.model.a();
        aVar2.a(1);
        this.h.put(Integer.valueOf(i), aVar2);
        return aVar2;
    }

    @Override // com.heytap.accessory.transport.control.a
    public synchronized void a(@NonNull com.heytap.accessory.transport.control.b bVar) {
        try {
            a(bVar.a(), bVar.b(), bVar.d().toString());
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(f2714l, e2);
        }
    }

    public boolean a(int i, int i2, long j2, boolean z) {
        return a(i, i2, j2, 0, z);
    }

    public boolean a(int i, int i2, long j2, int i3, boolean z) {
        SetupResponse setupResponse;
        SetupRequest setupRequest = this.f2715c.get(Integer.valueOf(i));
        if (setupRequest == null) {
            com.heytap.accessory.base.logging.a.b(f2714l, "mCurrentRequest is null");
            return false;
        }
        if (z) {
            setupResponse = new SetupResponse(i, j2, i3);
        } else {
            SetupResponse setupResponse2 = new SetupResponse(i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, i2);
            this.f2715c.remove(Integer.valueOf(i));
            setupResponse = setupResponse2;
        }
        try {
            if (b(i).a() == 2) {
                a(setupRequest.a(), 200, setupResponse.e().toString());
                com.heytap.accessory.base.logging.a.a(f2714l + " - TCTrack", "ST_SETUP_RSP sent, confirm:" + z + ", maxWindowSize:" + j2);
                if (z) {
                    b(i).a(4);
                } else {
                    b(i).a(5);
                }
                return true;
            }
            com.heytap.accessory.base.logging.a.a(f2714l, "ignoring receiveStream() as it is an invalid request at this point");
            return false;
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(f2714l, "confirmSetup: Marshalling JSON failed " + e2);
            com.heytap.accessory.stream.utils.b.a(this.i, 1, null);
            return false;
        }
    }

    public void a(CancelRequest cancelRequest) {
        int iA = b(cancelRequest.c()).a();
        try {
            e eVar = this.f2717j;
            if (eVar == e.SENDER) {
                if (iA != 1 && iA != 12 && iA != 13 && iA != 11 && iA != 10 && iA != 6 && iA != 9) {
                    a(this.f2715c.get(Integer.valueOf(cancelRequest.c())).a(), 200, cancelRequest.d().toString());
                } else {
                    com.heytap.accessory.base.logging.a.b(f2714l, "invalid request for cancel");
                    return;
                }
            } else if (eVar == e.RECEIVER) {
                if (iA != 1 && iA != 2 && iA != 12 && iA != 13 && iA != 11 && iA != 10 && iA != 7 && iA != 8) {
                    SetupRequest setupRequest = this.f2715c.get(Integer.valueOf(cancelRequest.c()));
                    if (setupRequest == null) {
                        return;
                    } else {
                        a(setupRequest.a(), 200, cancelRequest.d().toString());
                    }
                }
                com.heytap.accessory.base.logging.a.b(f2714l, "invalid request for cancel");
                return;
            }
            if (iA == 3) {
                this.a.removeCallbacks(this.d.remove(Integer.valueOf(cancelRequest.c())));
            } else if (this.f2717j == e.RECEIVER) {
                this.a.removeCallbacks(this.f2716e.remove(Integer.valueOf(cancelRequest.c())));
            }
            RunnableC0264b runnableC0264b = new RunnableC0264b(cancelRequest.c());
            this.f.put(Integer.valueOf(cancelRequest.c()), runnableC0264b);
            this.a.postDelayed(runnableC0264b, com.heytap.accessory.stream.utils.b.b(b()));
            com.heytap.accessory.base.logging.a.a(f2714l, "ST_CANCEL_REQ sent, scheduled cancel timer at " + this.f2717j.toString());
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.b(f2714l, "sendCancelRequest: Marshalling JSON failed");
            com.heytap.accessory.stream.utils.b.a(this.i, 1, null);
        }
        b(cancelRequest.c()).a(12);
    }

    public void a(int i, long j2) {
        this.a.removeCallbacks(this.f2716e.remove(Integer.valueOf(i)));
        SetupRequest setupRequest = this.f2715c.get(Integer.valueOf(i));
        if (b(i).a() != 13 && b(i).a() != 12 && b(i).a() != 11 && setupRequest != null) {
            CompleteRequest completeRequest = new CompleteRequest("streamtransfer-complete-req", i, j2);
            try {
                b(i).a(7);
                a(setupRequest.a(), 200, completeRequest.c().toString());
                c cVar = new c(i);
                this.g.put(Integer.valueOf(i), cVar);
                this.a.postDelayed(cVar, com.heytap.accessory.stream.utils.b.b(b()));
                com.heytap.accessory.base.logging.a.a(f2714l, "FT_COMPLETE_REQ sent, scheduled completion timer");
                return;
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.b(f2714l, "sendCompletionRequest: Marshalling JSON failed");
                com.heytap.accessory.stream.utils.b.a(this.i, 1, null);
                b(i).a(7);
                return;
            }
        }
        com.heytap.accessory.base.logging.a.a(f2714l, "Trying to send completion request in wrong state");
    }

    public void a(int i, int i2) {
        CtrlResponse ctrlResponse;
        SetupRequest setupRequest = this.f2715c.get(Integer.valueOf(i));
        if (setupRequest == null) {
            return;
        }
        if (i2 == -1) {
            ctrlResponse = new CtrlResponse("streamtransfer-complete-rsp", i, com.heytap.accessory.stream.model.c.RESULT_SUCCESS, i2);
        } else {
            ctrlResponse = new CtrlResponse("streamtransfer-complete-rsp", i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, i2);
        }
        try {
            a(setupRequest.a(), 200, ctrlResponse.e().toString());
            com.heytap.accessory.base.logging.a.a(f2714l, "ST_COMPLETE_RSP sent CompletionResponse");
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.b(f2714l, "sendCompletionResponse: Marshalling JSON failed");
            com.heytap.accessory.stream.utils.b.a(this.i, 1, null);
        }
    }

    public final void a(long j2, int i, String str) {
        if (this.a == null) {
            com.heytap.accessory.base.logging.a.b(f2714l, "sendCommand : commandHandler == null");
            return;
        }
        com.heytap.accessory.stream.a aVar = this.b;
        if (aVar != null) {
            if (aVar.a(j2, i, str.getBytes(StandardCharsets.UTF_8), false)) {
                return;
            }
            com.heytap.accessory.base.logging.a.a(f2714l, "sendCommand: writing failed..");
            return;
        }
        com.heytap.accessory.base.logging.a.a(f2714l, "sendCommand: Command Channel writer not available.Command ignored");
    }

    public void a() {
        Iterator<a> it = this.f2716e.values().iterator();
        while (it.hasNext()) {
            this.a.removeCallbacks(it.next());
        }
        Iterator<c> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            this.a.removeCallbacks(it2.next());
        }
        Iterator<d> it3 = this.d.values().iterator();
        while (it3.hasNext()) {
            this.a.removeCallbacks(it3.next());
        }
        Iterator<RunnableC0264b> it4 = this.f.values().iterator();
        while (it4.hasNext()) {
            this.a.removeCallbacks(it4.next());
        }
        this.f2716e.clear();
        this.g.clear();
        this.d.clear();
        this.f.clear();
        com.heytap.accessory.base.logging.a.a(f2714l, "StreamCommandManager: cleaned up()");
    }

    public void a(int i) {
        if (this.f2716e.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.f2716e.remove(Integer.valueOf(i)));
        }
        if (this.g.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.g.remove(Integer.valueOf(i)));
        }
        if (this.d.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.g.remove(Integer.valueOf(i)));
        }
        if (this.f.get(Integer.valueOf(i)) != null) {
            this.a.removeCallbacks(this.g.remove(Integer.valueOf(i)));
        }
        com.heytap.accessory.base.logging.a.a(f2714l, "CommandManager: cleaned up " + i);
    }

    public void a(long j2, long j3, byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, StandardCharsets.UTF_8));
            String string = jSONObject.getString("msgId");
            int i = jSONObject.getInt("transId");
            Bundle bundle = new Bundle();
            if (string.equalsIgnoreCase("streamtransfer-setup-req")) {
                StringBuilder sb = new StringBuilder();
                String str = f2714l;
                sb.append(str);
                sb.append(" - TCTrack");
                com.heytap.accessory.base.logging.a.a(sb.toString(), "[handleCommand] ST_SETUP_REQ Received " + i);
                if (b(i).a() != 2 && b(i).a() != 4) {
                    b(i).a(2);
                    SetupRequest setupRequestA = SetupRequest.a(jSONObject);
                    com.heytap.accessory.base.logging.a.a(str, "channel " + setupRequestA.b());
                    setupRequestA.b(j3);
                    setupRequestA.a(j2);
                    Message messageObtainMessage = this.i.obtainMessage(500);
                    bundle.putParcelable("setupRequest", setupRequestA);
                    messageObtainMessage.setData(bundle);
                    this.i.sendMessage(messageObtainMessage);
                    this.f2715c.put(Integer.valueOf(setupRequestA.f()), setupRequestA);
                    return;
                }
                com.heytap.accessory.base.logging.a.a(str, "In invalid/busy state, dismiss Setup Request");
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-setup-rsp")) {
                SetupResponse setupResponseB = SetupResponse.b(jSONObject);
                StringBuilder sb2 = new StringBuilder();
                String str2 = f2714l;
                sb2.append(str2);
                sb2.append(" - TCTrack");
                com.heytap.accessory.base.logging.a.a(sb2.toString(), "Received ST_SETUP_RSP, transId: " + i + " , currentState:" + b(i).a() + ", maxWindowSize:" + setupResponseB.g());
                this.a.removeCallbacks(this.d.remove(Integer.valueOf(setupResponseB.d())));
                if (b(i).a() != 3) {
                    com.heytap.accessory.base.logging.a.a(str2, "Setup response came in invalid state");
                    return;
                }
                Message messageObtainMessage2 = this.i.obtainMessage(501);
                if (setupResponseB.c() == com.heytap.accessory.stream.model.c.RESULT_SUCCESS) {
                    b(i).a(4);
                } else {
                    b(i).a(5);
                }
                bundle.putParcelable("parcelable_setup_response", setupResponseB);
                messageObtainMessage2.setData(bundle);
                this.i.sendMessage(messageObtainMessage2);
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-cancel-req")) {
                StringBuilder sb3 = new StringBuilder();
                String str3 = f2714l;
                sb3.append(str3);
                sb3.append(" - TCTrack");
                com.heytap.accessory.base.logging.a.a(sb3.toString(), "[handleCommand] ST_CANCEL_REQ Received " + i + " , " + b(i).a());
                int iA = b(i).a();
                CancelRequest cancelRequest = new CancelRequest();
                cancelRequest.a(jSONObject);
                b(i).a(13);
                if (this.f2717j == e.RECEIVER) {
                    this.a.removeCallbacks(this.f2716e.remove(Integer.valueOf(cancelRequest.c())));
                }
                a(this.f2715c.get(Integer.valueOf(cancelRequest.c())).a(), 200, new CtrlResponse("streamtransfer-cancel-rsp", cancelRequest.c(), com.heytap.accessory.stream.model.c.RESULT_SUCCESS, cancelRequest.b()).e().toString());
                b(i).a(11);
                com.heytap.accessory.base.logging.a.a(str3, "Sent Cancel response from " + this.f2717j.toString());
                Message messageObtainMessage3 = this.i.obtainMessage(506);
                messageObtainMessage3.arg1 = cancelRequest.b();
                messageObtainMessage3.arg2 = iA;
                Bundle data = messageObtainMessage3.getData();
                data.putInt("transId", cancelRequest.c());
                messageObtainMessage3.setData(data);
                this.i.sendMessage(messageObtainMessage3);
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-cancel-rsp")) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = f2714l;
                sb4.append(str4);
                sb4.append(" - TCTrack");
                com.heytap.accessory.base.logging.a.a(sb4.toString(), "[handleCommand] ST_CANCEL_RSP Received " + i + " , " + b(i).a());
                this.a.removeCallbacks(this.f.remove(Integer.valueOf(i)));
                if (b(i).a() != 12) {
                    com.heytap.accessory.base.logging.a.a(str4, "Cancel response came in invalid state");
                    return;
                }
                b(i).a(10);
                CtrlResponse ctrlResponseA = CtrlResponse.a(jSONObject);
                Message messageObtainMessage4 = this.i.obtainMessage(507);
                messageObtainMessage4.arg1 = ctrlResponseA.c().ordinal();
                messageObtainMessage4.arg2 = ctrlResponseA.b();
                Bundle data2 = messageObtainMessage4.getData();
                data2.putInt("transId", ctrlResponseA.d());
                messageObtainMessage4.setData(data2);
                this.i.sendMessage(messageObtainMessage4);
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-appalive-req")) {
                com.heytap.accessory.base.logging.a.a(f2714l + " - TCTrack", "[handleCommand] ST_APPALIVE_REQ Received " + i);
                CompleteRequest completeRequest = new CompleteRequest();
                completeRequest.a(jSONObject);
                a(this.f2715c.get(Integer.valueOf(i)).a(), 200, new CtrlResponse("streamtransfer-appalive-rsp", completeRequest.b(), com.heytap.accessory.stream.model.c.RESULT_SUCCESS, -1).e().toString());
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-appalive-rsp")) {
                this.a.removeCallbacks(this.f2716e.remove(Integer.valueOf(i)));
                com.heytap.accessory.base.logging.a.a(f2714l, "[handleCommand] ST_APPALIVE_RSP Received " + i);
                CtrlResponse.a(jSONObject);
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-complete-req")) {
                StringBuilder sb5 = new StringBuilder();
                String str5 = f2714l;
                sb5.append(str5);
                sb5.append(" - TCTrack");
                com.heytap.accessory.base.logging.a.a(sb5.toString(), "[handleCommand] ST_COMPLETE_REQ Received " + i + " , " + b(i).a());
                CompleteRequest completeRequest2 = new CompleteRequest();
                completeRequest2.a(jSONObject);
                if (b(i).a() == 12) {
                    com.heytap.accessory.base.logging.a.a(str5, "Completion request received in wrong state: " + b(i).a());
                    a(i, 3);
                    return;
                }
                b(i).a(6);
                Message messageObtainMessage5 = this.i.obtainMessage(502);
                messageObtainMessage5.obj = Long.valueOf(completeRequest2.a());
                Bundle data3 = messageObtainMessage5.getData();
                data3.putInt("transId", i);
                messageObtainMessage5.setData(data3);
                this.i.sendMessage(messageObtainMessage5);
                return;
            }
            if (string.equalsIgnoreCase("streamtransfer-complete-rsp")) {
                StringBuilder sb6 = new StringBuilder();
                String str6 = f2714l;
                sb6.append(str6);
                sb6.append(" - TCTrack");
                com.heytap.accessory.base.logging.a.a(sb6.toString(), "[handleCommand] ST_COMPLETE_RSP Received " + i + " , " + b(i).a());
                this.a.removeCallbacks(this.g.remove(Integer.valueOf(i)));
                if (b(i).a() != 7) {
                    com.heytap.accessory.base.logging.a.a(str6, "Complete response came in wrong state: " + b(i).a());
                    return;
                }
                b(i).a(8);
                CtrlResponse ctrlResponseA2 = CtrlResponse.a(jSONObject);
                Message messageObtainMessage6 = this.i.obtainMessage(503);
                messageObtainMessage6.arg1 = ctrlResponseA2.c().ordinal();
                messageObtainMessage6.arg2 = ctrlResponseA2.b();
                Bundle data4 = messageObtainMessage6.getData();
                data4.putInt("transId", i);
                messageObtainMessage6.setData(data4);
                this.i.sendMessage(messageObtainMessage6);
                return;
            }
            if (string.equalsIgnoreCase("filetransfer-window-size")) {
                SetupRequest setupRequest = this.f2715c.get(Integer.valueOf(i));
                if (setupRequest == null) {
                    com.heytap.accessory.base.logging.a.b(f2714l + " - TCTrack", "TCRequest error: setupRequest is null");
                    return;
                }
                com.heytap.accessory.transport.control.c.a(new com.heytap.accessory.transport.control.b(setupRequest.a(), setupRequest.b(), jSONObject));
                return;
            }
            com.heytap.accessory.base.logging.a.e(f2714l, "receive unknown msgType:" + string);
        } catch (JSONException e2) {
            com.heytap.accessory.base.logging.a.b(f2714l, "handleIncomingData: Unable to parse incoming json " + e2);
            com.heytap.accessory.stream.utils.b.a(this.i, 1, null);
        }
    }
}
