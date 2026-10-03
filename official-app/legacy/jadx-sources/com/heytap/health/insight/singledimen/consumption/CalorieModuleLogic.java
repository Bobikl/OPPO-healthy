package com.heytap.health.insight.singledimen.consumption;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.bean.ConsumptionCompareData;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.CalorieDateRangeStat;
import com.oplus.aiunit.vision.CalorieStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cz9;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.g11;
import com.oplus.aiunit.vision.hu2;
import com.oplus.aiunit.vision.lu2;
import com.oplus.aiunit.vision.m05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.o61;
import com.oplus.aiunit.vision.r24;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002J\u0016\u0010\u0013\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/heytap/health/insight/singledimen/consumption/CalorieModuleLogic;", "Lcom/oplus/aiunit/vision/o61;", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/g11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/dlf;", "dateRange", "Lcom/oplus/aiunit/vision/iu2;", "i", "Lcom/heytap/health/daily/bean/ConsumptionCompareData;", "statList", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "f", "", "startTime", "endTime", "", b2n.g, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "dataList", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/hu2;", "Lkotlin/Lazy;", LogFieldKey.LEVEL_KEY, "()Ljava/util/List;", "valuableContentLogics", "", LogFieldKey.MESSAGE_KEY, "visibleContentLogics", "Lcom/oplus/aiunit/vision/r24;", "c", "j", "()Lcom/oplus/aiunit/vision/r24;", "repository", "d", "Ljava/util/List;", "last2MonthDataList", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCalorieModuleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalorieModuleLogic.kt\ncom/heytap/health/insight/singledimen/consumption/CalorieModuleLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n1855#2:163\n1856#2:165\n766#2:166\n857#2,2:167\n766#2:169\n857#2,2:170\n766#2:172\n857#2,2:173\n766#2:186\n857#2,2:187\n1#3:164\n314#4,11:175\n*S KotlinDebug\n*F\n+ 1 CalorieModuleLogic.kt\ncom/heytap/health/insight/singledimen/consumption/CalorieModuleLogic\n*L\n70#1:163\n70#1:165\n109#1:166\n109#1:167,2\n113#1:169\n113#1:170,2\n118#1:172\n118#1:173,2\n153#1:186\n153#1:187,2\n128#1:175,11\n*E\n"})
public final class CalorieModuleLogic implements o61 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy valuableContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<? extends hu2>>() { // from class: com.heytap.health.insight.singledimen.consumption.CalorieModuleLogic$valuableContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends hu2> invoke() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new hu2[]{new CalorieTrendLogic(), new lu2()});
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy visibleContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<g11>>() { // from class: com.heytap.health.insight.singledimen.consumption.CalorieModuleLogic$visibleContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<g11> invoke() {
            return new ArrayList();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy repository = LazyKt__LazyJVMKt.lazy(new Function0<r24>() { // from class: com.heytap.health.insight.singledimen.consumption.CalorieModuleLogic$repository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final r24 invoke() {
            return new r24();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<ConsumptionCompareData> last2MonthDataList = CollectionsKt__CollectionsKt.emptyList();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/heytap/health/daily/bean/ConsumptionCompareData;", "kotlin.jvm.PlatformType", "", "timeStampedDataList", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b implements cz9 {
        public final /* synthetic */ CancellableContinuation<Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.b = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.cz9
        public final void a(List<ConsumptionCompareData> timeStampedDataList) {
            a7b.f("CalorieModuleLogic", "fetchConsumptionHistoryData. result size=" + timeStampedDataList.size());
            StringBuilder sb = new StringBuilder();
            sb.append("fetchConsumptionHistoryData. timeStampedDataList=");
            sb.append(timeStampedDataList);
            CalorieModuleLogic calorieModuleLogic = CalorieModuleLogic.this;
            Intrinsics.checkNotNullExpressionValue(timeStampedDataList, "timeStampedDataList");
            calorieModuleLogic.last2MonthDataList = timeStampedDataList;
            CancellableContinuation<Unit> cancellableContinuation = this.b;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // com.oplus.aiunit.vision.o61
    @NotNull
    public ModuleType a() {
        return ModuleType.CONSUMPTION;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.o61
    @Nullable
    public Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends g11>> continuation) {
        CalorieModuleLogic$countContentLogic$1 calorieModuleLogic$countContentLogic$1;
        long jCurrentTimeMillis;
        RelativeDateRange relativeDateRange;
        RelativeDateRange relativeDateRange2;
        if (continuation instanceof CalorieModuleLogic$countContentLogic$1) {
            calorieModuleLogic$countContentLogic$1 = (CalorieModuleLogic$countContentLogic$1) continuation;
            int i = calorieModuleLogic$countContentLogic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                calorieModuleLogic$countContentLogic$1.label = i - Integer.MIN_VALUE;
            } else {
                calorieModuleLogic$countContentLogic$1 = new CalorieModuleLogic$countContentLogic$1(this, continuation);
            }
        } else {
            calorieModuleLogic$countContentLogic$1 = new CalorieModuleLogic$countContentLogic$1(this, continuation);
        }
        CalorieModuleLogic$countContentLogic$1 calorieModuleLogic$countContentLogic$2 = calorieModuleLogic$countContentLogic$1;
        Object obj = calorieModuleLogic$countContentLogic$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = calorieModuleLogic$countContentLogic$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f("CalorieModuleLogic", "Calorie countContentLogic begin, queryDate=" + localDate);
            LocalDate anchorDate = localDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(anchorDate, "anchorDate");
            RelativeDateRange relativeDateRangeT = o05.t(anchorDate);
            RelativeDateRange relativeDateRangeJ = o05.J(anchorDate);
            long jX = o05.x(relativeDateRangeT.f());
            long jG = o05.g(anchorDate);
            calorieModuleLogic$countContentLogic$2.L$0 = this;
            calorieModuleLogic$countContentLogic$2.L$1 = relativeDateRangeT;
            calorieModuleLogic$countContentLogic$2.L$2 = relativeDateRangeJ;
            calorieModuleLogic$countContentLogic$2.J$0 = jCurrentTimeMillis;
            calorieModuleLogic$countContentLogic$2.label = 1;
            if (h(jX, jG, calorieModuleLogic$countContentLogic$2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            relativeDateRange = relativeDateRangeT;
            relativeDateRange2 = relativeDateRangeJ;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = calorieModuleLogic$countContentLogic$2.J$0;
            relativeDateRange2 = (RelativeDateRange) calorieModuleLogic$countContentLogic$2.L$2;
            relativeDateRange = (RelativeDateRange) calorieModuleLogic$countContentLogic$2.L$1;
            CalorieModuleLogic calorieModuleLogic = (CalorieModuleLogic) calorieModuleLogic$countContentLogic$2.L$0;
            ResultKt.throwOnFailure(obj);
            jCurrentTimeMillis = j2;
            this = calorieModuleLogic;
        }
        CalorieDateRangeStat calorieDateRangeStatI = this.i(relativeDateRange);
        CalorieDateRangeStat calorieDateRangeStatI2 = this.i(relativeDateRange2);
        this.m().clear();
        StringBuilder sb = new StringBuilder();
        sb.append("monthStat=");
        sb.append(calorieDateRangeStatI);
        sb.append("  weekStat=");
        sb.append(calorieDateRangeStatI2);
        for (hu2 hu2Var : this.l()) {
            if (hu2Var.o(relativeDateRange, relativeDateRange2, calorieDateRangeStatI, calorieDateRangeStatI2) != null) {
                this.m().add(hu2Var);
            }
        }
        int size = this.m().size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("countContentLogic visibleContentLogics size is ");
        sb2.append(size);
        a7b.f("CalorieModuleLogic", "Calorie countContentLogic end, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return this.m();
    }

    public final int e(List<ConsumptionCompareData> statList) {
        double calorie;
        List<ConsumptionCompareData> list = statList;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            calorie = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ConsumptionCompareData) next).getCalorie() > 0.0d) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            calorie += ((ConsumptionCompareData) it2.next()).getCalorie();
        }
        return ((int) calorie) / RangesKt___RangesKt.coerceAtLeast(size, 1);
    }

    public final int f(List<ConsumptionCompareData> statList) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : statList) {
            ConsumptionCompareData consumptionCompareData = (ConsumptionCompareData) obj;
            if (consumptionCompareData.getCalorieGoal() > 0 && consumptionCompareData.getCalorie() >= ((double) consumptionCompareData.getCalorieGoal())) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final int g(List<ConsumptionCompareData> statList) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : statList) {
            if (((ConsumptionCompareData) obj).getCalorie() > ((double) 50)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final Object h(long j2, long j3, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        a7b.f("CalorieModuleLogic", "fetchConsumptionHistoryData. startTime=" + j2 + ", endTime=" + j3);
        j().o(4, j2, j3, new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final CalorieDateRangeStat i(RelativeDateRange dateRange) {
        List<ConsumptionCompareData> listK = k(dateRange.f(), dateRange.e(), this.last2MonthDataList);
        List<ConsumptionCompareData> listK2 = k(dateRange.h(), dateRange.g(), this.last2MonthDataList);
        return new CalorieDateRangeStat(new CalorieStat(o05.H(dateRange.f()), g(listK), e(listK), f(listK)), new CalorieStat(o05.H(dateRange.h()), g(listK2), e(listK2), f(listK2)), listK, listK2);
    }

    public final r24 j() {
        return (r24) this.repository.getValue();
    }

    public final List<ConsumptionCompareData> k(LocalDate startDate, LocalDate endDate, List<ConsumptionCompareData> dataList) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : dataList) {
            m05.Companion companion = m05.INSTANCE;
            if (companion.v(startDate, endDate, companion.j(((ConsumptionCompareData) obj).getTimestamp()))) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    public final List<hu2> l() {
        return (List) this.valuableContentLogics.getValue();
    }

    public final List<g11> m() {
        return (List) this.visibleContentLogics.getValue();
    }
}
