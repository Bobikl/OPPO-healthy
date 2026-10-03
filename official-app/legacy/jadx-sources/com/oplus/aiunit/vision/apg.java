package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class apg extends rb6.a {
    public apg(a86 a86Var, h86 h86Var, h86 h86Var2) {
        this(a86Var, h86Var, h86Var2, false);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 G() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (t()) {
            return this;
        }
        a86 a86VarI = i();
        wog wogVar = (wog) this.b;
        if (wogVar.i()) {
            return a86VarI.t();
        }
        wog wogVar2 = (wog) this.f16149c;
        wog wogVar3 = (wog) this.d[0];
        long[] jArrA = ffc.a();
        long[] jArrA2 = ffc.a();
        long[] jArrP = wogVar3.h() ? null : vog.p(wogVar3.a);
        if (jArrP == null) {
            jArr = wogVar2.a;
            jArr2 = wogVar3.a;
        } else {
            vog.n(wogVar2.a, jArrP, jArrA);
            vog.t(wogVar3.a, jArrA2);
            jArr = jArrA;
            jArr2 = jArrA2;
        }
        long[] jArrA3 = ffc.a();
        vog.t(wogVar2.a, jArrA3);
        vog.d(jArr, jArr2, jArrA3);
        if (ffc.f(jArrA3)) {
            return new apg(a86VarI, new wog(jArrA3), zog.f19486l, this.f16150e);
        }
        long[] jArrB = ffc.b();
        vog.m(jArrA3, jArr, jArrB);
        wog wogVar4 = new wog(jArrA);
        vog.t(jArrA3, wogVar4.a);
        wog wogVar5 = new wog(jArrA3);
        if (jArrP != null) {
            long[] jArr4 = wogVar5.a;
            vog.l(jArr4, jArr2, jArr4);
        }
        if (jArrP == null) {
            jArr3 = wogVar.a;
        } else {
            vog.n(wogVar.a, jArrP, jArrA2);
            jArr3 = jArrA2;
        }
        vog.u(jArr3, jArrB);
        vog.q(jArrB, jArrA2);
        vog.d(wogVar4.a, wogVar5.a, jArrA2);
        return new apg(a86VarI, wogVar4, new wog(jArrA2), new h86[]{wogVar5}, this.f16150e);
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
        wog wogVar = (wog) this.b;
        if (wogVar.i()) {
            return rb6Var;
        }
        wog wogVar2 = (wog) rb6Var.n();
        wog wogVar3 = (wog) rb6Var.s(0);
        if (wogVar2.i() || !wogVar3.h()) {
            return G().a(rb6Var);
        }
        wog wogVar4 = (wog) this.f16149c;
        wog wogVar5 = (wog) this.d[0];
        wog wogVar6 = (wog) rb6Var.o();
        long[] jArrA = ffc.a();
        long[] jArrA2 = ffc.a();
        long[] jArrA3 = ffc.a();
        long[] jArrA4 = ffc.a();
        vog.t(wogVar.a, jArrA);
        vog.t(wogVar4.a, jArrA2);
        vog.t(wogVar5.a, jArrA3);
        vog.l(wogVar4.a, wogVar5.a, jArrA4);
        vog.d(jArrA3, jArrA2, jArrA4);
        long[] jArrP = vog.p(jArrA3);
        vog.n(wogVar6.a, jArrP, jArrA3);
        vog.b(jArrA3, jArrA2, jArrA3);
        long[] jArrB = ffc.b();
        vog.m(jArrA3, jArrA4, jArrB);
        vog.o(jArrA, jArrP, jArrB);
        vog.q(jArrB, jArrA3);
        vog.n(wogVar2.a, jArrP, jArrA);
        vog.b(jArrA, jArrA4, jArrA2);
        vog.t(jArrA2, jArrA2);
        if (ffc.f(jArrA2)) {
            return ffc.f(jArrA3) ? rb6Var.G() : a86VarI.t();
        }
        if (ffc.f(jArrA3)) {
            return new apg(a86VarI, new wog(jArrA3), zog.f19486l, this.f16150e);
        }
        wog wogVar7 = new wog();
        vog.t(jArrA3, wogVar7.a);
        long[] jArr = wogVar7.a;
        vog.l(jArr, jArrA, jArr);
        wog wogVar8 = new wog(jArrA);
        vog.l(jArrA3, jArrA2, wogVar8.a);
        long[] jArr2 = wogVar8.a;
        vog.n(jArr2, jArrP, jArr2);
        wog wogVar9 = new wog(jArrA2);
        vog.b(jArrA3, jArrA2, wogVar9.a);
        long[] jArr3 = wogVar9.a;
        vog.t(jArr3, jArr3);
        gfc.Q(18, jArrB);
        vog.m(wogVar9.a, jArrA4, jArrB);
        vog.f(wogVar6.a, jArrA4);
        vog.m(jArrA4, wogVar8.a, jArrB);
        vog.q(jArrB, wogVar9.a);
        return new apg(a86VarI, wogVar7, wogVar9, new h86[]{wogVar8}, this.f16150e);
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
            wogVar = (wog) h86VarD.o().a(h86VarD).a(wogVar10).b();
            if (wogVar.i()) {
                return new apg(a86VarI, wogVar, zog.f19486l, this.f16150e);
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
                return new apg(a86VarI, wogVar12, zog.f19486l, this.f16150e);
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
        return new apg(a86VarI, wogVar, wogVar2, new h86[]{wogVar3}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new apg(null, f(), g());
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
        return new apg(this.a, h86Var, h86Var2.a(h86Var3), new h86[]{h86Var3}, this.f16150e);
    }

    public apg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public apg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
