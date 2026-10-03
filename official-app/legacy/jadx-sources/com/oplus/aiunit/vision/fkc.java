package com.oplus.aiunit.vision;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import androidx.core.view.animation.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes15.dex */
public class fkc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f11411c = 100;
    public static float d = 0.95f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static float f11412e = 1.0f;
    public static float f = 600.0f;
    public static float g = 0.07f;
    public static float h = 0.35f;
    public static float i = 0.1f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f11413j = 156;
    public static Interpolator k = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
    public ValueAnimator a;
    public float b;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float i;

        public a(float f) {
            this.i = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            fkc.this.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = fkc.this.b;
            float f2 = this.i;
            if (f >= f2) {
                fkc.this.b = f2;
            }
        }
    }

    public class b extends ze2 {
        public final /* synthetic */ ValueAnimator i;

        public b(ValueAnimator valueAnimator) {
            this.i = valueAnimator;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.i.start();
        }
    }

    public final void c(View view, float f2) {
        view.clearAnimation();
        view.startAnimation(h(view, f2));
    }

    public final void d(View view, ValueAnimator valueAnimator) {
        view.clearAnimation();
        ScaleAnimation scaleAnimationF = f(view);
        scaleAnimationF.setAnimationListener(new b(valueAnimator));
        view.startAnimation(scaleAnimationF);
    }

    public final void e() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.a.cancel();
    }

    public ScaleAnimation f(View view) {
        if (view == null) {
            throw new NullPointerException("The given view is empty. Please provide a valid view.");
        }
        float f2 = f11412e;
        float f3 = d;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        scaleAnimation.setDuration(f11411c);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(k);
        return scaleAnimation;
    }

    public ValueAnimator g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11412e, d);
        valueAnimatorOfFloat.setDuration(f11411c);
        valueAnimatorOfFloat.setInterpolator(k);
        return valueAnimatorOfFloat;
    }

    public ScaleAnimation h(View view, float f2) {
        if (view == null) {
            throw new NullPointerException("The given view is empty. Please provide a valid view.");
        }
        float f3 = f11412e;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        scaleAnimation.setDuration(f11411c);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(k);
        return scaleAnimation;
    }

    public float i(View view) {
        float f2;
        float f3;
        float f4;
        if (view == null) {
            throw new NullPointerException("The given view is empty. Please provide a valid view.");
        }
        if (view.getHeight() >= f) {
            f2 = f11412e;
            f3 = f2 - d;
            f4 = g;
        } else if (view.getHeight() >= f11413j) {
            f2 = f11412e;
            f3 = f2 - d;
            f4 = h;
        } else {
            f2 = f11412e;
            f3 = f2 - d;
            f4 = i;
        }
        return f2 - (f3 * f4);
    }

    public final void j(View view) {
        float fI = i(view);
        ValueAnimator valueAnimatorG = g();
        this.a = valueAnimatorG;
        valueAnimatorG.addUpdateListener(new a(fI));
    }

    public void k(View view) {
        e();
        c(view, this.b);
    }

    public void l(View view) {
        e();
        j(view);
        d(view, this.a);
    }

    public void m(View view) {
        e();
        c(view, this.b);
    }
}
