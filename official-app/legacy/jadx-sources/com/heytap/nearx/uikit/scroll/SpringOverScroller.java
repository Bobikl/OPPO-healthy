package com.heytap.nearx.uikit.scroll;

import android.content.Context;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.NearIOverScroller;
import com.lifesense.plugin.ble.device.proto.d;

/* JADX INFO: loaded from: classes18.dex */
public class SpringOverScroller extends OverScroller implements NearIOverScroller {
    public static final float Near_FLING_FRICTION_FAST = 0.76f;
    public static final float Near_FLING_FRICTION_NORMAL = 0.32f;
    public static final int Near_FLING_MODE_FAST = 0;
    public static final int Near_FLING_MODE_NORMAL = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static float f7543j;
    public b a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f7544c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f7545e;
    public boolean f;
    public int g;
    public long h;
    public float i;

    public static class a implements Interpolator {
        public static final float a;
        public static final float b;

        static {
            float fA = 1.0f / a(1.0f);
            a = fA;
            b = 1.0f - (fA * a(1.0f));
        }

        public static float a(float f) {
            float f2 = f * 8.0f;
            return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fA = a * a(f);
            return fA > 0.0f ? fA + b : fA;
        }
    }

    public static class b {
        public static float y = 1.0f;
        public C0730b a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f7548j;
        public double k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7549l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7550n;
        public long o;
        public boolean r;
        public boolean s;
        public long u;
        public long v;
        public long w;
        public long x;
        public a d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f7547e = new a();
        public a f = new a();
        public float g = 0.32f;
        public double h = 20.0d;
        public double i = 0.05d;
        public int p = 1;
        public boolean q = false;
        public float t = 0.83f;
        public C0730b b = new C0730b(0.32f, 0.0d);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0730b f7546c = new C0730b(12.1899995803833d, 16.0d);

        public static class a {
            public double a;
            public double b;
        }

        /* JADX INFO: renamed from: com.heytap.nearx.uikit.scroll.SpringOverScroller$b$b, reason: collision with other inner class name */
        public static class C0730b {
            public double a;
            public double b;

            public C0730b(double d, double d2) {
                this.a = a((float) d);
                this.b = d((float) d2);
            }

            public final float a(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                return 25.0f + ((f - 8.0f) * 3.0f);
            }

            public void b(double d) {
                this.a = a((float) d);
            }

            public void c(double d) {
                this.b = d((float) d);
            }

            public final double d(float f) {
                if (f == 0.0f) {
                    return 0.0d;
                }
                return ((f - 30.0f) * 3.62f) + 194.0f;
            }
        }

        public b() {
            q(this.b);
        }

        public void i(int i, int i2) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.u = jCurrentAnimationTimeMillis;
            this.v = jCurrentAnimationTimeMillis;
            this.p = 1;
            y = 1.0f;
            this.b.b(this.g);
            this.b.c(0.0d);
            q(this.b);
            r(i, true);
            t(i2);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.w = jElapsedRealtime;
            this.x = jElapsedRealtime;
        }

        public double j() {
            return this.d.a;
        }

        public double k(a aVar) {
            return Math.abs(this.k - aVar.a);
        }

        public double l() {
            return this.k;
        }

        public double m() {
            return this.d.b;
        }

        public boolean n() {
            return Math.abs(this.d.b) <= this.h && (k(this.d) <= this.i || this.a.b == 0.0d);
        }

        public void o(int i, int i2, int i3) {
            a aVar = this.d;
            aVar.a = i;
            a aVar2 = this.f7547e;
            aVar2.a = 0.0d;
            aVar2.b = 0.0d;
            a aVar3 = this.f;
            aVar3.a = i2;
            aVar3.b = aVar.b;
        }

        public void p() {
            a aVar = this.d;
            double d = aVar.a;
            this.k = d;
            this.f.a = d;
            aVar.b = 0.0d;
            this.r = false;
        }

        public void q(C0730b c0730b) {
            if (c0730b == null) {
                throw new IllegalArgumentException("springConfig is required");
            }
            this.a = c0730b;
        }

        public void r(double d, boolean z) {
            this.f7548j = d;
            if (!this.q) {
                this.f7547e.a = 0.0d;
                this.f.a = 0.0d;
            }
            this.d.a = d;
            if (z) {
                p();
            }
        }

        public void s(double d) {
            if (this.k == d) {
                return;
            }
            this.f7548j = j();
            this.k = d;
        }

