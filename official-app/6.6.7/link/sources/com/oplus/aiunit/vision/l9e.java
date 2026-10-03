package com.oplus.aiunit.vision;

import android.animation.ObjectAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/l9e;", "Lcom/oplus/aiunit/vision/e5;", "", "endValue", "Landroid/animation/ObjectAnimator;", "k", "Lcom/oplus/aiunit/vision/f9e;", "param", "Lcom/oplus/aiunit/vision/t0a;", "update", "<init>", "(Lcom/oplus/aiunit/vision/f9e;Lcom/oplus/aiunit/vision/t0a;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class l9e extends e5<float[]> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9e(@NotNull Param<float[]> param, @NotNull t0a t0aVar) {
        super(param, t0aVar);
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(t0aVar, "update");
    }

    @Override // com.oplus.aiunit.vision.hw9
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ObjectAnimator a(@NotNull float[] endValue) {
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, new m9e(), new ju7(), h(), endValue);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfObject, "ofObject(...)");
        return objectAnimatorOfObject;
    }
}
