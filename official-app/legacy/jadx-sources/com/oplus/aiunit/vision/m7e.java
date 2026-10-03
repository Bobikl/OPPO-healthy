package com.oplus.aiunit.vision;

import android.animation.ObjectAnimator;
import com.heytap.store.business.rn.service.RnConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/m7e;", "Lcom/oplus/aiunit/vision/w4;", "", "endValue", "Landroid/animation/ObjectAnimator;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/g7e;", RnConstant.KEY_INIT_OPTIONS, "Lcom/oplus/aiunit/vision/mz9;", a8i.UPDATE, "<init>", "(Lcom/oplus/aiunit/vision/g7e;Lcom/oplus/aiunit/vision/mz9;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class m7e extends w4<float[]> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7e(@NotNull Param<float[]> param, @NotNull mz9 update) {
        super(param, update);
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(update, "update");
    }

    @Override // com.oplus.aiunit.vision.av9
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ObjectAnimator a(@NotNull float[] endValue) {
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, new n7e(), new ht7(), h(), endValue);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfObject, "ofObject(...)");
        return objectAnimatorOfObject;
    }
}
