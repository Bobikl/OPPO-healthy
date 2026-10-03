package com.heytap.sports.record.stat.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.record.stat.model.SportStatRepository", f = "SportStatRepository.kt", i = {}, l = {51}, m = "findSportStatistic", n = {}, s = {})
public final class SportStatRepository$findSportStatistic$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SportStatRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStatRepository$findSportStatistic$1(SportStatRepository sportStatRepository, Continuation<? super SportStatRepository$findSportStatistic$1> continuation) {
        super(continuation);
        this.this$0 = sportStatRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0, 0L, 0L, null, 0, null, 0, false, 0, this);
    }
}
