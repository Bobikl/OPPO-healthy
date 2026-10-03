package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class eqm extends com.xingin.xhssharesdk.a.k<eqm, b> implements k7n {
    public static final eqm o;
    public static volatile com.xingin.xhssharesdk.a.k.b p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11031l;
    public int r;
    public int t;
    public long u;
    public com.xingin.xhssharesdk.a.q<String, String> x = com.xingin.xhssharesdk.a.q.a();
    public String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11032n = "";
    public String q = "";
    public String s = "";
    public String v = "";
    public String w = "";

    public static final class a {
        public static final com.xingin.xhssharesdk.a.j<String, String> a;

        static {
            com.xingin.xhssharesdk.a.c0.a.C1017a c1017a = com.xingin.xhssharesdk.a.c0.a.f20414c;
            a = new com.xingin.xhssharesdk.a.j<>(c1017a, c1017a);
        }
    }

    public static final class b extends com.xingin.xhssharesdk.a.k.a<eqm, b> implements k7n {
        public b() {
            super(eqm.o);
        }
    }

    static {
        eqm eqmVar = new eqm();
        o = eqmVar;
        eqmVar.g();
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final void a(com.xingin.xhssharesdk.a.g gVar) {
        int i = this.f11031l;
        if (i != 0) {
            gVar.j(1, i);
        }
        if (!this.m.isEmpty()) {
            gVar.p(2, this.m);
        }
        if (!this.f11032n.isEmpty()) {
            gVar.p(3, this.f11032n);
        }
        if (!this.q.isEmpty()) {
            gVar.p(4, this.q);
        }
        int i2 = this.r;
        if (i2 != 0) {
            gVar.j(5, i2);
        }
        if (!this.s.isEmpty()) {
            gVar.p(6, this.s);
        }
        int i3 = this.t;
        if (i3 != 0) {
            gVar.j(7, i3);
        }
        long j2 = this.u;
        if (j2 != 0) {
            gVar.w(j2);
        }
        if (!this.v.isEmpty()) {
            gVar.p(9, this.v);
        }
        if (!this.w.isEmpty()) {
            gVar.p(10, this.w);
        }
        for (Map.Entry<String, String> entry : this.x.entrySet()) {
            com.xingin.xhssharesdk.a.j<String, String> jVar = a.a;
            String key = entry.getKey();
            String value = entry.getValue();
            jVar.getClass();
            gVar.o(11, 2);
            com.xingin.xhssharesdk.a.j.a<String, String> aVar = jVar.a;
            gVar.A(com.xingin.xhssharesdk.a.d.a(aVar.f20425c, 2, value) + com.xingin.xhssharesdk.a.d.a(aVar.a, 1, key));
            com.xingin.xhssharesdk.a.j.a<String, String> aVar2 = jVar.a;
            com.xingin.xhssharesdk.a.d.e(gVar, aVar2.a, 1, key);
            com.xingin.xhssharesdk.a.d.e(gVar, aVar2.f20425c, 2, value);
        }
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final int b() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2 = this.f11031l;
        int iB = i2 != 0 ? 0 + com.xingin.xhssharesdk.a.g.b(i2) + com.xingin.xhssharesdk.a.g.n(1) : 0;
        if (!this.m.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(2, this.m);
        }
        if (!this.f11032n.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(3, this.f11032n);
        }
        if (!this.q.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(4, this.q);
        }
        int i3 = this.r;
        if (i3 != 0) {
            iB += com.xingin.xhssharesdk.a.g.b(i3) + com.xingin.xhssharesdk.a.g.n(5);
        }
        if (!this.s.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(6, this.s);
        }
        int i4 = this.t;
        if (i4 != 0) {
            iB += com.xingin.xhssharesdk.a.g.b(i4) + com.xingin.xhssharesdk.a.g.n(7);
        }
        long j2 = this.u;
        if (j2 != 0) {
            iB += com.xingin.xhssharesdk.a.g.d(j2) + com.xingin.xhssharesdk.a.g.n(8);
        }
        if (!this.v.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(9, this.v);
        }
        if (!this.w.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(10, this.w);
        }
        for (Map.Entry<String, String> entry : this.x.entrySet()) {
            com.xingin.xhssharesdk.a.j<String, String> jVar = a.a;
            String key = entry.getKey();
            String value = entry.getValue();
            jVar.getClass();
            int iN = com.xingin.xhssharesdk.a.g.n(11);
            com.xingin.xhssharesdk.a.j.a<String, String> aVar = jVar.a;
            int iA = com.xingin.xhssharesdk.a.d.a(aVar.f20425c, 2, value) + com.xingin.xhssharesdk.a.d.a(aVar.a, 1, key);
            iB += com.xingin.xhssharesdk.a.g.v(iA) + iA + iN;
        }
        this.k = iB;
        return iB;
    }

    @Override // com.xingin.xhssharesdk.a.k
    public final Object c(com.xingin.xhssharesdk.a.k.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar) {
            case a:
                return o;
            case b:
                com.xingin.xhssharesdk.a.k.i iVar = (com.xingin.xhssharesdk.a.k.i) obj;
                eqm eqmVar = (eqm) obj2;
                int i = this.f11031l;
                boolean z2 = i != 0;
                int i2 = eqmVar.f11031l;
                this.f11031l = iVar.g(z2, i, i2 != 0, i2);
                this.m = iVar.c(!this.m.isEmpty(), this.m, !eqmVar.m.isEmpty(), eqmVar.m);
                this.f11032n = iVar.c(!this.f11032n.isEmpty(), this.f11032n, !eqmVar.f11032n.isEmpty(), eqmVar.f11032n);
                this.q = iVar.c(!this.q.isEmpty(), this.q, !eqmVar.q.isEmpty(), eqmVar.q);
                int i3 = this.r;
                boolean z3 = i3 != 0;
                int i4 = eqmVar.r;
                this.r = iVar.g(z3, i3, i4 != 0, i4);
                this.s = iVar.c(!this.s.isEmpty(), this.s, !eqmVar.s.isEmpty(), eqmVar.s);
                int i5 = this.t;
                boolean z4 = i5 != 0;
                int i6 = eqmVar.t;
                this.t = iVar.g(z4, i5, i6 != 0, i6);
                long j2 = this.u;
                boolean z5 = j2 != 0;
                long j3 = eqmVar.u;
                this.u = iVar.f(z5, j2, j3 != 0, j3);
                this.v = iVar.c(!this.v.isEmpty(), this.v, !eqmVar.v.isEmpty(), eqmVar.v);
                this.w = iVar.c(!this.w.isEmpty(), this.w, true ^ eqmVar.w.isEmpty(), eqmVar.w);
                this.x = iVar.d(this.x, eqmVar.x);
                return this;
            case f20429c:
                com.xingin.xhssharesdk.a.c cVar = (com.xingin.xhssharesdk.a.c) obj;
                pzm pzmVar = (pzm) obj2;
                while (!z) {
                    try {
                        int iK = cVar.k();
                        switch (iK) {
                            case 0:
                                break;
                            case 8:
                                this.f11031l = cVar.e();
                                continue;
                            case 18:
                                this.m = cVar.i();
                                continue;
                            case 26:
                                this.f11032n = cVar.i();
                                continue;
                            case 34:
                                this.q = cVar.i();
                                continue;
                            case 40:
                                this.r = cVar.e();
                                continue;
                            case 50:
                                this.s = cVar.i();
                                continue;
                            case 56:
                                this.t = cVar.e();
                                continue;
                            case 64:
                                this.u = cVar.g();
                                continue;
                            case 74:
                                this.v = cVar.i();
                                continue;
                            case 82:
                                this.w = cVar.i();
                                continue;
                            case 90:
                                com.xingin.xhssharesdk.a.q<String, String> qVar = this.x;
                                if (!qVar.a) {
                                    this.x = qVar.isEmpty() ? new com.xingin.xhssharesdk.a.q<>() : new com.xingin.xhssharesdk.a.q<>(qVar);
                                }
                                a.a.b(this.x, cVar, pzmVar);
                                continue;
                            default:
                                if (!cVar.h(iK)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (com.xingin.xhssharesdk.a.m e2) {
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        throw new RuntimeException(new com.xingin.xhssharesdk.a.m(e3.getMessage()));
                    }
                }
                break;
            case d:
                this.x.a = false;
                return null;
            case f20430e:
                return new eqm();
            case f:
                return new b();
            case g:
                break;
            case h:
                if (p == null) {
                    synchronized (eqm.class) {
                        if (p == null) {
                            p = new com.xingin.xhssharesdk.a.k.b(o);
                        }
                        break;
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }
}
