package com.heytap.health.operation.timeline;

import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineCardServiceImpl", f = "TimelineCardServiceImpl.kt", i = {0, 0, 0, 0, 0, 1}, l = {176, FitnessProto$FitnessCmdId.CMD_MCU_AUTO_PAUSE_SPORT_VALUE}, m = "hasDataInRecent7Days", n = {"noDataList", "today", "dateStr", "days", "i", "date"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$1"})
public final class TimelineCardServiceImpl$hasDataInRecent7Days$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineCardServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineCardServiceImpl$hasDataInRecent7Days$1(TimelineCardServiceImpl timelineCardServiceImpl, Continuation<? super TimelineCardServiceImpl$hasDataInRecent7Days$1> continuation) {
        super(continuation);
        this.this$0 = timelineCardServiceImpl;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.W(this);
    }
}
