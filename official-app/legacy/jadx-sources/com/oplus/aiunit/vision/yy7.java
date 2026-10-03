package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class yy7 extends t22 {
    public t22 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19195n;
    public float o;
    public lk3 p;
    public lk3 q;

    public yy7(t22 t22Var, float f, float f2) {
        this.m = t22Var;
        this.d = t22Var.d + (f * 2.0f) + (2.0f * f2);
        this.f16854e = t22Var.f16854e + f + f2;
        this.f = t22Var.f + f + f2;
        this.g = t22Var.g;
        this.f19195n = f;
        this.o = f2;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        l1j l1jVarO = tb8Var.o();
        tb8Var.j(new cc1(this.f19195n, 0, 0));
        float f3 = this.f19195n / 2.0f;
        if (this.q != null) {
            lk3 color = tb8Var.getColor();
            tb8Var.t(this.q);
            float f4 = this.f16854e;
            float f5 = this.d;
            float f6 = this.f19195n;
            tb8Var.b(new cjf.a(f + f3, (f2 - f4) + f3, f5 - f6, (f4 + this.f) - f6));
            tb8Var.t(color);
        }
        if (this.p != null) {
            lk3 color2 = tb8Var.getColor();
            tb8Var.t(this.p);
            float f7 = f + f3;
            float f8 = this.f16854e;
            float f9 = (f2 - f8) + f3;
            float f10 = this.d;
            float f11 = this.f19195n;
            tb8Var.n(new cjf.a(f7, f9, f10 - f11, (f8 + this.f) - f11));
            tb8Var.t(color2);
        } else {
            float f12 = f + f3;
            float f13 = this.f16854e;
            float f14 = (f2 - f13) + f3;
            float f15 = this.d;
            float f16 = this.f19195n;
            tb8Var.n(new cjf.a(f12, f14, f15 - f16, (f13 + this.f) - f16));
        }
        tb8Var.j(l1jVarO);
        this.m.c(tb8Var, f + this.o + this.f19195n, f2);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.i();
    }

    public yy7(t22 t22Var, float f, float f2, lk3 lk3Var, lk3 lk3Var2) {
        this(t22Var, f, f2);
        this.p = lk3Var;
        this.q = lk3Var2;
    }
}
