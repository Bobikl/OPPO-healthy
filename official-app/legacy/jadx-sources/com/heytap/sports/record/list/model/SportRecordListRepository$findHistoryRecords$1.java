package com.heytap.sports.record.list.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.record.list.model.SportRecordListRepository", f = "SportRecordListRepository.kt", i = {}, l = {73}, m = "findHistoryRecords", n = {}, s = {})
public final class SportRecordListRepository$findHistoryRecords$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SportRecordListRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordListRepository$findHistoryRecords$1(SportRecordListRepository sportRecordListRepository, Continuation<? super SportRecordListRepository$findHistoryRecords$1> continuation) {
        super(continuation);
        this.this$0 = sportRecordListRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, 0L, 0L, 0, 0, 0, this);
    }
}
