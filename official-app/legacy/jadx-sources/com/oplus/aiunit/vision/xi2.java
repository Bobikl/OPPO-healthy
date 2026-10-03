package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes13.dex */
public class xi2 extends OverScroller implements ri2 {
    public static final Interpolator f = new a();
    public b a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f18635c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kn2 f18636e;

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public static class b {
        public static final float r = (float) (Math.log(0.78d) / Math.log(0.9d));
        public static final float[] s = new float[101];
        public static final float[] t = new float[101];
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18637c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f18638e;
        public float f;
        public long g;
        public int h;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f18640l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f18641n;
        public float q;
        public float i = 1.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f18639j = 1.0f;
        public float o = ViewConfiguration.getScrollFriction() * 2.5f;
        public int p = 0;
        public boolean m = true;

        static {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i = 0; i < 100; i++) {
                float f13 = i / 100.0f;
                float f14 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f14 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = 1.0f - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f15 = (((f4 * 0.175f) + (f2 * 0.35000002f)) * f5) + f6;
                    if (Math.abs(f15 - f13) < 1.0E-5d) {
                        break;
                    } else if (f15 > f13) {
                        f14 = f2;
                    } else {
                        f11 = f2;
                    }
                }
                s[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f16 = 1.0f;
                while (true) {
                    f7 = ((f16 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f17 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f17 - f13) < 1.0E-5d) {
                        break;
                    }
                    if (f17 > f13) {
                        f16 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                t[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
            }
            s[100] = 1.0f;
            t[100] = 1.0f;
        }

        public b(Context context) {
            this.q = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        public static float o(int i) {
            return i > 0 ? -2000.0f : 2000.0f;
        }

        public final void A(int i, int i2, int i3) {
            this.m = false;
            this.p = 1;
            this.b = i;
            this.a = i;
            this.f18637c = i2;
            int i4 = i - i2;
            this.f = o(i4);
            this.d = -i4;
            this.f18641n = Math.abs(i4);
            this.h = (int) (Math.sqrt((i4 * (-2.0f)) / this.f) * 1000.0d);
        }

        public boolean B() {
            float f;
            float f2;
            double d;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.g;
            if (jCurrentAnimationTimeMillis == 0) {
                return this.h > 0;
            }
            int i = this.h;
            if (jCurrentAnimationTimeMillis > i) {
                return false;
            }
            int i2 = this.p;
            if (i2 == 0) {
                int i3 = this.k;
                float f3 = jCurrentAnimationTimeMillis / i3;
                int i4 = (int) (f3 * 100.0f);
                if (i4 >= 100 || i4 < 0) {
                    f = 1.0f;
                    f2 = 0.0f;
                } else {
                    float f4 = i4 / 100.0f;
                    int i5 = i4 + 1;
                    float[] fArr = s;
                    float f5 = fArr[i4];
                    f2 = (fArr[i5] - f5) / ((i5 / 100.0f) - f4);
                    f = f5 + ((f3 - f4) * f2);
                }
                int i6 = this.f18640l;
                this.f18638e = ((f2 * i6) / i3) * 1000.0f;
                d = f * i6;
            } else if (i2 == 1) {
                float f6 = jCurrentAnimationTimeMillis / i;
                float f7 = f6 * f6;
                float fSignum = Math.signum(this.d);
                int i7 = this.f18641n;
                this.f18638e = fSignum * i7 * 6.0f * ((-f6) + f7);
                d = i7 * fSignum * ((3.0f * f7) - ((2.0f * f6) * f7));
            } else if (i2 != 2) {
                d = 0.0d;
            } else {
                float f8 = jCurrentAnimationTimeMillis / 1000.0f;
                int i8 = this.d;
                float f9 = this.f;
                this.f18638e = i8 + (f9 * f8);
                d = (i8 * f8) + (((f9 * f8) * f8) / 2.0f);
            }
            this.b = this.a + ((int) Math.round(d));
            return true;
        }

        public void C(float f) {
            int i = this.a;
            this.b = i + Math.round(f * (this.f18637c - i));
        }

        public final void j(int i, int i2, int i3) {
            float fAbs = Math.abs((i3 - i) / (i2 - i));
            int i4 = (int) (fAbs * 100.0f);
            if (i4 >= 100 || i4 < 0) {
                return;
            }
            float f = i4 / 100.0f;
            int i5 = i4 + 1;
            float[] fArr = t;
            float f2 = fArr[i4];
            this.h = (int) (this.h * (f2 + (((fAbs - f) / ((i5 / 100.0f) - f)) * (fArr[i5] - f2))));
        }

        public boolean k() {
            int i = this.p;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                if (i == 2) {
                    this.g += (long) this.h;
                    A(this.f18637c, this.a, 0);
                }
            } else {
                if (this.h >= this.k) {
                    return false;
                }
                int i2 = this.f18637c;
                this.b = i2;
                this.a = i2;
                int i3 = (int) this.f18638e;
                this.d = i3;
                this.f = o(i3);
                this.g += (long) this.h;
                t();
            }
            B();
            return true;
        }

        public void l() {
            this.b = this.f18637c;
            this.m = true;
        }

        public final void m(int i, int i2, int i3) {
            float f = this.f;
            float f2 = (-i3) / f;
            float f3 = i3;
            float fSqrt = (float) Math.sqrt((((double) ((((f3 * f3) / 2.0f) / Math.abs(f)) + Math.abs(i2 - i))) * 2.0d) / ((double) Math.abs(this.f)));
            this.g -= (long) ((int) ((fSqrt - f2) * 1000.0f));
            this.b = i2;
            this.a = i2;
            this.d = (int) ((-this.f) * fSqrt);
        }

        public void n(int i, int i2, int i3, int i4, int i5) {
            double dQ;
            this.f18641n = i5;
            this.m = false;
            float f = i2;
            this.f18638e = f;
            this.d = i2;
            this.h = 0;
            this.k = 0;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            this.b = i;
            this.a = i;
            if (i > i4 || i < i3) {
                x(i, i3, i4, i2);
                return;
            }
            float f2 = this.f18639j;
            if (f2 != 1.0f) {
                i2 = (int) (f * f2);
                float f3 = i2;
                this.f18638e = f3;
                this.d = Math.round(f3 * f2);
            }
            this.p = 0;
            if (i2 != 0) {
                int iRound = Math.round(r(i2) * this.i);
                this.h = iRound;
                this.k = iRound;
                dQ = q(i2);
            } else {
                dQ = 0.0d;
            }
            int iSignum = (int) (dQ * ((double) Math.signum(i2)));
            this.f18640l = iSignum;
            int i6 = i + iSignum;
            this.f18637c = i6;
            if (i6 < i3) {
                j(this.a, i6, i3);
                this.f18637c = i3;
            }
            int i7 = this.f18637c;
            if (i7 > i4) {
                j(this.a, i7, i4);
                this.f18637c = i4;
            }
        }

        public final double p(int i) {
            return Math.log((Math.abs(i) * 0.35f) / (this.o * this.q));
        }

        public final double q(int i) {
            double dP = p(i);
            float f = r;
            return ((double) (this.o * this.q)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dP);
        }

        public final int r(int i) {
            return (int) (Math.exp(p(i) / ((double) (r - 1.0f))) * 1000.0d);
        }

        public void s(int i, int i2, int i3) {
            if (this.p == 0) {
                this.f18641n = i3;
                this.g = AnimationUtils.currentAnimationTimeMillis();
                x(i, i2, i2, (int) this.f18638e);
            }
        }

        public final void t() {
            int i = this.d;
            float f = i * i;
            float fAbs = f / (Math.abs(this.f) * 2.0f);
            float fSignum = Math.signum(this.d);
            int i2 = this.f18641n;
            if (fAbs > i2) {
                this.f = ((-fSignum) * f) / (i2 * 2.0f);
                fAbs = i2;
            }
            this.f18641n = (int) fAbs;
            this.p = 2;
            int i3 = this.a;
            int i4 = this.d;
            if (i4 <= 0) {
                fAbs = -fAbs;
            }
            this.f18637c = i3 + ((int) fAbs);
            this.h = -((int) ((i4 * 1000.0f) / this.f));
        }

        public void u(int i) {
            this.f18637c = i;
            this.f18640l = i - this.a;
            this.m = false;
        }

        public void v(float f) {
            this.o = f;
        }

        public boolean w(int i, int i2, int i3) {
            this.m = true;
            this.b = i;
            this.a = i;
            this.f18637c = i;
            this.d = 0;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            this.h = 0;
            if (i < i2) {
                A(i, i2, 0);
            } else if (i > i3) {
                A(i, i3, 0);
            }
            return !this.m;
        }

        public final void x(int i, int i2, int i3, int i4) {
            if (i > i2 && i < i3) {
                Log.e("COUILocateOverScroller", "startAfterEdge called from a valid position");
                this.m = true;
                return;
            }
            boolean z = i > i3;
            int i5 = z ? i3 : i2;
            int i6 = i - i5;
            if (i6 * i4 >= 0) {
                y(i, i5, i4);
            } else if (q(i4) > Math.abs(i6)) {
                n(i, i4, z ? i2 : i, z ? i : i3, this.f18641n);
            } else {
                A(i, i5, i4);
            }
        }

        public final void y(int i, int i2, int i3) {
            this.f = o(i3 == 0 ? i - i2 : i3);
            m(i, i2, i3);
            t();
        }

        public void z(int i, int i2, int i3) {
            this.m = false;
            this.b = i;
            this.a = i;
            this.f18637c = i + i2;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            this.h = i3;
            this.f = 0.0f;
            this.d = 0;
        }
    }

    public xi2(Context context) {
        this(context, null);
    }

    @Override // com.oplus.aiunit.vision.ri2
    public int a() {
        return this.a.b;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void abortAnimation() {
        this.a.l();
        this.b.l();
        this.f18636e.b(false);
    }

    @Override // com.oplus.aiunit.vision.ri2
    public int b() {
        return this.b.f18637c;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public int c() {
        return this.a.f18637c;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public boolean computeScrollOffset() {
        if (e()) {
            return false;
        }
        int i = this.d;
        if (i == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.a.g;
            int i2 = this.a.h;
            if (jCurrentAnimationTimeMillis < i2) {
                float interpolation = this.f18635c.getInterpolation(jCurrentAnimationTimeMillis / i2);
                this.a.C(interpolation);
                this.b.C(interpolation);
            } else {
                abortAnimation();
            }
        } else if (i == 1) {
            if (!this.a.m && !this.a.B() && !this.a.k()) {
                this.a.l();
            }
            if (!this.b.m && !this.b.B() && !this.b.k()) {
                this.b.l();
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public int d() {
        return this.b.b;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public boolean e() {
        return this.a.m && this.b.m;
    }

    public void f(boolean z) {
        this.f18636e.a(z);
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    public void g(int i, int i2, int i3, int i4) {
        this.d = 1;
        this.a.n(i, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        this.b.n(i2, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        this.f18636e.b(true);
    }

    @Override // android.widget.OverScroller
    public float getCurrVelocity() {
        return (float) Math.hypot(this.a.f18638e, this.b.f18638e);
    }

    @Override // com.oplus.aiunit.vision.ri2
    public float getCurrVelocityX() {
        return this.a.f18638e;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public float getCurrVelocityY() {
        return this.b.f18638e;
    }

    public void h(float f2) {
        this.a.i = f2;
        this.b.i = f2;
    }

    public void i(float f2) {
        this.a.v(f2);
        this.b.v(f2);
    }

    public void j(float f2) {
        this.a.f18639j = f2;
    }

    public void k(float f2) {
        this.b.f18639j = f2;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.a.s(i, i2, i3);
        springBack(i, 0, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.b.s(i, i2, i3);
        springBack(0, i, 0, 0, 0, 0);
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setCurrVelocityX(float f2) {
        this.a.f18638e = f2;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setCurrVelocityY(float f2) {
        this.b.f18638e = f2;
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setFinalX(int i) {
        if (i == -1) {
            return;
        }
        this.a.u(i);
    }

    @Override // com.oplus.aiunit.vision.ri2
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.f18635c = f;
        } else {
            this.f18635c = interpolator;
        }
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean zW = this.a.w(i, i3, i4);
        boolean zW2 = this.b.w(i2, i5, i6);
        if (zW || zW2) {
            this.d = 1;
        }
        return zW || zW2;
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    public xi2(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.a = new b(context);
        this.b = new b(context);
        if (interpolator == null) {
            this.f18635c = f;
        } else {
            this.f18635c = interpolator;
        }
        this.f18636e = new kn2(false);
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 > i8 || i2 < i7) {
            springBack(i, i2, i5, i6, i7, i8);
        } else {
            g(i, i2, i3, i4);
        }
    }

    @Override // android.widget.OverScroller, com.oplus.aiunit.vision.ri2
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.d = 0;
        this.a.z(i, i3, i5);
        this.b.z(i2, i4, i5);
        this.f18636e.b(true);
    }
}
