package com.oplus.aiunit.vision;

import android.animation.TypeEvaluator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ht7;", "Landroid/animation/TypeEvaluator;", "", "", "fraction", "startValue", "endValue", "a", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class ht7 implements TypeEvaluator<float[]> {
    @Override // android.animation.TypeEvaluator
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float fraction, @NotNull float[] startValue, @NotNull float[] endValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        float[] fArr = new float[startValue.length];
        int length = startValue.length;
        for (int i = 0; i < length; i++) {
            float f = startValue[i];
            fArr[i] = f + ((endValue[i] - f) * fraction);
        }
        return fArr;
    }
}
