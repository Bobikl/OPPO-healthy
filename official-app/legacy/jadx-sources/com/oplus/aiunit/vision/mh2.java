package com.oplus.aiunit.vision;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.coui.appcompat.snackbar.COUICustomSnackBar;

/* JADX INFO: loaded from: classes13.dex */
public class mh2 {
    public static final int ALPHA_ANIMATION_IN_DURATION = 250;
    public static final int ALPHA_ANIMATION_OUT_DURATION = 180;
    public static final String ALPHA_ANIMATION_TYPE = "alpha";
    public static final int ANIMATION_DURATION_267 = 267;
    public static final int ANIMATION_DURATION_300 = 300;
    public static final int ANIMATION_DURATION_350 = 350;
    public static final String SCALE_X_ANIMATION_TYPE = "scaleX";
    public static final String SCALE_Y_ANIMATION_TYPE = "scaleY";
    public static final String TRANSLATION_X_ANIMATION_TYPE = "translationX";
    public static final String TRANSLATION_Y_ANIMATION_TYPE = "translationY";
    public static final Interpolator ANIM_OUT_Interpolator = PathInterpolatorCompat.create(0.1f, 0.0f, 0.1f, 1.0f);
    public static final Interpolator ANIM_IN_Interpolator = PathInterpolatorCompat.create(0.1f, 0.0f, 0.1f, 1.0f);
    public static final Interpolator INTENT_FLOAT_ANIM_OUT_Interpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 1.0f, 1.0f);
    public static final Interpolator INTENT_FLOAT_ANIM_IN_Interpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
    public static final Interpolator INTENT_NOTICE_ANIM_IN_Interpolator = PathInterpolatorCompat.create(0.22f, 0.34f, 0.05f, 1.0f);
    public static final Interpolator INTENT_NOTICE_ANIM_OUT_Interpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.4f, 1.0f);

    public static AnimatorSet a(COUICustomSnackBar cOUICustomSnackBar) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cOUICustomSnackBar, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setInterpolator(ANIM_OUT_Interpolator);
        animatorSet.setDuration(180L);
        return animatorSet;
    }
}
