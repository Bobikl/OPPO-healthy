package com.heytap.health.devicepair.manager.task;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicepair.manager.task.TaskAccountCheck", f = "TaskAccountCheck.kt", i = {0, 0}, l = {45}, m = "execute", n = {"this", "watchAccountNumber"}, s = {"L$0", "L$1"})
public final class TaskAccountCheck$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskAccountCheck this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskAccountCheck$execute$1(TaskAccountCheck taskAccountCheck, Continuation<? super TaskAccountCheck$execute$1> continuation) {
        super(continuation);
        this.this$0 = taskAccountCheck;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
