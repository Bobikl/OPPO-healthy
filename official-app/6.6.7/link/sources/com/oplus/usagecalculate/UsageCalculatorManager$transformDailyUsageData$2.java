package com.oplus.usagecalculate;

import android.util.ArrayMap;
import com.oplus.aiunit.vision.e15;
import com.oplus.aiunit.vision.hrk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/util/ArrayMap;", "", "", "Lcom/oplus/aiunit/vision/e15;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager$transformDailyUsageData$2", f = "UsageCalculatorManager.kt", i = {0, 0, 0, 0, 0}, l = {384}, m = "invokeSuspend", n = {"filterUsage", "dateArray", "$this$forEachIndexed$iv", "index$iv", "index"}, s = {"L$0", "L$1", "L$2", "I$0", "I$3"})
final class UsageCalculatorManager$transformDailyUsageData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayMap<String, Map<String, ? extends Map<String, ? extends e15>>>>, Object> {
    final /* synthetic */ long $beginTime;
    final /* synthetic */ long $endTime;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ hrk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$transformDailyUsageData$2(long j, long j2, hrk hrkVar, Continuation<? super UsageCalculatorManager$transformDailyUsageData$2> continuation) {
        super(2, continuation);
        this.$beginTime = j;
        this.$endTime = j2;
        this.this$0 = hrkVar;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        UsageCalculatorManager$transformDailyUsageData$2 usageCalculatorManager$transformDailyUsageData$2 = new UsageCalculatorManager$transformDailyUsageData$2(this.$beginTime, this.$endTime, this.this$0, continuation);
        usageCalculatorManager$transformDailyUsageData$2.L$0 = obj;
        return usageCalculatorManager$transformDailyUsageData$2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0124  */
    /* JADX WARN: Code duplicated, block: B:33:0x012e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0131  */
    /* JADX WARN: Code duplicated, block: B:36:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x014c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0151  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x012e -> B:39:0x014f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x014c -> B:38:0x014d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oplus.usagecalculate.UsageCalculatorManager$transformDailyUsageData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ArrayMap<String, Map<String, Map<String, e15>>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
