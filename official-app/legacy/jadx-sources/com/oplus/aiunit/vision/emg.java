package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class emg extends rb6.b {
    public emg(a86 a86Var, h86 h86Var, h86 h86Var2) {
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
        dmg dmgVar = (dmg) this.f16149c;
        if (dmgVar.i()) {
            return a86VarI.t();
        }
        dmg dmgVar2 = (dmg) this.b;
        dmg dmgVar3 = (dmg) this.d[0];
        int[] iArrD = zec.d();
        cmg.i(dmgVar.a, iArrD);
        int[] iArrD2 = zec.d();
        cmg.i(iArrD, iArrD2);
        int[] iArrD3 = zec.d();
        cmg.i(dmgVar2.a, iArrD3);
        cmg.h(zec.b(iArrD3, iArrD3, iArrD3), iArrD3);
        cmg.d(iArrD, dmgVar2.a, iArrD);
        cmg.h(gfc.F(7, iArrD, 2, 0), iArrD);
        int[] iArrD4 = zec.d();
        cmg.h(gfc.G(7, iArrD2, 3, 0, iArrD4), iArrD4);
        dmg dmgVar4 = new dmg(iArrD2);
        cmg.i(iArrD3, dmgVar4.a);
        int[] iArr = dmgVar4.a;
        cmg.k(iArr, iArrD, iArr);
        int[] iArr2 = dmgVar4.a;
        cmg.k(iArr2, iArrD, iArr2);
        dmg dmgVar5 = new dmg(iArrD);
        cmg.k(iArrD, dmgVar4.a, dmgVar5.a);
        int[] iArr3 = dmgVar5.a;
        cmg.d(iArr3, iArrD3, iArr3);
        int[] iArr4 = dmgVar5.a;
        cmg.k(iArr4, iArrD4, iArr4);
        dmg dmgVar6 = new dmg(iArrD3);
        cmg.l(dmgVar.a, dmgVar6.a);
        if (!dmgVar3.h()) {
            int[] iArr5 = dmgVar6.a;
            cmg.d(iArr5, dmgVar3.a, iArr5);
        }
        return new emg(a86VarI, dmgVar4, dmgVar5, new h86[]{dmgVar6}, this.f16150e);
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
        dmg dmgVar = (dmg) this.b;
        dmg dmgVar2 = (dmg) this.f16149c;
        dmg dmgVar3 = (dmg) rb6Var.q();
        dmg dmgVar4 = (dmg) rb6Var.r();
        dmg dmgVar5 = (dmg) this.d[0];
        dmg dmgVar6 = (dmg) rb6Var.s(0);
        int[] iArrE = zec.e();
        int[] iArrD = zec.d();
        int[] iArrD2 = zec.d();
        int[] iArrD3 = zec.d();
        boolean zH = dmgVar5.h();
        if (zH) {
            iArr = dmgVar3.a;
            iArr2 = dmgVar4.a;
        } else {
            cmg.i(dmgVar5.a, iArrD2);
            cmg.d(iArrD2, dmgVar3.a, iArrD);
            cmg.d(iArrD2, dmgVar5.a, iArrD2);
            cmg.d(iArrD2, dmgVar4.a, iArrD2);
            iArr = iArrD;
            iArr2 = iArrD2;
        }
        boolean zH2 = dmgVar6.h();
        if (zH2) {
            iArr3 = dmgVar.a;
            iArr4 = dmgVar2.a;
        } else {
            cmg.i(dmgVar6.a, iArrD3);
            cmg.d(iArrD3, dmgVar.a, iArrE);
            cmg.d(iArrD3, dmgVar6.a, iArrD3);
            cmg.d(iArrD3, dmgVar2.a, iArrD3);
            iArr3 = iArrE;
            iArr4 = iArrD3;
        }
        int[] iArrD4 = zec.d();
        cmg.k(iArr3, iArr, iArrD4);
        cmg.k(iArr4, iArr2, iArrD);
        if (zec.k(iArrD4)) {
            return zec.k(iArrD) ? G() : a86VarI.t();
        }
        cmg.i(iArrD4, iArrD2);
        int[] iArrD5 = zec.d();
        cmg.d(iArrD2, iArrD4, iArrD5);
        cmg.d(iArrD2, iArr3, iArrD2);
        cmg.f(iArrD5, iArrD5);
        zec.l(iArr4, iArrD5, iArrE);
        cmg.h(zec.b(iArrD2, iArrD2, iArrD5), iArrD5);
        dmg dmgVar7 = new dmg(iArrD3);
        cmg.i(iArrD, dmgVar7.a);
        int[] iArr5 = dmgVar7.a;
        cmg.k(iArr5, iArrD5, iArr5);
        dmg dmgVar8 = new dmg(iArrD5);
        cmg.k(iArrD2, dmgVar7.a, dmgVar8.a);
        cmg.e(dmgVar8.a, iArrD, iArrE);
        cmg.g(iArrE, dmgVar8.a);
        dmg dmgVar9 = new dmg(iArrD4);
        if (!zH) {
            int[] iArr6 = dmgVar9.a;
            cmg.d(iArr6, dmgVar5.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = dmgVar9.a;
            cmg.d(iArr7, dmgVar6.a, iArr7);
        }
        return new emg(a86VarI, dmgVar7, dmgVar8, new h86[]{dmgVar9}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new emg(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new emg(this.a, this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public emg(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public emg(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
