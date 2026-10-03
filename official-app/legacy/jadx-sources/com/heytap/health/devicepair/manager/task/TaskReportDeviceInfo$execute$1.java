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
@DebugMetadata(c = "com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo", f = "TaskReportDeviceInfo.kt", i = {0, 1, 1}, l = {45, 50}, m = "execute", n = {"this", "this", BridgeConstant.KEY_RESULT_DATA}, s = {"L$0", "L$0", "L$1"})
public final class TaskReportDeviceInfo$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskReportDeviceInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskReportDeviceInfo$execute$1(TaskReportDeviceInfo taskReportDeviceInfo, Continuation<? super TaskReportDeviceInfo$execute$1> continuation) {
        super(continuation);
        this.this$0 = taskReportDeviceInfo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
