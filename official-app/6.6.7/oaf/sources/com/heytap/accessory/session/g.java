package com.heytap.accessory.session;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.bean.FrameworkServiceChannelDescription;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.pair.connectivity.bt.BtRfConnection;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class g {
    public static final boolean f = true;
    public static final String i = "g";
    public static g y;
    public static Handler z;
    public final Map<Long, List<Long>> a;
    public Map<Integer, h> c;
    public com.heytap.accessory.base.c d;
    public static final Object g = new Object();
    public static final Object h = new Object();
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Map<Long, i> l = new ArrayMap();
    public static final Object m = new Object();
    public static final Map<Integer, com.heytap.accessory.transport.e> n = new ArrayMap();
    public static Map<Long, List<Long>> o = new ConcurrentHashMap();
    public static Map<Long, com.heytap.accessory.session.c> p = new ConcurrentHashMap();
    public static Map<Long, Map<Long, com.heytap.accessory.session.a>> q = new ArrayMap();
    public static Map<Long, e> r = new ArrayMap();
    public static Map<Long, com.heytap.accessory.session.d> s = new ConcurrentHashMap();
    public static Map<Long, j> t = new ConcurrentHashMap();
    public static Map<Long, Integer> u = new ConcurrentHashMap();
    public static Map<Long, f> v = new ArrayMap();
    public static Map<Integer, Handler> w = new ConcurrentHashMap();
    public static Map<Long, Map<Long, Integer>> x = new ConcurrentHashMap();
    public int b = 0;
    public long e = 0;

    public class a extends i {
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;
        public final /* synthetic */ long r;
        public final /* synthetic */ long s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, long j, long j2) {
            super(g.this);
            this.p = i;
            this.q = i2;
            this.r = j;
            this.s = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.e(g.i, "Closure response timed out for (" + this.p + ", " + this.q + ") timed out after multiple attempts. Closing the agent connection");
            if (((j) g.t.get(Long.valueOf(this.r))) != null) {
                com.heytap.accessory.session.d dVar = (com.heytap.accessory.session.d) g.s.remove(Long.valueOf(this.r));
                if (dVar != null) {
                    dVar.a(this.s, String.valueOf(this.r), 0);
                }
                g.this.s(this.r);
            }
        }
    }

    public class b extends i {
        public final /* synthetic */ long p;
        public final /* synthetic */ String q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, String str) {
            super(g.this);
            this.p = j;
            this.q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.q(this.p);
            synchronized (g.l) {
                g.this.s(this.p);
            }
            com.heytap.accessory.base.logging.a.e(g.i, "Timer expired waiting for a service connection response. Rejecting the service connection...");
            g.this.a(this.b, this.q, this.i, this.a, 4, true, (List<Long>) new ArrayList());
            com.heytap.accessory.base.bean.b bVarF = g.this.f(this.b);
            String strB = g.this.b(String.valueOf(this.a));
            if (bVarF != null && bVarF.A() == 11 && bVarF.r().equals(strB)) {
                g.this.e(this.b);
            }
        }
    }

    public class c extends i {
        public final /* synthetic */ int p;
        public final /* synthetic */ long q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, long j) {
            super(g.this);
            this.p = i;
            this.q = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.k) {
                j jVarH = g.this.h(this.h);
                if (jVarH != null && jVarH.i) {
                    com.heytap.accessory.base.logging.a.e(g.i, "Service Connection already established! Hence ignoring timeout...");
                    return;
                }
                int i = this.o;
                if (5 == i) {
                    com.heytap.accessory.base.logging.a.a(g.i, "SERVICE_CONNECTION_MESSAGE_STATUS_TIMEDOUT");
                    g.this.b = 4627;
                } else if (6 == i) {
                    com.heytap.accessory.base.logging.a.a(g.i, "SERVICE_CONNECTION_MESSAGE_STATUS_INVALID");
                    g.this.b = 4629;
                }
                com.heytap.accessory.session.d dVar = (com.heytap.accessory.session.d) g.s.get(Long.valueOf(this.h));
                if (dVar != null) {
                    dVar.a(this.b, String.valueOf(this.i), String.valueOf(this.a), g.this.b);
                    return;
                } else {
                    com.heytap.accessory.base.logging.a.a(g.i, "scl is null,sConnectionListenerMap has remove it");
                    g.this.q(this.h);
                    return;
                }
            }
            if (!g.t.containsKey(Long.valueOf(this.h)) && this.i != 65535) {
                int i2 = this.c;
                if (i2 >= 1) {
                    this.k = true;
                    com.heytap.accessory.base.logging.a.b(g.i, "Unable to enqueue request because the binder thread didn't return");
                    g.this.j(this.i, this.q);
                    g.z.post(this);
                    g.u.remove(Long.valueOf(this.h));
                    return;
                }
                this.c = i2 + 1;
                com.heytap.accessory.base.logging.a.d(g.i, "Posting Attempt #" + this.c + " of 1 binder recheck attempts");
                g.z.postDelayed(this, 20L);
                return;
            }
            if (g.this.a(this)) {
                this.k = true;
                this.o = 1;
                com.heytap.accessory.base.logging.a.e(g.i, "Exhausted maximum limit on retries ...");
                g.z.post(this);
                return;
            }
            this.d++;
            if (this.j) {
                com.heytap.accessory.base.logging.a.e(g.i, "Timed out Waiting for a response for service connection request between (" + this.i + ", " + this.a + ") ...");
                this.k = true;
                this.o = 5;
                g.z.post(this);
                return;
            }
            if (!com.heytap.accessory.transport.d.f().a(this.b, this.n)) {
                this.d = 10;
                this.k = true;
                this.o = 6;
                com.heytap.accessory.base.logging.a.e(g.i, "This request is no longer valid ... Cannot find the session queues");
                return;
            }
            com.heytap.accessory.base.logging.a.a(g.i, "Send SC req conn:" + this.h);
            com.heytap.accessory.base.logging.a.d(g.i, "Attempt #" + this.d + " of 10");
            this.o = 1;
            boolean zA = g.this.a(this.b, this.l);
            this.j = zA;
            if (!zA) {
                g.this.a(this.q, this.l, this);
                return;
            }
            this.o = 2;
            int i3 = this.p;
            long j = i3 != 0 ? ((long) i3) * 1000 : 10000L;
            com.heytap.accessory.base.logging.a.d(g.i, "Start SC timer,timeout in " + j);
            g.z.postDelayed(this, j);
        }
    }

    public class d implements com.heytap.accessory.session.e {
        public final /* synthetic */ long a;

        public d(long j) {
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
            try {
                g.this.a(bVar);
            } finally {
                if (bVar != null && bVar.c() != null && bVar.c().f() != null) {
                    bVar.c().f().recycle();
                }
            }
        }

        @Override // com.heytap.accessory.session.e
        public void a(long j, boolean z) {
            f fVar;
            if (!z) {
                com.heytap.accessory.base.logging.a.e(g.i, "onSpaceAvailable(" + z + ") : DefaultSession ignoring this dummy callback...");
                return;
            }
            synchronized (g.m) {
                fVar = (f) g.v.get(Long.valueOf(this.a));
            }
            Queue<g> queue = fVar != null ? fVar.a : null;
            if (queue == null || queue.isEmpty()) {
                com.heytap.accessory.base.logging.a.e(g.i, "onSpaceAvailable(" + z + ") : There is no pending request in the queue...");
                return;
            }
            com.heytap.accessory.base.logging.a.c(g.i, "onSpaceAvailable(" + z + ") : DefaultSession processing the pending requests[" + queue.size() + "]");
            while (!queue.isEmpty()) {
                g gVarPoll = queue.poll();
                if (gVarPoll != null) {
                    if (!g.this.a(this.a, gVarPoll.a)) {
                        com.heytap.accessory.base.logging.a.e(g.i, "sendServiceConnectionMessage failed for sessionId: " + gVarPoll.a.j());
                        g.this.a(this.a, gVarPoll.a, gVarPoll.b);
                        return;
                    }
                    g.this.b(gVarPoll.b);
                }
            }
        }
    }

    public static final class e {
        public long a;
        public long b;
        public long c;
        public byte[] d;
        public List<Long> e;

        public /* synthetic */ e(a aVar) {
            this();
        }

        public e() {
            this.e = new ArrayList();
        }
    }

    public static class f {
        public Queue<g> a;
        public com.heytap.accessory.session.a b;

        public /* synthetic */ f(a aVar) {
            this();
        }

        public f() {
        }
    }

    public static class g {
        public com.heytap.accessory.message.a a;
        public i b;

        public /* synthetic */ g(a aVar) {
            this();
        }

        public g() {
        }
    }

    public class h implements Runnable {
        public int a;

        public /* synthetic */ h(g gVar, int i, a aVar) {
            this(i);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.transport.b bVarE;
            synchronized (g.n) {
                bVarE = ((com.heytap.accessory.transport.e) g.n.get(Integer.valueOf(this.a))).e();
            }
            if (bVarE == null) {
                com.heytap.accessory.base.logging.a.e(g.i, ">> SessionReceiverQueue is null!");
                return;
            }
            com.heytap.accessory.base.logging.a.a(g.i, ">> ReceiverDequeTask sess:" + bVarE.l() + " thread:" + Thread.currentThread().getId() + " channelType:" + this.a);
            com.heytap.accessory.message.b bVarS = bVarE.s();
            if (bVarS == null) {
                com.heytap.accessory.base.logging.a.e(g.i, ">> ReceiverDequeTask : Empty session queue");
                g.this.a(bVarE);
                return;
            }
            long jA = bVarS.a();
            long jE = bVarS.e();
            com.heytap.accessory.session.a aVarI = 1 == jE ? g.o().i(jA) : g.o().e(jA, jE);
            if (aVarI == null) {
                com.heytap.accessory.base.logging.a.e(g.i, ">> ReceiverDequeTask : Session(" + jE + ") is null!");
                bVarE.v();
                g.this.a(bVarE);
                return;
            }
            com.heytap.accessory.session.e eVarB = aVarI.b();
            if (eVarB == null) {
                com.heytap.accessory.base.logging.a.b(g.i, "Session Listener is null halting deque task");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            eVarB.a(bVarE.t(), new TrafficReport(bVarE.e(), bVarE.j()));
            com.heytap.accessory.transport.control.c.a();
            com.heytap.accessory.transport.control.c.a(g.i + " - TCTrack", "[handleMsg], cost time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ",left msgCount: " + bVarE.f());
            if (bVarE.p() && bVarE.o()) {
                g.this.o(jE);
                bVarE.b(false);
            }
            g.this.a(bVarE);
        }

        public h(int i) {
            this.a = i;
        }
    }

    public abstract class i implements Runnable {
        public int a;
        public long b;
        public int c;
        public int d;
        public List<FrameworkServiceChannelDescription> e;
        public int f;
        public int g;
        public long h;
        public int i;
        public boolean j;
        public boolean k;
        public com.heytap.accessory.message.a l;
        public int m;
        public List<Long> n;
        public int o;

        public i(g gVar) {
        }
    }

    public static final class j {
        public long a;
        public Map<Long, Object> b;
        public List<FrameworkServiceChannelDescription> c;
        public Map<Long, com.heytap.accessory.session.a> d;
        public Object e;
        public Object f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;
        public int k;
        public int l;
        public String m;
        public long n;
    }

    public static final class k implements com.heytap.accessory.transport.d.i {
        public static final String a = "g$k";

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2, com.heytap.accessory.message.a aVar) {
            com.heytap.accessory.session.a aVarE;
            if (1 == j2) {
                aVarE = g.o().i(j);
            } else {
                aVarE = g.o().e(j, j2);
                if (aVar == null) {
                    com.heytap.accessory.base.logging.a.b(a, "msg error(crc verify not pass!),close this service connection");
                    j jVar = (j) g.t.get(Long.valueOf(g.o().d(j, j2)));
                    g.o().a(j, jVar.m, jVar.g, jVar.h);
                    return;
                }
            }
            if (aVarE == null) {
                com.heytap.accessory.base.logging.a.e(a, "onMessageReceived() : Session(" + j2 + ") is null!");
                return;
            }
            com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, j2);
            bVar.a(aVar);
            com.heytap.accessory.transport.b bVarC = aVarE.c();
            if (bVarC == null) {
                com.heytap.accessory.base.logging.a.e(a, "onMessageReceived() : Session(" + j2 + ") receiver queue is null!");
                return;
            }
            synchronized (g.g) {
                if (aVarE.b() != null) {
                    if (!g.e(j2, aVarE)) {
                        g.o().a(bVarC, bVar);
                        return;
                    } else {
                        bVar.c().f().recycle();
                        com.heytap.accessory.base.logging.a.e(a, "reach mem threshold, drop package.");
                        return;
                    }
                }
                if (bVarC.j() > bVarC.e()) {
                    com.heytap.accessory.base.logging.a.b(a, "onMessageReceived() : Session(" + j2 + ") queue overflow while parked!!!");
                    return;
                }
                bVarC.a(bVar);
                com.heytap.accessory.base.logging.a.a(a + " - TCTrack", "onMessageReceived(): Not add session " + j2 + " to MainQueue - listener not set!");
            }
        }

        @Override // com.heytap.accessory.transport.d.i
        public void b(long j, long j2) {
            com.heytap.accessory.session.a aVarI = 1 == j2 ? g.y.i(j) : g.y.e(j, j2);
            if (aVarI == null) {
                com.heytap.accessory.base.logging.a.e(a, "onSessionFlushed() : Session (" + j2 + ") is null! returning...");
                return;
            }
            com.heytap.accessory.session.e eVarB = aVarI.b();
            if (eVarB != null) {
                com.heytap.accessory.base.logging.a.a(a, "onSessionFlushed() : Session (" + j2 + ") messages flushed");
                eVarB.a();
            }
        }

        @Override // com.heytap.accessory.transport.d.i
        public void c(long j, long j2) {
            com.heytap.accessory.session.a aVarI = 1 == j2 ? g.y.i(j) : g.y.e(j, j2);
            if (aVarI != null) {
                aVarI.d();
                return;
            }
            com.heytap.accessory.base.logging.a.e(a, "onSessionSpaceAvailable() : Session (" + j2 + ") is null! returning...");
        }

        public k() {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2) {
            if (1 != j2) {
                g.o().g(j, j2);
            }
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(com.heytap.accessory.base.bean.a aVar) {
            com.heytap.accessory.base.c cVar = g.o().d;
            if (cVar != null) {
                cVar.a(aVar);
            }
        }
    }

    public g() {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            z = new Handler(looperB);
        }
        this.a = new ArrayMap();
        this.c = new ConcurrentHashMap();
        a(1);
    }

    public static boolean e(long j2, com.heytap.accessory.session.a aVar) {
        return false;
    }

    public static synchronized g o() {
        synchronized (g.class) {
            if (y == null) {
                y = new g();
                q();
            }
        }
        return y;
        return y;
    }

    public static void q() {
        com.heytap.accessory.transport.d.f().b(new k(null));
    }

    public boolean l(long j2) {
        return a(j2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public boolean m(long j2) {
        boolean z2;
        com.heytap.accessory.base.logging.a.a(i, "isConnectionProcessing connectionId:" + j2);
        Map<Long, i> map = l;
        synchronized (map) {
            i iVar = map.get(Long.valueOf(j2));
            if (iVar != null) {
                z2 = true;
                if (iVar.m != 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final boolean n(long j2) {
        boolean zContainsKey;
        synchronized (m) {
            zContainsKey = v.containsKey(Long.valueOf(j2));
        }
        return zContainsKey;
    }

    public int p() {
        return this.b;
    }

    public void r(long j2) {
        ArrayList arrayList;
        i iVarS;
        b(j2);
        List<Long> list = o.get(Long.valueOf(j2));
        if (list == null) {
            com.heytap.accessory.base.logging.a.e(i, "Could not find connections for accessory : " + j2);
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            synchronized (l) {
                iVarS = s(jLongValue);
            }
            if (iVarS != null) {
                com.heytap.accessory.base.logging.a.e(i, "Clear any pending negotiation requests for connnection ID: " + jLongValue);
                z.removeCallbacks(iVarS);
            }
            j jVarH = h(jLongValue);
            if (jVarH != null) {
                if (jVarH.j) {
                    j(jVarH.g, jVarH.a);
                } else {
                    j(jVarH.h, jVarH.a);
                }
            }
        }
    }

    public final i s(long j2) {
        com.heytap.accessory.base.logging.a.a(i, "removeTimeoutRunnable connectionId:" + j2);
        return l.remove(Long.valueOf(j2));
    }

    public synchronized void d(long j2) {
        com.heytap.accessory.session.a aVar;
        com.heytap.accessory.base.logging.a.c(i, "Closing the reserved session for accessoryId: " + j2);
        synchronized (m) {
            f fVarRemove = v.remove(Long.valueOf(j2));
            aVar = fVarRemove != null ? fVarRemove.b : null;
        }
        if (aVar != null) {
            c(j2, aVar);
            aVar.e();
        }
    }

    public com.heytap.accessory.base.bean.b f(long j2) {
        return AccessoryManager.h().a(j2);
    }

    public final void g(long j2, com.heytap.accessory.session.params.a aVar) {
        e eVar = new e(null);
        long j3 = aVar.e;
        eVar.a = j3;
        eVar.c = aVar.a;
        eVar.d = aVar.h;
        eVar.b = j2;
        a(com.heytap.accessory.misc.utils.c.a(j2, Long.toString(j3), String.valueOf(aVar.a)), eVar);
    }

    public final boolean h(long j2, long j3) {
        FrameworkServiceDescription frameworkServiceDescriptionK = k(j2);
        if (frameworkServiceDescriptionK == null) {
            com.heytap.accessory.base.logging.a.e(i, "No service description exist for ComponentId: " + j2 + "!");
            return false;
        }
        Map<Long, Integer> map = x.get(Long.valueOf(j2));
        if (map == null) {
            return false;
        }
        int iQ = frameworkServiceDescriptionK.q();
        if (iQ == 0) {
            com.heytap.accessory.base.logging.a.a(i, "SERVICE_LIMIT_ANY");
            return false;
        }
        if (iQ != 1) {
            if (iQ != 2) {
                com.heytap.accessory.base.logging.a.e(i, "Invalid service limit for ComponentId: " + j2 + "!");
                return false;
            }
            if (map.size() != 1) {
                return false;
            }
            com.heytap.accessory.base.logging.a.e(i, "Service connection limit reached for agentId:" + j2 + " - '" + frameworkServiceDescriptionK.m() + "'!( Limit registered is: ONE_PEERAGENT ) ");
        } else {
            if (map.size() <= 0 || map.containsKey(Long.valueOf(j3))) {
                return false;
            }
            com.heytap.accessory.base.logging.a.e(i, "Service connection limit reached for agentId: " + j2 + " - '" + frameworkServiceDescriptionK.m() + "'!( Limit registered is : ONE_ACCESSORY )");
        }
        return true;
    }

    public com.heytap.accessory.session.a i(long j2) {
        f fVar;
        synchronized (m) {
            fVar = v.get(Long.valueOf(j2));
        }
        if (fVar != null) {
            return fVar.b;
        }
        return null;
    }

    public final void j(long j2, long j3) {
        if (!x.containsKey(Long.valueOf(j2))) {
            com.heytap.accessory.base.logging.a.a(i, "ConnectionLimit : No entry " + j2);
            return;
        }
        Map<Long, Integer> map = x.get(Long.valueOf(j2));
        if (!map.containsKey(Long.valueOf(j3))) {
            com.heytap.accessory.base.logging.a.e(i, "ConnectionLimit : No entry found for AccessoryId: " + j3 + " in remote component map for ComponentId: " + j2);
            return;
        }
        map.put(Long.valueOf(j3), Integer.valueOf(map.get(Long.valueOf(j3)).intValue() - 1));
        if (map.get(Long.valueOf(j3)).intValue() == 0) {
            map.remove(Long.valueOf(j3));
            if (map.isEmpty()) {
                x.remove(Long.valueOf(j2));
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.a(i, "ConnectionLimit : Reduced the remote conection count for AccessoryId: " + j3 + " for ComponentId: " + j2 + " to " + map.get(Long.valueOf(j3)));
    }

    public final FrameworkServiceDescription k(long j2) {
        return com.heytap.accessory.sdp.service.b.g().b(String.valueOf(j2));
    }

    public void l() {
        com.heytap.accessory.transport.d.f().d();
    }

    public final void p(long j2) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        if (bVarA != null) {
            AccessoryManager.h().a(bVarA, "com.heytap.accessory.device.action.ACCESSORY_DETACHED", -1);
        }
    }

    public j q(long j2) {
        u.remove(Long.valueOf(j2));
        j jVar = t.get(Long.valueOf(j2));
        if (jVar != null) {
            if (jVar.j) {
                j(jVar.g, jVar.a);
            } else {
                j(jVar.h, jVar.a);
            }
        }
        com.heytap.accessory.base.logging.a.a(i, "removeConnectionRecord,key=" + j2);
        return t.remove(Long.valueOf(j2));
    }

    public void c(long j2, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.transport.b bVarC;
        if (aVar == null || (bVarC = aVar.c()) == null) {
            return;
        }
        Map<Integer, com.heytap.accessory.transport.e> map = n;
        synchronized (map) {
            com.heytap.accessory.transport.e eVar = map.get(Integer.valueOf(bVarC.b()));
            if (eVar == null) {
                eVar = map.get(1);
            }
            eVar.b(bVarC);
        }
    }

    public com.heytap.accessory.session.a e(long j2, long j3) {
        List<Long> list = o.get(Long.valueOf(j2));
        if (list != null && !list.isEmpty()) {
            for (Long l2 : list) {
                synchronized (j) {
                    Map<Long, com.heytap.accessory.session.a> map = q.get(l2);
                    if (map == null) {
                        com.heytap.accessory.base.logging.a.e(i, "connId:" + l2 + " not found in ChannelToSessionMap!");
                    } else {
                        for (Map.Entry<Long, com.heytap.accessory.session.a> entry : map.entrySet()) {
                            if (entry.getValue().a() == j3) {
                                return entry.getValue();
                            }
                        }
                    }
                }
            }
            com.heytap.accessory.base.logging.a.e(i, "accessoryId:" + j2 + ",sessionId" + j3 + "not found!");
            return null;
        }
        com.heytap.accessory.base.logging.a.e(i, "accessoryId:" + j2 + " not found in AccessoryComponentsMap!");
        return null;
    }

    public final void f(long j2, com.heytap.accessory.session.params.a aVar) {
        int i2 = aVar.e;
        int i3 = aVar.a;
        com.heytap.accessory.base.logging.a.a(i, "[agent request connect] receive response.; accessoryId: " + j2 + "; initiatorId(localAgentId): " + i2 + "; acceptorId(remoteAgentId): " + i3 + "; statusCode: " + ((int) aVar.i));
        String str = new String(aVar.h, StandardCharsets.UTF_8);
        byte b2 = aVar.i;
        List<Long> list = aVar.d;
        if (b2 == 0) {
            a(j2, str, i2, i3, list, false);
        } else {
            b(j2, str, i2, i3, b2);
        }
    }

    public Map<Long, j> n() {
        return t;
    }

    public void b(long j2) {
        Queue<g> queue;
        synchronized (m) {
            f fVar = v.get(Long.valueOf(j2));
            if (fVar != null && (queue = fVar.a) != null) {
                queue.clear();
            }
        }
    }

    public final synchronized long m() {
        long j2;
        j2 = this.e;
        this.e = 1 + j2;
        return j2 & 2147483647L;
    }

    public void i(long j2, long j3) {
        Map<Long, com.heytap.accessory.session.a> mapRemove;
        synchronized (j) {
            com.heytap.accessory.base.logging.a.a(i, "recycleSessions remove:" + j3);
            mapRemove = q.remove(Long.valueOf(j3));
        }
        if (mapRemove != null) {
            Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = mapRemove.entrySet().iterator();
            while (it.hasNext()) {
                com.heytap.accessory.session.a value = it.next().getValue();
                d(j2, value);
                value.e();
                com.heytap.accessory.base.logging.a.d(i, "Recycled sess:" + value.a() + " conn:" + j3);
            }
            mapRemove.clear();
        }
        s.remove(Long.valueOf(j3));
        List<Long> list = o.get(Long.valueOf(j2));
        if (list != null) {
            synchronized (list) {
                list.remove(Long.valueOf(j3));
            }
        }
        u.remove(Long.valueOf(j3));
    }

    public final void g(long j2, long j3) {
        List<Long> list = o.get(Long.valueOf(j2));
        if (list == null) {
            com.heytap.accessory.base.logging.a.e(i, "onMessageLost() : Couldn't find the connectionIdList that the session " + j3 + " belongs to!");
            return;
        }
        ArrayList<Long> arrayList = new ArrayList();
        synchronized (list) {
            arrayList.addAll(list);
        }
        long jLongValue = -1;
        for (Long l2 : arrayList) {
            synchronized (j) {
                Map<Long, com.heytap.accessory.session.a> map = q.get(l2);
                if (map != null) {
                    Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().a() == j3) {
                            jLongValue = l2.longValue();
                            break;
                        }
                    }
                }
            }
            if (jLongValue != -1) {
                break;
            }
        }
        if (jLongValue == -1) {
            com.heytap.accessory.base.logging.a.e(i, "onMessageLost() : Couldn't find the service connection that the session " + j3 + " belongs to!");
            return;
        }
        j jVar = t.get(Long.valueOf(jLongValue));
        if (jVar != null) {
            com.heytap.accessory.session.d dVarRemove = s.remove(Long.valueOf(jLongValue));
            if (dVarRemove != null) {
                dVarRemove.a(j2, String.valueOf(jLongValue), 1);
            }
            o().a(j2, jVar.m, jVar.g, jVar.h);
        }
    }

    public final long o(long j2) {
        long jLongValue;
        e eVar;
        synchronized (h) {
            Iterator<Map.Entry<Long, List<Long>>> it = this.a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    jLongValue = -1;
                    break;
                }
                Map.Entry<Long, List<Long>> next = it.next();
                if (next.getValue().contains(Long.valueOf(j2))) {
                    jLongValue = next.getKey().longValue();
                    break;
                }
            }
        }
        if (jLongValue != -1) {
            synchronized (h) {
                List<Long> list = this.a.get(Long.valueOf(jLongValue));
                if (list == null) {
                    com.heytap.accessory.base.logging.a.b(i, "Session  is null");
                } else {
                    list.remove(Long.valueOf(j2));
                    com.heytap.accessory.base.logging.a.c(i, "processSessionFlushed() sess:" + j2 + " conn:" + jLongValue);
                    if (list.isEmpty() && (eVar = r.get(Long.valueOf(jLongValue))) != null) {
                        b(jLongValue, eVar.b);
                        a(eVar);
                        r.remove(Long.valueOf(jLongValue));
                        this.a.remove(Long.valueOf(jLongValue));
                    }
                }
            }
        }
        return jLongValue;
    }

    public final void c(long j2, com.heytap.accessory.session.params.a aVar) {
        byte[] bArrA;
        String strB = b(String.valueOf(aVar.a));
        if (strB != null && !strB.isEmpty()) {
            String str = i;
            com.heytap.accessory.base.logging.a.c(str, "Public Key Found!! : " + strB);
            bArrA = a(strB);
            if (bArrA == null) {
                com.heytap.accessory.base.logging.a.e(str, "Could not get publicKey from packageName!!");
                bArrA = new byte[0];
            }
        } else {
            com.heytap.accessory.base.logging.a.e(i, "Application Package was not found!!");
            bArrA = new byte[0];
        }
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        aVar2.f = (byte) 6;
        aVar2.e = aVar.a;
        aVar2.a = aVar.e;
        aVar2.h = aVar.h;
        int length = bArrA.length + 4;
        Buffer bufferObtain = BufferPool.obtain(length);
        byte[] buffer = bufferObtain.getBuffer();
        if (length == 4) {
            buffer[0] = 1;
            buffer[1] = 1;
        } else {
            buffer[0] = 0;
            buffer[1] = 1;
            buffer[2] = (byte) ((bArrA.length >> 8) & 255);
            buffer[3] = (byte) (bArrA.length & 255);
            SystemUtils.arraycopy(bArrA, 0, buffer, 4, bArrA.length);
        }
        bufferObtain.setPayloadLength(length);
        aVar2.b = bufferObtain;
        a(j2, com.heytap.accessory.session.b.a(aVar2, j2));
    }

    public void b(long j2, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.base.logging.a.a(i, "cleanSessionCache,accessoryId: " + j2 + ",sessionId: " + aVar.a());
        com.heytap.accessory.transport.d.f().a(j2, aVar.a());
        com.heytap.accessory.transport.b bVarC = aVar.c();
        if (bVarC != null) {
            bVarC.v();
        }
    }

    public long d(long j2, long j3) {
        Map<Long, com.heytap.accessory.session.a> map;
        List<Long> list = o.get(Long.valueOf(j2));
        if (list == null) {
            return 0L;
        }
        for (Long l2 : list) {
            synchronized (j) {
                map = q.get(l2);
            }
            if (map != null) {
                Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == j3) {
                        return l2.longValue();
                    }
                }
            }
        }
        return 0L;
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar) {
        this.b = 0;
        if (bVar == null) {
            this.b = 4377;
            return false;
        }
        if (i(bVar.l()) != null) {
            return false;
        }
        synchronized (m) {
            com.heytap.accessory.session.a aVarD = com.heytap.accessory.session.a.d(bVar.l());
            aVarD.a(1L, false);
            a(bVar.l(), aVarD, 3, 3, bVar.h(), 1, 0, 1);
            aVarD.a(j(bVar.l()));
            f fVar = new f(null);
            fVar.a = new LinkedList();
            fVar.b = aVarD;
            v.put(Long.valueOf(bVar.l()), fVar);
        }
        return true;
    }

    public final Map<Long, com.heytap.accessory.session.a> f(long j2, long j3) {
        Map<Long, com.heytap.accessory.session.a> map;
        synchronized (j) {
            map = q.get(Long.valueOf(j3));
        }
        return map;
    }

    public final void h(long j2, com.heytap.accessory.session.params.a aVar) {
        long jA = com.heytap.accessory.misc.utils.c.a(j2, Long.toString(aVar.e), String.valueOf(aVar.a));
        Map<Long, i> map = l;
        synchronized (map) {
            if (map.containsKey(Long.valueOf(jA))) {
                i iVar = map.get(Long.valueOf(jA));
                if (iVar.m == 3) {
                    s(jA);
                    z.removeCallbacks(iVar);
                    b(jA, j2);
                    synchronized (h) {
                        this.a.remove(Long.valueOf(jA));
                        r.remove(Long.valueOf(jA));
                    }
                    return;
                }
                com.heytap.accessory.base.logging.a.e(i, "Closure response after timeout for connectionId : " + jA + " and service connection requested also, hence ignoring");
                return;
            }
            com.heytap.accessory.base.logging.a.e(i, "Closure response after timeout for connectionId : " + jA + " ignoring");
        }
    }

    public final com.heytap.accessory.session.e j(long j2) {
        return new d(j2);
    }

    public final void b(long j2, com.heytap.accessory.session.params.a aVar) {
        if (aVar != null && aVar.i == 0) {
            com.heytap.accessory.base.logging.a.c(i + " - SLPTrack", "receive setState response, success, params:" + aVar);
            return;
        }
        com.heytap.accessory.base.logging.a.b(i + " - SLPTrack", "receive setState response, failed, params is null.");
    }

    public final void e(long j2) {
        com.heytap.accessory.base.bean.b bVarF = f(j2);
        com.heytap.accessory.base.logging.a.a(i, "Channel has been unlocked for accessory " + j2);
        if (bVarF == null || bVarF.A() != 11) {
            return;
        }
        AccessoryManager.h().a(bVarF, "com.heytap.accessory.device.action.ACCESSORY_ATTACHED", -1);
    }

    public Map<Long, com.heytap.accessory.session.a> b(long j2, String str, int i2, int i3) {
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.f = (byte) 2;
        aVar.a = i2;
        aVar.e = i3;
        aVar.h = str.getBytes(StandardCharsets.UTF_8);
        aVar.i = (byte) 0;
        ArrayList arrayList = new ArrayList();
        Map<Long, com.heytap.accessory.session.a> mapF = f(j2, jA);
        if (mapF != null) {
            Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = mapF.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().getValue().a()));
            }
        } else {
            mapF = new ArrayMap<>();
        }
        aVar.d = arrayList;
        aVar.g = arrayList.size();
        boolean zA = a(j2, com.heytap.accessory.session.f.b(aVar, j2));
        com.heytap.accessory.base.logging.a.a(i, i3 + " accepted SC from " + i2 + " sessions:" + com.heytap.accessory.session.a.a(mapF));
        this.b = zA ? 0 : 5399;
        return mapF;
    }

    public void d(long j2, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.transport.d.f().e(j2, aVar.a());
        c(j2, aVar);
    }

    public void e(long j2, com.heytap.accessory.session.params.a aVar) {
        boolean z2;
        FrameworkServiceDescription frameworkServiceDescription;
        String str;
        long j3;
        Integer numValueOf;
        List<Integer> list;
        String str2 = i;
        com.heytap.accessory.base.logging.a.a(str2, "processCreateServiceConnectionRequest, accessoryId = " + j2 + "; ProtocolMessageParams = " + aVar);
        ArrayMap arrayMap = new ArrayMap();
        String str3 = new String(aVar.h, StandardCharsets.UTF_8);
        int i2 = aVar.e;
        int i3 = aVar.a;
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        com.heytap.accessory.base.bean.b bVarF = f(j2);
        if (bVarF == null) {
            com.heytap.accessory.base.logging.a.e(str2, "No accessory found for accessoryId " + j2);
            return;
        }
        FrameworkServiceDescription frameworkServiceDescriptionB = com.heytap.accessory.sdp.service.b.g().b(String.valueOf(aVar.a));
        if (frameworkServiceDescriptionB == null) {
            com.heytap.accessory.base.logging.a.b(str2, "Acceptor ID: " + i3 + " not present locally ");
            a(j2, str3, i2, i3, 1, true, aVar.d);
            return;
        }
        com.heytap.accessory.base.logging.a.a(str2, "current profile:" + frameworkServiceDescriptionB.m() + ",role:" + frameworkServiceDescriptionB.o() + ",connectionId:" + jA + ",isConnectionProcessing:" + m(jA));
        if (m(jA)) {
            if (frameworkServiceDescriptionB.o() == 1) {
                com.heytap.accessory.base.logging.a.e(str2, "ignore request for consumer which has already create request:" + frameworkServiceDescriptionB.a());
                return;
            }
            com.heytap.accessory.base.logging.a.a(str2, "recycleSessions when isConnectionProcessing");
            i(j2, jA);
        }
        StringBuilder sb = new StringBuilder();
        if (bVarF.A() != 10) {
            z2 = false;
            break;
        }
        Iterator<FrameworkServiceDescription> it = bVarF.x().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            FrameworkServiceDescription next = it.next();
            sb.append(next.m());
            sb.append("(");
            sb.append(next.a());
            sb.append(")");
            sb.append("; ");
            if (next.a().equalsIgnoreCase(String.valueOf(i2))) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String str4 = i;
            com.heytap.accessory.base.logging.a.b(str4, "Initiator with id: " + i2 + " not found locally:" + sb.toString() + ". Rejecting!");
            a(j2, str3, i2, i3, 1, true, aVar.d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Send capability query for ");
            sb2.append(str3);
            com.heytap.accessory.base.logging.a.c(str4, sb2.toString());
            com.heytap.accessory.sdp.service.b.g().b(bVarF.h(), str3);
            return;
        }
        List<Integer> listA = com.heytap.accessory.sdp.service.b.g().a(frameworkServiceDescriptionB, aVar.c);
        if (listA != null && !listA.isEmpty()) {
            String str5 = i;
            com.heytap.accessory.base.logging.a.a(str5, "process Create Service Connection Request findCommonSession: " + listA + " remoteChannelId:" + aVar.a() + " localChannelId:" + frameworkServiceDescriptionB.g());
            Integer num = u.get(Long.valueOf(jA));
            if (num != null) {
                j jVar = t.get(Long.valueOf(jA));
                if (((num.intValue() & 2) != 0 || (num.intValue() & 4) != 0) && (jVar == null || !jVar.i)) {
                    com.heytap.accessory.base.logging.a.e(str5, "Duplicate service connection request received when a connection is pending negotiation " + jA);
                    return;
                } else if (jVar != null && jVar.i) {
                    com.heytap.accessory.base.logging.a.e(str5, "Duplicate service connection request from localAgentId " + i2);
                    a(j2, str3, i2, i3, 5, false, aVar.d);
                    return;
                }
            }
            Map<Long, i> map = l;
            synchronized (map) {
                i iVar = map.get(Long.valueOf(jA));
                long j4 = jA;
                if (iVar != null && iVar.m == 3) {
                    com.heytap.accessory.base.logging.a.e(str5, "Termination request in progress and hence ignoring for" + i2);
                    return;
                }
                if (bVarF.A() == 11 && frameworkServiceDescriptionB.l() != 1) {
                    com.heytap.accessory.base.logging.a.e(str5, "Accessory has been already locked for acceptor ID: " + i3 + " localAgentId " + i2 + " Profile ID " + str3);
                    return;
                }
                if (h(aVar.a, j2)) {
                    com.heytap.accessory.base.logging.a.e(str5, "Service connection has been reached max, rejecting...");
                    a(j2, str3, i2, i3, 1, true, aVar.d);
                    return;
                }
                a(aVar.a, j2);
                if (frameworkServiceDescriptionB.l() == 0) {
                    String strB = b(String.valueOf(aVar.a));
                    a(bVarF, 3);
                    r(j2);
                    a(j2, strB);
                }
                List<FrameworkServiceChannelDescription> listF = frameworkServiceDescriptionB.f();
                boolean z3 = true;
                int i4 = 0;
                while (true) {
                    if (i4 >= aVar.g) {
                        frameworkServiceDescription = frameworkServiceDescriptionB;
                        break;
                    }
                    long j5 = aVar.c.get(i4).a;
                    if (listA.contains(Integer.valueOf((int) j5))) {
                        List<Integer> list2 = listA;
                        long jLongValue = aVar.d.get(i4).longValue();
                        frameworkServiceDescription = frameworkServiceDescriptionB;
                        com.heytap.accessory.session.a aVarD = com.heytap.accessory.session.a.d(j2);
                        boolean zA = aVarD.a(jLongValue, true);
                        if (!zA) {
                            aVarD.e();
                            com.heytap.accessory.base.logging.a.e(i, "Session ID collision detected. Rejecting the service connection request!");
                            z3 = zA;
                            break;
                        }
                        arrayMap.put(Long.valueOf(j5), aVarD);
                        Iterator<FrameworkServiceChannelDescription> it2 = listF.iterator();
                        int iB = -1;
                        while (it2.hasNext()) {
                            FrameworkServiceChannelDescription next2 = it2.next();
                            Iterator<FrameworkServiceChannelDescription> it3 = it2;
                            if (next2.a() == j5) {
                                iB = next2.b();
                            }
                            it2 = it3;
                        }
                        if (iB == -1) {
                            iB = 1;
                        }
                        list = list2;
                        a(j2, aVarD, aVar.c.get(i4).c.b, iB, bVarF.h(), bVarF.H(), bVarF.C(), bVarF.g());
                        z3 = zA;
                    } else {
                        list = listA;
                        frameworkServiceDescription = frameworkServiceDescriptionB;
                    }
                    i4++;
                    listA = list;
                    i3 = i3;
                    frameworkServiceDescriptionB = frameworkServiceDescription;
                    bVarF = bVarF;
                    i2 = i2;
                    j4 = j4;
                }
                int i5 = i3;
                if (!z3) {
                    for (Map.Entry entry : arrayMap.entrySet()) {
                        d(j2, (com.heytap.accessory.session.a) entry.getValue());
                        ((com.heytap.accessory.session.a) entry.getValue()).e();
                    }
                    arrayMap.clear();
                    a(j2, str3, i2, i5, 3, true, aVar.d);
                    return;
                }
                synchronized (j) {
                    q.put(Long.valueOf(j4), arrayMap);
                    str = i;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("ChannelToSessionMap add connectionId:");
                    j3 = j4;
                    sb3.append(j3);
                    sb3.append(",sessionMap:");
                    sb3.append(arrayMap);
                    com.heytap.accessory.base.logging.a.c(str, sb3.toString());
                    if (num == null) {
                        numValueOf = 6;
                    } else {
                        numValueOf = Integer.valueOf(num.intValue() | 4);
                    }
                    u.put(Long.valueOf(j3), numValueOf);
                }
                List<Long> copyOnWriteArrayList = o.get(Long.valueOf(j2));
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    o.put(Long.valueOf(j2), copyOnWriteArrayList);
                    com.heytap.accessory.base.logging.a.c(str, "processCreateServiceConnectionRequest AccessoryComponentsMap add accessoryId:" + j2 + ",connectionId:" + j3);
                }
                List<Long> list3 = copyOnWriteArrayList;
                synchronized (list3) {
                    list3.add(Long.valueOf(j3));
                }
                if ((numValueOf.intValue() & 1) != 0 && (numValueOf.intValue() & 2) != 0) {
                    com.heytap.accessory.base.logging.a.a(str, "else ,putConnectionRecord,connectionId:" + j3);
                    a(j2, str3, i2, i5, (com.heytap.accessory.session.d) null, 0, true);
                    return;
                }
                int i6 = i2;
                a(j2, str3, i6, i5, frameworkServiceDescription.h());
                j jVar2 = new j();
                jVar2.d = new ArrayMap();
                jVar2.b = new ArrayMap();
                jVar2.i = false;
                jVar2.a = j2;
                jVar2.g = i6;
                jVar2.h = i5;
                jVar2.m = str3;
                jVar2.j = false;
                jVar2.n = m();
                com.heytap.accessory.base.logging.a.a(str, "if ,putConnectionRecord,connectionId:" + j3 + ",transactionId:" + jVar2.n);
                a(j3, jVar2);
                if (this.d != null) {
                    a(j2, i6, i5, str3, jVar2.n, frameworkServiceDescription);
                    return;
                }
                return;
            }
        }
        com.heytap.accessory.base.logging.a.b(i, "Remote and Local channel has no common channel, remote channelId:" + aVar.c);
        a(j2, str3, i2, i3, 35, true, aVar.d);
    }

    public final void d(long j2, com.heytap.accessory.session.params.a aVar) {
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(aVar.e), String.valueOf(aVar.a));
        com.heytap.accessory.session.c cVarRemove = p.remove(Long.valueOf(jA));
        if (cVarRemove == null) {
            com.heytap.accessory.base.logging.a.e(i, "Authenticate Listener corresponding to connection id: " + jA + ", not found!");
            return;
        }
        Buffer buffer = aVar.b;
        if (buffer != null) {
            byte[] buffer2 = buffer.getBuffer();
            int offset = aVar.b.getOffset();
            byte b2 = buffer2[offset + 1];
            int i2 = ((buffer2[offset + 2] & 255) << 8) | (buffer2[offset + 3] & 255);
            if (i2 > 0) {
                int i3 = offset + 4;
                if (buffer2.length >= i3 + i2) {
                    byte[] bArr = new byte[i2];
                    com.heytap.accessory.base.logging.a.a(i, "Total Length=" + buffer2.length + "; offset=" + offset + "; len computed=" + i2);
                    SystemUtils.arraycopy(buffer2, i3, bArr, 0, i2);
                    cVarRemove.a(b2, bArr);
                    return;
                }
            }
            com.heytap.accessory.base.logging.a.b(i, "Invalid certificate length. Total Length=" + buffer2.length + "; offset=" + offset + "; len computed=" + i2);
        } else {
            com.heytap.accessory.base.logging.a.e(i, "params.certificate is invalid!");
        }
        cVarRemove.a(1289, null);
    }

    public void a(com.heytap.accessory.base.c cVar) {
        this.d = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0227  */
    public int a(long j2, String str, int i2, int i3, long j3, List<FrameworkServiceChannelDescription> list, com.heytap.accessory.session.d dVar, int i4, int i5) {
        Map<Long, com.heytap.accessory.session.a> map;
        Map<Long, com.heytap.accessory.session.a> map2;
        boolean z2;
        boolean zA;
        int i6;
        Map<Long, com.heytap.accessory.session.a> map3;
        if (f(j2) == null) {
            com.heytap.accessory.base.logging.a.e(i, "create service connection without accessory " + j2);
            return 0;
        }
        Map<Long, i> map4 = l;
        synchronized (map4) {
            i iVar = map4.get(Long.valueOf(j3));
            if (iVar != null && iVar.m == 3) {
                com.heytap.accessory.base.logging.a.e(i, "create service connection when closure in progress.");
                return 0;
            }
            if (i2 != 65535) {
                long j4 = i2;
                if (h(j4, j2)) {
                    this.b = 4641;
                    return 0;
                }
                a(j4, j2);
            }
            if (u.get(Long.valueOf(j3)) == null) {
                u.put(Long.valueOf(j3), 1);
            } else {
                u.put(Long.valueOf(j3), Integer.valueOf(u.get(Long.valueOf(j3)).intValue() | 1));
            }
            String str2 = i;
            com.heytap.accessory.base.logging.a.c(str2, "[agent_connect]Local app creates SC (" + i2 + ", " + i3 + ") " + str);
            this.b = 0;
            if ((u.get(Long.valueOf(j3)).intValue() & 2) == 0) {
                Map<Long, com.heytap.accessory.session.a> mapA = a(list, j2);
                synchronized (j) {
                    q.put(Long.valueOf(j3), mapA);
                }
                if (u.get(Long.valueOf(j3)) == null) {
                    u.put(Long.valueOf(j3), 9);
                } else {
                    u.put(Long.valueOf(j3), Integer.valueOf(u.get(Long.valueOf(j3)).intValue() | 8));
                }
                map2 = mapA;
                z2 = true;
            } else {
                com.heytap.accessory.base.logging.a.c(str2, "Waiting for remote sessions to be configured for connectionId: " + j3);
                synchronized (j) {
                    map = q.get(Long.valueOf(j3));
                }
                if (map == null) {
                    com.heytap.accessory.base.logging.a.e(str2, "Session map not found for connectionId: " + j3);
                    return 0;
                }
                map2 = map;
                z2 = false;
            }
            if ((u.get(Long.valueOf(j3)).intValue() & 1) != 0) {
                i6 = 2;
                if ((u.get(Long.valueOf(j3)).intValue() & 2) != 0) {
                    com.heytap.accessory.base.logging.a.e(str2, "Remote peer has already initiated a service connection for connectionId: " + j3);
                    if (z2) {
                        a(j2, map2.values());
                    }
                    j(i2, j2);
                    com.heytap.accessory.base.logging.a.c(str2, "Waiting for remote sessions to be configured again!! connectionId: " + j3);
                    com.heytap.accessory.base.logging.a.e(str2, "Remote sessions are configured! Proceeding with accept for connectionId: " + j3);
                    ArrayList arrayList = new ArrayList();
                    synchronized (j) {
                        Map<Long, com.heytap.accessory.session.a> map5 = q.get(Long.valueOf(j3));
                        if (map5 == null) {
                            com.heytap.accessory.base.logging.a.e(str2, "Cannot accept a connection. Session map not found for connectionId: " + j3);
                            return 0;
                        }
                        Iterator<com.heytap.accessory.session.a> it = map5.values().iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(it.next().a()));
                        }
                        a(j2, str, i2, i3, (List<Long>) arrayList, true);
                        map3 = map5;
                        zA = true;
                    }
                } else {
                    zA = a(j2, str, i2, i3, j3, list, map2, i4, i5);
                    i6 = 1;
                    map3 = map2;
                }
            } else {
                zA = a(j2, str, i2, i3, j3, list, map2, i4, i5);
                i6 = 1;
                map3 = map2;
            }
            return a(j2, j3, map3, dVar, zA, i6);
        }
    }

    public Map<Long, com.heytap.accessory.session.a> g(long j2) {
        Map<Long, com.heytap.accessory.session.a> arrayMap;
        synchronized (j) {
            if (q.containsKey(Long.valueOf(j2))) {
                arrayMap = q.get(Long.valueOf(j2));
            } else {
                arrayMap = new ArrayMap<>();
            }
        }
        return arrayMap;
    }

    public j h(long j2) {
        com.heytap.accessory.base.logging.a.a(i, "getConnectionRecord " + j2);
        return t.get(Long.valueOf(j2));
    }

    public boolean c(long j2) {
        d(j2);
        return com.heytap.accessory.transport.d.f().b(j2);
    }

    public void c(long j2, long j3) {
        com.heytap.accessory.session.a aVarE = e(j2, j3);
        if (aVarE != null) {
            aVarE.g();
            com.heytap.accessory.transport.b bVarC = aVarE.c();
            if (bVarC != null) {
                Map<Integer, com.heytap.accessory.transport.e> map = n;
                synchronized (map) {
                    com.heytap.accessory.transport.e eVar = map.get(Integer.valueOf(bVarC.b()));
                    if (eVar == null) {
                        eVar = map.get(1);
                    }
                    eVar.b(bVarC);
                }
                bVarC.v();
            }
        }
        com.heytap.accessory.transport.d.f().b(j2, j3);
    }

    public String b(String str) {
        return com.heytap.accessory.sdp.service.b.g().c(str);
    }

    public void b(long j2, long j3) {
        i iVarS;
        synchronized (l) {
            iVarS = s(j2);
        }
        if (iVarS != null) {
            z.removeCallbacks(iVarS);
        }
        List<Long> list = o.get(Long.valueOf(j3));
        if (list == null) {
            com.heytap.accessory.base.logging.a.e(i, "List of connection Ids is null!");
            return;
        }
        synchronized (list) {
            if (list.contains(Long.valueOf(j2))) {
                list.remove(Long.valueOf(j2));
                u.remove(Long.valueOf(j2));
                com.heytap.accessory.session.d dVar = s.get(Long.valueOf(j2));
                if (dVar != null) {
                    dVar.a(j3, String.valueOf(j2), 0);
                    return;
                }
                com.heytap.accessory.base.logging.a.e(i, "Listener for connection id: " + j2 + " not found!");
                return;
            }
            com.heytap.accessory.base.logging.a.e(i, "Connection id: " + j2 + " not found!");
        }
    }

    public final void b(long j2, String str, int i2, int i3, int i4) {
        Map<Long, com.heytap.accessory.session.a> mapRemove;
        i iVarS;
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        String str2 = i;
        com.heytap.accessory.base.logging.a.c(str2, "Acceptor ID " + i3 + " rejected the service connection request by initiator ID " + i2 + " Status code: " + i4 + "; connectionId: " + jA);
        if (!a(jA, 1)) {
            com.heytap.accessory.base.logging.a.e(str2, "Received a rejection response for a service connection that has expired! Ignoring ...");
            return;
        }
        synchronized (j) {
            mapRemove = q.remove(Long.valueOf(jA));
            com.heytap.accessory.base.logging.a.c(str2, "ChannelToSessionMap remove connectionId:" + jA);
        }
        if (mapRemove != null) {
            Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = mapRemove.entrySet().iterator();
            while (it.hasNext()) {
                com.heytap.accessory.session.a value = it.next().getValue();
                d(j2, value);
                value.e();
            }
        }
        synchronized (l) {
            iVarS = s(jA);
        }
        synchronized (k) {
            if (iVarS != null) {
                if (1 == iVarS.m) {
                    z.removeCallbacks(iVarS);
                    iVarS.d = 0;
                    iVarS.k = false;
                    iVarS.o = 4;
                }
            }
        }
        List<Long> list = o.get(Long.valueOf(j2));
        com.heytap.accessory.session.d dVar = s.get(Long.valueOf(jA));
        if (i4 != 5 && i4 != 4 && list != null) {
            synchronized (list) {
                list.remove(Long.valueOf(jA));
            }
        }
        if (3 == i4) {
            if (iVarS == null || dVar == null) {
                return;
            }
            int i5 = iVarS.g;
            if (i5 <= 1) {
                iVarS.g = i5 + 1;
                com.heytap.accessory.base.logging.a.e(i, "Reattempt (#" + iVarS.g + " of 10)");
                j((long) i2, j2);
                a(j2, str, i2, i3, jA, iVarS.e, dVar, iVarS.g, iVarS.f);
                return;
            }
            this.b = 4640;
            dVar.a(j2, String.valueOf(i2), String.valueOf(i3), this.b);
            s.remove(Long.valueOf(jA));
            return;
        }
        if (i4 == 5) {
            com.heytap.accessory.base.logging.a.e(i, "Service Connection already exists on remote side for initiator: " + i2);
            this.b = 4613;
            if (dVar != null) {
                dVar.a(j2, String.valueOf(i2), String.valueOf(i3), this.b);
                return;
            }
            return;
        }
        if (i4 == 4) {
            com.heytap.accessory.base.logging.a.e(i, "Service Connection timed out on remote side for initiator: " + i2);
            this.b = 4627;
            if (dVar != null) {
                dVar.a(j2, String.valueOf(i2), String.valueOf(i3), this.b);
                return;
            }
            return;
        }
        if (i4 == 1) {
            this.b = 4628;
        } else if (i4 == 34) {
            this.b = 4642;
        } else if (i4 == 35) {
            this.b = BaseAgent.CONNECTION_FAILURE_CHANNELID_MISMATCH;
        } else {
            this.b = i4;
        }
        if (dVar != null) {
            dVar.a(j2, String.valueOf(i2), String.valueOf(i3), this.b);
            s.remove(Long.valueOf(jA));
        }
    }

    public final int a(long j2, long j3, Map<Long, com.heytap.accessory.session.a> map, com.heytap.accessory.session.d dVar, boolean z2, int i2) {
        String str;
        if (z2) {
            synchronized (j) {
                str = i;
                com.heytap.accessory.base.logging.a.a(str, "processCreateServiceConnectionResult add connectionId:" + j3 + ",sessionMap:" + map);
                q.put(Long.valueOf(j3), map);
            }
            s.put(Long.valueOf(j3), dVar);
            List<Long> copyOnWriteArrayList = o.get(Long.valueOf(j2));
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                o.put(Long.valueOf(j2), copyOnWriteArrayList);
                com.heytap.accessory.base.logging.a.c(str, "process SC result AccessoryComponentsMap put accessoryId:" + j2 + ",connectionId:" + j3);
            }
            synchronized (copyOnWriteArrayList) {
                copyOnWriteArrayList.add(Long.valueOf(j3));
            }
            if (i2 == -1) {
                return 1;
            }
            return i2;
        }
        this.b = 4626;
        u.remove(Long.valueOf(j3));
        Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            com.heytap.accessory.session.a value = it.next().getValue();
            d(j2, value);
            value.e();
        }
        synchronized (j) {
            q.remove(Long.valueOf(j3));
        }
        return 0;
    }

    public boolean a(String str, String str2, String str3, long j2, com.heytap.accessory.session.c cVar) {
        long jA = com.heytap.accessory.misc.utils.c.a(j2, str, str2);
        p.put(Long.valueOf(jA), cVar);
        com.heytap.accessory.base.logging.a.c(i, "Sending app authenticate message to " + str2 + " ,from agent Id " + str + " for profile " + str3 + " to accessory " + j2 + " connectionId " + jA);
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.f = (byte) 5;
        aVar.e = Integer.parseInt(str);
        aVar.a = Integer.parseInt(str2);
        aVar.h = str3.getBytes(Charset.forName("UTF-8"));
        return a(j2, com.heytap.accessory.session.b.a(aVar, j2));
    }

    public Map<Long, com.heytap.accessory.session.a> a(long j2, String str, int i2, int i3, com.heytap.accessory.session.d dVar, int i4, boolean z2) {
        ArrayMap arrayMap = new ArrayMap();
        this.b = 0;
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        if (!z2 && !a(jA, 2)) {
            com.heytap.accessory.base.logging.a.e(i, "Service connection response time has expired! Service connection for localAgentId " + i2 + " ,acceptor Id " + i3 + " for profile " + str + " to accessory " + j2 + " connectionId " + jA + " did not go through !!");
            return arrayMap;
        }
        this.b = 0;
        synchronized (l) {
            i iVarS = s(jA);
            if (iVarS != null) {
                z.removeCallbacks(iVarS);
            }
        }
        if (dVar != null) {
            s.put(Long.valueOf(jA), dVar);
        }
        if (i4 == 0) {
            com.heytap.accessory.base.logging.a.a(i, "Accepting SC req (" + i2 + ", " + i3 + ") " + str + " conn:" + jA);
            return b(j2, str, i2, i3);
        }
        a(j2, str, i2, i3, i4, true, (List<Long>) new ArrayList());
        return arrayMap;
    }

    public boolean b(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.session.a aVarI = i(bVar.l());
        if (aVarI == null) {
            com.heytap.accessory.base.logging.a.b(i, "Default session not present");
            return false;
        }
        com.heytap.accessory.base.logging.a.d(i, "Reconfiguring default session");
        a(bVar.l(), aVarI, 3, 3, bVar.h(), bVar.H(), bVar.C(), bVar.g());
        return com.heytap.accessory.transport.d.f().a(bVar);
    }

    public void b(i iVar) {
        int i2 = iVar.m;
        if (i2 == 1) {
            iVar.o = 2;
            iVar.j = true;
            com.heytap.accessory.base.logging.a.d(i, "Successfully enqueued the connection request for " + iVar.i);
            z.postDelayed(iVar, (((long) iVar.f) * 1000) + 10000);
            return;
        }
        if (i2 == 3) {
            z.postDelayed(iVar, 10000L);
            return;
        }
        com.heytap.accessory.base.logging.a.e(i, "Should not have enetered here!!! request code is " + iVar.m + " for initiator id " + iVar.i);
    }

    public final void b(int i2) {
        w.put(Integer.valueOf(i2), com.heytap.accessory.base.thread.a.b().a("session-dequeHandler" + i2));
    }

    public boolean a(long j2, String str, int i2, int i3) {
        String str2 = i;
        com.heytap.accessory.base.logging.a.c(str2, "Attempt to close SC - (" + i2 + ", " + i3 + ") profile: " + str + " accessory: " + j2);
        this.b = 0;
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.f = (byte) 3;
        aVar.h = str.getBytes(StandardCharsets.UTF_8);
        j jVar = t.get(Long.valueOf(jA));
        if (jVar != null && jVar.j) {
            aVar.e = i2;
            aVar.a = i3;
        } else {
            aVar.e = i3;
            aVar.a = i2;
        }
        a aVar2 = new a(i2, i3, jA, j2);
        synchronized (k) {
            aVar2.m = 3;
            aVar2.o = 1;
            aVar2.b = j2;
            aVar2.i = i2;
            aVar2.a = i3;
            aVar2.h = jA;
            aVar2.d = 0;
        }
        Map<Long, i> map = l;
        synchronized (map) {
            i iVar = map.get(Long.valueOf(jA));
            if (iVar != null) {
                if (iVar.m == 3) {
                    return false;
                }
                s(jA);
                z.removeCallbacks(iVar);
            }
            synchronized (map) {
                com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
                if (bVarA != null && bVarA.A() == 10) {
                    com.heytap.accessory.base.logging.a.a(str2, "current accessoryId:" + j2 + " is connected!");
                    a(jA, aVar2);
                } else {
                    com.heytap.accessory.base.logging.a.c(str2, "current accessoryId:" + j2 + " not connected,no need to putTimeoutRunnable");
                }
            }
            z.postDelayed(aVar2, 10000L);
            com.heytap.accessory.message.a aVarA = com.heytap.accessory.session.f.a(aVar, j2);
            if (a(j2, aVarA)) {
                return true;
            }
            this.b = 4886;
            boolean zA = a(j2, aVarA, aVar2);
            if (!zA) {
                synchronized (map) {
                    s(j2);
                }
                z.removeCallbacks(aVar2);
            }
            return zA;
        }
    }

    public boolean a(long j2, int i2) {
        boolean z2;
        Map<Long, i> map = l;
        synchronized (map) {
            i iVar = map.get(Long.valueOf(j2));
            String str = i;
            StringBuilder sb = new StringBuilder();
            sb.append("runnable is not null:");
            z2 = true;
            sb.append(iVar != null);
            sb.append(", statusCode:");
            sb.append(i2);
            com.heytap.accessory.base.logging.a.a(str, sb.toString());
            if (iVar == null || iVar.m != i2) {
                z2 = false;
            } else {
                com.heytap.accessory.base.logging.a.a(str, "runnable.mRequestCode:" + iVar.m);
            }
        }
        return z2;
    }

    public void a(long j2, com.heytap.accessory.session.a aVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        com.heytap.accessory.transport.d.f().a(j2, aVar.a(), i2, i3, i4, i5, i6, i7);
        aVar.a(com.heytap.accessory.transport.b.r());
        aVar.c().a(aVar.a(), i3, i4);
        com.heytap.accessory.base.logging.a.a(i, "[sessionConfig] receiverQueue " + aVar.a() + ", obj:" + aVar.c());
    }

    public int a(long j2, com.heytap.accessory.session.a aVar, com.heytap.accessory.message.a aVar2) {
        int iA;
        if (aVar == null) {
            return 0;
        }
        synchronized (aVar) {
            com.heytap.accessory.transport.control.c.a();
            iA = com.heytap.accessory.transport.d.f().a(j2, aVar2);
            if (iA == -1) {
                aVar.e(j2);
            }
        }
        if (iA != -2) {
            return iA;
        }
        g(j2, aVar2.j());
        return iA;
    }

    public void a(com.heytap.accessory.session.a aVar, com.heytap.accessory.session.e eVar) {
        if (aVar != null) {
            synchronized (g) {
                aVar.a(eVar);
                if (aVar.c() != null && !aVar.c().o()) {
                    a(aVar.c(), (com.heytap.accessory.message.b) null);
                }
            }
        }
    }

    public boolean a(long j2, com.heytap.accessory.message.a aVar) {
        return (n(j2) ? com.heytap.accessory.transport.d.f().a(j2, aVar) : 0) == 0;
    }

    public final boolean a(long j2, com.heytap.accessory.message.a aVar, i iVar) {
        f fVar;
        com.heytap.accessory.base.logging.a.e(i, "Could not enqueue at TL hence queuing at Session Queue");
        synchronized (m) {
            fVar = v.get(Long.valueOf(j2));
        }
        if (fVar == null) {
            return false;
        }
        fVar.b.e(j2);
        if (fVar.a == null) {
            return false;
        }
        g gVar = new g(null);
        gVar.a = aVar;
        gVar.b = iVar;
        fVar.a.add(gVar);
        return true;
    }

    public void a(com.heytap.accessory.message.b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(i, "handleDefaultSessionMessage error, item is null");
            return;
        }
        long jA = bVar.a();
        long jE = bVar.e();
        if (jE != 1) {
            com.heytap.accessory.base.logging.a.e(i, "Received a message with incorrect session ID (" + jE + ") on the reserved session");
            return;
        }
        com.heytap.accessory.message.a aVarC = bVar.c();
        if (!f && aVarC == null) {
            throw new AssertionError();
        }
        com.heytap.accessory.session.params.a aVarA = com.heytap.accessory.misc.utils.d.a(aVarC, jA);
        if (aVarA == null) {
            com.heytap.accessory.base.logging.a.e(i, "handleDefaultSessionMessage error, ProtocolMessageParams is null");
            return;
        }
        byte[] bArr = aVarA.h;
        String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : "empty profile";
        switch (aVarA.f) {
            case 1:
                com.heytap.accessory.base.logging.a.c(i, "SC req from REMOTE (" + aVarA.e + ", " + aVarA.a + ") " + str);
                e(jA, aVarA);
                return;
            case 2:
                com.heytap.accessory.base.logging.a.c(i, "SC rsp from REMOTE " + str);
                f(jA, aVarA);
                return;
            case 3:
                com.heytap.accessory.base.logging.a.c(i, "TERM req from REMOTE (" + aVarA.e + ", " + aVarA.a + ") " + str);
                g(jA, aVarA);
                return;
            case 4:
                com.heytap.accessory.base.logging.a.c(i, "TERM resp from REMOTE (" + aVarA.e + ", " + aVarA.a + ") " + str);
                h(jA, aVarA);
                return;
            case 5:
                com.heytap.accessory.base.logging.a.c(i, "Received an authenticate request message for sevice connection initiated by " + aVarA.e + " acceptor " + aVarA.a + " profile " + str + " accessory " + jA);
                c(jA, aVarA);
                return;
            case 6:
                com.heytap.accessory.base.logging.a.c(i, "Received a response to the authenticate request for service connection initiated by " + aVarA.e + " acceptor " + aVarA.a + " profile " + str + " accessory " + jA);
                d(jA, aVarA);
                return;
            case 7:
                com.heytap.accessory.base.logging.a.c(i, "set acc status req from REMOTE (" + aVarA.e + ", " + aVarA.a + ") ,set accessory state");
                a(jA, aVarA);
                return;
            case 8:
                com.heytap.accessory.base.logging.a.c(i, "set acc status rsp from REMOTE (" + aVarA.e + ", " + aVarA.a + ") ,set accessory state");
                b(jA, aVarA);
                return;
            default:
                com.heytap.accessory.base.logging.a.e(i, "Received an unknown message type! Returning ...");
                return;
        }
    }

    public final void a(long j2, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.base.logging.a.a(i + " - SLPTrack", "receive setState request, accessoryId = " + j2 + "; ProtocolMessageParams = " + aVar);
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        if (aVar == null) {
            aVar2.i = (byte) 1;
        }
        if (aVar != null) {
            com.heytap.accessory.connectivity.core.b.e().a(j2, aVar.j == 1);
            a(j2, aVar.i, aVar.e, aVar.a);
            aVar2.f = (byte) 8;
            aVar2.a = aVar.e;
            aVar2.e = aVar.a;
            aVar2.i = (byte) 0;
            aVar2.g = 0;
        }
    }

    public final void a(long j2, int i2, int i3, int i4) {
        com.heytap.accessory.base.bean.a aVar = new com.heytap.accessory.base.bean.a(j2, 5);
        aVar.a(i4, i3);
        this.d.a(aVar);
    }

    public final byte[] a(String str) {
        return PlatformUtils.getApplicationCertificate(str);
    }

    public boolean a(long j2, int i2, int i3, boolean z2) {
        com.heytap.accessory.base.logging.a.a(i + " - SLPTrack", "setAccessoryStatus, isDormant:" + z2);
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.f = (byte) 7;
        aVar.e = i2;
        aVar.a = i3;
        aVar.j = z2 ? (byte) 1 : (byte) 0;
        aVar.g = 0;
        return a(j2, com.heytap.accessory.session.f.g(j2, 1L, aVar));
    }

    public final void a(long j2, long j3, long j4) {
        i iVarS;
        Map<Long, Object> map;
        synchronized (l) {
            iVarS = s(j4);
        }
        if (iVarS != null) {
            z.removeCallbacks(iVarS);
        }
        i(j2, j4);
        List<Long> list = o.get(Long.valueOf(j2));
        if (list != null) {
            synchronized (list) {
                list.remove(Long.valueOf(j4));
            }
        }
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        String strB = b(String.valueOf(j3));
        if (bVarA != null && bVarA.A() == 11 && bVarA.r().equals(strB)) {
            e(j2);
        }
        j jVarQ = q(j4);
        if (jVarQ == null || (map = jVarQ.b) == null) {
            return;
        }
        map.clear();
    }

    public void a(long j2, String str, int i2, int i3, int i4, boolean z2, List<Long> list) {
        com.heytap.accessory.base.logging.a.e(i, "Rejecting service connection from initiator ID: " + i2 + " Acceptor: " + i3 + " profile " + str + " accessoryId " + j2 + "; errorCode: " + i4);
        if (z2) {
            this.b = 0;
            long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
            synchronized (j) {
                q.get(Long.valueOf(jA));
            }
            if (i4 != 1 && i4 != 4) {
                j(i3, j2);
            }
            u.remove(Long.valueOf(jA));
            i(j2, jA);
            List<Long> list2 = o.get(Long.valueOf(j2));
            if (list2 != null) {
                synchronized (list2) {
                    list2.remove(Long.valueOf(jA));
                }
            }
            q(jA);
        }
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.i = (byte) i4;
        aVar.f = (byte) 2;
        aVar.a = i2;
        aVar.e = i3;
        aVar.h = str.getBytes(StandardCharsets.UTF_8);
        aVar.d = list;
        aVar.g = list.size();
        this.b = a(j2, com.heytap.accessory.session.f.b(aVar, j2)) ? 0 : 5656;
    }

    public final void a(long j2, String str, int i2, int i3, int i4) {
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        b bVar = new b(jA, str);
        synchronized (k) {
            bVar.m = 2;
            bVar.o = 0;
            bVar.b = j2;
            bVar.h = jA;
            bVar.i = i2;
            bVar.a = i3;
            bVar.j = false;
            bVar.k = false;
            bVar.d = 0;
        }
        synchronized (l) {
            com.heytap.accessory.base.logging.a.a(i, "processCreateServiceConnectionRequest putTimeoutRunnable:" + jA);
            a(jA, bVar);
        }
        z.postDelayed(bVar, i4 != 0 ? ((long) i4) * 1000 : 10000L);
    }

    public final void a(long j2, String str) {
        com.heytap.accessory.base.bean.b bVarF = f(j2);
        if (bVarF != null) {
            String str2 = i;
            com.heytap.accessory.base.logging.a.a(str2, "Channel has been locked for accessory " + j2);
            com.heytap.accessory.base.logging.a.a(str2, "Setting privilege package to " + str);
            bVarF.l(11);
            bVarF.i(str);
            p(j2);
        }
    }

    public void a(long j2) {
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(BtRfConnection.MAXIMUM_PAYLOAD_SIZE_IN_BYTES), String.valueOf(BtRfConnection.MAXIMUM_PAYLOAD_SIZE_IN_BYTES));
        u.remove(Long.valueOf(jA));
        s.remove(Long.valueOf(jA));
        o.remove(Long.valueOf(j2));
        synchronized (j) {
            q.remove(Long.valueOf(jA));
        }
        com.heytap.accessory.base.logging.a.c(i, "Capability cleanup done for accessoryId : " + j2);
    }

    public final void a(com.heytap.accessory.base.bean.b bVar, int i2) {
        AccessoryManager.h().a(bVar, true, i2);
    }

    public final void a(long j2, long j3) {
        if (x.containsKey(Long.valueOf(j2))) {
            Map<Long, Integer> map = x.get(Long.valueOf(j2));
            if (!map.containsKey(Long.valueOf(j3))) {
                map.put(Long.valueOf(j3), 1);
                com.heytap.accessory.base.logging.a.a(i, "ConnectionLimit : Added AccessoryId: " + j3 + " into component map for ComponentId: " + j2);
            } else {
                map.put(Long.valueOf(j3), Integer.valueOf(map.get(Long.valueOf(j3)).intValue() + 1));
                com.heytap.accessory.base.logging.a.a(i, "ConnectionLimit : Incremented the  remote conection count for AccessoryId: " + j3 + " for ComponentId: " + j2 + " to " + map.get(Long.valueOf(j3)));
            }
            x.put(Long.valueOf(j2), map);
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Long.valueOf(j3), 1);
        x.put(Long.valueOf(j2), arrayMap);
    }

    public final void a(long j2, int i2, int i3, String str, long j3, FrameworkServiceDescription frameworkServiceDescription) {
        com.heytap.accessory.base.bean.a aVar = new com.heytap.accessory.base.bean.a(j2, 2);
        aVar.a(str, i3, i2, j3, frameworkServiceDescription);
        this.d.a(aVar);
    }

    public final void a(long j2, e eVar) {
        synchronized (h) {
            if (this.a.containsKey(Long.valueOf(j2))) {
                com.heytap.accessory.base.logging.a.e(i, "Closure request already in progress for connection id : " + j2 + "...");
                return;
            }
            synchronized (j) {
                Map<Long, com.heytap.accessory.session.a> map = q.get(Long.valueOf(j2));
                if (map == null) {
                    com.heytap.accessory.base.logging.a.e(i, "Can't find the session map for connectionId: " + j2);
                } else {
                    Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        com.heytap.accessory.session.a value = it.next().getValue();
                        com.heytap.accessory.transport.b bVarC = value.c();
                        if (bVarC != null && !bVarC.o()) {
                            eVar.e.add(Long.valueOf(value.a()));
                            bVarC.b(3);
                            bVarC.b(true);
                        }
                    }
                }
            }
            if (!eVar.e.isEmpty()) {
                synchronized (h) {
                    this.a.put(Long.valueOf(j2), eVar.e);
                    r.put(Long.valueOf(j2), eVar);
                }
                com.heytap.accessory.base.logging.a.c(i, "waiting for sessions to flush...");
                return;
            }
            String str = i;
            com.heytap.accessory.base.logging.a.d(str, "No sessions to flush, proceeding session closure immediately");
            if (s.get(Long.valueOf(j2)) != null) {
                b(j2, eVar.b);
            } else {
                com.heytap.accessory.base.logging.a.e(str, "SC Termination received before accept!!");
                a(eVar.b, eVar.a, j2);
            }
            a(eVar);
        }
    }

    public final void a(e eVar) {
        String str = i;
        com.heytap.accessory.base.logging.a.a(str, "Send response to SC close");
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.f = (byte) 4;
        aVar.i = (byte) 0;
        aVar.e = (int) eVar.c;
        aVar.a = (int) eVar.a;
        aVar.h = eVar.d;
        com.heytap.accessory.message.a aVarA = com.heytap.accessory.session.f.a(aVar, eVar.b);
        if (aVarA == null) {
            com.heytap.accessory.base.logging.a.b(str, "failed to sending msg by invalid responsing message for closing service!");
        } else if (n(eVar.b)) {
            com.heytap.accessory.transport.d.f().a(eVar.b, aVarA);
        }
    }

    public Map<Long, com.heytap.accessory.session.a> a(List<FrameworkServiceChannelDescription> list, long j2) {
        ArrayMap arrayMap = new ArrayMap();
        for (FrameworkServiceChannelDescription frameworkServiceChannelDescription : list) {
            if (frameworkServiceChannelDescription != null) {
                com.heytap.accessory.session.a aVarD = com.heytap.accessory.session.a.d(j2);
                arrayMap.put(Long.valueOf(frameworkServiceChannelDescription.a()), aVarD);
                com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
                if (bVarA != null) {
                    a(j2, aVarD, frameworkServiceChannelDescription.d(), frameworkServiceChannelDescription.b(), bVarA.h(), bVarA.H(), bVarA.C(), bVarA.g());
                }
            }
        }
        return arrayMap;
    }

    public boolean a(long j2, String str, int i2, int i3, long j3, List<FrameworkServiceChannelDescription> list, Map<Long, com.heytap.accessory.session.a> map, int i4, int i5) {
        com.heytap.accessory.base.logging.a.a(i, "sendServiceConnectionCreationRequest. accessoryId = " + j2 + "; profileId = " + str + "; initiatorId = " + i2 + "; acceptorId = " + i3 + "; connectionId = " + j3);
        com.heytap.accessory.session.params.a aVarA = a(str, i2, i3, list, map);
        c cVar = new c(i5, j2);
        ArrayList arrayList = new ArrayList(map.values());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((com.heytap.accessory.session.a) it.next()).a()));
        }
        arrayList.clear();
        synchronized (k) {
            cVar.m = 1;
            com.heytap.accessory.message.a aVarB = com.heytap.accessory.session.f.b(aVarA, j2);
            cVar.l = aVarB;
            if (aVarB == null) {
                com.heytap.accessory.base.logging.a.b(i, "failed to request for serviceCreation by Invalid responsing message!");
                return false;
            }
            cVar.o = 0;
            cVar.g = i4;
            cVar.b = j2;
            cVar.h = j3;
            cVar.i = i2;
            cVar.a = i3;
            cVar.e = list;
            cVar.n = arrayList2;
            cVar.f = i5;
            cVar.c = 0;
            cVar.j = false;
            cVar.k = false;
            cVar.d = 0;
            synchronized (l) {
                a(j3, cVar);
            }
            return z.post(cVar);
        }
    }

    public final boolean a(i iVar) {
        return iVar.d >= 10;
    }

    public final com.heytap.accessory.session.params.a a(String str, int i2, int i3, List<FrameworkServiceChannelDescription> list, Map<Long, com.heytap.accessory.session.a> map) {
        com.heytap.accessory.session.params.a aVar = new com.heytap.accessory.session.params.a();
        aVar.f = (byte) 1;
        aVar.h = str.getBytes(StandardCharsets.UTF_8);
        aVar.e = i2;
        aVar.a = i3;
        aVar.g = list.size();
        aVar.d = new ArrayList();
        int i4 = 0;
        for (FrameworkServiceChannelDescription frameworkServiceChannelDescription : list) {
            com.heytap.accessory.session.params.a.a aVar2 = new com.heytap.accessory.session.params.a.a();
            long jA = frameworkServiceChannelDescription.a();
            com.heytap.accessory.session.a aVar3 = map.get(Long.valueOf(jA));
            if (aVar3 != null) {
                aVar.d.add(i4, Long.valueOf(aVar3.a()));
            }
            aVar2.a = (int) jA;
            aVar2.c.a = (byte) frameworkServiceChannelDescription.b();
            aVar2.c.b = (byte) frameworkServiceChannelDescription.d();
            aVar.c.add(aVar2);
            i4++;
        }
        return aVar;
    }

    public final boolean a(@NonNull Map<Long, com.heytap.accessory.session.a> map, @NonNull List<Long> list) {
        if (map.size() != 0 && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Long l2 : map.keySet()) {
                com.heytap.accessory.session.a aVar = map.get(l2);
                if (aVar == null) {
                    com.heytap.accessory.base.logging.a.b(i, "null Session is not allowed, return...");
                    return false;
                }
                if (!list.contains(Long.valueOf(aVar.a()))) {
                    arrayList.add(l2);
                }
            }
            if (map.size() - arrayList.size() != list.size()) {
                com.heytap.accessory.base.logging.a.b(i, "checkAndModifySessions error, return... commonSessionIds = " + list + ", localIds = " + map);
                return false;
            }
            if (arrayList.size() > 0) {
                com.heytap.accessory.base.logging.a.a(i, "checkAndModifySessions success, but session conflict commonSessionIds = " + list + ", localIds = " + com.heytap.accessory.session.a.a(map));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                map.remove((Long) it.next());
            }
            return true;
        }
        com.heytap.accessory.base.logging.a.b(i, "sessionCount error return...,localSize:" + map.size() + "remoteSize:" + list.size());
        return false;
    }

    public final void a(long j2, String str, int i2, int i3, @NonNull List<Long> list, boolean z2) {
        Map<Long, com.heytap.accessory.session.a> arrayMap;
        boolean zA;
        String str2;
        i iVarS;
        long jA = com.heytap.accessory.misc.utils.c.a(j2, String.valueOf(i2), String.valueOf(i3));
        if (!z2 && !a(jA, 1)) {
            com.heytap.accessory.base.logging.a.e(i, "Received a response for a connection request that has already timed out,I will ask the acceptor to drop the service connection ...");
            a(j2, str, i2, i3);
            return;
        }
        synchronized (j) {
            arrayMap = q.get(Long.valueOf(jA));
            if (arrayMap == null) {
                arrayMap = new ArrayMap<>();
                q.put(Long.valueOf(jA), arrayMap);
            }
            zA = a(arrayMap, list);
            str2 = i;
            com.heytap.accessory.base.logging.a.c(str2, "processServiceConnectionRequestAcceptance ChannelToSessionMap add connectionId:" + jA + ",sessionMap:" + arrayMap);
            StringBuilder sb = new StringBuilder();
            sb.append("exchanged session:");
            sb.append(com.heytap.accessory.session.a.a(arrayMap));
            com.heytap.accessory.base.logging.a.a(str2, sb.toString());
        }
        synchronized (l) {
            iVarS = s(jA);
        }
        synchronized (k) {
            if (iVarS != null) {
                if (1 == iVarS.m) {
                    z.removeCallbacks(iVarS);
                    iVarS.d = 0;
                    iVarS.k = false;
                    iVarS.o = 3;
                }
            }
        }
        com.heytap.accessory.session.d dVar = s.get(Long.valueOf(jA));
        if (dVar == null) {
            return;
        }
        if (!zA) {
            com.heytap.accessory.base.logging.a.e(str2, "I cannot find the matching sessions in place to process this request!");
            com.heytap.accessory.base.logging.a.e(str2, "I will ask the acceptor to drop the service connection ...");
            this.b = 4644;
            dVar.a(j2, String.valueOf(i2), String.valueOf(i3), this.b);
            return;
        }
        if (a(j2, list).booleanValue()) {
            com.heytap.accessory.base.logging.a.d(str2, "Acceptor " + i3 + " accepted the service connection initiated by " + i2);
            dVar.a(j2, String.valueOf(i2), String.valueOf(i3), arrayMap);
            return;
        }
        com.heytap.accessory.base.logging.a.e(str2, "I cannot find the session queues in place to process this request!");
        this.b = 4644;
        com.heytap.accessory.base.logging.a.e(str2, "I will ask the acceptor to drop the service connection ...");
        dVar.a(j2, String.valueOf(i2), String.valueOf(i3), this.b);
    }

    public void a(long j2, Collection<com.heytap.accessory.session.a> collection) {
        for (com.heytap.accessory.session.a aVar : collection) {
            d(j2, aVar);
            aVar.e();
            com.heytap.accessory.base.logging.a.d(i, "Recycled session (ID: " + aVar.a() + ")");
        }
    }

    public final void a(com.heytap.accessory.transport.b bVar, com.heytap.accessory.message.b bVar2) {
        if (bVar2 != null) {
            a(bVar2.a(), bVar);
        }
        int iB = bVar.b();
        Map<Integer, com.heytap.accessory.transport.e> map = n;
        synchronized (map) {
            com.heytap.accessory.transport.e eVar = map.get(Integer.valueOf(iB));
            if (eVar == null) {
                com.heytap.accessory.base.logging.a.a(i, new Throwable("queue for channelType(" + iB + ") can't be null"));
                return;
            }
            boolean z2 = eVar.g() == 0;
            if (bVar2 != null) {
                bVar.a(bVar2);
            }
            eVar.a(bVar);
            String str = i;
            com.heytap.accessory.base.logging.a.a(str, "addToPriorityQueue:  isPostRequired = " + z2);
            if (z2) {
                Handler handler = w.get(Integer.valueOf(iB));
                h hVar = this.c.get(Integer.valueOf(iB));
                if (handler != null && hVar != null) {
                    handler.post(hVar);
                }
                com.heytap.accessory.base.logging.a.e(str, "dequeHandler(" + handler + ") and dequeTask(" + hVar + ") for channelType(" + iB + ") can't be null.");
            }
        }
    }

    public final void a(long j2, com.heytap.accessory.transport.b bVar) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        if (bVarA != null && bVarA.o() == 0) {
            if (bVar.b() != 1) {
                com.heytap.accessory.base.logging.a.e(i, "Not support, channel type error : " + bVar.c());
                bVar.a(1);
                return;
            }
            return;
        }
        if (bVar.b() == 1 || bVar.b() == 3) {
            return;
        }
        List<Integer> listA = com.heytap.accessory.connectivity.negotiation.b.b().a(j2);
        if (listA == null || !listA.contains(Integer.valueOf(bVar.c()))) {
            com.heytap.accessory.base.logging.a.e(i, "Not nego for now, type " + bVar.c());
            bVar.a(1);
        }
    }

    public final void a(com.heytap.accessory.transport.b bVar) {
        int iB = bVar.b();
        Map<Integer, com.heytap.accessory.transport.e> map = n;
        synchronized (map) {
            if (bVar.o()) {
                map.get(Integer.valueOf(iB)).b(bVar);
            }
            if (map.get(Integer.valueOf(iB)).g() > 0) {
                w.get(Integer.valueOf(iB)).post(this.c.get(Integer.valueOf(iB)));
            } else {
                com.heytap.accessory.base.logging.a.a(i, "ReceiverTask end");
            }
        }
    }

    public Boolean a(long j2, List<Long> list) {
        return Boolean.valueOf(com.heytap.accessory.transport.d.f().a(j2, list));
    }

    public void a(int i2) {
        b(i2);
        Map<Integer, com.heytap.accessory.transport.e> map = n;
        synchronized (map) {
            map.put(Integer.valueOf(i2), new com.heytap.accessory.transport.e());
            this.c.put(Integer.valueOf(i2), new h(this, i2, null));
        }
    }

    public void a(long j2, j jVar) {
        com.heytap.accessory.base.logging.a.a(i, "putConnectionRecord " + j2);
        t.put(Long.valueOf(j2), jVar);
    }

    public final void a(long j2, i iVar) {
        com.heytap.accessory.base.logging.a.a(i, "putTimeoutRunnable connectionId:" + j2);
        l.put(Long.valueOf(j2), iVar);
    }
}
