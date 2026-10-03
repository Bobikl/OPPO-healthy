package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class yog extends rb6.a {
    public yog(a86 a86Var, h86 h86Var, h86 h86Var2) {
        this(a86Var, h86Var, h86Var2, false);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 G() {
        if (t()) {
            return this;
        }
        a86 a86VarI = i();
        h86 h86Var = this.b;
        if (h86Var.i()) {
            return a86VarI.t();
        }
        h86 h86Var2 = this.f16149c;
        h86 h86VarO = this.d[0];
        boolean zH = h86VarO.h();
        h86 h86VarO2 = zH ? h86VarO : h86VarO.o();
        h86 h86VarA = zH ? h86Var2.o().a(h86Var2) : h86Var2.a(h86VarO).j(h86Var2);
        if (h86VarA.i()) {
            return new yog(a86VarI, h86VarA, a86VarI.o(), this.f16150e);
        }
        h86 h86VarO3 = h86VarA.o();
        h86 h86VarJ = zH ? h86VarA : h86VarA.j(h86VarO2);
        h86 h86VarO4 = h86Var2.a(h86Var).o();
        if (!zH) {
            h86VarO = h86VarO2.o();
        }
        return new yog(a86VarI, h86VarO3, h86VarO4.a(h86VarA).a(h86VarO2).j(h86VarO4).a(h86VarO).a(h86VarO3).a(h86VarJ), new h86[]{h86VarJ}, this.f16150e);
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
        h86 h86VarA = h86VarO3.a(h86Var2.j(h86Var3));
        h86 h86VarB = h86VarO.b();
        h86 h86VarL = h86VarB.j(h86VarO4).a(h86VarO3).l(h86VarA, h86VarO2, h86VarO4);
        h86 h86VarJ = h86VarN.j(h86VarO4);
        h86 h86VarO5 = h86VarJ.a(h86VarA).o();
        if (h86VarO5.i()) {
            return h86VarL.i() ? rb6Var.G() : a86VarI.t();
        }
        if (h86VarL.i()) {
            return new yog(a86VarI, h86VarL, a86VarI.o(), this.f16150e);
        }
        h86 h86VarJ2 = h86VarL.o().j(h86VarJ);
        h86 h86VarJ3 = h86VarL.j(h86VarO5).j(h86VarO4);
        return new yog(a86VarI, h86VarJ2, h86VarL.a(h86VarO5).o().l(h86VarA, h86VarB, h86VarJ3), new h86[]{h86VarJ3}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 a(rb6 rb6Var) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        wog wogVar;
        wog wogVar2;
        wog wogVar3;
        if (t()) {
            return rb6Var;
        }
        if (rb6Var.t()) {
            return this;
        }
        a86 a86VarI = i();
        wog wogVar4 = (wog) this.b;
        wog wogVar5 = (wog) rb6Var.n();
        if (wogVar4.i()) {
            return wogVar5.i() ? a86VarI.t() : rb6Var.a(this);
        }
        wog wogVar6 = (wog) this.f16149c;
        wog wogVar7 = (wog) this.d[0];
        wog wogVar8 = (wog) rb6Var.o();
        wog wogVar9 = (wog) rb6Var.s(0);
        long[] jArrA = ffc.a();
        long[] jArrA2 = ffc.a();
        long[] jArrA3 = ffc.a();
        long[] jArrA4 = ffc.a();
        long[] jArrP = wogVar7.h() ? null : vog.p(wogVar7.a);
        if (jArrP == null) {
            jArr = wogVar5.a;
            jArr2 = wogVar8.a;
        } else {
            vog.n(wogVar5.a, jArrP, jArrA2);
            vog.n(wogVar8.a, jArrP, jArrA4);
            jArr = jArrA2;
            jArr2 = jArrA4;
        }
        long[] jArrP2 = wogVar9.h() ? null : vog.p(wogVar9.a);
        if (jArrP2 == null) {
            jArr3 = wogVar4.a;
            jArr4 = wogVar6.a;
        } else {
            vog.n(wogVar4.a, jArrP2, jArrA);
            vog.n(wogVar6.a, jArrP2, jArrA3);
            jArr3 = jArrA;
            jArr4 = jArrA3;
        }
        vog.b(jArr4, jArr2, jArrA3);
        vog.b(jArr3, jArr, jArrA4);
        if (ffc.f(jArrA4)) {
            return ffc.f(jArrA3) ? G() : a86VarI.t();
        }
        if (wogVar5.i()) {
            rb6 rb6VarY = y();
            wog wogVar10 = (wog) rb6VarY.q();
            h86 h86VarR = rb6VarY.r();
            h86 h86VarD = h86VarR.a(wogVar8).d(wogVar10);
            wogVar = (wog) h86VarD.o().a(h86VarD).a(wogVar10);
            if (wogVar.i()) {
                return new yog(a86VarI, wogVar, a86VarI.o(), this.f16150e);
            }
            wog wogVar11 = (wog) h86VarD.j(wogVar10.a(wogVar)).a(wogVar).a(h86VarR).d(wogVar).a(wogVar);
            wogVar3 = (wog) a86VarI.m(z76.ONE);
            wogVar2 = wogVar11;
        } else {
            vog.t(jArrA4, jArrA4);
            long[] jArrP3 = vog.p(jArrA3);
            vog.n(jArr3, jArrP3, jArrA);
            vog.n(jArr, jArrP3, jArrA2);
            wog wogVar12 = new wog(jArrA);
            vog.l(jArrA, jArrA2, wogVar12.a);
            if (wogVar12.i()) {
                return new yog(a86VarI, wogVar12, a86VarI.o(), this.f16150e);
            }
            wog wogVar13 = new wog(jArrA3);
            vog.n(jArrA4, jArrP3, wogVar13.a);
            if (jArrP2 != null) {
                long[] jArr5 = wogVar13.a;
                vog.n(jArr5, jArrP2, jArr5);
            }
            long[] jArrB = ffc.b();
            vog.b(jArrA2, jArrA4, jArrA4);
            vog.u(jArrA4, jArrB);
            vog.b(wogVar6.a, wogVar7.a, jArrA4);
            vog.m(jArrA4, wogVar13.a, jArrB);
            wog wogVar14 = new wog(jArrA4);
            vog.q(jArrB, wogVar14.a);
            if (jArrP != null) {
                long[] jArr6 = wogVar13.a;
                vog.n(jArr6, jArrP, jArr6);
            }
            wogVar = wogVar12;
            wogVar2 = wogVar14;
            wogVar3 = wogVar13;
        }
        return new yog(a86VarI, wogVar, wogVar2, new h86[]{wogVar3}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new yog(null, f(), g());
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
        return new yog(this.a, h86Var, h86Var2.a(h86Var3), new h86[]{h86Var3}, this.f16150e);
    }

    public yog(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public yog(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
