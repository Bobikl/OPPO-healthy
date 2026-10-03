package com.heytap.health.watch.oaf.wrapper;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.util.Function;
import androidx.core.util.Supplier;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.health.adaptersdk.IResult;
import com.heytap.health.adaptersdk.a;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.lw9;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import com.oplus.aiunit.vision.r6b;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.xs9;
import com.oplus.aiunit.vision.zq8;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AbsMsgAgent extends BaseJobAgent {
    public CountDownLatch A;
    public String B;
    public String C;
    public int D;
    public boolean E;
    public int F;
    public final String t;
    public final Map<String, Set<ServiceConnection>> u;
    public final Map<ot9, qt9> v;
    public final Context w;
    public final ExecutorService x;
    public final ExecutorService y;
    public xs9 z;
    public static final AtomicInteger G = new AtomicInteger(0);
    public static Function<String, String> macTransform = new Function() { // from class: com.oplus.aiunit.vision.j4
        @Override // androidx.core.util.Function
        public final Object apply(Object obj) {
            return AbsMsgAgent.u((String) obj);
        }
    };
    public static Supplier<String> activeNodeId = new Supplier() { // from class: com.oplus.aiunit.vision.k4
        @Override // androidx.core.util.Supplier
        public final Object get() {
            return AbsMsgAgent.v();
        }
    };

    public class ServiceConnection extends BaseSocket {
        public ServiceConnection() {
            super(ServiceConnection.class.getName());
        }

        public static /* synthetic */ boolean b(long j2, ServiceConnection serviceConnection) {
            return TextUtils.equals(serviceConnection.getConnectionId(), String.valueOf(j2));
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onError(int i, String str, int i2) {
            wil.d(AbsMsgAgent.this.t, "onError: channelId=" + i + ", errMsg=" + str + ", errCode=" + i2);
            onServiceConnectionLost((long) i, i2);
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onReceive(long j2, int i, byte[] bArr) {
            Set<ServiceConnection> set;
            int andIncrement = AbsMsgAgent.G.getAndIncrement();
            wil.i("OAF", "OAF R --> ", bArr);
            String strValueOf = String.valueOf(j2);
            String address = getConnectedPeerAgent().getAccessory().getAddress();
            synchronized (AbsMsgAgent.this.u) {
                set = (Set) AbsMsgAgent.this.u.get(address);
            }
            ServiceConnection serviceConnection = null;
            if (set != null) {
                synchronized (set) {
                    for (ServiceConnection serviceConnection2 : set) {
                        if (TextUtils.equals(serviceConnection2.getConnectionId(), strValueOf)) {
                            serviceConnection = serviceConnection2;
                        }
                    }
                }
            }
            if (bArr == null || bArr.length == 0) {
                wil.b(AbsMsgAgent.this.t, "onReceive: empty data rcvSeq=" + andIncrement + " conn=" + j2);
                return;
            }
            int i2 = bArr[0] & 255;
            int i3 = 1;
            if (i2 == 255) {
                if (bArr.length < 3) {
                    wil.b(AbsMsgAgent.this.t, "onReceive: invalid extended cid data len=" + bArr.length + " rcvSeq=" + andIncrement);
                    return;
                }
                i2 = (bArr[1] & 255) | ((255 & bArr[2]) << 8);
                i3 = 3;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, bArr.length);
            if (serviceConnection == null) {
                wil.b(AbsMsgAgent.this.t, "onReceive: not find connection for rcvSeq=" + andIncrement + " conn=" + j2);
                return;
            }
            String name = AbsMsgAgent.this.getClass().getName();
            qt9 qt9Var = AbsMsgAgent.this.v.get(ot9.a(name, AbsMsgAgent.this.o(), String.valueOf(i2), 0));
            if (qt9Var == null) {
                qt9Var = AbsMsgAgent.this.v.get(ot9.a(name, AbsMsgAgent.this.o(), "?", 0));
            }
            if (qt9Var == null) {
                wil.b(AbsMsgAgent.this.t, "onReceive: not find report route for rcvSeq=" + andIncrement + " " + name + "#" + i2);
                return;
            }
            int i4 = qt9Var.a;
            int iB = qt9Var.b(i2);
            if (AbsMsgAgent.this.z != null) {
                int transportType = serviceConnection.getConnectedPeerAgent().getAccessory().getTransportType();
                wil.d(AbsMsgAgent.this.t, "[Health-999] onReceive: cid=" + i2 + " transportType=" + transportType + " rcvSeq=" + andIncrement + " data size=" + bArr.length);
                AbsMsgAgent.this.z.b(AbsMsgAgent.activeNodeId.get(), transportType, i4, iB, andIncrement, bArrCopyOfRange);
            }
        }

        @Override // com.heytap.accessory.BaseSocket
        public void onServiceConnectionLost(final long j2, int i) {
            wil.d(AbsMsgAgent.this.t, "onServiceConnectionLost: for " + j2);
            synchronized (AbsMsgAgent.this.u) {
                if (!AbsMsgAgent.this.u.isEmpty()) {
                    Iterator it = AbsMsgAgent.this.u.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Set set = (Set) entry.getValue();
                        if (set != null && !set.isEmpty() && set.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.r4
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return AbsMsgAgent.ServiceConnection.b(j2, (AbsMsgAgent.ServiceConnection) obj);
                            }
                        })) {
                            wil.d(AbsMsgAgent.this.t, "onServiceConnectionLost: remove connection " + j2);
                            if (set.isEmpty()) {
                                it.remove();
                                wil.d(AbsMsgAgent.this.t, "onServiceConnectionLost: remove empty key " + ((String) entry.getKey()));
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public AbsMsgAgent(String str, Context context) {
        super(str, context, ServiceConnection.class);
        this.u = new HashMap();
        this.v = new HashMap();
        this.E = false;
        this.F = 2;
        this.t = str + "#" + Integer.toHexString(hashCode());
        this.w = context;
        this.y = zq8.e(str);
        this.x = zq8.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str) {
        wil.d(this.t, "requestLongConnection: ");
        this.E = true;
        m(2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str, MessageEvent messageEvent, int i, int i2, byte[] bArr, IResult iResult) {
        try {
            this.C = str;
            A(messageEvent, macTransform.apply(str), i, i2, bArr, false, iResult);
        } catch (Exception e2) {
            wil.c(this.t, "sendMessage: exception " + e2, e2);
            lw9.a(iResult, false, -1, "exception=" + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(String str, MessageEvent messageEvent, int i, int i2, byte[] bArr, IResult iResult) {
        try {
            this.C = str;
            A(messageEvent, macTransform.apply(str), i, i2, bArr, false, iResult);
        } catch (Exception e2) {
            wil.c(this.t, "sendMessage: exception " + e2, e2);
            lw9.a(iResult, false, -1, "exception=" + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(MessageEvent messageEvent, String str, int i, int i2, byte[] bArr, IResult iResult) {
        try {
            A(messageEvent, macTransform.apply(str), i, i2, bArr, true, iResult);
        } catch (Exception e2) {
            wil.b(this.t, "sendSecureMessage: exception " + e2);
            lw9.a(iResult, false, -1, "exception=" + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(MessageEvent messageEvent, String str, int i, int i2, byte[] bArr, IResult iResult) {
        try {
            A(messageEvent, macTransform.apply(str), i, i2, bArr, true, iResult);
        } catch (Exception e2) {
            wil.b(this.t, "sendSecureMessage: exception " + e2);
            lw9.a(iResult, false, -1, "exception=" + e2);
        }
    }

    public static /* synthetic */ String u(String str) {
        return str;
    }

    public static /* synthetic */ String v() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        wil.d(this.t, "stopLongConnection: ");
        this.E = false;
    }

    public final void A(MessageEvent messageEvent, String str, int i, int i2, byte[] bArr, boolean z, IResult iResult) {
        this.F = messageEvent.getTransport();
        Set<ServiceConnection> setN = n(messageEvent.getTransport(), str);
        int i3 = 2;
        if (setN.isEmpty()) {
            wil.k(this.t, "sendMessage: connection is invalid,try find peer transportType " + this.F + " seq=" + i2 + " mac=" + gdb.a(str));
            int i4 = 0;
            while (true) {
                int iM = m(messageEvent.getTransport(), str);
                i4++;
                boolean z2 = (iM == 0 || iM == 10001 || iM == 10002 || i4 > i3) ? false : true;
                wil.d(this.t, "sendMessageSync: seq=" + i2 + " exeCount=" + i4 + " needRetry=" + z2 + " findPeerErrorCode=" + iM);
                if (z2) {
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException unused) {
                    }
                }
                if (!z2) {
                    break;
                } else {
                    i3 = 2;
                }
            }
            setN = n(messageEvent.getTransport(), str);
        }
        if (setN.isEmpty()) {
            lw9.a(iResult, false, -1, "blockFindPeerAgents not find " + setN + " seq=" + i2);
            return;
        }
        boolean z3 = i >= 255;
        int i5 = z3 ? 3 : 1;
        int length = bArr != null ? bArr.length + i5 : i5;
        byte[] bArr2 = new byte[length];
        if (z3) {
            bArr2[0] = -1;
            bArr2[1] = (byte) (i & 255);
            bArr2[2] = (byte) (255 & (i >> 8));
        } else {
            bArr2[0] = (byte) i;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, i5, bArr.length);
        }
        int i6 = 0;
        int i7 = 0;
        for (ServiceConnection serviceConnection : setN) {
            wil.d(this.t, "sendMessage: seq=" + i2 + " " + i + " transportType=" + messageEvent.getTransport() + " len=" + length + " secure=" + z + " conn=" + serviceConnection.getConnectionId());
            try {
                wil.d(this.t, "[Health-999] send: cid=" + i + " rcvSeq=" + i2 + " data size=" + length);
                if (messageEvent.getEncryptOption() == 3) {
                    try {
                        wil.i("OAF", "u W --> ", bArr2);
                        serviceConnection.sendUncompressed(1, bArr2);
                    } catch (IOException e2) {
                        e = e2;
                        wil.c(this.t, "sendMessage: error ", e);
                        i7++;
                    }
                } else if (z) {
                    wil.i("OAF", "s W --> ", bArr2);
                    serviceConnection.secureSend(1, bArr2);
                } else {
                    wil.i("OAF", "W --> ", bArr2);
                    serviceConnection.send(1, bArr2);
                }
                i6++;
            } catch (IOException e3) {
                e = e3;
            }
        }
        String str2 = "success=" + i6 + " failed=" + i7 + " seq=" + i2;
        wil.d(this.t, "send cid=" + i + " " + str2);
        if (i6 != 0) {
            lw9.a(iResult, true, 0, str2);
        } else {
            lw9.a(iResult, false, -1, str2);
        }
    }

    public void B(final MessageEvent messageEvent, final String str, final int i, final int i2, final byte[] bArr, final IResult iResult) {
        if (messageEvent.getTransport() == 1) {
            this.x.submit(new Runnable() { // from class: com.oplus.aiunit.vision.p4
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.s(messageEvent, str, i, i2, bArr, iResult);
                }
            });
        } else {
            this.y.submit(new Runnable() { // from class: com.oplus.aiunit.vision.q4
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.t(messageEvent, str, i, i2, bArr, iResult);
                }
            });
        }
    }

    public void C(xs9 xs9Var) {
        this.z = xs9Var;
    }

    public final void D(String str) {
        r6b.d(this.w, this.t, str);
    }

    public void E(String str) {
        this.y.submit(new Runnable() { // from class: com.oplus.aiunit.vision.l4
            @Override // java.lang.Runnable
            public final void run() {
                this.i.w();
            }
        });
    }

    public final synchronized int m(int i, String str) {
        String str2;
        String str3;
        boolean z = true;
        Set set = null;
        try {
            try {
                try {
                    Set<ServiceConnection> setN = n(i, str);
                    if (!setN.isEmpty()) {
                        wil.d(this.t, "blockFindPeerAgents: connected");
                        if (setN.isEmpty()) {
                            z = false;
                        }
                        wil.d(this.t, "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - 0) + " success=" + z);
                        return 0;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    wil.d(this.t, "blockFindPeerAgents: start=" + jCurrentTimeMillis);
                    this.A = new CountDownLatch(1);
                    this.B = str;
                    findPeerAgents();
                    try {
                        this.A.await(10L, TimeUnit.SECONDS);
                    } catch (InterruptedException e2) {
                        wil.b(this.t, "blockFindPeerAgents: inter " + e2);
                    }
                    Set<ServiceConnection> setN2 = n(i, str);
                    if (setN2 == null || setN2.isEmpty()) {
                        z = false;
                    }
                    str2 = this.t;
                    str3 = "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " success=" + z;
                    wil.d(str2, str3);
                    return this.D;
                } catch (Exception e3) {
                    wil.b(this.t, "blockFindPeerAgents: error " + e3);
                    if (0 == 0 || set.isEmpty()) {
                        z = false;
                    }
                    str2 = this.t;
                    str3 = "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - 0) + " success=" + z;
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (Throwable th2) {
            if (0 == 0 || set.isEmpty()) {
                z = false;
            }
            wil.d(this.t, "blockFindPeerAgents: delay=" + (System.currentTimeMillis() - 0) + " success=" + z);
            throw th2;
        }
    }

    public final Set<ServiceConnection> n(int i, String str) {
        synchronized (this.u) {
            Set<ServiceConnection> linkedHashSet = new LinkedHashSet<>();
            if (this.u.isEmpty()) {
                return linkedHashSet;
            }
            if (i == 2) {
                linkedHashSet = this.u.get(str);
            } else {
                Set<Map.Entry<String, Set<ServiceConnection>>> setEntrySet = this.u.entrySet();
                if (!setEntrySet.isEmpty()) {
                    for (Map.Entry<String, Set<ServiceConnection>> entry : setEntrySet) {
                        if (!BluetoothAdapter.checkBluetoothAddress(entry.getKey())) {
                            Set<ServiceConnection> value = entry.getValue();
                            wil.k(this.t, "getConnection: find wifi connection " + entry.getKey() + " size:" + value.size());
                            if (!value.isEmpty()) {
                                linkedHashSet = value;
                            }
                        }
                    }
                }
            }
            if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
                Iterator<ServiceConnection> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ServiceConnection next = it.next();
                    if (!next.isConnected()) {
                        wil.k(this.t, "getConnection: not connected " + next);
                        it.remove();
                    }
                }
                return linkedHashSet;
            }
            return new LinkedHashSet();
        }
    }

    public abstract String o();

    @Override // com.heytap.accessory.BaseJobAgent
    public void onError(PeerAgent peerAgent, String str, int i) {
        super.onError(peerAgent, str, i);
        wil.b(this.t, "onError: errorCode=" + i + " errorMessage=" + str + " peerAgent=" + peerAgent);
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
        CountDownLatch countDownLatch;
        boolean zH;
        int i2 = 0;
        if (peerAgentArr == null || peerAgentArr.length == 0) {
            wil.a(this.t, "onFindPeerAgentsResponse: result=" + i + " longConn=" + this.E + " peerAgents=null");
        } else {
            for (int i3 = 0; i3 < peerAgentArr.length; i3++) {
                wil.a(this.t, "onFindPeerAgentsResponse: result=" + i + " longConn=" + this.E + " peerAgents@" + i3 + HttpUtils.EQUAL_SIGN + peerAgentArr[i3]);
            }
        }
        if (i == 0 && peerAgentArr != null) {
            int i4 = 0;
            for (PeerAgent peerAgent : peerAgentArr) {
                PeerAccessory accessory = peerAgent.getAccessory();
                if (accessory == null || !accessory.supportMessage()) {
                    wil.k(this.t, "onFindPeerAgentsResponse: not support message " + accessory);
                } else if (this.F != 1 || accessory.getTransportType() == this.F) {
                    try {
                        zH = a.f().h(accessory.getAddress());
                    } catch (RemoteException e2) {
                        wil.k(this.t, "onFindPeerAgentsResponse: isOafConnect e=" + e2);
                        zH = false;
                    }
                    if (zH) {
                        requestServiceConnection(peerAgent);
                        i4++;
                    } else {
                        wil.k(this.t, "onFindPeerAgentsResponse: not self device " + accessory);
                    }
                } else {
                    wil.k(this.t, "onFindPeerAgentsResponse: not target transport type " + this.F);
                }
            }
            i2 = i4;
        } else if (i == 10001) {
            D(this.t + " device not connected");
        } else if (i == 10002) {
            D(this.t + " PeerAgent not found");
        } else {
            D(this.t + " PeerAgent error " + i);
        }
        this.D = i;
        if (i2 != 0 || (countDownLatch = this.A) == null) {
            return;
        }
        countDownLatch.countDown();
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onPeerAgentsUpdated(PeerAgent[] peerAgentArr, int i) {
        if (peerAgentArr == null || peerAgentArr.length == 0) {
            wil.a(this.t, "onPeerAgentsUpdated: result=" + i + " peerAgents=null");
        } else {
            for (int i2 = 0; i2 < peerAgentArr.length; i2++) {
                wil.a(this.t, "onPeerAgentsUpdated: result=" + i + " peerAgents@" + i2 + HttpUtils.EQUAL_SIGN + peerAgentArr[i2]);
            }
            PeerAccessory accessory = peerAgentArr[0].getAccessory();
            if (accessory != null) {
                this.z.a(accessory.getAddress());
            }
        }
        if (i == 1) {
            D("PEER_AGENT_AVAILABLE");
        } else {
            D("PEER_AGENT_UNAVAILABLE");
        }
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
            zH = a.f().h(accessory.getAddress());
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
    public void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        wil.d(this.t, "onSvrConnRes: result=" + i + " peerAgent=" + peerAgent + " socket=" + baseSocket);
        try {
            if (!y(peerAgent, baseSocket, i)) {
                wil.d(this.t, "onSvrConnRes: no need");
                return;
            }
            this.D = i;
            CountDownLatch countDownLatch = this.A;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            wil.d(this.t, "onSvrConnRes: no need");
            throw th;
        }
    }

    public void x(final String str) {
        this.y.submit(new Runnable() { // from class: com.oplus.aiunit.vision.m4
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p(str);
            }
        });
    }

    public final boolean y(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        boolean z;
        if (peerAgent == null) {
            wil.b(this.t, "onSvrConnRes: agent is null");
            return false;
        }
        String address = peerAgent.getAccessory().getAddress();
        if (baseSocket == null) {
            wil.b(this.t, "onSvrConnRes: socket is null");
            if (this.F == 1) {
                return true;
            }
            return TextUtils.equals(this.B, address);
        }
        String connectionId = baseSocket.getConnectionId();
        wil.d(this.t, "onSvrConnRes: mac=" + gdb.a(address) + " connectionId=" + connectionId);
        if (i == 0) {
            wil.d(this.t, "saveConnection: find success");
        } else if (i == 10005) {
            D(this.t + " CONNECTION_ALREADY_EXIST ");
        } else if (i == 10009) {
            D(this.t + " CONNECTION_DUPLICATE_REQUEST");
        } else {
            D("failed " + i);
        }
        if (i == 0) {
            ServiceConnection serviceConnection = (ServiceConnection) baseSocket;
            synchronized (this.u) {
                Set<ServiceConnection> linkedHashSet = this.u.get(address);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    this.u.put(address, linkedHashSet);
                }
                Iterator<ServiceConnection> it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (TextUtils.equals(it.next().getConnectionId(), serviceConnection.getConnectionId())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    wil.b(this.t, "saveConnection: connection " + connectionId + " already exist");
                } else {
                    boolean zAdd = linkedHashSet.add(serviceConnection);
                    wil.d(this.t, "saveConnection: add connection " + connectionId + " addResult:" + zAdd);
                }
            }
        }
        if (this.F == 1) {
            return true;
        }
        wil.b(this.t, "onSvrConnRes: transportType:" + this.F);
        return TextUtils.equals(address, this.B) || peerAgent.getAccessory().getTransportType() == 1;
    }

    public void z(final MessageEvent messageEvent, final String str, final int i, final int i2, final byte[] bArr, final IResult iResult) {
        if (messageEvent.getTransport() == 1) {
            this.x.submit(new Runnable() { // from class: com.oplus.aiunit.vision.n4
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.q(str, messageEvent, i, i2, bArr, iResult);
                }
            });
        } else {
            this.y.submit(new Runnable() { // from class: com.oplus.aiunit.vision.o4
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.r(str, messageEvent, i, i2, bArr, iResult);
                }
            });
        }
    }
}
