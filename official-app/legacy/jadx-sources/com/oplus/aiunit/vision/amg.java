package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class amg extends rb6.b {
    public amg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        zlg zlgVar = (zlg) this.f16149c;
        if (zlgVar.i()) {
            return a86VarI.t();
        }
        zlg zlgVar2 = (zlg) this.b;
        zlg zlgVar3 = (zlg) this.d[0];
        int[] iArrE = yec.e();
        int[] iArrE2 = yec.e();
        int[] iArrE3 = yec.e();
        ylg.j(zlgVar.a, iArrE3);
        int[] iArrE4 = yec.e();
        ylg.j(iArrE3, iArrE4);
        boolean zH = zlgVar3.h();
        int[] iArr = zlgVar3.a;
        if (!zH) {
            ylg.j(iArr, iArrE2);
            iArr = iArrE2;
        }
        ylg.m(zlgVar2.a, iArr, iArrE);
        ylg.a(zlgVar2.a, iArr, iArrE2);
        ylg.e(iArrE2, iArrE, iArrE2);
        ylg.i(yec.b(iArrE2, iArrE2, iArrE2), iArrE2);
        ylg.e(iArrE3, zlgVar2.a, iArrE3);
        ylg.i(gfc.F(6, iArrE3, 2, 0), iArrE3);
        ylg.i(gfc.G(6, iArrE4, 3, 0, iArrE), iArrE);
        zlg zlgVar4 = new zlg(iArrE4);
        ylg.j(iArrE2, zlgVar4.a);
        int[] iArr2 = zlgVar4.a;
        ylg.m(iArr2, iArrE3, iArr2);
        int[] iArr3 = zlgVar4.a;
        ylg.m(iArr3, iArrE3, iArr3);
        zlg zlgVar5 = new zlg(iArrE3);
        ylg.m(iArrE3, zlgVar4.a, zlgVar5.a);
        int[] iArr4 = zlgVar5.a;
        ylg.e(iArr4, iArrE2, iArr4);
        int[] iArr5 = zlgVar5.a;
        ylg.m(iArr5, iArrE, iArr5);
        zlg zlgVar6 = new zlg(iArrE2);
        ylg.n(zlgVar.a, zlgVar6.a);
        if (!zH) {
            int[] iArr6 = zlgVar6.a;
            ylg.e(iArr6, zlgVar3.a, iArr6);
        }
        return new amg(a86VarI, zlgVar4, zlgVar5, new h86[]{zlgVar6}, this.f16150e);
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
        zlg zlgVar = (zlg) this.b;
        zlg zlgVar2 = (zlg) this.f16149c;
        zlg zlgVar3 = (zlg) rb6Var.q();
        zlg zlgVar4 = (zlg) rb6Var.r();
        zlg zlgVar5 = (zlg) this.d[0];
        zlg zlgVar6 = (zlg) rb6Var.s(0);
        int[] iArrG = yec.g();
        int[] iArrE = yec.e();
        int[] iArrE2 = yec.e();
        int[] iArrE3 = yec.e();
        boolean zH = zlgVar5.h();
        if (zH) {
            iArr = zlgVar3.a;
            iArr2 = zlgVar4.a;
        } else {
            ylg.j(zlgVar5.a, iArrE2);
            ylg.e(iArrE2, zlgVar3.a, iArrE);
            ylg.e(iArrE2, zlgVar5.a, iArrE2);
            ylg.e(iArrE2, zlgVar4.a, iArrE2);
            iArr = iArrE;
            iArr2 = iArrE2;
        }
        boolean zH2 = zlgVar6.h();
        if (zH2) {
            iArr3 = zlgVar.a;
            iArr4 = zlgVar2.a;
        } else {
            ylg.j(zlgVar6.a, iArrE3);
            ylg.e(iArrE3, zlgVar.a, iArrG);
            ylg.e(iArrE3, zlgVar6.a, iArrE3);
            ylg.e(iArrE3, zlgVar2.a, iArrE3);
            iArr3 = iArrG;
            iArr4 = iArrE3;
        }
        int[] iArrE4 = yec.e();
        ylg.m(iArr3, iArr, iArrE4);
        ylg.m(iArr4, iArr2, iArrE);
        if (yec.s(iArrE4)) {
            return yec.s(iArrE) ? G() : a86VarI.t();
        }
        ylg.j(iArrE4, iArrE2);
        int[] iArrE5 = yec.e();
        ylg.e(iArrE2, iArrE4, iArrE5);
        ylg.e(iArrE2, iArr3, iArrE2);
        ylg.g(iArrE5, iArrE5);
        yec.v(iArr4, iArrE5, iArrG);
        ylg.i(yec.b(iArrE2, iArrE2, iArrE5), iArrE5);
        zlg zlgVar7 = new zlg(iArrE3);
        ylg.j(iArrE, zlgVar7.a);
        int[] iArr5 = zlgVar7.a;
        ylg.m(iArr5, iArrE5, iArr5);
        zlg zlgVar8 = new zlg(iArrE5);
        ylg.m(iArrE2, zlgVar7.a, zlgVar8.a);
        ylg.f(zlgVar8.a, iArrE, iArrG);
        ylg.h(iArrG, zlgVar8.a);
        zlg zlgVar9 = new zlg(iArrE4);
        if (!zH) {
            int[] iArr6 = zlgVar9.a;
            ylg.e(iArr6, zlgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = zlgVar9.a;
            ylg.e(iArr7, zlgVar6.a, iArr7);
        }
        return new amg(a86VarI, zlgVar7, zlgVar8, new h86[]{zlgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new amg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new amg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public amg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public amg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
