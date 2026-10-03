package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class yng extends rb6.a {
    public yng(a86 a86Var, h86 h86Var, h86 h86Var2) {
        this(a86Var, h86Var, h86Var2, false);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 G() {
        if (t()) {
            return this;
        }
        a86 a86VarI = i();
        h86 h86VarJ = this.b;
        if (h86VarJ.i()) {
            return a86VarI.t();
        }
        h86 h86Var = this.f16149c;
        h86 h86Var2 = this.d[0];
        boolean zH = h86Var2.h();
        h86 h86VarJ2 = zH ? h86Var : h86Var.j(h86Var2);
        h86 h86VarO = zH ? h86Var2 : h86Var2.o();
        h86 h86VarN = a86VarI.n();
        if (!zH) {
            h86VarN = h86VarN.j(h86VarO);
        }
        h86 h86VarA = h86Var.o().a(h86VarJ2).a(h86VarN);
        if (h86VarA.i()) {
            return new yng(a86VarI, h86VarA, a86VarI.o().n(), this.f16150e);
        }
        h86 h86VarO2 = h86VarA.o();
        h86 h86VarJ3 = zH ? h86VarA : h86VarA.j(h86VarO);
        if (!zH) {
            h86VarJ = h86VarJ.j(h86Var2);
        }
        return new yng(a86VarI, h86VarO2, h86VarJ.p(h86VarA, h86VarJ2).a(h86VarO2).a(h86VarJ3), new h86[]{h86VarJ3}, this.f16150e);
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
        h86 h86VarN = rb6Var.n();
        h86 h86VarS = rb6Var.s(0);
        if (h86VarN.i() || !h86VarS.h()) {
            return G().a(rb6Var);
        }
        h86 h86Var2 = this.f16149c;
        h86 h86Var3 = this.d[0];
        h86 h86VarO = rb6Var.o();
        h86 h86VarO2 = h86Var.o();
        h86 h86VarO3 = h86Var2.o();
        h86 h86VarO4 = h86Var3.o();
        h86 h86VarA = a86VarI.n().j(h86VarO4).a(h86VarO3).a(h86Var2.j(h86Var3));
        h86 h86VarB = h86VarO.b();
        h86 h86VarL = a86VarI.n().a(h86VarB).j(h86VarO4).a(h86VarO3).l(h86VarA, h86VarO2, h86VarO4);
        h86 h86VarJ = h86VarN.j(h86VarO4);
        h86 h86VarO5 = h86VarJ.a(h86VarA).o();
        if (h86VarO5.i()) {
            return h86VarL.i() ? rb6Var.G() : a86VarI.t();
        }
        if (h86VarL.i()) {
            return new yng(a86VarI, h86VarL, a86VarI.o().n(), this.f16150e);
        }
        h86 h86VarJ2 = h86VarL.o().j(h86VarJ);
        h86 h86VarJ3 = h86VarL.j(h86VarO5).j(h86VarO4);
        return new yng(a86VarI, h86VarJ2, h86VarL.a(h86VarO5).o().l(h86VarA, h86VarB, h86VarJ3), new h86[]{h86VarJ3}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 a(rb6 rb6Var) {
        h86 h86VarJ;
        h86 h86VarJ2;
        h86 h86VarJ3;
        h86 h86VarA;
        h86 h86Var;
        h86 h86VarM;
        if (t()) {
            return rb6Var;
        }
        if (rb6Var.t()) {
            return this;
        }
        a86 a86VarI = i();
        h86 h86VarJ4 = this.b;
        h86 h86VarN = rb6Var.n();
        if (h86VarJ4.i()) {
            return h86VarN.i() ? a86VarI.t() : rb6Var.a(this);
        }
        h86 h86Var2 = this.f16149c;
        h86 h86Var3 = this.d[0];
        h86 h86VarO = rb6Var.o();
        h86 h86VarS = rb6Var.s(0);
        boolean zH = h86Var3.h();
        if (zH) {
            h86VarJ = h86VarN;
            h86VarJ2 = h86VarO;
        } else {
            h86VarJ = h86VarN.j(h86Var3);
            h86VarJ2 = h86VarO.j(h86Var3);
        }
        boolean zH2 = h86VarS.h();
        if (zH2) {
            h86VarJ3 = h86Var2;
        } else {
            h86VarJ4 = h86VarJ4.j(h86VarS);
            h86VarJ3 = h86Var2.j(h86VarS);
        }
        h86 h86VarA2 = h86VarJ3.a(h86VarJ2);
        h86 h86VarA3 = h86VarJ4.a(h86VarJ);
        if (h86VarA3.i()) {
            return h86VarA2.i() ? G() : a86VarI.t();
        }
        if (h86VarN.i()) {
            rb6 rb6VarY = y();
            h86 h86VarQ = rb6VarY.q();
            h86 h86VarR = rb6VarY.r();
            h86 h86VarD = h86VarR.a(h86VarO).d(h86VarQ);
            h86VarA = h86VarD.o().a(h86VarD).a(h86VarQ).a(a86VarI.n());
            if (h86VarA.i()) {
                return new yng(a86VarI, h86VarA, a86VarI.o().n(), this.f16150e);
            }
            h86 h86VarA4 = h86VarD.j(h86VarQ.a(h86VarA)).a(h86VarA).a(h86VarR).d(h86VarA).a(h86VarA);
            h86VarM = a86VarI.m(z76.ONE);
            h86Var = h86VarA4;
        } else {
            h86 h86VarO2 = h86VarA3.o();
            h86 h86VarJ5 = h86VarA2.j(h86VarJ4);
            h86 h86VarJ6 = h86VarA2.j(h86VarJ);
            h86 h86VarJ7 = h86VarJ5.j(h86VarJ6);
            if (h86VarJ7.i()) {
                return new yng(a86VarI, h86VarJ7, a86VarI.o().n(), this.f16150e);
            }
            h86 h86VarJ8 = h86VarA2.j(h86VarO2);
            h86 h86VarJ9 = !zH2 ? h86VarJ8.j(h86VarS) : h86VarJ8;
            h86 h86VarP = h86VarJ6.a(h86VarO2).p(h86VarJ9, h86Var2.a(h86Var3));
            if (!zH) {
                h86VarJ9 = h86VarJ9.j(h86Var3);
            }
            h86VarA = h86VarJ7;
            h86Var = h86VarP;
            h86VarM = h86VarJ9;
        }
        return new yng(a86VarI, h86VarA, h86Var, new h86[]{h86VarM}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new yng(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public boolean h() {
        h86 h86VarN = n();
        return (h86VarN.i() || o().s() == h86VarN.s()) ? false : true;
    }

    @Override // com.oplus.aiunit.vision.rb6
    public h86 r() {
        h86 h86Var = this.b;
        h86 h86Var2 = this.f16149c;
        if (t() || h86Var.i()) {
            return h86Var2;
        }
        h86 h86VarJ = h86Var2.a(h86Var).j(h86Var);
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
        h86 h86Var2 = this.f16149c;
        h86 h86Var3 = this.d[0];
        return new yng(this.a, h86Var, h86Var2.a(h86Var3), new h86[]{h86Var3}, this.f16150e);
    }

    public yng(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public yng(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
