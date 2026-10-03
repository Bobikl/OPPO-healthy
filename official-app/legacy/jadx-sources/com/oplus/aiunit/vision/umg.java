package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class umg extends rb6.b {
    public umg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        tmg tmgVar = (tmg) this.f16149c;
        if (tmgVar.i()) {
            return a86VarI.t();
        }
        tmg tmgVar2 = (tmg) this.b;
        tmg tmgVar3 = (tmg) this.d[0];
        int[] iArrI = gfc.i(12);
        int[] iArrI2 = gfc.i(12);
        int[] iArrI3 = gfc.i(12);
        smg.j(tmgVar.a, iArrI3);
        int[] iArrI4 = gfc.i(12);
        smg.j(iArrI3, iArrI4);
        boolean zH = tmgVar3.h();
        int[] iArr = tmgVar3.a;
        if (!zH) {
            smg.j(iArr, iArrI2);
            iArr = iArrI2;
        }
        smg.m(tmgVar2.a, iArr, iArrI);
        smg.a(tmgVar2.a, iArr, iArrI2);
        smg.f(iArrI2, iArrI, iArrI2);
        smg.i(gfc.c(12, iArrI2, iArrI2, iArrI2), iArrI2);
        smg.f(iArrI3, tmgVar2.a, iArrI3);
        smg.i(gfc.F(12, iArrI3, 2, 0), iArrI3);
        smg.i(gfc.G(12, iArrI4, 3, 0, iArrI), iArrI);
        tmg tmgVar4 = new tmg(iArrI4);
        smg.j(iArrI2, tmgVar4.a);
        int[] iArr2 = tmgVar4.a;
        smg.m(iArr2, iArrI3, iArr2);
        int[] iArr3 = tmgVar4.a;
        smg.m(iArr3, iArrI3, iArr3);
        tmg tmgVar5 = new tmg(iArrI3);
        smg.m(iArrI3, tmgVar4.a, tmgVar5.a);
        int[] iArr4 = tmgVar5.a;
        smg.f(iArr4, iArrI2, iArr4);
        int[] iArr5 = tmgVar5.a;
        smg.m(iArr5, iArrI, iArr5);
        tmg tmgVar6 = new tmg(iArrI2);
        smg.n(tmgVar.a, tmgVar6.a);
        if (!zH) {
            int[] iArr6 = tmgVar6.a;
            smg.f(iArr6, tmgVar3.a, iArr6);
        }
        return new umg(a86VarI, tmgVar4, tmgVar5, new h86[]{tmgVar6}, this.f16150e);
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
        tmg tmgVar = (tmg) this.b;
        tmg tmgVar2 = (tmg) this.f16149c;
        tmg tmgVar3 = (tmg) rb6Var.q();
        tmg tmgVar4 = (tmg) rb6Var.r();
        tmg tmgVar5 = (tmg) this.d[0];
        tmg tmgVar6 = (tmg) rb6Var.s(0);
        int[] iArrI = gfc.i(24);
        int[] iArrI2 = gfc.i(24);
        int[] iArrI3 = gfc.i(12);
        int[] iArrI4 = gfc.i(12);
        boolean zH = tmgVar5.h();
        if (zH) {
            iArr = tmgVar3.a;
            iArr2 = tmgVar4.a;
        } else {
            smg.j(tmgVar5.a, iArrI3);
            smg.f(iArrI3, tmgVar3.a, iArrI2);
            smg.f(iArrI3, tmgVar5.a, iArrI3);
            smg.f(iArrI3, tmgVar4.a, iArrI3);
            iArr = iArrI2;
            iArr2 = iArrI3;
        }
        boolean zH2 = tmgVar6.h();
        if (zH2) {
            iArr3 = tmgVar.a;
            iArr4 = tmgVar2.a;
        } else {
            smg.j(tmgVar6.a, iArrI4);
            smg.f(iArrI4, tmgVar.a, iArrI);
            smg.f(iArrI4, tmgVar6.a, iArrI4);
            smg.f(iArrI4, tmgVar2.a, iArrI4);
            iArr3 = iArrI;
            iArr4 = iArrI4;
        }
        int[] iArrI5 = gfc.i(12);
        smg.m(iArr3, iArr, iArrI5);
        int[] iArrI6 = gfc.i(12);
        smg.m(iArr4, iArr2, iArrI6);
        if (gfc.v(12, iArrI5)) {
            return gfc.v(12, iArrI6) ? G() : a86VarI.t();
        }
        smg.j(iArrI5, iArrI3);
        int[] iArrI7 = gfc.i(12);
        smg.f(iArrI3, iArrI5, iArrI7);
        smg.f(iArrI3, iArr3, iArrI3);
        smg.g(iArrI7, iArrI7);
        cfc.a(iArr4, iArrI7, iArrI);
        smg.i(gfc.c(12, iArrI3, iArrI3, iArrI7), iArrI7);
        tmg tmgVar7 = new tmg(iArrI4);
        smg.j(iArrI6, tmgVar7.a);
        int[] iArr5 = tmgVar7.a;
        smg.m(iArr5, iArrI7, iArr5);
        tmg tmgVar8 = new tmg(iArrI7);
        smg.m(iArrI3, tmgVar7.a, tmgVar8.a);
        cfc.a(tmgVar8.a, iArrI6, iArrI2);
        smg.b(iArrI, iArrI2, iArrI);
        smg.h(iArrI, tmgVar8.a);
        tmg tmgVar9 = new tmg(iArrI5);
        if (!zH) {
            int[] iArr6 = tmgVar9.a;
            smg.f(iArr6, tmgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = tmgVar9.a;
            smg.f(iArr7, tmgVar6.a, iArr7);
        }
        return new umg(a86VarI, tmgVar7, tmgVar8, new h86[]{tmgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new umg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new umg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public umg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public umg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
