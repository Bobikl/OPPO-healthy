package com.heytap.health.devicepair.manager.task;

import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion", f = "TaskCheckSupportVersion.kt", i = {0, 0, 1, 1}, l = {51, 55}, m = "execute", n = {"this", BridgeConstant.KEY_RESULT_DATA, "this", BridgeConstant.KEY_RESULT_DATA}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class TaskCheckSupportVersion$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskCheckSupportVersion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskCheckSupportVersion$execute$1(TaskCheckSupportVersion taskCheckSupportVersion, Continuation<? super TaskCheckSupportVersion$execute$1> continuation) {
        super(continuation);
        this.this$0 = taskCheckSupportVersion;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
