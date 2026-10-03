package com.heytap.health.operation.timeline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineHeartRate", f = "TimelineHeartRate.kt", i = {}, l = {92}, m = "fetchHeartRateWarning", n = {}, s = {})
public final class TimelineHeartRate$fetchHeartRateWarning$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineHeartRate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineHeartRate$fetchHeartRateWarning$1(TimelineHeartRate timelineHeartRate, Continuation<? super TimelineHeartRate$fetchHeartRateWarning$1> continuation) {
        super(continuation);
        this.this$0 = timelineHeartRate;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0L, this);
    }
}
