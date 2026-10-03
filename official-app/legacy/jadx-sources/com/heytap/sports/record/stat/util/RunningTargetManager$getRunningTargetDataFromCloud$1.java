package com.heytap.sports.record.stat.util;

import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.record.stat.util.RunningTargetManager", f = "RunningTargetManager.kt", i = {}, l = {FitnessProto$FitnessCmdId.CMD_SUNLIGHT_DETAIL_VALUE}, m = "getRunningTargetDataFromCloud", n = {}, s = {})
public final class RunningTargetManager$getRunningTargetDataFromCloud$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunningTargetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningTargetManager$getRunningTargetDataFromCloud$1(RunningTargetManager runningTargetManager, Continuation<? super RunningTargetManager$getRunningTargetDataFromCloud$1> continuation) {
        super(continuation);
        this.this$0 = runningTargetManager;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(this);
    }
}
