package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qxd extends yy7 {
    public qxd(yy7 yy7Var) {
        super(yy7Var.m, yy7Var.f19195n, yy7Var.o);
    }

    @Override // com.oplus.aiunit.vision.yy7, com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        this.m.c(tb8Var, this.o + f + this.f19195n, f2);
        l1j l1jVarO = tb8Var.o();
        tb8Var.j(new cc1(this.f19195n, 0, 0));
        float f3 = this.f19195n;
        float f4 = f3 / 2.0f;
        float fMin = Math.min(this.d - f3, (this.f16854e + this.f) - f3) * 0.5f;
        float f5 = f + f4;
        float f6 = this.f16854e;
        float f7 = (f2 - f6) + f4;
        float f8 = this.d;
        float f9 = this.f19195n;
        tb8Var.g(new gyf(f5, f7, f8 - f9, (f6 + this.f) - f9, fMin, fMin));
        tb8Var.j(l1jVarO);
    }

    @Override // com.oplus.aiunit.vision.yy7, com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.i();
    }
}
