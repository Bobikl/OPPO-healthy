package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class rb6 {
    public static h86[] g = new h86[0];
    public a86 a;
    public h86 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h86 f16149c;
    public h86[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16150e;
    public Hashtable f;

    public static abstract class a extends rb6 {
        public a(a86 a86Var, h86 h86Var, h86 h86Var2) {
            super(a86Var, h86Var, h86Var2);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public boolean B() {
            h86 h86VarL;
            h86 h86VarP;
            a86 a86VarI = i();
            h86 h86Var = this.b;
            h86 h86VarN = a86VarI.n();
            h86 h86VarO = a86VarI.o();
            int iQ = a86VarI.q();
            if (iQ != 6) {
                h86 h86Var2 = this.f16149c;
                h86 h86VarJ = h86Var2.a(h86Var).j(h86Var2);
                if (iQ != 0) {
                    if (iQ != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    h86 h86Var3 = this.d[0];
                    if (!h86Var3.h()) {
                        h86 h86VarJ2 = h86Var3.j(h86Var3.o());
                        h86VarJ = h86VarJ.j(h86Var3);
                        h86VarN = h86VarN.j(h86Var3);
                        h86VarO = h86VarO.j(h86VarJ2);
                    }
                }
                return h86VarJ.equals(h86Var.a(h86VarN).j(h86Var.o()).a(h86VarO));
            }
            h86 h86Var4 = this.d[0];
            boolean zH = h86Var4.h();
            if (h86Var.i()) {
                h86 h86VarO2 = this.f16149c.o();
                if (!zH) {
                    h86VarO = h86VarO.j(h86Var4.o());
                }
                return h86VarO2.equals(h86VarO);
            }
            h86 h86Var5 = this.f16149c;
            h86 h86VarO3 = h86Var.o();
            if (zH) {
                h86VarL = h86Var5.o().a(h86Var5).a(h86VarN);
                h86VarP = h86VarO3.o().a(h86VarO);
            } else {
                h86 h86VarO4 = h86Var4.o();
                h86 h86VarO5 = h86VarO4.o();
                h86VarL = h86Var5.a(h86Var4).l(h86Var5, h86VarN, h86VarO4);
                h86VarP = h86VarO3.p(h86VarO, h86VarO5);
            }
            return h86VarL.j(h86VarO3).equals(h86VarP);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 C(h86 h86Var) {
            if (t()) {
                return this;
            }
            int iJ = j();
            if (iJ == 5) {
                h86 h86VarN = n();
                return i().i(h86VarN, o().a(h86VarN).d(h86Var).a(h86VarN.j(h86Var)), p(), this.f16150e);
            }
            if (iJ != 6) {
                return super.C(h86Var);
            }
            h86 h86VarN2 = n();
            h86 h86VarO = o();
            h86 h86Var2 = p()[0];
            h86 h86VarJ = h86VarN2.j(h86Var.o());
            return i().i(h86VarJ, h86VarO.a(h86VarN2).a(h86VarJ), new h86[]{h86Var2.j(h86Var)}, this.f16150e);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 D(h86 h86Var) {
            if (t()) {
                return this;
            }
            int iJ = j();
            if (iJ != 5 && iJ != 6) {
                return super.D(h86Var);
            }
            h86 h86VarN = n();
            return i().i(h86VarN, o().a(h86VarN).j(h86Var).a(h86VarN), p(), this.f16150e);
        }

        public a I(int i) {
            if (t()) {
                return this;
            }
            a86 a86VarI = i();
            int iQ = a86VarI.q();
            h86 h86Var = this.b;
            if (iQ != 0) {
                if (iQ != 1) {
                    if (iQ != 5) {
                        if (iQ != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (a) a86VarI.i(h86Var.q(i), this.f16149c.q(i), new h86[]{this.d[0].q(i)}, this.f16150e);
            }
            return (a) a86VarI.h(h86Var.q(i), this.f16149c.q(i), this.f16150e);
        }

        public a(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr) {
            super(a86Var, h86Var, h86Var2, h86VarArr);
        }
    }

    public static abstract class b extends rb6 {
        public b(a86 a86Var, h86 h86Var, h86 h86Var2) {
            super(a86Var, h86Var, h86Var2);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public boolean B() {
            h86 h86Var = this.b;
            h86 h86Var2 = this.f16149c;
            h86 h86VarN = this.a.n();
            h86 h86VarO = this.a.o();
            h86 h86VarO2 = h86Var2.o();
            int iJ = j();
            if (iJ != 0) {
                if (iJ == 1) {
                    h86 h86Var3 = this.d[0];
                    if (!h86Var3.h()) {
                        h86 h86VarO3 = h86Var3.o();
                        h86 h86VarJ = h86Var3.j(h86VarO3);
                        h86VarO2 = h86VarO2.j(h86Var3);
                        h86VarN = h86VarN.j(h86VarO3);
                        h86VarO = h86VarO.j(h86VarJ);
                    }
                } else {
                    if (iJ != 2 && iJ != 3 && iJ != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    h86 h86Var4 = this.d[0];
                    if (!h86Var4.h()) {
                        h86 h86VarO4 = h86Var4.o();
                        h86 h86VarO5 = h86VarO4.o();
                        h86 h86VarJ2 = h86VarO4.j(h86VarO5);
                        h86VarN = h86VarN.j(h86VarO5);
                        h86VarO = h86VarO.j(h86VarJ2);
                    }
                }
            }
            return h86VarO2.equals(h86Var.o().a(h86VarN).j(h86Var).a(h86VarO));
        }

        @Override // com.oplus.aiunit.vision.rb6
        public boolean h() {
            return g().s();
        }

        public b(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr) {
            super(a86Var, h86Var, h86Var2, h86VarArr);
        }
    }

    public static class c extends a {
        public c(a86 a86Var, h86 h86Var, h86 h86Var2) {
            this(a86Var, h86Var, h86Var2, false);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 G() {
            h86 h86VarA;
            if (t()) {
                return this;
            }
            a86 a86VarI = i();
            h86 h86VarJ = this.b;
            if (h86VarJ.i()) {
                return a86VarI.t();
            }
            int iQ = a86VarI.q();
            if (iQ == 0) {
                h86 h86VarA2 = this.f16149c.d(h86VarJ).a(h86VarJ);
                h86 h86VarA3 = h86VarA2.o().a(h86VarA2).a(a86VarI.n());
                return new c(a86VarI, h86VarA3, h86VarJ.p(h86VarA3, h86VarA2.b()), this.f16150e);
            }
            if (iQ == 1) {
                h86 h86VarJ2 = this.f16149c;
                h86 h86Var = this.d[0];
                boolean zH = h86Var.h();
                h86 h86VarJ3 = zH ? h86VarJ : h86VarJ.j(h86Var);
                if (!zH) {
                    h86VarJ2 = h86VarJ2.j(h86Var);
                }
                h86 h86VarO = h86VarJ.o();
                h86 h86VarA4 = h86VarO.a(h86VarJ2);
                h86 h86VarO2 = h86VarJ3.o();
                h86 h86VarA5 = h86VarA4.a(h86VarJ3);
                h86 h86VarL = h86VarA5.l(h86VarA4, h86VarO2, a86VarI.n());
                return new c(a86VarI, h86VarJ3.j(h86VarL), h86VarO.o().l(h86VarJ3, h86VarL, h86VarA5), new h86[]{h86VarJ3.j(h86VarO2)}, this.f16150e);
            }
            if (iQ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            h86 h86Var2 = this.f16149c;
            h86 h86Var3 = this.d[0];
            boolean zH2 = h86Var3.h();
            h86 h86VarJ4 = zH2 ? h86Var2 : h86Var2.j(h86Var3);
            h86 h86VarO3 = zH2 ? h86Var3 : h86Var3.o();
            h86 h86VarN = a86VarI.n();
            h86 h86VarJ5 = zH2 ? h86VarN : h86VarN.j(h86VarO3);
            h86 h86VarA6 = h86Var2.o().a(h86VarJ4).a(h86VarJ5);
            if (h86VarA6.i()) {
                return new c(a86VarI, h86VarA6, a86VarI.o().n(), this.f16150e);
            }
            h86 h86VarO4 = h86VarA6.o();
            h86 h86VarJ6 = zH2 ? h86VarA6 : h86VarA6.j(h86VarO3);
            h86 h86VarO5 = a86VarI.o();
            if (h86VarO5.c() < (a86VarI.s() >> 1)) {
                h86 h86VarO6 = h86Var2.a(h86VarJ).o();
                h86VarA = h86VarO6.a(h86VarA6).a(h86VarO3).j(h86VarO6).a(h86VarO5.h() ? h86VarJ5.a(h86VarO3).o() : h86VarJ5.p(h86VarO5, h86VarO3.o())).a(h86VarO4);
                if (h86VarN.i()) {
                    h86VarA = h86VarA.a(h86VarJ6);
                } else if (!h86VarN.h()) {
                    h86VarA = h86VarA.a(h86VarN.b().j(h86VarJ6));
                }
            } else {
                if (!zH2) {
                    h86VarJ = h86VarJ.j(h86Var3);
                }
                h86VarA = h86VarJ.p(h86VarA6, h86VarJ4).a(h86VarO4).a(h86VarJ6);
            }
            return new c(a86VarI, h86VarO4, h86VarA, new h86[]{h86VarJ6}, this.f16150e);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 H(rb6 rb6Var) {
            if (t()) {
                return rb6Var;
            }
            if (rb6Var.t()) {
                return G();
            }
            a86 a86VarI = i();
            h86 h86Var = this.b;
            if (h86Var.i()) {
                return rb6Var;
            }
            if (a86VarI.q() != 6) {
                return G().a(rb6Var);
            }
            h86 h86Var2 = rb6Var.b;
            h86 h86Var3 = rb6Var.d[0];
            if (h86Var2.i() || !h86Var3.h()) {
                return G().a(rb6Var);
            }
            h86 h86Var4 = this.f16149c;
            h86 h86Var5 = this.d[0];
            h86 h86Var6 = rb6Var.f16149c;
            h86 h86VarO = h86Var.o();
            h86 h86VarO2 = h86Var4.o();
            h86 h86VarO3 = h86Var5.o();
            h86 h86VarA = a86VarI.n().j(h86VarO3).a(h86VarO2).a(h86Var4.j(h86Var5));
            h86 h86VarB = h86Var6.b();
            h86 h86VarL = a86VarI.n().a(h86VarB).j(h86VarO3).a(h86VarO2).l(h86VarA, h86VarO, h86VarO3);
            h86 h86VarJ = h86Var2.j(h86VarO3);
            h86 h86VarO4 = h86VarJ.a(h86VarA).o();
            if (h86VarO4.i()) {
                return h86VarL.i() ? rb6Var.G() : a86VarI.t();
            }
            if (h86VarL.i()) {
                return new c(a86VarI, h86VarL, a86VarI.o().n(), this.f16150e);
            }
            h86 h86VarJ2 = h86VarL.o().j(h86VarJ);
            h86 h86VarJ3 = h86VarL.j(h86VarO4).j(h86VarO3);
            return new c(a86VarI, h86VarJ2, h86VarL.a(h86VarO4).o().l(h86VarA, h86VarB, h86VarJ3), new h86[]{h86VarJ3}, this.f16150e);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 a(rb6 rb6Var) {
            h86 h86VarJ;
            h86 h86VarJ2;
            h86 h86VarJ3;
            h86 h86VarA;
            h86 h86VarM;
            h86 h86VarA2;
            if (t()) {
                return rb6Var;
            }
            if (rb6Var.t()) {
                return this;
            }
            a86 a86VarI = i();
            int iQ = a86VarI.q();
            h86 h86VarJ4 = this.b;
            h86 h86Var = rb6Var.b;
            if (iQ == 0) {
                h86 h86Var2 = this.f16149c;
                h86 h86Var3 = rb6Var.f16149c;
                h86 h86VarA3 = h86VarJ4.a(h86Var);
                h86 h86VarA4 = h86Var2.a(h86Var3);
                if (h86VarA3.i()) {
                    return h86VarA4.i() ? G() : a86VarI.t();
                }
                h86 h86VarD = h86VarA4.d(h86VarA3);
                h86 h86VarA5 = h86VarD.o().a(h86VarD).a(h86VarA3).a(a86VarI.n());
                return new c(a86VarI, h86VarA5, h86VarD.j(h86VarJ4.a(h86VarA5)).a(h86VarA5).a(h86Var2), this.f16150e);
            }
            if (iQ == 1) {
                h86 h86Var4 = this.f16149c;
                h86 h86VarJ5 = this.d[0];
                h86 h86Var5 = rb6Var.f16149c;
                h86 h86Var6 = rb6Var.d[0];
                boolean zH = h86Var6.h();
                h86 h86VarA6 = h86VarJ5.j(h86Var5).a(zH ? h86Var4 : h86Var4.j(h86Var6));
                h86 h86VarA7 = h86VarJ5.j(h86Var).a(zH ? h86VarJ4 : h86VarJ4.j(h86Var6));
                if (h86VarA7.i()) {
                    return h86VarA6.i() ? G() : a86VarI.t();
                }
                h86 h86VarO = h86VarA7.o();
                h86 h86VarJ6 = h86VarO.j(h86VarA7);
                if (!zH) {
                    h86VarJ5 = h86VarJ5.j(h86Var6);
                }
                h86 h86VarA8 = h86VarA6.a(h86VarA7);
                h86 h86VarA9 = h86VarA8.l(h86VarA6, h86VarO, a86VarI.n()).j(h86VarJ5).a(h86VarJ6);
                h86 h86VarJ7 = h86VarA7.j(h86VarA9);
                if (!zH) {
                    h86VarO = h86VarO.j(h86Var6);
                }
                return new c(a86VarI, h86VarJ7, h86VarA6.l(h86VarJ4, h86VarA7, h86Var4).l(h86VarO, h86VarA8, h86VarA9), new h86[]{h86VarJ6.j(h86VarJ5)}, this.f16150e);
            }
            if (iQ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (h86VarJ4.i()) {
                return h86Var.i() ? a86VarI.t() : rb6Var.a(this);
            }
            h86 h86Var7 = this.f16149c;
            h86 h86Var8 = this.d[0];
            h86 h86Var9 = rb6Var.f16149c;
            h86 h86Var10 = rb6Var.d[0];
            boolean zH2 = h86Var8.h();
            if (zH2) {
                h86VarJ = h86Var;
                h86VarJ2 = h86Var9;
            } else {
                h86VarJ = h86Var.j(h86Var8);
                h86VarJ2 = h86Var9.j(h86Var8);
            }
            boolean zH3 = h86Var10.h();
            if (zH3) {
                h86VarJ3 = h86Var7;
            } else {
                h86VarJ4 = h86VarJ4.j(h86Var10);
                h86VarJ3 = h86Var7.j(h86Var10);
            }
            h86 h86VarA10 = h86VarJ3.a(h86VarJ2);
            h86 h86VarA11 = h86VarJ4.a(h86VarJ);
            if (h86VarA11.i()) {
                return h86VarA10.i() ? G() : a86VarI.t();
            }
            if (h86Var.i()) {
                rb6 rb6VarY = y();
                h86 h86VarQ = rb6VarY.q();
                h86 h86VarR = rb6VarY.r();
                h86 h86VarD2 = h86VarR.a(h86Var9).d(h86VarQ);
                h86VarA = h86VarD2.o().a(h86VarD2).a(h86VarQ).a(a86VarI.n());
                if (h86VarA.i()) {
                    return new c(a86VarI, h86VarA, a86VarI.o().n(), this.f16150e);
                }
                h86VarA2 = h86VarD2.j(h86VarQ.a(h86VarA)).a(h86VarA).a(h86VarR).d(h86VarA).a(h86VarA);
                h86VarM = a86VarI.m(z76.ONE);
            } else {
                h86 h86VarO2 = h86VarA11.o();
                h86 h86VarJ8 = h86VarA10.j(h86VarJ4);
                h86 h86VarJ9 = h86VarA10.j(h86VarJ);
                h86 h86VarJ10 = h86VarJ8.j(h86VarJ9);
                if (h86VarJ10.i()) {
                    return new c(a86VarI, h86VarJ10, a86VarI.o().n(), this.f16150e);
                }
                h86 h86VarJ11 = h86VarA10.j(h86VarO2);
                h86 h86VarJ12 = !zH3 ? h86VarJ11.j(h86Var10) : h86VarJ11;
                h86 h86VarP = h86VarJ9.a(h86VarO2).p(h86VarJ12, h86Var7.a(h86Var8));
                if (!zH2) {
                    h86VarJ12 = h86VarJ12.j(h86Var8);
                }
                h86VarA = h86VarJ10;
                h86VarM = h86VarJ12;
                h86VarA2 = h86VarP;
            }
            return new c(a86VarI, h86VarA, h86VarA2, new h86[]{h86VarM}, this.f16150e);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 d() {
            return new c(null, f(), g());
        }

        @Override // com.oplus.aiunit.vision.rb6
        public boolean h() {
            h86 h86VarN = n();
            if (h86VarN.i()) {
                return false;
            }
            h86 h86VarO = o();
            int iJ = j();
            if (iJ == 5 || iJ == 6) {
                return h86VarO.s() != h86VarN.s();
            }
            return h86VarO.d(h86VarN).s();
        }

        @Override // com.oplus.aiunit.vision.rb6
        public h86 r() {
            int iJ = j();
            if (iJ != 5 && iJ != 6) {
                return this.f16149c;
            }
            h86 h86Var = this.b;
            h86 h86Var2 = this.f16149c;
            if (t() || h86Var.i()) {
                return h86Var2;
            }
            h86 h86VarJ = h86Var2.a(h86Var).j(h86Var);
            if (6 != iJ) {
                return h86VarJ;
            }
            h86 h86Var3 = this.d[0];
            return !h86Var3.h() ? h86VarJ.d(h86Var3) : h86VarJ;
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 x() {
            if (t()) {
                return this;
            }
            h86 h86Var = this.b;
            if (h86Var.i()) {
                return this;
            }
            int iJ = j();
            if (iJ == 0) {
                return new c(this.a, h86Var, this.f16149c.a(h86Var), this.f16150e);
            }
            if (iJ == 1) {
                return new c(this.a, h86Var, this.f16149c.a(h86Var), new h86[]{this.d[0]}, this.f16150e);
            }
            if (iJ == 5) {
                return new c(this.a, h86Var, this.f16149c.b(), this.f16150e);
            }
            if (iJ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            h86 h86Var2 = this.f16149c;
            h86 h86Var3 = this.d[0];
            return new c(this.a, h86Var, h86Var2.a(h86Var3), new h86[]{h86Var3}, this.f16150e);
        }

        public c(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
            super(a86Var, h86Var, h86Var2);
            if ((h86Var == null) != (h86Var2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (h86Var != null) {
                h86.a.u(this.b, this.f16149c);
                if (a86Var != null) {
                    h86.a.u(this.b, this.a.n());
                }
            }
            this.f16150e = z;
        }

        public c(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
            super(a86Var, h86Var, h86Var2, h86VarArr);
            this.f16150e = z;
        }
    }

    public static class d extends b {
        public d(a86 a86Var, h86 h86Var, h86 h86Var2) {
            this(a86Var, h86Var, h86Var2, false);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 E() {
            if (t()) {
                return this;
            }
            h86 h86Var = this.f16149c;
            if (h86Var.i()) {
                return this;
            }
            a86 a86VarI = i();
            int iQ = a86VarI.q();
            if (iQ != 0) {
                return iQ != 4 ? G().a(this) : N(false).a(this);
            }
            h86 h86Var2 = this.b;
            h86 h86VarO = O(h86Var);
            h86 h86VarO2 = h86VarO.o();
            h86 h86VarA = M(h86Var2.o()).a(i().n());
            h86 h86VarR = M(h86Var2).j(h86VarO2).r(h86VarA.o());
            if (h86VarR.i()) {
                return i().t();
            }
            h86 h86VarG = h86VarR.j(h86VarO).g();
            h86 h86VarJ = h86VarR.j(h86VarG).j(h86VarA);
            h86 h86VarR2 = h86VarO2.o().j(h86VarG).r(h86VarJ);
            h86 h86VarA2 = h86VarR2.r(h86VarJ).j(h86VarJ.a(h86VarR2)).a(h86Var2);
            return new d(a86VarI, h86VarA2, h86Var2.r(h86VarA2).j(h86VarR2).r(h86Var), this.f16150e);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 F(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i == 0 || t()) {
                return this;
            }
            if (i == 1) {
                return G();
            }
            a86 a86VarI = i();
            h86 h86VarR = this.f16149c;
            if (h86VarR.i()) {
                return a86VarI.t();
            }
            int iQ = a86VarI.q();
            h86 h86VarN = a86VarI.n();
            h86 h86VarJ = this.b;
            h86[] h86VarArr = this.d;
            h86 h86VarM = h86VarArr.length < 1 ? a86VarI.m(z76.ONE) : h86VarArr[0];
            if (!h86VarM.h() && iQ != 0) {
                if (iQ == 1) {
                    h86 h86VarO = h86VarM.o();
                    h86VarJ = h86VarJ.j(h86VarM);
                    h86VarR = h86VarR.j(h86VarO);
                    h86VarN = I(h86VarM, h86VarO);
                } else if (iQ == 2) {
                    h86VarN = I(h86VarM, null);
                } else {
                    if (iQ != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    h86VarN = L();
                }
            }
            int i2 = 0;
            while (i2 < i) {
                if (h86VarR.i()) {
                    return a86VarI.t();
                }
                h86 h86VarM2 = M(h86VarJ.o());
                h86 h86VarO2 = O(h86VarR);
                h86 h86VarJ2 = h86VarO2.j(h86VarR);
                h86 h86VarO3 = O(h86VarJ.j(h86VarJ2));
                h86 h86VarO4 = O(h86VarJ2.o());
                if (!h86VarN.i()) {
                    h86VarM2 = h86VarM2.a(h86VarN);
                    h86VarN = O(h86VarO4.j(h86VarN));
                }
                h86 h86VarR2 = h86VarM2.o().r(O(h86VarO3));
                h86VarR = h86VarM2.j(h86VarO3.r(h86VarR2)).r(h86VarO4);
                h86VarM = h86VarM.h() ? h86VarO2 : h86VarO2.j(h86VarM);
                i2++;
                h86VarJ = h86VarR2;
            }
            if (iQ == 0) {
                h86 h86VarG = h86VarM.g();
                h86 h86VarO5 = h86VarG.o();
                return new d(a86VarI, h86VarJ.j(h86VarO5), h86VarR.j(h86VarO5.j(h86VarG)), this.f16150e);
            }
            if (iQ == 1) {
                return new d(a86VarI, h86VarJ.j(h86VarM), h86VarR, new h86[]{h86VarM.j(h86VarM.o())}, this.f16150e);
            }
            if (iQ == 2) {
                return new d(a86VarI, h86VarJ, h86VarR, new h86[]{h86VarM}, this.f16150e);
            }
            if (iQ == 4) {
                return new d(a86VarI, h86VarJ, h86VarR, new h86[]{h86VarM, h86VarN}, this.f16150e);
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 G() {
            h86 h86VarR;
            h86 h86VarK;
            if (t()) {
                return this;
            }
            a86 a86VarI = i();
            h86 h86Var = this.f16149c;
            if (h86Var.i()) {
                return a86VarI.t();
            }
            int iQ = a86VarI.q();
            h86 h86Var2 = this.b;
            if (iQ == 0) {
                h86 h86VarD = M(h86Var2.o()).a(i().n()).d(O(h86Var));
                h86 h86VarR2 = h86VarD.o().r(O(h86Var2));
                return new d(a86VarI, h86VarR2, h86VarD.j(h86Var2.r(h86VarR2)).r(h86Var), this.f16150e);
            }
            if (iQ == 1) {
                h86 h86Var3 = this.d[0];
                boolean zH = h86Var3.h();
                h86 h86VarN = a86VarI.n();
                if (!h86VarN.i() && !zH) {
                    h86VarN = h86VarN.j(h86Var3.o());
                }
                h86 h86VarA = h86VarN.a(M(h86Var2.o()));
                h86 h86VarJ = zH ? h86Var : h86Var.j(h86Var3);
                h86 h86VarO = zH ? h86Var.o() : h86VarJ.j(h86Var);
                h86 h86VarK2 = K(h86Var2.j(h86VarO));
                h86 h86VarR3 = h86VarA.o().r(O(h86VarK2));
                h86 h86VarO2 = O(h86VarJ);
                h86 h86VarJ2 = h86VarR3.j(h86VarO2);
                h86 h86VarO3 = O(h86VarO);
                return new d(a86VarI, h86VarJ2, h86VarK2.r(h86VarR3).j(h86VarA).r(O(h86VarO3.o())), new h86[]{O(zH ? O(h86VarO3) : h86VarO2.o()).j(h86VarJ)}, this.f16150e);
            }
            if (iQ != 2) {
                if (iQ == 4) {
                    return N(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            h86 h86Var4 = this.d[0];
            boolean zH2 = h86Var4.h();
            h86 h86VarO4 = h86Var.o();
            h86 h86VarO5 = h86VarO4.o();
            h86 h86VarN2 = a86VarI.n();
            h86 h86VarM = h86VarN2.m();
            if (h86VarM.t().equals(BigInteger.valueOf(3L))) {
                h86 h86VarO6 = zH2 ? h86Var4 : h86Var4.o();
                h86VarR = M(h86Var2.a(h86VarO6).j(h86Var2.r(h86VarO6)));
                h86VarK = K(h86VarO4.j(h86Var2));
            } else {
                h86 h86VarM2 = M(h86Var2.o());
                if (zH2) {
                    h86VarR = h86VarM2.a(h86VarN2);
                } else if (h86VarN2.i()) {
                    h86VarR = h86VarM2;
                } else {
                    h86 h86VarO7 = h86Var4.o().o();
                    h86VarR = h86VarM.c() < h86VarN2.c() ? h86VarM2.r(h86VarO7.j(h86VarM)) : h86VarM2.a(h86VarO7.j(h86VarN2));
                }
                h86VarK = K(h86Var2.j(h86VarO4));
            }
            h86 h86VarR4 = h86VarR.o().r(O(h86VarK));
            h86 h86VarR5 = h86VarK.r(h86VarR4).j(h86VarR).r(J(h86VarO5));
            h86 h86VarO8 = O(h86Var);
            if (!zH2) {
                h86VarO8 = h86VarO8.j(h86Var4);
            }
            return new d(a86VarI, h86VarR4, h86VarR5, new h86[]{h86VarO8}, this.f16150e);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 H(rb6 rb6Var) {
            if (this == rb6Var) {
                return E();
            }
            if (t()) {
                return rb6Var;
            }
            if (rb6Var.t()) {
                return G();
            }
            h86 h86Var = this.f16149c;
            if (h86Var.i()) {
                return rb6Var;
            }
            a86 a86VarI = i();
            int iQ = a86VarI.q();
            if (iQ != 0) {
                return iQ != 4 ? G().a(rb6Var) : N(false).a(rb6Var);
            }
            h86 h86Var2 = this.b;
            h86 h86Var3 = rb6Var.b;
            h86 h86Var4 = rb6Var.f16149c;
            h86 h86VarR = h86Var3.r(h86Var2);
            h86 h86VarR2 = h86Var4.r(h86Var);
            if (h86VarR.i()) {
                return h86VarR2.i() ? E() : this;
            }
            h86 h86VarO = h86VarR.o();
            h86 h86VarR3 = h86VarO.j(O(h86Var2).a(h86Var3)).r(h86VarR2.o());
            if (h86VarR3.i()) {
                return a86VarI.t();
            }
            h86 h86VarG = h86VarR3.j(h86VarR).g();
            h86 h86VarJ = h86VarR3.j(h86VarG).j(h86VarR2);
            h86 h86VarR4 = O(h86Var).j(h86VarO).j(h86VarR).j(h86VarG).r(h86VarJ);
            h86 h86VarA = h86VarR4.r(h86VarJ).j(h86VarJ.a(h86VarR4)).a(h86Var3);
            return new d(a86VarI, h86VarA, h86Var2.r(h86VarA).j(h86VarR4).r(h86Var), this.f16150e);
        }

        public h86 I(h86 h86Var, h86 h86Var2) {
            h86 h86VarN = i().n();
            if (h86VarN.i() || h86Var.h()) {
                return h86VarN;
            }
            if (h86Var2 == null) {
                h86Var2 = h86Var.o();
            }
            h86 h86VarO = h86Var2.o();
            h86 h86VarM = h86VarN.m();
            return h86VarM.c() < h86VarN.c() ? h86VarO.j(h86VarM).m() : h86VarO.j(h86VarN);
        }

        public h86 J(h86 h86Var) {
            return K(O(h86Var));
        }

        public h86 K(h86 h86Var) {
            return O(O(h86Var));
        }

        public h86 L() {
            h86[] h86VarArr = this.d;
            h86 h86Var = h86VarArr[1];
            if (h86Var != null) {
                return h86Var;
            }
            h86 h86VarI = I(h86VarArr[0], null);
            h86VarArr[1] = h86VarI;
            return h86VarI;
        }

        public h86 M(h86 h86Var) {
            return O(h86Var).a(h86Var);
        }

        public d N(boolean z) {
            h86 h86Var = this.b;
            h86 h86Var2 = this.f16149c;
            h86 h86Var3 = this.d[0];
            h86 h86VarL = L();
            h86 h86VarA = M(h86Var.o()).a(h86VarL);
            h86 h86VarO = O(h86Var2);
            h86 h86VarJ = h86VarO.j(h86Var2);
            h86 h86VarO2 = O(h86Var.j(h86VarJ));
            h86 h86VarR = h86VarA.o().r(O(h86VarO2));
            h86 h86VarO3 = O(h86VarJ.o());
            h86 h86VarR2 = h86VarA.j(h86VarO2.r(h86VarR)).r(h86VarO3);
            h86 h86VarO4 = z ? O(h86VarO3.j(h86VarL)) : null;
            if (!h86Var3.h()) {
                h86VarO = h86VarO.j(h86Var3);
            }
            return new d(i(), h86VarR, h86VarR2, new h86[]{h86VarO, h86VarO4}, this.f16150e);
        }

        public h86 O(h86 h86Var) {
            return h86Var.a(h86Var);
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5401. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        @Override // com.oplus.aiunit.vision.rb6
        public com.oplus.aiunit.vision.rb6 a(com.oplus.aiunit.vision.rb6 r17) {
            /*
                Method dump skipped, instruction units count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oplus.aiunit.vision.rb6.d.a(com.oplus.aiunit.vision.rb6):com.oplus.aiunit.vision.rb6");
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 d() {
            return new d(null, f(), g());
        }

        @Override // com.oplus.aiunit.vision.rb6
        public h86 s(int i) {
            return (i == 1 && 4 == j()) ? L() : super.s(i);
        }

        @Override // com.oplus.aiunit.vision.rb6
        public rb6 x() {
            if (t()) {
                return this;
            }
            a86 a86VarI = i();
            return a86VarI.q() != 0 ? new d(a86VarI, this.b, this.f16149c.m(), this.d, this.f16150e) : new d(a86VarI, this.b, this.f16149c.m(), this.f16150e);
        }

        public d(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
            super(a86Var, h86Var, h86Var2);
            if ((h86Var == null) != (h86Var2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.f16150e = z;
        }

        public d(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
            super(a86Var, h86Var, h86Var2, h86VarArr);
            this.f16150e = z;
        }
    }

    public rb6(a86 a86Var, h86 h86Var, h86 h86Var2) {
        this(a86Var, h86Var, h86Var2, m(a86Var));
    }

    public static h86[] m(a86 a86Var) {
        int iQ = a86Var == null ? 0 : a86Var.q();
        if (iQ == 0 || iQ == 5) {
            return g;
        }
        h86 h86VarM = a86Var.m(z76.ONE);
        if (iQ != 1 && iQ != 2) {
            if (iQ == 3) {
                return new h86[]{h86VarM, h86VarM, h86VarM};
            }
            if (iQ == 4) {
                return new h86[]{h86VarM, a86Var.n()};
            }
            if (iQ != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new h86[]{h86VarM};
    }

    public boolean A() {
        BigInteger bigIntegerP = this.a.p();
        return bigIntegerP == null || bigIntegerP.equals(z76.ONE) || !y76.i(this, bigIntegerP).t();
    }

    public abstract boolean B();

    public rb6 C(h86 h86Var) {
        return t() ? this : i().i(n().j(h86Var), o(), p(), this.f16150e);
    }

    public rb6 D(h86 h86Var) {
        return t() ? this : i().i(n(), o().j(h86Var), p(), this.f16150e);
    }

    public rb6 E() {
        return H(this);
    }

    public rb6 F(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            this = this.G();
        }
    }

    public abstract rb6 G();

    public rb6 H(rb6 rb6Var) {
        return G().a(rb6Var);
    }

    public abstract rb6 a(rb6 rb6Var);

    public void b() {
        if (!u()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public rb6 c(h86 h86Var, h86 h86Var2) {
        return i().h(n().j(h86Var), o().j(h86Var2), this.f16150e);
    }

    public abstract rb6 d();

    public boolean e(rb6 rb6Var) {
        if (rb6Var == null) {
            return false;
        }
        a86 a86VarI = i();
        a86 a86VarI2 = rb6Var.i();
        boolean z = a86VarI == null;
        boolean z2 = a86VarI2 == null;
        boolean zT = t();
        boolean zT2 = rb6Var.t();
        if (zT || zT2) {
            if (zT && zT2) {
                return z || z2 || a86VarI.l(a86VarI2);
            }
            return false;
        }
        if (!z || !z2) {
            if (z) {
                rb6Var = rb6Var.y();
            } else if (z2) {
                this = y();
            } else {
                if (!a86VarI.l(a86VarI2)) {
                    return false;
                }
                rb6[] rb6VarArr = {this, a86VarI.x(rb6Var)};
                a86VarI.y(rb6VarArr);
                this = rb6VarArr[0];
                rb6Var = rb6VarArr[1];
            }
        }
        return this.q().equals(rb6Var.q()) && this.r().equals(rb6Var.r());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rb6) {
            return e((rb6) obj);
        }
        return false;
    }

    public h86 f() {
        b();
        return q();
    }

    public h86 g() {
        b();
        return r();
    }

    public abstract boolean h();

    public int hashCode() {
        a86 a86VarI = i();
        int i = a86VarI == null ? 0 : ~a86VarI.hashCode();
        if (t()) {
            return i;
        }
        rb6 rb6VarY = y();
        return (i ^ (rb6VarY.q().hashCode() * 17)) ^ (rb6VarY.r().hashCode() * 257);
    }

    public a86 i() {
        return this.a;
    }

    public int j() {
        a86 a86Var = this.a;
        if (a86Var == null) {
            return 0;
        }
        return a86Var.q();
    }

    public final rb6 k() {
        return y().d();
    }

    public byte[] l(boolean z) {
        if (t()) {
            return new byte[1];
        }
        rb6 rb6VarY = y();
        byte[] bArrE = rb6VarY.q().e();
        if (z) {
            byte[] bArr = new byte[bArrE.length + 1];
            bArr[0] = (byte) (rb6VarY.h() ? 3 : 2);
            System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
            return bArr;
        }
        byte[] bArrE2 = rb6VarY.r().e();
        byte[] bArr2 = new byte[bArrE.length + bArrE2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(bArrE, 0, bArr2, 1, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr2, bArrE.length + 1, bArrE2.length);
        return bArr2;
    }

    public final h86 n() {
        return this.b;
    }

    public final h86 o() {
        return this.f16149c;
    }

    public final h86[] p() {
        return this.d;
    }

    public h86 q() {
        return this.b;
    }

    public h86 r() {
        return this.f16149c;
    }

    public h86 s(int i) {
        if (i >= 0) {
            h86[] h86VarArr = this.d;
            if (i < h86VarArr.length) {
                return h86VarArr[i];
            }
        }
        return null;
    }

    public boolean t() {
        if (this.b != null && this.f16149c != null) {
            h86[] h86VarArr = this.d;
            if (h86VarArr.length <= 0 || !h86VarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (t()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(n());
        stringBuffer.append(StringUtil.COMMA);
        stringBuffer.append(o());
        for (int i = 0; i < this.d.length; i++) {
            stringBuffer.append(StringUtil.COMMA);
            stringBuffer.append(this.d[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public boolean u() {
        int iJ = j();
        return iJ == 0 || iJ == 5 || t() || this.d[0].h();
    }

    public boolean v() {
        return t() || i() == null || (B() && A());
    }

    public rb6 w(BigInteger bigInteger) {
        return i().u().a(this, bigInteger);
    }

    public abstract rb6 x();

    public rb6 y() {
        int iJ;
        if (t() || (iJ = j()) == 0 || iJ == 5) {
            return this;
        }
        h86 h86VarS = s(0);
        return h86VarS.h() ? this : z(h86VarS.g());
    }

    public rb6 z(h86 h86Var) {
        int iJ = j();
        if (iJ != 1) {
            if (iJ == 2 || iJ == 3 || iJ == 4) {
                h86 h86VarO = h86Var.o();
                return c(h86VarO, h86VarO.j(h86Var));
            }
            if (iJ != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(h86Var, h86Var);
    }

    public rb6(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr) {
        this.f = null;
        this.a = a86Var;
        this.b = h86Var;
        this.f16149c = h86Var2;
        this.d = h86VarArr;
    }
}
