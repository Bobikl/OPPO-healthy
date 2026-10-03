package com.heytap.accessory.stream.receiver;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String m = "a";
    public static final List<Integer> n = Arrays.asList(201, 202, 203, 204, 205);
    public static final List<Integer> o = new ArrayList();
    public StreamConsumerImpl a;
    public StreamConsumerConnection c;
    public com.heytap.accessory.stream.a d;
    public com.heytap.accessory.stream.b e;
    public c f;
    public com.heytap.accessory.stream.c g;
    public PowerManager.WakeLock h;
    public String i;
    public boolean b = false;
    public Map<Integer, d> j = new ConcurrentHashMap();
    public Map<Integer, Integer> k = new ConcurrentHashMap();
    public Object l = new Object();

    public class b implements Runnable {
        public final /* synthetic */ CtrlResponse a;

        public b(CtrlResponse ctrlResponse) {
            this.a = ctrlResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.a(a.m, "Service Connection Closed at:" + System.currentTimeMillis());
            for (d dVar : a.this.j.values()) {
                if (dVar != null) {
                    SetupRequest setupRequest = dVar.e;
                    int iA = dVar.d.a();
                    com.heytap.accessory.base.logging.a.a(a.m, "current state is :" + iA);
                    int iF = setupRequest == null ? -1 : setupRequest.f();
                    if (a.this.e != null) {
                        a.this.e.a();
                    }
                    com.heytap.accessory.stream.receiver.c cVar = dVar.f;
                    if (cVar != null) {
                        cVar.c();
                        dVar.f = null;
                    }
                    a.this.c = null;
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
                            a.this.a(setupRequest, new CtrlResponse("streamtransfer-cancel-rsp", iF, com.heytap.accessory.stream.model.c.b, 5));
                        }
                    }
                }
            }
            a.this.j.clear();
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
                case SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER /* 402 */:
                    a.this.a((CancelRequest) message.obj);
                    break;
                case SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER /* 403 */:
                    a.this.a(message.arg1, (CtrlResponse) message.obj);
                    break;
                case SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER /* 404 */:
                    Bundle bundle = (Bundle) message.obj;
                    byte[] byteArray = bundle.getByteArray("EXTRA_KEY_DATA");
                    long j = bundle.getLong("EXTRA_KEY_CONNECTION_ID");
                    long j2 = bundle.getLong("accId");
                    int i2 = message.arg1;
                    com.heytap.accessory.base.logging.a.a(a.m, "RX on CH " + i2 + " datasize:" + byteArray.length);
                    if (i2 == 200) {
                        a.this.a(j2, j, byteArray);
                    } else if (a.this.a(i2)) {
                        a.this.a(j2, j, i2, byteArray);
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
                        case 508:
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
        public String c;
        public com.heytap.accessory.stream.model.a d;
        public SetupRequest e;
        public com.heytap.accessory.stream.receiver.c f;

        public d(a aVar, SetupRequest setupRequest) {
            this.c = aVar.i;
            this.b = setupRequest.a();
            this.a = setupRequest.f();
            com.heytap.accessory.stream.model.a aVar2 = new com.heytap.accessory.stream.model.a();
            this.d = aVar2;
            aVar2.a(1);
            this.e = setupRequest;
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
        d dVar = this.j.get(Integer.valueOf(i));
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
        if (dVar.e == null) {
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
        synchronized (this.l) {
            d dVar = this.j.get(Integer.valueOf(i));
            if (dVar != null) {
                int iB = dVar.e.b();
                this.j.remove(Integer.valueOf(i));
                this.k.remove(Integer.valueOf(iB));
            }
        }
    }

    public class a implements com.heytap.accessory.stream.a {
        public a() {
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j, int i, byte[] bArr, boolean z) {
            if (a.this.c == null) {
                com.heytap.accessory.base.logging.a.a(a.m, "no active socket to send command");
                return false;
            }
            try {
                a.this.c.send(200, bArr);
                return true;
            } catch (IOException unused) {
                com.heytap.accessory.base.logging.a.a(a.m, "Error on command channel");
                return false;
            }
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j, int i, int i2, Buffer buffer, boolean z) {
            com.heytap.accessory.base.logging.a.b(a.m, "Method called in the wrong place.");
            return false;
        }
    }

    public final void c(String str) {
        com.heytap.accessory.base.logging.a.a(m, "initializeComponents: Preparing to receive stream");
        com.heytap.accessory.stream.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
        this.e = new com.heytap.accessory.stream.b(this.d, this.f, com.heytap.accessory.stream.b.e.b, com.heytap.accessory.stream.utils.a.a(), new com.heytap.accessory.stream.utils.c(this.c));
    }

    public void a(BaseSocket baseSocket) {
        this.b = true;
        StreamConsumerConnection streamConsumerConnection = (StreamConsumerConnection) baseSocket;
        this.c = streamConsumerConnection;
        streamConsumerConnection.a(this.f);
        com.heytap.accessory.base.logging.a.c(m, "onServiceConnectionResponse connHelper==" + baseSocket);
        this.d = new a();
        c(this.c.getConnectedPeerAgent().getProfileVersion());
    }

    public final String b(String str) {
        Bundle agentDetails = this.a.getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("packageName");
    }

    public final d b() {
        d value = null;
        for (Map.Entry<Integer, d> entry : this.j.entrySet()) {
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
        d dVar = this.j.get(Integer.valueOf(i));
        if (dVar != null && (setupRequest = dVar.e) != null) {
            if (!this.b) {
                com.heytap.accessory.base.logging.a.a(m, "confirmRequest: No current  requests Found");
                a(dVar.e, new SetupResponse(i, com.heytap.accessory.stream.model.c.b, 5));
            } else {
                if (z) {
                    long jA = setupRequest.a();
                    int iB = dVar.e.b();
                    try {
                        com.heytap.accessory.transport.control.c.a(jA, iB, Long.parseLong(this.i), i, 2);
                    } catch (NumberFormatException e) {
                        com.heytap.accessory.base.logging.a.b(m, e);
                    }
                    com.heytap.accessory.base.logging.a.a(m, "confirmRequest: user accepted");
                    this.h.acquire(600000L);
                    com.heytap.accessory.stream.receiver.c cVar = new com.heytap.accessory.stream.receiver.c(this.f, this.c.getConnectedPeerAgent().getAccessoryId(), dVar.e.e(), dVar.c, i);
                    dVar.f = cVar;
                    this.c.a = null;
                    ParcelFileDescriptor parcelFileDescriptorA = cVar.a(dVar.e);
                    this.e.a(i, i2, com.heytap.accessory.transport.control.c.c(jA, iB), com.heytap.accessory.transport.control.c.a(jA, iB), true);
                    return parcelFileDescriptorA;
                }
                String str = m;
                com.heytap.accessory.base.logging.a.a(str, "confirmRequest: user rejected");
                if (this.e.a(dVar.a, i2, 0L, false)) {
                    com.heytap.accessory.base.logging.a.a(str, "confirmRequest: sent response(Reject)");
                } else {
                    com.heytap.accessory.base.logging.a.a(str, "confirmRequest: could not reject");
                    a(dVar.e, new SetupResponse(i, com.heytap.accessory.stream.model.c.b, 1));
                }
                if (i2 == 3) {
                    setupResponse = new SetupResponse(i, com.heytap.accessory.stream.model.c.b, 3);
                } else {
                    setupResponse = new SetupResponse(i, com.heytap.accessory.stream.model.c.b, 9);
                }
                a(dVar.e, setupResponse);
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
            this.c.a(new SetupResponse(iF, com.heytap.accessory.stream.model.c.b, 14));
            this.e.a(iF, 14, 0L, false);
            return;
        }
        if (this.j.get(Integer.valueOf(iF)) != null) {
            com.heytap.accessory.base.logging.a.e(str, "Consumer is busy processing other request [ERROR_PEER_AGENT_BUSY]");
            this.c.a(new SetupResponse(iF, com.heytap.accessory.stream.model.c.b, 8));
            this.e.a(iF, 8, 0L, false);
            return;
        }
        d dVar = new d(this, setupRequest);
        dVar.d.a(2);
        this.j.put(Integer.valueOf(iF), dVar);
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

    public void a(int i, long j) {
        com.heytap.accessory.stream.receiver.c cVar;
        d dVar = this.j.get(Integer.valueOf(i));
        if (dVar != null && (cVar = dVar.f) != null) {
            if (cVar.a(j)) {
                com.heytap.accessory.base.logging.a.c(m, "mTotalReceives=" + j);
                return;
            }
            dVar.d.a(6);
            this.e.a(i, -1);
            int i2 = dVar.a;
            com.heytap.accessory.stream.model.c cVar2 = com.heytap.accessory.stream.model.c.a;
            CtrlResponse ctrlResponse = new CtrlResponse("streamtransfer-complete-rsp", i2, cVar2, -1);
            if (ctrlResponse.c() == cVar2) {
                com.heytap.accessory.base.logging.a.a(m, "handleCompletionRequest: Received completion success response from Provider.");
                SetupRequest setupRequest = dVar.e;
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
        d dVar = this.j.get(Integer.valueOf(cancelRequest.c()));
        if (dVar != null && (cVar = dVar.f) != null) {
            cVar.c();
            dVar.f = null;
        }
        if (this.b) {
            this.c.a(new CtrlResponse("streamtransfer-cancel-rsp", cancelRequest.c(), com.heytap.accessory.stream.model.c.a, cancelRequest.b()));
            this.e.a(cancelRequest);
        } else {
            com.heytap.accessory.base.logging.a.a(str, "connection has been lost");
        }
    }

    public void a(int i, com.heytap.accessory.stream.model.c cVar, int i2) {
        d dVar = this.j.get(Integer.valueOf(i));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "mCurrentRequest is null");
            return;
        }
        CtrlResponse ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", i, cVar, i2);
        String str = m;
        com.heytap.accessory.base.logging.a.a(str, "handleCancelResponse: Received Cancel Response from sender.");
        if (ctrlResponse.c() == com.heytap.accessory.stream.model.c.a) {
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
        a(dVar.e, ctrlResponse);
        d(i);
        if (this.h.isHeld()) {
            this.h.release();
        }
    }

    public void a(int i, int i2, int i3) {
        CtrlResponse ctrlResponse;
        d dVar = this.j.get(Integer.valueOf(i));
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
        com.heytap.accessory.stream.b bVar = this.e;
        if (bVar != null) {
            bVar.a(i);
        }
        if (cancelRequest.b() != 5) {
            ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", i, com.heytap.accessory.stream.model.c.a, cancelRequest.b());
        } else {
            ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", i, com.heytap.accessory.stream.model.c.a, 9);
        }
        a(dVar.e, ctrlResponse);
        com.heytap.accessory.base.logging.a.a(m, "handleCancelRequest: Cancelled from provider");
        if (this.h.isHeld()) {
            this.h.release();
        }
        d(i);
    }

    public void a(com.heytap.accessory.stream.c cVar) {
        this.g = cVar;
    }

    public void a(long j, long j2, byte[] bArr) {
        this.e.a(j, j2, bArr);
    }

    public void a(long j, long j2, int i, byte[] bArr) {
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
        if (!com.heytap.accessory.base.bean.c.a().b() && !AccessoryManager.h().a(j).M()) {
            d dVar = this.j.get(num);
            if (dVar != null && dVar.f != null) {
                this.e.f(num.intValue());
                dVar.f.a(bArr);
                TrafficReport trafficReport = this.c.getTrafficReport(String.valueOf(j2), i);
                if (bArr != null) {
                    com.heytap.accessory.transport.control.c.a(dVar.b, i, trafficReport, bArr.length, this.e);
                    return;
                }
                return;
            }
            com.heytap.accessory.base.logging.a.e(str, "data receiver cleared. Ignoring data.");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER;
        messageObtain.obj = new CancelRequest(num.intValue(), 17);
        this.f.sendMessage(messageObtain);
    }

    public void a(int i, CtrlResponse ctrlResponse) {
        this.f.post(new b(ctrlResponse));
    }

    public final void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        StreamConsumerConnection streamConsumerConnection = this.c;
        if (streamConsumerConnection != null && setupRequest != null) {
            streamConsumerConnection.cleanupChannel(streamConsumerConnection.getConnectionId(), setupRequest.b());
        }
        com.heytap.accessory.stream.c cVar = this.g;
        if (cVar != null) {
            cVar.a(setupRequest, ctrlResponse);
        }
    }

    public final void a(int i, long j, int i2, boolean z) {
        Message messageObtainMessage = this.f.obtainMessage(SecureGcmProto.GcmDeviceInfo.TETHERING_SUPPORTED_FIELD_NUMBER, i2, z ? 1 : 0, new Bundle());
        Bundle data = messageObtainMessage.getData();
        data.putInt("transId", i);
        data.putLong("maxWindowSize", j);
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
            return n.contains(Integer.valueOf(i));
        }
    }

    public final int a(Message message) {
        if (message == null || message.getData() == null) {
            return -1;
        }
        return message.getData().getInt("transId", -1);
    }
}
