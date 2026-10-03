package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ayg extends yy7 {
    public float r;

    public ayg(yy7 yy7Var, float f) {
        super(yy7Var.m, yy7Var.f19195n, yy7Var.o);
        this.r = f;
        this.f += f;
        this.d += f;
    }

    @Override // com.oplus.aiunit.vision.yy7, com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        float f3 = this.f19195n;
        float f4 = f3 / 2.0f;
        this.m.c(tb8Var, this.o + f + f3, f2);
        l1j l1jVarO = tb8Var.o();
        tb8Var.j(new cc1(this.f19195n, 0, 0));
        float f5 = this.f16854e;
        float f6 = this.d;
        float f7 = this.r;
        float f8 = this.f19195n;
        tb8Var.n(new cjf.a(f + f4, (f2 - f5) + f4, (f6 - f7) - f8, ((f5 + this.f) - f7) - f8));
        float fAbs = (float) Math.abs(1.0d / tb8Var.getTransform().d());
        tb8Var.j(new cc1(fAbs, 0, 0));
        float f9 = this.r;
        tb8Var.b(new cjf.a((f + f9) - fAbs, ((this.f + f2) - f9) - fAbs, this.d - f9, f9));
        float f10 = f + this.d;
        float f11 = this.r;
        float f12 = (f10 - f11) - fAbs;
        float f13 = this.f16854e;
        tb8Var.b(new cjf.a(f12, (f2 - f13) + f4 + f11, f11, ((this.f + f13) - (2.0f * f11)) - f4));
        tb8Var.j(l1jVarO);
    }

    @Override // com.oplus.aiunit.vision.yy7, com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.i();
    }
}
