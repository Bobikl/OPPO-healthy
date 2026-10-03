package com.heytap.health.operation.timeline;

import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineECG", f = "TimelineECG.kt", i = {0, 0}, l = {33}, m = "fetchData", n = {"nodes", UTraceSQLiteHelperKt.COL_TAGS}, s = {"L$0", "L$1"})
public final class TimelineECG$fetchData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineECG this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineECG$fetchData$1(TimelineECG timelineECG, Continuation<? super TimelineECG$fetchData$1> continuation) {
        super(continuation);
        this.this$0 = timelineECG;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, this);
    }
}
