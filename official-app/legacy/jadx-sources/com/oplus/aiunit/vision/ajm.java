package com.oplus.aiunit.vision;

import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class ajm extends com.xingin.xhssharesdk.a.k<ajm, a> implements k7n {
    public static final ajm C;
    public static volatile com.xingin.xhssharesdk.a.k.b D;
    public int A;
    public int N;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9410l;
    public String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f9411n = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public String x = "";
    public String y = "";
    public String z = "";
    public String B = "";
    public String E = "";
    public String F = "";
    public String G = "";
    public String H = "";
    public String I = "";
    public String J = "";
    public String K = "";
    public String L = "";
    public String M = "";

    public static final class a extends com.xingin.xhssharesdk.a.k.a<ajm, a> implements k7n {
        public a() {
            super(ajm.C);
        }
    }

    static {
        ajm ajmVar = new ajm();
        C = ajmVar;
        ajmVar.g();
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final void a(com.xingin.xhssharesdk.a.g gVar) {
        int i = this.f9410l;
        if (i != 0) {
            gVar.j(1, i);
        }
        if (!this.m.isEmpty()) {
            gVar.p(2, this.m);
        }
        if (!this.f9411n.isEmpty()) {
            gVar.p(3, this.f9411n);
        }
        if (!this.q.isEmpty()) {
            gVar.p(4, this.q);
        }
        if (!this.r.isEmpty()) {
            gVar.p(5, this.r);
        }
        if (!this.s.isEmpty()) {
            gVar.p(6, this.s);
        }
        if (!this.t.isEmpty()) {
            gVar.p(7, this.t);
        }
        if (!this.u.isEmpty()) {
            gVar.p(8, this.u);
        }
        if (!this.v.isEmpty()) {
            gVar.p(9, this.v);
        }
        if (!this.w.isEmpty()) {
            gVar.p(10, this.w);
        }
        if (!this.x.isEmpty()) {
            gVar.p(11, this.x);
        }
        if (!this.y.isEmpty()) {
            gVar.p(12, this.y);
        }
        if (!this.z.isEmpty()) {
            gVar.p(13, this.z);
        }
        int i2 = this.A;
        if (i2 != 0) {
            gVar.j(14, i2);
        }
        if (!this.B.isEmpty()) {
            gVar.p(15, this.B);
        }
        if (!this.E.isEmpty()) {
            gVar.p(16, this.E);
        }
        if (!this.F.isEmpty()) {
            gVar.p(17, this.F);
        }
        if (!this.G.isEmpty()) {
            gVar.p(18, this.G);
        }
        if (!this.H.isEmpty()) {
            gVar.p(19, this.H);
        }
        if (!this.I.isEmpty()) {
            gVar.p(20, this.I);
        }
        if (!this.J.isEmpty()) {
            gVar.p(21, this.J);
        }
        if (!this.K.isEmpty()) {
            gVar.p(22, this.K);
        }
        if (!this.L.isEmpty()) {
            gVar.p(23, this.L);
        }
        if (!this.M.isEmpty()) {
            gVar.p(24, this.M);
        }
        int i3 = this.N;
        if (i3 != 0) {
            gVar.j(25, i3);
        }
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final int b() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2 = this.f9410l;
        int iB = 0;
        if (i2 != 0) {
            iB = 0 + com.xingin.xhssharesdk.a.g.b(i2) + com.xingin.xhssharesdk.a.g.n(1);
        }
        if (!this.m.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(2, this.m);
        }
        if (!this.f9411n.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(3, this.f9411n);
        }
        if (!this.q.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(4, this.q);
        }
        if (!this.r.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(5, this.r);
        }
        if (!this.s.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(6, this.s);
        }
        if (!this.t.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(7, this.t);
        }
        if (!this.u.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(8, this.u);
        }
        if (!this.v.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(9, this.v);
        }
        if (!this.w.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(10, this.w);
        }
        if (!this.x.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(11, this.x);
        }
        if (!this.y.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(12, this.y);
        }
        if (!this.z.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(13, this.z);
        }
        int i3 = this.A;
        if (i3 != 0) {
            iB += com.xingin.xhssharesdk.a.g.b(i3) + com.xingin.xhssharesdk.a.g.n(14);
        }
        if (!this.B.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(15, this.B);
        }
        if (!this.E.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(16, this.E);
        }
        if (!this.F.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(17, this.F);
        }
        if (!this.G.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(18, this.G);
        }
        if (!this.H.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(19, this.H);
        }
        if (!this.I.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(20, this.I);
        }
        if (!this.J.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(21, this.J);
        }
        if (!this.K.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(22, this.K);
        }
        if (!this.L.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(23, this.L);
        }
        if (!this.M.isEmpty()) {
            iB += com.xingin.xhssharesdk.a.g.c(24, this.M);
        }
        int i4 = this.N;
        if (i4 != 0) {
            iB += com.xingin.xhssharesdk.a.g.b(i4) + com.xingin.xhssharesdk.a.g.n(25);
        }
        this.k = iB;
        return iB;
    }

    @Override // com.xingin.xhssharesdk.a.k
    public final Object c(com.xingin.xhssharesdk.a.k.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar) {
            case a:
                return C;
            case b:
                com.xingin.xhssharesdk.a.k.i iVar = (com.xingin.xhssharesdk.a.k.i) obj;
                ajm ajmVar = (ajm) obj2;
                int i = this.f9410l;
                boolean z2 = i != 0;
                int i2 = ajmVar.f9410l;
                this.f9410l = iVar.g(z2, i, i2 != 0, i2);
                this.m = iVar.c(!this.m.isEmpty(), this.m, !ajmVar.m.isEmpty(), ajmVar.m);
                this.f9411n = iVar.c(!this.f9411n.isEmpty(), this.f9411n, !ajmVar.f9411n.isEmpty(), ajmVar.f9411n);
                this.q = iVar.c(!this.q.isEmpty(), this.q, !ajmVar.q.isEmpty(), ajmVar.q);
                this.r = iVar.c(!this.r.isEmpty(), this.r, !ajmVar.r.isEmpty(), ajmVar.r);
                this.s = iVar.c(!this.s.isEmpty(), this.s, !ajmVar.s.isEmpty(), ajmVar.s);
                this.t = iVar.c(!this.t.isEmpty(), this.t, !ajmVar.t.isEmpty(), ajmVar.t);
                this.u = iVar.c(!this.u.isEmpty(), this.u, !ajmVar.u.isEmpty(), ajmVar.u);
                this.v = iVar.c(!this.v.isEmpty(), this.v, !ajmVar.v.isEmpty(), ajmVar.v);
                this.w = iVar.c(!this.w.isEmpty(), this.w, !ajmVar.w.isEmpty(), ajmVar.w);
                this.x = iVar.c(!this.x.isEmpty(), this.x, !ajmVar.x.isEmpty(), ajmVar.x);
                this.y = iVar.c(!this.y.isEmpty(), this.y, !ajmVar.y.isEmpty(), ajmVar.y);
                this.z = iVar.c(!this.z.isEmpty(), this.z, !ajmVar.z.isEmpty(), ajmVar.z);
                int i3 = this.A;
                boolean z3 = i3 != 0;
                int i4 = ajmVar.A;
                this.A = iVar.g(z3, i3, i4 != 0, i4);
                this.B = iVar.c(!this.B.isEmpty(), this.B, !ajmVar.B.isEmpty(), ajmVar.B);
                this.E = iVar.c(!this.E.isEmpty(), this.E, !ajmVar.E.isEmpty(), ajmVar.E);
                this.F = iVar.c(!this.F.isEmpty(), this.F, !ajmVar.F.isEmpty(), ajmVar.F);
                this.G = iVar.c(!this.G.isEmpty(), this.G, !ajmVar.G.isEmpty(), ajmVar.G);
                this.H = iVar.c(!this.H.isEmpty(), this.H, !ajmVar.H.isEmpty(), ajmVar.H);
                this.I = iVar.c(!this.I.isEmpty(), this.I, !ajmVar.I.isEmpty(), ajmVar.I);
                this.J = iVar.c(!this.J.isEmpty(), this.J, !ajmVar.J.isEmpty(), ajmVar.J);
                this.K = iVar.c(!this.K.isEmpty(), this.K, !ajmVar.K.isEmpty(), ajmVar.K);
                this.L = iVar.c(!this.L.isEmpty(), this.L, !ajmVar.L.isEmpty(), ajmVar.L);
                this.M = iVar.c(!this.M.isEmpty(), this.M, !ajmVar.M.isEmpty(), ajmVar.M);
                int i5 = this.N;
                boolean z4 = i5 != 0;
                int i6 = ajmVar.N;
                this.N = iVar.g(z4, i5, i6 != 0, i6);
                return this;
            case f20429c:
                com.xingin.xhssharesdk.a.c cVar = (com.xingin.xhssharesdk.a.c) obj;
                while (!z) {
                    try {
                        int iK = cVar.k();
                        switch (iK) {
                            case 0:
                                break;
                            case 8:
                                this.f9410l = cVar.e();
                                continue;
                            case 18:
                                this.m = cVar.i();
                                continue;
                            case 26:
                                this.f9411n = cVar.i();
                                continue;
                            case 34:
                                this.q = cVar.i();
                                continue;
                            case 42:
                                this.r = cVar.i();
                                continue;
                            case 50:
                                this.s = cVar.i();
                                continue;
                            case 58:
                                this.t = cVar.i();
                                continue;
                            case 66:
                                this.u = cVar.i();
                                continue;
                            case 74:
                                this.v = cVar.i();
                                continue;
                            case 82:
                                this.w = cVar.i();
                                continue;
                            case 90:
                                this.x = cVar.i();
                                continue;
                            case 98:
                                this.y = cVar.i();
                                continue;
                            case 106:
                                this.z = cVar.i();
                                continue;
                            case 112:
                                this.A = cVar.e();
                                continue;
                            case 122:
                                this.B = cVar.i();
                                continue;
                            case 130:
                                this.E = cVar.i();
                                continue;
                            case ATDataProfile.CMD_BLOOD_OXYGEN_RECORD /* 138 */:
                                this.F = cVar.i();
                                continue;
                            case 146:
                                this.G = cVar.i();
                                continue;
                            case 154:
                                this.H = cVar.i();
                                continue;
                            case 162:
                                this.I = cVar.i();
                                continue;
                            case 170:
                                this.J = cVar.i();
                                continue;
                            case 178:
                                this.K = cVar.i();
                                continue;
                            case 186:
                                this.L = cVar.i();
                                continue;
                            case 194:
                                this.M = cVar.i();
                                continue;
                            case 200:
                                this.N = cVar.e();
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
                return null;
            case f20430e:
                return new ajm();
            case f:
                return new a();
            case g:
                break;
            case h:
                if (D == null) {
                    synchronized (ajm.class) {
                        if (D == null) {
                            D = new com.xingin.xhssharesdk.a.k.b(C);
                        }
                        break;
                    }
                }
                return D;
            default:
                throw new UnsupportedOperationException();
        }
        return C;
    }
}
