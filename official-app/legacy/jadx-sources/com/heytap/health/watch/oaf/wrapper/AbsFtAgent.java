package com.heytap.health.watch.oaf.wrapper;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import androidx.core.util.Consumer;
import androidx.core.util.Function;
import androidx.core.util.Supplier;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.file.FTInitializer;
import com.heytap.accessory.file.FileTransfer;
import com.heytap.accessory.file.model.FileDescription;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.e07;
import com.oplus.aiunit.vision.f07;
import com.oplus.aiunit.vision.fq9;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.r6b;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.zq8;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AbsFtAgent extends BaseJobAgent {
    public static final String KEY_CONNECTION_ID = "connectionId";
    public static final String KEY_FILE_TRANSFER_AGENT = "FileTransferAgent";
    public static final String KEY_MAC = "mac";
    public static final String KEY_TRANSACTION_ID = "transactionId";
    public static b fileTransferListen;
    public static md1<AbsFtAgent, FileTransferTask, Boolean> p2pInterceptor;
    public final ExecutorService A;
    public FileTransfer B;
    public CountDownLatch C;
    public String D;
    public fq9 E;
    public boolean F;
    public int G;
    public final Map<e07, f07> H;
    public Consumer<BaseSocket> I;
    public final FileTransfer.EventListener J;
    public final String t;
    public final String u;
    public final Context v;
    public final Map<String, ServiceConnection> w;
    public final Set<String> x;
    public final Map<String, List<PeerAgent>> y;
    public final Map<Integer, PeerAgent> z;
    public static Function<String, String> macTransform = new Function() { // from class: com.oplus.aiunit.vision.y3
        @Override // androidx.core.util.Function
        public final Object apply(Object obj) {
            return AbsFtAgent.F((String) obj);
        }
    };
    public static Supplier<String> activeNodeId = new Supplier() { // from class: com.oplus.aiunit.vision.z3
        @Override // androidx.core.util.Supplier
        public final Object get() {
            return AbsFtAgent.G();
        }
    };

    public class ServiceConnection extends BaseSocket {
        public ServiceConnection() {
            super(ServiceConnection.class.getName());
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onError(int i, String str, int i2) {
            wil.b(AbsFtAgent.this.t, "Connection is not alive ERROR: " + str + "  " + i2);
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onReceive(long j2, int i, byte[] bArr) {
            wil.d(AbsFtAgent.this.t, "onReceive: channelId" + i + "data: " + new String(bArr, StandardCharsets.UTF_8));
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onServiceConnectionLost(long j2, int i) {
            ServiceConnection serviceConnection;
            wil.b(AbsFtAgent.this.t, "onServiceConnectionLost: reason=" + i);
            String strValueOf = String.valueOf(j2);
            synchronized (AbsFtAgent.this.w) {
                serviceConnection = (ServiceConnection) AbsFtAgent.this.w.remove(strValueOf);
                AbsFtAgent.this.x.remove(strValueOf);
            }
            if (serviceConnection == null) {
                wil.b(AbsFtAgent.this.t, "onServiceConnectionLost: not find accessory " + j2);
                return;
            }
            PeerAgent connectedPeerAgent = serviceConnection.getConnectedPeerAgent();
            if (connectedPeerAgent == null) {
                wil.b(AbsFtAgent.this.t, "onServiceConnectionLost: peerAgent is null");
                return;
            }
            PeerAccessory accessory = connectedPeerAgent.getAccessory();
            if (accessory == null) {
                wil.b(AbsFtAgent.this.t, "onServiceConnectionLost: accessory is null");
                return;
            }
            AbsFtAgent.this.y.remove(accessory.getAddress());
            wil.d(AbsFtAgent.this.t, "onServiceConnectionLost: remove connection " + j2);
        }
    }

    public class a implements FileTransfer.EventListener {
        public a() {
        }

        @Override // com.heytap.accessory.file.FileTransfer.EventListener
        public void onCancelAllCompleted(int i, int i2) {
            wil.d(AbsFtAgent.this.t, "onCancelAllCompleted: transactionId = " + i + ", errorCode = " + i2);
            if (AbsFtAgent.this.E != null) {
                AbsFtAgent.this.E.c(i, i2);
            }
            AbsFtAgent.this.z.remove(Integer.valueOf(i));
        }

        @Override // com.heytap.accessory.file.FileTransfer.EventListener
        public void onProgressChanged(long j2, int i, int i2) {
            wil.d(AbsFtAgent.this.t, "onProgressChanged: connectionId = " + j2 + ", transactionId = " + i + ", progress = " + i2);
            PeerAgent peerAgent = (PeerAgent) AbsFtAgent.this.z.get(Integer.valueOf(i));
            if (peerAgent == null) {
                wil.b(AbsFtAgent.this.t, "onProgressChanged: peerAgent is null");
                return;
            }
            PeerAccessory accessory = peerAgent.getAccessory();
            if (accessory == null) {
                wil.b(AbsFtAgent.this.t, "onProgressChanged: accessory is null");
                return;
            }
            String address = accessory.getAddress();
            if (address == null) {
                wil.b(AbsFtAgent.this.t, "onProgressChanged: not find mac");
            } else if (AbsFtAgent.this.E != null) {
                AbsFtAgent.this.E.d(address, i, i2);
            }
        }

        @Override // com.heytap.accessory.file.FileTransfer.EventListener
        public void onTransferCompleted(long j2, int i, String str, long j3, int i2) {
            wil.d(AbsFtAgent.this.t, "[Health-999] onTransferCompleted: transactionId = " + i + ", fileName = " + str + ", fileSize = " + j3 + ", errorCode = " + i2);
            if (AbsFtAgent.fileTransferListen != null && AbsFtAgent.this.A(j2)) {
                AbsFtAgent.fileTransferListen.b(AbsFtAgent.this, i, i2);
            }
            PeerAgent peerAgent = (PeerAgent) AbsFtAgent.this.z.get(Integer.valueOf(i));
            if (peerAgent == null) {
                wil.b(AbsFtAgent.this.t, "onTransferCompleted: peerAgent is null");
                return;
            }
            PeerAccessory accessory = peerAgent.getAccessory();
            if (accessory == null) {
                wil.b(AbsFtAgent.this.t, "onTransferCompleted: accessory is null");
                return;
            }
            String address = accessory.getAddress();
            if (address == null) {
                wil.b(AbsFtAgent.this.t, "onTransferCompleted: not find mac");
                return;
            }
            if (AbsFtAgent.this.E != null) {
                AbsFtAgent.this.E.b(address, j3, i, i2);
            }
            AbsFtAgent.this.z.remove(Integer.valueOf(i));
        }

        @Override // com.heytap.accessory.file.FileTransfer.EventListener
        public void onTransferRequested(long j2, int i, int i2, FileDescription fileDescription) {
            String customFileInfo = fileDescription.getCustomFileInfo();
            String fileName = fileDescription.getFileName();
            long fileSize = fileDescription.getFileSize();
            wil.d(AbsFtAgent.this.t, "[Health-999] onTransferRequested: peerAgentId = " + i + ", transactionId = " + i2 + ", fileInfo = " + customFileInfo + ", fileName = " + fileName + " fileSize=" + fileSize);
            if (AbsFtAgent.fileTransferListen != null && AbsFtAgent.this.A(j2)) {
                AbsFtAgent.fileTransferListen.a(AbsFtAgent.this, i2, fileDescription.getFileSize());
            }
            Iterator it = AbsFtAgent.this.y.values().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    peerAgent = null;
                    break;
                }
                for (PeerAgent peerAgent : (List) it.next()) {
                    if (TextUtils.equals(peerAgent.getAgentId(), String.valueOf(i))) {
                        break loop0;
                    }
                }
            }
            if (peerAgent == null) {
                wil.b(AbsFtAgent.this.t, "onTransferCompleted: peerAgent is null");
                return;
            }
            PeerAccessory accessory = peerAgent.getAccessory();
            if (accessory == null) {
                wil.b(AbsFtAgent.this.t, "onTransferCompleted: accessory is null");
                return;
            }
            String address = accessory.getAddress();
            if (address == null) {
                wil.b(AbsFtAgent.this.t, "onProgressChanged: not find mac");
                return;
            }
            AbsFtAgent.this.z.put(Integer.valueOf(i2), peerAgent);
            FileTransferTask fileTransferTask = new FileTransferTask();
            fileTransferTask.setReceiveTask(true);
            fileTransferTask.setFileName(fileName);
            fileTransferTask.setFileSize(fileSize);
            fileTransferTask.setNodeId(address);
            fileTransferTask.getExtra().put("connectionId", Long.valueOf(j2));
            fileTransferTask.getExtra().put(AbsFtAgent.KEY_FILE_TRANSFER_AGENT, AbsFtAgent.this);
            fileTransferTask.getExtra().put("transactionId", Integer.valueOf(i2));
            fileTransferTask.getExtra().put("mac", address);
            String name = AbsFtAgent.this.getClass().getName();
            f07 f07VarU = AbsFtAgent.this.u();
            if (!TextUtils.isEmpty(customFileInfo) || f07VarU == null) {
                f07VarU = null;
            }
            if (f07VarU == null) {
                f07VarU = AbsFtAgent.this.H.get(e07.a(name, AbsFtAgent.this.v(), customFileInfo));
                if (f07VarU == null) {
                    f07VarU = AbsFtAgent.this.H.get(e07.a(name, AbsFtAgent.this.v(), null));
                }
            }
            if (f07VarU != null) {
                String strB = f07VarU.b(customFileInfo);
                int i3 = f07VarU.a;
                if (AbsFtAgent.this.E != null) {
                    AbsFtAgent.this.E.e(AbsFtAgent.this, address, i2, i3, strB, fileTransferTask);
                    return;
                }
                return;
            }
            wil.b(AbsFtAgent.this.t, "onTransferRequested: no route , agentName=" + name + " remoteUri=" + customFileInfo + " mRoutes=" + AbsFtAgent.this.H);
        }
    }

    public interface b {
        void a(AbsFtAgent absFtAgent, long j2, long j3);

        void b(AbsFtAgent absFtAgent, int i, int i2);
    }

    public AbsFtAgent(String str, Context context) {
        super(str, context, ServiceConnection.class);
        this.w = new HashMap();
        this.x = ConcurrentHashMap.newKeySet();
        this.y = new ConcurrentHashMap();
        this.z = new ConcurrentHashMap();
        this.F = false;
        this.H = new HashMap();
        this.J = new a();
        this.t = str;
        this.v = context;
        this.A = zq8.e(str);
        this.u = context.getPackageName() + ".fileprovider";
        w();
    }

    public static /* synthetic */ int B(PeerAgent peerAgent) {
        return peerAgent.getAccessory().getTransportType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(String str) {
        wil.d(this.t, "requestLongConnection: ");
        this.F = true;
        q(str);
    }

    public static /* synthetic */ List D(String str) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer E(String str, String str2, String str3, FileTransferTask fileTransferTask, Uri uri) throws Exception {
        return Integer.valueOf(N(macTransform.apply(str), str2, str3, fileTransferTask, uri));
    }

    public static /* synthetic */ String F(String str) {
        return str;
    }

    public static /* synthetic */ String G() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        wil.d(this.t, "stopLongConnection: ");
        this.F = false;
    }

    public boolean A(long j2) {
        return this.x.contains(String.valueOf(j2)) || j2 == 0;
    }

    public boolean I(long j2, int i, String str) {
        wil.a(this.t, "receiving file : transactionId: " + i + " filePath:" + str);
        if (this.B == null || TextUtils.isEmpty(str)) {
            wil.b(this.t, "receiveFile: mFileTransfer is null");
            return false;
        }
        this.B.receive(j2, i, str.startsWith(NotificationApiService.CONTENT) ? Uri.parse(str) : FileProvider.getUriForFile(this.v, this.u, new File(str)));
        return true;
    }

    public void J(long j2, int i) {
        wil.a(this.t, "reject file : transactionId: " + i);
        FileTransfer fileTransfer = this.B;
        if (fileTransfer != null) {
            fileTransfer.reject(j2, i);
        } else {
            wil.b(this.t, "reject: mFileTransfer is null");
        }
    }

    public void K(final String str) {
        this.A.submit(new Runnable() { // from class: com.oplus.aiunit.vision.c4
            @Override // java.lang.Runnable
            public final void run() {
                this.i.C(str);
            }
        });
    }

    public final boolean L(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        if (peerAgent == null) {
            wil.b(this.t, "onSvrConnRes: agent is null");
            return false;
        }
        PeerAccessory accessory = peerAgent.getAccessory();
        if (accessory == null) {
            wil.k(this.t, "onSvrConnRes: agent accessory is null");
            return false;
        }
        String address = accessory.getAddress();
        if (baseSocket == null) {
            wil.b(this.t, "onSvrConnRes: socket is null");
            return TextUtils.equals(this.D, address);
        }
        String connectionId = baseSocket.getConnectionId();
        wil.d(this.t, "onSvrConnRes: mac=" + gdb.a(address) + " connectionId=" + connectionId);
        if (i == 0) {
            wil.d(this.t, "saveConnection: find success");
        } else if (i == 10005) {
            Q(this.t + " CONNECTION_ALREADY_EXIST ");
        } else if (i == 10009) {
            Q(this.t + " CONNECTION_DUPLICATE_REQUEST");
        } else {
            Q("failed " + i);
        }
        List<PeerAgent> listComputeIfAbsent = this.y.computeIfAbsent(address, new java.util.function.Function() { // from class: com.oplus.aiunit.vision.a4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbsFtAgent.D((String) obj);
            }
        });
        wil.d(this.t, "onSvrConnRes: add mac=" + gdb.a(address) + " agent=" + peerAgent);
        listComputeIfAbsent.add(peerAgent);
        synchronized (this.w) {
            if (!this.w.containsKey(connectionId)) {
                wil.d(this.t, "saveConnection: add connection " + connectionId);
                this.w.put(connectionId, (ServiceConnection) baseSocket);
                if (accessory.getTransportType() == 1) {
                    this.x.add(connectionId);
                    wil.d(this.t, "saveConnection: mark wifi connectionId=" + connectionId);
                }
            }
        }
        return TextUtils.equals(this.D, address);
    }

    public int M(final String str, final String str2, final String str3, final FileTransferTask fileTransferTask, final Uri uri) {
        try {
            return ((Integer) this.A.submit(new Callable() { // from class: com.oplus.aiunit.vision.b4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.i.E(str, str2, str3, fileTransferTask, uri);
                }
            }).get(40L, TimeUnit.SECONDS)).intValue();
        } catch (Exception e2) {
            wil.b(this.t, "sendFile: exception " + e2);
            return -1;
        }
    }

    public final int N(String str, String str2, String str3, FileTransferTask fileTransferTask, Uri uri) throws Throwable {
        List<PeerAgent> list;
        boolean z;
        Uri uriForFile;
        wil.d(this.t, "sendFile: macAddress = " + gdb.a(str) + ", filePath = " + str2 + ", taskInfo = " + fileTransferTask);
        List<PeerAgent> arrayList = new ArrayList<>();
        Boolean boolApply = Boolean.FALSE;
        if (S()) {
            t(arrayList);
            if (arrayList.isEmpty()) {
                try {
                    boolApply = p2pInterceptor.apply(this, fileTransferTask);
                } catch (Throwable unused) {
                }
                t(arrayList);
            }
        }
        wil.d(this.t, "WIFIP2P.sendFile => byP2p:" + boolApply);
        if (arrayList.isEmpty()) {
            arrayList = this.y.get(str);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            wil.d(this.t, "sendFile Peer could not found. Try again.");
            int i = 0;
            do {
                int iQ = q(str);
                list = this.y.get(str);
                i++;
                z = (iQ == 0 || iQ == 10001 || iQ == 10002 || i > 2) ? false : true;
                wil.d(this.t, "sendFileSync: uri=" + str3 + " exeCount=" + i + " needRetry=" + z + " findPeerErrorCode=" + iQ);
                if (z) {
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException unused2) {
                    }
                }
            } while (z);
            arrayList = list;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Q("sendFile Peer could not found. returned.");
            findPeerAgents();
            return -1;
        }
        if (arrayList.size() > 1) {
            wil.b(this.t, "sendFile: peer has more than one agent!!!");
        }
        PeerAgent peerAgent = arrayList.get(0);
        wil.a(this.t, "sendFile start send olinKUri=" + str3 + " filePath=" + str2);
        if (uri == null) {
            try {
                wil.a(this.t, "sendFile: sendFileAndroidUri is null");
                uriForFile = FileProvider.getUriForFile(this.v, this.u, new File(str2));
            } catch (Exception e2) {
                Q("send exception");
                wil.d(this.t, "sendFile: send exception " + e2.getMessage());
                return -1;
            }
        } else {
            uriForFile = uri;
        }
        PeerAccessory accessory = peerAgent.getAccessory();
        int iSend = this.B.send(peerAgent, uriForFile, str3);
        wil.d(this.t, "[Health-999] sendFile transportType:" + accessory.getTransportType() + ", transactionId = " + iSend + ", fileName = " + fileTransferTask.getFileName() + " fileSize=" + fileTransferTask.getFileSize());
        if (fileTransferListen != null && accessory.getTransportType() == 1) {
            fileTransferListen.a(this, iSend, fileTransferTask.getFileSize());
        }
        this.z.put(Integer.valueOf(iSend), peerAgent);
        wil.a(this.t, "sendFile end send " + str3);
        wil.d(this.t, "sendFile: txId=" + iSend + " filePath=" + str2);
        return iSend;
    }

    public void O(fq9 fq9Var) {
        this.E = fq9Var;
    }

    public void P(Consumer<BaseSocket> consumer) {
        this.I = consumer;
    }

    public void Q(String str) {
        r6b.d(this.v, this.t, str);
    }

    public void R(String str) {
        this.A.submit(new Runnable() { // from class: com.oplus.aiunit.vision.d4
            @Override // java.lang.Runnable
            public final void run() {
                this.i.H();
            }
        });
    }

    public abstract boolean S();

    @Override // com.heytap.accessory.BaseJobAgent
    public void onError(PeerAgent peerAgent, String str, int i) {
        super.onError(peerAgent, str, i);
        wil.b(this.t, "onError: errorCode=" + i + " errorMessage=" + str + " peerAgent=" + peerAgent);
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
        CountDownLatch countDownLatch;
        boolean zH;
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (peerAgentArr == null || peerAgentArr.length == 0) {
            wil.a(this.t, "onFindPeerAgentsResponse: result=" + i + " peerAgents=null");
        } else {
            if (peerAgentArr.length > 1) {
                Arrays.sort(peerAgentArr, Comparator.comparingInt(new ToIntFunction() { // from class: com.oplus.aiunit.vision.x3
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return AbsFtAgent.B((PeerAgent) obj);
                    }
                }));
            }
            for (int i2 = 0; i2 < peerAgentArr.length; i2++) {
                wil.a(this.t, "onFindPeerAgentsResponse: result=" + i + " peerAgents@" + i2 + HttpUtils.EQUAL_SIGN + peerAgentArr[i2]);
            }
        }
        if (i != 0 || peerAgentArr == null) {
            Consumer<BaseSocket> consumer = this.I;
            if (consumer != null) {
                consumer.accept(null);
            }
            if (i == 10001) {
                Q(this.t + " device not connected");
            }
        } else {
            int length = peerAgentArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    PeerAgent peerAgent = peerAgentArr[i3];
                    PeerAccessory accessory = peerAgent.getAccessory();
                    if (accessory != null && accessory.supportFile()) {
                        String address = accessory.getAddress();
                        try {
                            zH = com.heytap.health.adaptersdk.a.f().h(address);
                        } catch (RemoteException e2) {
                            wil.k(this.t, "onFindPeerAgentsResponse: isOafConnect e=" + e2);
                            zH = false;
                        }
                        if (zH) {
                            List<PeerAgent> list = this.y.get(address);
                            if (list == null) {
                                z = false;
                                break;
                            }
                            Iterator<PeerAgent> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.equals(it.next().getAgentId(), peerAgent.getAgentId())) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (!z) {
                                wil.k(this.t, "onFindPeerAgentsResponse: next to connect " + accessory);
                                requestServiceConnection(peerAgent);
                                break;
                            }
                            wil.k(this.t, "onFindPeerAgentsResponse: already connected " + accessory);
                        } else {
                            wil.k(this.t, "onFindPeerAgentsResponse: not self device " + accessory);
                        }
                    } else {
                        wil.k(this.t, "onFindPeerAgentsResponse: not support file " + accessory);
                    }
                    i3++;
                }
                z2 = false;
                break;
            }
            z3 = z2;
        }
        this.G = i;
        if (z3 || (countDownLatch = this.C) == null) {
            return;
        }
        countDownLatch.countDown();
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onPeerAgentsUpdated(PeerAgent[] peerAgentArr, int i) {
        PeerAccessory accessory;
        super.onPeerAgentsUpdated(peerAgentArr, i);
        if (this.E == null || peerAgentArr == null || peerAgentArr.length <= 0 || (accessory = peerAgentArr[0].getAccessory()) == null) {
            return;
        }
        this.E.a(accessory.getAddress());
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onServiceConnectionRequested(PeerAgent peerAgent) {
        PeerAccessory accessory;
        boolean zH;
        wil.d(this.t, "onServiceConnectionRequested: " + peerAgent);
        if (peerAgent == null || (accessory = peerAgent.getAccessory()) == null) {
            return;
        }
        try {
            zH = com.heytap.health.adaptersdk.a.f().h(accessory.getAddress());
        } catch (RemoteException e2) {
            wil.k(this.t, "onServiceConnectionRequested: isOafConnect e=" + e2);
            zH = false;
        }
        if (zH) {
            acceptServiceConnectionRequest(peerAgent);
            return;
        }
        wil.k(this.t, "onServiceConnectionRequested: not self device " + accessory);
        rejectServiceConnectionRequest(peerAgent);
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) throws Throwable {
        boolean zL;
        wil.d(this.t, "onSvrConnRes: result=" + i + " peerAgent=" + peerAgent + " socket=" + baseSocket);
        try {
            zL = L(peerAgent, baseSocket, i);
            try {
                Consumer<BaseSocket> consumer = this.I;
                if (consumer != null) {
                    consumer.accept(baseSocket);
                }
                if (!zL) {
                    wil.d(this.t, "onSvrConnRes: not self find");
                    return;
                }
                this.G = i;
                CountDownLatch countDownLatch = this.C;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } catch (Throwable th) {
                th = th;
                if (zL) {
                    this.G = i;
                    CountDownLatch countDownLatch2 = this.C;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                } else {
                    wil.d(this.t, "onSvrConnRes: not self find");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zL = false;
        }
    }

    public final synchronized int q(String str) {
        String str2;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                wil.d(this.t, "blockFindPeerAgents: start=" + jCurrentTimeMillis);
                this.C = new CountDownLatch(1);
                this.D = str;
                findPeerAgents();
                try {
                    this.C.await(20L, TimeUnit.SECONDS);
                } catch (InterruptedException e2) {
                    wil.d(this.t, "blockFindPeerAgents: error:" + e2);
                }
                this.C = null;
                str2 = this.t;
                str3 = "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - jCurrentTimeMillis);
            } catch (Exception e3) {
                wil.b(this.t, "blockFindPeerAgents: error " + e3);
                str2 = this.t;
                str3 = "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - jCurrentTimeMillis);
            }
            wil.d(str2, str3);
        } catch (Throwable th) {
            wil.d(this.t, "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            throw th;
        }
        return this.G;
    }

    public void r(long j2, int i) {
        wil.d(this.t, "cancel file : transactionId: " + i);
        if (this.B == null) {
            wil.b(this.t, "cancel: mFileTransfer is null");
        } else {
            wil.d(this.t, "cancelFile: called");
            this.B.cancel(j2, i);
        }
    }

    public void s(String str) {
        this.D = str;
        findPeerAgents();
    }

    public final void t(List<PeerAgent> list) {
        Iterator<List<PeerAgent>> it = this.y.values().iterator();
        while (it.hasNext()) {
            for (PeerAgent peerAgent : it.next()) {
                if (peerAgent.getAccessory().getTransportType() == 1) {
                    list.add(peerAgent);
                    wil.d(this.t, "WIFIP2P.sendFile => find wifi agent " + peerAgent);
                }
            }
        }
    }

    public abstract f07 u();

    public abstract String v();

    public void w() {
        wil.d(this.t, "init: ");
        y(this.v);
        FileTransfer fileTransferX = x(this);
        this.B = fileTransferX;
        if (fileTransferX == null) {
            wil.b(this.t, "onCreate: init oaf file failed ");
        }
    }

    public FileTransfer x(BaseJobAgent baseJobAgent) {
        try {
            return new FileTransfer(baseJobAgent, this.J);
        } catch (SdkUnsupportedException e2) {
            if (e2.getType() == 1) {
                wil.b(this.t, "initFileTransfer: Cannot initialize, DEVICE_NOT_SUPPORTED");
                return null;
            }
            if (e2.getType() == 2) {
                wil.b(this.t, "initFileTransfer: Cannot initialize, LIBRARY_NOT_INSTALLED.");
                return null;
            }
            wil.b(this.t, "initFileTransfer: Cannot initialize, UNKNOWN." + e2.getMessage());
            return null;
        } catch (Exception e3) {
            wil.b(this.t, "initFileTransfer: unknown exception " + e3.getMessage());
            return null;
        }
    }

    public void y(Context context) {
        try {
            FTInitializer.init(context);
        } catch (SdkUnsupportedException e2) {
            if (e2.getType() == 1) {
                wil.b(this.t, "initOafFileApis: Cannot initialize, DEVICE_NOT_SUPPORTED");
                return;
            }
            if (e2.getType() == 2) {
                wil.b(this.t, "initOafFileApis: Cannot initialize, LIBRARY_NOT_INSTALLED.");
                return;
            }
            wil.b(this.t, "initOafFileApis: Cannot initialize, UNKNOWN." + e2.getMessage());
        } catch (Exception e3) {
            wil.b(this.t, "initOafFileApis: unknown exception " + e3.getMessage());
        }
    }

    public boolean z() {
        Iterator<List<PeerAgent>> it = this.y.values().iterator();
        while (it.hasNext()) {
            for (PeerAgent peerAgent : it.next()) {
                wil.b(this.t, "isP2PConnected -> transportType:" + peerAgent.getAccessory().getTransportType() + " address:" + gdb.a(peerAgent.getAccessory().getAddress()));
                if (peerAgent.getAccessory().getTransportType() == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
