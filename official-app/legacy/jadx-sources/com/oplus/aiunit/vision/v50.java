package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes19.dex */
public class v50 {
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_HALF = 0.5f;
    public static final float ALPHA_TRANSPARENT = 0.0f;
    public static final int ANIMATION_DURATION = 180;
    public static final float INTERPOLATOR_END = 0.67f;
    public static final float INTERPOLATOR_START = 0.33f;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ View f17709j;

        public a(float f, View view) {
            this.i = f;
            this.f17709j = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f = this.i;
            if (f == 0.0f) {
                this.f17709j.setVisibility(4);
            } else {
                this.f17709j.setAlpha(f);
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View i;

        public b(View view) {
            this.i = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.i.setVisibility(4);
            this.i.setClickable(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.i.setClickable(false);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ View i;

        public c(View view) {
            this.i = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.i.setClickable(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.i.setClickable(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.i.setClickable(false);
            this.i.setVisibility(0);
        }
    }

    public static void a(View view, float f, float f2) {
        b(view, f, f2, 180);
    }

    public static void b(View view, float f, float f2, int i) {
        c(view, f, f2, i, new a(f2, view));
    }

    public static void c(View view, float f, float f2, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public static void d(View view) {
        if (!view.isClickable()) {
            ltl.a("AnimationUtils", "view.isClickable false, return");
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 1.0f, 0.67f, 1.0f));
        objectAnimatorOfFloat.setDuration(180L);
        objectAnimatorOfFloat.addListener(new c(view));
        objectAnimatorOfFloat.start();
    }

    public static void e(View view) {
        if (!view.isClickable()) {
            ltl.a("AnimationUtils", "view.isClickable false, return");
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
        objectAnimatorOfFloat.setDuration(180L);
        objectAnimatorOfFloat.addListener(new b(view));
        objectAnimatorOfFloat.start();
    }
}
