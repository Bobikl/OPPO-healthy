package com.heytap.health.oobe.setups;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oobe.setups.WatchFaceStep", f = "WatchFaceStep.kt", i = {0}, l = {86}, m = "finishOOBE", n = {"this"}, s = {"L$0"})
public final class WatchFaceStep$finishOOBE$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WatchFaceStep this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchFaceStep$finishOOBE$1(WatchFaceStep watchFaceStep, Continuation<? super WatchFaceStep$finishOOBE$1> continuation) {
        super(continuation);
        this.this$0 = watchFaceStep;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.x(this);
    }
}
