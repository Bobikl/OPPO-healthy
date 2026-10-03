package com.heytap.health.step.service;

import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.step.service.StepDetailServiceImpl", f = "StepDetailServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {66}, m = "fetchDateRangeStepStat", n = {"beforeStartDate", "beforeEndDate", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "repository", "beforeStatListDb", "afterStatListDb"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
public final class StepDetailServiceImpl$fetchDateRangeStepStat$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepDetailServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepDetailServiceImpl$fetchDateRangeStepStat$1(StepDetailServiceImpl stepDetailServiceImpl, Continuation<? super StepDetailServiceImpl$fetchDateRangeStepStat$1> continuation) {
        super(continuation);
        this.this$0 = stepDetailServiceImpl;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.G7(null, this);
    }
}
