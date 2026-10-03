package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class wlg extends rb6.b {
    public wlg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        vlg vlgVar = (vlg) this.f16149c;
        if (vlgVar.i()) {
            return a86VarI.t();
        }
        vlg vlgVar2 = (vlg) this.b;
        vlg vlgVar3 = (vlg) this.d[0];
        int[] iArrE = yec.e();
        ulg.i(vlgVar.a, iArrE);
        int[] iArrE2 = yec.e();
        ulg.i(iArrE, iArrE2);
        int[] iArrE3 = yec.e();
        ulg.i(vlgVar2.a, iArrE3);
        ulg.h(yec.b(iArrE3, iArrE3, iArrE3), iArrE3);
        ulg.d(iArrE, vlgVar2.a, iArrE);
        ulg.h(gfc.F(6, iArrE, 2, 0), iArrE);
        int[] iArrE4 = yec.e();
        ulg.h(gfc.G(6, iArrE2, 3, 0, iArrE4), iArrE4);
        vlg vlgVar4 = new vlg(iArrE2);
        ulg.i(iArrE3, vlgVar4.a);
        int[] iArr = vlgVar4.a;
        ulg.k(iArr, iArrE, iArr);
        int[] iArr2 = vlgVar4.a;
        ulg.k(iArr2, iArrE, iArr2);
        vlg vlgVar5 = new vlg(iArrE);
        ulg.k(iArrE, vlgVar4.a, vlgVar5.a);
        int[] iArr3 = vlgVar5.a;
        ulg.d(iArr3, iArrE3, iArr3);
        int[] iArr4 = vlgVar5.a;
        ulg.k(iArr4, iArrE4, iArr4);
        vlg vlgVar6 = new vlg(iArrE3);
        ulg.l(vlgVar.a, vlgVar6.a);
        if (!vlgVar3.h()) {
            int[] iArr5 = vlgVar6.a;
            ulg.d(iArr5, vlgVar3.a, iArr5);
        }
        return new wlg(a86VarI, vlgVar4, vlgVar5, new h86[]{vlgVar6}, this.f16150e);
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
        vlg vlgVar = (vlg) this.b;
        vlg vlgVar2 = (vlg) this.f16149c;
        vlg vlgVar3 = (vlg) rb6Var.q();
        vlg vlgVar4 = (vlg) rb6Var.r();
        vlg vlgVar5 = (vlg) this.d[0];
        vlg vlgVar6 = (vlg) rb6Var.s(0);
        int[] iArrG = yec.g();
        int[] iArrE = yec.e();
        int[] iArrE2 = yec.e();
        int[] iArrE3 = yec.e();
        boolean zH = vlgVar5.h();
        if (zH) {
            iArr = vlgVar3.a;
            iArr2 = vlgVar4.a;
        } else {
            ulg.i(vlgVar5.a, iArrE2);
            ulg.d(iArrE2, vlgVar3.a, iArrE);
            ulg.d(iArrE2, vlgVar5.a, iArrE2);
            ulg.d(iArrE2, vlgVar4.a, iArrE2);
            iArr = iArrE;
            iArr2 = iArrE2;
        }
        boolean zH2 = vlgVar6.h();
        if (zH2) {
            iArr3 = vlgVar.a;
            iArr4 = vlgVar2.a;
        } else {
            ulg.i(vlgVar6.a, iArrE3);
            ulg.d(iArrE3, vlgVar.a, iArrG);
            ulg.d(iArrE3, vlgVar6.a, iArrE3);
            ulg.d(iArrE3, vlgVar2.a, iArrE3);
            iArr3 = iArrG;
            iArr4 = iArrE3;
        }
        int[] iArrE4 = yec.e();
        ulg.k(iArr3, iArr, iArrE4);
        ulg.k(iArr4, iArr2, iArrE);
        if (yec.s(iArrE4)) {
            return yec.s(iArrE) ? G() : a86VarI.t();
        }
        ulg.i(iArrE4, iArrE2);
        int[] iArrE5 = yec.e();
        ulg.d(iArrE2, iArrE4, iArrE5);
        ulg.d(iArrE2, iArr3, iArrE2);
        ulg.f(iArrE5, iArrE5);
        yec.v(iArr4, iArrE5, iArrG);
        ulg.h(yec.b(iArrE2, iArrE2, iArrE5), iArrE5);
        vlg vlgVar7 = new vlg(iArrE3);
        ulg.i(iArrE, vlgVar7.a);
        int[] iArr5 = vlgVar7.a;
        ulg.k(iArr5, iArrE5, iArr5);
        vlg vlgVar8 = new vlg(iArrE5);
        ulg.k(iArrE2, vlgVar7.a, vlgVar8.a);
        ulg.e(vlgVar8.a, iArrE, iArrG);
        ulg.g(iArrG, vlgVar8.a);
        vlg vlgVar9 = new vlg(iArrE4);
        if (!zH) {
            int[] iArr6 = vlgVar9.a;
            ulg.d(iArr6, vlgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = vlgVar9.a;
            ulg.d(iArr7, vlgVar6.a, iArr7);
        }
        return new wlg(a86VarI, vlgVar7, vlgVar8, new h86[]{vlgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new wlg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new wlg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public wlg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public wlg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
