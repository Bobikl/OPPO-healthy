package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class vpj {
    public t22 a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q9a f17952c = new q9a(0, 0, 0, 0);
    public lk3 d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17953e = false;
    public static final lk3 f = new lk3(0, 0, 0);
    public static float defaultSize = -1.0f;
    public static float magFactor = 0.0f;

    public vpj(t22 t22Var, float f2, boolean z) {
        this.a = t22Var;
        float f3 = defaultSize;
        f2 = f3 != -1.0f ? f3 : f2;
        float f4 = magFactor;
        if (f4 != 0.0f) {
            this.b = Math.abs(f4) * f2;
        } else {
            this.b = f2;
        }
        if (z) {
            return;
        }
        q9a q9aVar = this.f17952c;
        int i = (int) (f2 * 0.18f);
        q9aVar.a += i;
        q9aVar.f15683c += i;
        q9aVar.b += i;
        q9aVar.d += i;
    }

    public int a() {
        return ((int) (((double) (this.a.h() * this.b)) + 0.99d + ((double) this.f17952c.a))) + ((int) (((double) (this.a.g() * this.b)) + 0.99d + ((double) this.f17952c.f15683c)));
    }

    public int b() {
        double dK = ((double) (this.a.k() * this.b)) + 0.99d;
        q9a q9aVar = this.f17952c;
        return (int) (dK + ((double) q9aVar.b) + ((double) q9aVar.d));
    }

    public void c(ns3 ns3Var, ub8 ub8Var, int i, int i2) {
        tb8 tb8Var = (tb8) ub8Var;
        tb8Var.s();
        qq transform = tb8Var.getTransform();
        lk3 color = tb8Var.getColor();
        tb8Var.h(null, mpf.VALUE_ANTIALIAS_ON);
        tb8Var.h(null, mpf.VALUE_RENDER_QUALITY);
        tb8Var.h(null, mpf.VALUE_TEXT_ANTIALIAS_ON);
        float f2 = this.b;
        tb8Var.m(f2, f2);
        lk3 lk3Var = this.d;
        if (lk3Var != null) {
            tb8Var.t(lk3Var);
        } else if (ns3Var != null) {
            tb8Var.t(ns3Var.a());
        } else {
            tb8Var.t(f);
        }
        t22 t22Var = this.a;
        q9a q9aVar = this.f17952c;
        float f3 = i + q9aVar.b;
        float f4 = this.b;
        t22Var.c(tb8Var, f3 / f4, ((i2 + q9aVar.a) / f4) + t22Var.h());
        tb8Var.f(null);
        tb8Var.a(transform);
        tb8Var.t(color);
    }

    public void d(lk3 lk3Var) {
        this.d = lk3Var;
    }

    public void e(q9a q9aVar) {
        f(q9aVar, false);
    }

    public void f(q9a q9aVar, boolean z) {
        this.f17952c = q9aVar;
        if (z) {
            return;
        }
        int i = q9aVar.a;
        float f2 = this.b;
        q9aVar.a = i + ((int) (f2 * 0.18f));
        q9aVar.f15683c += (int) (f2 * 0.18f);
        q9aVar.b += (int) (f2 * 0.18f);
        q9aVar.d += (int) (f2 * 0.18f);
    }
}
