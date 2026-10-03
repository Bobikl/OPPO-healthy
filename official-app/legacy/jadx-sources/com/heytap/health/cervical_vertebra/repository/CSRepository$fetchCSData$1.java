package com.heytap.health.cervical_vertebra.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.cervical_vertebra.repository.CSRepository", f = "CSRepository.kt", i = {0}, l = {62}, m = "fetchCSData", n = {"dataList"}, s = {"L$0"})
public final class CSRepository$fetchCSData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CSRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSRepository$fetchCSData$1(CSRepository cSRepository, Continuation<? super CSRepository$fetchCSData$1> continuation) {
        super(continuation);
        this.this$0 = cSRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, 0L, 0L, this);
    }
}
