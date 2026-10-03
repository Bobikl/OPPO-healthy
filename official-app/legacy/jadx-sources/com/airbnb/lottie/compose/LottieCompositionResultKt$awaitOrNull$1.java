package com.airbnb.lottie.compose;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", i = {}, l = {85}, m = "awaitOrNull", n = {}, s = {})
public final class LottieCompositionResultKt$awaitOrNull$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public LottieCompositionResultKt$awaitOrNull$1(Continuation<? super LottieCompositionResultKt$awaitOrNull$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LottieCompositionResultKt.a(null, this);
    }
}
