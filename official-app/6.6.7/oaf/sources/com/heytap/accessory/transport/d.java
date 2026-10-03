package com.heytap.accessory.transport;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.ArrayMap;
import com.health.health_seedlingcard.receiver.HealthDataRefreshReceiver;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d {
    public static final String i = "d";
    public com.heytap.accessory.connectivity.c e;
    public com.heytap.accessory.transport.a f;
    public static final Object h = new Object();
    public static Map<Long, b> j = new ArrayMap();
    public static com.heytap.accessory.transport.acknowledge.c k = null;
    public static Map<Integer, d> l = new ArrayMap();
    public static d m = null;
    public static com.heytap.accessory.transport.assemble.b n = null;
    public static com.heytap.accessory.transport.transmit.a o = null;
    public i a = null;
    public i b = null;
    public i c = null;
    public i d = null;
    public final com.heytap.accessory.connectivity.interfaces.a g = new a();

    public class b {
        public long a;
        public Map<Integer, com.heytap.accessory.transport.e> c = new ArrayMap();
        public Map<Integer, j> d = new ArrayMap();
        public Map<Integer, e> b = new ArrayMap();

        public b(long j) {
            this.a = j;
            com.heytap.accessory.transport.e eVar = new com.heytap.accessory.transport.e(j, 1);
            j jVar = new j(eVar);
            this.c.put(1, eVar);
            this.d.put(1, jVar);
            this.b.put(1, d.this.new e(eVar, jVar));
        }

        public synchronized void c(int i) {
            com.heytap.accessory.transport.e eVar = this.c.get(Integer.valueOf(i));
            if (eVar != null) {
                eVar.f();
            }
        }

        public synchronized int d(int i) {
            com.heytap.accessory.transport.e eVar = this.c.get(Integer.valueOf(i));
            if (eVar == null) {
                return 0;
            }
            return eVar.g();
        }

        public synchronized boolean a(int i) {
            com.heytap.accessory.base.logging.a.a(d.i, "addTransportQueue " + i);
            if (this.c.get(Integer.valueOf(i)) != null) {
                return false;
            }
            com.heytap.accessory.transport.e eVar = new com.heytap.accessory.transport.e(this.a, i);
            j jVar = new j(eVar);
            this.c.put(Integer.valueOf(i), eVar);
            this.d.put(Integer.valueOf(i), jVar);
            this.b.put(Integer.valueOf(i), d.this.new e(eVar, jVar));
            return true;
        }

        public synchronized boolean b(com.heytap.accessory.transport.b bVar, int i) {
            com.heytap.accessory.transport.e eVar = this.c.get(Integer.valueOf(i));
            if (eVar == null) {
                return false;
            }
            return eVar.b(bVar);
        }

        public synchronized boolean b(int i) {
            com.heytap.accessory.transport.e eVar = this.c.get(Integer.valueOf(i));
            if (eVar == null) {
                return false;
            }
            return eVar.c();
        }

        public synchronized boolean a(com.heytap.accessory.transport.b bVar, int i) {
            com.heytap.accessory.transport.e eVar = this.c.get(Integer.valueOf(i));
            if (eVar != null) {
                com.heytap.accessory.base.logging.a.a(d.i, "addSessionQueue: true, channel type " + i);
                return eVar.a(bVar);
            }
            com.heytap.accessory.base.logging.a.e(d.i, "addSessionQueue: false, channel type " + i);
            return false;
        }
    }

    public static final class c implements com.heytap.accessory.transport.acknowledge.c {
        public c() {
        }

        @Override // com.heytap.accessory.transport.acknowledge.c
        public void a(long j, long j2, com.heytap.accessory.misc.constants.a aVar, List<com.heytap.accessory.misc.utils.d.a> list) {
            com.heytap.accessory.message.a aVarA = com.heytap.accessory.transport.c.a(j, j2, aVar, list);
            if (aVarA == null) {
                com.heytap.accessory.base.logging.a.b(d.i, "Error while parsing control frame");
                return;
            }
            com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, j2);
            bVar.a(aVarA);
            d.f().f.a(j, bVar);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static final class d extends Handler {
        public /* synthetic */ d(Looper looper, a aVar) {
            this(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long jL = message.arg1;
            long j = message.arg2;
            Object obj = message.obj;
            if (obj instanceof com.heytap.accessory.base.bean.b) {
                jL = ((com.heytap.accessory.base.bean.b) obj).l();
            }
            int i = message.what;
            if (i == 202) {
                i iVarD = d.m.d(jL, j);
                if (iVarD != null) {
                    iVarD.c(jL, j);
                    return;
                }
                com.heytap.accessory.base.logging.a.b(d.i, "onSpaceAvailable(): Transport listener not found for Accessory: " + jL);
                return;
            }
            if (i != 204) {
                if (i == 205) {
                    d.f().e.a(jL);
                    return;
                }
                com.heytap.accessory.base.logging.a.e(d.i, "BufferHandler: Unknown message type received!" + message.what + " Ignoring ...");
                return;
            }
            i iVarD2 = d.m.d(jL, j);
            if (iVarD2 != null) {
                iVarD2.b(jL, j);
                return;
            }
            com.heytap.accessory.base.logging.a.b(d.i, "onSessionFlushed(): Transport listener not found for Accessory: " + jL);
        }

        public d(Looper looper) {
            super(looper);
        }
    }

    public class e implements Runnable {
        public com.heytap.accessory.transport.e a;
        public j b;

        public e(com.heytap.accessory.transport.e eVar, j jVar) {
            this.a = eVar;
            this.b = jVar;
        }

        public int a(long j, com.heytap.accessory.message.b bVar, com.heytap.accessory.transport.a.b bVar2) {
            return d.this.f.a(j, bVar, bVar2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.c()) {
                com.heytap.accessory.base.logging.a.c(d.i, "Previous msg not dispatched yet");
                return;
            }
            com.heytap.accessory.transport.b bVarE = this.a.e();
            if (bVarE == null) {
                com.heytap.accessory.base.logging.a.c(d.i, "No data queued in TL!");
                return;
            }
            if (bVarE.k() == 3) {
                com.heytap.accessory.base.logging.a.a(d.i, "Session is stalled. accId: " + this.a.a() + ", sessionId: " + bVarE.l() + " , c type " + this.a.b());
                this.a.d();
                return;
            }
            com.heytap.accessory.base.logging.a.a(d.i, ">> DequeTask accId: " + this.a.a() + ", sessionId: " + bVarE.l() + ", leftCount: " + bVarE.f() + ", AFSessionQueue:" + bVarE);
            com.heytap.accessory.base.d.a(this.a.a());
            com.heytap.accessory.message.b bVarT = bVarE.t();
            if (bVarT == null) {
                com.heytap.accessory.base.logging.a.e(d.i, "Message item is null!");
                d.this.f.b(this.a.a(), bVarE);
                if (this.a.g() > 0) {
                    ((d) d.l.get(Integer.valueOf(bVarE.b()))).post(this);
                    return;
                }
                return;
            }
            bVarT.b(1);
            long jA = bVarT.a();
            com.heytap.accessory.transport.a.b bVarA = d.this.f.a(jA, bVarE, bVarT);
            if (bVarA == null) {
                com.heytap.accessory.base.logging.a.e(d.i, "SessionDetails is null!");
                if (this.a.g() > 0) {
                    ((d) d.l.get(Integer.valueOf(bVarE.b()))).post(this);
                    return;
                }
                return;
            }
            synchronized (this.a) {
                ((d) d.l.get(Integer.valueOf(bVarE.b()))).postDelayed(this.b, HealthDataRefreshReceiver.ONE_MINUTE);
                this.a.d();
                bVarA.a(System.currentTimeMillis());
            }
            int iA = a(jA, bVarT, bVarA);
            if (iA != 0) {
                if (iA != 2) {
                    com.heytap.accessory.base.logging.a.e(d.i, "Failed to send message packet.");
                    d.this.c.a(new com.heytap.accessory.base.bean.a(jA, 1, 1));
                    synchronized (this.a) {
                        ((d) d.l.get(Integer.valueOf(bVarE.b()))).removeCallbacks(this.b);
                        this.a.f();
                    }
                } else {
                    com.heytap.accessory.base.logging.a.e(d.i, "Failed to send message packet in dormant connection state");
                    bVarT.b(0);
                    bVarE.b(bVarT);
                    synchronized (this.a) {
                        ((d) d.l.get(Integer.valueOf(bVarE.b()))).removeCallbacks(this.b);
                    }
                }
            }
            d.this.f.b(this.a.a(), bVarE);
        }
    }

    public static final class f implements com.heytap.accessory.transport.assemble.b {
        public f() {
        }

        @Override // com.heytap.accessory.transport.assemble.b
        public void a(long j, long j2, com.heytap.accessory.message.a aVar) {
            i iVarD = d.m.d(j, j2);
            if (iVarD != null) {
                iVarD.a(j, j2, aVar);
                return;
            }
            com.heytap.accessory.base.logging.a.b(d.i, "onCompletePacketFormed(): Transport listener not set for Accessory: " + j);
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public static final class g implements com.heytap.accessory.transport.a.a {
        public g() {
        }

        @Override // com.heytap.accessory.transport.a.a
        public void a(long j, com.heytap.accessory.transport.b bVar) {
            d.f().c(j, bVar);
        }

        @Override // com.heytap.accessory.transport.a.a
        public void b(long j, com.heytap.accessory.transport.b bVar) {
            Message messageObtain = Message.obtain((Handler) d.l.get(Integer.valueOf(bVar.b())));
            messageObtain.what = 205;
            messageObtain.arg1 = (int) j;
            messageObtain.sendToTarget();
        }

        @Override // com.heytap.accessory.transport.a.a
        public void c(long j, com.heytap.accessory.transport.b bVar) {
            d.e(j, bVar);
        }

        @Override // com.heytap.accessory.transport.a.a
        public void d(long j, com.heytap.accessory.transport.b bVar) {
            Message messageObtainMessage = ((d) d.l.get(Integer.valueOf(bVar.b()))).obtainMessage();
            messageObtainMessage.what = 202;
            messageObtainMessage.arg1 = (int) j;
            messageObtainMessage.arg2 = (int) bVar.l();
            ((d) d.l.get(Integer.valueOf(bVar.b()))).sendMessage(messageObtainMessage);
            com.heytap.accessory.base.logging.a.d(d.i, "indicating onSpaceAvailable to sessionId: " + bVar.l() + "...");
        }

        @Override // com.heytap.accessory.transport.a.a
        public void e(long j, com.heytap.accessory.transport.b bVar) {
            d.d(j, bVar);
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // com.heytap.accessory.transport.a.a
        public void a(com.heytap.accessory.transport.b bVar, long j) {
            d.b(bVar, j);
        }

        @Override // com.heytap.accessory.transport.a.a
        public void a(long j, com.heytap.accessory.transport.b bVar, List<com.heytap.accessory.message.b> list, List<com.heytap.accessory.message.b> list2) {
            d.e(j, bVar);
            b(bVar, list);
            a(bVar, list2);
        }

        public final void b(com.heytap.accessory.transport.b bVar, List<com.heytap.accessory.message.b> list) {
            if (list != null) {
                for (com.heytap.accessory.message.b bVar2 : list) {
                    if (bVar2.f() == 0) {
                        bVar.d(bVar2);
                        bVar2.c().f().recycle();
                    }
                }
            }
        }

        public final void a(com.heytap.accessory.transport.b bVar, List<com.heytap.accessory.message.b> list) {
            if (list != null) {
                for (com.heytap.accessory.message.b bVar2 : list) {
                    if (!bVar.c(bVar2)) {
                        bVar.b(bVar2);
                        bVar2.j();
                    }
                }
            }
        }
    }

    public static final class h implements com.heytap.accessory.transport.transmit.a {
        public h() {
        }

        @Override // com.heytap.accessory.transport.transmit.a
        public int a(long j, long j2, com.heytap.accessory.message.b bVar) {
            byte bA = d.f().e.a(j, j2, bVar);
            if (bA != 0) {
                com.heytap.accessory.base.logging.a.b(d.i, "sendMessage failed");
            }
            return bA;
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // com.heytap.accessory.transport.transmit.a
        public void a(long j, long j2, List<com.heytap.accessory.message.b> list, List<com.heytap.accessory.message.b> list2) {
            com.heytap.accessory.base.logging.a.d(d.i, "moveParkedQueue, SessionId:" + j2);
            d.f().f.a(j, j2, list, list2);
        }

        @Override // com.heytap.accessory.transport.transmit.a
        public void a(long j, long j2, boolean z, boolean z2) {
            d.f().f.a(j, j2, z, z2);
        }

        @Override // com.heytap.accessory.transport.transmit.a
        public void a(long j, long j2) {
            com.heytap.accessory.base.logging.a.b(d.i, "Message lost for session " + j2);
            d.f().c.a(j, j2);
        }
    }

    public interface i {
        void a(long j, long j2);

        void a(long j, long j2, com.heytap.accessory.message.a aVar);

        void a(com.heytap.accessory.base.bean.a aVar);

        void b(long j, long j2);

        void c(long j, long j2);
    }

    public static class j implements Runnable {
        public com.heytap.accessory.transport.e a;

        public j(com.heytap.accessory.transport.e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a == null) {
                return;
            }
            com.heytap.accessory.base.logging.a.e(d.i, "Send message timed out for accessoryId: " + this.a.a());
            this.a.f();
        }
    }

    public d() {
        a aVar = null;
        l.put(1, a(1));
        e();
        this.f = new com.heytap.accessory.transport.a(new g(aVar));
        o = new h(aVar);
        k = new c(aVar);
        n = new f(aVar);
        com.heytap.accessory.transport.credit.b.a();
    }

    public static d f() {
        d dVar;
        synchronized (h) {
            if (m == null) {
                m = new d();
            }
            dVar = m;
        }
        return dVar;
    }

    public void e(long j2, long j3) {
        if (j2 == -1 || j3 == -1) {
            return;
        }
        this.f.f(j2, j3);
    }

    public boolean g(long j2) {
        return this.f.g(j2);
    }

    public void d() {
        com.heytap.accessory.transport.b.a();
        com.heytap.accessory.connectivity.c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final boolean e(long j2) {
        return this.f.e(j2);
    }

    public com.heytap.accessory.transport.b g() {
        return com.heytap.accessory.transport.b.r();
    }

    public void c(i iVar) {
        this.b = iVar;
    }

    public final void e() {
        this.e = com.heytap.accessory.connectivity.c.b();
    }

    public class a implements com.heytap.accessory.connectivity.interfaces.a {
        public a() {
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public int a(long j, int i, Buffer buffer) {
            if (buffer == null) {
                com.heytap.accessory.base.logging.a.b(d.i, "payload is null.could not parse protocol data!");
                return -1;
            }
            com.heytap.accessory.misc.utils.d.b bVarA = com.heytap.accessory.transport.c.a(buffer);
            if (bVarA == null) {
                com.heytap.accessory.base.logging.a.b(d.i, "Error parsing protocol message frame");
                return 0;
            }
            d.this.f.a(j, bVarA);
            return 0;
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
            bVar.b(0);
            d.this.f.a(j, i, j2, bVar);
            d.this.a(j, bVar.b());
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            com.heytap.accessory.base.logging.a.c(d.i, "onConnectionStateChanged: DequeTask current accessory id : " + j);
            if (i2 == 1) {
                com.heytap.accessory.base.logging.a.e(d.i, "LINK_DORMANT event!");
                d.this.f.h(j);
                i6 = 3;
                d.this.c.a(new com.heytap.accessory.base.bean.a(j, 3, i3));
                if (!d.this.g(j)) {
                    com.heytap.accessory.base.logging.a.a(d.i, "session not idle, activate connection " + j);
                    Message messageObtain = Message.obtain((Handler) d.l.get(Integer.valueOf(i)));
                    messageObtain.what = 205;
                    messageObtain.arg1 = (int) j;
                    messageObtain.sendToTarget();
                }
                d.this.f.d(j);
            } else {
                if (i2 == 2) {
                    com.heytap.accessory.base.logging.a.d(d.i, "LINK_ACTIVE event received");
                    d.this.f.c(j);
                    d.this.a(j, i);
                    i6 = 4;
                } else {
                    com.heytap.accessory.base.logging.a.e(d.i, "LINK_LOSS event occured!");
                    com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
                    int iH = bVarA != null ? bVarA.h() : 0;
                    d.this.c(j);
                    d.this.c.a(new com.heytap.accessory.base.bean.a(j, 1, i3));
                    i4 = iH;
                    i5 = 1;
                }
                if (i != 1 || d.this.d == null) {
                }
                d.this.d.a(new com.heytap.accessory.base.bean.a(j, i, i4, i5, i3));
                return;
            }
            i4 = 0;
            i5 = i6;
            if (i != 1) {
            }
        }
    }

    public static void e(long j2, com.heytap.accessory.transport.b bVar) {
        b bVar2;
        synchronized (j) {
            bVar2 = j.get(Long.valueOf(j2));
        }
        if (bVar2 == null) {
            com.heytap.accessory.base.logging.a.e(i, "Accessory Queue is null");
        } else {
            bVar2.b(bVar, bVar.b());
        }
    }

    public void b(i iVar) {
        this.c = iVar;
    }

    public int c(long j2, long j3) {
        return this.f.c(j2, j3);
    }

    public boolean b(com.heytap.accessory.base.bean.b bVar, int i2) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(i, "Received an invalid accessory instance");
            return false;
        }
        if (a(bVar, i2)) {
            this.f.a(bVar.l());
            com.heytap.accessory.base.logging.a.a(i, "reconfigure conn " + bVar.l() + " , " + HexUtils.hideAddress(bVar.d()) + " , " + i2);
            b bVar2 = j.get(Long.valueOf(bVar.l()));
            if (bVar2 == null) {
                bVar2 = new b(bVar.l());
            }
            bVar2.a(i2);
            a(i2);
            synchronized (j) {
                j.put(Long.valueOf(bVar.l()), bVar2);
            }
            return true;
        }
        com.heytap.accessory.base.logging.a.e(i, "Failed attempt to connect to accessory ID: " + bVar.l());
        return false;
    }

    public final void c(long j2) {
        this.f.b(j2);
    }

    public void d(i iVar) {
        this.d = iVar;
    }

    public final void c(long j2, com.heytap.accessory.transport.b bVar) {
        b bVar2;
        synchronized (j) {
            bVar2 = j.get(Long.valueOf(j2));
        }
        if (bVar2 == null) {
            com.heytap.accessory.base.logging.a.e(i, "Accessory Queue is null");
            return;
        }
        if (bVar.k() != 1) {
            synchronized (bVar2) {
                if (bVar2.a(bVar, bVar.b())) {
                    bVar.c(0);
                    if (!bVar2.b(bVar.b())) {
                        com.heytap.accessory.base.d.a(j2, true);
                        com.heytap.accessory.base.logging.a.a(i, "deque task " + bVar2.b.size() + " , class type " + bVar.c() + " , channel type " + bVar.b());
                        l.get(Integer.valueOf(bVar.b())).post((Runnable) bVar2.b.get(Integer.valueOf(bVar.b())));
                    }
                }
            }
        }
    }

    public com.heytap.accessory.base.bean.b d(long j2) {
        return AccessoryManager.h().a(j2);
    }

    public boolean f(long j2) {
        return com.heytap.accessory.transport.f.a(j2);
    }

    public final i d(long j2, long j3) {
        com.heytap.accessory.base.bean.b bVarD;
        if (j3 == 3) {
            com.heytap.accessory.base.bean.b bVarD2 = d(j2);
            if (bVarD2 != null && bVarD2.N()) {
                return this.b;
            }
        } else if (j3 == 2) {
            com.heytap.accessory.base.bean.b bVarD3 = d(j2);
            if (bVarD3 != null && bVarD3.K()) {
                return this.a;
            }
        } else if (j3 == 4 && (bVarD = d(j2)) != null && bVarD.o() == 1) {
            return this.d;
        }
        return this.c;
    }

    public final d a(int i2) {
        if (l.containsKey(Integer.valueOf(i2))) {
            return l.get(Integer.valueOf(i2));
        }
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("transport-bufferHandler " + i2);
        if (looperB == null) {
            HandlerThread handlerThread = new HandlerThread("transport-bufferHandler " + i2);
            handlerThread.start();
            looperB = handlerThread.getLooper();
        }
        d dVar = new d(looperB, null);
        l.put(Integer.valueOf(i2), dVar);
        return dVar;
    }

    public static void d(long j2, com.heytap.accessory.transport.b bVar) {
        com.heytap.accessory.base.logging.a.b(i, "giving Space available callback to session: " + bVar.l());
        Message messageObtainMessage = l.get(Integer.valueOf(bVar.b())).obtainMessage();
        messageObtainMessage.what = 202;
        messageObtainMessage.arg1 = (int) j2;
        messageObtainMessage.arg2 = (int) bVar.l();
        bVar.a(false);
        l.get(Integer.valueOf(bVar.b())).sendMessage(messageObtainMessage);
    }

    public void a(i iVar) {
        this.a = iVar;
    }

    public boolean b(long j2) {
        if (e(j2)) {
            com.heytap.accessory.base.logging.a.a(i, "Attempting to close the connectivity link with accessory ID: " + j2);
            byte bA = a(j2);
            if (bA == 0) {
                c(j2);
            }
            synchronized (j) {
                j.remove(Long.valueOf(j2));
            }
            return bA == 0;
        }
        synchronized (j) {
            j.remove(Long.valueOf(j2));
        }
        com.heytap.accessory.base.logging.a.e(i, "Accessory ID: " + j2 + " is already disconnected ...");
        return false;
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar) {
        return b(bVar, 1);
    }

    public void a(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7) {
        com.heytap.accessory.transport.transmit.b dVar;
        com.heytap.accessory.transport.acknowledge.a fVar;
        if (j2 == -1 || j3 == -1) {
            return;
        }
        if (i4 == 0) {
            com.heytap.accessory.base.logging.a.b(i, "[sessionConfig] Error Invalid connectivity flags (0x " + Integer.toHexString(i4) + ")");
            return;
        }
        int iA = com.heytap.accessory.connectivity.c.a(j2, i4, i5, i7);
        int iA2 = com.heytap.accessory.transport.f.a(i6, i2);
        com.heytap.accessory.transport.b bVarG = g();
        bVarG.a(j3, i3, i4);
        com.heytap.accessory.transport.assemble.a aVar = new com.heytap.accessory.transport.assemble.a(iA, iA2, i4);
        com.heytap.accessory.transport.assemble.c cVar = new com.heytap.accessory.transport.assemble.c(n);
        com.heytap.accessory.base.logging.a.a(i, "[sessionConfig] mSessionDetails, sessionId:" + j3 + ", acc:" + j2 + ", obj:" + bVarG + ", frameProcedure=" + iA2);
        if (iA2 != 2) {
            dVar = new com.heytap.accessory.transport.transmit.e(j3, o);
            fVar = new com.heytap.accessory.transport.acknowledge.d(j2, cVar);
        } else {
            a(j2, i4, i5, i7);
            dVar = new com.heytap.accessory.transport.transmit.d(j2, j3, o, i4);
            fVar = new com.heytap.accessory.transport.acknowledge.f(j2, j3, k, cVar);
        }
        this.f.a(j2, j3, new com.heytap.accessory.transport.a.b(bVarG, aVar, dVar, fVar, iA2));
    }

    public void b(long j2, long j3) {
        if (this.f.b(j2, j3)) {
            i iVarD = d(j2, j3);
            if (iVarD == null) {
                com.heytap.accessory.base.logging.a.e(i, "Failed to give onSessionFlushed() callback for sessionId: " + j3);
                return;
            }
            iVarD.b(j2, j3);
        }
    }

    public static void b(com.heytap.accessory.transport.b bVar, long j2) {
        if (bVar.p()) {
            Message messageObtainMessage = l.get(Integer.valueOf(bVar.b())).obtainMessage();
            messageObtainMessage.what = 204;
            messageObtainMessage.arg1 = (int) j2;
            messageObtainMessage.arg2 = (int) bVar.l();
            l.get(Integer.valueOf(bVar.b())).sendMessage(messageObtainMessage);
            bVar.b(false);
        }
    }

    public void a(long j2, long j3) {
        if (j2 != -1 && j3 != -1) {
            this.f.a(j2, j3);
            return;
        }
        com.heytap.accessory.base.logging.a.b(i, "cleanSessionCache failed. " + j2 + ", " + j3);
    }

    public synchronized int a(long j2, com.heytap.accessory.message.a aVar) {
        return (j2 == -1 || aVar == null) ? -3 : this.f.a(j2, aVar);
    }

    public boolean a(long j2, List<Long> list) {
        return this.f.a(j2, list);
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar, int i2) {
        if (bVar == null) {
            return false;
        }
        this.e.a(bVar.l(), i2, this.g);
        return true;
    }

    public byte a(long j2) {
        return this.e.b(j2);
    }

    public final void a(long j2, int i2, int i3, int i4) {
        this.f.a(j2);
        if (this.f.f(j2)) {
            return;
        }
        String str = i;
        com.heytap.accessory.base.logging.a.a(str, "Configure Ack session acc:" + j2);
        com.heytap.accessory.transport.assemble.a aVar = new com.heytap.accessory.transport.assemble.a(com.heytap.accessory.connectivity.c.a(j2, i2, i3, i4), 0, i2);
        com.heytap.accessory.transport.assemble.c cVar = new com.heytap.accessory.transport.assemble.c(n);
        com.heytap.accessory.transport.b bVarG = g();
        bVarG.a(1024L, 3, i2);
        com.heytap.accessory.base.logging.a.a(str, "[sessionConfig] mSessionDetails, sessionId:1024, acc:" + j2 + ", obj:" + bVarG);
        this.f.a(j2, 1024L, new com.heytap.accessory.transport.a.b(bVarG, aVar, new com.heytap.accessory.transport.transmit.e(1024L, o), new com.heytap.accessory.transport.acknowledge.d(j2, cVar), 0));
    }

    public final void a(long j2, int i2) {
        b bVar;
        synchronized (j) {
            bVar = j.get(Long.valueOf(j2));
        }
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(i, "Accessory Queue is null");
            return;
        }
        if (bVar.b(i2)) {
            l.get(Integer.valueOf(i2)).removeCallbacks((Runnable) bVar.d.get(Integer.valueOf(i2)));
            bVar.c(i2);
            if (bVar.d(i2) > 0) {
                com.heytap.accessory.base.d.a(j2, false);
                l.get(Integer.valueOf(i2)).post((Runnable) bVar.b.get(Integer.valueOf(i2)));
                return;
            }
            com.heytap.accessory.base.logging.a.a(i, "Accessory Queue is empty! channelType：" + i2);
            return;
        }
        com.heytap.accessory.base.logging.a.e(i, "Could not notify as deque task is not paused");
    }
}
