package com.heytap.accessory.transport.acknowledge;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class f implements com.heytap.accessory.transport.acknowledge.a {
    public static final String o = "f";
    public static Handler p;
    public final long a;
    public final com.heytap.accessory.transport.acknowledge.b c;
    public final long e;
    public c g;
    public boolean i;
    public final Object b = new Object();
    public final LinkedList<Long> d = new LinkedList<>();
    public long j = 0;
    public int k = 0;
    public TreeMap<Long, com.heytap.accessory.misc.utils.d.b> l = null;
    public int m = 0;
    public int n = 0;
    public e h = e.a;
    public final b f = new b();

    public final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (f.this.b) {
                if (f.this.h != null) {
                    e eVar = f.this.h;
                    f fVar = f.this;
                    eVar.a(fVar, Long.valueOf(fVar.j));
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

    public f(long j, long j2, c cVar, com.heytap.accessory.transport.acknowledge.b bVar) {
        this.g = cVar;
        this.c = bVar;
        this.a = j;
        this.e = j2;
    }

    public void d() {
        this.j = this.d.getLast().longValue();
        c();
    }

    public void e() {
        this.k = 0;
    }

    public void f() {
        this.d.clear();
        long jD = d(this.j + 1);
        ArrayList arrayList = new ArrayList();
        TreeMap<Long, com.heytap.accessory.misc.utils.d.b> treeMap = this.l;
        if (treeMap != null) {
            boolean z = false;
            for (Long l : treeMap.keySet()) {
                if (l.longValue() <= 10) {
                    z = true;
                }
                if (l.longValue() >= 65526 && z) {
                    com.heytap.accessory.base.logging.a.c(o, "achieve bound, skip " + l);
                } else if (jD == l.longValue()) {
                    jD = d(l.longValue() + 1);
                } else {
                    arrayList.add(new com.heytap.accessory.misc.utils.d.a(jD, d(l.longValue() - 1)));
                    jD = d(l.longValue() + 1);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.heytap.accessory.misc.utils.d.a(jD, jD));
        }
        com.heytap.accessory.base.logging.a.a(o, "Sending NAK with Hole Range :" + arrayList + " SessionId :" + this.e);
        this.g.a(this.a, this.e, com.heytap.accessory.misc.constants.a.d, arrayList);
    }

    public void g() {
        Handler handler = p;
        if (handler != null) {
            handler.postDelayed(this.f, 1500L);
            this.i = true;
            this.n = 1;
        }
    }

    public void h() {
        Handler handler = p;
        if (handler != null) {
            handler.postDelayed(this.f, 1000L);
            this.i = true;
            this.n = 2;
        }
    }

    public void i() {
        Handler handler = p;
        if (handler != null) {
            handler.removeCallbacks(this.f);
            this.i = false;
            this.n = 0;
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
        return this.j;
    }

    public long m() {
        return this.e;
    }

    public boolean n() {
        TreeMap<Long, com.heytap.accessory.misc.utils.d.b> treeMap = this.l;
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

    public void b(long j) {
        this.d.clear();
        com.heytap.accessory.misc.utils.d.a aVar = new com.heytap.accessory.misc.utils.d.a(j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        com.heytap.accessory.base.logging.a.d(o, "Sending Block Ack: " + arrayList);
        this.g.a(this.a, this.e, com.heytap.accessory.misc.constants.a.c, arrayList);
    }

    public void c(com.heytap.accessory.misc.utils.d.b bVar) {
        this.c.a(this.a, bVar.c, bVar.e);
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
        TreeMap<Long, com.heytap.accessory.misc.utils.d.b> treeMap = this.l;
        if (treeMap != null) {
            treeMap.clear();
        }
    }

    public final long d(long j) {
        return j > 65535 ? j % 65535 : j;
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a() {
        synchronized (this.b) {
            e eVar = this.h;
            if (eVar != null) {
                eVar.c(this);
            }
        }
        this.c.a();
    }

    public int c(long j) {
        long jD = d(this.j + 1);
        if (jD == j) {
            return 0;
        }
        if (j <= 10 && jD >= j + 65525) {
            com.heytap.accessory.base.logging.a.d(o, "Received Out Of Sequence packet : " + j + " expectedSeqNum = " + jD);
            return 1;
        }
        if (jD > j) {
            com.heytap.accessory.base.logging.a.d(o, "Received DUPLICATE packet : " + j + " expectedSeqNum = " + jD);
            return 2;
        }
        if (jD <= 10 && j >= 65525 + jD) {
            com.heytap.accessory.base.logging.a.d(o, "Received DUPLICATE packet : " + j + " expectedSeqNum = " + jD);
            return 2;
        }
        com.heytap.accessory.base.logging.a.d(o, "Received Out Of Sequence packet : " + j + " expectedSeqNum = " + jD);
        return 1;
    }

    public boolean b(com.heytap.accessory.misc.utils.d.b bVar) {
        if (bVar.f > d((this.j + 10) - ((long) this.d.size()))) {
            return false;
        }
        if (this.l == null) {
            this.l = new TreeMap<>();
        }
        this.l.put(Long.valueOf(bVar.f), bVar);
        return true;
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public boolean b() {
        return this.i;
    }

    public void a(long j) {
        this.d.add(Long.valueOf(j));
        this.j = j;
    }

    public void a(Long l) {
        long jD = d(l.longValue() + 1);
        if (this.l == null) {
            return;
        }
        while (true) {
            com.heytap.accessory.misc.utils.d.b bVarRemove = this.l.remove(Long.valueOf(jD));
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
                this.m = this.n;
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
