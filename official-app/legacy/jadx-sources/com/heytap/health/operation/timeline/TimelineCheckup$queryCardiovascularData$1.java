package com.heytap.health.operation.timeline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineCheckup", f = "TimelineCheckup.kt", i = {}, l = {93}, m = "queryCardiovascularData", n = {}, s = {})
public final class TimelineCheckup$queryCardiovascularData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineCheckup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineCheckup$queryCardiovascularData$1(TimelineCheckup timelineCheckup, Continuation<? super TimelineCheckup$queryCardiovascularData$1> continuation) {
        super(continuation);
        this.this$0 = timelineCheckup;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(0L, this);
    }
}
