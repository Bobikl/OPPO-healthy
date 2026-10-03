package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class rki extends OverScroller implements ri2 {
    public static final float COUI_FLING_FRICTION_FAST = 0.76f;
    public static final int COUI_FLING_MODE_FAST = 0;
    public static final int COUI_FLING_MODE_NORMAL = 1;
    public static final String TAG = "SpringOverScroller";
    public static float p = 12.19f;
    public static boolean q;
    public static float r;
    public c a;
    public c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f16233c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f16234e;
    public boolean f;
    public int g;
    public long h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16235j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16236l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public kn2 f16237n;
    public final Choreographer.FrameCallback o;

    public class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            c cVar = rki.this.a;
            if (cVar != null) {
                cVar.O(j2);
            }
            c cVar2 = rki.this.b;
            if (cVar2 != null) {
                cVar2.O(j2);
            }
            rki rkiVar = rki.this;
            rkiVar.k = rkiVar.f16236l;
            rki.this.f16236l = j2;
            rki.this.m = true;
            if (rki.this.f16235j) {
                return;
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public static class b implements Interpolator {
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

    public static class c {
        public static final long NANOS_PER_MS = 1000000;
        public static float O = 1.0f;
        public static double P = 2.5d;
        public static double Q = 2.5d;
        public static float R = 0.2f;
        public long A;
        public boolean B;
        public boolean C;
        public Choreographer D;
        public double E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public boolean K;
        public boolean L;
        public gm2 M;
        public Method N;
        public b a;
        public b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f16238c;
        public a d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f16239e = new a();
        public a f = new a();
        public C0925c g = new C0925c(0.0d, 0.0d, 0.0d, 0.0d);
        public float h;
        public double i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f16240j;
        public double k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f16241l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f16242n;
        public int o;
        public long p;
        public int q;
        public boolean r;
        public boolean s;
        public boolean t;
        public float u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        public static class a {
            public double a;
            public double b;
        }

        public static class b {
            public double a;
            public double b;

            public b(double d, double d2) {
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

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.rki$c$c, reason: collision with other inner class name */
        public static class C0925c {
            public double a;
            public double b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public double f16243c;
            public double d;

            public C0925c(double d, double d2, double d3, double d4) {
                this.a = d;
                this.b = d2;
                this.f16243c = d3;
                this.d = d4;
            }
        }

        public c() {
            float f = R;
            this.h = f;
            this.i = 20.0d;
            this.f16240j = 0.05d;
            this.q = 1;
            this.r = false;
            this.u = 0.83f;
            this.b = new b(f, 0.0d);
            this.f16238c = new b(12.1899995803833d, 16.0d);
            H(this.b);
            this.K = true;
            int iF = ifk.f();
            if (iF == 2) {
                P = 3.799999952316284d;
                Q = 3.4000000953674316d;
            } else if (iF >= 3) {
                P = 4.5d;
                Q = 4.0d;
                R = 0.24f;
            }
        }

        public final float A() {
            return 5.0f;
        }

        public double B() {
            return this.d.b;
        }

        public void C(int i, int i2) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.v = jCurrentAnimationTimeMillis;
            this.w = jCurrentAnimationTimeMillis;
            this.q = 1;
            O = 1.0f;
            this.b.b(this.h);
            this.b.c(0.0d);
            H(this.b);
            I(i, true);
            K(i2);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.x = jElapsedRealtime;
            this.y = jElapsedRealtime;
        }

        public boolean D() {
            return Math.abs(this.d.b) <= x() && (r(this.d) <= s() || this.a.b == 0.0d);
        }

        public final boolean E() {
            if (Math.abs(this.d.b) >= A()) {
                return false;
            }
            if (!rki.q) {
                return true;
            }
            Log.d(rki.TAG, this + " lostVelocity");
            return true;
        }

        public void F(int i, int i2, int i3) {
            a aVar = this.d;
            aVar.a = i;
            a aVar2 = this.f16239e;
            aVar2.a = 0.0d;
            aVar2.b = 0.0d;
            a aVar3 = this.f;
            aVar3.a = i2;
            aVar3.b = aVar.b;
        }

        public void G() {
            a aVar = this.d;
            double d = aVar.a;
            this.f16241l = d;
            this.f.a = d;
            aVar.b = 0.0d;
            this.s = false;
            this.C = true;
        }

        public void H(b bVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("springConfig is required");
            }
            this.a = bVar;
        }

        public void I(double d, boolean z) {
            this.k = d;
            if (!this.r) {
                this.f16239e.a = 0.0d;
                this.f.a = 0.0d;
            }
            this.d.a = d;
            if (z) {
                G();
            }
        }

        public void J(double d) {
            if (this.f16241l == d) {
                return;
            }
            this.k = q();
            this.f16241l = d;
            this.K = false;
        }

        public void K(double d) {
            if (Math.abs(d - this.d.b) < 1.0000000116860974E-7d) {
                return;
            }
            this.d.b = d;
        }

        public boolean L(int i, int i2, int i3, boolean z) {
            double d = i;
            I(d, false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.x = jElapsedRealtime;
            this.y = jElapsedRealtime;
            if (i <= i3 && i >= i2 && !z) {
                H(new b(this.h, 0.0d));
                return false;
            }
            if (i > i3) {
                J(i3);
            } else if (i < i2) {
                J(i2);
            } else if (z) {
                J(d);
            }
            this.s = true;
            this.f16238c.b(rki.p);
            this.f16238c.c(this.u * 16.0f);
            H(this.f16238c);
            return true;
        }

        public void M(int i, int i2, int i3, long j2) {
            this.m = i;
            int i4 = i + i2;
            this.o = i4;
            this.f16241l = i4;
            this.f16242n = i3;
            this.p = j2;
            H(this.b);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.x = jElapsedRealtime;
            this.y = jElapsedRealtime;
        }

        public boolean N() {
            n();
            if (this.s) {
                if (D()) {
                    return false;
                }
                a aVar = this.d;
                double d = aVar.a;
                double dR = r(aVar);
                if (!this.t && dR < 180.0d) {
                    this.t = true;
                } else if (dR < 0.25d) {
                    this.d.a = this.f16241l;
                    this.t = false;
                    this.s = false;
                    this.C = true;
                    return false;
                }
                do {
                    C0925c c0925c = this.g;
                    a aVar2 = this.d;
                    c0925c.a = aVar2.a;
                    c0925c.b = aVar2.b;
                    c0925c.f16243c = this.f.a;
                    C0925c c0925cO = o(c0925c, this.a, this.f16241l, rki.r);
                    a aVar3 = this.f;
                    aVar3.b = c0925cO.d;
                    aVar3.a = c0925cO.f16243c;
                    a aVar4 = this.d;
                    aVar4.b = c0925cO.b;
                    double d2 = c0925cO.a;
                    aVar4.a = d2;
                    if (Math.abs(d - d2) > 0.5d || !this.s) {
                        break;
                    }
                } while (!D());
                this.q++;
            } else {
                if (D()) {
                    this.C = true;
                    return false;
                }
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float fW = w();
                if (fW != 0.0f) {
                    float unused = rki.r = Math.min((fW / 1000.0f) / 1000000.0f, (jCurrentAnimationTimeMillis - this.w) / 1000.0f);
                }
                this.w = jCurrentAnimationTimeMillis;
                double d3 = this.d.a;
                if (!this.L || this.s) {
                    m();
                } else {
                    if (this.H <= 0) {
                        if (rki.q) {
                            Log.d(rki.TAG, this + " update end : SPLINE OSpring error duration");
                        }
                        return false;
                    }
                    k(Math.max(jCurrentAnimationTimeMillis - this.v, 0.0f) / this.H);
                }
                double d4 = this.d.a;
                double dAbs = Math.abs(d4 - d3);
                if (!this.L && dAbs < this.E && rki.r != 0.0f) {
                    if (rki.q) {
                        Log.d(rki.TAG, this + " update end : deltaPosition < 0.2");
                    }
                    return false;
                }
                if (this.L && E()) {
                    if (rki.q) {
                        Log.d(rki.TAG, this + " update end : lostVelocity when BALLISTIC (or only SPLINE)");
                    }
                    return false;
                }
                double d5 = this.f16241l;
                if ((d3 - d5) * (d4 - d5) <= 0.0d) {
                    this.d.a = d5;
                    if (rki.q) {
                        Log.d(rki.TAG, this + " update end : reaching final " + this.f16241l);
                    }
                    return false;
                }
                if (Double.isNaN(this.d.b) || Double.isNaN(this.d.a)) {
                    if (rki.q) {
                        Log.d(rki.TAG, this + " update end : mVelocity or mPosition NaN ");
                    }
                    return false;
                }
            }
            if (rki.q) {
                Log.d(rki.TAG, this + " <<< FLING_MODE: update mSplineDuration:" + this.G + " ,elapsedInternalTime:" + (this.w - this.v) + " ,mFinal:" + this.f16241l + " ,position:" + this.d.a + " ,velocity:" + this.d.b + " ,tension: " + this.a.b + " ,friction: " + this.a.a + " ,mOplusCount:" + this.q + " >>> ");
            }
            return true;
        }

        public final void O(long j2) {
            this.z = this.A;
            this.A = j2;
            this.B = true;
        }

        public void P(float f) {
            a aVar = this.d;
            int i = this.m;
            aVar.a = i + Math.round(f * (this.o - i));
        }

        public final void i() {
            if (this.s || this.q != 1) {
                return;
            }
            if (Math.abs(this.d.b) > 4000.0d && Math.abs(this.d.b) < 10000.0d) {
                this.a.a = P;
            } else if (Math.abs(this.d.b) <= 4000.0d) {
                this.a.a = Q;
            }
        }

        public void j(float f) {
            int i = (int) f;
            this.J = i;
            this.f16241l = this.k + ((double) i);
            if (rki.q) {
                Log.d(rki.TAG, "adjustSimulateSplineDistance: StartValue = " + this.k + " EndValue = " + this.f16241l + " SimulateSplineDistance = " + this.J);
            }
        }

        public final void k(float f) {
            float interpolation = this.M.getInterpolation(f);
            a aVar = this.d;
            aVar.a = ((double) (this.J * interpolation)) + this.k;
            aVar.b = ((this.M.b(f) * this.J) / this.H) * 1000.0f;
            if (rki.q) {
                Log.d(rki.TAG, " calculateCurStateWithInterpolator fraction:" + f + ", ratio: " + interpolation + ", position : " + this.d.a + ", mVelocity: " + this.d.b);
            }
            this.q++;
        }

        public final int[] l(double d, boolean z) {
            a aVar = this.d;
            int i = (int) aVar.a;
            int i2 = (int) aVar.b;
            int i3 = this.q;
            boolean z2 = this.K;
            a aVar2 = this.f;
            aVar2.a = 0.0d;
            aVar2.b = 0.0d;
            float f = 1000.0f;
            float unused = rki.r = (w() / 1000000.0f) / 1000.0f;
            if (rki.r == 0.0f) {
                n();
            }
            if (rki.q) {
                Log.d(rki.TAG, this + " calculateFinalPosition finalValue " + d + " savedPosition " + i + " savedVelocity " + i2 + ", mRefreshTime: " + rki.r);
            }
            boolean z3 = true;
            this.q = 1;
            boolean z4 = false;
            while (!this.K) {
                double d2 = this.d.a;
                if (z) {
                    k(((this.q * rki.r) * f) / this.H);
                } else {
                    m();
                }
                double d3 = this.d.a;
                double dAbs = Math.abs(d3 - d2);
                if (E()) {
                    if (rki.q) {
                        Log.d(rki.TAG, this + " calculateFinalPosition lostVelocity");
                    }
                    this.K = z3;
                }
                if (dAbs < this.E) {
                    if (rki.q) {
                        Log.d(rki.TAG, this + " calculateFinalPosition deltaPosition < " + this.E);
                    }
                    z3 = true;
                    this.K = true;
                } else {
                    z3 = true;
                }
                if (d != -1.0d && !z4 && (d2 - d) * (d3 - d) <= 0.0d) {
                    this.d.a = d;
                    if (z) {
                        this.f16242n = (int) (this.q * rki.r * 1000.0f);
                    } else {
                        this.F = (int) (this.q * rki.r * 1000.0f);
                    }
                    if (rki.q) {
                        Log.d(rki.TAG, this + " calculateFinalPosition reaching edge" + d);
                    }
                    z4 = z3;
                }
                f = 1000.0f;
            }
            int i4 = (int) this.d.a;
            int i5 = (int) (this.q * rki.r * 1000.0f);
            a aVar3 = this.d;
            aVar3.a = i;
            aVar3.b = i2;
            this.q = i3;
            a aVar4 = this.f;
            aVar4.a = 0.0d;
            aVar4.b = 0.0d;
            this.K = z2;
            return new int[]{i4, i5};
        }

        public final void m() {
            i();
            C0925c c0925c = this.g;
            a aVar = this.d;
            c0925c.a = aVar.a;
            c0925c.b = aVar.b;
            c0925c.f16243c = this.f.a;
            C0925c c0925cO = o(c0925c, this.a, this.f16241l, rki.r);
            this.q++;
            a aVar2 = this.d;
            aVar2.a = c0925cO.a;
            aVar2.b = c0925cO.b;
            a aVar3 = this.f;
            aVar3.a = c0925cO.f16243c;
            aVar3.b = c0925cO.d;
        }

        public void n() {
            this.y = SystemClock.elapsedRealtime();
            if (this.B) {
                this.B = false;
                if (rki.q) {
                    Log.d(rki.TAG, "update if: " + ((this.A - this.z) / 1.0E9f));
                }
                float unused = rki.r = Math.max(0.008f, (this.A - this.z) / 1.0E9f);
            } else {
                if (rki.q) {
                    Log.d(rki.TAG, "update else: " + ((this.y - this.x) / 1000.0f));
                }
                float unused2 = rki.r = Math.max(0.008f, (this.y - this.x) / 1000.0f);
            }
            if (rki.r > 0.025f) {
                if (rki.q) {
                    Log.d(rki.TAG, "update: error mRefreshTime = " + rki.r);
                }
                float unused3 = rki.r = 0.008f;
            }
            if (rki.q) {
                Log.d(rki.TAG, "update: mRefreshTime = " + rki.r + " mLastComputeTime = " + this.x);
            }
            this.x = this.y;
        }

        public final C0925c o(C0925c c0925c, b bVar, double d, float f) {
            double d2 = c0925c.a;
            double d3 = c0925c.b;
            double d4 = c0925c.f16243c;
            double d5 = bVar.b;
            double d6 = bVar.a;
            double d7 = (d - d4) * d5;
            double d8 = f;
            double d9 = d3 + ((d7 * d8) / 2.0d);
            double d10 = ((d - (((d3 * d8) / 2.0d) + d2)) * d5) - (d6 * d9);
            double d11 = d3 + ((d10 * d8) / 2.0d);
            double d12 = ((d - (d2 + ((d9 * d8) / 2.0d))) * d5) - (d6 * d11);
            double d13 = d2 + (d11 * d8);
            double d14 = d3 + (d12 * d8);
            double d15 = (d7 + ((d10 + d12) * 2.0d) + (((d - d13) * d5) - (d6 * d14))) * 0.16699999570846558d;
            double d16 = d2 + ((d3 + ((d9 + d11) * 2.0d) + d14) * 0.16699999570846558d * d8);
            double d17 = d3 + (d15 * d8);
            c0925c.a = d16;
            c0925c.b = d17;
            c0925c.f16243c = d13;
            c0925c.d = d14;
            if (rki.q) {
                Log.d(rki.TAG, " calculateOnceWithRebound, position : " + d16 + ", mVelocity: " + d17 + ",tempPosition:" + d13 + ",tempVelocity:" + d14 + ",tension:" + d5 + ",friction:" + d6 + ",refreshTime:" + f);
            }
            return c0925c;
        }

        public void p(int i, int i2, int i3, int i4, int i5) {
            if (rki.q) {
                Log.d(rki.TAG, this + " fling start " + i + " min " + i2 + " max " + i3 + " velocity " + i4 + " over " + i5);
            }
            this.E = z(Math.abs(i4));
            this.K = false;
            C(i, i4);
            this.G = 0;
            this.f16242n = 0;
            this.H = 0;
            this.F = 0;
            this.M = new gm2(40.0d, 1.15d, i4, 1.0f, 15000.0f, true);
            C(i, i4);
            float fU = u(Math.abs(i4));
            float fT = t(Math.abs(i4));
            double d = i4 >= 0 ? i3 : i2;
            int[] iArrL = l(d, false);
            int i6 = iArrL[0];
            int i7 = i6 - i;
            int i8 = iArrL[1];
            int i9 = this.F;
            if (i9 == 0) {
                i9 = i8;
            }
            this.F = i9;
            this.J = (int) (i7 * fT);
            this.H = (int) (i8 * fU);
            int[] iArrL2 = l(d, true);
            int i10 = iArrL2[0];
            this.I = i10 - i;
            int i11 = iArrL2[1];
            this.G = i11;
            int i12 = this.f16242n;
            if (i12 == 0) {
                i12 = i11;
            }
            this.f16242n = i12;
            this.L = i11 == i12;
            if (rki.q) {
                Log.d(rki.TAG, this + " fling mStartTime " + this.v + " mStart " + this.k + " edge " + d + " distanceScale " + fT + " durationScale " + fU + " mWithSpring " + this.L + " [ Distance_old " + i7 + " Distance_new " + this.I + " ] [ SplineDuration_old " + i8 + " Duration_old " + this.F + " SplineDuration_new " + this.G + " mSimulateSplineDistance " + this.J + " Duration_new " + this.f16242n + " ]");
            }
            if (this.L) {
                this.f16241l = Math.max(Math.min(i10, i3), i2);
                return;
            }
            this.I = i7;
            this.G = i8;
            this.f16242n = this.F;
            this.f16241l = Math.max(Math.min(i6, i3), i2);
        }

        public double q() {
            return this.d.a;
        }

        public double r(a aVar) {
            return Math.abs(this.f16241l - aVar.a);
        }

        public double s() {
            return this.f16240j;
        }

        public final float t(float f) {
            float f2;
            float f3 = 1.0f;
            if (f <= 2000.0f) {
                return 1.0f;
            }
            if (f <= 6000.0f) {
                f2 = ((f - 2000.0f) / 4000.0f) * 0.19999999f;
            } else {
                f3 = 0.8f;
                if (f <= 10000.0f) {
                    return 0.8f;
                }
                if (f > 20000.0f) {
                    return 0.4f;
                }
                f2 = ((f - 10000.0f) / 10000.0f) * 0.4f;
            }
            return f3 - f2;
        }

        public final float u(float f) {
            float f2;
            float f3;
            float f4 = 1.3f;
            if (f <= 2000.0f) {
                return 1.3f;
            }
            if (f <= 6000.0f) {
                f2 = (f - 2000.0f) / 4000.0f;
                f3 = 0.49999994f;
            } else {
                f4 = 0.8f;
                if (f <= 10000.0f) {
                    return 0.8f;
                }
                if (f > 20000.0f) {
                    return 0.5f;
                }
                f2 = (f - 10000.0f) / 10000.0f;
                f3 = 0.3f;
            }
            return f4 - (f2 * f3);
        }

        public double v() {
            return this.f16241l;
        }

        public final long w() {
            try {
                if (this.D == null) {
                    this.D = Choreographer.getInstance();
                }
                if (this.N == null) {
                    Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("getFrameIntervalNanos", new Class[0]);
                    this.N = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                return ((Long) this.N.invoke(this.D, new Object[0])).longValue();
            } catch (Exception e2) {
                if (!rki.q) {
                    return 0L;
                }
                Log.e(rki.TAG, "getFrameIntervalNanos error" + e2);
                return 0L;
            }
        }

        public double x() {
            return this.i;
        }

        public int y() {
            return this.J;
        }

        public double z(float f) {
            double d = f;
            if (d <= 5000.0d) {
                return 0.2d;
            }
            return d <= 8000.0d ? 0.3d : 0.35d;
        }
    }

    static {
        q = bj2.LOG_DEBUG || bj2.e(TAG, 3);
    }

    public rki(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.d = 2;
        this.f = true;
        this.i = 1.0f;
        this.m = false;
        this.o = new a();
        this.a = new c();
        this.b = new c();
        if (interpolator == null) {
            this.f16233c = new b();
        } else {
            this.f16233c = interpolator;
        }
        z(0.016f);
        this.f16234e = context;
        this.f16237n = new kn2(false);
    }

    public static synchronized void C(float f) {
        p = f;
    }

    public void A(float f) {
        C(f);
    }

    public void B(float f) {
        this.a.u = f;
        this.b.u = f;
    }

    public void D() {
        u();
        t();
        this.f16235j = false;
        this.a.C = false;
        this.b.C = false;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public final int a() {
        return (int) Math.round(this.a.q());
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void abortAnimation() {
        if (q) {
            Log.d(TAG, "abortAnimation", new Throwable());
        }
        this.d = 2;
        this.a.G();
        this.b.G();
        this.f16235j = true;
        this.f16237n.b(false);
    }

    @Override // com.oplus.aiunit.vision.ri2
    public final int b() {
        return (int) this.b.v();
    }

    @Override // com.oplus.aiunit.vision.ri2
    public final int c() {
        return (int) this.a.v();
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public boolean computeScrollOffset() {
        if (e()) {
            this.f16235j = this.a.C && this.b.C;
            return false;
        }
        int i = this.d;
        if (i == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.a.p;
            int i2 = this.a.f16242n;
            if (jCurrentAnimationTimeMillis < i2) {
                float interpolation = this.f16233c.getInterpolation(jCurrentAnimationTimeMillis / i2);
                this.a.P(interpolation);
                this.b.P(interpolation);
            } else {
                this.a.P(1.0f);
                this.b.P(1.0f);
                abortAnimation();
            }
        } else if (i == 1 && !this.a.N() && !this.b.N()) {
            abortAnimation();
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public final int d() {
        return (int) Math.round(this.b.q());
    }

    @Override // com.oplus.aiunit.vision.ri2
    public final boolean e() {
        boolean zD = this.a.D();
        boolean zD2 = this.b.D();
        if (q) {
            Log.d(TAG, "scrollX is rest: " + this.a.D() + "  scrollY is rest: " + this.b.D() + "  mMode = " + this.d);
        }
        return zD && zD2 && this.d != 0;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // android.widget.OverScroller
    public float getCurrVelocity() {
        double dB = this.a.B();
        double dB2 = this.b.B();
        return (int) Math.sqrt((dB * dB) + (dB2 * dB2));
    }

    @Override // com.oplus.aiunit.vision.ri2
    public float getCurrVelocityX() {
        return (float) this.a.B();
    }

    @Override // com.oplus.aiunit.vision.ri2
    public float getCurrVelocityY() {
        return (float) this.b.B();
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.a.F(i, i2, i3);
        springBack(i, 0, 0, i2, 0, 0);
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.b.F(i, i2, i3);
        springBack(0, i, 0, 0, 0, i2);
    }

    public void o() {
        this.f16235j = true;
    }

    public void p(boolean z) {
        this.f16237n.a(z);
    }

    public void q(int i, int i2, int i3, int i4) {
        if (q) {
            Log.d(TAG, "fling startX = " + i + " startY = " + i2 + " velocityX = " + i3 + " velocityY = " + i4, new Throwable());
        }
        this.d = 1;
        this.a.p(i, Integer.MIN_VALUE, Integer.MAX_VALUE, r(i3), 0);
        this.b.p(i2, Integer.MIN_VALUE, Integer.MAX_VALUE, r(i4), 0);
        this.f16237n.b(true);
    }

    public final int r(int i) {
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
            v();
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
        return Math.max(-70000, Math.min((int) (i * f), com.lifesense.plugin.ble.device.proto.d.MAX_SURVIVAL_TIME_FOR_MESSAGE_WORKER));
    }

    public boolean s() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setCurrVelocityX(float f) {
        this.a.d.b = f;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setCurrVelocityY(float f) {
        this.b.d.b = f;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setFinalX(int i) {
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.f16233c = new b();
        } else {
            this.f16233c = interpolator;
        }
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        if (q) {
            Log.d(TAG, "springBack startX = " + i + " startY = " + i2 + " minX = " + i3 + " minY = " + i5 + " maxY = " + i6, new Throwable());
        }
        boolean zL = this.a.L(i, i3, i4, false);
        boolean zL2 = this.b.L(i2, i5, i6, false);
        if (zL || zL2) {
            this.d = 1;
        }
        return zL || zL2;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    public void t() {
        if (q) {
            Log.d(TAG, "postChoreographerCallback: post Callback");
        }
        Choreographer.getInstance().postFrameCallback(this.o);
    }

    public void u() {
        if (q) {
            Log.d(TAG, "removeChoreographerCallback: remove Callback");
        }
        Choreographer.getInstance().removeFrameCallback(this.o);
    }

    public final void v() {
        this.h = 0L;
        this.g = 0;
        this.i = 1.0f;
    }

    public void w(boolean z) {
        q = z;
    }

    public void x(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        v();
    }

    public void y(boolean z) {
        this.a.r = z;
        this.b.r = z;
    }

    public final void z(float f) {
        r = f;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        q(i, i2, i3, i4);
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        if (q) {
            Log.d(TAG, "startScroll startX = " + i + " startY = " + i2 + " dx = " + i3 + " dy = " + i4 + " duration = " + i5, new Throwable());
        }
        this.d = 0;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.a.M(i, i3, i5, jCurrentAnimationTimeMillis);
        this.b.M(i2, i4, i5, jCurrentAnimationTimeMillis);
        this.f16237n.b(true);
    }

    public rki(Context context) {
        this(context, null);
    }
}
