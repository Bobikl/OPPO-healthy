package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class r22 {
    public final double a;
    public final double b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f16023c;
    public final double d;

    public r22(double d, double d2) {
        this.f16023c = d;
        this.d = d2;
        double dI = i(h(d2 / 1.7d, 0.0d, 20.0d), 0.0d, 0.8d);
        double dI2 = i(h(d / 1.7d, 0.0d, 20.0d), 0.5d, 200.0d);
        this.a = dI2;
        this.b = j(dI, d(dI2), 0.01d);
    }

    public final double a(double d) {
        return ((Math.pow(d, 3.0d) * 7.0E-4d) - (Math.pow(d, 2.0d) * 0.031d)) + (d * 0.64d) + 1.28d;
    }

    public final double b(double d) {
        return ((Math.pow(d, 3.0d) * 4.4E-5d) - (Math.pow(d, 2.0d) * 0.006d)) + (d * 0.36d) + 2.0d;
    }

    public final double c(double d) {
        return ((Math.pow(d, 3.0d) * 4.5E-7d) - (Math.pow(d, 2.0d) * 3.32E-4d)) + (d * 0.1078d) + 5.84d;
    }

    public final double d(double d) {
        if (d <= 18.0d) {
            return a(d);
        }
        if (d > 18.0d && d <= 44.0d) {
            return b(d);
        }
        if (d > 44.0d) {
            return c(d);
        }
        return 0.0d;
    }

    public double e() {
        return this.b;
    }

    public double f() {
        return this.a;
    }

    public final double g(double d, double d2, double d3) {
        return (d3 * d) + ((1.0d - d) * d2);
    }

    public final double h(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    public final double i(double d, double d2, double d3) {
        return d2 + (d * (d3 - d2));
    }

    public final double j(double d, double d2, double d3) {
        return g((2.0d * d) - (d * d), d2, d3);
    }
}
