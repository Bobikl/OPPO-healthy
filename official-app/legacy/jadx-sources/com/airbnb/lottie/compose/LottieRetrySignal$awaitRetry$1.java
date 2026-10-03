package com.airbnb.lottie.compose;

import com.oplus.aiunit.vision.fbb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", i = {0}, l = {45}, m = "awaitRetry", n = {"this"}, s = {"L$0"})
final class LottieRetrySignal$awaitRetry$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fbb this$0;

    public LottieRetrySignal$awaitRetry$1(fbb fbbVar, Continuation<? super LottieRetrySignal$awaitRetry$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
