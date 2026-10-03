package com.oplus.aiunit.vision;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t22 {
    public static boolean DEBUG = false;
    public lk3 a;
    public lk3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lk3 f16853c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16854e;
    public float f;
    public float g;
    public int h;
    public LinkedList<t22> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t22 f16855j;
    public t22 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lk3 f16856l;

    public t22() {
        this(null, null);
    }

    public void a(int i, t22 t22Var) {
        this.i.add(i, t22Var);
        t22Var.f16855j = this;
        t22Var.k = this.k;
    }

    public void b(t22 t22Var) {
        this.i.add(t22Var);
        t22Var.f16855j = this;
        t22Var.k = this.k;
    }

    public abstract void c(tb8 tb8Var, float f, float f2);

    public void d(tb8 tb8Var, float f, float f2) {
        if (DEBUG) {
            e(tb8Var, f, f2, true);
        }
    }

    public void e(tb8 tb8Var, float f, float f2, boolean z) {
        if (DEBUG) {
            l1j l1jVarO = tb8Var.o();
            if (this.f16856l != null) {
                lk3 color = tb8Var.getColor();
                tb8Var.t(this.f16856l);
                float f3 = this.f16854e;
                tb8Var.b(new cjf.a(f, f2 - f3, this.d, f3 + this.f));
                tb8Var.t(color);
            }
            tb8Var.j(new cc1((float) Math.abs(1.0d / tb8Var.getTransform().d()), 0, 0));
            float f4 = this.d;
            if (f4 < 0.0f) {
                f += f4;
                this.d = -f4;
            }
            float f5 = this.f16854e;
            tb8Var.n(new cjf.a(f, f2 - f5, this.d, f5 + this.f));
            if (z) {
                lk3 color2 = tb8Var.getColor();
                tb8Var.t(lk3.RED);
                float f6 = this.f;
                if (f6 > 0.0f) {
                    tb8Var.b(new cjf.a(f, f2, this.d, f6));
                    tb8Var.t(color2);
                    tb8Var.n(new cjf.a(f, f2, this.d, this.f));
                } else if (f6 < 0.0f) {
                    tb8Var.b(new cjf.a(f, f2 + f6, this.d, -f6));
                    tb8Var.t(color2);
                    float f7 = this.f;
                    tb8Var.n(new cjf.a(f, f2 + f7, this.d, -f7));
                } else {
                    tb8Var.t(color2);
                }
            }
            tb8Var.j(l1jVarO);
        }
    }

    public void f(tb8 tb8Var) {
        tb8Var.t(this.f16853c);
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.f16854e;
    }

    public abstract int i();

    public float j() {
        return this.g;
    }

    public float k() {
        return this.d;
    }

    public void l() {
        this.d = -this.d;
    }

    public void m(float f) {
        this.f = f;
    }

    public void n(float f) {
        this.f16854e = f;
    }

    public void o(float f) {
        this.g = f;
    }

    public void p(float f) {
        this.d = f;
    }

    public void q(tb8 tb8Var, float f, float f2) {
        this.f16853c = tb8Var.getColor();
        lk3 lk3Var = this.b;
        if (lk3Var != null) {
            tb8Var.t(lk3Var);
            float f3 = this.f16854e;
            tb8Var.b(new cjf.a(f, f2 - f3, this.d, f3 + this.f));
        }
        lk3 lk3Var2 = this.a;
        if (lk3Var2 == null) {
            tb8Var.t(this.f16853c);
        } else {
            tb8Var.t(lk3Var2);
        }
        d(tb8Var, f, f2);
    }

    public t22(lk3 lk3Var, lk3 lk3Var2) {
        this.d = 0.0f;
        this.f16854e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = -1;
        this.i = new LinkedList<>();
        this.a = lk3Var;
        this.b = lk3Var2;
    }
}
