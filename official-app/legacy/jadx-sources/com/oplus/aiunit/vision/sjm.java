package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class sjm {
    public static sjm d;
    public com.amap.api.col.p0003sl.q0 a;
    public LinkedHashMap<String, u4n> b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16627c = true;

    public sjm() {
        try {
            if (this.a == null) {
                this.a = com.amap.api.col.p0003sl.q0.k();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static sjm a() {
        return f();
    }

    public static synchronized sjm f() {
        try {
            sjm sjmVar = d;
            if (sjmVar == null) {
                d = new sjm();
            } else if (sjmVar.a == null) {
                sjmVar.a = com.amap.api.col.p0003sl.q0.j();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return d;
    }

    public static void h() {
        d = null;
    }

    public final void b(rjm rjmVar) {
        synchronized (this.b) {
            com.amap.api.col.p0003sl.c cVar = (com.amap.api.col.p0003sl.c) this.b.get(rjmVar.b());
            if (cVar == null) {
                return;
            }
            cVar.a();
            this.b.remove(rjmVar.b());
        }
    }

    public final void c(rjm rjmVar, Context context) throws com.amap.api.col.p0003sl.ik {
        if (!this.b.containsKey(rjmVar.b())) {
            com.amap.api.col.p0003sl.c cVar = new com.amap.api.col.p0003sl.c((tnm) rjmVar, context.getApplicationContext(), (byte) 0);
            synchronized (this.b) {
                this.b.put(rjmVar.b(), cVar);
            }
        }
        this.a.b(this.b.get(rjmVar.b()));
    }

    public final void d() {
        g();
        this.a.g();
        this.a = null;
        h();
    }

    public final void e(rjm rjmVar) {
        com.amap.api.col.p0003sl.c cVar = (com.amap.api.col.p0003sl.c) this.b.get(rjmVar.b());
        if (cVar != null) {
            synchronized (this.b) {
                cVar.b();
                this.b.remove(rjmVar.b());
            }
        }
    }

    public final void g() {
        synchronized (this.b) {
            if (this.b.size() <= 0) {
                return;
            }
            for (Map.Entry<String, u4n> entry : this.b.entrySet()) {
                entry.getKey();
                ((com.amap.api.col.p0003sl.c) entry.getValue()).a();
            }
            this.b.clear();
        }
    }
}
