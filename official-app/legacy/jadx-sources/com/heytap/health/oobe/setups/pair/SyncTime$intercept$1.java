package com.heytap.health.oobe.setups.pair;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oobe.setups.pair.SyncTime", f = "SyncTime.kt", i = {3, 3}, l = {26, 30, 34, 38, 45}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
public final class SyncTime$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SyncTime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncTime$intercept$1(SyncTime syncTime, Continuation<? super SyncTime$intercept$1> continuation) {
        super(continuation);
        this.this$0 = syncTime;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
