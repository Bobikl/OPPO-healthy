package com.heytap.nearx.uikit.widget.preference;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.widget.NearCheckedLinearLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearListSelectedItemLayout extends NearCheckedLinearLayout {
    protected static final int APPEAR_DURATION = 150;
    protected static final int DISAPPEAR_DURATION = 367;
    protected static final int STATE_BACKGROUND_APPEAR = 1;
    protected static final int STATE_BACKGROUND_DISAPPEAR = 2;
    protected Interpolator mAppearInterpolator;
    private boolean mBackgroundAnimationEnabled;
    protected ValueAnimator mBackgroundAppearAnimator;
    protected ValueAnimator mBackgroundDisappearAnimator;
    private Drawable mBackgroundDrawable;
    protected Interpolator mDisappearInterpolator;
    protected boolean mNeedAutoStartDisAppear;
    protected int mState;

    public NearListSelectedItemLayout(Context context) {
        this(context, null);
    }

    public void initAnimation(Context context) {
        if (this.mBackgroundDrawable == null) {
            ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(R$color.nx_list_color_pressed));
            this.mBackgroundDrawable = colorDrawable;
            colorDrawable.setAlpha(0);
            setBackground(this.mBackgroundDrawable);
        }
        int iAlpha = Color.alpha(context.getResources().getColor(R$color.nx_list_selector_color_pressed));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iAlpha);
        this.mBackgroundAppearAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(150L);
        this.mBackgroundAppearAnimator.setInterpolator(this.mAppearInterpolator);
        this.mBackgroundAppearAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearListSelectedItemLayout.this.mBackgroundDrawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                NearListSelectedItemLayout nearListSelectedItemLayout = NearListSelectedItemLayout.this;
                nearListSelectedItemLayout.setBackground(nearListSelectedItemLayout.mBackgroundDrawable);
                NearListSelectedItemLayout.this.invalidate();
            }
        });
        this.mBackgroundAppearAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearListSelectedItemLayout nearListSelectedItemLayout = NearListSelectedItemLayout.this;
                nearListSelectedItemLayout.mState = 1;
                if (nearListSelectedItemLayout.mNeedAutoStartDisAppear) {
                    nearListSelectedItemLayout.mNeedAutoStartDisAppear = false;
                    nearListSelectedItemLayout.mBackgroundDisappearAnimator.start();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iAlpha, 0);
        this.mBackgroundDisappearAnimator = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(367L);
        this.mBackgroundDisappearAnimator.setInterpolator(this.mDisappearInterpolator);
        this.mBackgroundDisappearAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearListSelectedItemLayout.this.mBackgroundDrawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                NearListSelectedItemLayout nearListSelectedItemLayout = NearListSelectedItemLayout.this;
                nearListSelectedItemLayout.setBackground(nearListSelectedItemLayout.mBackgroundDrawable);
                NearListSelectedItemLayout.this.invalidate();
            }
        });
        this.mBackgroundDisappearAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearListSelectedItemLayout.this.mState = 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        initAnimation(getContext());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && isClickable() && this.mBackgroundAnimationEnabled) {
            int action = motionEvent.getAction();
            if (action == 0) {
                startAppearAnimation();
            } else if (action == 1 || action == 3) {
                startDisAppearAnimationOrNot();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundAnimationDrawable(Drawable drawable) {
        this.mBackgroundDrawable = drawable;
    }

    public void setBackgroundAnimationEnabled(boolean z) {
        this.mBackgroundAnimationEnabled = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!z && isEnabled()) {
            startDisAppearAnimationOrNot();
        }
        super.setEnabled(z);
    }

    public void startAppearAnimation() {
        if (this.mBackgroundDisappearAnimator.isRunning()) {
            this.mBackgroundDisappearAnimator.cancel();
        }
        if (this.mBackgroundAppearAnimator.isRunning()) {
            this.mBackgroundAppearAnimator.cancel();
        }
        this.mBackgroundAppearAnimator.start();
    }

    public void startDisAppearAnimationOrNot() {
        if (this.mBackgroundAppearAnimator.isRunning()) {
            this.mNeedAutoStartDisAppear = true;
        } else {
            if (this.mBackgroundDisappearAnimator.isRunning() || this.mState != 1) {
                return;
            }
            this.mBackgroundDisappearAnimator.start();
        }
    }

    public NearListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearListSelectedItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mBackgroundAnimationEnabled = true;
        this.mNeedAutoStartDisAppear = false;
        this.mState = 2;
        this.mDisappearInterpolator = PathInterpolatorCompat.create(0.17f, 0.17f, 0.67f, 1.0f);
        this.mAppearInterpolator = new LinearInterpolator();
        initAnimation(getContext());
    }
}
