package com.oplus.aiunit.vision;

import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/k9e;", "", "Landroid/view/animation/Interpolator;", "a", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class k9e {

    @NotNull
    public static final k9e INSTANCE = new k9e();

    @NotNull
    public final Interpolator a() {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.133f, 0.0f, 0.3f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(0.133f, 0.0f, 0.3f, 1.0f)");
        return interpolatorCreate;
    }
}
