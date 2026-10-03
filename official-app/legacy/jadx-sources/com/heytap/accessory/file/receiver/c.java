package com.heytap.accessory.file.receiver;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.StatFs;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.file.e;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.CtrlResponse;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.accessory.file.model.SetupResponse;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.speech.engine.constant.EngineConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static final String m = "c";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<Integer> f2578n = Arrays.asList(101, 102, 103, 104, 105);
    public static final List<Integer> o = new ArrayList();
    public FileConsumerImpl a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FTConsumerConnection f2579c;
    public com.heytap.accessory.file.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.heytap.accessory.file.b f2580e;
    public HandlerC0246c f;
    public com.heytap.accessory.file.d g;
    public PowerManager.WakeLock h;
    public String i;
    public boolean b = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<Integer, d> f2581j = new HashMap();
    public Map<Integer, Integer> k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2582l = new Object();

    public class b implements Runnable {
        public final /* synthetic */ CtrlResponse a;

        public b(CtrlResponse ctrlResponse) {
            this.a = ctrlResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.d(c.m, "Service Connection Closed at:" + System.currentTimeMillis());
            for (d dVar : c.this.f2581j.values()) {
                if (dVar != null) {
                    SetupRequest setupRequest = dVar.d;
                    int iA = dVar.f2583c.a();
                    com.heytap.accessory.base.logging.a.d(c.m, "current state is :" + iA);
                    int iL = setupRequest == null ? -1 : setupRequest.l();
                    if (c.this.f2580e != null) {
                        c.this.f2580e.a();
                    }
                    com.heytap.accessory.file.receiver.a aVar = dVar.f2584e;
                    if (aVar != null) {
                        aVar.a();
                        dVar.f2584e = null;
                    }
                    c.this.f2579c = null;
                    c.this.b = false;
                    if (1 == iA || 5 == iA) {
                        com.heytap.accessory.base.logging.a.d(c.m, "Disconnect received while no file transfer/Completion request already received");
                        return;
                    }
                    if (7 != iA && 8 != iA) {
                        CtrlResponse ctrlResponse = this.a;
                        if (ctrlResponse != null) {
                            c.this.a(setupRequest, ctrlResponse);
                        } else {
                            com.heytap.accessory.base.logging.a.b(c.m, "Service connection lost while file transfer in progress");
                            CtrlResponse ctrlResponse2 = new CtrlResponse("filetransfer-cancel-rsp", iL, com.heytap.accessory.file.model.c.RESULT_FAILURE, 5, setupRequest.g());
                            if (c.this.g != null) {
                                c.this.a(setupRequest, ctrlResponse2);
                            }
                        }
                    } else if (c.this.g != null) {
                        c.this.g.a(setupRequest);
                    }
                }
            }
            c.this.f2581j.clear();
            c.this.k.clear();
            if (c.this.h.isHeld()) {
                c.this.h.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.heytap.accessory.file.receiver.c$c, reason: collision with other inner class name */
    public class HandlerC0246c extends Handler {
        public HandlerC0246c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String string;
            int i = message.what;
            if (i == 2) {
                int i2 = message.getData().getInt("transId", -1);
                int i3 = message.getData().getInt(EngineConstant.REASON, -1);
                if (i2 == -1) {
                    com.heytap.accessory.base.logging.a.b(c.m, "cancel req tranId wrong");
                    return;
                }
                d dVar = (d) c.this.f2581j.get(Integer.valueOf(i2));
                if (dVar == null) {
                    com.heytap.accessory.base.logging.a.b(c.m, "cancel req failed! taskRecord is null.");
                    return;
                }
                c.this.a(new CancelRequest(i2, i3 != -1 ? i3 : 2, dVar.d.g()));
            }
            if (i == 4) {
                int iA = c.this.a(message);
                if (iA == -1) {
                    return;
                }
                c.this.b(iA);
                return;
            }
            if (i == 406) {
                Bundle bundle = (Bundle) message.obj;
                int iA2 = c.this.a(message);
                if (iA2 == -1) {
                    return;
                }
                if (bundle != null) {
                    String string2 = bundle.getString("reff_path");
                    string = bundle.getString("filePath");
                    str = string2;
                } else {
                    str = "";
                    string = str;
                }
                c.this.a(iA2, message.arg1, str, string, message.arg2 == 1);
                return;
            }
            if (i == 500) {
                c.this.a((SetupRequest) message.getData().getParcelable("setupRequest"));
                return;
            }
            if (i == 503) {
                int iA3 = c.this.a(message);
                if (iA3 == -1) {
                    return;
                }
                c.this.b(iA3, com.heytap.accessory.file.model.c.a(message.arg1), message.arg2);
                return;
            }
            switch (i) {
                case 402:
                    c.this.a((CancelRequest) message.obj);
                    break;
                case 403:
                    c.this.a(message.arg1, (CtrlResponse) message.obj);
                    break;
                case 404:
                    Bundle bundle2 = (Bundle) message.obj;
                    byte[] byteArray = bundle2.getByteArray("EXTRA_KEY_DATA");
                    long j2 = bundle2.getLong("EXTRA_KEY_CONNECTION_ID");
                    long j3 = bundle2.getLong("accId");
                    int i4 = message.arg1;
                    com.heytap.accessory.base.logging.a.a(c.m, "RX on CH " + i4);
                    if (i4 == 100) {
                        c.this.a(j3, j2, byteArray);
                    } else if (c.this.a(i4)) {
                        c.this.a(j2, i4, byteArray);
                    }
                    break;
                default:
                    switch (i) {
                        case 506:
                            int iA4 = c.this.a(message);
                            if (iA4 != -1) {
                                c.this.a(iA4, message.arg1, message.arg2);
                                break;
                            }
                            break;
                        case 507:
                            int iA5 = c.this.a(message);
                            if (iA5 != -1) {
                                c.this.a(iA5, com.heytap.accessory.file.model.c.a(message.arg1), message.arg2);
                                break;
                            }
                            break;
                        case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                            int iA6 = c.this.a(message);
                            if (iA6 != -1) {
                                c.this.a(iA6, message.getData().getLong("progress"));
                                break;
                            }
                            break;
                        case 509:
                            int iA7 = c.this.a(message);
                            if (iA7 != -1) {
                                c.this.c(iA7);
                                break;
                            }
                            break;
                        default:
                            super.handleMessage(message);
                            break;
                    }
                    break;
            }
        }
    }

    public class d {
        public int a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.heytap.accessory.file.c f2583c;
        public SetupRequest d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.heytap.accessory.file.receiver.a f2584e;

        public d(c cVar, SetupRequest setupRequest) {
            String unused = cVar.i;
            this.b = setupRequest.a();
            this.a = setupRequest.l();
            setupRequest.k();
            com.heytap.accessory.file.c cVar2 = new com.heytap.accessory.file.c();
            this.f2583c = cVar2;
            cVar2.a(1);
            this.d = setupRequest;
        }
    }

    public c(FileConsumerImpl fileConsumerImpl, BaseSocket baseSocket, int i) {
        this.i = baseSocket.getConnectionId();
        if (i != 0) {
            com.heytap.accessory.base.logging.a.d(m, "onServiceConnectionResponse: connection establishment failed");
            return;
        }
        PowerManager powerManager = (PowerManager) fileConsumerImpl.getApplicationContext().getSystemService("power");
        if (powerManager != null) {
            this.h = powerManager.newWakeLock(1, "FTConsumer_" + System.currentTimeMillis());
        }
        this.a = fileConsumerImpl;
        if (this.f == null && com.heytap.accessory.file.utils.b.a() != null) {
            this.f = new HandlerC0246c(com.heytap.accessory.file.utils.b.a());
        }
        a(baseSocket);
    }

    public void b(int i, com.heytap.accessory.file.model.c cVar, int i2) {
        d dVar = this.f2581j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null");
            return;
        }
        CtrlResponse ctrlResponse = new CtrlResponse("filetransfer-complete-rsp", dVar.a, cVar, i2, dVar.d.g());
        com.heytap.accessory.transport.control.c.b(dVar.b, dVar.d.b(), 1);
        if (!com.heytap.accessory.file.utils.a.a(ctrlResponse, dVar.d)) {
            com.heytap.accessory.base.logging.a.e(m, "Invalid App Completion response for file:" + ctrlResponse.a());
            return;
        }
        if (ctrlResponse.e() == com.heytap.accessory.file.model.c.RESULT_SUCCESS) {
            com.heytap.accessory.base.logging.a.d(m, "handleCompletionResponse: Received completion success response from Provider.");
            dVar.f2583c.a(1);
            com.heytap.accessory.file.d dVar2 = this.g;
            if (dVar2 != null) {
                dVar2.a(dVar.d);
            }
        } else {
            com.heytap.accessory.base.logging.a.d(m, "handleCompletionResponse:negative response for completion request.File Name:" + ctrlResponse.a() + " Reason:" + ctrlResponse.d());
            dVar.f2583c.a(1);
            a(dVar.d, ctrlResponse);
        }
        com.heytap.accessory.file.receiver.a aVar = dVar.f2584e;
        if (aVar != null) {
            aVar.a();
            dVar.f2584e = null;
        }
        d(i);
    }

    public void c(int i) {
        d dVar = this.f2581j.get(Integer.valueOf(i));
        if (dVar == null) {
            return;
        }
        this.f2580e.h(dVar.a);
        if (this.h.isHeld()) {
            this.h.release();
        }
    }

    public final void d(int i) {
        synchronized (this.f2582l) {
            d dVar = this.f2581j.get(Integer.valueOf(i));
            if (dVar != null) {
                int iB = dVar.d.b();
                this.f2581j.remove(Integer.valueOf(i));
                this.k.remove(Integer.valueOf(iB));
            }
        }
    }

    public class a implements com.heytap.accessory.file.a {
        public a() {
        }

        @Override // com.heytap.accessory.file.a
        public boolean a(long j2, int i, byte[] bArr) {
            if (c.this.f2579c == null) {
                com.heytap.accessory.base.logging.a.d(c.m, "no active socket to send command");
                return false;
            }
            try {
                c.this.f2579c.send(100, bArr);
                return true;
            } catch (IOException unused) {
                com.heytap.accessory.base.logging.a.d(c.m, "Error on command channel");
                return false;
            }
        }

        @Override // com.heytap.accessory.file.a
        public boolean a(long j2, int i, Buffer buffer) {
            com.heytap.accessory.base.logging.a.b(c.m, "Method called in the wrong place.");
            return false;
        }
    }

    public final void c(String str) {
        com.heytap.accessory.base.logging.a.d(m, "initializeComponents: Preparing to receive file");
        com.heytap.accessory.file.b bVar = this.f2580e;
        if (bVar != null) {
            bVar.a();
        }
        this.f2580e = new com.heytap.accessory.file.b(this.d, this.f, com.heytap.accessory.file.b.d.RECEIVER, com.heytap.accessory.file.utils.b.a(), new com.heytap.accessory.file.utils.c(this.f2579c), str);
    }

    public void a(BaseSocket baseSocket) {
        this.b = true;
        FTConsumerConnection fTConsumerConnection = (FTConsumerConnection) baseSocket;
        this.f2579c = fTConsumerConnection;
        fTConsumerConnection.a(this.f);
        com.heytap.accessory.base.logging.a.c(m, "onServiceConnectionResponse connHelper==" + baseSocket);
        this.d = new a();
        c(this.f2579c.getConnectedPeerAgent().getProfileVersion());
    }

    public void a(int i, int i2, String str, String str2, boolean z) {
        SetupResponse setupResponse;
        d dVar = this.f2581j.get(Integer.valueOf(i));
        if (dVar == null || dVar.d == null) {
            return;
        }
        if (!this.b) {
            com.heytap.accessory.base.logging.a.d(m, "confirmRequest: No current  requests Found");
            a(dVar.d, new SetupResponse(i, com.heytap.accessory.file.model.c.RESULT_FAILURE, 5, dVar.d.g()));
            return;
        }
        if (z) {
            com.heytap.accessory.base.logging.a.d(m, "confirmRequest: user accepted");
            int iB = dVar.d.b();
            long jA = dVar.d.a();
            try {
                com.heytap.accessory.transport.control.c.a(jA, iB, Long.parseLong(this.i), i, 0);
            } catch (NumberFormatException e2) {
                com.heytap.accessory.base.logging.a.b(m, e2);
            }
            this.h.acquire(600000L);
            dVar.d.a(str);
            com.heytap.accessory.file.receiver.a aVar = new com.heytap.accessory.file.receiver.a(this.f, this.a.getApplicationContext(), this.i, dVar.d.l(), dVar.d.i());
            dVar.f2584e = aVar;
            if (!aVar.a(dVar.d, str2)) {
                com.heytap.accessory.base.logging.a.a(m, "confirmRequest: could not confirm request- prepareToreceive fail");
                a(dVar.d, new SetupResponse(i, com.heytap.accessory.file.model.c.RESULT_FAILURE, 1, dVar.d.g()));
            } else if (this.f2580e.a(i, i2, com.heytap.accessory.transport.control.c.c(jA, iB), com.heytap.accessory.transport.control.c.a(jA, iB), true)) {
                com.heytap.accessory.base.logging.a.a(m, "confirmRequest: sent response(Accept):" + i);
            } else {
                com.heytap.accessory.base.logging.a.a(m, "confirmRequest: could not confirm request");
                a(dVar.d, new SetupResponse(i, com.heytap.accessory.file.model.c.RESULT_FAILURE, 1, dVar.d.g()));
            }
            this.f2579c.a = null;
            return;
        }
        String str3 = m;
        com.heytap.accessory.base.logging.a.a(str3, "confirmRequest: user rejected");
        if (this.f2580e.a(i, i2, 0L, false)) {
            com.heytap.accessory.base.logging.a.a(str3, "confirmRequest: sent response(Reject)");
        } else {
            com.heytap.accessory.base.logging.a.a(str3, "confirmRequest: could not reject");
            a(dVar.d, new SetupResponse(i, com.heytap.accessory.file.model.c.RESULT_FAILURE, 1, dVar.d.g()));
        }
        if (i2 == 3) {
            setupResponse = new SetupResponse(i, com.heytap.accessory.file.model.c.RESULT_FAILURE, 3, dVar.d.g());
        } else {
            setupResponse = new SetupResponse(i, com.heytap.accessory.file.model.c.RESULT_FAILURE, 9, dVar.d.g());
        }
        a(dVar.d, setupResponse);
        d(i);
    }

    public void b(int i) {
        d dVar = this.f2581j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "receiverTaskRecord == null");
            return;
        }
        String str = m;
        com.heytap.accessory.base.logging.a.d(str, "Processing Alive Ctrl response timeout");
        com.heytap.accessory.file.receiver.a aVar = dVar.f2584e;
        if (aVar != null) {
            aVar.a();
            dVar.f2584e = null;
        }
        if (dVar.d == null) {
            com.heytap.accessory.base.logging.a.d(str, "handleAliveCtrlTimeout : handleAliveCtrlTimeout is already set null, ignore");
        } else {
            a(new CancelRequest(i, 4, dVar.d.g()));
        }
    }

    public final String b(String str) {
        Bundle agentDetails = this.a.getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("packageName");
    }

    public void a(SetupRequest setupRequest) {
        if (setupRequest == null) {
            return;
        }
        int iL = setupRequest.l();
        String str = m;
        com.heytap.accessory.base.logging.a.c(str, "handleSetupRequest:" + setupRequest.g() + ", transactionId:" + iL + ", channelId:" + setupRequest.b());
        e eVarA = e.a(this.a.getApplicationContext());
        if (!com.heytap.accessory.file.utils.a.c()) {
            com.heytap.accessory.base.logging.a.e(str, "User is locked. Can't create file [ERROR_FT_USER_LOCKED]");
            this.f2579c.a(new SetupResponse(setupRequest.l(), com.heytap.accessory.file.model.c.RESULT_FAILURE, 14, setupRequest.g()));
            this.f2580e.a(iL, 14, 0L, false);
            return;
        }
        if (this.f2581j.get(Integer.valueOf(iL)) != null) {
            com.heytap.accessory.base.logging.a.e(str, "Consumer is busy processing other request [ERROR_PEER_AGENT_BUSY]");
            this.f2579c.a(new SetupResponse(setupRequest.l(), com.heytap.accessory.file.model.c.RESULT_FAILURE, 8, setupRequest.g()));
            this.f2580e.a(iL, 8, 0L, false);
            return;
        }
        if (a(setupRequest.h())) {
            com.heytap.accessory.base.logging.a.e(str, "Low memory [ERROR_FT_SPACE_NOT_AVAILABLE]");
            this.f2579c.a(new SetupResponse(setupRequest.l(), com.heytap.accessory.file.model.c.RESULT_FAILURE, 11, setupRequest.g()));
            this.f2580e.a(iL, 11, 0L, false);
            return;
        }
        com.heytap.accessory.base.logging.a.d(str, "Received valid setup request notifying user");
        d dVar = new d(this, setupRequest);
        dVar.f2583c.a(2);
        this.f2581j.put(Integer.valueOf(iL), dVar);
        if (this.k.get(Integer.valueOf(setupRequest.b())) == null) {
            this.k.put(Integer.valueOf(setupRequest.b()), Integer.valueOf(setupRequest.l()));
        } else {
            com.heytap.accessory.base.logging.a.e(str, "channel is busy " + setupRequest.b());
            this.f2579c.a(new SetupResponse(setupRequest.l(), com.heytap.accessory.file.model.c.RESULT_FAILURE, 8, setupRequest.g()));
            this.f2580e.a(iL, 8, 0L, false);
        }
        String strB = b(setupRequest.j());
        String strA = a(setupRequest.j());
        com.heytap.accessory.base.logging.a.c(str, "tid:" + setupRequest + "[" + strB + "] " + strA);
        if (strB != null) {
            eVarA.a(setupRequest, strB, strA);
        } else {
            com.heytap.accessory.base.logging.a.b(str, "Package name not found. Rejecting transfer");
            a(setupRequest.l(), 3, "", "", 0L, false);
        }
    }

    public void a(int i, long j2) {
        com.heytap.accessory.file.d dVar;
        d dVar2 = this.f2581j.get(Integer.valueOf(i));
        if (dVar2 != null && (dVar = this.g) != null) {
            dVar.a(dVar2.d, j2);
            this.f2580e.a(i, j2);
            return;
        }
        String str = m;
        StringBuilder sb = new StringBuilder();
        sb.append("receiverTaskRecord != null:");
        sb.append(dVar2 != null);
        sb.append(" mFileEventCallback!=null:");
        sb.append(this.g != null);
        com.heytap.accessory.base.logging.a.b(str, sb.toString());
    }

    public void a(CancelRequest cancelRequest) {
        com.heytap.accessory.file.receiver.a aVar;
        d dVar = this.f2581j.get(Integer.valueOf(cancelRequest.d()));
        if (dVar != null && (aVar = dVar.f2584e) != null) {
            aVar.a();
            dVar.f2584e = null;
            if (dVar.d != null) {
                com.heytap.accessory.transport.control.c.b(cancelRequest.d(), dVar.d.b(), 1);
            }
        }
        if (!this.b) {
            com.heytap.accessory.base.logging.a.d(m, "connection has been lost");
        } else {
            this.f2579c.a(new CtrlResponse("filetransfer-cancel-rsp", cancelRequest.d(), com.heytap.accessory.file.model.c.RESULT_SUCCESS, cancelRequest.c(), cancelRequest.b()));
            this.f2580e.a(cancelRequest);
        }
    }

    public void a(int i, com.heytap.accessory.file.model.c cVar, int i2) {
        d dVar = this.f2581j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null");
            return;
        }
        CtrlResponse ctrlResponse = new CtrlResponse("filetransfer-cancel-rsp", i, cVar, i2, dVar.d.g());
        if (com.heytap.accessory.file.utils.a.a(ctrlResponse, dVar.d)) {
            String str = m;
            com.heytap.accessory.base.logging.a.d(str, "handleCancelResponse: Received Cancel Response from sender.");
            if (ctrlResponse.e() == com.heytap.accessory.file.model.c.RESULT_SUCCESS) {
                com.heytap.accessory.base.logging.a.d(str, "handleCancelResponse: cancelled transfer.FileName:" + ctrlResponse.a());
            } else {
                com.heytap.accessory.base.logging.a.d(str, "handleCancelResponse: Cancel Failed. FileName:" + ctrlResponse.a() + "Error #" + ctrlResponse.c());
            }
            dVar.f2583c.a(1);
            com.heytap.accessory.file.receiver.a aVar = dVar.f2584e;
            if (aVar != null) {
                aVar.a();
                dVar.f2584e = null;
            }
            a(dVar.d, ctrlResponse);
            d(i);
        } else {
            com.heytap.accessory.base.logging.a.e(m, "Invalid cancel response for file:" + ctrlResponse.a());
        }
        if (this.h.isHeld()) {
            this.h.release();
        }
    }

    public void a(int i, int i2, int i3) {
        CtrlResponse ctrlResponse;
        d dVar = this.f2581j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null");
            return;
        }
        CancelRequest cancelRequest = new CancelRequest(i, i2, dVar.d.g());
        if (com.heytap.accessory.file.utils.a.a(cancelRequest, dVar.d)) {
            com.heytap.accessory.file.receiver.a aVar = dVar.f2584e;
            if (aVar != null) {
                if (i3 == 7) {
                    aVar.c();
                }
                dVar.f2584e.a();
                dVar.f2584e = null;
            }
            com.heytap.accessory.file.b bVar = this.f2580e;
            if (bVar != null) {
                bVar.a(i);
            }
            if (cancelRequest.c() != 5) {
                ctrlResponse = new CtrlResponse("filetransfer-cancel-rsp", i, com.heytap.accessory.file.model.c.RESULT_SUCCESS, cancelRequest.c(), dVar.d.g());
            } else {
                ctrlResponse = new CtrlResponse("filetransfer-cancel-rsp", i, com.heytap.accessory.file.model.c.RESULT_SUCCESS, 9, dVar.d.g());
            }
            a(dVar.d, ctrlResponse);
            com.heytap.accessory.base.logging.a.a(m, "handleCancelRequest: Cancelled from provider");
            if (this.h.isHeld()) {
                this.h.release();
            }
            d(i);
            return;
        }
        com.heytap.accessory.base.logging.a.e(m, "handleCancelRequest: Invalid cancel request for file:" + cancelRequest.b());
    }

    public void a(com.heytap.accessory.file.d dVar) {
        this.g = dVar;
    }

    public void a(long j2, long j3, byte[] bArr) {
        this.f2580e.a(j2, j3, bArr);
    }

    public void a(long j2, int i, byte[] bArr) {
        Integer num = this.k.get(Integer.valueOf(i));
        if (num == null) {
            return;
        }
        d dVar = this.f2581j.get(num);
        if (dVar != null && dVar.f2584e != null) {
            this.f2580e.f(num.intValue());
            dVar.f2584e.a(bArr);
            TrafficReport trafficReport = this.f2579c.getTrafficReport(String.valueOf(j2), i);
            if (bArr != null) {
                com.heytap.accessory.transport.control.c.a(dVar.b, i, trafficReport, bArr.length, this.f2580e);
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.b(m, "data receiver cleared. Ignoring data.");
    }

    public void a(int i, CtrlResponse ctrlResponse) {
        this.f.post(new b(ctrlResponse));
    }

    public final void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        FTConsumerConnection fTConsumerConnection = this.f2579c;
        if (fTConsumerConnection != null && setupRequest != null) {
            fTConsumerConnection.cleanupChannel(fTConsumerConnection.getConnectionId(), setupRequest.b());
            com.heytap.accessory.transport.control.c.b(setupRequest.a(), setupRequest.b(), 1);
        }
        com.heytap.accessory.file.d dVar = this.g;
        if (dVar != null) {
            dVar.a(setupRequest, ctrlResponse);
        }
    }

    public final void a(int i, int i2, String str, String str2, long j2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("reff_path", str);
        bundle.putString("filePath", str2);
        bundle.putLong("maxWindowSize", j2);
        Message messageObtainMessage = this.f.obtainMessage(406, i2, z ? 1 : 0, bundle);
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        messageObtainMessage.setData(data);
        this.f.sendMessage(messageObtainMessage);
    }

    public final String a(String str) {
        Bundle agentDetails = this.a.getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("agentImplclass");
    }

    public final boolean a(long j2) {
        long blockSize;
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            try {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } catch (NoSuchMethodError unused) {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return j2 > (blockSize * availableBlocks) - 36700160;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public void a(List<Integer> list) {
        List<Integer> list2 = o;
        synchronized (list2) {
            list2.clear();
            list2.addAll(list);
        }
    }

    public final boolean a(int i) {
        List<Integer> list = o;
        synchronized (list) {
            com.heytap.accessory.base.logging.a.a(m, "check channel " + list.size());
            if (!list.isEmpty()) {
                return list.contains(Integer.valueOf(i));
            }
            return f2578n.contains(Integer.valueOf(i));
        }
    }

    public final int a(Message message) {
        if (message == null || message.getData() == null) {
            return -1;
        }
        return message.getData().getInt("transId", -1);
    }
}
