package com.heytap.health.core.provider.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.core.provider.model.StepDetailModel", f = "StepDetailModel.kt", i = {}, l = {35}, m = "getStepDetailData", n = {}, s = {})
public final class StepDetailModel$getStepDetailData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepDetailModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepDetailModel$getStepDetailData$1(StepDetailModel stepDetailModel, Continuation<? super StepDetailModel$getStepDetailData$1> continuation) {
        super(continuation);
        this.this$0 = stepDetailModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, 0L, 0L, this);
    }
}
