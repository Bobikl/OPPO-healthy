package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.health.watchface.R$anim;

/* JADX INFO: loaded from: classes19.dex */
public class y50 {
    public static final Interpolator a = PathInterpolatorCompat.create(0.21f, 0.0f, 0.36f, 1.0f);

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ LottieAnimationView i;

        public a(LottieAnimationView lottieAnimationView) {
            this.i = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.i.setMinAndMaxFrame(61, 120);
            this.i.loop(true);
            this.i.playAnimation();
        }
    }

    public static void a(View view, float f) {
        c(view, f, null);
    }

    public static void b(View view, float f, long j2, long j3, Animator.AnimatorListener animatorListener) {
        view.animate().alpha(f).setInterpolator(a).setStartDelay(j2).setDuration(j3).setListener(animatorListener).start();
    }

    public static void c(View view, float f, Animator.AnimatorListener animatorListener) {
        b(view, f, 134L, 533L, animatorListener);
    }

    public static void d(View view, float f, Animator.AnimatorListener animatorListener) {
        view.animate().alpha(f).setInterpolator(a).setStartDelay(0L).setDuration(300L).setListener(animatorListener).start();
    }

    public static void e(float f, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, f);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat.addListener(animatorListener);
        valueAnimatorOfFloat.setStartDelay(134L);
        valueAnimatorOfFloat.setDuration(533L);
        valueAnimatorOfFloat.setInterpolator(a);
        valueAnimatorOfFloat.start();
    }

    public static void f(LottieAnimationView lottieAnimationView) {
        k(lottieAnimationView);
        lottieAnimationView.setMinAndMaxFrame(0, 60);
        lottieAnimationView.playAnimation();
        lottieAnimationView.addAnimatorListener(new a(lottieAnimationView));
    }

    public static void g(View view, float f) {
        view.animate().alpha(f).setInterpolator(a).setStartDelay(134L).setDuration(177L).setListener(null).start();
    }

    public static void h(Context context, RecyclerView recyclerView) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R$anim.anim_select_item_enter);
        if (animationLoadAnimation == null) {
            ltl.i("AnimatorHelper", "[recyclerViewEnterAnim] --> animation = null and not animate");
            return;
        }
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animationLoadAnimation, 0.0f);
        layoutAnimationController.setOrder(0);
        animationLoadAnimation.setInterpolator(a);
        layoutAnimationController.setDelay(0.061913695f);
        animationLoadAnimation.setStartOffset(134L);
        animationLoadAnimation.setDuration(533L);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        animationLoadAnimation.start();
    }

    public static void i(Context context, RecyclerView recyclerView) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R$anim.anim_select_item_exit);
        if (animationLoadAnimation == null) {
            ltl.i("AnimatorHelper", "[recyclerViewEnterAnim] --> animation = null and not animate");
            return;
        }
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animationLoadAnimation, 0.0f);
        layoutAnimationController.setOrder(1);
        animationLoadAnimation.setInterpolator(a);
        layoutAnimationController.setDelay(0.061913695f);
        animationLoadAnimation.setStartOffset(134L);
        animationLoadAnimation.setDuration(533L);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.startLayoutAnimation();
    }

    public static void j(View view, float f, Animator.AnimatorListener animatorListener) {
        view.animate().scaleX(f).scaleY(f).setInterpolator(a).setStartDelay(134L).setDuration(533L).setListener(animatorListener).start();
    }

    public static void k(LottieAnimationView lottieAnimationView) {
        if (lottieAnimationView.isAnimating()) {
            lottieAnimationView.cancelAnimation();
        }
    }

    public static void l(View view, float f, float f2, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "TranslationY", f, f2);
        objectAnimatorOfFloat.setInterpolator(a);
        objectAnimatorOfFloat.setStartDelay(134L);
        objectAnimatorOfFloat.setDuration(533L);
        objectAnimatorOfFloat.addListener(animatorListener);
        objectAnimatorOfFloat.start();
    }
}
