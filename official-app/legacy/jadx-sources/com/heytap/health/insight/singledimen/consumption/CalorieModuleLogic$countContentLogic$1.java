package com.heytap.health.insight.singledimen.consumption;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.insight.singledimen.consumption.CalorieModuleLogic", f = "CalorieModuleLogic.kt", i = {0, 0, 0, 0}, l = {65}, m = "countContentLogic", n = {"this", "monthDateRange", "weekDateRange", "queryStartTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
public final class CalorieModuleLogic$countContentLogic$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CalorieModuleLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalorieModuleLogic$countContentLogic$1(CalorieModuleLogic calorieModuleLogic, Continuation<? super CalorieModuleLogic$countContentLogic$1> continuation) {
        super(continuation);
        this.this$0 = calorieModuleLogic;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
