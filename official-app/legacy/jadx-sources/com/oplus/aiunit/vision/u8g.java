package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class u8g extends rb6.b {
    public u8g(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        t8g t8gVar = (t8g) this.f16149c;
        if (t8gVar.i()) {
            return a86VarI.t();
        }
        t8g t8gVar2 = (t8g) this.b;
        t8g t8gVar3 = (t8g) this.d[0];
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        int[] iArrF3 = afc.f();
        s8g.j(t8gVar.a, iArrF3);
        int[] iArrF4 = afc.f();
        s8g.j(iArrF3, iArrF4);
        boolean zH = t8gVar3.h();
        int[] iArr = t8gVar3.a;
        if (!zH) {
            s8g.j(iArr, iArrF2);
            iArr = iArrF2;
        }
        s8g.m(t8gVar2.a, iArr, iArrF);
        s8g.a(t8gVar2.a, iArr, iArrF2);
        s8g.e(iArrF2, iArrF, iArrF2);
        s8g.i(afc.b(iArrF2, iArrF2, iArrF2), iArrF2);
        s8g.e(iArrF3, t8gVar2.a, iArrF3);
        s8g.i(gfc.F(8, iArrF3, 2, 0), iArrF3);
        s8g.i(gfc.G(8, iArrF4, 3, 0, iArrF), iArrF);
        t8g t8gVar4 = new t8g(iArrF4);
        s8g.j(iArrF2, t8gVar4.a);
        int[] iArr2 = t8gVar4.a;
        s8g.m(iArr2, iArrF3, iArr2);
        int[] iArr3 = t8gVar4.a;
        s8g.m(iArr3, iArrF3, iArr3);
        t8g t8gVar5 = new t8g(iArrF3);
        s8g.m(iArrF3, t8gVar4.a, t8gVar5.a);
        int[] iArr4 = t8gVar5.a;
        s8g.e(iArr4, iArrF2, iArr4);
        int[] iArr5 = t8gVar5.a;
        s8g.m(iArr5, iArrF, iArr5);
        t8g t8gVar6 = new t8g(iArrF2);
        s8g.n(t8gVar.a, t8gVar6.a);
        if (!zH) {
            int[] iArr6 = t8gVar6.a;
            s8g.e(iArr6, t8gVar3.a, iArr6);
        }
        return new u8g(a86VarI, t8gVar4, t8gVar5, new h86[]{t8gVar6}, this.f16150e);
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
        t8g t8gVar = (t8g) this.b;
        t8g t8gVar2 = (t8g) this.f16149c;
        t8g t8gVar3 = (t8g) rb6Var.q();
        t8g t8gVar4 = (t8g) rb6Var.r();
        t8g t8gVar5 = (t8g) this.d[0];
        t8g t8gVar6 = (t8g) rb6Var.s(0);
        int[] iArrH = afc.h();
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        int[] iArrF3 = afc.f();
        boolean zH = t8gVar5.h();
        if (zH) {
            iArr = t8gVar3.a;
            iArr2 = t8gVar4.a;
        } else {
            s8g.j(t8gVar5.a, iArrF2);
            s8g.e(iArrF2, t8gVar3.a, iArrF);
            s8g.e(iArrF2, t8gVar5.a, iArrF2);
            s8g.e(iArrF2, t8gVar4.a, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = t8gVar6.h();
        if (zH2) {
            iArr3 = t8gVar.a;
            iArr4 = t8gVar2.a;
        } else {
            s8g.j(t8gVar6.a, iArrF3);
            s8g.e(iArrF3, t8gVar.a, iArrH);
            s8g.e(iArrF3, t8gVar6.a, iArrF3);
            s8g.e(iArrF3, t8gVar2.a, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = afc.f();
        s8g.m(iArr3, iArr, iArrF4);
        s8g.m(iArr4, iArr2, iArrF);
        if (afc.t(iArrF4)) {
            return afc.t(iArrF) ? G() : a86VarI.t();
        }
        s8g.j(iArrF4, iArrF2);
        int[] iArrF5 = afc.f();
        s8g.e(iArrF2, iArrF4, iArrF5);
        s8g.e(iArrF2, iArr3, iArrF2);
        s8g.g(iArrF5, iArrF5);
        afc.w(iArr4, iArrF5, iArrH);
        s8g.i(afc.b(iArrF2, iArrF2, iArrF5), iArrF5);
        t8g t8gVar7 = new t8g(iArrF3);
        s8g.j(iArrF, t8gVar7.a);
        int[] iArr5 = t8gVar7.a;
        s8g.m(iArr5, iArrF5, iArr5);
        t8g t8gVar8 = new t8g(iArrF5);
        s8g.m(iArrF2, t8gVar7.a, t8gVar8.a);
        s8g.f(t8gVar8.a, iArrF, iArrH);
        s8g.h(iArrH, t8gVar8.a);
        t8g t8gVar9 = new t8g(iArrF4);
        if (!zH) {
            int[] iArr6 = t8gVar9.a;
            s8g.e(iArr6, t8gVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = t8gVar9.a;
            s8g.e(iArr7, t8gVar6.a, iArr7);
        }
        return new u8g(a86VarI, t8gVar7, t8gVar8, new h86[]{t8gVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new u8g(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new u8g(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public u8g(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public u8g(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
