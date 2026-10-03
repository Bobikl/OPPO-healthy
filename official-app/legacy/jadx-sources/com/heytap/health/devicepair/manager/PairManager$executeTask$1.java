package com.heytap.health.devicepair.manager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicepair.manager.PairManager", f = "PairManager.kt", i = {0, 0, 1}, l = {97, 102}, m = "executeTask", n = {"this", "pairTask", "this"}, s = {"L$0", "L$2", "L$0"})
public final class PairManager$executeTask$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PairManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairManager$executeTask$1(PairManager pairManager, Continuation<? super PairManager$executeTask$1> continuation) {
        super(continuation);
        this.this$0 = pairManager;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
