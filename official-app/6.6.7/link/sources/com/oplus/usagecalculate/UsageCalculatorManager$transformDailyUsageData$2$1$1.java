package com.oplus.usagecalculate;

import android.content.Context;
import com.oplus.aiunit.vision.e15;
import com.oplus.aiunit.vision.hrk;
import com.oplus.aiunit.vision.n4b;
import com.oplus.aiunit.vision.zp2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "Lcom/oplus/aiunit/vision/e15;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager$transformDailyUsageData$2$1$1", f = "UsageCalculatorManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsageCalculatorManager$transformDailyUsageData$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Map<String, ? extends e15>>>, Object> {
    final /* synthetic */ long $beginTime;
    final /* synthetic */ String $date;
    final /* synthetic */ long $dateEndTime;
    final /* synthetic */ long $dateStartTime;
    final /* synthetic */ long $endTime;
    final /* synthetic */ List<String> $showAppPackages;
    int label;
    final /* synthetic */ hrk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$transformDailyUsageData$2$1$1(String str, hrk hrkVar, long j, long j2, long j3, long j4, List<String> list, Continuation<? super UsageCalculatorManager$transformDailyUsageData$2$1$1> continuation) {
        super(2, continuation);
        this.$date = str;
        this.this$0 = hrkVar;
        this.$dateStartTime = j;
        this.$beginTime = j2;
        this.$dateEndTime = j3;
        this.$endTime = j4;
        this.$showAppPackages = list;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UsageCalculatorManager$transformDailyUsageData$2$1$1(this.$date, this.this$0, this.$dateStartTime, this.$beginTime, this.$dateEndTime, this.$endTime, this.$showAppPackages, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        zp2.a("UsageCalculatorManager", "date = " + ((Object) this.$date) + " start date loading usage");
        Context context = this.this$0.a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        Map mapE = n4b.e(context, Math.max(this.$dateStartTime, this.$beginTime), Math.min(this.$dateEndTime, this.$endTime), CollectionsKt.listOf(this.$date), null, (32 & 32) != 0 ? false : false);
        zp2.a("UsageCalculatorManager", "date = " + ((Object) this.$date) + " end date loading usage");
        zp2.a("UsageCalculatorManager", "date = " + ((Object) this.$date) + " start filter loading usage");
        String str = this.$date;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapE.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        hrk hrkVar = this.this$0;
        List<String> list = this.$showAppPackages;
        Intrinsics.checkNotNullExpressionValue(list, "showAppPackages");
        Map map = (Map) hrkVar.h(list, linkedHashMap).get(this.$date);
        zp2.a("UsageCalculatorManager", "date = " + ((Object) this.$date) + " end filter loading usage");
        return map;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Map<String, ? extends Map<String, e15>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
