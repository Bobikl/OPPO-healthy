package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class slg extends rb6.b {
    public slg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        rlg rlgVar = (rlg) this.f16149c;
        if (rlgVar.i()) {
            return a86VarI.t();
        }
        rlg rlgVar2 = (rlg) this.b;
        rlg rlgVar3 = (rlg) this.d[0];
        int[] iArrC = xec.c();
        int[] iArrC2 = xec.c();
        int[] iArrC3 = xec.c();
        qlg.i(rlgVar.a, iArrC3);
        int[] iArrC4 = xec.c();
        qlg.i(iArrC3, iArrC4);
        boolean zH = rlgVar3.h();
        int[] iArr = rlgVar3.a;
        if (!zH) {
            qlg.i(iArr, iArrC2);
            iArr = iArrC2;
        }
        qlg.k(rlgVar2.a, iArr, iArrC);
        qlg.a(rlgVar2.a, iArr, iArrC2);
        qlg.d(iArrC2, iArrC, iArrC2);
        qlg.h(xec.b(iArrC2, iArrC2, iArrC2), iArrC2);
        qlg.d(iArrC3, rlgVar2.a, iArrC3);
        qlg.h(gfc.F(5, iArrC3, 2, 0), iArrC3);
        qlg.h(gfc.G(5, iArrC4, 3, 0, iArrC), iArrC);
        rlg rlgVar4 = new rlg(iArrC4);
        qlg.i(iArrC2, rlgVar4.a);
        int[] iArr2 = rlgVar4.a;
        qlg.k(iArr2, iArrC3, iArr2);
        int[] iArr3 = rlgVar4.a;
        qlg.k(iArr3, iArrC3, iArr3);
        rlg rlgVar5 = new rlg(iArrC3);
        qlg.k(iArrC3, rlgVar4.a, rlgVar5.a);
        int[] iArr4 = rlgVar5.a;
        qlg.d(iArr4, iArrC2, iArr4);
        int[] iArr5 = rlgVar5.a;
        qlg.k(iArr5, iArrC, iArr5);
        rlg rlgVar6 = new rlg(iArrC2);
        qlg.l(rlgVar.a, rlgVar6.a);
        if (!zH) {
            int[] iArr6 = rlgVar6.a;
            qlg.d(iArr6, rlgVar3.a, iArr6);
        }
        return new slg(a86VarI, rlgVar4, rlgVar5, new h86[]{rlgVar6}, this.f16150e);
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
        rlg rlgVar = (rlg) this.b;
        rlg rlgVar2 = (rlg) this.f16149c;
        rlg rlgVar3 = (rlg) rb6Var.q();
        rlg rlgVar4 = (rlg) rb6Var.r();
        rlg rlgVar5 = (rlg) this.d[0];
        rlg rlgVar6 = (rlg) rb6Var.s(0);
        int[] iArrD = xec.d();
        int[] iArrC = xec.c();
        int[] iArrC2 = xec.c();
        int[] iArrC3 = xec.c();
        boolean zH = rlgVar5.h();
        if (zH) {
            iArr = rlgVar3.a;
            iArr2 = rlgVar4.a;
        } else {
            qlg.i(rlgVar5.a, iArrC2);
            qlg.d(iArrC2, rlgVar3.a, iArrC);
            qlg.d(iArrC2, rlgVar5.a, iArrC2);
            qlg.d(iArrC2, rlgVar4.a, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = rlgVar6.h();
        if (zH2) {
            iArr3 = rlgVar.a;
            iArr4 = rlgVar2.a;
        } else {
            qlg.i(rlgVar6.a, iArrC3);
            qlg.d(iArrC3, rlgVar.a, iArrD);
            qlg.d(iArrC3, rlgVar6.a, iArrC3);
            qlg.d(iArrC3, rlgVar2.a, iArrC3);
            iArr3 = iArrD;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = xec.c();
        qlg.k(iArr3, iArr, iArrC4);
        qlg.k(iArr4, iArr2, iArrC);
        if (xec.j(iArrC4)) {
            return xec.j(iArrC) ? G() : a86VarI.t();
        }
        qlg.i(iArrC4, iArrC2);
        int[] iArrC5 = xec.c();
        qlg.d(iArrC2, iArrC4, iArrC5);
        qlg.d(iArrC2, iArr3, iArrC2);
        qlg.f(iArrC5, iArrC5);
        xec.k(iArr4, iArrC5, iArrD);
        qlg.h(xec.b(iArrC2, iArrC2, iArrC5), iArrC5);
        rlg rlgVar7 = new rlg(iArrC3);
        qlg.i(iArrC, rlgVar7.a);
        int[] iArr5 = rlgVar7.a;
        qlg.k(iArr5, iArrC5, iArr5);
        rlg rlgVar8 = new rlg(iArrC5);
        qlg.k(iArrC2, rlgVar7.a, rlgVar8.a);
        qlg.e(rlgVar8.a, iArrC, iArrD);
        qlg.g(iArrD, rlgVar8.a);
        rlg rlgVar9 = new rlg(iArrC4);
        if (!zH) {
            int[] iArr6 = rlgVar9.a;
            qlg.d(iArr6, rlgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = rlgVar9.a;
            qlg.d(iArr7, rlgVar6.a, iArr7);
        }
        return new slg(a86VarI, rlgVar7, rlgVar8, new h86[]{rlgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new slg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new slg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public slg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public slg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
