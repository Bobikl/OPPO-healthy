package com.airbnb.lottie.compose;

import com.oplus.aiunit.vision.k9b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Lcom/oplus/aiunit/vision/k9b;", "a", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 6, 0})
public final class LottieCompositionResultKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull LottieCompositionResult lottieCompositionResult, @NotNull Continuation<? super k9b> continuation) {
        LottieCompositionResultKt$awaitOrNull$1 lottieCompositionResultKt$awaitOrNull$1;
        if (continuation instanceof LottieCompositionResultKt$awaitOrNull$1) {
            lottieCompositionResultKt$awaitOrNull$1 = (LottieCompositionResultKt$awaitOrNull$1) continuation;
            int i = lottieCompositionResultKt$awaitOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lottieCompositionResultKt$awaitOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                lottieCompositionResultKt$awaitOrNull$1 = new LottieCompositionResultKt$awaitOrNull$1(continuation);
            }
        } else {
            lottieCompositionResultKt$awaitOrNull$1 = new LottieCompositionResultKt$awaitOrNull$1(continuation);
        }
        Object objAwait = lottieCompositionResultKt$awaitOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = lottieCompositionResultKt$awaitOrNull$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                lottieCompositionResultKt$awaitOrNull$1.label = 1;
                objAwait = lottieCompositionResult.await(lottieCompositionResultKt$awaitOrNull$1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            return (k9b) objAwait;
        } catch (Throwable unused) {
            return null;
        }
    }
}
