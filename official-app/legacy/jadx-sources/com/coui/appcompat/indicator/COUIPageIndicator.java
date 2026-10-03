package com.coui.appcompat.indicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.PathInterpolator;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.sh2;
import com.support.indicator.R$attr;
import com.support.indicator.R$plurals;
import com.support.indicator.R$string;
import com.support.indicator.R$style;
import com.support.indicator.R$styleable;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPageIndicator extends View {
    public static final PathInterpolator A;
    public static final ArgbEvaluator B;
    public static final boolean z;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f1785j;
    public c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1786l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1787n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;
    public long t;
    public Paint u;
    public Paint v;
    public int w;
    public a x;
    public String y;

    public interface a {
        void onClick(int i);
    }

    public static class b {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1788c = 0.0f;
        public float d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1789e = 0.0f;
        public float f = 0.0f;
        public RectF g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

        public b(int i) {
            this.b = i;
        }

        public void a() {
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "id = " + this.b + " dot = (" + this.d + ", " + this.f1789e + ", " + this.f1788c + ") bounds = " + this.g + " offsetX = " + this.f);
        }

        public RectF b() {
            return this.g;
        }

        public float c() {
            return this.d;
        }

        public float d() {
            return this.f1789e;
        }

        public float e() {
            return this.f1788c;
        }

        public void f(Canvas canvas, Paint paint) {
            paint.setColor(this.a);
            float f = this.d;
            float f2 = this.f1788c;
            float f3 = this.f1789e;
            canvas.drawOval(f - f2, f3 - f2, f + f2, f3 + f2, paint);
        }

        public void g(float f) {
            this.d = f;
            k();
        }

        public void h(float f) {
            this.f1789e = f;
            k();
        }

        public void i(int i) {
            this.a = i;
        }

        public void j(float f) {
            this.f = f;
            k();
        }

        public final void k() {
            RectF rectF = this.g;
            float f = this.f;
            float f2 = this.d;
            float f3 = this.f1788c;
            float f4 = this.f1789e;
            rectF.set((f + f2) - f3, f4 - f3, f + f2 + f3, f4 + f3);
        }
    }

    public class c {
        public int A;
        public final float[] f;
        public final float[] g;
        public final float[] h;
        public View q;
        public int s;
        public float t;
        public float u;
        public float x;
        public SpringAnimation y;
        public final LinkedList<b> a = new LinkedList<>();
        public final int b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Path f1790c = new Path();
        public final RectF d = new RectF();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f1791e = new float[2];
        public final Path i = new Path();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Path f1792j = new Path();
        public final Path k = new Path();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Path f1793l = new Path();
        public final Path m = new Path();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Matrix f1794n = new Matrix();
        public final Matrix o = new Matrix();
        public final FloatPropertyCompat<c> p = new a("currentPosition");
        public int r = 0;
        public float v = 0.0f;
        public float w = 0.0f;
        public boolean z = false;

        public class a extends FloatPropertyCompat<c> {
            public a(String str) {
                super(str);
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public float getValue(c cVar) {
                return cVar.k();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(c cVar, float f) {
                int iFloor = (int) Math.floor(f);
                cVar.v(iFloor, f - iFloor);
            }
        }

        public c(View view) {
            this.q = view;
            this.f = new float[]{0.0f, f, f, f - ((9.0f - fArr[2]) / 2.0f)};
            float[] fArr = {3.0f, 5.0f, 7.0f, 9.0f};
            this.g = fArr;
            this.h = new float[]{COUIPageIndicator.this.f1787n / 2.0f, COUIPageIndicator.this.o / 2.0f, COUIPageIndicator.this.p / 2.0f, 0.0f};
            float f = 0.0f - ((5.0f - fArr[0]) / 2.0f);
            float f2 = f - ((7.0f - fArr[1]) / 2.0f);
            this.x = 0.0f;
            this.u = COUIPageIndicator.this.q * 2.0f;
            q();
        }

        public void e(int i) {
            b bVar = new b(i);
            bVar.i(COUIPageIndicator.this.m);
            bVar.g(COUIPageIndicator.this.f1787n / 2.0f);
            bVar.h(COUIPageIndicator.this.f1787n / 2.0f);
            this.a.add(bVar);
            this.r = this.a.size();
            x(false);
            v(this.s, this.t);
            this.q.requestLayout();
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "addDot: current index = " + this.s + " mCurrentOffset = " + this.t);
            bVar.a();
        }

        public final void f(Canvas canvas) {
            this.f1794n.reset();
            if (COUIPageIndicator.this.p()) {
                this.f1794n.setTranslate(this.f1791e[0] - this.v, 0.0f);
                Matrix matrix = this.f1794n;
                float[] fArr = this.f1791e;
                float f = fArr[0];
                matrix.postRotate(180.0f, f + ((fArr[1] - f) / 2.0f), COUIPageIndicator.this.f1787n / 2.0f);
            } else {
                this.f1794n.setTranslate((-this.f1791e[0]) + this.v, 0.0f);
            }
            canvas.setMatrix(this.f1794n);
            this.f1794n.invert(this.o);
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "draw rect bounds = " + Arrays.toString(this.f1791e) + " horizontalOffset = " + this.v);
        }

        public final void g(Canvas canvas) {
            int i;
            for (b bVar : this.a) {
                int iIndexOf = this.a.indexOf(bVar);
                if (this.t == 0.0f || (iIndexOf != (i = this.s) && iIndexOf - 1 != i)) {
                    float f = bVar.d;
                    float f2 = bVar.f1788c;
                    float f3 = f + f2;
                    float[] fArr = this.f1791e;
                    if (f3 >= fArr[0] && f - f2 <= fArr[1]) {
                        bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "drawDots: dot index = " + iIndexOf + " dot radius = " + bVar.f1788c + " dot location = (" + bVar.d + ", " + bVar.f1789e + ") left = " + this.f1791e[0] + " right = " + this.f1791e[1]);
                        if (iIndexOf == this.s) {
                            bVar.i(COUIPageIndicator.this.f1786l);
                        } else {
                            bVar.i(COUIPageIndicator.this.m);
                        }
                        bVar.f(canvas, COUIPageIndicator.this.u);
                    }
                }
            }
        }

        public final void h(Canvas canvas) {
            float fJ = j();
            if (fJ == 1.0f) {
                COUIPageIndicator.this.v.setColor(COUIPageIndicator.this.f1786l);
                canvas.drawPath(this.i, COUIPageIndicator.this.v);
                return;
            }
            if (this.t <= 0.5f) {
                COUIPageIndicator.this.v.setColor(COUIPageIndicator.this.f1786l);
                canvas.drawPath(this.f1792j, COUIPageIndicator.this.v);
                COUIPageIndicator.this.v.setColor(((Integer) COUIPageIndicator.B.evaluate(fJ, Integer.valueOf(COUIPageIndicator.this.m), Integer.valueOf(COUIPageIndicator.this.f1786l))).intValue());
            } else {
                COUIPageIndicator.this.v.setColor(((Integer) COUIPageIndicator.B.evaluate(fJ, Integer.valueOf(COUIPageIndicator.this.m), Integer.valueOf(COUIPageIndicator.this.f1786l))).intValue());
                canvas.drawPath(this.f1792j, COUIPageIndicator.this.v);
                COUIPageIndicator.this.v.setColor(COUIPageIndicator.this.f1786l);
            }
            canvas.drawPath(this.k, COUIPageIndicator.this.v);
        }

        public int i(float f, float f2) {
            float[] fArr = {f, f2};
            r(fArr);
            float f3 = -1.0f;
            int iIndexOf = -1;
            for (b bVar : this.a) {
                if (bVar.b().contains(fArr[0], fArr[1])) {
                    return this.a.indexOf(bVar);
                }
                float fAbs = COUIPageIndicator.this.p() ? Math.abs(fArr[0] - (bVar.b().centerX() - (bVar.b().width() / 2.0f))) : Math.abs(fArr[0] - bVar.b().centerX());
                if (iIndexOf == -1 || fAbs < f3) {
                    iIndexOf = this.a.indexOf(bVar);
                    f3 = fAbs;
                }
            }
            return iIndexOf;
        }

        public final float j() {
            float f = this.t;
            if (f <= 0.05f) {
                return f / 0.05f;
            }
            if (f >= 0.95f) {
                return (1.0f - f) / 0.05f;
            }
            return 1.0f;
        }

        public float k() {
            return this.s + this.t;
        }

        public int l() {
            return this.r;
        }

        public final float m(int i, float f) {
            if (i == 0) {
                return this.h[i];
            }
            float f2 = this.f[0];
            if (f < f2) {
                if (this.z) {
                    float[] fArr = this.h;
                    float f3 = fArr[i];
                    int i2 = i - 1;
                    float f4 = fArr[i2];
                    float interpolation = COUIPageIndicator.A.getInterpolation(f - this.f[i]);
                    float[] fArr2 = this.f;
                    return Math.max(f3, f4 - (((f4 - f3) * 2.0f) * (1.0f - (interpolation / (fArr2[i2] - fArr2[i])))));
                }
                float[] fArr3 = this.h;
                int i3 = i - 1;
                float f5 = fArr3[i3];
                float f6 = fArr3[i];
                float interpolation2 = (f5 - f6) * 2.0f * COUIPageIndicator.A.getInterpolation(f - this.f[i]);
                float[] fArr4 = this.f;
                return Math.min(f5, f6 + (interpolation2 / (fArr4[i3] - fArr4[i])));
            }
            if (f <= f2 + this.g[0]) {
                return 0.0f;
            }
            if (this.z) {
                float[] fArr5 = this.h;
                int i4 = i - 1;
                float f7 = fArr5[i4];
                float f8 = fArr5[i];
                float interpolation3 = (f7 - f8) * 2.0f * COUIPageIndicator.A.getInterpolation((this.f[i] + this.g[i]) - f);
                float[] fArr6 = this.f;
                float f9 = fArr6[i];
                float[] fArr7 = this.g;
                return Math.min(f7, f8 + (interpolation3 / (((f9 + fArr7[i]) - fArr6[i4]) - fArr7[i4])));
            }
            float[] fArr8 = this.h;
            float f10 = fArr8[i];
            int i5 = i - 1;
            float f11 = fArr8[i5];
            float interpolation4 = COUIPageIndicator.A.getInterpolation((this.f[i] + this.g[i]) - f);
            float[] fArr9 = this.f;
            float f12 = fArr9[i];
            float[] fArr10 = this.g;
            return Math.max(f10, f11 - (((f11 - f10) * 2.0f) * (1.0f - (interpolation4 / (((f12 + fArr10[i]) - fArr9[i5]) - fArr10[i5])))));
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0048  */
        /* JADX WARN: Code duplicated, block: B:17:0x004f  */
        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
        public final float n() {
            float f;
            float interpolation;
            float f2 = this.t;
            if (f2 <= 0.05f || f2 > 0.5f) {
                if (f2 <= 0.5f || f2 >= 0.95f) {
                    f = 0.0f;
                } else {
                    interpolation = COUIPageIndicator.A.getInterpolation(((1.0f - this.t) - 0.05f) / 0.45f);
                }
                if (f < COUIPageIndicator.this.r) {
                    return COUIPageIndicator.this.r;
                }
                if (f > 0.5f - COUIPageIndicator.this.r) {
                    return 0.5f - COUIPageIndicator.this.r;
                }
                return f;
            }
            interpolation = COUIPageIndicator.A.getInterpolation((this.t - 0.05f) / 0.45f);
            f = interpolation / 2.0f;
            if (f < COUIPageIndicator.this.r) {
                return COUIPageIndicator.this.r;
            }
            if (f > 0.5f - COUIPageIndicator.this.r) {
                return 0.5f - COUIPageIndicator.this.r;
            }
            return f;
        }

        public final float o(int i) {
            float f = i - this.x;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f;
                if (i2 >= fArr.length) {
                    return 0.0f;
                }
                float f2 = fArr[i2];
                if (f >= f2 && f <= f2 + this.g[i2]) {
                    float fM = m(i2, f);
                    bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "index, mMaskOffset = " + i + " " + this.x + " level = " + i2 + " dot position = " + f + " size = " + fM + " moving to end = " + this.z);
                    return fM;
                }
                i2++;
            }
        }

        public RectF p() {
            this.d.set(0.0f, 0.0f, Math.min(6, this.r) * (this.u + COUIPageIndicator.this.f1787n), COUIPageIndicator.this.f1787n);
            return this.d;
        }

        public final void q() {
            SpringForce springForce = new SpringForce();
            springForce.setDampingRatio(1.0f);
            springForce.setStiffness(1500.0f);
            SpringAnimation springAnimation = new SpringAnimation(this, this.p);
            this.y = springAnimation;
            springAnimation.setSpring(springForce);
            this.y.setMinimumVisibleChange(0.005f);
        }

        public final void r(float[] fArr) {
            this.o.mapPoints(fArr);
        }

        public void s(Canvas canvas) {
            canvas.save();
            f(canvas);
            g(canvas);
            if (this.t != 0.0f) {
                h(canvas);
            }
            canvas.restore();
        }

        public void t() {
            if (this.a.size() == 0) {
                bj2.c("COUIPageIndicator", "The mDots has no data");
                return;
            }
            this.a.removeLast();
            int size = this.a.size();
            this.r = size;
            if (this.s + this.t > size - 1) {
                this.s = size - 1;
                this.t = 0.0f;
            }
            x(true);
            v(this.s, this.t);
            this.q.requestLayout();
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "removeDot: current index = " + this.s + " currentOffset = " + this.t + " count = " + this.r);
        }

        public void u(int i, float f, boolean z) {
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "setCurrentPosition: position: " + i + " offset: " + f + " animate: " + z);
            if (!z) {
                v(i, f);
            } else {
                this.y.setStartValue(k());
                this.y.animateToFinalPosition(i + f);
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        public final void v(int i, float f) {
            if (i + f > this.r - 1 || i < 0) {
                Log.e("COUIPageIndicator", "Illegal current position");
                return;
            }
            float f2 = this.s + this.t;
            this.s = i;
            this.t = f;
            float f3 = i + f;
            float f4 = this.f[0];
            float f5 = this.g[0];
            float f6 = this.x;
            if (f3 > f4 + f5 + f6) {
                this.z = true;
            } else if (f3 < f4 + f6) {
                this.z = false;
            }
            if (f3 <= f4 + f5 + f6) {
                double d = f3;
                if (d <= ((double) (f4 + f5)) + Math.floor(f6) || f3 >= this.f[0] + this.g[0] + this.x) {
                    float f7 = this.f[0];
                    float f8 = this.x;
                    if (f3 < f7 + f8 || (f3 > f7 + f8 && d < ((double) f7) + Math.ceil(f8))) {
                        float f9 = f3 - this.f[0];
                        float f10 = this.x;
                        this.x = f10 + (f9 - f10);
                    }
                } else {
                    float f11 = (f3 - this.f[0]) - this.g[0];
                    float f12 = this.x;
                    this.x = f12 + (f11 - f12);
                }
            } else {
                float f13 = (f3 - this.f[0]) - this.g[0];
                float f14 = this.x;
                this.x = f14 + (f13 - f14);
            }
            if (f2 > f3 && f2 >= ((double) (this.f[0] + this.g[0])) + Math.floor(this.x) && f3 <= ((double) (this.f[0] + this.g[0])) + Math.floor(this.x)) {
                this.x = (float) Math.floor(this.x);
            } else if (f2 < f3 && f2 <= ((double) this.f[0]) + Math.ceil(this.x) && f3 >= ((double) this.f[0]) + Math.ceil(this.x)) {
                this.x = (float) Math.ceil(this.x);
            }
            this.w = Math.min(this.r - 6, Math.max(0.0f, this.x - 1.0f));
            int i2 = this.r;
            if (i2 < 6) {
                this.w = 0.0f;
            }
            float[] fArr = this.f1791e;
            float f15 = this.w;
            float f16 = this.u;
            float f17 = f15 * f16;
            fArr[0] = f17;
            if (i2 < 6) {
                fArr[1] = f17 + ((f16 + COUIPageIndicator.this.f1787n) * this.r);
            } else {
                if (f15 >= 1.0f && f15 <= i2 - 6) {
                    float[] fArr2 = this.h;
                    fArr[1] = f17 + (f16 * 6.0f) + (fArr2[0] * 2.0f * 4.0f) + (fArr2[1] * 2.0f * 2.0f);
                } else if (f15 < 1.0f) {
                    float[] fArr3 = this.h;
                    float f18 = fArr3[0];
                    float f19 = fArr3[1];
                    float f20 = (f16 * 6.0f) + (f18 * 4.0f * 2.0f) + (f19 * 2.0f) + (fArr3[2] * 2.0f);
                    fArr[1] = f17 + f20 + (((((f16 * 6.0f) + ((f18 * 4.0f) * 2.0f)) + ((f19 * 2.0f) * 2.0f)) - f20) * f15);
                } else if (f15 > i2 - 6) {
                    float[] fArr4 = this.h;
                    float f21 = fArr4[0];
                    float f22 = fArr4[1];
                    float f23 = (f16 * 6.0f) + (f21 * 4.0f * 2.0f) + (f22 * 2.0f) + (fArr4[2] * 2.0f);
                    float f24 = (f16 * 6.0f) + (f21 * 4.0f * 2.0f) + (f22 * 2.0f * 2.0f);
                    fArr[1] = f17 + f24 + ((f23 - f24) * ((f15 - i2) + 6.0f));
                }
                float f25 = COUIPageIndicator.this.f1787n;
                float f26 = this.u;
                float[] fArr5 = this.h;
                this.v = (((f25 + f26) * 6.0f) - (((f26 * 6.0f) + ((fArr5[0] * 4.0f) * 2.0f)) + ((fArr5[1] * 2.0f) * 2.0f))) / 2.0f;
            }
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "setCurrentPosition: mVisibleRectOffset = " + this.w);
            float f27 = this.u / 2.0f;
            for (b bVar : this.a) {
                float fO = o(this.a.indexOf(bVar));
                bVar.f1788c = fO;
                bVar.g(fO + f27);
                f27 += this.u + (bVar.f1788c * 2.0f);
                bVar.j((-this.f1791e[0]) + this.v);
                bVar.a();
            }
            w();
            this.q.invalidate();
        }

        public final void w() {
            if (this.s >= this.a.size() - 1) {
                return;
            }
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "updatePath: mCurrentOffset = " + this.t + " dots size = " + this.a.size());
            b bVar = this.a.get(this.s);
            b bVar2 = this.a.get(this.s + 1);
            float fC = bVar.c();
            float fD = bVar.d();
            float fE = bVar.e();
            float fC2 = bVar2.c();
            float fD2 = bVar2.d();
            float fE2 = bVar2.e();
            float fJ = j();
            float fN = n();
            float f = this.t;
            float f2 = f <= 0.5f ? fN * 2.0f * (this.u + fE2 + fE) : 0.0f;
            float f3 = f > 0.5f ? fN * 2.0f * (this.u + fE2 + fE) : 0.0f;
            float f4 = fC + f2;
            float f5 = 0.5f - fN;
            float f6 = f4 + (fE * f5 * 2.0f);
            float f7 = fE * fE;
            float fSqrt = (float) (((double) fD) - Math.sqrt(f7 - (((((fE * 2.0f) * f5) * 2.0f) * fE) * f5)));
            float f8 = fC2 - f3;
            float f9 = f8 - ((fE2 * f5) * 2.0f);
            float f10 = f3;
            float fSqrt2 = (float) (((double) fD2) - Math.sqrt((fE2 * fE2) - (((((fE2 * 2.0f) * f5) * 2.0f) * fE2) * f5)));
            float f11 = (f6 + f9) / 2.0f;
            float f12 = ((f7 - (((f11 - fC) - f2) * ((f6 - fC) - f2))) / (fSqrt - fD)) + fD;
            float fAsin = (float) ((Math.asin(f5 * 2.0f) * 180.0d) / 3.141592653589793d);
            bj2.b(COUIPageIndicator.z, "COUIPageIndicator", "updatePath: mCurrentOffset = " + this.t + " dots size = " + this.a.size() + " startDot = (" + fC + ", " + fD + ", " + fE + ") endDot = (" + fC2 + ", " + fD2 + ", " + fE2 + ") colorFactor = " + fJ + " moveFactor = " + fN + " mDepartOffset = " + f2 + " mPortOffset = " + f10 + ") control1 = (" + f6 + ", " + fSqrt + ") control2 = (" + f11 + ", " + f12 + ") control3 = (" + f9 + ", " + fSqrt2 + ") snapAngle = " + fAsin);
            this.i.reset();
            float f13 = fC - fE;
            float f14 = fC2 + fE2;
            this.i.addRect(f13, 0.0f, f14, COUIPageIndicator.this.f1787n, Path.Direction.CW);
            this.f1790c.reset();
            this.f1790c.moveTo(f13, 0.0f);
            this.f1790c.lineTo(f14, 0.0f);
            this.f1790c.lineTo(f14, COUIPageIndicator.this.f1787n);
            this.f1790c.lineTo(f13, COUIPageIndicator.this.f1787n);
            this.f1790c.close();
            this.f1793l.reset();
            this.f1793l.moveTo(f13, fD);
            float f15 = fD - fE;
            float f16 = fC + fE;
            float f17 = fE + fD;
            this.f1793l.arcTo(f13, f15, f16, f17, 180.0f, 90.0f, false);
            this.f1793l.lineTo(f4, f15);
            float f18 = f13 + f2;
            float f19 = f16 + f2;
            this.f1793l.arcTo(f18, f15, f19, f17, 270.0f, fAsin, false);
            this.f1793l.quadTo(f11, f12, f9, fSqrt2);
            float f20 = fC2 - fE2;
            float f21 = f20 - f10;
            float f22 = fD2 - fE2;
            float f23 = f14 - f10;
            float f24 = fD2 + fE2;
            this.f1793l.arcTo(f21, f22, f23, f24, 270.0f - fAsin, fAsin, false);
            this.f1793l.lineTo(fC2, f22);
            this.f1793l.arcTo(f20, f22, f14, f24, 270.0f, 90.0f, false);
            this.f1793l.lineTo(f14, 0.0f);
            this.f1793l.lineTo(f13, 0.0f);
            this.f1793l.close();
            this.m.reset();
            this.m.moveTo(f14, fD2);
            this.m.arcTo(f20, f22, f14, f24, 0.0f, 90.0f, false);
            this.m.lineTo(f8, f24);
            this.m.arcTo(f21, f22, f23, f24, 90.0f, fAsin, false);
            this.m.quadTo(f11, (fD2 * 2.0f) - f12, f6, (fD * 2.0f) - fSqrt);
            this.m.arcTo(f18, f15, f19, f17, 90.0f - fAsin, fAsin, false);
            this.m.lineTo(fC, f17);
            this.m.arcTo(f13, f15, f16, f17, 90.0f, 90.0f, false);
            this.m.lineTo(f13, COUIPageIndicator.this.f1787n);
            this.m.lineTo(f14, COUIPageIndicator.this.f1787n);
            this.m.close();
            this.i.op(this.f1793l, Path.Op.DIFFERENCE);
            this.i.op(this.m, Path.Op.DIFFERENCE);
            this.f1792j.reset();
            this.k.reset();
            this.f1792j.addRect(f13, 0.0f, f11 + 0.5f, COUIPageIndicator.this.f1787n, Path.Direction.CW);
            this.k.addRect(f11, 0.0f, f14, COUIPageIndicator.this.f1787n, Path.Direction.CW);
            this.f1792j.op(this.i, Path.Op.INTERSECT);
            this.k.op(this.i, Path.Op.INTERSECT);
        }

        public final void x(boolean z) {
            if (z) {
                if (this.r >= 6) {
                    this.x = Math.max(0.0f, this.x - 1.0f);
                } else {
                    this.x = 0.0f;
                }
            }
            if (this.r < 6) {
                this.g[0] = 5.0f;
            } else {
                this.g[0] = 3.0f;
            }
        }
    }

    static {
        z = bj2.LOG_DEBUG || bj2.e("COUIPageIndicator", 3);
        A = new sh2();
        B = new ArgbEvaluator();
    }

    public COUIPageIndicator(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean callOnClick() {
        a aVar;
        if (this.s && (aVar = this.x) != null) {
            c cVar = this.k;
            float[] fArr = this.f1785j;
            aVar.onClick(cVar.i(fArr[0], fArr[1]));
        }
        invalidate();
        return super.callOnClick();
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        String string = getResources().getString(R$string.indicator_content_description);
        if (!TextUtils.isEmpty(this.y)) {
            string = this.y;
        }
        sb.append(string);
        sb.append(", ");
        int i = this.k.A + 1;
        sb.append(getResources().getQuantityString(this.w, i, Integer.valueOf(i), Integer.valueOf(this.k.a.size()), Integer.valueOf(this.k.a.size())));
        sb.append(", ");
        sb.append(getResources().getString(R$string.indicator_content_end));
        return sb.toString();
    }

    public int getDotsCount() {
        return this.k.l();
    }

    public void m() {
        c cVar = this.k;
        cVar.e(cVar.l());
    }

    public final void n() {
        this.k = new c(this);
    }

    public final void o() {
        Paint paint = new Paint(1);
        this.u = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(this.f1786l);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.k.s(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        RectF rectFP = this.k.p();
        setMeasuredDimension((int) Math.ceil(rectFP.width()), (int) Math.ceil(rectFP.height()));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IndicatorSavedState indicatorSavedState = (IndicatorSavedState) parcelable;
        super.onRestoreInstanceState(indicatorSavedState.getSuperState());
        setDotsCount(indicatorSavedState.mDotsCount);
        float f = indicatorSavedState.mCurrentPosition;
        int i = (int) f;
        u(i, f - i);
        if (z) {
            Log.d("COUIPageIndicator", "onRestoreInstanceState dotsCount = " + indicatorSavedState.mDotsCount + " currentPosition = " + indicatorSavedState.mCurrentPosition);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IndicatorSavedState indicatorSavedState = new IndicatorSavedState(super.onSaveInstanceState());
        indicatorSavedState.mDotsCount = this.k.l();
        indicatorSavedState.mCurrentPosition = this.k.k();
        if (z) {
            Log.d("COUIPageIndicator", "onSaveInstanceState dotsCount = " + indicatorSavedState.mDotsCount + " currentPosition = " + indicatorSavedState.mCurrentPosition);
        }
        return indicatorSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t = System.currentTimeMillis();
        } else if (actionMasked == 1 && System.currentTimeMillis() - this.t <= ViewConfiguration.getTapTimeout()) {
            this.f1785j[0] = motionEvent.getX();
            this.f1785j[1] = motionEvent.getY();
            callOnClick();
        }
        return true;
    }

    public boolean p() {
        return getLayoutDirection() == 1;
    }

    public void q(int i) {
    }

    public void r(int i, float f, int i2) {
        u(i, f);
    }

    public void s(int i) {
        this.k.A = i;
    }

    public void setCurrentPosition(int i) {
        u(i, 0.0f);
    }

    @Deprecated
    public void setDotCornerRadius(int i) {
    }

    @Deprecated
    public void setDotSpacing(int i) {
    }

    @Deprecated
    public void setDotStrokeWidth(int i) {
    }

    public void setDotsCount(int i) {
        int dotsCount = i - getDotsCount();
        for (int i2 = 0; i2 < Math.abs(dotsCount); i2++) {
            if (dotsCount > 0) {
                m();
            } else {
                t();
            }
        }
    }

    public void setIndicatorDescriptionID(int i) {
        try {
            getResources().getQuantityString(this.w, 1, 1, 1, 1);
            this.w = i;
        } catch (Exception e2) {
            bj2.c("COUIPageIndicator", "setIndicatorDescriptionID indicatorDescriptionID error :" + e2.getMessage());
        }
    }

    public void setIsClickable(boolean z2) {
        this.s = z2;
    }

    public void setOnDotClickListener(a aVar) {
        this.x = aVar;
    }

    public void setPageIndicatorDotsColor(int i) {
        this.m = i;
        this.u.setColor(i);
        invalidate();
    }

    public void setStartContentDescription(String str) {
        this.y = str;
    }

    public void setTraceDotColor(int i) {
        this.f1786l = i;
        this.v.setColor(i);
        invalidate();
    }

    public void t() {
        this.k.t();
    }

    public void u(int i, float f) {
        v(i, f, false);
    }

    public void v(int i, float f, boolean z2) {
        this.k.u(i, f, z2);
        invalidate();
    }

    public COUIPageIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiPageIndicatorStyle);
    }

    public COUIPageIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, lh2.j(context) ? R$style.Widget_COUI_COUIPageIndicator_Dark : R$style.Widget_COUI_COUIPageIndicator);
    }

    public static class IndicatorSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<IndicatorSavedState> CREATOR = new a();
        float mCurrentPosition;
        int mDotsCount;

        public class a implements Parcelable.Creator<IndicatorSavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public IndicatorSavedState createFromParcel(Parcel parcel) {
                return new IndicatorSavedState(parcel, IndicatorSavedState.class.getClassLoader());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public IndicatorSavedState[] newArray(int i) {
                return new IndicatorSavedState[i];
            }
        }

        public IndicatorSavedState(Parcel parcel) {
            super(parcel);
            this.mDotsCount = 0;
            this.mCurrentPosition = 0.0f;
            readFromParcel(parcel);
        }

        private void readFromParcel(Parcel parcel) {
            this.mDotsCount = parcel.readInt();
            this.mCurrentPosition = parcel.readFloat();
        }

        public String toString() {
            return "IndicatorSavedState{" + Integer.toHexString(System.identityHashCode(this)) + "mDotsCount = " + this.mDotsCount + " mCurrentPosition = " + this.mCurrentPosition + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mDotsCount);
            parcel.writeFloat(this.mCurrentPosition);
        }

        @RequiresApi(api = 24)
        public IndicatorSavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mDotsCount = 0;
            this.mCurrentPosition = 0.0f;
            readFromParcel(parcel);
        }

        public IndicatorSavedState(Parcelable parcelable) {
            super(parcelable);
            this.mDotsCount = 0;
            this.mCurrentPosition = 0.0f;
        }
    }

    public COUIPageIndicator(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1785j = new float[2];
        this.r = 0.005f;
        this.t = 0L;
        this.w = R$plurals.coui_page_indicator_description;
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.i = attributeSet.getStyleAttribute();
        } else {
            this.i = i;
        }
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPageIndicator, i, i2);
        this.f1786l = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIPageIndicator_traceDotColor, 0);
        this.m = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIPageIndicator_dotColor, 0);
        this.f1787n = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotSize, 0.0f);
        this.o = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotSizeMedium, 0.0f);
        this.p = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotSizeSmall, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotSpacing, 0.0f);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPageIndicator_dotClickable, true);
        typedArrayObtainStyledAttributes.recycle();
        n();
        o();
        setFocusable(false);
    }
}
