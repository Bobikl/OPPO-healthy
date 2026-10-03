package com.heytap.nearx.uikit.widget.slideview;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.core.view.animation.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes18.dex */
public abstract class NearSlideCollapseAnimation extends Animation implements Animation.AnimationListener {
    private static final int ANIM_DURATION = 200;
    private static final float ONT = 1.0f;
    private static final float POINT_133 = 0.133f;
    private static final float POINT_THREE = 0.3f;
    private static final float ZERO = 0.0f;
    int mInitialHeight;
    View mView;

    public NearSlideCollapseAnimation(View view) {
        this.mView = view;
        this.mInitialHeight = view.getMeasuredHeight();
        setInterpolator(PathInterpolatorCompat.create(POINT_133, 0.0f, 0.3f, 1.0f));
        setDuration(200L);
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        if (f == 1.0f) {
            this.mView.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        int i = this.mInitialHeight;
        layoutParams.height = i - ((int) (i * f));
        this.mView.requestLayout();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        onItemDelete();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    public abstract void onItemDelete();

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
