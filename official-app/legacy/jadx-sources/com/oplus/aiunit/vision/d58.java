package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class d58 extends t22 {
    public static final lk3 m = new lk3(102, 102, 102);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lk3 f10393n = new lk3(153, 153, 255);
    public static final cc1 o = new cc1(3.8f, 0, 0, 4.0f);

    public d58(float f, float f2) {
        this.f = 0.0f;
        this.f16854e = f2;
        this.d = f;
        this.g = 0.0f;
    }

    public static void r(tb8 tb8Var, float f, float f2) {
        tb8Var.t(f10393n);
        tb8Var.c(f, f2);
        tb8Var.p(0, 0, 8, 8, 0, 360);
        tb8Var.t(lk3.BLACK);
        tb8Var.e(0, 0, 8, 8, 0, 360);
        tb8Var.c(-f, -f2);
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        qq transform = tb8Var.getTransform();
        lk3 color = tb8Var.getColor();
        l1j l1jVarO = tb8Var.o();
        float f3 = this.f16854e;
        tb8Var.c(((0.25f * f3) / 2.15f) + f, f2 - (f3 * 0.81395346f));
        tb8Var.t(m);
        tb8Var.j(o);
        float f4 = this.f16854e;
        tb8Var.m((f4 * 0.05f) / 2.15f, (f4 * 0.05f) / 2.15f);
        tb8Var.r(-0.4537856055185257d, 20.5d, 17.5d);
        tb8Var.e(0, 0, 43, 32, 0, 360);
        tb8Var.r(0.4537856055185257d, 20.5d, 17.5d);
        tb8Var.j(l1jVarO);
        r(tb8Var, 16.0f, -5.0f);
        r(tb8Var, -1.0f, 7.0f);
        r(tb8Var, 5.0f, 28.0f);
        r(tb8Var, 27.0f, 24.0f);
        r(tb8Var, 36.0f, 3.0f);
        tb8Var.j(l1jVarO);
        tb8Var.a(transform);
        tb8Var.t(color);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return 0;
    }
}
