package com.heytap.health.sleep.heartrate.day.algorithm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sleep.heartrate.day.algorithm.SleepHeartRateProcess", f = "SleepHeartRateProcess.kt", i = {}, l = {119}, m = "getSleepHeartRateDayList", n = {}, s = {})
public final class SleepHeartRateProcess$getSleepHeartRateDayList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepHeartRateProcess this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepHeartRateProcess$getSleepHeartRateDayList$1(SleepHeartRateProcess sleepHeartRateProcess, Continuation<? super SleepHeartRateProcess$getSleepHeartRateDayList$1> continuation) {
        super(continuation);
        this.this$0 = sleepHeartRateProcess;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, 0L, this);
    }
}
