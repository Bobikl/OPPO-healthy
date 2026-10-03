package com.heytap.health.oobe.setups.pair;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oobe.setups.pair.ReportDeviceInfo", f = "ReportDeviceInfo.kt", i = {1, 1}, l = {20, 30, 32}, m = "intercept", n = {"this", "pr"}, s = {"L$0", "L$1"})
public final class ReportDeviceInfo$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReportDeviceInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDeviceInfo$intercept$1(ReportDeviceInfo reportDeviceInfo, Continuation<? super ReportDeviceInfo$intercept$1> continuation) {
        super(continuation);
        this.this$0 = reportDeviceInfo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
