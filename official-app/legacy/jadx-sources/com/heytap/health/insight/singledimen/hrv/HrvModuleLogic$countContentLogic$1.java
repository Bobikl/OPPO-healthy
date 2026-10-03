package com.heytap.health.insight.singledimen.hrv;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.insight.singledimen.hrv.HrvModuleLogic", f = "HrvModuleLogic.kt", i = {0, 0, 0, 0, 0}, l = {66}, m = "countContentLogic", n = {"this", "monthDateRange", "weekDateRange", "monthStat", "weekStat"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
public final class HrvModuleLogic$countContentLogic$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HrvModuleLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HrvModuleLogic$countContentLogic$1(HrvModuleLogic hrvModuleLogic, Continuation<? super HrvModuleLogic$countContentLogic$1> continuation) {
        super(continuation);
        this.this$0 = hrvModuleLogic;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
