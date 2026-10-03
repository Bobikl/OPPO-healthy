package com.heytap.health.step.detail.ui.stephistory2.datamanager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.step.detail.ui.stephistory2.datamanager.StepDetailSuspendRepo", f = "StepDetailSuspendRepo.kt", i = {0, 0}, l = {339}, m = "queryHeartRateHistoryStatData", n = {"this", "queryStartTime"}, s = {"L$0", "J$0"})
public final class StepDetailSuspendRepo$queryHeartRateHistoryStatData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepDetailSuspendRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepDetailSuspendRepo$queryHeartRateHistoryStatData$1(StepDetailSuspendRepo stepDetailSuspendRepo, Continuation<? super StepDetailSuspendRepo$queryHeartRateHistoryStatData$1> continuation) {
        super(continuation);
        this.this$0 = stepDetailSuspendRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, null, 0, this);
    }
}
