package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.oplus.aiunit.vision.k9b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroidx/compose/runtime/State;", "Lcom/oplus/aiunit/vision/k9b;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValue", "()Lcom/oplus/aiunit/vision/k9b;", "value", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
public interface LottieCompositionResult extends State<k9b> {
    @Nullable
    Object await(@NotNull Continuation<? super k9b> continuation);

    @Override // androidx.compose.runtime.State
    @Nullable
    k9b getValue();
}
