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
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager", f = "UsageCalculatorManager.kt", i = {0}, l = {441}, m = "fetchAppUsageInfo", n = {"this"}, s = {"L$0"})
final class UsageCalculatorManager$fetchAppUsageInfo$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hrk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$fetchAppUsageInfo$4(hrk hrkVar, Continuation<? super UsageCalculatorManager$fetchAppUsageInfo$4> continuation) {
        super(continuation);
        this.this$0 = hrkVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= SauAarConstants.I;
        return this.this$0.e(0L, this);
    }
}
