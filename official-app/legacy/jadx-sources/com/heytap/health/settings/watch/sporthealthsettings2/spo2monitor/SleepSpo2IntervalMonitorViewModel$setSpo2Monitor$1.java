package com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor.SleepSpo2IntervalMonitorViewModel", f = "SleepSpo2IntervalMonitorViewModel.kt", i = {}, l = {35, 29}, m = "setSpo2Monitor", n = {}, s = {})
public final class SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepSpo2IntervalMonitorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1(SleepSpo2IntervalMonitorViewModel sleepSpo2IntervalMonitorViewModel, Continuation<? super SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1> continuation) {
        super(continuation);
        this.this$0 = sleepSpo2IntervalMonitorViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.x0(false, this);
    }
}
