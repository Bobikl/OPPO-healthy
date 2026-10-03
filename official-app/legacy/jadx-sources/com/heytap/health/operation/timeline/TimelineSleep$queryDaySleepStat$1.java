package com.heytap.health.operation.timeline;

import com.oplus.aiunit.vision.oei;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.operation.timeline.TimelineSleep", f = "TimelineSleep.kt", i = {}, l = {oei.TAI_CHI}, m = "queryDaySleepStat", n = {}, s = {})
public final class TimelineSleep$queryDaySleepStat$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineSleep this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineSleep$queryDaySleepStat$1(TimelineSleep timelineSleep, Continuation<? super TimelineSleep$queryDaySleepStat$1> continuation) {
        super(continuation);
        this.this$0 = timelineSleep;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(0L, this);
    }
}
