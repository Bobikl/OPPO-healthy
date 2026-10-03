package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qdg extends t22 {
    public t22 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f15757n;
    public double o;

    public qdg(t22 t22Var, double d, double d2) {
        this.m = t22Var;
        this.f15757n = (Double.isNaN(d) || Double.isInfinite(d)) ? 0.0d : d;
        this.o = (Double.isNaN(d2) || Double.isInfinite(d2)) ? 0.0d : d2;
        this.d = t22Var.d * ((float) Math.abs(this.f15757n));
        double d3 = this.o;
        this.f16854e = (d3 > 0.0d ? t22Var.f16854e : -t22Var.f) * ((float) d3);
        this.f = (d3 > 0.0d ? t22Var.f : -t22Var.f16854e) * ((float) d3);
        this.g = t22Var.g * ((float) d3);
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        d(tb8Var, f, f2);
        double d = this.f15757n;
        if (d == 0.0d || this.o == 0.0d) {
            return;
        }
        float f3 = d < 0.0d ? this.d : 0.0f;
        tb8Var.c(f + f3, f2);
        tb8Var.m(this.f15757n, this.o);
        this.m.c(tb8Var, 0.0f, 0.0f);
        tb8Var.m(1.0d / this.f15757n, 1.0d / this.o);
        tb8Var.c((-f) - f3, -f2);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qdg(t22 t22Var, float f) {
        double d = f;
        this(t22Var, d, d);
    }
}
