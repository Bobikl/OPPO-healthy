package com.heytap.health.devicelog.feedback;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicelog.feedback.SyncLogFiles", f = "LogGetInterceptors.kt", i = {1, 1, 1, 2, 2}, l = {222, 228, 232, 235}, m = "intercept", n = {"this", "chain", "request", "chain", "request"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
public final class SyncLogFiles$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SyncLogFiles this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncLogFiles$intercept$1(SyncLogFiles syncLogFiles, Continuation<? super SyncLogFiles$intercept$1> continuation) {
        super(continuation);
        this.this$0 = syncLogFiles;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
