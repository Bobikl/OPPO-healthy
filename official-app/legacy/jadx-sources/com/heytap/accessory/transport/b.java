package com.heytap.accessory.transport;

import com.heytap.log.consts.OplusLogConfig;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final Object o = new Object();
    public static final String p = "b";
    public static b q;
    public static int r;
    public static long s;
    public boolean g;
    public b h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2776j;
    public long k;
    public long m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2777l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2778n = OplusLogConfig.ZIP_MAX_SIZE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2774c = 1;
    public int d = 0;
    public final List<com.heytap.accessory.message.b> a = new Vector();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2775e = 0;
    public boolean f = false;
    public int i = 2;
    public boolean b = false;

    public static b r() {
        b bVar;
        synchronized (o) {
            bVar = q;
            if (bVar == null) {
                bVar = new b();
            } else {
                q = bVar.h();
                bVar.a((b) null);
                r--;
                bVar.c(false);
            }
        }
        return bVar;
    }

    public void a(long j2) {
        com.heytap.accessory.base.logging.a.a(p + " - TCTrack", "set local maxWindowSize:" + j2);
        this.f2778n = j2;
    }

    public synchronized boolean b(com.heytap.accessory.message.b bVar) {
        synchronized (this) {
            com.heytap.accessory.message.a aVarC = bVar.c();
            int iC = aVarC != null ? aVarC.c() : 0;
            bVar.a(g());
            this.a.add(0, bVar);
            this.b = false;
            this.f2775e += (long) iC;
        }
        return true;
        return true;
    }

    public synchronized int c() {
        return this.f2774c;
    }

    public synchronized boolean d(com.heytap.accessory.message.b bVar) {
        boolean zRemove;
        zRemove = this.a.remove(bVar);
        if (zRemove && bVar.c() != null) {
            this.f2775e -= (long) bVar.c().c();
        }
        return zRemove;
    }

    public long e() {
        return this.f2778n;
    }

    public int f() {
        return this.a.size();
    }

    public final long g() {
        long j2 = s;
        s = 1 + j2;
        return j2;
    }

    public final synchronized b h() {
        return this.h;
    }

    public long i() {
        return this.m;
    }

    public synchronized long j() {
        return this.f2775e;
    }

    public synchronized int k() {
        return this.i;
    }

    public synchronized long l() {
        return this.f2776j;
    }

    public synchronized long m() {
        return this.k;
    }

    public synchronized boolean n() {
        return this.f;
    }

    public synchronized boolean o() {
        return this.a.isEmpty();
    }

    public synchronized boolean p() {
        return this.g;
    }

    public final synchronized boolean q() {
        return this.b;
    }

    public synchronized com.heytap.accessory.message.b s() {
        return this.a.isEmpty() ? null : this.a.get(0);
    }

    public synchronized com.heytap.accessory.message.b t() {
        com.heytap.accessory.message.b bVarRemove;
        if (this.a.isEmpty()) {
            bVarRemove = null;
        } else {
            bVarRemove = this.a.remove(0);
            if (bVarRemove != null && bVarRemove.c() != null) {
                this.f2775e -= (long) bVarRemove.c().c();
            }
        }
        return bVarRemove;
    }

    public void u() {
        synchronized (o) {
            if (q()) {
                com.heytap.accessory.base.logging.a.e(p, "clearForRecycle ignore, session is already recycled.");
            } else {
                c(true);
                v();
                if (r < 32) {
                    a(q);
                    q = this;
                    r++;
                }
            }
        }
    }

    public synchronized void v() {
        com.heytap.accessory.base.logging.a.a(p, "[SFTrack] clearForRecycle:" + this.a.size() + ", sessionId:" + this.f2776j + ", AFSessionQueue:" + this);
        this.a.clear();
        this.f2775e = 0L;
        this.f = false;
        this.i = 2;
        this.f2778n = OplusLogConfig.ZIP_MAX_SIZE;
        b(false);
    }

    public void w() {
        this.m++;
    }

    public synchronized boolean c(com.heytap.accessory.message.b bVar) {
        return this.a.contains(bVar);
    }

    public static void a() {
        synchronized (o) {
            q = null;
            r = 0;
        }
    }

    public synchronized void c(int i) {
        this.i = i;
    }

    public final synchronized void c(boolean z) {
        this.b = z;
    }

    public synchronized int d() {
        return this.d;
    }

    public void c(long j2) {
        this.m = j2;
    }

    public synchronized void a(long j2, int i, int i2) {
        this.f2776j = j2;
        this.f2774c = i;
        this.f2777l = i;
        this.d = i2;
    }

    public synchronized void b(int i) {
        this.f2774c = i;
        a(i);
    }

    public synchronized void a(com.heytap.accessory.message.b bVar) {
        com.heytap.accessory.message.a aVarC = bVar.c();
        int iC = aVarC == null ? 0 : aVarC.c();
        bVar.a(g());
        this.a.add(bVar);
        this.b = false;
        this.f2775e += (long) iC;
    }

    public synchronized int b() {
        int i;
        i = this.f2777l;
        if (i == 3) {
            return 1;
        }
        return i;
    }

    public synchronized void b(boolean z) {
        this.g = z;
    }

    public synchronized void b(long j2) {
        this.k = j2;
    }

    public synchronized void a(int i) {
        this.f2777l = i;
    }

    public final synchronized void a(b bVar) {
        this.h = bVar;
    }

    public synchronized void a(boolean z) {
        this.f = z;
    }
}
