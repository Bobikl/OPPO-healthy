package com.oplus.aiunit.vision;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class yoa<T> {

    @Nullable
    public final k9b a;

    @Nullable
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f19086c;

    @Nullable
    public final Interpolator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Interpolator f19087e;

    @Nullable
    public final Interpolator f;
    public final float g;

    @Nullable
    public Float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19088j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19089l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19090n;
    public PointF o;
    public PointF p;

    public yoa(k9b k9bVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.i = -3987645.8f;
        this.f19088j = -3987645.8f;
        this.k = 784923401;
        this.f19089l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f19090n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = k9bVar;
        this.b = t;
        this.f19086c = t2;
        this.d = interpolator;
        this.f19087e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= f() && f < c();
    }

    public yoa<T> b(T t, T t2) {
        return new yoa<>(t, t2);
    }

    public float c() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.f19090n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.f19090n = 1.0f;
            } else {
                this.f19090n = f() + ((this.h.floatValue() - this.g) / this.a.e());
            }
        }
        return this.f19090n;
    }

    public float d() {
        if (this.f19088j == -3987645.8f) {
            this.f19088j = ((Float) this.f19086c).floatValue();
        }
        return this.f19088j;
    }

    public int e() {
        if (this.f19089l == 784923401) {
            this.f19089l = ((Integer) this.f19086c).intValue();
        }
        return this.f19089l;
    }

    public float f() {
        k9b k9bVar = this.a;
        if (k9bVar == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.g - k9bVar.p()) / this.a.e();
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
        return this.d == null && this.f19087e == null && this.f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f19086c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }

    public yoa(k9b k9bVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f, @Nullable Float f2) {
        this.i = -3987645.8f;
        this.f19088j = -3987645.8f;
        this.k = 784923401;
        this.f19089l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f19090n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = k9bVar;
        this.b = t;
        this.f19086c = t2;
        this.d = null;
        this.f19087e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = f2;
    }

    public yoa(k9b k9bVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.i = -3987645.8f;
        this.f19088j = -3987645.8f;
        this.k = 784923401;
        this.f19089l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f19090n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = k9bVar;
        this.b = t;
        this.f19086c = t2;
        this.d = interpolator;
        this.f19087e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public yoa(T t) {
        this.i = -3987645.8f;
        this.f19088j = -3987645.8f;
        this.k = 784923401;
        this.f19089l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f19090n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.f19086c = t;
        this.d = null;
        this.f19087e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public yoa(T t, T t2) {
        this.i = -3987645.8f;
        this.f19088j = -3987645.8f;
        this.k = 784923401;
        this.f19089l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f19090n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.f19086c = t2;
        this.d = null;
        this.f19087e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
