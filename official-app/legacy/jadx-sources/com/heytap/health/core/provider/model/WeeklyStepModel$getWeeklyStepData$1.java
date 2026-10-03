package com.heytap.health.core.provider.model;

import com.heytap.health.core.provider.adapter.open.WeeklyStepAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.core.provider.model.WeeklyStepModel", f = "WeeklyStepModel.kt", i = {}, l = {43}, m = WeeklyStepAdapter.GET_WEEKLY_STEP_DATA_ITEM, n = {}, s = {})
public final class WeeklyStepModel$getWeeklyStepData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WeeklyStepModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeeklyStepModel$getWeeklyStepData$1(WeeklyStepModel weeklyStepModel, Continuation<? super WeeklyStepModel$getWeeklyStepData$1> continuation) {
        super(continuation);
        this.this$0 = weeklyStepModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
