package com.oplus.aiunit.vision;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes13.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class wh2 {
    public static final PathInterpolator a = new hj2();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static bi2 a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        bi2 bi2Var = new bi2(1.0f, 0.9f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        bi2Var.setDuration(200L);
        bi2Var.setFillAfter(true);
        bi2Var.setInterpolator(a);
        bi2Var.c(view);
        return bi2Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ValueAnimator b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(a);
        return valueAnimatorOfFloat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static bi2 c(View view, float f) {
        if (view == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.");
        }
        bi2 bi2Var = new bi2(f, 1.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        bi2Var.setDuration(340L);
        bi2Var.setFillAfter(true);
        bi2Var.setInterpolator(a);
        bi2Var.c(view);
        return bi2Var;
    }
}
