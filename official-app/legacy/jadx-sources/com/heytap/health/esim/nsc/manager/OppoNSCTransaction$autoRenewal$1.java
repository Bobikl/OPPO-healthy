package com.heytap.health.esim.nsc.manager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.manager.OppoNSCTransaction", f = "EsimPayManager.kt", i = {0, 0, 1, 1}, l = {252, 254, 256}, m = "autoRenewal", n = {"this", "context", "this", "autoRenewal"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class OppoNSCTransaction$autoRenewal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OppoNSCTransaction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OppoNSCTransaction$autoRenewal$1(OppoNSCTransaction oppoNSCTransaction, Continuation<? super OppoNSCTransaction$autoRenewal$1> continuation) {
        super(continuation);
        this.this$0 = oppoNSCTransaction;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
