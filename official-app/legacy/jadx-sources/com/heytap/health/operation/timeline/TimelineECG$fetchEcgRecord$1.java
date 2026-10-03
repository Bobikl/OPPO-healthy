package com.heytap.health.operation.timeline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineECG", f = "TimelineECG.kt", i = {}, l = {89}, m = "fetchEcgRecord", n = {}, s = {})
public final class TimelineECG$fetchEcgRecord$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineECG this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineECG$fetchEcgRecord$1(TimelineECG timelineECG, Continuation<? super TimelineECG$fetchEcgRecord$1> continuation) {
        super(continuation);
        this.this$0 = timelineECG;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, this);
    }
}
