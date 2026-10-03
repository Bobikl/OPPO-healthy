package com.heytap.health.esim.nsc.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.utils.NSCHelper", f = "NSCHelper.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 53}, m = "runCatch", n = {"run", "retryTimes", "retryAt", "run", "retryTimes", "retryAt"}, s = {"L$0", "I$0", "I$1", "L$0", "I$0", "I$1"})
public final class NSCHelper$runCatch$1<D> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NSCHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSCHelper$runCatch$1(NSCHelper nSCHelper, Continuation<? super NSCHelper$runCatch$1> continuation) {
        super(continuation);
        this.this$0 = nSCHelper;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0, null, this);
    }
}
