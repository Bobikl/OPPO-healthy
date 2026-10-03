package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class img extends rb6.b {
    public img(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        hmg hmgVar = (hmg) this.f16149c;
        if (hmgVar.i()) {
            return a86VarI.t();
        }
        hmg hmgVar2 = (hmg) this.b;
        hmg hmgVar3 = (hmg) this.d[0];
        int[] iArrD = zec.d();
        int[] iArrD2 = zec.d();
        int[] iArrD3 = zec.d();
        gmg.j(hmgVar.a, iArrD3);
        int[] iArrD4 = zec.d();
        gmg.j(iArrD3, iArrD4);
        boolean zH = hmgVar3.h();
        int[] iArr = hmgVar3.a;
        if (!zH) {
            gmg.j(iArr, iArrD2);
            iArr = iArrD2;
        }
        gmg.m(hmgVar2.a, iArr, iArrD);
        gmg.a(hmgVar2.a, iArr, iArrD2);
        gmg.e(iArrD2, iArrD, iArrD2);
        gmg.i(zec.b(iArrD2, iArrD2, iArrD2), iArrD2);
        gmg.e(iArrD3, hmgVar2.a, iArrD3);
        gmg.i(gfc.F(7, iArrD3, 2, 0), iArrD3);
        gmg.i(gfc.G(7, iArrD4, 3, 0, iArrD), iArrD);
        hmg hmgVar4 = new hmg(iArrD4);
        gmg.j(iArrD2, hmgVar4.a);
        int[] iArr2 = hmgVar4.a;
        gmg.m(iArr2, iArrD3, iArr2);
        int[] iArr3 = hmgVar4.a;
        gmg.m(iArr3, iArrD3, iArr3);
        hmg hmgVar5 = new hmg(iArrD3);
        gmg.m(iArrD3, hmgVar4.a, hmgVar5.a);
        int[] iArr4 = hmgVar5.a;
        gmg.e(iArr4, iArrD2, iArr4);
        int[] iArr5 = hmgVar5.a;
        gmg.m(iArr5, iArrD, iArr5);
        hmg hmgVar6 = new hmg(iArrD2);
        gmg.n(hmgVar.a, hmgVar6.a);
        if (!zH) {
            int[] iArr6 = hmgVar6.a;
            gmg.e(iArr6, hmgVar3.a, iArr6);
        }
        return new img(a86VarI, hmgVar4, hmgVar5, new h86[]{hmgVar6}, this.f16150e);
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
        hmg hmgVar = (hmg) this.b;
        hmg hmgVar2 = (hmg) this.f16149c;
        hmg hmgVar3 = (hmg) rb6Var.q();
        hmg hmgVar4 = (hmg) rb6Var.r();
        hmg hmgVar5 = (hmg) this.d[0];
        hmg hmgVar6 = (hmg) rb6Var.s(0);
        int[] iArrE = zec.e();
        int[] iArrD = zec.d();
        int[] iArrD2 = zec.d();
        int[] iArrD3 = zec.d();
        boolean zH = hmgVar5.h();
        if (zH) {
            iArr = hmgVar3.a;
            iArr2 = hmgVar4.a;
        } else {
            gmg.j(hmgVar5.a, iArrD2);
            gmg.e(iArrD2, hmgVar3.a, iArrD);
            gmg.e(iArrD2, hmgVar5.a, iArrD2);
            gmg.e(iArrD2, hmgVar4.a, iArrD2);
            iArr = iArrD;
            iArr2 = iArrD2;
        }
        boolean zH2 = hmgVar6.h();
        if (zH2) {
            iArr3 = hmgVar.a;
            iArr4 = hmgVar2.a;
        } else {
            gmg.j(hmgVar6.a, iArrD3);
            gmg.e(iArrD3, hmgVar.a, iArrE);
            gmg.e(iArrD3, hmgVar6.a, iArrD3);
            gmg.e(iArrD3, hmgVar2.a, iArrD3);
            iArr3 = iArrE;
            iArr4 = iArrD3;
        }
        int[] iArrD4 = zec.d();
        gmg.m(iArr3, iArr, iArrD4);
        gmg.m(iArr4, iArr2, iArrD);
        if (zec.k(iArrD4)) {
            return zec.k(iArrD) ? G() : a86VarI.t();
        }
        gmg.j(iArrD4, iArrD2);
        int[] iArrD5 = zec.d();
        gmg.e(iArrD2, iArrD4, iArrD5);
        gmg.e(iArrD2, iArr3, iArrD2);
        gmg.g(iArrD5, iArrD5);
        zec.l(iArr4, iArrD5, iArrE);
        gmg.i(zec.b(iArrD2, iArrD2, iArrD5), iArrD5);
        hmg hmgVar7 = new hmg(iArrD3);
        gmg.j(iArrD, hmgVar7.a);
        int[] iArr5 = hmgVar7.a;
        gmg.m(iArr5, iArrD5, iArr5);
        hmg hmgVar8 = new hmg(iArrD5);
        gmg.m(iArrD2, hmgVar7.a, hmgVar8.a);
        gmg.f(hmgVar8.a, iArrD, iArrE);
        gmg.h(iArrE, hmgVar8.a);
        hmg hmgVar9 = new hmg(iArrD4);
        if (!zH) {
            int[] iArr6 = hmgVar9.a;
            gmg.e(iArr6, hmgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = hmgVar9.a;
            gmg.e(iArr7, hmgVar6.a, iArr7);
        }
        return new img(a86VarI, hmgVar7, hmgVar8, new h86[]{hmgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new img(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new img(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public img(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public img(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