        public void t(double d) {
            if (Math.abs(d - this.d.b) < 1.0000000116860974E-7d) {
                return;
            }
            this.d.b = d;
        }

        public boolean u(int i, int i2, int i3) {
            r(i, false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.w = jElapsedRealtime;
            this.x = jElapsedRealtime;
            if (i <= i3 && i >= i2) {
                q(new C0730b(this.g, 0.0d));
                return false;
            }
            if (i > i3) {
                s(i3);
            } else if (i < i2) {
                s(i2);
            }
            this.r = true;
            this.f7546c.b(12.1899995803833d);
            this.f7546c.c(this.t * 16.0f);
            q(this.f7546c);
            return true;
        }

        public void v(int i, int i2, int i3) {
            this.f7549l = i;
            this.f7550n = i + i2;
            this.m = i3;
            this.o = AnimationUtils.currentAnimationTimeMillis();
            q(this.b);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.w = jElapsedRealtime;
            this.x = jElapsedRealtime;
        }

        public boolean w() {
            if (n()) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.x = jElapsedRealtime;
            float unused = SpringOverScroller.f7543j = Math.max(0.008f, (jElapsedRealtime - this.w) / 1000.0f);
            this.w = this.x;
            a aVar = this.d;
            double d = aVar.a;
            double d2 = aVar.b;
            a aVar2 = this.f;
            double d3 = aVar2.a;
            double d4 = aVar2.b;
            if (this.r) {
                double dK = k(aVar);
                if (!this.s && dK < 180.0d) {
                    this.s = true;
                } else if (dK < 2.0d) {
                    this.d.a = this.k;
                    this.s = false;
                    this.r = false;
                    return false;
                }
            } else {
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                long j2 = jCurrentAnimationTimeMillis - this.u;
                if (this.p == 1) {
                    if (Math.abs(this.d.b) > 4000.0d && Math.abs(this.d.b) < 10000.0d) {
                        this.a.a = (Math.abs(this.d.b) / 10000.0d) + 2.6d;
                    } else if (Math.abs(this.d.b) <= 4000.0d) {
                        this.a.a = (Math.abs(this.d.b) / 10000.0d) + 4.5d;
                    }
                    this.v = jCurrentAnimationTimeMillis;
                }
                if (this.p > 1) {
                    if (j2 > 480) {
                        if (Math.abs(this.d.b) > 2000.0d) {
                            this.a.a += (jCurrentAnimationTimeMillis - this.v) * 0.00125d;
                        } else {
                            C0730b c0730b = this.a;
                            double d5 = c0730b.a;
                            if (d5 > 2.0d) {
                                c0730b.a = d5 - ((jCurrentAnimationTimeMillis - this.v) * 0.00125d);
                            }
                        }
                    }
                    this.v = jCurrentAnimationTimeMillis;
                }
            }
            C0730b c0730b2 = this.a;
            double d6 = (c0730b2.b * (this.k - d3)) - (c0730b2.a * d4);
            double d7 = ((((double) SpringOverScroller.f7543j) * d2) / 2.0d) + d;
            double d8 = ((((double) SpringOverScroller.f7543j) * d6) / 2.0d) + d2;
            C0730b c0730b3 = this.a;
            double d9 = (c0730b3.b * (this.k - d7)) - (c0730b3.a * d8);
            double d10 = ((((double) SpringOverScroller.f7543j) * d8) / 2.0d) + d;
            double d11 = ((((double) SpringOverScroller.f7543j) * d9) / 2.0d) + d2;
            C0730b c0730b4 = this.a;
            double d12 = (c0730b4.b * (this.k - d10)) - (c0730b4.a * d11);
            double d13 = (((double) SpringOverScroller.f7543j) * d11) + d;
            double d14 = (((double) SpringOverScroller.f7543j) * d12) + d2;
            C0730b c0730b5 = this.a;
            double d15 = (d6 + ((d9 + d12) * 2.0d) + ((c0730b5.b * (this.k - d13)) - (c0730b5.a * d14))) * 0.16699999570846558d;
            double d16 = d + ((((d8 + d11) * 2.0d) + d2 + d14) * 0.16699999570846558d * ((double) SpringOverScroller.f7543j));
            double d17 = d2 + (d15 * ((double) SpringOverScroller.f7543j));
            a aVar3 = this.f;
            aVar3.b = d14;
            aVar3.a = d13;
            a aVar4 = this.d;
            aVar4.b = d17;
            aVar4.a = d16;
            this.p++;
            return true;
        }

        public void x(float f) {
            a aVar = this.d;
            int i = this.f7549l;
            aVar.a = i + Math.round(f * (this.f7550n - i));
        }
    }

