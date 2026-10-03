package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ilg extends rb6.b {
    public ilg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        hlg hlgVar = (hlg) this.f16149c;
        if (hlgVar.i()) {
            return a86VarI.t();
        }
        hlg hlgVar2 = (hlg) this.b;
        hlg hlgVar3 = (hlg) this.d[0];
        int[] iArrC = wec.c();
        int[] iArrC2 = wec.c();
        int[] iArrC3 = wec.c();
        glg.j(hlgVar.a, iArrC3);
        int[] iArrC4 = wec.c();
        glg.j(iArrC3, iArrC4);
        boolean zH = hlgVar3.h();
        int[] iArr = hlgVar3.a;
        if (!zH) {
            glg.j(iArr, iArrC2);
            iArr = iArrC2;
        }
        glg.m(hlgVar2.a, iArr, iArrC);
        glg.a(hlgVar2.a, iArr, iArrC2);
        glg.e(iArrC2, iArrC, iArrC2);
        glg.i(wec.b(iArrC2, iArrC2, iArrC2), iArrC2);
        glg.e(iArrC3, hlgVar2.a, iArrC3);
        glg.i(gfc.F(4, iArrC3, 2, 0), iArrC3);
        glg.i(gfc.G(4, iArrC4, 3, 0, iArrC), iArrC);
        hlg hlgVar4 = new hlg(iArrC4);
        glg.j(iArrC2, hlgVar4.a);
        int[] iArr2 = hlgVar4.a;
        glg.m(iArr2, iArrC3, iArr2);
        int[] iArr3 = hlgVar4.a;
        glg.m(iArr3, iArrC3, iArr3);
        hlg hlgVar5 = new hlg(iArrC3);
        glg.m(iArrC3, hlgVar4.a, hlgVar5.a);
        int[] iArr4 = hlgVar5.a;
        glg.e(iArr4, iArrC2, iArr4);
        int[] iArr5 = hlgVar5.a;
        glg.m(iArr5, iArrC, iArr5);
        hlg hlgVar6 = new hlg(iArrC2);
        glg.n(hlgVar.a, hlgVar6.a);
        if (!zH) {
            int[] iArr6 = hlgVar6.a;
            glg.e(iArr6, hlgVar3.a, iArr6);
        }
        return new ilg(a86VarI, hlgVar4, hlgVar5, new h86[]{hlgVar6}, this.f16150e);
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
        hlg hlgVar = (hlg) this.b;
        hlg hlgVar2 = (hlg) this.f16149c;
        hlg hlgVar3 = (hlg) rb6Var.q();
        hlg hlgVar4 = (hlg) rb6Var.r();
        hlg hlgVar5 = (hlg) this.d[0];
        hlg hlgVar6 = (hlg) rb6Var.s(0);
        int[] iArrE = wec.e();
        int[] iArrC = wec.c();
        int[] iArrC2 = wec.c();
        int[] iArrC3 = wec.c();
        boolean zH = hlgVar5.h();
        if (zH) {
            iArr = hlgVar3.a;
            iArr2 = hlgVar4.a;
        } else {
            glg.j(hlgVar5.a, iArrC2);
            glg.e(iArrC2, hlgVar3.a, iArrC);
            glg.e(iArrC2, hlgVar5.a, iArrC2);
            glg.e(iArrC2, hlgVar4.a, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = hlgVar6.h();
        if (zH2) {
            iArr3 = hlgVar.a;
            iArr4 = hlgVar2.a;
        } else {
            glg.j(hlgVar6.a, iArrC3);
            glg.e(iArrC3, hlgVar.a, iArrE);
            glg.e(iArrC3, hlgVar6.a, iArrC3);
            glg.e(iArrC3, hlgVar2.a, iArrC3);
            iArr3 = iArrE;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = wec.c();
        glg.m(iArr3, iArr, iArrC4);
        glg.m(iArr4, iArr2, iArrC);
        if (wec.o(iArrC4)) {
            return wec.o(iArrC) ? G() : a86VarI.t();
        }
        glg.j(iArrC4, iArrC2);
        int[] iArrC5 = wec.c();
        glg.e(iArrC2, iArrC4, iArrC5);
        glg.e(iArrC2, iArr3, iArrC2);
        glg.g(iArrC5, iArrC5);
        wec.q(iArr4, iArrC5, iArrE);
        glg.i(wec.b(iArrC2, iArrC2, iArrC5), iArrC5);
        hlg hlgVar7 = new hlg(iArrC3);
        glg.j(iArrC, hlgVar7.a);
        int[] iArr5 = hlgVar7.a;
        glg.m(iArr5, iArrC5, iArr5);
        hlg hlgVar8 = new hlg(iArrC5);
        glg.m(iArrC2, hlgVar7.a, hlgVar8.a);
        glg.f(hlgVar8.a, iArrC, iArrE);
        glg.h(iArrE, hlgVar8.a);
        hlg hlgVar9 = new hlg(iArrC4);
        if (!zH) {
            int[] iArr6 = hlgVar9.a;
            glg.e(iArr6, hlgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = hlgVar9.a;
            glg.e(iArr7, hlgVar6.a, iArr7);
        }
        return new ilg(a86VarI, hlgVar7, hlgVar8, new h86[]{hlgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new ilg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new ilg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public ilg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public ilg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
