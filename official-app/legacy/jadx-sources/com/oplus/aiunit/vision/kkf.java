package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class kkf extends t22 {
    public t22 m;

    public kkf(t22 t22Var) {
        this.m = t22Var;
        this.d = t22Var.d;
        this.f16854e = t22Var.f16854e;
        this.f = t22Var.f;
        this.g = t22Var.g;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        d(tb8Var, f, f2);
        tb8Var.c(f, f2);
        tb8Var.m(-1.0d, 1.0d);
        this.m.c(tb8Var, -this.d, 0.0f);
        tb8Var.m(-1.0d, 1.0d);
        tb8Var.c(-f, -f2);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.i();
    }
}
