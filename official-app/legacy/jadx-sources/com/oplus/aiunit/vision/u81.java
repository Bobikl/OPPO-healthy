package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.oplus.aiunit.vision.u81;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u81<T extends u81<T>> implements Cloneable {
    public boolean B;

    @Nullable
    public Resources.Theme C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public int i;

    @Nullable
    public Drawable m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17346n;

    @Nullable
    public Drawable o;
    public int p;
    public boolean u;

    @Nullable
    public Drawable w;
    public int x;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f17344j = 1.0f;

    @NonNull
    public ut5 k = ut5.AUTOMATIC;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public Priority f17345l = Priority.NORMAL;
    public boolean q = true;
    public int r = -1;
    public int s = -1;

    @NonNull
    public ona t = dm6.a();
    public boolean v = true;

    @NonNull
    public erd y = new erd();

    @NonNull
    public Map<Class<?>, x9k<?>> z = new CachedHashCodeArrayMap();

    @NonNull
    public Class<?> A = Object.class;
    public boolean G = true;

    public static boolean U(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean A() {
        return this.F;
    }

    @NonNull
    @CheckResult
    @Deprecated
    public T A0(@NonNull x9k<Bitmap>... x9kVarArr) {
        return (T) x0(new e8c(x9kVarArr), true);
    }

    @NonNull
    public final erd B() {
        return this.y;
    }

    @NonNull
    @CheckResult
    public T B0(boolean z) {
        if (this.D) {
            return (T) clone().B0(z);
        }
        this.H = z;
        this.i |= 1048576;
        return (T) o0();
    }

    public final int C() {
        return this.r;
    }

    public final int D() {
        return this.s;
    }

    @Nullable
    public final Drawable E() {
        return this.o;
    }

    public final int F() {
        return this.p;
    }

    @NonNull
    public final Priority G() {
        return this.f17345l;
    }

    @NonNull
    public final Class<?> H() {
        return this.A;
    }

    @NonNull
    public final ona I() {
        return this.t;
    }

    public final float J() {
        return this.f17344j;
    }

    @Nullable
    public final Resources.Theme K() {
        return this.C;
    }

    @NonNull
    public final Map<Class<?>, x9k<?>> L() {
        return this.z;
    }

    public final boolean M() {
        return this.H;
    }

    public final boolean N() {
        return this.E;
    }

    public final boolean O() {
        return this.D;
    }

    public final boolean P(u81<?> u81Var) {
        return Float.compare(u81Var.f17344j, this.f17344j) == 0 && this.f17346n == u81Var.f17346n && uqk.e(this.m, u81Var.m) && this.p == u81Var.p && uqk.e(this.o, u81Var.o) && this.x == u81Var.x && uqk.e(this.w, u81Var.w) && this.q == u81Var.q && this.r == u81Var.r && this.s == u81Var.s && this.u == u81Var.u && this.v == u81Var.v && this.E == u81Var.E && this.F == u81Var.F && this.k.equals(u81Var.k) && this.f17345l == u81Var.f17345l && this.y.equals(u81Var.y) && this.z.equals(u81Var.z) && this.A.equals(u81Var.A) && uqk.e(this.t, u81Var.t) && uqk.e(this.C, u81Var.C);
    }

    public final boolean Q() {
        return this.q;
    }

    public final boolean R() {
        return T(8);
    }

    public boolean S() {
        return this.G;
    }

    public final boolean T(int i) {
        return U(this.i, i);
    }

    public final boolean V() {
        return this.v;
    }

    public final boolean W() {
        return this.u;
    }

    public final boolean X() {
        return T(2048);
    }

    public final boolean Y() {
        return uqk.v(this.s, this.r);
    }

    @NonNull
    public T Z() {
        this.B = true;
        return (T) n0();
    }

    @NonNull
    @CheckResult
    public T a(@NonNull u81<?> u81Var) {
        if (this.D) {
            return (T) clone().a(u81Var);
        }
        if (U(u81Var.i, 2)) {
            this.f17344j = u81Var.f17344j;
        }
        if (U(u81Var.i, 262144)) {
            this.E = u81Var.E;
        }
        if (U(u81Var.i, 1048576)) {
            this.H = u81Var.H;
        }
        if (U(u81Var.i, 4)) {
            this.k = u81Var.k;
        }
        if (U(u81Var.i, 8)) {
            this.f17345l = u81Var.f17345l;
        }
        if (U(u81Var.i, 16)) {
            this.m = u81Var.m;
            this.f17346n = 0;
            this.i &= -33;
        }
        if (U(u81Var.i, 32)) {
            this.f17346n = u81Var.f17346n;
            this.m = null;
            this.i &= -17;
        }
        if (U(u81Var.i, 64)) {
            this.o = u81Var.o;
            this.p = 0;
            this.i &= -129;
        }
        if (U(u81Var.i, 128)) {
            this.p = u81Var.p;
            this.o = null;
            this.i &= -65;
        }
        if (U(u81Var.i, 256)) {
            this.q = u81Var.q;
        }
        if (U(u81Var.i, 512)) {
            this.s = u81Var.s;
            this.r = u81Var.r;
        }
        if (U(u81Var.i, 1024)) {
            this.t = u81Var.t;
        }
        if (U(u81Var.i, 4096)) {
            this.A = u81Var.A;
        }
        if (U(u81Var.i, 8192)) {
            this.w = u81Var.w;
            this.x = 0;
            this.i &= -16385;
        }
        if (U(u81Var.i, 16384)) {
            this.x = u81Var.x;
            this.w = null;
            this.i &= -8193;
        }
        if (U(u81Var.i, 32768)) {
            this.C = u81Var.C;
        }
        if (U(u81Var.i, 65536)) {
            this.v = u81Var.v;
        }
        if (U(u81Var.i, 131072)) {
            this.u = u81Var.u;
        }
        if (U(u81Var.i, 2048)) {
            this.z.putAll(u81Var.z);
            this.G = u81Var.G;
        }
        if (U(u81Var.i, 524288)) {
            this.F = u81Var.F;
        }
        if (!this.v) {
            this.z.clear();
            int i = this.i & (-2049);
            this.u = false;
            this.i = i & (-131073);
            this.G = true;
        }
        this.i |= u81Var.i;
        this.y.b(u81Var.y);
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T a0() {
        return (T) e0(DownsampleStrategy.CENTER_OUTSIDE, new u43());
    }

    @NonNull
    public T b() {
        if (this.B && !this.D) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.D = true;
        return (T) Z();
    }

    @NonNull
    @CheckResult
    public T b0() {
        return (T) d0(DownsampleStrategy.CENTER_INSIDE, new w43());
    }

    @NonNull
    @CheckResult
    public T c() {
        return (T) v0(DownsampleStrategy.CENTER_OUTSIDE, new u43());
    }

    @NonNull
    @CheckResult
    public T c0() {
        return (T) d0(DownsampleStrategy.FIT_CENTER, new sg7());
    }

    @NonNull
    @CheckResult
    public T d() {
        return (T) l0(DownsampleStrategy.CENTER_INSIDE, new w43());
    }

    @NonNull
    public final T d0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull x9k<Bitmap> x9kVar) {
        return (T) m0(downsampleStrategy, x9kVar, false);
    }

    @NonNull
    @CheckResult
    public T e() {
        return (T) v0(DownsampleStrategy.CENTER_INSIDE, new jb3());
    }

    @NonNull
    public final T e0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull x9k<Bitmap> x9kVar) {
        if (this.D) {
            return (T) clone().e0(downsampleStrategy, x9kVar);
        }
        m(downsampleStrategy);
        return (T) x0(x9kVar, false);
    }

    public boolean equals(Object obj) {
        if (obj instanceof u81) {
            return P((u81) obj);
        }
        return false;
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            erd erdVar = new erd();
            t.y = erdVar;
            erdVar.b(this.y);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.z = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.z);
            t.B = false;
            t.D = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @NonNull
    @CheckResult
    public T f0(int i) {
        return (T) g0(i, i);
    }

    @NonNull
    @CheckResult
    public T g0(int i, int i2) {
        if (this.D) {
            return (T) clone().g0(i, i2);
        }
        this.s = i;
        this.r = i2;
        this.i |= 512;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T h0(@DrawableRes int i) {
        if (this.D) {
            return (T) clone().h0(i);
        }
        this.p = i;
        int i2 = this.i | 128;
        this.o = null;
        this.i = i2 & (-65);
        return (T) o0();
    }

    public int hashCode() {
        return uqk.q(this.C, uqk.q(this.t, uqk.q(this.A, uqk.q(this.z, uqk.q(this.y, uqk.q(this.f17345l, uqk.q(this.k, uqk.r(this.F, uqk.r(this.E, uqk.r(this.v, uqk.r(this.u, uqk.p(this.s, uqk.p(this.r, uqk.r(this.q, uqk.q(this.w, uqk.p(this.x, uqk.q(this.o, uqk.p(this.p, uqk.q(this.m, uqk.p(this.f17346n, uqk.m(this.f17344j)))))))))))))))))))));
    }

    @NonNull
    @CheckResult
    public T i(@NonNull Class<?> cls) {
        if (this.D) {
            return (T) clone().i(cls);
        }
        this.A = (Class) cpe.d(cls);
        this.i |= 4096;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T i0(@Nullable Drawable drawable) {
        if (this.D) {
            return (T) clone().i0(drawable);
        }
        this.o = drawable;
        int i = this.i | 64;
        this.p = 0;
        this.i = i & (-129);
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T j(@NonNull ut5 ut5Var) {
        if (this.D) {
            return (T) clone().j(ut5Var);
        }
        this.k = (ut5) cpe.d(ut5Var);
        this.i |= 4;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T j0(@NonNull Priority priority) {
        if (this.D) {
            return (T) clone().j0(priority);
        }
        this.f17345l = (Priority) cpe.d(priority);
        this.i |= 8;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T k() {
        return (T) p0(r68.DISABLE_ANIMATION, Boolean.TRUE);
    }

    public T k0(@NonNull brd<?> brdVar) {
        if (this.D) {
            return (T) clone().k0(brdVar);
        }
        this.y.c(brdVar);
        return (T) o0();
    }

    @NonNull
    public final T l0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull x9k<Bitmap> x9kVar) {
        return (T) m0(downsampleStrategy, x9kVar, true);
    }

    @NonNull
    @CheckResult
    public T m(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) p0(DownsampleStrategy.OPTION, cpe.d(downsampleStrategy));
    }

    @NonNull
    public final T m0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull x9k<Bitmap> x9kVar, boolean z) {
        T t = z ? (T) v0(downsampleStrategy, x9kVar) : (T) e0(downsampleStrategy, x9kVar);
        t.G = true;
        return t;
    }

    public final T n0() {
        return this;
    }

    @NonNull
    public final T o0() {
        if (this.B) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) n0();
    }

    @NonNull
    @CheckResult
    public <Y> T p0(@NonNull brd<Y> brdVar, @NonNull Y y) {
        if (this.D) {
            return (T) clone().p0(brdVar, y);
        }
        cpe.d(brdVar);
        cpe.d(y);
        this.y.d(brdVar, y);
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T q(@DrawableRes int i) {
        if (this.D) {
            return (T) clone().q(i);
        }
        this.f17346n = i;
        int i2 = this.i | 32;
        this.m = null;
        this.i = i2 & (-17);
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T q0(@NonNull ona onaVar) {
        if (this.D) {
            return (T) clone().q0(onaVar);
        }
        this.t = (ona) cpe.d(onaVar);
        this.i |= 1024;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T r(@Nullable Drawable drawable) {
        if (this.D) {
            return (T) clone().r(drawable);
        }
        this.m = drawable;
        int i = this.i | 16;
        this.f17346n = 0;
        this.i = i & (-33);
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T r0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.D) {
            return (T) clone().r0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f17344j = f;
        this.i |= 2;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T s(@DrawableRes int i) {
        if (this.D) {
            return (T) clone().s(i);
        }
        this.x = i;
        int i2 = this.i | 16384;
        this.w = null;
        this.i = i2 & (-8193);
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T s0(boolean z) {
        if (this.D) {
            return (T) clone().s0(true);
        }
        this.q = !z;
        this.i |= 256;
        return (T) o0();
    }

    @NonNull
    @CheckResult
    public T t() {
        return (T) l0(DownsampleStrategy.FIT_CENTER, new sg7());
    }

    @NonNull
    @CheckResult
    public T t0(@Nullable Resources.Theme theme) {
        if (this.D) {
            return (T) clone().t0(theme);
        }
        this.C = theme;
        if (theme != null) {
            this.i |= 32768;
            return (T) p0(dtf.THEME, theme);
        }
        this.i &= -32769;
        return (T) k0(dtf.THEME);
    }

    @NonNull
    @CheckResult
    public T u(@NonNull DecodeFormat decodeFormat) {
        cpe.d(decodeFormat);
        return (T) p0(com.bumptech.glide.load.resource.bitmap.a.DECODE_FORMAT, decodeFormat).p0(r68.DECODE_FORMAT, decodeFormat);
    }

    @NonNull
    @CheckResult
    public T u0(@IntRange(from = 0) int i) {
        return (T) p0(sj9.TIMEOUT, Integer.valueOf(i));
    }

    @NonNull
    public final ut5 v() {
        return this.k;
    }

    @NonNull
    @CheckResult
    public final T v0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull x9k<Bitmap> x9kVar) {
        if (this.D) {
            return (T) clone().v0(downsampleStrategy, x9kVar);
        }
        m(downsampleStrategy);
        return (T) w0(x9kVar);
    }

    public final int w() {
        return this.f17346n;
    }

    @NonNull
    @CheckResult
    public T w0(@NonNull x9k<Bitmap> x9kVar) {
        return (T) x0(x9kVar, true);
    }

    @Nullable
    public final Drawable x() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public T x0(@NonNull x9k<Bitmap> x9kVar, boolean z) {
        if (this.D) {
            return (T) clone().x0(x9kVar, z);
        }
        e56 e56Var = new e56(x9kVar, z);
        y0(Bitmap.class, x9kVar, z);
        y0(Drawable.class, e56Var, z);
        y0(BitmapDrawable.class, e56Var.a(), z);
        y0(GifDrawable.class, new m68(x9kVar), z);
        return (T) o0();
    }

    @Nullable
    public final Drawable y() {
        return this.w;
    }

    @NonNull
    public <Y> T y0(@NonNull Class<Y> cls, @NonNull x9k<Y> x9kVar, boolean z) {
        if (this.D) {
            return (T) clone().y0(cls, x9kVar, z);
        }
        cpe.d(cls);
        cpe.d(x9kVar);
        this.z.put(cls, x9kVar);
        int i = this.i | 2048;
        this.v = true;
        int i2 = i | 65536;
        this.i = i2;
        this.G = false;
        if (z) {
            this.i = i2 | 131072;
            this.u = true;
        }
        return (T) o0();
    }

    public final int z() {
        return this.x;
    }

    @NonNull
    @CheckResult
    public T z0(@NonNull x9k<Bitmap>... x9kVarArr) {
        if (x9kVarArr.length > 1) {
            return (T) x0(new e8c(x9kVarArr), true);
        }
        return x9kVarArr.length == 1 ? (T) w0(x9kVarArr[0]) : (T) o0();
    }
}
