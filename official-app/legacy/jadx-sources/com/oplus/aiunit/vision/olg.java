package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class olg extends rb6.b {
    public olg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        nlg nlgVar = (nlg) this.f16149c;
        if (nlgVar.i()) {
            return a86VarI.t();
        }
        nlg nlgVar2 = (nlg) this.b;
        nlg nlgVar3 = (nlg) this.d[0];
        int[] iArrC = xec.c();
        int[] iArrC2 = xec.c();
        int[] iArrC3 = xec.c();
        mlg.i(nlgVar.a, iArrC3);
        int[] iArrC4 = xec.c();
        mlg.i(iArrC3, iArrC4);
        boolean zH = nlgVar3.h();
        int[] iArr = nlgVar3.a;
        if (!zH) {
            mlg.i(iArr, iArrC2);
            iArr = iArrC2;
        }
        mlg.k(nlgVar2.a, iArr, iArrC);
        mlg.a(nlgVar2.a, iArr, iArrC2);
        mlg.d(iArrC2, iArrC, iArrC2);
        mlg.h(xec.b(iArrC2, iArrC2, iArrC2), iArrC2);
        mlg.d(iArrC3, nlgVar2.a, iArrC3);
        mlg.h(gfc.F(5, iArrC3, 2, 0), iArrC3);
        mlg.h(gfc.G(5, iArrC4, 3, 0, iArrC), iArrC);
        nlg nlgVar4 = new nlg(iArrC4);
        mlg.i(iArrC2, nlgVar4.a);
        int[] iArr2 = nlgVar4.a;
        mlg.k(iArr2, iArrC3, iArr2);
        int[] iArr3 = nlgVar4.a;
        mlg.k(iArr3, iArrC3, iArr3);
        nlg nlgVar5 = new nlg(iArrC3);
        mlg.k(iArrC3, nlgVar4.a, nlgVar5.a);
        int[] iArr4 = nlgVar5.a;
        mlg.d(iArr4, iArrC2, iArr4);
        int[] iArr5 = nlgVar5.a;
        mlg.k(iArr5, iArrC, iArr5);
        nlg nlgVar6 = new nlg(iArrC2);
        mlg.l(nlgVar.a, nlgVar6.a);
        if (!zH) {
            int[] iArr6 = nlgVar6.a;
            mlg.d(iArr6, nlgVar3.a, iArr6);
        }
        return new olg(a86VarI, nlgVar4, nlgVar5, new h86[]{nlgVar6}, this.f16150e);
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
        nlg nlgVar = (nlg) this.b;
        nlg nlgVar2 = (nlg) this.f16149c;
        nlg nlgVar3 = (nlg) rb6Var.q();
        nlg nlgVar4 = (nlg) rb6Var.r();
        nlg nlgVar5 = (nlg) this.d[0];
        nlg nlgVar6 = (nlg) rb6Var.s(0);
        int[] iArrD = xec.d();
        int[] iArrC = xec.c();
        int[] iArrC2 = xec.c();
        int[] iArrC3 = xec.c();
        boolean zH = nlgVar5.h();
        if (zH) {
            iArr = nlgVar3.a;
            iArr2 = nlgVar4.a;
        } else {
            mlg.i(nlgVar5.a, iArrC2);
            mlg.d(iArrC2, nlgVar3.a, iArrC);
            mlg.d(iArrC2, nlgVar5.a, iArrC2);
            mlg.d(iArrC2, nlgVar4.a, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = nlgVar6.h();
        if (zH2) {
            iArr3 = nlgVar.a;
            iArr4 = nlgVar2.a;
        } else {
            mlg.i(nlgVar6.a, iArrC3);
            mlg.d(iArrC3, nlgVar.a, iArrD);
            mlg.d(iArrC3, nlgVar6.a, iArrC3);
            mlg.d(iArrC3, nlgVar2.a, iArrC3);
            iArr3 = iArrD;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = xec.c();
        mlg.k(iArr3, iArr, iArrC4);
        mlg.k(iArr4, iArr2, iArrC);
        if (xec.j(iArrC4)) {
            return xec.j(iArrC) ? G() : a86VarI.t();
        }
        mlg.i(iArrC4, iArrC2);
        int[] iArrC5 = xec.c();
        mlg.d(iArrC2, iArrC4, iArrC5);
        mlg.d(iArrC2, iArr3, iArrC2);
        mlg.f(iArrC5, iArrC5);
        xec.k(iArr4, iArrC5, iArrD);
        mlg.h(xec.b(iArrC2, iArrC2, iArrC5), iArrC5);
        nlg nlgVar7 = new nlg(iArrC3);
        mlg.i(iArrC, nlgVar7.a);
        int[] iArr5 = nlgVar7.a;
        mlg.k(iArr5, iArrC5, iArr5);
        nlg nlgVar8 = new nlg(iArrC5);
        mlg.k(iArrC2, nlgVar7.a, nlgVar8.a);
        mlg.e(nlgVar8.a, iArrC, iArrD);
        mlg.g(iArrD, nlgVar8.a);
        nlg nlgVar9 = new nlg(iArrC4);
        if (!zH) {
            int[] iArr6 = nlgVar9.a;
            mlg.d(iArr6, nlgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = nlgVar9.a;
            mlg.d(iArr7, nlgVar6.a, iArr7);
        }
        return new olg(a86VarI, nlgVar7, nlgVar8, new h86[]{nlgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new olg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new olg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public olg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public olg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
