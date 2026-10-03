package com.coui.appcompat.animation.dynamicanimation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    public double a;
    public double b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1533c;
    public double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f1534e;
    public double f;
    public double g;
    public double h;
    public double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final COUIDynamicAnimation.p f1535j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1536l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1537n;

    public c() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f1533c = false;
        this.i = Double.MAX_VALUE;
        this.f1535j = new COUIDynamicAnimation.p();
        this.k = 1500.0f;
        this.f1536l = 0.0f;
        this.m = 0.0f;
        this.f1537n = 0.0f;
    }

    public float a() {
        return this.f1537n;
    }

    public float b() {
        return (float) this.i;
    }

    public float c() {
        return this.m;
    }

    public float d() {
        return this.f1536l;
    }

    public final void e() {
        if (this.f1533c) {
            return;
        }
        if (this.i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.b;
        if (d > 1.0d) {
            double d2 = this.a;
            this.f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.b;
            double d4 = this.a;
            this.g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.h = this.a * Math.sqrt(1.0d - (d * d));
        }
        this.f1533c = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean f(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f1534e && ((double) Math.abs(f - b())) < this.d;
    }

    public float g(float f) {
        return (float) Math.pow(6.283185307179586d / ((double) f), 2.0d);
    }

    public c h(float f) {
        this.f1537n = f;
        return this;
    }

    public c i(float f) {
        float f2 = 1.0f - f;
        if (f2 >= 0.0f) {
            return j(f2);
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public c j(@FloatRange(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f;
        this.f1533c = false;
        return this;
    }

    public c k(float f) {
        this.i = f;
        return this;
    }

    public c l(float f) {
        if (f == 0.0f) {
            f = 1.0f;
        }
        float fPow = (float) Math.pow(6.283185307179586d / ((double) f), 2.0d);
        if (fPow > 0.0f) {
            return m(fPow);
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public c m(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.k = f;
        float fO = o(f);
        this.f1536l = fO;
        this.m = fO;
        this.f1533c = false;
        return this;
    }

    public void n(double d) {
        double dAbs = Math.abs(d);
        this.d = dAbs;
        this.f1534e = dAbs * 62.5d;
    }

    public final float o(float f) {
        return (float) (6.283185307179586d / Math.sqrt(f));
    }

    public c p(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.f1536l = f;
        float fG = g(f);
        this.a = Math.sqrt(fG);
        this.k = fG;
        this.f1533c = false;
        return this;
    }

    public COUIDynamicAnimation.p q(double d, double d2, long j2) {
        double dCos;
        double dPow;
        e();
        double d3 = j2 / 1000.0d;
        double d4 = d - this.i;
        double d5 = this.b;
        if (d5 > 1.0d) {
            double d6 = this.g;
            double d7 = this.f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f * d3) * d9);
            double d10 = this.g;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.a) * d3);
            double d15 = this.a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.h;
            double d17 = this.a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.h * d3) * d4) + (Math.sin(this.h * d3) * d18));
            double d19 = this.a;
            double d20 = this.b;
            double d21 = (-d19) * dPow4 * d20;
            double dPow5 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d22 = this.h;
            double dSin = (-d22) * d4 * Math.sin(d22 * d3);
            double d23 = this.h;
            dCos = d21 + (dPow5 * (dSin + (d18 * d23 * Math.cos(d23 * d3))));
            dPow = dPow4;
        }
        COUIDynamicAnimation.p pVar = this.f1535j;
        pVar.a = (float) (dPow + this.i);
        pVar.b = (float) dCos;
        return pVar;
    }

    public c(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f1533c = false;
        this.i = Double.MAX_VALUE;
        this.f1535j = new COUIDynamicAnimation.p();
        this.k = 1500.0f;
        this.f1536l = 0.0f;
        this.m = 0.0f;
        this.f1537n = 0.0f;
        this.i = f;
    }
}
