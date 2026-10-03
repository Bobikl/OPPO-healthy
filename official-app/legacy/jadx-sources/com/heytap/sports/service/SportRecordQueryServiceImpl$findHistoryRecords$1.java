package com.heytap.sports.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.service.SportRecordQueryServiceImpl", f = "SportRecordQueryServiceImpl.kt", i = {}, l = {42}, m = "findHistoryRecords", n = {}, s = {})
public final class SportRecordQueryServiceImpl$findHistoryRecords$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SportRecordQueryServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordQueryServiceImpl$findHistoryRecords$1(SportRecordQueryServiceImpl sportRecordQueryServiceImpl, Continuation<? super SportRecordQueryServiceImpl$findHistoryRecords$1> continuation) {
        super(continuation);
        this.this$0 = sportRecordQueryServiceImpl;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a0(0, 0L, 0L, 0, 0, 0, this);
    }
}
