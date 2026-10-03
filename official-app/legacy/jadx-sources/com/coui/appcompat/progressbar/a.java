package com.coui.appcompat.progressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.nj2;
import com.oplus.aiunit.vision.ti2;
import com.oplus.aiunit.vision.vi2;
import com.support.progressbar.R$color;
import com.support.progressbar.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class a extends Drawable {
    public static final Interpolator W = new vi2();
    public static final Interpolator X = new ti2();
    public static final Interpolator Y = new nj2();
    public static final Interpolator Z = new hj2();
    public static final ArgbEvaluator a0 = new ArgbEvaluator();
    public static final FloatPropertyCompat<a> b0 = new C0207a("visualProgress");
    public float A;
    public float B;
    public float C;
    public float D;
    public View E;
    public Paint G;
    public Paint H;
    public Paint I;
    public SpringAnimation J;
    public AnimatorSet K;
    public AnimatorSet L;
    public AnimatorSet M;
    public AnimatorSet N;
    public ValueAnimator O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public ValueAnimator T;
    public ValueAnimator U;
    public ValueAnimator V;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1973e;
    public h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f1974j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1975l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1976n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    @IntRange(from = 0, to = 255)
    public int a = 255;
    public int b = 255;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1972c = 100;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public boolean F = false;

    /* JADX INFO: renamed from: com.coui.appcompat.progressbar.a$a, reason: collision with other inner class name */
    public class C0207a extends FloatPropertyCompat<a> {
        public C0207a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(a aVar) {
            return aVar.r();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(a aVar, float f) {
            aVar.W(f);
            aVar.K();
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.F = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.F = false;
            a.m(a.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.F = true;
            a.m(a.this);
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.F = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.F = false;
            a.m(a.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.F = true;
            a.m(a.this);
        }
    }

    public class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.F = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.F = false;
            a.m(a.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.F = true;
            a.m(a.this);
        }
    }

    public class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.F = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.F = false;
            a.m(a.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.F = true;
            a.m(a.this);
        }
    }

    public interface f {
    }

    public interface g {
    }

    public static class h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1978e;
        public float f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1979j;
        public int k;
        public float g = Float.MIN_VALUE;
        public float h = Float.MIN_VALUE;
        public float a = 0.0f;
        public float b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1977c = 0.0f;
        public float d = 0.0f;
        public int i = 0;

        public int a() {
            return this.f1979j;
        }

        public float b() {
            return this.a;
        }

        public float c() {
            return this.b;
        }

        public int d() {
            return this.i;
        }

        public float e() {
            return this.f;
        }

        public float f() {
            return this.f1978e;
        }

        public int g() {
            return this.k;
        }

        public float h() {
            return this.h == Float.MIN_VALUE ? this.d : this.g;
        }

        public float i() {
            float f = this.h;
            return f == Float.MIN_VALUE ? this.f1977c : f;
        }

        public float j() {
            return this.d;
        }

        public float k() {
            return this.f1977c;
        }

        public void l(int i) {
            this.f1979j = i;
        }

        public void m(float f) {
            this.a = f;
        }

        public void n(float f) {
            this.b = f;
        }

        public void o(int i) {
            this.i = i;
            this.f1979j = i;
        }

        public void p(float f) {
            if (f < 0.0f) {
                Log.w("COUICircularDrawable", "Progress bar outer diameter should be greater than 0 !");
            }
            this.f = Math.max(0.0f, f);
        }

        public void q(float f) {
            if (f < 0.0f) {
                Log.w("COUICircularDrawable", "Progress bar stroke width should be greater than 0 !");
            }
            this.f1978e = Math.max(0.0f, f);
        }

        public void r(int i) {
            this.k = i;
        }

        public void s(float f) {
            if (f < 0.0f) {
                Log.w("COUICircularDrawable", "Progress bar outer diameter should be greater than 0 !");
            }
            this.g = Math.max(0.0f, f);
        }

        public void t(float f) {
            if (f < 0.0f) {
                Log.w("COUICircularDrawable", "Progress bar stroke width should be greater than 0 !");
            }
            this.h = Math.max(0.0f, f);
        }

        public void u(float f) {
            if (f < 0.0f) {
                Log.w("COUICircularDrawable", "Progress bar outer diameter should be greater than 0 !");
            }
            this.d = Math.max(0.0f, f);
        }

        public void v(float f) {
            if (f < 0.0f) {
                Log.w("COUICircularDrawable", "Progress bar stroke width should be greater than 0 !");
            }
            this.f1977c = Math.max(0.0f, f);
        }
    }

    public a(Context context) {
        t(context);
        v();
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = 1.0f - animatedFraction;
        float fH = this.f1974j.h() + ((this.f1974j.j() - this.f1974j.h()) * f2);
        float fH2 = this.i.h() + ((this.i.j() - this.i.h()) * f2);
        float fI = this.f1974j.i() + ((this.f1974j.k() - this.f1974j.i()) * f2);
        float fI2 = this.i.i() + (f2 * (this.i.k() - this.i.i()));
        ArgbEvaluator argbEvaluator = a0;
        int iIntValue = ((Integer) argbEvaluator.evaluate(animatedFraction, Integer.valueOf(this.i.d()), Integer.valueOf(this.i.g()))).intValue();
        int iIntValue2 = ((Integer) argbEvaluator.evaluate(animatedFraction, Integer.valueOf(this.f1974j.d()), Integer.valueOf(this.f1974j.g()))).intValue();
        this.f1974j.p(fH);
        this.f1974j.q(fI);
        this.f1974j.l(iIntValue2);
        this.i.p(fH2);
        this.i.q(fI2);
        this.i.l(iIntValue);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.r = (0.3f * animatedFraction) + 0.7f;
        this.g = (int) (animatedFraction * 255.0f);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(ValueAnimator valueAnimator) {
        this.b = (int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f = (int) (255.0f * animatedFraction);
        this.q = (animatedFraction * 0.3f) + 0.7f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fH = this.f1974j.h() + ((this.f1974j.j() - this.f1974j.h()) * animatedFraction);
        float fH2 = this.i.h() + ((this.i.j() - this.i.h()) * animatedFraction);
        float fI = this.f1974j.i() + ((this.f1974j.k() - this.f1974j.i()) * animatedFraction);
        float fI2 = this.i.i() + ((this.i.k() - this.i.i()) * animatedFraction);
        ArgbEvaluator argbEvaluator = a0;
        int iIntValue = ((Integer) argbEvaluator.evaluate(animatedFraction, Integer.valueOf(this.i.g()), Integer.valueOf(this.i.d()))).intValue();
        int iIntValue2 = ((Integer) argbEvaluator.evaluate(animatedFraction, Integer.valueOf(this.f1974j.g()), Integer.valueOf(this.f1974j.d()))).intValue();
        this.f1974j.p(fH);
        this.f1974j.q(fI);
        this.f1974j.l(iIntValue2);
        this.i.p(fH2);
        this.i.q(fI2);
        this.i.l(iIntValue);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        this.r = (0.3f * animatedFraction) + 0.7f;
        this.g = (int) (animatedFraction * 255.0f);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(ValueAnimator valueAnimator) {
        this.b = (int) (valueAnimator.getAnimatedFraction() * 255.0f);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(ValueAnimator valueAnimator) {
        this.f = (int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f);
        this.q = 1.0f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(DynamicAnimation dynamicAnimation, float f2, float f3) {
        invalidateSelf();
    }

    public static /* synthetic */ g m(a aVar) {
        aVar.getClass();
        return null;
    }

    public final void J() {
    }

    public final void K() {
    }

    public void L() {
        this.E = null;
    }

    public void M(int i) {
        this.f1973e = i;
        this.i.r(i);
        this.f1974j.r(i);
    }

    public void N(View view) {
        this.E = view;
    }

    public void O(boolean z) {
        if (z) {
            this.G.setShadowLayer(this.B, this.C, this.D, this.h);
            this.I.setShadowLayer(this.B, this.C, this.D, this.h);
        } else {
            this.G.clearShadowLayer();
            this.I.clearShadowLayer();
        }
    }

    public void P(int i) {
        if (i < 0) {
            Log.w("COUICircularDrawable", "Max value should not lesser than 0!");
            i = 0;
        }
        if (i != this.f1972c) {
            if (i < this.f1975l) {
                this.f1975l = i;
                this.k = i;
            }
            this.f1972c = i;
        }
        invalidateSelf();
    }

    public void Q(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004c  */
    public void R(int i, boolean z) {
        Log.d("COUICircularDrawable", "setProgress: " + i + "\nmActualProgress = " + this.f1975l + "\nmVisualProgress = " + this.k + "\nanimate = " + z);
        this.f1975l = i;
        float fN = n((float) i);
        if (z) {
            float f2 = this.k;
            if (f2 != fN) {
                this.J.setStartValue(f2);
                this.J.animateToFinalPosition(fN);
            } else {
                this.k = fN;
                K();
                invalidateSelf();
            }
        } else {
            this.k = fN;
            K();
            invalidateSelf();
        }
        J();
    }

    public void S(float f2, float f3) {
        this.f1974j.s(f2);
        this.f1974j.t(f3);
        this.i.s(f2);
        this.i.t(f3);
    }

    public void T(int i) {
        this.f1974j.o(i);
        invalidateSelf();
    }

    public void U(float f2, float f3, float f4, float f5) {
        this.m = f2;
        this.f1976n = f3;
        this.o = f4;
        this.p = f5;
        this.i.m(f2);
        this.i.n(this.f1976n);
        this.i.u(this.o);
        this.i.v(this.p);
        this.i.p(this.o);
        this.i.q(this.p);
        this.f1974j.m(this.m);
        this.f1974j.n(this.f1976n);
        this.f1974j.u(this.o);
        this.f1974j.v(this.p);
        this.f1974j.p(this.o);
        this.f1974j.q(this.p);
        this.G.setStrokeWidth(this.i.k());
        this.H.setStrokeWidth(this.f1974j.k());
    }

    public void V(int i) {
        this.i.o(i);
        invalidateSelf();
    }

    public final void W(float f2) {
        this.k = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.G.setColor(this.i.a());
        this.G.setStrokeWidth(this.i.f());
        this.H.setColor(this.f1974j.a());
        this.H.setStrokeWidth(this.f1974j.f());
        canvas.saveLayerAlpha(0.0f, 0.0f, this.m * 2.0f, this.f1976n * 2.0f, this.a);
        q(canvas);
        p(canvas);
        o(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        View view = this.E;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float n(float f2) {
        int i = this.f1972c;
        return (((int) ((f2 * 100.0f) / i)) / 100.0f) * i;
    }

    public final void o(Canvas canvas) {
        int i = this.g;
        if (i != 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.m * 2.0f, this.f1976n * 2.0f, i);
            float f2 = this.r;
            canvas.scale(f2, f2, this.m, this.f1976n);
            this.I.setColor(this.f1973e);
            float f3 = this.m;
            float f4 = this.w;
            float f5 = this.f1976n;
            float f6 = this.y;
            canvas.drawRect(f3 - (f4 / 2.0f), f5 - f6, f3 + (f4 / 2.0f), (f5 - f6) + this.x, this.I);
            canvas.drawCircle(this.m, this.f1976n + this.A, this.z, this.I);
            canvas.restore();
        }
    }

    public final void p(Canvas canvas) {
        int i = this.f;
        if (i != 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.m * 2.0f, this.f1976n * 2.0f, i);
            float f2 = this.q;
            canvas.scale(f2, f2, this.m, this.f1976n);
            this.I.setColor(this.d);
            float f3 = this.m;
            float f4 = f3 - this.s;
            float f5 = this.v;
            float f6 = f4 - (f5 / 2.0f);
            float f7 = this.f1976n;
            float f8 = this.t;
            float f9 = this.u;
            canvas.drawRoundRect(f6, f7 - (f8 / 2.0f), f3 - (f5 / 2.0f), f7 + (f8 / 2.0f), f9, f9, this.I);
            float f10 = this.m;
            float f11 = this.v;
            float f12 = this.f1976n;
            float f13 = this.t;
            float f14 = this.u;
            canvas.drawRoundRect(f10 + (f11 / 2.0f), f12 - (f13 / 2.0f), f10 + this.s + (f11 / 2.0f), f12 + (f13 / 2.0f), f14, f14, this.I);
            canvas.restore();
        }
    }

    public final void q(Canvas canvas) {
        float fE = (this.i.e() - this.i.f()) / 2.0f;
        float fE2 = (this.f1974j.e() - this.f1974j.f()) / 2.0f;
        int i = this.b;
        if (i != 255) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.m * 2.0f, this.f1976n * 2.0f, i);
        } else {
            canvas.save();
        }
        canvas.drawCircle(this.m, this.f1976n, fE, this.G);
        canvas.rotate(-90.0f, this.m, this.f1976n);
        canvas.drawArc(this.f1974j.b() - fE2, this.f1974j.c() - fE2, this.f1974j.b() + fE2, this.f1974j.c() + fE2, 0.0f, Math.max(1.0E-4f, (this.k * 360.0f) / this.f1972c), false, this.H);
        canvas.restore();
    }

    public float r() {
        return this.k;
    }

    public final void s() {
        z();
        w();
        y();
        u();
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.a = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        invalidateSelf();
    }

    public void setOnProgressChangedListener(f fVar) {
    }

    public void setOnProgressStateAnimatorListener(g gVar) {
    }

    public final void t(Context context) {
        this.s = context.getResources().getDimension(R$dimen.coui_circular_progress_pause_icon_rect_width);
        this.t = context.getResources().getDimension(R$dimen.coui_circular_progress_pause_icon_rect_height);
        this.u = context.getResources().getDimension(R$dimen.coui_circular_progress_pause_icon_rect_radius);
        this.v = context.getResources().getDimension(R$dimen.coui_circular_progress_pause_icon_rect_gap);
        this.w = context.getResources().getDimension(R$dimen.coui_circular_progress_error_icon_rect_width);
        this.x = context.getResources().getDimension(R$dimen.coui_circular_progress_error_icon_rect_height);
        this.y = context.getResources().getDimension(R$dimen.coui_circular_progress_error_icon_rect_bias);
        this.z = context.getResources().getDimension(R$dimen.coui_circular_progress_error_icon_circle_radius);
        this.A = context.getResources().getDimension(R$dimen.coui_circular_progress_error_icon_circle_bias);
        this.B = context.getResources().getDimension(R$dimen.coui_circular_progress_shadow_radius);
        this.C = context.getResources().getDimension(R$dimen.coui_circular_progress_shadow_x_bias);
        this.D = context.getResources().getDimension(R$dimen.coui_circular_progress_shadow_y_bias);
        this.h = ResourcesCompat.getColor(context.getResources(), R$color.coui_circular_progress_shadow_color, context.getTheme());
    }

    public final void u() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(350L);
        ValueAnimator valueAnimator = this.S;
        Interpolator interpolator = Z;
        valueAnimator.setInterpolator(interpolator);
        this.S.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ah2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.i.A(valueAnimator2);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.U = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(350L);
        this.U.setInterpolator(interpolator);
        this.U.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.bh2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.i.B(valueAnimator2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.M = animatorSet;
        animatorSet.playTogether(this.U, this.S);
        this.M.addListener(new d());
    }

    public final void v() {
        Paint paint = new Paint(1);
        this.G = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.i = new h();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.H.setStyle(Paint.Style.STROKE);
        this.H.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f1974j = new h();
        Paint paint3 = new Paint(1);
        this.I = paint3;
        paint3.setStyle(Paint.Style.FILL);
    }

    public final void w() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.O.setInterpolator(W);
        this.O.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.yg2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.C(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.P = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setStartDelay(200L);
        this.P.setDuration(300L);
        this.P.setInterpolator(X);
        this.P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.zg2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.D(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.K = animatorSet;
        animatorSet.playTogether(this.P, this.O);
        this.K.addListener(new b());
    }

    public final void x() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(350L);
        ValueAnimator valueAnimator = this.T;
        Interpolator interpolator = Z;
        valueAnimator.setInterpolator(interpolator);
        this.T.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ch2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.i.E(valueAnimator2);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(350L);
        this.V.setInterpolator(interpolator);
        this.V.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.dh2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.i.F(valueAnimator2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.N = animatorSet;
        animatorSet.playTogether(this.V, this.T);
        this.N.addListener(new e());
    }

    public final void y() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setStartDelay(200L);
        this.Q.setDuration(200L);
        this.Q.setInterpolator(Y);
        this.Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.vg2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.G(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(200L);
        this.R.setInterpolator(W);
        this.R.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.wg2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.H(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.L = animatorSet;
        animatorSet.playTogether(this.Q, this.R);
        this.L.addListener(new c());
    }

    public final void z() {
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, b0);
        this.J = springAnimation;
        springAnimation.setSpring(springForce);
        this.J.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: com.oplus.aiunit.vision.xg2
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                this.i.I(dynamicAnimation, f2, f3);
            }
        });
    }
}
