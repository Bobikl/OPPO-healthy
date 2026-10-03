package com.heytap.health.operation.timeline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineCardServiceImpl", f = "TimelineCardServiceImpl.kt", i = {0}, l = {32}, m = "getTimelineCardData", n = {"this"}, s = {"L$0"})
public final class TimelineCardServiceImpl$getTimelineCardData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineCardServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineCardServiceImpl$getTimelineCardData$1(TimelineCardServiceImpl timelineCardServiceImpl, Continuation<? super TimelineCardServiceImpl$getTimelineCardData$1> continuation) {
        super(continuation);
        this.this$0 = timelineCardServiceImpl;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Y(0L, this);
    }
}
