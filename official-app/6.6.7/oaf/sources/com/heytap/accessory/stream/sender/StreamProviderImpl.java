package com.heytap.accessory.stream.sender;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.ArraySet;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.NativeAgent;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.CtrlResponse;
import com.heytap.accessory.stream.model.SetupRequest;
import com.heytap.accessory.stream.model.SetupResponse;
import com.heytap.accessory.utils.buffer.Buffer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StreamProviderImpl extends NativeAgent implements com.heytap.accessory.stream.sender.a {
    public static final String s = "StreamProviderImpl";
    public com.heytap.accessory.stream.a a;
    public com.heytap.accessory.stream.a b;
    public c c;
    public com.heytap.accessory.stream.c d;
    public PowerManager e;
    public PowerManager.WakeLock f;
    public ConcurrentHashMap<Long, STProviderConnection> g;
    public ConcurrentHashMap<Long, Integer> h;
    public ConcurrentHashMap<Long, com.heytap.accessory.stream.b> i;
    public ConcurrentHashMap<Integer, Long> j;
    public ConcurrentHashMap<Integer, d> k;
    public Set<Long> l;
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Boolean>> m;
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Long>> n;
    public int o;
    public Integer[] p;
    public final Object q;
    public boolean r;

    public class STProviderConnection extends BaseSocket {
        public CtrlResponse a;

        public STProviderConnection() {
            super(STProviderConnection.class.getName());
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onError(int i, String str, int i2) {
            com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "Channel error channelId:" + i + " Message:" + str + " code:" + i2);
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onReceive(long j, int i, byte[] bArr) {
            Message messageObtainMessage = StreamProviderImpl.this.c.obtainMessage(SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER, i, 0, bArr);
            Bundle data = messageObtainMessage.getData();
            long accessoryId = getConnectedPeerAgent().getAccessoryId();
            data.putLong("accId", accessoryId);
            messageObtainMessage.setData(data);
            StreamProviderImpl.this.c.sendMessage(messageObtainMessage);
            com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "onReceive " + j + " , " + i + " , " + accessoryId);
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onServiceConnectionLost(long j, int i) {
            com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "onServiceConnectionLost.connectionId:" + j);
            StreamProviderImpl.this.c.post(new Runnable() { // from class: com.oplus.aiunit.vision.yzi
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a();
                }
            });
        }

        public void a(CtrlResponse ctrlResponse) {
            this.a = ctrlResponse;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            List<SetupRequest> listC = StreamProviderImpl.this.c(getConnectedPeerAgent().getAccessoryId());
            if (listC.isEmpty()) {
                StreamProviderImpl.this.g.remove(Long.valueOf(getConnectedPeerAgent().getAccessoryId()));
                return;
            }
            for (SetupRequest setupRequest : listC) {
                d dVar = (d) StreamProviderImpl.this.k.remove(Integer.valueOf(setupRequest.f()));
                StreamProviderImpl.this.c(setupRequest.a(), setupRequest.b());
                if (StreamProviderImpl.this.i.get(Long.valueOf(setupRequest.a())) != null) {
                    ((com.heytap.accessory.stream.b) StreamProviderImpl.this.i.get(Long.valueOf(setupRequest.a()))).a();
                }
                StreamProviderImpl.this.h.put(Long.valueOf(setupRequest.a()), 0);
                com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "Current Request for File");
                CtrlResponse ctrlResponse = this.a;
                if (ctrlResponse == null) {
                    com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "stop send  " + dVar.a + " , true");
                    com.heytap.accessory.stream.sender.b bVar = dVar.f;
                    if (bVar != null) {
                        bVar.b();
                        dVar.f = null;
                    }
                    com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "Service connection lost while file transfer in progress");
                    StreamProviderImpl.this.a(setupRequest, new CtrlResponse("streamtransfer-cancel-rsp", setupRequest.f(), com.heytap.accessory.stream.model.c.b, 5));
                } else if (ctrlResponse.a().equalsIgnoreCase("streamtransfer-complete-rsp") && this.a.c() == com.heytap.accessory.stream.model.c.a) {
                    StreamProviderImpl.this.d.a(setupRequest.f());
                } else {
                    StreamProviderImpl.this.a(setupRequest, this.a);
                }
                if (StreamProviderImpl.this.f.isHeld()) {
                    StreamProviderImpl.this.f.release();
                }
            }
            StreamProviderImpl.this.g.remove(Long.valueOf(getConnectedPeerAgent().getAccessoryId()));
        }
    }

    public final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    int i2 = message.getData().getInt("transId", -1);
                    if (i2 == -1) {
                        com.heytap.accessory.base.logging.a.e(StreamProviderImpl.s, "cancel req tranId wrong");
                        return;
                    } else if (((d) StreamProviderImpl.this.k.get(Integer.valueOf(i2))) != null) {
                        StreamProviderImpl.this.a(new CancelRequest(i2, message.what));
                        return;
                    } else {
                        com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "mCurrentRequest is null");
                        return;
                    }
                }
                if (i == 501) {
                    SetupResponse setupResponse = (SetupResponse) message.getData().getParcelable("parcelable_setup_response");
                    if (setupResponse == null || StreamProviderImpl.this.k.get(Integer.valueOf(setupResponse.d())) == null) {
                        com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "mCurrentRequest is null");
                        return;
                    }
                    String str = StreamProviderImpl.s;
                    StringBuilder sb = new StringBuilder();
                    sb.append("MSG_ST_SETUP_RSP ");
                    sb.append(StreamProviderImpl.this.k.get(Integer.valueOf(setupResponse.d())) != null);
                    com.heytap.accessory.base.logging.a.a(str, sb.toString());
                    StreamProviderImpl.this.a(setupResponse);
                    return;
                }
                if (i == 503) {
                    int i3 = message.getData().getInt("transId", -1);
                    if (i3 == -1) {
                        com.heytap.accessory.base.logging.a.e(StreamProviderImpl.s, "cancel req tranId wrong");
                        return;
                    } else {
                        StreamProviderImpl.this.a(i3, com.heytap.accessory.stream.model.c.a(message.arg1), message.arg2);
                        return;
                    }
                }
                if (i == 509) {
                    long j = message.getData().getLong("accId", -1L);
                    int i4 = message.getData().getInt("transId", -1);
                    long j2 = message.getData().getLong("totalSize", -1L);
                    com.heytap.accessory.base.logging.a.c(StreamProviderImpl.s, "TRANSFER_COMPLETE " + i4 + " , " + j2);
                    if (j == -1 || i4 == -1) {
                        com.heytap.accessory.base.logging.a.e(StreamProviderImpl.s, "cancel req tranId wrong");
                        return;
                    }
                    if (StreamProviderImpl.this.i.get(Long.valueOf(j)) != null) {
                        ((com.heytap.accessory.stream.b) StreamProviderImpl.this.i.get(Long.valueOf(j))).a(i4, j2);
                        return;
                    }
                    com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "current accessoryIdCMP:" + j + " is not is the mCommandManagerMap,ignore.");
                    return;
                }
                switch (i) {
                    case SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER /* 401 */:
                        com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "handleMessage: MSG_ST_APP_PUSH_STREAM");
                        Bundle bundle = (Bundle) message.obj;
                        StreamProviderImpl.this.b((ParcelFileDescriptor) bundle.getParcelable("SETUP_SOURCE"), (SetupRequest) bundle.getParcelable("setupRequest"));
                        break;
                    case SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER /* 402 */:
                        CancelRequest cancelRequest = (CancelRequest) message.obj;
                        com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "Cancel req");
                        d dVar = (d) StreamProviderImpl.this.k.get(Integer.valueOf(cancelRequest.c()));
                        if (dVar == null) {
                            com.heytap.accessory.base.logging.a.e(StreamProviderImpl.s, "record is null");
                        } else if (((Integer) StreamProviderImpl.this.h.get(Long.valueOf(dVar.b))).intValue() == 2) {
                            ((com.heytap.accessory.stream.b) StreamProviderImpl.this.i.get(Long.valueOf(dVar.b))).a(cancelRequest);
                            com.heytap.accessory.stream.sender.b bVar = dVar.f;
                            if (bVar != null) {
                                bVar.b();
                                dVar.f = null;
                            }
                        } else if (((Integer) StreamProviderImpl.this.h.get(Long.valueOf(dVar.b))).intValue() != 1) {
                            StreamProviderImpl.this.k.remove(Integer.valueOf(cancelRequest.c()));
                            StreamProviderImpl.this.c(dVar.b, dVar.e.b());
                            com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "Cancelled before file transfer could start");
                        } else {
                            com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "Cancelling before file transfer could start");
                        }
                        break;
                    case SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER /* 403 */:
                        com.heytap.accessory.stream.model.b bVar2 = (com.heytap.accessory.stream.model.b) message.obj;
                        STProviderConnection sTProviderConnection = (STProviderConnection) StreamProviderImpl.this.g.get(Long.valueOf(bVar2.a()));
                        if (sTProviderConnection != null && sTProviderConnection.getConnectedPeerAgent().getAccessoryId() == bVar2.a()) {
                            sTProviderConnection.close();
                            break;
                        }
                        break;
                    case SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER /* 404 */:
                        byte[] bArr = (byte[]) message.obj;
                        int i5 = message.arg1;
                        int i6 = message.arg2;
                        long j3 = message.getData().getLong("accId");
                        com.heytap.accessory.base.logging.a.c(StreamProviderImpl.s, "handleMessage: MSG_ST_SASOCKET_RECEIVE , RX on CH " + i5);
                        if (i5 == 200) {
                            StreamProviderImpl.this.a(j3, i6, bArr);
                        }
                        break;
                    case SecureGcmProto.GcmDeviceInfo.MOBILE_DATA_SUPPORTED_FIELD_NUMBER /* 405 */:
                        StreamProviderImpl.this.a((BaseSocket) message.obj, message.arg1);
                        break;
                    default:
                        switch (i) {
                            case 505:
                                break;
                            case 506:
                                int i7 = message.getData().getInt("transId", -1);
                                if (i7 == -1) {
                                    com.heytap.accessory.base.logging.a.e(StreamProviderImpl.s, "cancel req tranId wrong");
                                } else if (((d) StreamProviderImpl.this.k.get(Integer.valueOf(i7))) == null) {
                                    com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "mCurrentRequest is null");
                                } else {
                                    StreamProviderImpl.this.b(new CancelRequest(i7, message.arg1));
                                }
                                break;
                            case 507:
                                int i8 = message.getData().getInt("transId", -1);
                                if (i8 == -1) {
                                    com.heytap.accessory.base.logging.a.e(StreamProviderImpl.s, "cancel req tranId wrong");
                                } else if (((d) StreamProviderImpl.this.k.get(Integer.valueOf(i8))) == null) {
                                    com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "mCurrentRequest is null");
                                } else {
                                    StreamProviderImpl.this.b(new CtrlResponse("streamtransfer-cancel-rsp", i8, com.heytap.accessory.stream.model.c.a(message.arg1), message.arg2));
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
    }

    public class d {
        public int a;
        public long b;
        public com.heytap.accessory.stream.model.a c;
        public ParcelFileDescriptor d;
        public SetupRequest e;
        public com.heytap.accessory.stream.sender.b f;
        public InputStream g;

        public d(StreamProviderImpl streamProviderImpl, ParcelFileDescriptor parcelFileDescriptor, SetupRequest setupRequest) {
            this.b = setupRequest.a();
            this.d = parcelFileDescriptor;
            this.a = setupRequest.f();
            this.e = setupRequest;
            com.heytap.accessory.stream.model.a aVar = new com.heytap.accessory.stream.model.a();
            this.c = aVar;
            aVar.a(1);
        }
    }

    public StreamProviderImpl(Context context) {
        super("StreamProviderImpl", context, STProviderConnection.class);
        this.g = new ConcurrentHashMap<>();
        this.h = new ConcurrentHashMap<>();
        this.i = new ConcurrentHashMap<>();
        this.j = new ConcurrentHashMap<>();
        this.k = new ConcurrentHashMap<>();
        this.l = new ArraySet();
        this.m = new ConcurrentHashMap<>();
        this.n = new ConcurrentHashMap<>();
        this.o = 0;
        this.q = new Object();
        this.r = false;
        c();
        com.heytap.accessory.base.logging.a.c("StreamProviderImpl create!!!!");
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
    }

    @Override // com.heytap.accessory.NativeAgent
    public void onPeerFound(int i, List<PeerAgent> list) {
        com.heytap.accessory.base.logging.a.c(s, "onPeerFound");
        synchronized (this.l) {
            for (PeerAgent peerAgent : list) {
                if (this.l.contains(Long.valueOf(peerAgent.getAccessoryId()))) {
                    a(peerAgent, i);
                    this.l.remove(Long.valueOf(peerAgent.getAccessoryId()));
                    return;
                }
            }
            a((PeerAgent) null, i);
        }
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        c cVar = this.c;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.MOBILE_DATA_SUPPORTED_FIELD_NUMBER, i, 0, baseSocket));
    }

    public final void b(ParcelFileDescriptor parcelFileDescriptor, SetupRequest setupRequest) {
        if (setupRequest == null || parcelFileDescriptor == null) {
            com.heytap.accessory.base.logging.a.a(s, "Invalid parameters. mStopRequested:" + setupRequest);
            return;
        }
        if (this.g.get(Long.valueOf(setupRequest.a())) == null) {
            d(setupRequest.a());
            return;
        }
        com.heytap.accessory.base.logging.a.a(s, "Provider sending next request using old connection,accId:" + setupRequest.a());
        d dVar = new d(this, parcelFileDescriptor, setupRequest);
        this.k.put(Integer.valueOf(setupRequest.f()), dVar);
        this.j.put(Integer.valueOf(setupRequest.f()), Long.valueOf(dVar.b));
        this.i.get(Long.valueOf(setupRequest.a())).a(setupRequest);
    }

    public final void c() {
        if (com.heytap.accessory.stream.utils.b.a() == null) {
            com.heytap.accessory.stream.utils.b.a(getApplicationContext());
        }
        PowerManager powerManager = (PowerManager) getApplicationContext().getSystemService("power");
        this.e = powerManager;
        if (powerManager != null) {
            this.f = powerManager.newWakeLock(1, "FTCore-" + System.currentTimeMillis());
        }
        if (this.c == null && com.heytap.accessory.stream.utils.a.b() != null) {
            this.c = new c(com.heytap.accessory.stream.utils.a.b());
        }
        b();
    }

    public final void d(long j) {
        com.heytap.accessory.base.logging.a.c(s, "[SFTrack] Service connection is not yet established. Trying it now : " + j);
        this.l.add(Long.valueOf(j));
        this.h.put(Long.valueOf(j), 1);
        super.requestPeerAgents();
    }

    public final void e(long j, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - b(j, i);
        long jMin = jElapsedRealtime < 3000 ? Math.min(3000L, 3000 - jElapsedRealtime) : 0L;
        if (jMin > 0) {
            try {
                com.heytap.accessory.base.logging.a.a(s, "[SSTrack] channel not cool down, wait! channelId:" + i + ", waitTime:" + jMin);
                synchronized (this.q) {
                    try {
                        this.q.wait(jMin);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                com.heytap.accessory.base.logging.a.e(s, "waitForChannelInterrupt InterruptedException");
            }
        }
    }

    public class a implements com.heytap.accessory.stream.a {
        public a() {
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j, int i, byte[] bArr, boolean z) {
            STProviderConnection sTProviderConnection = (STProviderConnection) StreamProviderImpl.this.g.get(Long.valueOf(j));
            if (sTProviderConnection == null) {
                com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "no active sockets to send command");
                return false;
            }
            try {
                sTProviderConnection.send(200, bArr);
                return true;
            } catch (IOException e) {
                com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "error on command channel", e);
                return false;
            }
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j, int i, int i2, Buffer buffer, boolean z) {
            com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "Method called in the wrong place.");
            return false;
        }
    }

    public final void d(long j, int i) {
        if (this.n == null) {
            this.n = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<Integer, Long> concurrentHashMap = this.n.get(Long.valueOf(j));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.n.put(Long.valueOf(j), concurrentHashMap);
        }
        com.heytap.accessory.base.logging.a.a(s, "[SSTrack] saveChannelRecycleTime, accId:" + j + ", channelId:" + i + ", time:" + SystemClock.elapsedRealtime());
        concurrentHashMap.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public class b implements com.heytap.accessory.stream.a {
        public b() {
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j, int i, byte[] bArr, boolean z) {
            STProviderConnection sTProviderConnection = (STProviderConnection) StreamProviderImpl.this.g.get(Long.valueOf(j));
            if (sTProviderConnection == null) {
                com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "no active sockets to send binary data");
                return false;
            }
            if (bArr != null) {
                try {
                    com.heytap.accessory.transport.control.c.d(j, i, bArr.length);
                } catch (UnSupportException e) {
                    com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, e.getMessage());
                    return false;
                } catch (IOException unused) {
                    com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "error on data channel");
                    return false;
                } catch (IllegalArgumentException unused2) {
                    com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "error on data channel, the channel may closed");
                    return false;
                }
            }
            if (StreamProviderImpl.this.r) {
                sTProviderConnection.sendCompressed(i, bArr);
                return true;
            }
            sTProviderConnection.sendUncompressed(i, bArr);
            return true;
        }

        @Override // com.heytap.accessory.stream.a
        public boolean a(long j, int i, int i2, Buffer buffer, boolean z) {
            STProviderConnection sTProviderConnection = (STProviderConnection) StreamProviderImpl.this.g.get(Long.valueOf(j));
            if (sTProviderConnection == null) {
                com.heytap.accessory.base.logging.a.b(StreamProviderImpl.s, "no active sockets to send binary data");
                return false;
            }
            try {
                com.heytap.accessory.transport.control.c.d(j, i, buffer.getPayloadLength());
                if (StreamProviderImpl.this.r) {
                    sTProviderConnection.sendCompressed(i, buffer);
                    return true;
                }
                sTProviderConnection.sendUncompressed(i, buffer);
                return true;
            } catch (IOException unused) {
                com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "error on data channel");
                return false;
            } catch (IllegalArgumentException unused2) {
                com.heytap.accessory.base.logging.a.a(StreamProviderImpl.s, "error on data channel, the channel may closed");
                return false;
            }
        }
    }

    public final void c(long j, int i) {
        String str = s;
        com.heytap.accessory.base.logging.a.a(str, "[SSTrack] recycleChannelId " + i);
        synchronized (this.q) {
            ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.m.get(Long.valueOf(j));
            if (concurrentHashMap != null) {
                com.heytap.accessory.base.logging.a.a(str, "reset ch id " + i);
                if (i >= 0 && concurrentHashMap.containsKey(Integer.valueOf(i))) {
                    concurrentHashMap.put(Integer.valueOf(i), Boolean.FALSE);
                }
            }
        }
    }

    public final void b(CancelRequest cancelRequest) {
        CtrlResponse ctrlResponse;
        d dVar = this.k.get(Integer.valueOf(cancelRequest.c()));
        String str = s;
        com.heytap.accessory.base.logging.a.a(str, "handlePeerCancelled: Peer cancelled");
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.e(str, "record is null");
            return;
        }
        if (cancelRequest.b() != 5) {
            ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", cancelRequest.c(), com.heytap.accessory.stream.model.c.a, cancelRequest.b());
        } else {
            ctrlResponse = new CtrlResponse("streamtransfer-cancel-rsp", cancelRequest.c(), com.heytap.accessory.stream.model.c.a, 9);
        }
        com.heytap.accessory.stream.sender.b bVar = dVar.f;
        if (bVar != null) {
            bVar.b();
            dVar.f = null;
        }
        this.i.get(Long.valueOf(dVar.b)).a(cancelRequest.c());
        c(dVar.b, dVar.e.b());
        this.k.remove(Integer.valueOf(dVar.a));
        com.heytap.accessory.base.logging.a.a(str, "handlePeerCancelled: Peer cancelled , tid " + cancelRequest.c() + " , ch id" + dVar.e.b());
        if (com.heytap.accessory.stream.d.a(getApplicationContext()).d(dVar.b)) {
            a(ctrlResponse);
        } else {
            com.heytap.accessory.base.logging.a.a(str, "handlePeerCancelled: queue not empty..notifying app");
            a(dVar.e, ctrlResponse);
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
    }

    @Override // com.heytap.accessory.stream.sender.a
    public boolean a(long j, int i) {
        com.heytap.accessory.stream.model.a aVar;
        d dVar = this.k.get(Integer.valueOf(i));
        if (dVar == null || (aVar = dVar.c) == null) {
            return false;
        }
        return aVar.a() == 13 || aVar.a() == 11;
    }

    @Override // com.heytap.accessory.stream.sender.a
    public void a(ParcelFileDescriptor parcelFileDescriptor, SetupRequest setupRequest) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("setupRequest", setupRequest);
        bundle.putParcelable("SETUP_SOURCE", parcelFileDescriptor);
        c cVar = this.c;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER, bundle));
    }

    public final List<SetupRequest> c(long j) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.k.values()) {
            if (dVar.b == j) {
                arrayList.add(dVar.e);
            }
        }
        return arrayList;
    }

    @Override // com.heytap.accessory.stream.sender.a
    public boolean a(long j) {
        if (this.g.get(Long.valueOf(j)) != null) {
            return false;
        }
        d(j);
        return true;
    }

    @Override // com.heytap.accessory.stream.sender.a
    public void a(CancelRequest cancelRequest) {
        c cVar = this.c;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER, cancelRequest));
    }

    @Override // com.heytap.accessory.stream.sender.a
    public void a(com.heytap.accessory.stream.c cVar) {
        this.d = cVar;
    }

    public void a(long j, int i, byte[] bArr) {
        this.i.get(Long.valueOf(j)).a(j, i, bArr);
    }

    public final void a(CtrlResponse ctrlResponse) {
        STProviderConnection sTProviderConnection = this.g.get(this.j.get(Integer.valueOf(ctrlResponse.d())));
        if (sTProviderConnection != null) {
            com.heytap.accessory.base.logging.a.a(s, "closeConnection:Request close connection at: " + System.currentTimeMillis());
            sTProviderConnection.a(ctrlResponse);
            sTProviderConnection.close();
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
        this.g.remove(Long.valueOf(sTProviderConnection.getConnectedPeerAgent().getAccessoryId()));
    }

    public final void b(CtrlResponse ctrlResponse) {
        d dVar = this.k.get(Integer.valueOf(ctrlResponse.d()));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.e(s, "record is null");
            return;
        }
        if (ctrlResponse.c() == com.heytap.accessory.stream.model.c.a) {
            com.heytap.accessory.base.logging.a.a(s, "handleCancelResponse:cancelled success. tid " + ctrlResponse.d() + " , ch id " + dVar.e.b());
        } else {
            com.heytap.accessory.base.logging.a.a(s, "handleCancelResponse:cancelled: Cancel Failed: Error #" + ctrlResponse.b() + "tid " + ctrlResponse.d() + " , ch id " + dVar.e.b());
        }
        this.i.get(Long.valueOf(dVar.b)).a(ctrlResponse.d());
        c(dVar.b, dVar.e.b());
        this.k.remove(Integer.valueOf(dVar.a));
        com.heytap.accessory.stream.d.a(getApplicationContext()).b(dVar.b, dVar.a);
        if (com.heytap.accessory.stream.d.a(getApplicationContext()).d(dVar.b)) {
            a(ctrlResponse);
        } else {
            com.heytap.accessory.base.logging.a.a(s, "handleCancelResponse: Queue not empty..notifying app");
            a(dVar.e, ctrlResponse);
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
    }

    public final void a(long j, String str) {
        this.i.put(Long.valueOf(j), new com.heytap.accessory.stream.b(this.a, this.c, com.heytap.accessory.stream.b.e.a, com.heytap.accessory.stream.utils.a.b(), new com.heytap.accessory.stream.utils.c(this.g.get(Long.valueOf(j)))));
    }

    public final void a(SetupResponse setupResponse) {
        STProviderConnection sTProviderConnection = this.g.get(this.j.get(Integer.valueOf(setupResponse.d())));
        d dVar = this.k.get(Integer.valueOf(setupResponse.d()));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.e(s, "record is null");
            return;
        }
        if (setupResponse.c() == com.heytap.accessory.stream.model.c.a) {
            String str = s;
            com.heytap.accessory.base.logging.a.c(str, "handleSetupResponse: Setup Confirmed");
            long j = dVar.b;
            int i = dVar.a;
            int iB = dVar.e.b();
            com.heytap.accessory.transport.control.c.a(j, iB, i, setupResponse.g(), setupResponse.f());
            this.f.acquire(10000L);
            dVar.g = new ParcelFileDescriptor.AutoCloseInputStream(dVar.d);
            dVar.f = new com.heytap.accessory.stream.sender.b(j, i, iB, dVar.g, this.c, this.b, new com.heytap.accessory.stream.utils.c(sTProviderConnection));
            dVar.e.b(Long.parseLong(sTProviderConnection.getConnectionId()));
            this.d.b(dVar.e);
            dVar.f.a(dVar.e);
            dVar.f.h();
            com.heytap.accessory.base.logging.a.a(str, "[SSTrack] startSending, transId:" + setupResponse.d() + " sendTaskRecord:" + dVar);
            return;
        }
        if (9 == setupResponse.b() || 3 == setupResponse.b() || 8 == setupResponse.b() || 11 == setupResponse.b() || 14 == setupResponse.b()) {
            String str2 = s;
            com.heytap.accessory.base.logging.a.a(str2, "handleSetupResponse: Setup rejected: Error code " + setupResponse.b() + " , tid " + dVar.a + " , ch id " + dVar.e.b());
            this.i.get(Long.valueOf(dVar.b)).a(dVar.a);
            c(dVar.b, dVar.e.b());
            this.k.remove(Integer.valueOf(dVar.a));
            if (com.heytap.accessory.stream.d.a(getApplicationContext()).d(dVar.e.a())) {
                a((CtrlResponse) setupResponse);
            } else {
                com.heytap.accessory.base.logging.a.a(str2, "SETUP REJECT received when queue not empty..notifying app");
                a(dVar.e, setupResponse);
            }
        }
    }

    @Override // com.heytap.accessory.stream.sender.a
    public int b(long j) {
        synchronized (this.q) {
            ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.m.get(Long.valueOf(j));
            int i = -1;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                Integer[] numArr = this.p;
                if (numArr != null && numArr.length != 0) {
                    int i2 = 0;
                    while (true) {
                        Integer[] numArr2 = this.p;
                        if (i2 >= numArr2.length) {
                            break;
                        }
                        int length = (this.o + i2) % numArr2.length;
                        int iIntValue = numArr2[length].intValue();
                        Boolean bool = concurrentHashMap.get(Integer.valueOf(iIntValue));
                        if (bool == null) {
                            com.heytap.accessory.base.logging.a.b(s, "unexpected busy is null..");
                            break;
                        }
                        if (!bool.booleanValue()) {
                            concurrentHashMap.put(Integer.valueOf(iIntValue), Boolean.TRUE);
                            e(j, iIntValue);
                            this.o = (length + 1) % this.p.length;
                            i = iIntValue;
                            break;
                        }
                        com.heytap.accessory.base.logging.a.a(s, "[stream getAvailableChannelId] channel is busy: " + iIntValue);
                        i2++;
                    }
                    com.heytap.accessory.base.logging.a.a(s, "[stream getAvailableChannelId] choose ch id " + i);
                    return i;
                }
                com.heytap.accessory.base.logging.a.a(s, "[SSTrack] mSortedChannelArray is empty choose ch id -1");
                return -1;
            }
            com.heytap.accessory.base.logging.a.a(s, "[SSTrack] stateMap is empty choose ch id -1");
            return -1;
        }
    }

    public final long b(long j, int i) {
        ConcurrentHashMap<Integer, Long> concurrentHashMap;
        Long l;
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Long>> concurrentHashMap2 = this.n;
        if (concurrentHashMap2 == null || (concurrentHashMap = concurrentHashMap2.get(Long.valueOf(j))) == null || (l = concurrentHashMap.get(Integer.valueOf(i))) == null) {
            return 0L;
        }
        com.heytap.accessory.base.logging.a.a(s, "[SSTrack] getChannelRecycleTime, accId:" + j + ", channelId:" + i + ", time:" + l);
        return l.longValue();
    }

    public final void a(int i) {
        d dVarRemove = this.k.remove(Integer.valueOf(i));
        if (dVarRemove == null) {
            com.heytap.accessory.base.logging.a.e(s, "task is null " + i);
            return;
        }
        c(dVarRemove.b, dVarRemove.e.b());
        if (this.f.isHeld() && this.k.isEmpty()) {
            this.f.release();
        }
        com.heytap.accessory.stream.sender.b bVar = dVarRemove.f;
        if (bVar != null) {
            bVar.b();
            dVarRemove.f = null;
        }
        this.i.get(Long.valueOf(dVarRemove.b)).a(i);
        dVarRemove.c.a(1);
        if (dVarRemove.e == null) {
            com.heytap.accessory.base.logging.a.e(s, "handleTransferComplete: mCurrentRequest is null");
            return;
        }
        if (com.heytap.accessory.stream.d.a(getApplicationContext()).d(dVarRemove.e.a())) {
            com.heytap.accessory.base.logging.a.a(s, "handleTransferComplete: Closing connection");
            CtrlResponse ctrlResponse = new CtrlResponse("streamtransfer-complete-rsp", dVarRemove.e.f(), com.heytap.accessory.stream.model.c.a, -1);
            this.d.a(dVarRemove.e);
            a(ctrlResponse);
            return;
        }
        com.heytap.accessory.base.logging.a.e(s, "handleTransferComplete: Requests in Queue, Completed : tid " + dVarRemove.a + " , ch id " + dVarRemove.e.b());
        this.d.a(dVarRemove.e);
        this.d.a(dVarRemove.e.f());
    }

    public final void b() {
        this.a = new a();
        this.b = new b();
    }

    public final void a(int i, com.heytap.accessory.stream.model.c cVar, int i2) {
        com.heytap.accessory.base.logging.a.c(s, "handleCompletionResponse");
        a(i);
    }

    public void a(PeerAgent peerAgent, int i) {
        if (i == 10003) {
            com.heytap.accessory.base.logging.a.b(s, "One Stream transfer connection under progress, ignoring this one.");
        } else if (peerAgent == null) {
            com.heytap.accessory.base.logging.a.b("findPeerAgent failed ,peerAgent is null");
        } else {
            super.requestServiceConnection(peerAgent);
        }
    }

    public void a(BaseSocket baseSocket, int i) {
        String str = s;
        com.heytap.accessory.base.logging.a.c(str, "handleServiceConnectionResponse result = " + i);
        if (baseSocket == null) {
            com.heytap.accessory.base.logging.a.e(str, "connHelper is null");
            return;
        }
        long accessoryId = baseSocket.getConnectedPeerAgent().getAccessoryId();
        if (i == 0) {
            com.heytap.accessory.base.logging.a.c(str, "Service Connection Success " + accessoryId);
            this.g.put(Long.valueOf(accessoryId), (STProviderConnection) baseSocket);
            a(accessoryId, baseSocket);
            this.h.put(Long.valueOf(accessoryId), 2);
            a(accessoryId, baseSocket.getConnectedPeerAgent().getProfileVersion());
            com.heytap.accessory.stream.c cVar = this.d;
            if (cVar != null) {
                cVar.a(-1);
            }
        }
    }

    public final void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        if (setupRequest != null && ctrlResponse != null) {
            long jA = setupRequest.a();
            int iF = setupRequest.f();
            int iB = setupRequest.b();
            d(jA, iB);
            c(jA, iB);
            STProviderConnection sTProviderConnection = this.g.get(Long.valueOf(jA));
            if (sTProviderConnection != null) {
                sTProviderConnection.cleanupChannel(sTProviderConnection.getConnectionId(), iB);
            }
            com.heytap.accessory.stream.c cVar = this.d;
            if (cVar != null) {
                cVar.a(setupRequest, ctrlResponse);
            }
            com.heytap.accessory.stream.b bVar = this.i.get(Long.valueOf(jA));
            if (bVar != null) {
                bVar.a(iF);
            }
            this.k.remove(Integer.valueOf(iF));
            return;
        }
        com.heytap.accessory.base.logging.a.b(s, new IllegalArgumentException("notifyError failed, setupRequest or ctrlResponse is null"));
    }

    public final List<Integer> a(BaseSocket baseSocket) {
        ArrayList arrayList = new ArrayList();
        int serviceChannelSize = baseSocket.getServiceChannelSize();
        for (int i = 0; i < serviceChannelSize; i++) {
            int serviceChannelId = baseSocket.getServiceChannelId(i);
            if (serviceChannelId != 200) {
                arrayList.add(Integer.valueOf(serviceChannelId));
            }
        }
        return arrayList;
    }

    public final void a(long j, BaseSocket baseSocket) {
        synchronized (this.q) {
            if (this.m.containsKey(Long.valueOf(j))) {
                com.heytap.accessory.base.logging.a.e(s, "channel init");
                return;
            }
            List<Integer> listA = a(baseSocket);
            com.heytap.accessory.base.logging.a.e(s, "[SSTrack] initChannelState, " + listA);
            if (listA.isEmpty()) {
                return;
            }
            ConcurrentHashMap<Integer, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
            for (Integer num : listA) {
                if (num.intValue() >= 0) {
                    concurrentHashMap.put(num, Boolean.FALSE);
                }
            }
            this.m.put(Long.valueOf(j), concurrentHashMap);
            Integer[] numArr = (Integer[]) listA.toArray(new Integer[0]);
            this.p = numArr;
            Arrays.sort(numArr);
        }
    }
}
