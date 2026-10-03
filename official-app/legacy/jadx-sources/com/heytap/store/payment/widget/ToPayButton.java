package com.heytap.store.payment.widget;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class ToPayButton extends LinearLayout {
    private boolean mAnimEnable;
    private Float mCurrentBrightness;
    private float mCurrentScale;
    private boolean mIsNeedToDelayCancelScaleAnim;
    private float mMaxBrightness;
    private Interpolator mScaleAnimationInterpolator;
    private ValueAnimator mScaleAnimator;

    public ToPayButton(Context context) {
        super(context);
        this.mAnimEnable = true;
        this.mScaleAnimationInterpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
        this.mCurrentScale = 1.0f;
        this.mCurrentBrightness = Float.valueOf(1.0f);
        this.mMaxBrightness = 0.8f;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    private final void cancelAnimator(boolean z) {
        boolean z2;
        ValueAnimator valueAnimator = this.mScaleAnimator;
        if (valueAnimator != null) {
            if (valueAnimator == null) {
                Intrinsics.throwNpe();
            }
            if (valueAnimator.isRunning()) {
                if (z) {
                    z2 = false;
                } else {
                    ValueAnimator valueAnimator2 = this.mScaleAnimator;
                    if (valueAnimator2 == null) {
                        Intrinsics.throwNpe();
                    }
                    float currentPlayTime = valueAnimator2.getCurrentPlayTime();
                    ValueAnimator valueAnimator3 = this.mScaleAnimator;
                    if (valueAnimator3 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (currentPlayTime < valueAnimator3.getDuration() * 0.4f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                this.mIsNeedToDelayCancelScaleAnim = z2;
                if (z2) {
                    return;
                }
                ValueAnimator valueAnimator4 = this.mScaleAnimator;
                if (valueAnimator4 == null) {
                    Intrinsics.throwNpe();
                }
                valueAnimator4.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeScaleAnimator(final boolean z) {
        this.mIsNeedToDelayCancelScaleAnim = false;
        cancelAnimator(z);
        if (this.mIsNeedToDelayCancelScaleAnim) {
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = z ? 1.0f : this.mCurrentBrightness.floatValue();
        fArr[1] = z ? this.mMaxBrightness : 1.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("brightnessHolder", fArr);
        Intrinsics.checkExpressionValueIsNotNull(propertyValuesHolderOfFloat, "PropertyValuesHolder.ofF…mMaxBrightness else 1.0f)");
        float[] fArr2 = new float[2];
        fArr2[0] = z ? 1.0f : this.mCurrentScale;
        fArr2[1] = z ? 0.92f : 1.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("scaleHolder", fArr2);
        Intrinsics.checkExpressionValueIsNotNull(propertyValuesHolderOfFloat2, "PropertyValuesHolder.ofF…_SCALE_MIN_VALUE else 1f)");
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        this.mScaleAnimator = valueAnimatorOfPropertyValuesHolder;
        if (valueAnimatorOfPropertyValuesHolder != null) {
            valueAnimatorOfPropertyValuesHolder.setInterpolator(this.mScaleAnimationInterpolator);
        }
        ValueAnimator valueAnimator = this.mScaleAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(z ? 200L : 340L);
        }
        ValueAnimator valueAnimator2 = this.mScaleAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.store.payment.widget.ToPayButton.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animator) {
                    ToPayButton toPayButton = ToPayButton.this;
                    Object animatedValue = animator.getAnimatedValue("scaleHolder");
                    if (animatedValue == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    toPayButton.mCurrentScale = ((Float) animatedValue).floatValue();
                    if (ToPayButton.this.mIsNeedToDelayCancelScaleAnim && z) {
                        Intrinsics.checkExpressionValueIsNotNull(animator, "animator");
                        if (animator.getCurrentPlayTime() > animator.getDuration() * 0.4f) {
                            animator.cancel();
                            ToPayButton.this.executeScaleAnimator(false);
                            return;
                        }
                    }
                    ToPayButton toPayButton2 = ToPayButton.this;
                    Object animatedValue2 = animator.getAnimatedValue("brightnessHolder");
                    if (animatedValue2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    toPayButton2.mCurrentBrightness = (Float) animatedValue2;
                    ToPayButton toPayButton3 = ToPayButton.this;
                    toPayButton3.setScale(toPayButton3.mCurrentScale);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.mScaleAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScale(float f) {
        float fMax = Math.max(0.92f, Math.min(1.0f, f));
        setScaleX(fMax);
        setScaleY(fMax);
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (isEnabled() && this.mAnimEnable && isClickable()) {
            int action = event.getAction();
            if (action == 0) {
                executeScaleAnimator(true);
            } else if (action == 1 || action == 3) {
                executeScaleAnimator(false);
            }
        }
        return super.onTouchEvent(event);
    }

    public ToPayButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAnimEnable = true;
        this.mScaleAnimationInterpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
        this.mCurrentScale = 1.0f;
        this.mCurrentBrightness = Float.valueOf(1.0f);
        this.mMaxBrightness = 0.8f;
    }

    public ToPayButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAnimEnable = true;
        this.mScaleAnimationInterpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
        this.mCurrentScale = 1.0f;
        this.mCurrentBrightness = Float.valueOf(1.0f);
        this.mMaxBrightness = 0.8f;
    }

    public ToPayButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mAnimEnable = true;
        this.mScaleAnimationInterpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
        this.mCurrentScale = 1.0f;
        this.mCurrentBrightness = Float.valueOf(1.0f);
        this.mMaxBrightness = 0.8f;
    }
}
