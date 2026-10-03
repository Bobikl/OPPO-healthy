package com.heytap.health.insight.singledimen.heartrate;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.insight.singledimen.heartrate.HeartRateModuleLogic", f = "HeartRateModuleLogic.kt", i = {0}, l = {91}, m = "fetchHeartRateData", n = {"statusBeanList"}, s = {"L$0"})
public final class HeartRateModuleLogic$fetchHeartRateData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HeartRateModuleLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateModuleLogic$fetchHeartRateData$1(HeartRateModuleLogic heartRateModuleLogic, Continuation<? super HeartRateModuleLogic$fetchHeartRateData$1> continuation) {
        super(continuation);
        this.this$0 = heartRateModuleLogic;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0L, 0L, this);
    }
}
