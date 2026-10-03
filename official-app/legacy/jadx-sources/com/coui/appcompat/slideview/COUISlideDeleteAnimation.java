package com.coui.appcompat.slideview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUISlideDeleteAnimation {
    private static final int ANIMATION_DELAY = 10;
    private static final int ITEM_VIEW_DURATION = 400;
    private static final float ONE = 1.0f;
    private static final float POINT_ONE = 0.1f;
    private static final float POINT_THREE = 0.3f;
    private static final int SLIDE_VIEW_DURATION = 330;
    private static final float ZERO = 0.0f;
    private AnimatorSet mAnimatorSet;
    private ObjectAnimator mItemViewAnimator;
    private View mSlideView;
    private ValueAnimator mSlideViewAnimator;
    private ViewWrapper mWrapper;

    public static class ViewWrapper {
        View mTarget;

        public ViewWrapper(View view) {
            this.mTarget = view;
        }

        public int getHeight() {
            return this.mTarget.getLayoutParams().height;
        }

        public void setHeight(int i) {
            this.mTarget.getLayoutParams().height = i;
            this.mTarget.requestLayout();
        }
    }

    public COUISlideDeleteAnimation(View view, View view2, int i, int i2, int i3, int i4) {
        this.mSlideView = view;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.mSlideViewAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(330L);
        this.mSlideViewAnimator.setInterpolator(PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f));
        this.mSlideViewAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.slideview.COUISlideDeleteAnimation.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                COUISlideDeleteAnimation.this.mSlideView.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        });
        ViewWrapper viewWrapper = new ViewWrapper(this.mSlideView);
        this.mWrapper = viewWrapper;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(viewWrapper, Fields.HEIGHT_FIELD, i3, i4);
        this.mItemViewAnimator = objectAnimatorOfInt;
        objectAnimatorOfInt.setInterpolator(PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f));
        this.mItemViewAnimator.setDuration(400L);
        this.mItemViewAnimator.setStartDelay(10L);
        this.mItemViewAnimator.addListener(new Animator.AnimatorListener() { // from class: com.coui.appcompat.slideview.COUISlideDeleteAnimation.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                COUISlideDeleteAnimation.this.itemViewDelete();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimatorSet = animatorSet;
        animatorSet.play(this.mSlideViewAnimator).with(this.mItemViewAnimator);
    }

    public abstract void itemViewDelete();

    public void startAnimation() {
        this.mAnimatorSet.start();
    }
}
