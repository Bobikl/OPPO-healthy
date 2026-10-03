package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.core.view.animation.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes19.dex */
public class qv2 {
    public static final Interpolator a = PathInterpolatorCompat.create(0.25f, 0.1f, 0.1f, 1.0f);

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ View f15958j;

        public a(ImageView imageView, View view) {
            this.i = imageView;
            this.f15958j = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f15958j;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ImageView imageView = this.i;
            if (imageView != null) {
                this.i.setCameraDistance(imageView.getContext().getResources().getDisplayMetrics().density * 16000.0f);
            }
        }
    }

    public static class b implements View.OnTouchListener {
        public long i = 0;

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (System.currentTimeMillis() - this.i < 1000) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                qv2.c(view);
                return false;
            }
            if (action != 1) {
                return false;
            }
            this.i = System.currentTimeMillis();
            qv2.d(view, new a());
            return false;
        }
    }

    public static void a(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.6f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.2f, 1.0f, 0.2f, 1.0f, 0.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).before(objectAnimatorOfFloat3);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public static Animator b(ImageView imageView, float... fArr) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "scaleY", fArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", fArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(255L);
        return animatorSet;
    }

    public static void c(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.9f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.9f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.6f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(50L);
        animatorSet.start();
    }

    public static void d(View view, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.9f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.9f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.6f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(50L);
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }

    public static void e(View view, ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
        view.setVisibility(0);
        Animator animatorB = b(imageView, 0.9f, 1.0f);
        Animator animatorB2 = b(imageView, 1.0f, 0.9f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorB).after(340L).after(animatorB2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "rotationY", 0.0f, 180.0f);
        objectAnimatorOfFloat.setDuration(850L);
        objectAnimatorOfFloat.setInterpolator(a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, animatorSet);
        animatorSet2.addListener(new a(imageView, view));
        animatorSet2.start();
    }
}
