package com.oplus.usagecalculate;

import com.oplus.aiunit.vision.cnk;
import com.oplus.drs.core.net.entity.UploadStateAware;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager", f = "UsageCalculatorManager.kt", i = {0}, l = {UploadStateAware.HTTP_DECOMPRESS_FAILED}, m = "fetchAppUsageInfo", n = {"this"}, s = {"L$0"})
final class UsageCalculatorManager$fetchAppUsageInfo$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cnk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$fetchAppUsageInfo$4(cnk cnkVar, Continuation<? super UsageCalculatorManager$fetchAppUsageInfo$4> continuation) {
        super(continuation);
        this.this$0 = cnkVar;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0L, this);
    }
}
