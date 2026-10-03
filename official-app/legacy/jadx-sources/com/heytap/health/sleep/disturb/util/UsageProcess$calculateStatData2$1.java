package com.heytap.health.sleep.disturb.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sleep.disturb.util.UsageProcess", f = "UsageProcess.kt", i = {0}, l = {118, 134}, m = "calculateStatData2", n = {"this"}, s = {"L$0"})
public final class UsageProcess$calculateStatData2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UsageProcess this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageProcess$calculateStatData2$1(UsageProcess usageProcess, Continuation<? super UsageProcess$calculateStatData2$1> continuation) {
        super(continuation);
        this.this$0 = usageProcess;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0L, 0L, this);
    }
}
