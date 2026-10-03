package com.heytap.health.esim.nsc.repo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.repo.RedteaRepo", f = "RedteaRepo.kt", i = {0}, l = {21}, m = "getAndCacheAcInfo", n = {"this"}, s = {"L$0"})
public final class RedteaRepo$getAndCacheAcInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RedteaRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedteaRepo$getAndCacheAcInfo$1(RedteaRepo redteaRepo, Continuation<? super RedteaRepo$getAndCacheAcInfo$1> continuation) {
        super(continuation);
        this.this$0 = redteaRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, this);
    }
}
