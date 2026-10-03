package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qmg extends rb6.b {
    public qmg(a86 a86Var, h86 h86Var, h86 h86Var2) {
        this(a86Var, h86Var, h86Var2, false);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 E() {
        return (t() || this.f16149c.i()) ? this : G().a(this);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 G() {
        if (t()) {
            return this;
        }
        a86 a86VarI = i();
        pmg pmgVar = (pmg) this.f16149c;
        if (pmgVar.i()) {
            return a86VarI.t();
        }
        pmg pmgVar2 = (pmg) this.b;
        pmg pmgVar3 = (pmg) this.d[0];
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        int[] iArrF3 = afc.f();
        omg.j(pmgVar.a, iArrF3);
        int[] iArrF4 = afc.f();
        omg.j(iArrF3, iArrF4);
        boolean zH = pmgVar3.h();
        int[] iArr = pmgVar3.a;
        if (!zH) {
            omg.j(iArr, iArrF2);
            iArr = iArrF2;
        }
        omg.m(pmgVar2.a, iArr, iArrF);
        omg.a(pmgVar2.a, iArr, iArrF2);
        omg.e(iArrF2, iArrF, iArrF2);
        omg.i(afc.b(iArrF2, iArrF2, iArrF2), iArrF2);
        omg.e(iArrF3, pmgVar2.a, iArrF3);
        omg.i(gfc.F(8, iArrF3, 2, 0), iArrF3);
        omg.i(gfc.G(8, iArrF4, 3, 0, iArrF), iArrF);
        pmg pmgVar4 = new pmg(iArrF4);
        omg.j(iArrF2, pmgVar4.a);
        int[] iArr2 = pmgVar4.a;
        omg.m(iArr2, iArrF3, iArr2);
        int[] iArr3 = pmgVar4.a;
        omg.m(iArr3, iArrF3, iArr3);
        pmg pmgVar5 = new pmg(iArrF3);
        omg.m(iArrF3, pmgVar4.a, pmgVar5.a);
        int[] iArr4 = pmgVar5.a;
        omg.e(iArr4, iArrF2, iArr4);
        int[] iArr5 = pmgVar5.a;
        omg.m(iArr5, iArrF, iArr5);
        pmg pmgVar6 = new pmg(iArrF2);
        omg.n(pmgVar.a, pmgVar6.a);
        if (!zH) {
            int[] iArr6 = pmgVar6.a;
            omg.e(iArr6, pmgVar3.a, iArr6);
        }
        return new qmg(a86VarI, pmgVar4, pmgVar5, new h86[]{pmgVar6}, this.f16150e);
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
        return this.f16149c.i() ? rb6Var : G().a(rb6Var);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 a(rb6 rb6Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (t()) {
            return rb6Var;
        }
        if (rb6Var.t()) {
            return this;
        }
        if (this == rb6Var) {
            return G();
        }
        a86 a86VarI = i();
        pmg pmgVar = (pmg) this.b;
        pmg pmgVar2 = (pmg) this.f16149c;
        pmg pmgVar3 = (pmg) rb6Var.q();
        pmg pmgVar4 = (pmg) rb6Var.r();
        pmg pmgVar5 = (pmg) this.d[0];
        pmg pmgVar6 = (pmg) rb6Var.s(0);
        int[] iArrH = afc.h();
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        int[] iArrF3 = afc.f();
        boolean zH = pmgVar5.h();
        if (zH) {
            iArr = pmgVar3.a;
            iArr2 = pmgVar4.a;
        } else {
            omg.j(pmgVar5.a, iArrF2);
            omg.e(iArrF2, pmgVar3.a, iArrF);
            omg.e(iArrF2, pmgVar5.a, iArrF2);
            omg.e(iArrF2, pmgVar4.a, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = pmgVar6.h();
        if (zH2) {
            iArr3 = pmgVar.a;
            iArr4 = pmgVar2.a;
        } else {
            omg.j(pmgVar6.a, iArrF3);
            omg.e(iArrF3, pmgVar.a, iArrH);
            omg.e(iArrF3, pmgVar6.a, iArrF3);
            omg.e(iArrF3, pmgVar2.a, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = afc.f();
        omg.m(iArr3, iArr, iArrF4);
        omg.m(iArr4, iArr2, iArrF);
        if (afc.t(iArrF4)) {
            return afc.t(iArrF) ? G() : a86VarI.t();
        }
        omg.j(iArrF4, iArrF2);
        int[] iArrF5 = afc.f();
        omg.e(iArrF2, iArrF4, iArrF5);
        omg.e(iArrF2, iArr3, iArrF2);
        omg.g(iArrF5, iArrF5);
        afc.w(iArr4, iArrF5, iArrH);
        omg.i(afc.b(iArrF2, iArrF2, iArrF5), iArrF5);
        pmg pmgVar7 = new pmg(iArrF3);
        omg.j(iArrF, pmgVar7.a);
        int[] iArr5 = pmgVar7.a;
        omg.m(iArr5, iArrF5, iArr5);
        pmg pmgVar8 = new pmg(iArrF5);
        omg.m(iArrF2, pmgVar7.a, pmgVar8.a);
        omg.f(pmgVar8.a, iArrF, iArrH);
        omg.h(iArrH, pmgVar8.a);
        pmg pmgVar9 = new pmg(iArrF4);
        if (!zH) {
            int[] iArr6 = pmgVar9.a;
            omg.e(iArr6, pmgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = pmgVar9.a;
            omg.e(iArr7, pmgVar6.a, iArr7);
        }
        return new qmg(a86VarI, pmgVar7, pmgVar8, new h86[]{pmgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new qmg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new qmg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public qmg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public qmg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
