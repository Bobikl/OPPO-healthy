package com.heytap.sports.record.details.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.record.details.model.SportRecordAIRepository", f = "SportRecordAIRepository.kt", i = {}, l = {65}, m = "findHistoryStats", n = {}, s = {})
public final class SportRecordAIRepository$findHistoryStats$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SportRecordAIRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordAIRepository$findHistoryStats$1(SportRecordAIRepository sportRecordAIRepository, Continuation<? super SportRecordAIRepository$findHistoryStats$1> continuation) {
        super(continuation);
        this.this$0 = sportRecordAIRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0L, 0L, this);
    }
}
