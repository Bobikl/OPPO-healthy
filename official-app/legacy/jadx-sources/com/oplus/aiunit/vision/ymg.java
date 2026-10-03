package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ymg extends rb6.b {
    public ymg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        xmg xmgVar = (xmg) this.f16149c;
        if (xmgVar.i()) {
            return a86VarI.t();
        }
        xmg xmgVar2 = (xmg) this.b;
        xmg xmgVar3 = (xmg) this.d[0];
        int[] iArrI = gfc.i(17);
        int[] iArrI2 = gfc.i(17);
        int[] iArrI3 = gfc.i(17);
        wmg.j(xmgVar.a, iArrI3);
        int[] iArrI4 = gfc.i(17);
        wmg.j(iArrI3, iArrI4);
        boolean zH = xmgVar3.h();
        int[] iArr = xmgVar3.a;
        if (!zH) {
            wmg.j(iArr, iArrI2);
            iArr = iArrI2;
        }
        wmg.l(xmgVar2.a, iArr, iArrI);
        wmg.a(xmgVar2.a, iArr, iArrI2);
        wmg.f(iArrI2, iArrI, iArrI2);
        gfc.c(17, iArrI2, iArrI2, iArrI2);
        wmg.i(iArrI2);
        wmg.f(iArrI3, xmgVar2.a, iArrI3);
        gfc.F(17, iArrI3, 2, 0);
        wmg.i(iArrI3);
        gfc.G(17, iArrI4, 3, 0, iArrI);
        wmg.i(iArrI);
        xmg xmgVar4 = new xmg(iArrI4);
        wmg.j(iArrI2, xmgVar4.a);
        int[] iArr2 = xmgVar4.a;
        wmg.l(iArr2, iArrI3, iArr2);
        int[] iArr3 = xmgVar4.a;
        wmg.l(iArr3, iArrI3, iArr3);
        xmg xmgVar5 = new xmg(iArrI3);
        wmg.l(iArrI3, xmgVar4.a, xmgVar5.a);
        int[] iArr4 = xmgVar5.a;
        wmg.f(iArr4, iArrI2, iArr4);
        int[] iArr5 = xmgVar5.a;
        wmg.l(iArr5, iArrI, iArr5);
        xmg xmgVar6 = new xmg(iArrI2);
        wmg.m(xmgVar.a, xmgVar6.a);
        if (!zH) {
            int[] iArr6 = xmgVar6.a;
            wmg.f(iArr6, xmgVar3.a, iArr6);
        }
        return new ymg(a86VarI, xmgVar4, xmgVar5, new h86[]{xmgVar6}, this.f16150e);
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
        xmg xmgVar = (xmg) this.b;
        xmg xmgVar2 = (xmg) this.f16149c;
        xmg xmgVar3 = (xmg) rb6Var.q();
        xmg xmgVar4 = (xmg) rb6Var.r();
        xmg xmgVar5 = (xmg) this.d[0];
        xmg xmgVar6 = (xmg) rb6Var.s(0);
        int[] iArrI = gfc.i(17);
        int[] iArrI2 = gfc.i(17);
        int[] iArrI3 = gfc.i(17);
        int[] iArrI4 = gfc.i(17);
        boolean zH = xmgVar5.h();
        if (zH) {
            iArr = xmgVar3.a;
            iArr2 = xmgVar4.a;
        } else {
            wmg.j(xmgVar5.a, iArrI3);
            wmg.f(iArrI3, xmgVar3.a, iArrI2);
            wmg.f(iArrI3, xmgVar5.a, iArrI3);
            wmg.f(iArrI3, xmgVar4.a, iArrI3);
            iArr = iArrI2;
            iArr2 = iArrI3;
        }
        boolean zH2 = xmgVar6.h();
        if (zH2) {
            iArr3 = xmgVar.a;
            iArr4 = xmgVar2.a;
        } else {
            wmg.j(xmgVar6.a, iArrI4);
            wmg.f(iArrI4, xmgVar.a, iArrI);
            wmg.f(iArrI4, xmgVar6.a, iArrI4);
            wmg.f(iArrI4, xmgVar2.a, iArrI4);
            iArr3 = iArrI;
            iArr4 = iArrI4;
        }
        int[] iArrI5 = gfc.i(17);
        wmg.l(iArr3, iArr, iArrI5);
        wmg.l(iArr4, iArr2, iArrI2);
        if (gfc.v(17, iArrI5)) {
            return gfc.v(17, iArrI2) ? G() : a86VarI.t();
        }
        wmg.j(iArrI5, iArrI3);
        int[] iArrI6 = gfc.i(17);
        wmg.f(iArrI3, iArrI5, iArrI6);
        wmg.f(iArrI3, iArr3, iArrI3);
        wmg.f(iArr4, iArrI6, iArrI);
        xmg xmgVar7 = new xmg(iArrI4);
        wmg.j(iArrI2, xmgVar7.a);
        int[] iArr5 = xmgVar7.a;
        wmg.a(iArr5, iArrI6, iArr5);
        int[] iArr6 = xmgVar7.a;
        wmg.l(iArr6, iArrI3, iArr6);
        int[] iArr7 = xmgVar7.a;
        wmg.l(iArr7, iArrI3, iArr7);
        xmg xmgVar8 = new xmg(iArrI6);
        wmg.l(iArrI3, xmgVar7.a, xmgVar8.a);
        wmg.f(xmgVar8.a, iArrI2, iArrI2);
        wmg.l(iArrI2, iArrI, xmgVar8.a);
        xmg xmgVar9 = new xmg(iArrI5);
        if (!zH) {
            int[] iArr8 = xmgVar9.a;
            wmg.f(iArr8, xmgVar5.a, iArr8);
        }
        if (!zH2) {
            int[] iArr9 = xmgVar9.a;
            wmg.f(iArr9, xmgVar6.a, iArr9);
        }
        return new ymg(a86VarI, xmgVar7, xmgVar8, new h86[]{xmgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new ymg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new ymg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public ymg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public ymg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
