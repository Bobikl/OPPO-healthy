package com.heytap.health.devicepair.manager.task.iwatch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicepair.manager.task.iwatch.TaskIWatchBindKey", f = "TaskIWatchBindKey.kt", i = {0}, l = {15}, m = "getSignByDevice", n = {"this"}, s = {"L$0"})
public final class TaskIWatchBindKey$getSignByDevice$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskIWatchBindKey this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskIWatchBindKey$getSignByDevice$1(TaskIWatchBindKey taskIWatchBindKey, Continuation<? super TaskIWatchBindKey$getSignByDevice$1> continuation) {
        super(continuation);
        this.this$0 = taskIWatchBindKey;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(this);
    }
}
