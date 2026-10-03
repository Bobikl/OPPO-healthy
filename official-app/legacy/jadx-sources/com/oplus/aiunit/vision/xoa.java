package com.oplus.aiunit.vision;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class xoa<T> {

    @Nullable
    public final wg6 a;

    @Nullable
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f18704c;

    @Nullable
    public final Interpolator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Interpolator f18705e;

    @Nullable
    public final Interpolator f;
    public final float g;

    @Nullable
    public Float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18706j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18707l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18708n;
    public PointF o;
    public PointF p;

    public xoa(wg6 wg6Var, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.i = -3987645.8f;
        this.f18706j = -3987645.8f;
        this.k = 784923401;
        this.f18707l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f18708n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = wg6Var;
        this.b = t;
        this.f18704c = t2;
        this.d = interpolator;
        this.f18705e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= f() && f < c();
    }

    public xoa<T> b(T t, T t2) {
        return new xoa<>(t, t2);
    }

    public float c() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.f18708n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.f18708n = 1.0f;
            } else {
                this.f18708n = f() + ((this.h.floatValue() - this.g) / this.a.e());
            }
        }
        return this.f18708n;
    }

    public float d() {
        if (this.f18706j == -3987645.8f) {
            this.f18706j = ((Float) this.f18704c).floatValue();
        }
        return this.f18706j;
    }

    public int e() {
        if (this.f18707l == 784923401) {
            this.f18707l = ((Integer) this.f18704c).intValue();
        }
        return this.f18707l;
    }

    public float f() {
        wg6 wg6Var = this.a;
        if (wg6Var == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.g - wg6Var.p()) / this.a.e();
        }
        return this.m;
    }

    public float g() {
        if (this.i == -3987645.8f) {
            this.i = ((Float) this.b).floatValue();
        }
        return this.i;
    }

    public int h() {
        if (this.k == 784923401) {
            this.k = ((Integer) this.b).intValue();
        }
        return this.k;
    }

    public boolean i() {
        return this.d == null && this.f18705e == null && this.f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f18704c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }

    public xoa(wg6 wg6Var, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f, @Nullable Float f2) {
        this.i = -3987645.8f;
        this.f18706j = -3987645.8f;
        this.k = 784923401;
        this.f18707l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f18708n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = wg6Var;
        this.b = t;
        this.f18704c = t2;
        this.d = null;
        this.f18705e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = f2;
    }

    public xoa(wg6 wg6Var, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.i = -3987645.8f;
        this.f18706j = -3987645.8f;
        this.k = 784923401;
        this.f18707l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f18708n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = wg6Var;
        this.b = t;
        this.f18704c = t2;
        this.d = interpolator;
        this.f18705e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public xoa(T t) {
        this.i = -3987645.8f;
        this.f18706j = -3987645.8f;
        this.k = 784923401;
        this.f18707l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f18708n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.f18704c = t;
        this.d = null;
        this.f18705e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public xoa(T t, T t2) {
        this.i = -3987645.8f;
        this.f18706j = -3987645.8f;
        this.k = 784923401;
        this.f18707l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f18708n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.f18704c = t2;
        this.d = null;
        this.f18705e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
