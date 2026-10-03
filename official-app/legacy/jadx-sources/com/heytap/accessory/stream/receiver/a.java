package com.heytap.accessory.stream.receiver;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.CtrlResponse;
import com.heytap.accessory.stream.model.SetupRequest;
import com.heytap.accessory.stream.model.SetupResponse;
import com.heytap.accessory.utils.buffer.Buffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static final String m = "a";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<Integer> f2736n = Arrays.asList(201, 202, 203, 204, 205);
    public static final List<Integer> o = new ArrayList();
    public StreamConsumerImpl a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StreamConsumerConnection f2737c;
    public com.heytap.accessory.stream.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.heytap.accessory.stream.b f2738e;
    public c f;
    public com.heytap.accessory.stream.c g;
    public PowerManager.WakeLock h;
    public String i;
    public boolean b = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<Integer, d> f2739j = new ConcurrentHashMap();
    public Map<Integer, Integer> k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2740l = new Object();

    public class b implements Runnable {
        public final /* synthetic */ CtrlResponse a;

        public b(CtrlResponse ctrlResponse) {
            this.a = ctrlResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.a(a.m, "Service Connection Closed at:" + System.currentTimeMillis());
            for (d dVar : a.this.f2739j.values()) {
                if (dVar != null) {
                    SetupRequest setupRequest = dVar.f2742e;
                    int iA = dVar.d.a();
                    com.heytap.accessory.base.logging.a.a(a.m, "current state is :" + iA);
                    int iF = setupRequest == null ? -1 : setupRequest.f();
                    if (a.this.f2738e != null) {
                        a.this.f2738e.a();
                    }
                    com.heytap.accessory.stream.receiver.c cVar = dVar.f;
                    if (cVar != null) {
                        cVar.c();
                        dVar.f = null;
                    }
                    a.this.f2737c = null;
                    a.this.b = false;
                    if (1 == iA || 5 == iA) {
                        com.heytap.accessory.base.logging.a.a(a.m, "Disconnect received while no stream transfer/Completion request already received");
                        return;
                    }
                    if (7 == iA || 8 == iA) {
                        a.this.g.a(setupRequest);
                    } else {
                        CtrlResponse ctrlResponse = this.a;
                        if (ctrlResponse != null) {
                            a.this.a(setupRequest, ctrlResponse);
                        } else {
                            com.heytap.accessory.base.logging.a.b(a.m, "Service connection lost while stream transfer in progress");
                            a.this.a(setupRequest, new CtrlResponse("streamtransfer-cancel-rsp", iF, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 5));
                        }
                    }
                }
            }
            a.this.f2739j.clear();
            a.this.k.clear();
            if (a.this.h.isHeld()) {
                a.this.h.release();
            }
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 4) {
                int iA = a.this.a(message);
                if (iA == -1) {
                    return;
                }
                a.this.b(iA);
                return;
            }
            if (i == 406) {
                int iA2 = a.this.a(message);
                if (iA2 == -1) {
                    return;
                }
                a.this.a(iA2, message.arg1, message.arg2 == 1);
                return;
            }
            if (i == 500) {
                a.this.a((SetupRequest) message.getData().getParcelable("setupRequest"));
                return;
            }
            if (i == 502) {
                int iA3 = a.this.a(message);
                if (iA3 == -1) {
                    return;
                }
                Object obj = message.obj;
                a.this.a(iA3, obj != null ? ((Long) obj).longValue() : 0L);
                return;
            }
            switch (i) {
                case 402:
                    a.this.a((CancelRequest) message.obj);
                    break;
                case 403:
                    a.this.a(message.arg1, (CtrlResponse) message.obj);
                    break;
                case 404:
                    Bundle bundle = (Bundle) message.obj;
                    byte[] byteArray = bundle.getByteArray("EXTRA_KEY_DATA");
                    long j2 = bundle.getLong("EXTRA_KEY_CONNECTION_ID");
                    long j3 = bundle.getLong("accId");
                    int i2 = message.arg1;
                    com.heytap.accessory.base.logging.a.a(a.m, "RX on CH " + i2 + " datasize:" + byteArray.length);
                    if (i2 == 200) {
                        a.this.a(j3, j2, byteArray);
                    } else if (a.this.a(i2)) {
                        a.this.a(j3, j2, i2, byteArray);
                    }
                    break;
                default:
                    switch (i) {
                        case 506:
                            int iA4 = a.this.a(message);
                            if (iA4 != -1) {
                                a.this.a(iA4, message.arg1, message.arg2);
                                break;
                            }
                            break;
                        case 507:
                            int iA5 = a.this.a(message);
                            if (iA5 != -1) {
                                a.this.a(iA5, com.heytap.accessory.stream.model.c.a(message.arg1), message.arg2);
                                break;
                            }
                            break;
                        case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                            break;
                        case 509:
                            int iA6 = a.this.a(message);
                            if (iA6 != -1) {
                                a.this.c(iA6);
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
        public String f2741c;
        public com.heytap.accessory.stream.model.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SetupRequest f2742e;
        public com.heytap.accessory.stream.receiver.c f;

        public d(a aVar, SetupRequest setupRequest) {
            this.f2741c = aVar.i;
            this.b = setupRequest.a();
            this.a = setupRequest.f();
            com.heytap.accessory.stream.model.a aVar2 = new com.heytap.accessory.stream.model.a();
            this.d = aVar2;
            aVar2.a(1);
            this.f2742e = setupRequest;
        }
    }

    public a(StreamConsumerImpl streamConsumerImpl, BaseSocket baseSocket, int i) {
        if (baseSocket == null) {
            com.heytap.accessory.base.logging.a.b(m, "socket is null, quit.");
            return;
        }
        this.i = baseSocket.getConnectionId();
        if (i != 0) {
            com.heytap.accessory.base.logging.a.a(m, "onServiceConnectionResponse: connection establishment failed");
            return;
        }
        PowerManager powerManager = (PowerManager) streamConsumerImpl.getApplicationContext().getSystemService("power");
        if (powerManager != null) {
            this.h = powerManager.newWakeLock(1, "FTConsumer_" + System.currentTimeMillis());
        }
        this.a = streamConsumerImpl;
        if (this.f == null && com.heytap.accessory.stream.utils.a.a() != null) {
            this.f = new c(com.heytap.accessory.stream.utils.a.a());
        }
        a(baseSocket);
    }

    public void b(int i) {
        d dVar = this.f2739j.get(Integer.valueOf(i));
        if (dVar == null) {
            return;
        }
        String str = m;
        com.heytap.accessory.base.logging.a.a(str, "Processing Alive Ctrl response timeout");
        com.heytap.accessory.stream.receiver.c cVar = dVar.f;
        if (cVar != null) {
            cVar.c();
            dVar.f = null;
        }
        if (dVar.f2742e == null) {
            com.heytap.accessory.base.logging.a.a(str, "handleAliveCtrlTimeout : handleAliveCtrlTimeout is already set null, ignore");
        } else {
            a(new CancelRequest(i, 16));
        }
    }

    public void c(int i) {
        if (this.h.isHeld()) {
            this.h.release();
        }
    }

    public final void d(int i) {
        synchronized (this.f2740l) {
            d dVar = this.f2739j.get(Integer.valueOf(i));
            if (dVar != null) {
                int iB = dVar.f2742e.b();
                this.f2739j.remove(Integer.valueOf(i));
                this.k.remove(Integer.valueOf(iB));
            }
        }
    }

    /* JADX INFO: renamed from: com.heytap.accessory.stream.receiver.a$a, reason: collision with other inner class name */
    public class C0266a implements com.heytap.accessory.stream.a {
        public C0266a() {
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j2, int i, byte[] bArr, boolean z) {
            if (a.this.f2737c == null) {
                com.heytap.accessory.base.logging.a.a(a.m, "no active socket to send command");
                return false;
            }
            try {
                a.this.f2737c.send(200, bArr);
                return true;
            } catch (IOException unused) {
                com.heytap.accessory.base.logging.a.a(a.m, "Error on command channel");
                return false;
            }
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j2, int i, int i2, Buffer buffer, boolean z) {
            com.heytap.accessory.base.logging.a.b(a.m, "Method called in the wrong place.");
            return false;
        }
    }

    public final void c(String str) {
        com.heytap.accessory.base.logging.a.a(m, "initializeComponents: Preparing to receive stream");
        com.heytap.accessory.stream.b bVar = this.f2738e;
        if (bVar != null) {
            bVar.a();
        }
        this.f2738e = new com.heytap.accessory.stream.b(this.d, this.f, com.heytap.accessory.stream.b.e.RECEIVER, com.heytap.accessory.stream.utils.a.a(), new com.heytap.accessory.stream.utils.c(this.f2737c));
    }

    public void a(BaseSocket baseSocket) {
        this.b = true;
        StreamConsumerConnection streamConsumerConnection = (StreamConsumerConnection) baseSocket;
        this.f2737c = streamConsumerConnection;
        streamConsumerConnection.a(this.f);
        com.heytap.accessory.base.logging.a.c(m, "onServiceConnectionResponse connHelper==" + baseSocket);
        this.d = new C0266a();
        c(this.f2737c.getConnectedPeerAgent().getProfileVersion());
    }

    public final String b(String str) {
        Bundle agentDetails = this.a.getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("packageName");
    }

    public final d b() {
        d value = null;
        for (Map.Entry<Integer, d> entry : this.f2739j.entrySet()) {
            if (entry.getValue().f == null) {
                break;
            }
            long jE = entry.getValue().f.e();
            if (value == null) {
                value = entry.getValue();
            } else if (jE > value.f.e()) {
                value = entry.getValue();
            }
        }
        return value;
    }

    public ParcelFileDescriptor a(int i, int i2, boolean z) {
        SetupRequest setupRequest;
        SetupResponse setupResponse;
        d dVar = this.f2739j.get(Integer.valueOf(i));
        if (dVar != null && (setupRequest = dVar.f2742e) != null) {
            if (!this.b) {
                com.heytap.accessory.base.logging.a.a(m, "confirmRequest: No current  requests Found");
                a(dVar.f2742e, new SetupResponse(i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 5));
            } else {
                if (z) {
                    long jA = setupRequest.a();
                    int iB = dVar.f2742e.b();
                    try {
                        com.heytap.accessory.transport.control.c.a(jA, iB, Long.parseLong(this.i), i, 2);
                    } catch (NumberFormatException e2) {
                        com.heytap.accessory.base.logging.a.b(m, e2);
                    }
                    com.heytap.accessory.base.logging.a.a(m, "confirmRequest: user accepted");
                    this.h.acquire(600000L);
                    com.heytap.accessory.stream.receiver.c cVar = new com.heytap.accessory.stream.receiver.c(this.f, this.f2737c.getConnectedPeerAgent().getAccessoryId(), dVar.f2742e.e(), dVar.f2741c, i);
                    dVar.f = cVar;
                    this.f2737c.a = null;
                    ParcelFileDescriptor parcelFileDescriptorA = cVar.a(dVar.f2742e);
                    this.f2738e.a(i, i2, com.heytap.accessory.transport.control.c.c(jA, iB), com.heytap.accessory.transport.control.c.a(jA, iB), true);
                    return parcelFileDescriptorA;
                }
                String str = m;
                com.heytap.accessory.base.logging.a.a(str, "confirmRequest: user rejected");
                if (this.f2738e.a(dVar.a, i2, 0L, false)) {
                    com.heytap.accessory.base.logging.a.a(str, "confirmRequest: sent response(Reject)");
                } else {
                    com.heytap.accessory.base.logging.a.a(str, "confirmRequest: could not reject");
                    a(dVar.f2742e, new SetupResponse(i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 1));
                }
                if (i2 == 3) {
                    setupResponse = new SetupResponse(i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 3);
                } else {
                    setupResponse = new SetupResponse(i, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 9);
                }
                a(dVar.f2742e, setupResponse);
            }
            d(i);
            return null;
        }
        com.heytap.accessory.base.logging.a.a(m, new Throwable("ReceiverTaskRecord or SetupRequest is null. It should not happen, returning ..."));
        return null;
    }

    public void a(SetupRequest setupRequest) {
        if (setupRequest == null) {
            com.heytap.accessory.base.logging.a.b(m, "setupRequest is null");
            return;
        }
        int iF = setupRequest.f();
        String str = m;
        com.heytap.accessory.base.logging.a.c(str, "handleSetupRequest:" + setupRequest.f());
        com.heytap.accessory.stream.d dVarA = com.heytap.accessory.stream.d.a(this.a.getApplicationContext());
        if (!com.heytap.accessory.stream.utils.b.c()) {
            com.heytap.accessory.base.logging.a.e(str, "User is locked. Can't create stream [ERROR_FT_USER_LOCKED]");
            this.f2737c.a(new SetupResponse(iF, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 14));
            this.f2738e.a(iF, 14, 0L, false);
            return;
        }
        if (this.f2739j.get(Integer.valueOf(iF)) != null) {
            com.heytap.accessory.base.logging.a.e(str, "Consumer is busy processing other request [ERROR_PEER_AGENT_BUSY]");
            this.f2737c.a(new SetupResponse(iF, com.heytap.accessory.stream.model.c.RESULT_FAILURE, 8));
            this.f2738e.a(iF, 8, 0L, false);
            return;
        }
        d dVar = new d(this, setupRequest);
        dVar.d.a(2);
        this.f2739j.put(Integer.valueOf(iF), dVar);
        if (this.k.get(Integer.valueOf(setupRequest.b())) == null) {
            this.k.put(Integer.valueOf(setupRequest.b()), Integer.valueOf(setupRequest.f()));
        } else {
            com.heytap.accessory.base.logging.a.e(str, "channel is busy " + setupRequest.b());
        }
        String strB = b(setupRequest.e());
        String strA = a(setupRequest.e());
        com.heytap.accessory.base.logging.a.c(str, "tid:" + setupRequest + "[" + strB + "] " + strA);
        if (strB == null) {
            com.heytap.accessory.base.logging.a.b(str, "Package name not found. Rejecting transfer");
            a(setupRequest.f(), 0L, 3, false);
        } else {
            dVarA.a(setupRequest, strB, strA);
        }
    }

    public void a(int i, long j2) {
        com.heytap.accessory.stream.receiver.c cVar;
        d dVar = this.f2739j.get(Integer.valueOf(i));
        if (dVar != null && (cVar = dVar.f) != null) {
            if (cVar.a(j2)) {
                com.heytap.accessory.base.logging.a.c(m, "mTotalReceives=" + j2);
                return;
            }
            dVar.d.a(6);
            this.f2738e.a(i, -1);
            int i2 = dVar.a;
            com.heytap.accessory.stream.model.c cVar2 = com.heytap.accessory.stream.model.c.RESULT_SUCCESS;
            CtrlResponse ctrlResponse = new CtrlResponse("streamtransfer-complete-rsp", i2, cVar2, -1);
            if (ctrlResponse.c() == cVar2) {
                com.heytap.accessory.base.logging.a.a(m, "handleCompletionRequest: Received completion success response from Provider.");
                SetupRequest setupRequest = dVar.f2742e;
                if (setupRequest != null) {
                    this.g.a(setupRequest);
                }
            } else {
                com.heytap.accessory.base.logging.a.a(m, "handleCompletionRequest:negative response for completion request. Reason:" + ctrlResponse.b());
            }
            com.heytap.accessory.stream.receiver.c cVar3 = dVar.f;
            if (cVar3 != null) {
                cVar3.c();
                dVar.f = null;
            }
            d(i);
            return;
        }
        com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null,ignore it.");
    }

    public void a(CancelRequest cancelRequest) {
        com.heytap.accessory.stream.receiver.c cVar;
        String str = m;
        com.heytap.accessory.base.logging.a.a(str, "handleCancelRequest tId:" + cancelRequest.c() + " reason:" + cancelRequest.b());
        d dVar = this.f2739j.get(Integer.valueOf(cancelRequest.c()));
        if (dVar != null && (cVar = dVar.f) != null) {
            cVar.c();
            dVar.f = null;
        }
        if (this.b) {
            this.f2737c.a(new CtrlResponse("streamtransfer-cancel-rsp", cancelRequest.c(), com.heytap.accessory.stream.model.c.RESULT_SUCCESS, cancelRequest.b()));
            this.f2738e.a(cancelRequest);
        } else {
            com.heytap.accessory.base.logging.a.a(str, "connection has been lost");
        }
    }

    public void a(int i, com.heytap.accessory.stream.model.c cVar, int i2) {
        d dVar = this.f2739j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null");
            return;
        }
        CtrlResponse ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", i, cVar, i2);
        String str = m;
        com.heytap.accessory.base.logging.a.a(str, "handleCancelResponse: Received Cancel Response from sender.");
        if (ctrlResponse.c() == com.heytap.accessory.stream.model.c.RESULT_SUCCESS) {
            com.heytap.accessory.base.logging.a.a(str, "handleCancelResponse: cancelled transfer.");
        } else {
            com.heytap.accessory.base.logging.a.a(str, "handleCancelResponse: Cancel Failed. Error #" + ctrlResponse.b());
        }
        dVar.d.a(1);
        com.heytap.accessory.stream.receiver.c cVar2 = dVar.f;
        if (cVar2 != null) {
            cVar2.c();
            dVar.f = null;
        }
        a(dVar.f2742e, ctrlResponse);
        d(i);
        if (this.h.isHeld()) {
            this.h.release();
        }
    }

    public void a(int i, int i2, int i3) {
        CtrlResponse ctrlResponse;
        d dVar = this.f2739j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null");
            return;
        }
        CancelRequest cancelRequest = new CancelRequest(i, i2);
        com.heytap.accessory.stream.receiver.c cVar = dVar.f;
        if (cVar != null) {
            cVar.c();
            dVar.f = null;
        }
        com.heytap.accessory.stream.b bVar = this.f2738e;
        if (bVar != null) {
            bVar.a(i);
        }
        if (cancelRequest.b() != 5) {
            ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", i, com.heytap.accessory.stream.model.c.RESULT_SUCCESS, cancelRequest.b());
        } else {
            ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", i, com.heytap.accessory.stream.model.c.RESULT_SUCCESS, 9);
        }
        a(dVar.f2742e, ctrlResponse);
        com.heytap.accessory.base.logging.a.a(m, "handleCancelRequest: Cancelled from provider");
        if (this.h.isHeld()) {
            this.h.release();
        }
        d(i);
    }

    public void a(com.heytap.accessory.stream.c cVar) {
        this.g = cVar;
    }

    public void a(long j2, long j3, byte[] bArr) {
        this.f2738e.a(j2, j3, bArr);
    }

    public void a(long j2, long j3, int i, byte[] bArr) {
        Integer num = this.k.get(Integer.valueOf(i));
        String str = m;
        com.heytap.accessory.base.logging.a.a(str, "handleIncomingData transactionId=" + num);
        if (num == null) {
            return;
        }
        if (com.heytap.accessory.stream.utils.b.b()) {
            com.heytap.accessory.base.logging.a.e(str, "memory use too much!!! cancel max memory used transfer task");
            d dVarB = b();
            if (dVarB != null) {
                com.heytap.accessory.stream.receiver.c cVar = dVarB.f;
                if (cVar != null) {
                    cVar.a("stream_receiver_write_oom");
                }
                a(new CancelRequest(dVarB.a, 15));
                System.gc();
                System.runFinalization();
                return;
            }
        }
        if (!com.heytap.accessory.base.bean.c.a().b() && !AccessoryManager.h().a(j2).M()) {
            d dVar = this.f2739j.get(num);
            if (dVar != null && dVar.f != null) {
                this.f2738e.f(num.intValue());
                dVar.f.a(bArr);
                TrafficReport trafficReport = this.f2737c.getTrafficReport(String.valueOf(j3), i);
                if (bArr != null) {
                    com.heytap.accessory.transport.control.c.a(dVar.b, i, trafficReport, bArr.length, this.f2738e);
                    return;
                }
                return;
            }
            com.heytap.accessory.base.logging.a.e(str, "data receiver cleared. Ignoring data.");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 402;
        messageObtain.obj = new CancelRequest(num.intValue(), 17);
        this.f.sendMessage(messageObtain);
    }

    public void a(int i, CtrlResponse ctrlResponse) {
        this.f.post(new b(ctrlResponse));
    }

    public final void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        StreamConsumerConnection streamConsumerConnection = this.f2737c;
        if (streamConsumerConnection != null && setupRequest != null) {
            streamConsumerConnection.cleanupChannel(streamConsumerConnection.getConnectionId(), setupRequest.b());
        }
        com.heytap.accessory.stream.c cVar = this.g;
        if (cVar != null) {
            cVar.a(setupRequest, ctrlResponse);
        }
    }

    public final void a(int i, long j2, int i2, boolean z) {
        Message messageObtainMessage = this.f.obtainMessage(406, i2, z ? 1 : 0, new Bundle());
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        data.putLong("maxWindowSize", j2);
        messageObtainMessage.setData(data);
        this.f.sendMessage(messageObtainMessage);
    }

    public final String a(String str) {
        Bundle agentDetails = this.a.getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("agentImplclass");
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
            return f2736n.contains(Integer.valueOf(i));
        }
    }

    public final int a(Message message) {
        if (message == null || message.getData() == null) {
            return -1;
        }
        return message.getData().getInt("transId", -1);
    }
}
