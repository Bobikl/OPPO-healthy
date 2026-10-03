package com.oplus.aiunit.vision;

import android.view.animation.BaseInterpolator;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 22)
public class gm2 extends BaseInterpolator {
    public final double a;
    public final double b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f11814c;
    public final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f11815e;
    public float f;
    public double g;
    public boolean h;

    public gm2(double d, double d2) {
        this(d, d2, 0.0d, 15000.0f);
    }

    public final float a(float f) {
        double dSqrt;
        double dSinh;
        double dCosh;
        double dSinh2;
        float f2 = (f >= 0.0f ? f : 0.0f) * this.d;
        double d = f2;
        double dExp = Math.exp((-this.b) * this.a * d);
        double d2 = this.b;
        if (d2 >= 1.0d) {
            if (Double.compare(1.0d, d2) == 0) {
                dSinh2 = ((this.f11815e * d) + 1.0d) * Math.exp(((double) (-f2)) * this.a);
            } else {
                double d3 = this.a;
                double d4 = this.b;
                dSqrt = d3 * Math.sqrt((d4 * d4) - 1.0d);
                if (this.h) {
                    dExp /= dSqrt;
                    double d5 = -this.f11814c;
                    double d6 = this.b;
                    dSinh = (d5 + (this.a * d6)) * Math.sinh(d6 * d);
                    dCosh = Math.cosh(this.b * d);
                } else {
                    double d7 = ((double) f) * dSqrt;
                    dSinh2 = (dExp / dSqrt) * ((((-this.f11814c) + (this.b * this.a)) * Math.sinh(d7)) + (dSqrt * Math.cosh(d7)));
                }
            }
            return (float) (1.0d - dSinh2);
        }
        dSinh = Math.cos(this.g * d);
        dSqrt = this.f11815e;
        dCosh = Math.sin(this.g * d);
        dSinh2 = dExp * (dSinh + (dSqrt * dCosh));
        return (float) (1.0d - dSinh2);
    }

    public float b(float f) {
        double dAbs;
        double d = f >= 0.0f ? f : 0.0f;
        double dExp = Math.exp(((double) (-this.d)) * this.b * this.a * d);
        double d2 = this.b;
        if (d2 < 1.0d) {
            float f2 = this.d;
            double d3 = this.f11815e;
            double d4 = this.a;
            double d5 = this.g;
            dAbs = Math.abs(dExp * ((((double) (-f2)) * ((d3 * d2 * d4) + d5) * Math.sin(((double) f2) * d5 * d)) + (((double) f2) * ((d3 * d5) - (d2 * d4)) * Math.cos(((double) this.d) * this.g * d))));
        } else if (Double.compare(1.0d, d2) == 0) {
            float f3 = this.d;
            double d6 = this.f11815e;
            double d7 = this.a;
            dAbs = Math.abs(((double) f3) * ((d6 - d7) - (((d6 * ((double) f3)) * d7) * d)) * Math.exp(((double) (-f3)) * d7 * d));
        } else {
            double d8 = this.a;
            double d9 = this.b;
            double dSqrt = d8 * Math.sqrt((d9 * d9) - 1.0d);
            float f4 = this.d;
            double d10 = this.f11814c;
            double d11 = this.b;
            double d12 = this.a;
            double d13 = ((double) f4) * (((dSqrt * dSqrt) + ((d10 * d11) * d12)) - (((d11 * d11) * d12) * d12));
            if (this.h) {
                dAbs = Math.abs((dExp / dSqrt) * ((d13 * Math.sinh(((double) f4) * d11 * d)) + (((double) f4) * d11 * (((d11 * d12) - d10) - (dSqrt * d12)) * Math.cosh(((double) this.d) * this.b * d))));
            } else {
                double d14 = ((double) (-f4)) * d10 * dSqrt;
                double d15 = f;
                dAbs = Math.abs((dExp / dSqrt) * ((d13 * Math.sinh(((double) f4) * dSqrt * d15)) + (d14 * Math.cosh(((double) this.d) * dSqrt * d15))));
            }
        }
        return (float) dAbs;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.f == -1.0f) {
            float f2 = 1.0f;
            float fA = a(1.0f);
            if (fA != 0.0f && !Float.isNaN(fA)) {
                f2 = fA;
            }
            this.f = f2;
        }
        return a(f) / this.f;
    }

    public gm2(double d, double d2, double d3, float f) {
        this(Math.pow(6.283185307179586d / (d == 0.0d ? 1.0d : d), 2.0d), 1.0d - d2, d3, 1.0f, f);
    }

    public gm2(double d, double d2, double d3, float f, float f2, boolean z) {
        this(d, d2, d3, f, f2);
        this.h = z;
    }

    public gm2(double d, double d2, double d3, float f, float f2) {
        this.f = -1.0f;
        double dSqrt = Math.sqrt(d <= 0.0d ? 40.0d : d);
        this.a = dSqrt;
        d2 = d2 <= 0.0d ? 1.15d : d2;
        this.b = d2;
        double dMin = Math.min(Math.abs(d3), 20000.0d) / ((double) (f2 <= 0.0f ? 15000.0f : f2));
        this.f11814c = dMin;
        this.d = f <= 0.0f ? 1.0f : f;
        if (d2 < 1.0d) {
            double dSqrt2 = Math.sqrt(1.0d - (d2 * d2)) * dSqrt;
            this.g = dSqrt2;
            this.f11815e = ((d2 * dSqrt) - dMin) / dSqrt2;
        } else if (Double.compare(1.0d, d2) == 0) {
            this.f11815e = (-dMin) + dSqrt;
        } else {
            this.f11815e = (-dMin) + (d2 * dSqrt);
        }
    }
}
