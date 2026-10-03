package com.heytap.accessory.file.sender;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.ArraySet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.NativeAgent;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.file.e;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.Constant;
import com.heytap.accessory.file.model.CtrlResponse;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.accessory.file.model.SetupResponse;
import com.heytap.accessory.utils.buffer.Buffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FileProviderImpl extends NativeAgent implements com.heytap.accessory.file.sender.b {
    public static final String s = "FileProviderImpl";
    public com.heytap.accessory.file.a a;
    public com.heytap.accessory.file.a b;
    public c c;
    public com.heytap.accessory.file.d d;
    public PowerManager e;
    public PowerManager.WakeLock f;
    public ConcurrentHashMap<Long, FTProviderConnection> g;
    public ConcurrentHashMap<Long, Integer> h;
    public ConcurrentHashMap<Long, com.heytap.accessory.file.b> i;
    public ConcurrentHashMap<Integer, Long> j;
    public ConcurrentHashMap<Integer, d> k;
    public final Set<Long> l;
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Boolean>> m;
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Long>> n;
    public int o;
    public Integer[] p;
    public final Object q;
    public boolean r;

    public class FTProviderConnection extends BaseSocket {
        public CtrlResponse a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FTProviderConnection fTProviderConnection = FTProviderConnection.this;
                List<SetupRequest> listD = FileProviderImpl.this.d(fTProviderConnection.getConnectedPeerAgent().getAccessoryId());
                if (listD.isEmpty()) {
                    com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "onServiceConnectionLost : mCurrentRequest is null");
                } else {
                    for (SetupRequest setupRequest : listD) {
                        d dVar = (d) FileProviderImpl.this.k.remove(Integer.valueOf(setupRequest.l()));
                        if (dVar == null) {
                            com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "onServiceConnectionLost, SendTaskRecord not found");
                            return;
                        }
                        FileProviderImpl.this.c(setupRequest.a(), setupRequest.b());
                        com.heytap.accessory.transport.control.c.b(setupRequest.a(), setupRequest.b(), 0);
                        com.heytap.accessory.file.b bVar = (com.heytap.accessory.file.b) FileProviderImpl.this.i.get(Long.valueOf(setupRequest.a()));
                        if (bVar != null) {
                            bVar.a();
                        }
                        FileProviderImpl.this.h.put(Long.valueOf(setupRequest.a()), 0);
                        com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, "Current Request for File");
                        if (FTProviderConnection.this.a == null) {
                            com.heytap.accessory.file.sender.a aVar = dVar.e;
                            if (aVar != null) {
                                aVar.b();
                                dVar.e = null;
                            }
                            com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "Service connection lost while file transfer in progress");
                            FileProviderImpl.this.a(setupRequest, new CtrlResponse("filetransfer-cancel-rsp", setupRequest.l(), com.heytap.accessory.file.model.c.b, 5, setupRequest.g()));
                        } else if (FTProviderConnection.this.a.b().equalsIgnoreCase("filetransfer-complete-rsp") && FTProviderConnection.this.a.e() == com.heytap.accessory.file.model.c.a) {
                            FileProviderImpl.this.d.a(setupRequest.l());
                        } else {
                            FileProviderImpl.this.d.a(setupRequest, FTProviderConnection.this.a);
                        }
                        if (FileProviderImpl.this.f.isHeld()) {
                            FileProviderImpl.this.f.release();
                        }
                    }
                }
                FileProviderImpl.this.g.remove(Long.valueOf(FTProviderConnection.this.getConnectedPeerAgent().getAccessoryId()));
            }
        }

        public FTProviderConnection() {
            super(FTProviderConnection.class.getName());
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onError(int i, String str, int i2) {
            com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "Channel error channelId:" + i + " Message:" + str + " code:" + i2);
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onReceive(long j, int i, byte[] bArr) {
            Message messageObtainMessage = FileProviderImpl.this.c.obtainMessage(SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER, i, (int) j, bArr);
            Bundle data = messageObtainMessage.getData();
            long accessoryId = getConnectedPeerAgent().getAccessoryId();
            data.putLong("accId", accessoryId);
            messageObtainMessage.setData(data);
            FileProviderImpl.this.c.sendMessage(messageObtainMessage);
            com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "onReceive " + j + " , " + i + " , " + accessoryId);
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onServiceConnectionLost(long j, int i) {
            FileProviderImpl.this.c.post(new a());
        }

        public void a(CtrlResponse ctrlResponse) {
            this.a = ctrlResponse;
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
                if (i == 2 || i == 4) {
                    int i2 = message.getData().getInt("transId", -1);
                    if (i2 == -1) {
                        com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "cancel req tranId wrong");
                        return;
                    }
                    d dVar = (d) FileProviderImpl.this.k.get(Integer.valueOf(i2));
                    if (dVar != null) {
                        FileProviderImpl.this.a(new CancelRequest(i2, message.what, dVar.d.g()));
                        return;
                    } else {
                        com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "mCurrentRequest is null");
                        return;
                    }
                }
                if (i == 501) {
                    com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "[SFTrack] handleSetupResponse");
                    SetupResponse setupResponse = (SetupResponse) message.getData().getParcelable("parcelable_setup_response");
                    if (setupResponse == null) {
                        com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, new IllegalArgumentException("response for MSG_FT_SETUP_RSP is null"));
                        return;
                    } else if (FileProviderImpl.this.k.get(Integer.valueOf(setupResponse.f())) != null) {
                        FileProviderImpl.this.a(setupResponse);
                        return;
                    } else {
                        com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "MSG_FT_SETUP_RSP mCurrentRequest is null");
                        return;
                    }
                }
                if (i == 502) {
                    int i3 = message.getData().getInt("transId", -1);
                    if (i3 == -1) {
                        com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "cancel req tranId wrong");
                        return;
                    } else {
                        FileProviderImpl.this.a(i3);
                        return;
                    }
                }
                switch (i) {
                    case SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER /* 401 */:
                        com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "[SFTrack] sendSetupRequest");
                        Bundle bundle = (Bundle) message.obj;
                        FileProviderImpl.this.b(bundle.getString("filePath"), (SetupRequest) bundle.getParcelable("setupRequest"));
                        break;
                    case SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER /* 402 */:
                        CancelRequest cancelRequest = (CancelRequest) message.obj;
                        com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "[SFTrack] Cancel a running file req");
                        d dVar2 = (d) FileProviderImpl.this.k.get(Integer.valueOf(cancelRequest.d()));
                        if (dVar2 == null) {
                            com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "record is null");
                            break;
                        } else if (com.heytap.accessory.file.utils.a.a(cancelRequest, dVar2.d)) {
                            Integer num = (Integer) FileProviderImpl.this.h.get(Long.valueOf(dVar2.a));
                            if (num == null) {
                                com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "cannot find current accessory in mConnectionStateMap:" + dVar2.a);
                            } else if (num.intValue() == 2) {
                                if (FileProviderImpl.this.i.get(Long.valueOf(dVar2.a)) != null) {
                                    ((com.heytap.accessory.file.b) FileProviderImpl.this.i.get(Long.valueOf(dVar2.a))).a(cancelRequest);
                                } else {
                                    com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "cannot find current accessory in mCommandManagerMap:" + dVar2.a);
                                }
                                com.heytap.accessory.file.sender.a aVar = dVar2.e;
                                if (aVar != null) {
                                    aVar.b();
                                    dVar2.e = null;
                                }
                            } else if (num.intValue() != 1) {
                                FileProviderImpl.this.k.remove(Integer.valueOf(cancelRequest.d()));
                                FileProviderImpl.this.c(dVar2.a, dVar2.d.b());
                                com.heytap.accessory.transport.control.c.b(dVar2.a, dVar2.d.b(), 0);
                                com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "[SFTrack] Cancelled before file transfer could start");
                            } else {
                                com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "Cancelling before file transfer could start");
                            }
                            break;
                        }
                        break;
                    case SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER /* 403 */:
                        com.heytap.accessory.file.model.b bVar = (com.heytap.accessory.file.model.b) message.obj;
                        FTProviderConnection fTProviderConnection = (FTProviderConnection) FileProviderImpl.this.g.get(Long.valueOf(bVar.a()));
                        if (fTProviderConnection != null && fTProviderConnection.getConnectedPeerAgent().getAccessoryId() == bVar.a()) {
                            fTProviderConnection.close();
                            break;
                        }
                        break;
                    case SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER /* 404 */:
                        Log.i(FileProviderImpl.s, "handleMessage: MSG_FT_SASOCKET_RECEIVE");
                        byte[] bArr = (byte[]) message.obj;
                        int i4 = message.arg1;
                        int i5 = message.arg2;
                        long j = message.getData().getLong("accId");
                        com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, "RX on CH " + i4);
                        if (i4 == 100) {
                            FileProviderImpl.this.a(j, i5, bArr);
                        }
                        break;
                    case SecureGcmProto.GcmDeviceInfo.MOBILE_DATA_SUPPORTED_FIELD_NUMBER /* 405 */:
                        FileProviderImpl.this.a((BaseSocket) message.obj, message.arg1);
                        break;
                    default:
                        switch (i) {
                            case 506:
                                int i6 = message.getData().getInt("transId", -1);
                                if (i6 != -1) {
                                    d dVar3 = (d) FileProviderImpl.this.k.get(Integer.valueOf(i6));
                                    if (dVar3 == null) {
                                        com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "mCurrentRequest is null");
                                    } else {
                                        FileProviderImpl.this.b(new CancelRequest(i6, message.arg1, dVar3.d.g()));
                                    }
                                } else {
                                    com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "cancel req tranId wrong");
                                }
                                break;
                            case 507:
                                int i7 = message.getData().getInt("transId", -1);
                                com.heytap.accessory.base.logging.a.a(FileProviderImpl.s, "[SFTrack] receive cancel resp:" + i7);
                                if (i7 != -1) {
                                    d dVar4 = (d) FileProviderImpl.this.k.get(Integer.valueOf(i7));
                                    if (dVar4 == null) {
                                        com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "mCurrentRequest is null");
                                    } else {
                                        FileProviderImpl.this.b(new CtrlResponse("filetransfer-cancel-rsp", i7, com.heytap.accessory.file.model.c.a(message.arg1), message.arg2, dVar4.d.g()));
                                    }
                                } else {
                                    com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "cancel req tranId wrong");
                                }
                                break;
                            case 508:
                                int i8 = message.getData().getInt("transId", -1);
                                if (i8 != -1) {
                                    FileProviderImpl.this.a(i8, message.getData().getLong(Constant.PROGRESS));
                                } else {
                                    com.heytap.accessory.base.logging.a.e(FileProviderImpl.s, "cancel req tranId wrong");
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

    public static class d {
        public long a;
        public com.heytap.accessory.file.c b;
        public String c;
        public SetupRequest d;
        public com.heytap.accessory.file.sender.a e;

        public d(String str, SetupRequest setupRequest) {
            this.a = setupRequest.a();
            this.c = str;
            setupRequest.l();
            this.d = setupRequest;
            com.heytap.accessory.file.c cVar = new com.heytap.accessory.file.c();
            this.b = cVar;
            cVar.a(1);
        }
    }

    public FileProviderImpl(Context context) {
        super("FileTransferHelperProvider", context, FTProviderConnection.class);
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
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
    }

    @Override // com.heytap.accessory.NativeAgent
    public void onPeerFound(int i, @NonNull List<PeerAgent> list) {
        com.heytap.accessory.base.logging.a.c(s, "onPeerFound");
        StringBuilder sb = new StringBuilder();
        synchronized (this.l) {
            for (PeerAgent peerAgent : list) {
                if (this.l.contains(Long.valueOf(peerAgent.getAccessoryId()))) {
                    a(peerAgent, i);
                    this.l.remove(Long.valueOf(peerAgent.getAccessoryId()));
                    return;
                } else {
                    sb.append(peerAgent.getAccessoryId());
                    sb.append("; ");
                }
            }
            com.heytap.accessory.base.logging.a.b(s, "PeerAgent error: accId not match. found peerList accId: " + sb.toString() + " connecting accId: " + this.l);
            a((PeerAgent) null, i);
        }
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        c cVar = this.c;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.MOBILE_DATA_SUPPORTED_FIELD_NUMBER, i, 0, baseSocket));
    }

    public final void b(String str, SetupRequest setupRequest) {
        if (setupRequest == null || str == null) {
            com.heytap.accessory.base.logging.a.a(s, "Invalid parameters. mStopRequested:" + setupRequest + " path:" + str);
            return;
        }
        if (this.g.get(Long.valueOf(setupRequest.a())) == null) {
            e(setupRequest.a());
            return;
        }
        com.heytap.accessory.base.logging.a.a(s, "Provider sending next request using old connection");
        d dVar = new d(str, setupRequest);
        this.k.put(Integer.valueOf(setupRequest.l()), dVar);
        this.j.put(Integer.valueOf(setupRequest.l()), Long.valueOf(dVar.a));
        this.i.get(Long.valueOf(setupRequest.a())).a(setupRequest);
    }

    public void c() {
        Context applicationContext = getApplicationContext();
        if (com.heytap.accessory.file.utils.a.a() == null) {
            com.heytap.accessory.file.utils.a.a(applicationContext);
        }
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        this.e = powerManager;
        if (powerManager != null) {
            this.f = powerManager.newWakeLock(1, "FTCore-" + System.currentTimeMillis());
        }
        if (this.c == null && com.heytap.accessory.file.utils.b.b() != null) {
            this.c = new c(com.heytap.accessory.file.utils.b.b());
        }
        b();
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
        com.heytap.accessory.base.logging.a.a(s, "[SFTrack] saveChannelRecycleTime, accId:" + j + ", channelId:" + i + ", time:" + SystemClock.elapsedRealtime());
        concurrentHashMap.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void e(long j) {
        com.heytap.accessory.base.logging.a.c(s, "[SFTrack] Service connection is not yet established. Trying it now : " + j);
        this.l.add(Long.valueOf(j));
        this.h.put(Long.valueOf(j), 1);
        super.requestPeerAgents();
    }

    public class a implements com.heytap.accessory.file.a {
        public a() {
        }

        @Override // com.heytap.accessory.file.a
        public boolean a(long j, int i, byte[] bArr) {
            FTProviderConnection fTProviderConnection = (FTProviderConnection) FileProviderImpl.this.g.get(Long.valueOf(j));
            if (fTProviderConnection == null) {
                com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "no active sockets to send command");
                return false;
            }
            try {
                fTProviderConnection.send(100, bArr);
                return true;
            } catch (IOException e) {
                com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "error on command channel: 100", e);
                return false;
            }
        }

        @Override // com.heytap.accessory.file.a
        public boolean a(long j, int i, Buffer buffer) {
            com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "Method called in the wrong place.");
            return false;
        }
    }

    public final void e(long j, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - b(j, i);
        long jMin = jElapsedRealtime < 3000 ? Math.min(3000L, 3000 - jElapsedRealtime) : 0L;
        if (jMin > 0) {
            try {
                com.heytap.accessory.base.logging.a.a(s, "[SFTrack] channel not cool down, wait! channelId:" + i + ", waitTime:" + jMin);
                synchronized (this.q) {
                    try {
                        this.q.wait(jMin);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e) {
                com.heytap.accessory.base.logging.a.e(s, "waitForChannelInterrupt error," + e);
            }
        }
    }

    public class b implements com.heytap.accessory.file.a {
        public b() {
        }

        @Override // com.heytap.accessory.file.a
        public boolean a(long j, int i, byte[] bArr) {
            FTProviderConnection fTProviderConnection = (FTProviderConnection) FileProviderImpl.this.g.get(Long.valueOf(j));
            if (fTProviderConnection == null) {
                com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "no active sockets to send binary data");
                return false;
            }
            if (bArr != null) {
                try {
                    com.heytap.accessory.transport.control.c.d(j, i, bArr.length);
                } catch (UnSupportException e) {
                    com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, e.getMessage());
                    return false;
                } catch (IOException unused) {
                    com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, "error on data channel");
                    return false;
                } catch (IllegalArgumentException unused2) {
                    com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, "error on data channel, the channel may closed");
                    return false;
                }
            }
            if (FileProviderImpl.this.r) {
                fTProviderConnection.sendCompressed(i, bArr);
                return true;
            }
            fTProviderConnection.sendUncompressed(i, bArr);
            return true;
        }

        @Override // com.heytap.accessory.file.a
        public boolean a(long j, int i, Buffer buffer) {
            FTProviderConnection fTProviderConnection = (FTProviderConnection) FileProviderImpl.this.g.get(Long.valueOf(j));
            if (fTProviderConnection == null) {
                com.heytap.accessory.base.logging.a.b(FileProviderImpl.s, "no active sockets to send binary data");
                return false;
            }
            if (buffer != null) {
                try {
                    com.heytap.accessory.transport.control.c.d(j, i, buffer.getPayloadLength());
                } catch (IOException unused) {
                    com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, "error on data channel");
                    return false;
                } catch (IllegalArgumentException unused2) {
                    com.heytap.accessory.base.logging.a.d(FileProviderImpl.s, "error on data channel, the channel may closed");
                    return false;
                }
            }
            if (FileProviderImpl.this.r) {
                fTProviderConnection.sendCompressed(i, buffer);
                return true;
            }
            fTProviderConnection.sendUncompressed(i, buffer);
            return true;
        }
    }

    public final void b(CancelRequest cancelRequest) {
        CtrlResponse ctrlResponse;
        d dVar = this.k.get(Integer.valueOf(cancelRequest.d()));
        String str = s;
        com.heytap.accessory.base.logging.a.a(str, "handlePeerCancelled: Peer cancelled");
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.e(str, "record is null");
            return;
        }
        if (com.heytap.accessory.file.utils.a.a(cancelRequest, dVar.d)) {
            if (cancelRequest.c() != 5) {
                ctrlResponse = new CtrlResponse("filetransfer-cancel-rsp", cancelRequest.d(), com.heytap.accessory.file.model.c.a, cancelRequest.c(), cancelRequest.b());
            } else {
                ctrlResponse = new CtrlResponse("filetransfer-cancel-rsp", cancelRequest.d(), com.heytap.accessory.file.model.c.a, 9, cancelRequest.b());
            }
            com.heytap.accessory.file.sender.a aVar = dVar.e;
            if (aVar != null) {
                aVar.b();
                dVar.e = null;
            }
            com.heytap.accessory.base.logging.a.a(str, "handlePeerCancelled: Peer cancelled , tid " + cancelRequest.d() + " , ch id " + dVar.d.b());
            if (e.a(getApplicationContext()).e(dVar.d.a())) {
                a(ctrlResponse);
            } else {
                com.heytap.accessory.base.logging.a.d(str, "handlePeerCancelled: queue not empty..notifying app");
                a(dVar.d, ctrlResponse);
            }
            if (this.f.isHeld()) {
                this.f.release();
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.e(str, "Invalid cancel request for file:" + cancelRequest.b());
    }

    @Override // com.heytap.accessory.file.sender.b
    public boolean c(long j) {
        synchronized (this.q) {
            ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.m.get(Long.valueOf(j));
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                Integer[] numArr = this.p;
                if (numArr != null && numArr.length != 0) {
                    int i = 0;
                    while (true) {
                        Integer[] numArr2 = this.p;
                        if (i >= numArr2.length) {
                            return false;
                        }
                        Boolean bool = concurrentHashMap.get(Integer.valueOf(numArr2[(this.o + i) % numArr2.length].intValue()));
                        if (bool != null && bool.booleanValue()) {
                            return true;
                        }
                        i++;
                    }
                }
                return false;
            }
            return false;
        }
    }

    @Override // com.heytap.accessory.file.sender.b
    public boolean a(long j, int i) {
        com.heytap.accessory.file.c cVar;
        d dVar = this.k.get(Integer.valueOf(i));
        if (dVar == null || (cVar = dVar.b) == null) {
            return false;
        }
        return cVar.a() == 13 || cVar.a() == 11;
    }

    public final List<SetupRequest> d(long j) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.k.values()) {
            if (dVar.a == j) {
                arrayList.add(dVar.d);
            }
        }
        return arrayList;
    }

    @Override // com.heytap.accessory.file.sender.b
    public void a(String str, SetupRequest setupRequest) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("setupRequest", setupRequest);
        bundle.putString("filePath", str);
        c cVar = this.c;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER, bundle));
    }

    @Override // com.heytap.accessory.file.sender.b
    public boolean a(long j) {
        if (this.g.get(Long.valueOf(j)) != null) {
            return false;
        }
        e(j);
        return true;
    }

    @Override // com.heytap.accessory.file.sender.b
    public void a(CancelRequest cancelRequest) {
        c cVar = this.c;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER, cancelRequest));
    }

    @Override // com.heytap.accessory.file.sender.b
    public void a(com.heytap.accessory.file.d dVar) {
        this.d = dVar;
    }

    public void a(long j, int i, byte[] bArr) {
        this.i.get(Long.valueOf(j)).a(j, i, bArr);
    }

    public final void a(CtrlResponse ctrlResponse) {
        FTProviderConnection fTProviderConnection = this.g.get(this.j.get(Integer.valueOf(ctrlResponse.f())));
        if (fTProviderConnection != null) {
            com.heytap.accessory.base.logging.a.d(s, "closeConnection:Request close connection at: " + System.currentTimeMillis());
            fTProviderConnection.a(ctrlResponse);
            fTProviderConnection.close();
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
        this.g.remove(Long.valueOf(fTProviderConnection.getConnectedPeerAgent().getAccessoryId()));
    }

    public final void c(long j, int i) {
        String str = s;
        com.heytap.accessory.base.logging.a.a(str, "[SFTrack] recycleChannelId " + i);
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

    public final void a(long j, String str) {
        this.i.put(Long.valueOf(j), new com.heytap.accessory.file.b(this.a, this.c, com.heytap.accessory.file.b.d.a, com.heytap.accessory.file.utils.b.b(), new com.heytap.accessory.file.utils.c(this.g.get(Long.valueOf(j))), str));
    }

    public final void b(CtrlResponse ctrlResponse) {
        d dVar = this.k.get(Integer.valueOf(ctrlResponse.f()));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.e(s, "record is null");
            return;
        }
        if (com.heytap.accessory.file.utils.a.a(ctrlResponse, dVar.d)) {
            if (ctrlResponse.e() == com.heytap.accessory.file.model.c.a) {
                com.heytap.accessory.base.logging.a.d(s, "handleCancelResponse:cancelled success.FileName:" + ctrlResponse.a());
            } else {
                com.heytap.accessory.base.logging.a.d(s, "handleCancelResponse:cancelled: Cancel Failed:FileName:" + ctrlResponse.a() + "Error #" + ctrlResponse.c());
            }
            if (e.a(getApplicationContext()).e(dVar.d.a())) {
                a(ctrlResponse);
            } else {
                com.heytap.accessory.base.logging.a.d(s, "handleCancelResponse: Queue not empty..notifying app");
                a(dVar.d, ctrlResponse);
            }
        } else {
            com.heytap.accessory.base.logging.a.e(s, "handleCancelResponse: Invalid cancel response for file:" + ctrlResponse.a());
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
    }

    public void a(SetupResponse setupResponse) {
        ConcurrentHashMap<Long, FTProviderConnection> concurrentHashMap = this.g;
        Long l = this.j.get(Integer.valueOf(setupResponse.f()));
        Objects.requireNonNull(l);
        FTProviderConnection fTProviderConnection = concurrentHashMap.get(l);
        d dVar = this.k.get(Integer.valueOf(setupResponse.f()));
        if (dVar == null) {
            com.heytap.accessory.base.logging.a.e(s, "record is null");
            return;
        }
        if (setupResponse.e() == com.heytap.accessory.file.model.c.a) {
            String str = s;
            com.heytap.accessory.base.logging.a.c(str, "handleSetupResponse: Setup Confirmed:" + setupResponse.f());
            this.f.acquire(10000L);
            int iB = dVar.d.b();
            long j = dVar.a;
            com.heytap.accessory.transport.control.c.a(j, iB, setupResponse.f(), setupResponse.i(), setupResponse.h());
            dVar.e = new com.heytap.accessory.file.sender.a(getApplicationContext(), j, iB, this.c, this.b, new com.heytap.accessory.file.utils.c(fTProviderConnection));
            this.d.b(dVar.d);
            dVar.e.a(dVar.c, dVar.d);
            com.heytap.accessory.base.logging.a.a(str, "[SFTrack] startSending, transId:" + setupResponse.f() + " sendTaskRecord:" + dVar);
            dVar.e.h();
            return;
        }
        if (9 == setupResponse.c() || 3 == setupResponse.c() || 8 == setupResponse.c() || 11 == setupResponse.c() || 14 == setupResponse.c()) {
            com.heytap.accessory.base.logging.a.a(s, "handleSetupResponse: Setup rejected: Error code " + setupResponse.d());
            if (e.a(getApplicationContext()).e(dVar.d.a())) {
                a((CtrlResponse) setupResponse);
            } else {
                a(dVar.d, setupResponse);
            }
        }
    }

    @Override // com.heytap.accessory.file.sender.b
    @WorkerThread
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
                            com.heytap.accessory.base.logging.a.a(s, "[SFTrack] busy is null continue:-1");
                        } else if (!bool.booleanValue()) {
                            concurrentHashMap.put(Integer.valueOf(iIntValue), Boolean.TRUE);
                            e(j, iIntValue);
                            this.o = (length + 1) % this.p.length;
                            i = iIntValue;
                            break;
                        }
                        i2++;
                    }
                    com.heytap.accessory.base.logging.a.a(s, "[SFTrack] choose ch id " + i);
                    return i;
                }
                com.heytap.accessory.base.logging.a.a(s, "[SFTrack] mSortedChannelArray is empty choose ch id -1");
                return -1;
            }
            com.heytap.accessory.base.logging.a.a(s, "[SFTrack] stateMap is empty choose ch id -1");
            return -1;
        }
    }

    public final void a(int i, long j) {
        SetupRequest setupRequest;
        d dVar = this.k.get(Integer.valueOf(i));
        if (dVar == null || (setupRequest = dVar.d) == null) {
            return;
        }
        this.d.a(setupRequest, j);
    }

    public final void a(int i) {
        d dVarRemove = this.k.remove(Integer.valueOf(i));
        if (dVarRemove == null) {
            com.heytap.accessory.base.logging.a.e(s, "task is null " + i);
            return;
        }
        if (this.f.isHeld() && this.k.isEmpty()) {
            this.f.release();
        }
        com.heytap.accessory.file.sender.a aVar = dVarRemove.e;
        if (aVar != null) {
            aVar.b();
            dVarRemove.e = null;
        }
        com.heytap.accessory.file.b bVar = this.i.get(Long.valueOf(dVarRemove.a));
        if (bVar != null) {
            bVar.a(i);
        }
        dVarRemove.b.a(1);
        SetupRequest setupRequest = dVarRemove.d;
        if (setupRequest == null) {
            com.heytap.accessory.base.logging.a.e(s, "handleTransferComplete: mCurrentRequest is null");
            return;
        }
        c(dVarRemove.a, setupRequest.b());
        com.heytap.accessory.transport.control.c.b(dVarRemove.a, dVarRemove.d.b(), 0);
        if (e.a(getApplicationContext()).e(dVarRemove.d.a())) {
            com.heytap.accessory.base.logging.a.d(s, "handleTransferComplete: Closing connection");
            CtrlResponse ctrlResponse = new CtrlResponse("filetransfer-complete-rsp", dVarRemove.d.l(), com.heytap.accessory.file.model.c.a, -1, dVarRemove.d.g());
            this.d.a(dVarRemove.d);
            a(ctrlResponse);
            return;
        }
        com.heytap.accessory.base.logging.a.c(s, "handleTransferComplete: Requests in Queue, Completed :" + dVarRemove.d.g());
        this.d.a(dVarRemove.d);
        this.d.a(dVarRemove.d.l());
    }

    public final long b(long j, int i) {
        ConcurrentHashMap<Integer, Long> concurrentHashMap;
        Long l;
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Long>> concurrentHashMap2 = this.n;
        if (concurrentHashMap2 == null || (concurrentHashMap = concurrentHashMap2.get(Long.valueOf(j))) == null || (l = concurrentHashMap.get(Integer.valueOf(i))) == null) {
            return 0L;
        }
        com.heytap.accessory.base.logging.a.a(s, "[SFTrack] getChannelRecycleTime, accId:" + j + ", channelId:" + i + ", time:" + l);
        return l.longValue();
    }

    public final void b() {
        this.a = new a();
        this.b = new b();
    }

    public void a(PeerAgent peerAgent, int i) {
        if (peerAgent == null) {
            com.heytap.accessory.base.logging.a.e(s, "peerAgent is null");
        } else {
            super.requestServiceConnection(peerAgent);
        }
    }

    public void a(BaseSocket baseSocket, int i) {
        String str = s;
        com.heytap.accessory.base.logging.a.c(str, "handleServiceConnectionResponse result = " + i);
        if (baseSocket == null) {
            com.heytap.accessory.base.logging.a.e(str, "connHelper is null, so clean up the transfer queue");
            return;
        }
        long accessoryId = baseSocket.getConnectedPeerAgent().getAccessoryId();
        if (i == 0) {
            com.heytap.accessory.base.logging.a.c(str, "[SFTrack] Service Connection Success " + accessoryId);
            this.g.put(Long.valueOf(accessoryId), (FTProviderConnection) baseSocket);
            a(accessoryId, baseSocket);
            this.h.put(Long.valueOf(accessoryId), 2);
            a(accessoryId, baseSocket.getConnectedPeerAgent().getProfileVersion());
            com.heytap.accessory.file.d dVar = this.d;
            if (dVar != null) {
                dVar.a(-1);
            }
        }
    }

    public final void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        if (setupRequest != null && ctrlResponse != null) {
            long jA = setupRequest.a();
            int iL = setupRequest.l();
            int iB = setupRequest.b();
            d(jA, iB);
            c(jA, iB);
            com.heytap.accessory.transport.control.c.b(jA, iB, 0);
            FTProviderConnection fTProviderConnection = this.g.get(Long.valueOf(jA));
            if (fTProviderConnection != null) {
                fTProviderConnection.cleanupChannel(fTProviderConnection.getConnectionId(), iB);
            }
            com.heytap.accessory.file.d dVar = this.d;
            if (dVar != null) {
                dVar.a(setupRequest, ctrlResponse);
            }
            com.heytap.accessory.file.b bVar = this.i.get(Long.valueOf(jA));
            if (bVar != null) {
                bVar.a(iL);
            }
            this.k.remove(Integer.valueOf(iL));
            return;
        }
        com.heytap.accessory.base.logging.a.b(s, new IllegalArgumentException("notifyError failed, setupRequest or ctrlResponse is null"));
    }

    public final List<Integer> a(BaseSocket baseSocket) {
        ArrayList arrayList = new ArrayList();
        int serviceChannelSize = baseSocket.getServiceChannelSize();
        for (int i = 0; i < serviceChannelSize; i++) {
            int serviceChannelId = baseSocket.getServiceChannelId(i);
            if (serviceChannelId != 100) {
                arrayList.add(Integer.valueOf(serviceChannelId));
            }
        }
        return arrayList;
    }

    public final void a(long j, BaseSocket baseSocket) {
        synchronized (this.q) {
            if (this.m.containsKey(Long.valueOf(j))) {
                com.heytap.accessory.base.logging.a.e(s, "[SFTrack] channel init failed, already inited");
                return;
            }
            List<Integer> listA = a(baseSocket);
            com.heytap.accessory.base.logging.a.e(s, "[SFTrack] initChannelState, " + listA);
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
