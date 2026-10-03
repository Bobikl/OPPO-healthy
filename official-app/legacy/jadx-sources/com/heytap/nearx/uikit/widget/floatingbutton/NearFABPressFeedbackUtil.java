package com.heytap.nearx.uikit.widget.floatingbutton;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.RestrictTo;
import com.oplus.aiunit.vision.hjc;

/* JADX INFO: loaded from: classes18.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class NearFABPressFeedbackUtil {
    private static final float BIG_CARD_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.07f;
    private static final int DEFAULT_FLOATING_BUTTON_HEIGHT = 156;
    private static final float DEFAULT_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.1f;
    private static final int DEFAULT_PRESS_FEEDBACK_ANIMATION_DURATION = 200;
    private static final float DEFAULT_PRESS_FEEDBACK_SCALE_MAX_VALUE = 1.0f;
    private static final float DEFAULT_PRESS_FEEDBACK_SCALE_MIN_VALUE = 0.9f;
    private static final int DEFAULT_RELEASE_ANIMATION_DURATION = 340;
    private static final int DEFAULT_TARGET_GUARANTEED_VALUE_THRESHOLD_HEIGHT = 600;
    private static final PathInterpolator PRESS_FEEDBACK_INTERPOLATOR = new hjc();
    private static final float SMALL_CARD_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.35f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static NearFloatingButtonTouchAnimation generatePressAnimation(View view) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        NearFloatingButtonTouchAnimation nearFloatingButtonTouchAnimation = new NearFloatingButtonTouchAnimation(1.0f, 0.9f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        nearFloatingButtonTouchAnimation.setDuration(200L);
        nearFloatingButtonTouchAnimation.setFillAfter(true);
        nearFloatingButtonTouchAnimation.setInterpolator(PRESS_FEEDBACK_INTERPOLATOR);
        nearFloatingButtonTouchAnimation.setTargetView(view);
        return nearFloatingButtonTouchAnimation;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ValueAnimator generatePressAnimationRecord() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(PRESS_FEEDBACK_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static NearFloatingButtonTouchAnimation generateResumeAnimation(View view, float f) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        NearFloatingButtonTouchAnimation nearFloatingButtonTouchAnimation = new NearFloatingButtonTouchAnimation(f, 1.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        nearFloatingButtonTouchAnimation.setDuration(340L);
        nearFloatingButtonTouchAnimation.setFillAfter(true);
        nearFloatingButtonTouchAnimation.setInterpolator(PRESS_FEEDBACK_INTERPOLATOR);
        nearFloatingButtonTouchAnimation.setTargetView(view);
        return nearFloatingButtonTouchAnimation;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static float getGuaranteedAnimationValue(View view) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        if (view.getHeight() >= 600) {
            return 0.993f;
        }
        return view.getHeight() >= 156 ? 0.965f : 0.99f;
    }
}
