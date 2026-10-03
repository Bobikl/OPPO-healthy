package com.oplus.aiunit.vision;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.animation.PathInterpolatorCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/es0;", "", "Landroid/view/View;", "view", "", "a", "b", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class es0 {
    public static final int $stable = 0;

    @NotNull
    public static final Interpolator a;

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.21f, 0.0f, 0.36f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(0.21f, 0f, 0.36f, 1.0f)");
        a = interpolatorCreate;
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(view, \"alpha\", 0f, 1.0f)");
        objectAnimatorOfFloat.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", -30.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(view, \"translationX\", -30f, 0f)");
        objectAnimatorOfFloat2.setInterpolator(a);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    public final void b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(view, \"alpha\", 0f, 1.0f)");
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.start();
    }
}
