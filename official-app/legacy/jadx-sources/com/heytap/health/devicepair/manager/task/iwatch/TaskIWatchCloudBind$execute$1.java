package com.heytap.health.devicepair.manager.task.iwatch;

import com.oplus.aiunit.vision.roj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicepair.manager.task.iwatch.TaskIWatchCloudBind", f = "TaskIWatchCloudBind.kt", i = {0}, l = {15}, m = "execute", n = {"this"}, s = {"L$0"})
final class TaskIWatchCloudBind$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ roj this$0;

    public TaskIWatchCloudBind$execute$1(roj rojVar, Continuation<? super TaskIWatchCloudBind$execute$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
