package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.oplus.aiunit.vision.j9b;
import com.oplus.aiunit.vision.k9b;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationState;", "Landroidx/compose/runtime/State;", "", "getProgress", "()F", "progress", "", "c", "()I", "iteration", "a", "iterations", "Lcom/oplus/aiunit/vision/j9b;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/j9b;", "clipSpec", "getSpeed", "speed", "Lcom/oplus/aiunit/vision/k9b;", "getComposition", "()Lcom/oplus/aiunit/vision/k9b;", "composition", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
public interface LottieAnimationState extends State<Float> {
    int a();

    int c();

    @Nullable
    j9b e();

    @Nullable
    k9b getComposition();

    float getProgress();

    float getSpeed();
}
