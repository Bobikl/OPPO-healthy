package com.oplus.usagecalculate;

import com.oplus.aiunit.vision.hrk;
import com.oplusos.sau.common.utils.SauAarConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager", f = "UsageCalculatorManager.kt", i = {}, l = {239, 245}, m = "fetchAppUsageInfoInner", n = {}, s = {})
final class UsageCalculatorManager$fetchAppUsageInfoInner$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hrk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$fetchAppUsageInfoInner$1(hrk hrkVar, Continuation<? super UsageCalculatorManager$fetchAppUsageInfoInner$1> continuation) {
        super(continuation);
        this.this$0 = hrkVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= SauAarConstants.I;
        return this.this$0.f(0L, 0L, false, false, this);
    }
}
