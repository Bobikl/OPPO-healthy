package com.heytap.nearx.uikit.widget.pressfeedback;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.view.animation.ScaleAnimation;
import com.heytap.nearx.uikit.R$dimen;
import com.oplus.aiunit.vision.hjc;
import com.oplus.aiunit.vision.qic;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class NearPressFeedbackHelper {
    private static final float BIG_CARD_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.07f;
    public static final int BORDERLESS_BUTTON_PRESS_FEEDBACK = 1;
    public static final int CARD_PRESS_FEEDBACK = 0;
    private static final int DEFAULT_FLOATING_BUTTON_HEIGHT = 156;
    private static final float DEFAULT_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.1f;
    private static final int DEFAULT_TARGET_GUARANTEED_VALUE_THRESHOLD_HEIGHT = 600;
    public static final int FILL_BUTTON_PRESS_FEEDBACK = 2;
    private static final float SMALL_CARD_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.35f;
    public static final int UNJUMPABLE_CARD_PRESS_FEEDBACK = 3;
    private int mFeedbackType;
    private ValueAnimator mScaleAnimator;
    private float maxEndValueSize;
    private float minEndValueSize;
    private float pressedFillAlpha;
    private View view;
    private final long DEFAULT_PRESS_FEEDBACK_ANIMATION_DURATION = 200;
    private final long DEFAULT_RELEASE_FEEDBACK_ANIMATION_DURATION = 340;
    private final float DEFAULT_PRESS_FEEDBACK_ANIMATION_END_VALUE = 0.92f;
    private final float DEFAULT_PRESS_FEEDBACK_ANIMATION_START_VALUE = 1.0f;
    private final float DEFAULT_BRIGHTNESS_MAX_VALUE = 0.8f;
    private final float DEFAULT_ALPHA = 1.0f;
    private final float PRESSED_ALPHA = 0.5f;
    private final float DEFAULT_FIll_ALPHA = 0.0f;
    private final PathInterpolator PRESS_FEEDBACK_INTERPOLATOR = new hjc();
    private final PathInterpolator RELEASE_FEEDBACK_INTERPOLATOR = new qic();
    private float mCurrentScale = 1.0f;
    private float mCurrentBrightness = 1.0f;
    private float mCurrentBlackAlpha = 0.0f;
    private boolean mIsNeedToDelayCancelScaleAnim = false;
    private float scaleEndValue = 0.92f;
    private float mCurrentAlpha = 0.0f;
    private float maxEndValue = 0.98f;
    private float minEndValue = 0.94f;

    public NearPressFeedbackHelper() {
    }

    private float calculateScaleEndValue(int i, int i2) {
        float f = this.maxEndValue;
        float f2 = i * i2;
        float f3 = this.maxEndValueSize;
        float f4 = (f2 - f3) * (f - this.minEndValue);
        float f5 = this.minEndValueSize;
        float f6 = (f4 / (f3 - f5)) + f;
        if (f2 < f5) {
            return 1.0f;
        }
        return f2 > f3 ? f : f6;
    }

    private void cancelAnimator() {
        ValueAnimator valueAnimator = this.mScaleAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mScaleAnimator.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlpha(float f, View view) {
        if (f == view.getAlpha() || this.mFeedbackType == 1) {
            return;
        }
        view.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f, View view, float f2) {
        float fMax = Math.max(f2, Math.min(1.0f, f));
        view.setScaleX(fMax);
        view.setScaleY(fMax);
        view.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    public void executeFeedbackAnimator(boolean z) {
        long j2;
        float f;
        long j3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        PathInterpolator pathInterpolator;
        this.mIsNeedToDelayCancelScaleAnim = false;
        TypedValue typedValue = new TypedValue();
        this.view.getContext().getResources().getValue(R$dimen.nx_button_press_black_alpha, typedValue, true);
        float f9 = typedValue.getFloat();
        int i = this.mFeedbackType;
        if (i != 0) {
            if (i == 1) {
                j2 = z ? 200L : 340L;
                float f10 = this.pressedFillAlpha;
                if (z) {
                    this.mCurrentAlpha = 0.0f;
                }
                j3 = j2;
                f = 0.0f;
                f2 = f10;
                f3 = 1.0f;
            } else if (i == 2) {
                f3 = 0.8f;
                j3 = z ? 200L : 340L;
                f2 = 1.0f;
                f = f2;
            } else if (i != 3) {
                j2 = 0;
            } else {
                j2 = z ? 200L : 340L;
                if (z) {
                    this.mCurrentAlpha = 1.0f;
                }
                this.scaleEndValue = calculateScaleEndValue(this.view.getWidth(), this.view.getHeight());
                j3 = j2;
                f = 1.0f;
                f2 = 0.5f;
                f3 = 1.0f;
            }
            cancelAnimator();
            if (this.mIsNeedToDelayCancelScaleAnim) {
                return;
            }
            float[] fArr = new float[2];
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = this.mCurrentScale;
            }
            fArr[0] = f4;
            if (z) {
                f5 = this.scaleEndValue;
            } else {
                f5 = 1.0f;
            }
            fArr[1] = f5;
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("scaleHolder", fArr);
            float[] fArr2 = new float[2];
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = this.mCurrentBrightness;
            }
            fArr2[0] = f6;
            fArr2[1] = z ? f3 : 1.0f;
            PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("brightnessHolder", fArr2);
            float[] fArr3 = new float[2];
            if (z) {
                f7 = f;
            } else {
                f7 = this.mCurrentAlpha;
            }
            fArr3[0] = f7;
            if (!z) {
                f2 = f;
            }
            fArr3[1] = f2;
            PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("alphaHolder", fArr3);
            float[] fArr4 = new float[2];
            if (z) {
                f8 = 0.0f;
            } else {
                f8 = this.mCurrentBlackAlpha;
            }
            fArr4[0] = f8;
            if (!z) {
                f9 = 0.0f;
            }
            fArr4[1] = f9;
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, PropertyValuesHolder.ofFloat("blackAlphaHolder", fArr4));
            this.mScaleAnimator = valueAnimatorOfPropertyValuesHolder;
            if (z) {
                pathInterpolator = this.PRESS_FEEDBACK_INTERPOLATOR;
            } else {
                pathInterpolator = this.RELEASE_FEEDBACK_INTERPOLATOR;
            }
            valueAnimatorOfPropertyValuesHolder.setInterpolator(pathInterpolator);
            this.mScaleAnimator.setDuration(j3);
            this.mScaleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.pressfeedback.NearPressFeedbackHelper.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    NearPressFeedbackHelper.this.mCurrentScale = ((Float) valueAnimator.getAnimatedValue("scaleHolder")).floatValue();
                    NearPressFeedbackHelper.this.mCurrentBrightness = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
                    NearPressFeedbackHelper.this.mCurrentAlpha = ((Float) valueAnimator.getAnimatedValue("alphaHolder")).floatValue();
                    NearPressFeedbackHelper.this.mCurrentBlackAlpha = ((Float) valueAnimator.getAnimatedValue("blackAlphaHolder")).floatValue();
                    NearPressFeedbackHelper nearPressFeedbackHelper = NearPressFeedbackHelper.this;
                    nearPressFeedbackHelper.setScale(nearPressFeedbackHelper.mCurrentScale, NearPressFeedbackHelper.this.view, NearPressFeedbackHelper.this.scaleEndValue);
                    NearPressFeedbackHelper nearPressFeedbackHelper2 = NearPressFeedbackHelper.this;
                    nearPressFeedbackHelper2.setAlpha(nearPressFeedbackHelper2.mCurrentAlpha, NearPressFeedbackHelper.this.view);
                }
            });
            this.mScaleAnimator.start();
        }
        j2 = z ? 200L : 340L;
        this.scaleEndValue = calculateScaleEndValue(this.view.getWidth(), this.view.getHeight());
        j3 = j2;
        f3 = 1.0f;
        f2 = 1.0f;
        f = f2;
        cancelAnimator();
        if (this.mIsNeedToDelayCancelScaleAnim) {
            return;
        }
        float[] fArr5 = new float[2];
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = this.mCurrentScale;
        }
        fArr5[0] = f4;
        if (z) {
            f5 = this.scaleEndValue;
        } else {
            f5 = 1.0f;
        }
        fArr5[1] = f5;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat("scaleHolder", fArr5);
        float[] fArr6 = new float[2];
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = this.mCurrentBrightness;
        }
        fArr6[0] = f6;
        fArr6[1] = z ? f3 : 1.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat("brightnessHolder", fArr6);
        float[] fArr7 = new float[2];
        if (z) {
            f7 = f;
        } else {
            f7 = this.mCurrentAlpha;
        }
        fArr7[0] = f7;
        if (!z) {
            f2 = f;
        }
        fArr7[1] = f2;
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat("alphaHolder", fArr7);
        float[] fArr8 = new float[2];
        if (z) {
            f8 = 0.0f;
        } else {
            f8 = this.mCurrentBlackAlpha;
        }
        fArr8[0] = f8;
        if (!z) {
            f9 = 0.0f;
        }
        fArr8[1] = f9;
        ValueAnimator valueAnimatorOfPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfFloat4, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6, PropertyValuesHolder.ofFloat("blackAlphaHolder", fArr8));
        this.mScaleAnimator = valueAnimatorOfPropertyValuesHolder2;
        if (z) {
            pathInterpolator = this.PRESS_FEEDBACK_INTERPOLATOR;
        } else {
            pathInterpolator = this.RELEASE_FEEDBACK_INTERPOLATOR;
        }
        valueAnimatorOfPropertyValuesHolder2.setInterpolator(pathInterpolator);
        this.mScaleAnimator.setDuration(j3);
        this.mScaleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.pressfeedback.NearPressFeedbackHelper.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearPressFeedbackHelper.this.mCurrentScale = ((Float) valueAnimator.getAnimatedValue("scaleHolder")).floatValue();
                NearPressFeedbackHelper.this.mCurrentBrightness = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
                NearPressFeedbackHelper.this.mCurrentAlpha = ((Float) valueAnimator.getAnimatedValue("alphaHolder")).floatValue();
                NearPressFeedbackHelper.this.mCurrentBlackAlpha = ((Float) valueAnimator.getAnimatedValue("blackAlphaHolder")).floatValue();
                NearPressFeedbackHelper nearPressFeedbackHelper = NearPressFeedbackHelper.this;
                nearPressFeedbackHelper.setScale(nearPressFeedbackHelper.mCurrentScale, NearPressFeedbackHelper.this.view, NearPressFeedbackHelper.this.scaleEndValue);
                NearPressFeedbackHelper nearPressFeedbackHelper2 = NearPressFeedbackHelper.this;
                nearPressFeedbackHelper2.setAlpha(nearPressFeedbackHelper2.mCurrentAlpha, NearPressFeedbackHelper.this.view);
            }
        });
        this.mScaleAnimator.start();
    }

    public ScaleAnimation generatePressAnimation(@Nullable View view) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.92f, 1.0f, 0.92f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(this.PRESS_FEEDBACK_INTERPOLATOR);
        return scaleAnimation;
    }

    public ValueAnimator generatePressAnimationRecord() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.92f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(this.PRESS_FEEDBACK_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    public final ScaleAnimation generateResumeAnimation(@Nullable View view, float f) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, 1.0f, f, 1.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(this.PRESS_FEEDBACK_INTERPOLATOR);
        return scaleAnimation;
    }

    public float getAlphaValue() {
        return this.mCurrentAlpha;
    }

    public ValueAnimator getAnimator() {
        return this.mScaleAnimator;
    }

    public float getBlackAlphaValue() {
        return this.mCurrentBlackAlpha;
    }

    public float getBrightnessValue() {
        return this.mCurrentBrightness;
    }

    public final float getGuaranteedAnimationValue(@Nullable View view) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        if (view.getHeight() >= 600) {
            return 0.9944f;
        }
        return view.getHeight() >= 156 ? 0.972f : 0.992f;
    }

    public void refresh() {
        TypedValue typedValue = new TypedValue();
        this.view.getContext().getResources().getValue(R$dimen.nx_button_fill_alpha, typedValue, true);
        this.pressedFillAlpha = typedValue.getFloat();
    }

    public NearPressFeedbackHelper(View view, int i) {
        this.mFeedbackType = i;
        this.view = view;
        TypedValue typedValue = new TypedValue();
        this.view.getContext().getResources().getValue(R$dimen.nx_button_fill_alpha, typedValue, true);
        this.pressedFillAlpha = typedValue.getFloat();
        int dimensionPixelOffset = this.view.getContext().getResources().getDimensionPixelOffset(R$dimen.nx_max_end_value_width);
        int dimensionPixelOffset2 = this.view.getContext().getResources().getDimensionPixelOffset(R$dimen.nx_max_end_value_height);
        int dimensionPixelOffset3 = this.view.getContext().getResources().getDimensionPixelOffset(R$dimen.nx_min_end_value_size);
        this.maxEndValueSize = dimensionPixelOffset * dimensionPixelOffset2;
        this.minEndValueSize = dimensionPixelOffset3 * dimensionPixelOffset3;
    }
}
