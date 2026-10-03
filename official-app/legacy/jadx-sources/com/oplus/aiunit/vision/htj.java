package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/htj;", "Landroid/transition/Transition;", "Landroid/transition/TransitionValues;", "transitionValues", "", "captureStartValues", "captureEndValues", "Landroid/view/ViewGroup;", "sceneRoot", "startValues", "endValues", "Landroid/animation/Animator;", "createAnimator", "b", "<init>", "()V", "Companion", "a", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class htj extends Transition {
    public static final void c(TextView view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        float fFloatValue = ((Float) animatedValue).floatValue();
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue);
    }

    public final void b(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Intrinsics.checkNotNullExpressionValue(view, "transitionValues.view");
        if (view instanceof TextView) {
            Map map = transitionValues.values;
            Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
            map.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NotNull TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NotNull TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        b(transitionValues);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NotNull ViewGroup sceneRoot, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (startValues == null || endValues == null || !(startValues.view instanceof TextView)) {
            return null;
        }
        View view = endValues.view;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        Map map = startValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "startValues.values");
        Map map2 = endValues.values;
        Intrinsics.checkNotNullExpressionValue(map2, "endValues.values");
        float fFloatValue2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            Object obj = map.get("android:textscale:scale");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            fFloatValue = ((Float) obj).floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            Object obj2 = map2.get("android:textscale:scale");
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            fFloatValue2 = ((Float) obj2).floatValue();
        }
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.gtj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                htj.c(textView, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }
}
