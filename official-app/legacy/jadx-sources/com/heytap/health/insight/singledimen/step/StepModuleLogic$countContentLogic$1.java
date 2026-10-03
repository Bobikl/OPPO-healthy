package com.heytap.health.insight.singledimen.step;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.insight.singledimen.step.StepModuleLogic", f = "StepModuleLogic.kt", i = {0, 0, 0, 0, 0, 0}, l = {79}, m = "countContentLogic", n = {"this", "monthDateRange", "weekDateRange", "monthStat", "weekStat", "queryStartTime"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
public final class StepModuleLogic$countContentLogic$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepModuleLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepModuleLogic$countContentLogic$1(StepModuleLogic stepModuleLogic, Continuation<? super StepModuleLogic$countContentLogic$1> continuation) {
        super(continuation);
        this.this$0 = stepModuleLogic;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
