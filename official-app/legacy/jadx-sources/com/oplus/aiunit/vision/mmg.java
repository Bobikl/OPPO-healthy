package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class mmg extends rb6.b {
    public mmg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        lmg lmgVar = (lmg) this.f16149c;
        if (lmgVar.i()) {
            return a86VarI.t();
        }
        lmg lmgVar2 = (lmg) this.b;
        lmg lmgVar3 = (lmg) this.d[0];
        int[] iArrF = afc.f();
        kmg.i(lmgVar.a, iArrF);
        int[] iArrF2 = afc.f();
        kmg.i(iArrF, iArrF2);
        int[] iArrF3 = afc.f();
        kmg.i(lmgVar2.a, iArrF3);
        kmg.h(afc.b(iArrF3, iArrF3, iArrF3), iArrF3);
        kmg.d(iArrF, lmgVar2.a, iArrF);
        kmg.h(gfc.F(8, iArrF, 2, 0), iArrF);
        int[] iArrF4 = afc.f();
        kmg.h(gfc.G(8, iArrF2, 3, 0, iArrF4), iArrF4);
        lmg lmgVar4 = new lmg(iArrF2);
        kmg.i(iArrF3, lmgVar4.a);
        int[] iArr = lmgVar4.a;
        kmg.k(iArr, iArrF, iArr);
        int[] iArr2 = lmgVar4.a;
        kmg.k(iArr2, iArrF, iArr2);
        lmg lmgVar5 = new lmg(iArrF);
        kmg.k(iArrF, lmgVar4.a, lmgVar5.a);
        int[] iArr3 = lmgVar5.a;
        kmg.d(iArr3, iArrF3, iArr3);
        int[] iArr4 = lmgVar5.a;
        kmg.k(iArr4, iArrF4, iArr4);
        lmg lmgVar6 = new lmg(iArrF3);
        kmg.l(lmgVar.a, lmgVar6.a);
        if (!lmgVar3.h()) {
            int[] iArr5 = lmgVar6.a;
            kmg.d(iArr5, lmgVar3.a, iArr5);
        }
        return new mmg(a86VarI, lmgVar4, lmgVar5, new h86[]{lmgVar6}, this.f16150e);
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
        lmg lmgVar = (lmg) this.b;
        lmg lmgVar2 = (lmg) this.f16149c;
        lmg lmgVar3 = (lmg) rb6Var.q();
        lmg lmgVar4 = (lmg) rb6Var.r();
        lmg lmgVar5 = (lmg) this.d[0];
        lmg lmgVar6 = (lmg) rb6Var.s(0);
        int[] iArrH = afc.h();
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        int[] iArrF3 = afc.f();
        boolean zH = lmgVar5.h();
        if (zH) {
            iArr = lmgVar3.a;
            iArr2 = lmgVar4.a;
        } else {
            kmg.i(lmgVar5.a, iArrF2);
            kmg.d(iArrF2, lmgVar3.a, iArrF);
            kmg.d(iArrF2, lmgVar5.a, iArrF2);
            kmg.d(iArrF2, lmgVar4.a, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = lmgVar6.h();
        if (zH2) {
            iArr3 = lmgVar.a;
            iArr4 = lmgVar2.a;
        } else {
            kmg.i(lmgVar6.a, iArrF3);
            kmg.d(iArrF3, lmgVar.a, iArrH);
            kmg.d(iArrF3, lmgVar6.a, iArrF3);
            kmg.d(iArrF3, lmgVar2.a, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = afc.f();
        kmg.k(iArr3, iArr, iArrF4);
        kmg.k(iArr4, iArr2, iArrF);
        if (afc.t(iArrF4)) {
            return afc.t(iArrF) ? G() : a86VarI.t();
        }
        kmg.i(iArrF4, iArrF2);
        int[] iArrF5 = afc.f();
        kmg.d(iArrF2, iArrF4, iArrF5);
        kmg.d(iArrF2, iArr3, iArrF2);
        kmg.f(iArrF5, iArrF5);
        afc.w(iArr4, iArrF5, iArrH);
        kmg.h(afc.b(iArrF2, iArrF2, iArrF5), iArrF5);
        lmg lmgVar7 = new lmg(iArrF3);
        kmg.i(iArrF, lmgVar7.a);
        int[] iArr5 = lmgVar7.a;
        kmg.k(iArr5, iArrF5, iArr5);
        lmg lmgVar8 = new lmg(iArrF5);
        kmg.k(iArrF2, lmgVar7.a, lmgVar8.a);
        kmg.e(lmgVar8.a, iArrF, iArrH);
        kmg.g(iArrH, lmgVar8.a);
        lmg lmgVar9 = new lmg(iArrF4);
        if (!zH) {
            int[] iArr6 = lmgVar9.a;
            kmg.d(iArr6, lmgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = lmgVar9.a;
            kmg.d(iArr7, lmgVar6.a, iArr7);
        }
        return new mmg(a86VarI, lmgVar7, lmgVar8, new h86[]{lmgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new mmg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new mmg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public mmg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public mmg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