    public SpringOverScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.d = 2;
        this.f = true;
        this.i = 1.0f;
        this.a = new b();
        this.b = new b();
        if (interpolator == null) {
            this.f7544c = new a();
        } else {
            this.f7544c = interpolator;
        }
        g(0.016f);
        this.f7545e = context;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void abortAnimation() {
        this.d = 2;
        this.a.p();
        this.b.p();
    }

    public final int c(int i) {
        if (!this.f) {
            return i;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = this.g;
        if (i2 <= 0) {
            if (i2 != 0) {
                return i;
            }
            this.g = i2 + 1;
            this.h = jCurrentTimeMillis;
            return i;
        }
        if (jCurrentTimeMillis - this.h > 500 || i < 8000) {
            e();
            return i;
        }
        this.h = jCurrentTimeMillis;
        int i3 = i2 + 1;
        this.g = i3;
        if (i3 <= 4) {
            return i;
        }
        float f = this.i * 1.4f;
        this.i = f;
        return Math.max(-70000, Math.min((int) (i * f), d.MAX_SURVIVAL_TIME_FOR_MESSAGE_WORKER));
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean computeScrollOffset() {
        if (isNearFinished()) {
            return false;
        }
        int i = this.d;
        if (i == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.a.o;
            int i2 = this.a.m;
            if (jCurrentAnimationTimeMillis < i2) {
                float interpolation = this.f7544c.getInterpolation(jCurrentAnimationTimeMillis / i2);
                this.a.x(interpolation);
                this.b.x(interpolation);
            } else {
                this.a.x(1.0f);
                this.b.x(1.0f);
                abortAnimation();
            }
        } else if (i == 1 && !this.a.w() && !this.b.w()) {
            abortAnimation();
        }
        return true;
    }

    public boolean d() {
        return this.f;
    }

    public final void e() {
        this.h = 0L;
        this.g = 0;
        this.i = 1.0f;
    }

    public void f(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        e();
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void g(float f) {
        f7543j = f;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocity() {
        double dM = this.a.m();
        double dM2 = this.b.m();
        return (int) Math.sqrt((dM * dM) + (dM2 * dM2));
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityX() {
        return (float) this.a.m();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityY() {
        return (float) this.b.m();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearCurrX() {
        return (int) Math.round(this.a.j());
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearCurrY() {
        return (int) Math.round(this.b.j());
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearFinalX() {
        return (int) this.a.l();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearFinalY() {
        return (int) this.b.l();
    }

    public void h(float f) {
        this.a.t = f;
        this.b.t = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final boolean isNearFinished() {
        return this.a.n() && this.b.n() && this.d != 0;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public boolean isScrollingInDirection(float f, float f2) {
        return !isFinished() && Math.signum(f) == Math.signum((float) ((int) (this.a.k - this.a.f7548j))) && Math.signum(f2) == Math.signum((float) ((int) (this.b.k - this.b.f7548j)));
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.a.o(i, i2, i3);
        springBack(i, 0, 0, i2, 0, 0);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.b.o(i, i2, i3);
        springBack(0, i, 0, 0, 0, i2);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityX(float f) {
        this.a.d.b = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityY(float f) {
        this.b.d.b = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalX(int i) {
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalY(int i) {
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFlingFriction(float f) {
        this.a.g = f;
        this.b.g = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.f7544c = new a();
        } else {
            this.f7544c = interpolator;
        }
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setIsScrollView(boolean z) {
        this.a.q = z;
        this.b.q = z;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setNearFriction(float f) {
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean zU = this.a.u(i, i3, i4);
        boolean zU2 = this.b.u(i2, i5, i6);
        if (zU || zU2) {
            this.d = 1;
        }
        return zU || zU2;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.d = 0;
        this.a.v(i, i3, i5);
        this.b.v(i2, i4, i5);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4) {
        this.d = 1;
        this.a.i(i, c(i3));
        this.b.i(i2, c(i4));
    }

    public SpringOverScroller(Context context) {
        this(context, null);
    }
}
