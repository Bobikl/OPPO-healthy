package com.heytap.nearx.uikit.scroll;

import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.NearIOverScroller;

/* JADX INFO: loaded from: classes18.dex */
public class NearLocateOverScroller extends OverScroller implements NearIOverScroller {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Interpolator f7538c = new a();
    public Interpolator a;
    public int b;

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public static class b {
        public static final float a = (float) (Math.log(0.78d) / Math.log(0.9d));
        public static final float[] b = new float[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float[] f7539c = new float[101];

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
                b[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
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
                f7539c[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
            }
            b[100] = 1.0f;
            f7539c[100] = 1.0f;
        }

        public static /* synthetic */ long a(b bVar) {
            throw null;
        }

        public static /* synthetic */ int b(b bVar) {
            throw null;
        }

        public static /* synthetic */ boolean c(b bVar) {
            throw null;
        }

        public static /* synthetic */ int d(b bVar) {
            throw null;
        }

        public static /* synthetic */ int e(b bVar) {
            throw null;
        }

        public static /* synthetic */ int f(b bVar) {
            throw null;
        }

        public static /* synthetic */ float g(b bVar) {
            throw null;
        }

        public static /* synthetic */ float h(b bVar, float f) {
            throw null;
        }
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void abortAnimation() {
        throw null;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean computeScrollOffset() {
        if (isNearFinished()) {
            return false;
        }
        int i = this.b;
        if (i == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - b.a(null);
            int iB = b.b(null);
            if (jCurrentAnimationTimeMillis < iB) {
                this.a.getInterpolation(jCurrentAnimationTimeMillis / iB);
                throw null;
            }
            abortAnimation();
        } else if (i == 1 && (!b.c(null) || !b.c(null))) {
            throw null;
        }
        return true;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocity() {
        return (float) Math.hypot(b.g(null), b.g(null));
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityX() {
        return b.g(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityY() {
        return b.g(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearCurrX() {
        return b.d(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearCurrY() {
        return b.d(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearFinalX() {
        return b.e(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearFinalY() {
        return b.e(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public boolean isNearFinished() {
        return b.c(null) && b.c(null);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public boolean isScrollingInDirection(float f, float f2) {
        return !isFinished() && Math.signum(f) == Math.signum((float) (b.e(null) - b.f(null))) && Math.signum(f2) == Math.signum((float) (b.e(null) - b.f(null)));
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        throw null;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityX(float f) {
        b.h(null, f);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityY(float f) {
        b.h(null, f);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalX(int i) {
        if (i != -1) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalY(int i) {
        if (i != -1) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFlingFriction(float f) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.a = f7538c;
        } else {
            this.a = interpolator;
        }
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setIsScrollView(boolean z) {
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setNearFriction(float f) {
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        throw null;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 > i8 || i2 < i7) {
            springBack(i, i2, i5, i6, i7, i8);
        } else {
            fling(i, i2, i3, i4);
        }
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.b = 0;
        throw null;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4) {
        this.b = 1;
        throw null;
    }
}
