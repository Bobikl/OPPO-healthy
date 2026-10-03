package com.coui.appcompat.slideview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class COUIDeleteAnimation implements Animator.AnimatorListener {
    private static final float ONE = 1.0f;
    private static final float POINT_133 = 0.133f;
    private static final float POINT_THREE = 0.3f;
    private static final float ZERO = 0.0f;
    private final AnimatorSet mAnimatorSet;
    public boolean mEnded;
    final float mStartDx;
    final float mStartDy;
    final float mTargetX;
    final float mTargetY;
    public View mView;
    public RecyclerView.ViewHolder mViewHolder;

    public COUIDeleteAnimation(View view, View view2, float f, float f2, float f3, float f4) {
        this.mEnded = false;
        this.mView = view;
        this.mStartDx = f;
        this.mStartDy = f2;
        this.mTargetX = f3;
        this.mTargetY = f4;
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimatorSet = animatorSet;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f3);
        if (view2 != null) {
            animatorSet.play(objectAnimatorOfFloat).with(ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f));
        } else {
            animatorSet.play(objectAnimatorOfFloat);
        }
        animatorSet.setInterpolator(PathInterpolatorCompat.create(POINT_133, 0.0f, 0.3f, 1.0f));
        animatorSet.addListener(this);
    }

    public void cancel() {
        this.mAnimatorSet.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.mEnded = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public void setDuration(long j2) {
        this.mAnimatorSet.setDuration(j2);
    }

    public void start() {
        RecyclerView.ViewHolder viewHolder = this.mViewHolder;
        if (viewHolder != null) {
            viewHolder.setIsRecyclable(false);
        }
        this.mAnimatorSet.start();
    }

    public COUIDeleteAnimation(RecyclerView.ViewHolder viewHolder, float f, float f2, float f3, float f4) {
        this.mEnded = false;
        this.mViewHolder = viewHolder;
        this.mStartDx = f;
        this.mStartDy = f2;
        this.mTargetX = f3;
        this.mTargetY = f4;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewHolder.itemView, "translationX", 0.0f, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimatorSet = animatorSet;
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setInterpolator(PathInterpolatorCompat.create(POINT_133, 0.0f, 0.3f, 1.0f));
        animatorSet.addListener(this);
    }

    public COUIDeleteAnimation(View view, float f, float f2, float f3, float f4) {
        this(view, null, f, f2, f3, f4);
    }
}
