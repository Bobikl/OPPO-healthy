package com.heytap.accessory.msgexp;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseIntArray;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.api.IMsgExpCallback;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.security.k;
import com.heytap.accessory.session.e;
import com.heytap.accessory.transport.d;
import com.heytap.accessory.transport.f;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferException;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final Object d = new Object();
    public static final String e = "b";
    public static final SparseIntArray f;
    public static b g;
    public Handler b;
    public Map<Long, com.heytap.accessory.msgexp.a> c = new ArrayMap();
    public final Map<String, b> a = Collections.synchronizedMap(new HashMap());

    public class a implements e {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // com.heytap.accessory.session.e
        public void a() {
        }

        @Override // com.heytap.accessory.session.e
        public boolean b() {
            return false;
        }

        @Override // com.heytap.accessory.session.e
        public void a(com.heytap.accessory.message.b bVar, TrafficReport trafficReport) {
            if (bVar != null) {
                b.this.a(bVar);
            }
        }

        @Override // com.heytap.accessory.session.e
        public void a(long j, boolean z) {
            com.heytap.accessory.msgexp.a aVarC = b.this.c(this.a);
            if (aVarC != null) {
                aVarC.d();
            }
        }
    }

    public class b {
        public IMsgExpCallback a;
        public Queue<Bundle> b;
        public a c;

        public class a implements Runnable {
            public String a;

            public a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.heytap.accessory.base.logging.a.b(b.e, "Timed out waiting for agent : " + this.a + " to register its callback! Clearing all pending messages!");
                ((b) b.this.a.remove(this.a)).a();
            }
        }

        public /* synthetic */ b(b bVar, a aVar) {
            this();
        }

        public synchronized void a(Bundle bundle) {
            if (this.b == null) {
                this.b = new LinkedList();
            }
            this.b.add(bundle);
        }

        public synchronized void b() {
            if (b.this.b != null && this.c != null) {
                b.this.b.removeCallbacks(this.c);
            }
        }

        public synchronized boolean c() {
            Queue<Bundle> queue;
            queue = this.b;
            return queue == null || queue.isEmpty();
        }

        public synchronized void d() {
            String str;
            byte[] byteArray;
            while (!this.b.isEmpty()) {
                Bundle bundlePoll = this.b.poll();
                if (bundlePoll != null) {
                    try {
                        this.a.onReceived(bundlePoll);
                    } catch (RemoteException e) {
                        com.heytap.accessory.base.logging.a.b(b.e, "sendToApp error," + e);
                    } finally {
                        BufferPool.recycle(bundlePoll.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES"));
                    }
                }
            }
        }

        public /* synthetic */ b(b bVar, b bVar2, a aVar) {
            this(bVar2);
        }

        public b() {
        }

        public b(b bVar) {
        }

        public synchronized void a() {
            while (!this.b.isEmpty()) {
                Bundle bundlePoll = this.b.poll();
                if (bundlePoll != null) {
                    BufferPool.recycle(bundlePoll.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES"));
                }
            }
            this.b.clear();
        }

        public synchronized void a(String str) {
            this.c = new a(str);
            if (b.this.b != null) {
                b.this.b.postDelayed(this.c, 20000L);
            }
        }
    }

    public static final class c implements d.i {
        public WeakReference<b> a;

        public c(b bVar) {
            this.a = new WeakReference<>(bVar);
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2) {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void b(long j, long j2) {
            com.heytap.accessory.msgexp.a aVarC = b.d().c(j);
            if (aVarC == null) {
                com.heytap.accessory.base.logging.a.e(b.e, "Failed to give the session flushed callback! Accessory:" + j + " not found");
                return;
            }
            e eVarB = aVarC.b().b();
            if (eVarB != null) {
                com.heytap.accessory.base.logging.a.a(b.e, "Session (" + j2 + ") messages flushed");
                eVarB.a();
            }
        }

        @Override // com.heytap.accessory.transport.d.i
        public void c(long j, long j2) {
            com.heytap.accessory.msgexp.a aVarC = b.d().c(j);
            if (aVarC != null) {
                aVarC.b().d();
                return;
            }
            com.heytap.accessory.base.logging.a.e(b.e, "Failed to give the space available callback! Accessory:" + j + " not found");
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(com.heytap.accessory.base.bean.a aVar) {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2, com.heytap.accessory.message.a aVar) {
            b bVar = this.a.get();
            com.heytap.accessory.base.logging.a.a(b.e, "onMessageReceived");
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.e(b.e, "onMessageReceived(): Mex reference is null!");
                return;
            }
            com.heytap.accessory.msgexp.a aVarC = bVar.c(j);
            if (aVarC == null || aVarC.b() == null) {
                com.heytap.accessory.base.logging.a.e(b.e, "onMessageReceived(): Cannot find Message exchange session for accessory: " + j + " !");
                return;
            }
            e eVarB = aVarC.b().b();
            if (eVarB == null) {
                com.heytap.accessory.base.logging.a.e(b.e, "onMessageReceived(): Cannot find session listener for  Message exchange session!");
                return;
            }
            com.heytap.accessory.message.b bVar2 = new com.heytap.accessory.message.b(j, j2);
            bVar2.a(aVar);
            eVarB.a(bVar2, (TrafficReport) null);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 10102);
        sparseIntArray.put(2, 10101);
        sparseIntArray.put(3, 10101);
    }

    public b() {
        e().c(new c(this));
    }

    public static synchronized b d() {
        b bVar;
        synchronized (b.class) {
            if (g == null) {
                g = new b();
            }
            bVar = g;
        }
        return bVar;
        return bVar;
    }

    public com.heytap.accessory.msgexp.a c(long j) {
        com.heytap.accessory.msgexp.a aVar;
        synchronized (d) {
            aVar = this.c.get(Long.valueOf(j));
        }
        return aVar;
    }

    public final d e() {
        return d.f();
    }

    public int b(long j, com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.msgexp.a aVarC = c(j);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.e(e, "Cannot find message excahnge session details for accessory: " + j);
            return BaseMessage.ERROR_TRANSACTION_FAILED;
        }
        if (aVar.d() == 0) {
            int iA = aVarC.a(aVar.k(), aVar.b());
            com.heytap.accessory.base.logging.a.a(e, ">>> created new TransactionId: " + iA);
            aVar.i(iA);
        } else {
            aVar.g(f.get(aVar.a(), 3));
        }
        if (!com.heytap.accessory.misc.utils.d.a(aVar)) {
            aVarC.a(aVar.l());
            return BaseMessage.ERROR_TRANSACTION_FAILED;
        }
        int iA2 = aVarC.a(aVar);
        if (iA2 == 0) {
            return aVar.l();
        }
        com.heytap.accessory.base.logging.a.e(e, "Failed to enqueue message for accessory: " + j + "! error: " + iA2);
        return iA2;
    }

    public void a(String str, IMsgExpCallback iMsgExpCallback) {
        b bVar = this.a.get(str);
        if (bVar == null) {
            bVar = new b(this, (a) null);
        }
        bVar.a = iMsgExpCallback;
        this.a.put(str, bVar);
        String str2 = e;
        com.heytap.accessory.base.logging.a.a(str2, "registered mex callback for Agent: " + str);
        if (bVar.c()) {
            return;
        }
        bVar.b();
        com.heytap.accessory.base.logging.a.a(str2, "Giving pending messages to app");
        bVar.d();
    }

    public final com.heytap.accessory.sdp.service.b c() {
        return com.heytap.accessory.sdp.service.b.g();
    }

    public void a(String str) {
        synchronized (d) {
            Iterator<com.heytap.accessory.msgexp.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().a(str);
            }
        }
        if (this.a.remove(str) != null) {
            com.heytap.accessory.base.logging.a.e(e, "unregistered mex callback for Agent: " + str);
        }
    }

    public final e b(long j) {
        return new a(j);
    }

    public void b(long j, int i, int i2) {
        String str = e;
        com.heytap.accessory.base.logging.a.a(str, "Mex transaction<" + i + "> status = " + i2);
        com.heytap.accessory.msgexp.a aVarC = c(j);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.e(str, "Cannot give the message delivery status callback for transaction<" + i + "> - Mex detailed not found for accessory:" + j);
            return;
        }
        String strC = aVarC.c(i);
        String strB = aVarC.b(i);
        if (strC != null && strB != null) {
            if (!aVarC.d(i)) {
                com.heytap.accessory.base.logging.a.e(str, "ignoring the message delivery status! -  transaction<" + i + "> in progress...");
                return;
            }
            aVarC.a(i);
            a(j, strC, strB, i, i2);
            return;
        }
        com.heytap.accessory.base.logging.a.e(str, "ignoring the message delivery status! - transaction<" + i + "> not available!");
    }

    public void a(com.heytap.accessory.base.bean.b bVar, Handler handler) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(e, "Failed to create reserved session for accessory NULL!");
            return;
        }
        if (c(bVar.l()) != null) {
            com.heytap.accessory.base.logging.a.e(e, "Reserved session for message exchange session already exists for accessory: " + bVar.l());
            return;
        }
        this.b = handler;
        com.heytap.accessory.msgexp.a aVarA = com.heytap.accessory.msgexp.a.a(bVar.l(), handler);
        com.heytap.accessory.session.a aVarB = aVarA.b();
        aVarB.a(3L, false);
        aVarB.a(b(bVar.l()));
        aVarB.a(com.heytap.accessory.transport.b.r());
        bVar.e(true);
        e().a(bVar.l(), aVarB.a(), 4, 1, bVar.h(), bVar.H(), bVar.C(), bVar.g());
        aVarB.c().a(aVarB.a(), 0, bVar.h());
        String str = e;
        com.heytap.accessory.base.logging.a.a(str, "[sessionConfig] mexSession receiverQueue" + aVarB.a() + ", obj:" + aVarB.c());
        synchronized (d) {
            this.c.put(Long.valueOf(bVar.l()), aVarA);
        }
        com.heytap.accessory.base.logging.a.d(str, "Message exchange session created for accessory: " + bVar.l());
    }

    public final AccessoryManager b() {
        return AccessoryManager.h();
    }

    public boolean a(long j) {
        com.heytap.accessory.msgexp.a aVarC = c(j);
        if (aVarC == null) {
            return false;
        }
        aVarC.a();
        synchronized (d) {
            this.c.remove(Long.valueOf(j));
        }
        com.heytap.accessory.base.logging.a.d(e, "Closed Mex session acc:" + j);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(com.heytap.accessory.message.b bVar) {
        long jA = bVar.a();
        if (c(jA) == null) {
            com.heytap.accessory.base.logging.a.e(e, "Message exchange session not found for accessoryId: " + jA);
            return;
        }
        com.heytap.accessory.message.a aVarC = bVar.c();
        com.heytap.accessory.misc.utils.d.c(aVarC);
        int iD = aVarC.d();
        if (iD != 0) {
            if (iD != 1) {
                com.heytap.accessory.base.logging.a.b(e, "onMessageReceived(): Invalid message type received for transaction<" + aVarC.l() + ">!");
                return;
            }
            com.heytap.accessory.base.logging.a.e(e, "onMessageReceived() unknow msgType:1");
            b(jA, aVarC.l(), f.get(aVarC.a(), 10101));
            return;
        }
        String strB = aVarC.b();
        Bundle bundle = null;
        Object[] objArr = 0;
        try {
            int iL = aVarC.l();
            Bundle bundleA = a(jA, aVarC);
            try {
                if (bundleA != null) {
                    FrameworkServiceDescription frameworkServiceDescriptionB = c().b(strB);
                    if (frameworkServiceDescriptionB == null) {
                        com.heytap.accessory.base.logging.a.b(e, "Cannot start the Agent: " + strB + "! - not registered");
                        com.heytap.accessory.message.a aVarA = a(jA, iL, 10101);
                        if (aVarA != null) {
                            d().b(jA, aVarA);
                            return;
                        }
                        return;
                    }
                    b bVar2 = this.a.get(strB);
                    if (bVar2 == null) {
                        b bVar3 = new b(this, this, objArr == true ? 1 : 0);
                        bVar3.a(bundleA);
                        bVar3.a(strB);
                        this.a.put(strB, bVar3);
                        com.heytap.accessory.base.logging.a.e(e, "Agent<" + strB + "> callback not found! waking up application <" + iL + ">");
                        b().a(frameworkServiceDescriptionB.d(), frameworkServiceDescriptionB.b());
                        return;
                    }
                    IMsgExpCallback iMsgExpCallback = bVar2.a;
                    if (iMsgExpCallback == null) {
                        com.heytap.accessory.base.logging.a.e(e, "Queueing data for transaction <" + iL + ">");
                        bVar2.a(bundleA);
                        return;
                    }
                    iMsgExpCallback.onReceived(bundleA);
                    BufferPool.recycle(bundleA.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES"));
                    return;
                }
                com.heytap.accessory.message.a aVarA2 = a(jA, iL, 10101);
                if (aVarA2 != null) {
                    d().b(jA, aVarA2);
                }
            } catch (RemoteException e2) {
                e = e2;
                bundle = bundleA;
                com.heytap.accessory.base.logging.a.b(e, "onMexDataReceived error," + e);
                BufferPool.recycle(bundle.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES"));
            }
        } catch (RemoteException e3) {
            e = e3;
        }
    }

    public final Bundle a(long j, com.heytap.accessory.message.a aVar) {
        int i;
        String strB = aVar.b();
        if (strB == null) {
            com.heytap.accessory.base.logging.a.b(e, "Dest agentId is null!");
            return null;
        }
        int iL = aVar.l();
        Buffer bufferF = aVar.f();
        byte[] buffer = bufferF.getBuffer();
        int offset = bufferF.getOffset();
        int payloadLength = bufferF.getPayloadLength();
        int iA = f.a(j, aVar.j());
        PeerAgent peerAgentA = a(j, strB, aVar.k());
        if (peerAgentA == null) {
            com.heytap.accessory.base.logging.a.e(e, "handleMessageReceived() : Failed to create peer agent for <Accessory, LocalAgent, RemoteAgent> : <" + j + ", " + strB + "," + aVar.k() + ">");
            return null;
        }
        com.heytap.accessory.base.bean.b bVarA = b().a(j);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(e, "Accessory not found, ignore the msg");
            return null;
        }
        if (aVar.o()) {
            i = offset;
            payloadLength = k.a((com.heytap.accessory.connectivity.core.interfaces.a) null).a(j, Long.parseLong(aVar.k()), Long.parseLong(aVar.b()), buffer, offset, payloadLength);
            if (payloadLength <= 0) {
                com.heytap.accessory.base.logging.a.b(e, "Message decryption failed! (" + payloadLength + ") offset=" + i + "; length=" + payloadLength);
                return null;
            }
        } else {
            i = offset;
        }
        String str = e;
        com.heytap.accessory.base.logging.a.d(str, "Msg<" + iL + "> Before compress Info: data length = " + payloadLength + " dataOffset = " + i + " data.length = " + buffer.length);
        if (bVarA.L() && aVar.n()) {
            Buffer bufferA = a(iA, buffer, i, payloadLength);
            if (bufferA == null) {
                com.heytap.accessory.base.logging.a.b(str, "Decompression Failed: Corrupt packet");
                return null;
            }
            payloadLength = bufferA.getPayloadLength();
            Buffer bufferObtain = BufferPool.obtain(i + payloadLength);
            bufferObtain.setOffset(i);
            try {
                bufferObtain.extractFrom(bufferA.getBuffer(), bufferA.getOffset(), payloadLength);
                buffer = bufferObtain.getBuffer();
            } catch (BufferException e2) {
                com.heytap.accessory.base.logging.a.b(e, "decompressed error," + e2);
            }
            bufferF.recycle();
            bufferA.recycle();
        }
        a(buffer, i, payloadLength);
        String str2 = e;
        com.heytap.accessory.base.logging.a.d(str2, "Msg<" + iL + "> FromAgent: < " + aVar.k() + "> ToAgent: " + strB);
        com.heytap.accessory.base.logging.a.d(str2, "Msg<" + iL + "> Info: data length = " + payloadLength + " dataOffset = " + i + " data.length = " + buffer.length);
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.heytap.accessory.adapter.extra.READ_BYTES", buffer);
        bundle.putInt("com.heytap.accessory.adapter.extra.READ_LENGHT", payloadLength);
        bundle.putInt("com.heytap.accessory.adapter.extra.READ_OFFSET", i);
        bundle.putParcelable("peerAgent", peerAgentA);
        bundle.putInt("transactionId", iL);
        return bundle;
    }

    public Buffer a(int i, byte[] bArr, int i2, int i3) {
        return com.heytap.accessory.misc.utils.a.a(i, bArr, i2, i3);
    }

    public static void a(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = -1;
        }
        for (int i4 = i + i2; i4 < bArr.length; i4++) {
            bArr[i4] = -1;
        }
    }

    public void a(long j, String str, String str2, int i, int i2) {
        b bVar = this.a.get(str);
        if (bVar != null && bVar.a != null) {
            PeerAgent peerAgentA = a(j, str, str2);
            if (peerAgentA == null) {
                com.heytap.accessory.base.logging.a.e(e, "Failed to create peer agent for <Accessory, LocalAgent, RemoteAgent> : <" + j + ", " + str + "," + str2 + ">");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("peerAgent", peerAgentA);
            bundle.putInt("transactionId", i);
            bundle.putInt("errorcode", i2);
            try {
                bVar.a.onSent(bundle);
                return;
            } catch (RemoteException e2) {
                com.heytap.accessory.base.logging.a.b(e, "deliverStatusToAgent error," + e2);
                return;
            }
        }
        com.heytap.accessory.base.logging.a.e(e, "Failed to deliver msg status for transaction<" + i + ">! callback not found for Agent: " + str);
    }

    public final PeerAgent a(long j, String str, String str2) {
        FrameworkServiceDescription next;
        com.heytap.accessory.base.bean.b bVarA = b().a(j);
        String str3 = e;
        com.heytap.accessory.base.logging.a.a(str3, "createPeerAgent " + j + " , " + str + " , " + str2);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.b(str3, "createMsgExpPeerAgent failed, acc is null");
            return null;
        }
        if (c().b(str) == null) {
            com.heytap.accessory.base.logging.a.b(str3, "createMsgExpPeerAgent failed, service desc from db is null");
            return null;
        }
        Iterator<FrameworkServiceDescription> it = bVarA.x().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.a().equalsIgnoreCase(str2));
        if (next == null) {
            com.heytap.accessory.base.logging.a.b(e, "createMsgExpPeerAgent failed, service desc from remote is null");
            return null;
        }
        return new PeerAgent(next.a(), next.d(), next.c(), next.n(), com.heytap.accessory.sdk.a.a(bVarA), bVarA.a(next.j()), bVarA.b(next.r()));
    }

    public com.heytap.accessory.message.a a(long j, int i, int i2) {
        String str = e;
        com.heytap.accessory.base.logging.a.d(str, "write(ACK): " + i2 + "; " + i);
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j, 3L, 3);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(str, "Failed to create BaseMessage for accessory: " + j);
            return null;
        }
        aVarC.h(1);
        aVarC.g(i2);
        aVarC.i(i);
        return aVarC;
    }
}
