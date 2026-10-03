package com.heytap.accessory.transport.acknowledge;

import android.os.Handler;
import android.os.Looper;
import com.oplus.aiunit.vision.xnl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class f implements com.heytap.accessory.transport.acknowledge.a {
    public static final String o = "f";
    public static Handler p;
    public final long a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.heytap.accessory.transport.acknowledge.b f2766c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2767e;
    public c g;
    public boolean i;
    public final Object b = new Object();
    public final LinkedList<Long> d = new LinkedList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2768j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TreeMap<Long, com.heytap.accessory.misc.utils.d.b> f2769l = null;
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2770n = 0;
    public e h = e.a;
    public final b f = new b();

    public final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (f.this.b) {
                if (f.this.h != null) {
                    e eVar = f.this.h;
                    f fVar = f.this;
                    eVar.a(fVar, Long.valueOf(fVar.f2768j));
                }
            }
            f.this.i = false;
        }

        public b() {
        }
    }

    static {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            p = new Handler(looperB);
        }
    }

    public f(long j2, long j3, c cVar, com.heytap.accessory.transport.acknowledge.b bVar) {
        this.g = cVar;
        this.f2766c = bVar;
        this.a = j2;
        this.f2767e = j3;
    }

    public void d() {
        this.f2768j = this.d.getLast().longValue();
        c();
    }

    public void e() {
        this.k = 0;
    }

    public void f() {
        this.d.clear();
        long jD = d(this.f2768j + 1);
        ArrayList arrayList = new ArrayList();
        TreeMap<Long, com.heytap.accessory.misc.utils.d.b> treeMap = this.f2769l;
        if (treeMap != null) {
            boolean z = false;
            for (Long l2 : treeMap.keySet()) {
                if (l2.longValue() <= 10) {
                    z = true;
                }
                if (l2.longValue() >= 65526 && z) {
                    com.heytap.accessory.base.logging.a.c(o, "achieve bound, skip " + l2);
                } else if (jD == l2.longValue()) {
                    jD = d(l2.longValue() + 1);
                } else {
                    arrayList.add(new com.heytap.accessory.misc.utils.d.a(jD, d(l2.longValue() - 1)));
                    jD = d(l2.longValue() + 1);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.heytap.accessory.misc.utils.d.a(jD, jD));
        }
        com.heytap.accessory.base.logging.a.a(o, "Sending NAK with Hole Range :" + arrayList + " SessionId :" + this.f2767e);
        this.g.a(this.a, this.f2767e, com.heytap.accessory.misc.constants.a.AFP_CONTROL_FRAME_NAK, arrayList);
    }

    public void g() {
        Handler handler = p;
        if (handler != null) {
            handler.postDelayed(this.f, 1500L);
            this.i = true;
            this.f2770n = 1;
        }
    }

    public void h() {
        Handler handler = p;
        if (handler != null) {
            handler.postDelayed(this.f, 1000L);
            this.i = true;
            this.f2770n = 2;
        }
    }

    public void i() {
        Handler handler = p;
        if (handler != null) {
            handler.removeCallbacks(this.f);
            this.i = false;
            this.f2770n = 0;
        }
    }

    public void j() {
        i();
    }

    public e k() {
        e eVar;
        synchronized (this.b) {
            eVar = this.h;
        }
        return eVar;
    }

    public long l() {
        return this.f2768j;
    }

    public long m() {
        return this.f2767e;
    }

    public boolean n() {
        TreeMap<Long, com.heytap.accessory.misc.utils.d.b> treeMap = this.f2769l;
        if (treeMap == null) {
            return false;
        }
        return treeMap.isEmpty();
    }

    public boolean o() {
        int i = this.k;
        this.k = i + 1;
        return i > 100;
    }

    public boolean p() {
        return this.d.size() >= 10;
    }

    public void b(long j2) {
        this.d.clear();
        com.heytap.accessory.misc.utils.d.a aVar = new com.heytap.accessory.misc.utils.d.a(j2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        com.heytap.accessory.base.logging.a.d(o, "Sending Block Ack: " + arrayList);
        this.g.a(this.a, this.f2767e, com.heytap.accessory.misc.constants.a.AFP_CONTROL_FRAME_BLOCK_ACK, arrayList);
    }

    public void c(com.heytap.accessory.misc.utils.d.b bVar) {
        this.f2766c.a(this.a, bVar.f2613c, bVar.f2614e);
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a(com.heytap.accessory.misc.utils.d.b bVar) {
        synchronized (this.b) {
            e eVar = this.h;
            if (eVar != null) {
                eVar.a(this, bVar);
            }
        }
    }

    public void c() {
        e();
        this.d.clear();
        TreeMap<Long, com.heytap.accessory.misc.utils.d.b> treeMap = this.f2769l;
        if (treeMap != null) {
            treeMap.clear();
        }
    }

    public final long d(long j2) {
        return j2 > xnl.PAYLOAD_SHORT_MAX ? j2 % xnl.PAYLOAD_SHORT_MAX : j2;
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a() {
        synchronized (this.b) {
            e eVar = this.h;
            if (eVar != null) {
                eVar.c(this);
            }
        }
        this.f2766c.a();
    }

    public int c(long j2) {
        long jD = d(this.f2768j + 1);
        if (jD == j2) {
            return 0;
        }
        if (j2 <= 10 && jD >= j2 + 65525) {
            com.heytap.accessory.base.logging.a.d(o, "Received Out Of Sequence packet : " + j2 + " expectedSeqNum = " + jD);
            return 1;
        }
        if (jD > j2) {
            com.heytap.accessory.base.logging.a.d(o, "Received DUPLICATE packet : " + j2 + " expectedSeqNum = " + jD);
            return 2;
        }
        if (jD <= 10 && j2 >= 65525 + jD) {
            com.heytap.accessory.base.logging.a.d(o, "Received DUPLICATE packet : " + j2 + " expectedSeqNum = " + jD);
            return 2;
        }
        com.heytap.accessory.base.logging.a.d(o, "Received Out Of Sequence packet : " + j2 + " expectedSeqNum = " + jD);
        return 1;
    }

    public boolean b(com.heytap.accessory.misc.utils.d.b bVar) {
        if (bVar.f > d((this.f2768j + 10) - ((long) this.d.size()))) {
            return false;
        }
        if (this.f2769l == null) {
            this.f2769l = new TreeMap<>();
        }
        this.f2769l.put(Long.valueOf(bVar.f), bVar);
        return true;
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public boolean b() {
        return this.i;
    }

    public void a(long j2) {
        this.d.add(Long.valueOf(j2));
        this.f2768j = j2;
    }

    public void a(Long l2) {
        long jD = d(l2.longValue() + 1);
        if (this.f2769l == null) {
            return;
        }
        while (true) {
            com.heytap.accessory.misc.utils.d.b bVarRemove = this.f2769l.remove(Long.valueOf(jD));
            if (bVarRemove == null) {
                return;
            }
            a(bVarRemove.f);
            c(bVarRemove);
            jD = d(jD + 1);
        }
    }

    public void a(e eVar) {
        synchronized (this.b) {
            this.h = eVar;
        }
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a(int i) {
        if (i == 1) {
            com.heytap.accessory.base.logging.a.a(o, "connection moved to dormant");
            if (b()) {
                this.m = this.f2770n;
                i();
                return;
            }
            return;
        }
        if (i == 2) {
            String str = o;
            com.heytap.accessory.base.logging.a.a(str, "connection is active");
            int i2 = this.m;
            if (i2 == 1) {
                com.heytap.accessory.base.logging.a.a(str, "restarting ack timer");
                g();
            } else if (i2 == 2) {
                com.heytap.accessory.base.logging.a.a(str, "restarting nak timer");
                h();
            }
            this.m = 0;
            return;
        }
        com.heytap.accessory.base.logging.a.a(o, "unknown state received = " + i);
    }
}
