package com.heytap.health.insight.singledimen.heartrate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.health.health.insight.ModuleType;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c49;
import com.oplus.aiunit.vision.eik;
import com.oplus.aiunit.vision.g11;
import com.oplus.aiunit.vision.k39;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.o61;
import com.oplus.aiunit.vision.pf9;
import com.oplus.aiunit.vision.qf9;
import com.oplus.aiunit.vision.rf9;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/insight/singledimen/heartrate/HeartRateModuleLogic;", "Lcom/oplus/aiunit/vision/o61;", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/g11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "Lcom/oplus/aiunit/vision/c49;", "f", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "statusBeanList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", b2n.g, "Lcom/oplus/aiunit/vision/k39;", "Lcom/oplus/aiunit/vision/k39;", "repository", "", "Lkotlin/Lazy;", b2n.f, "()Ljava/util/List;", "visibleContentLogics", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateModuleLogic implements o61 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final k39 repository = new k39();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy visibleContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<g11>>() { // from class: com.heytap.health.insight.singledimen.heartrate.HeartRateModuleLogic$visibleContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<g11> invoke() {
            return new ArrayList();
        }
    });

    @Override // com.oplus.aiunit.vision.o61
    @NotNull
    public ModuleType a() {
        return ModuleType.HEART_RATE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.o61
    @Nullable
    public Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends g11>> continuation) {
        HeartRateModuleLogic$countContentLogic$1 heartRateModuleLogic$countContentLogic$1;
        RelativeDateRange relativeDateRangeJ;
        RelativeDateRange relativeDateRange;
        RelativeDateRange relativeDateRange2;
        RelativeDateRange relativeDateRange3;
        if (continuation instanceof HeartRateModuleLogic$countContentLogic$1) {
            heartRateModuleLogic$countContentLogic$1 = (HeartRateModuleLogic$countContentLogic$1) continuation;
            int i = heartRateModuleLogic$countContentLogic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heartRateModuleLogic$countContentLogic$1.label = i - Integer.MIN_VALUE;
            } else {
                heartRateModuleLogic$countContentLogic$1 = new HeartRateModuleLogic$countContentLogic$1(this, continuation);
            }
        } else {
            heartRateModuleLogic$countContentLogic$1 = new HeartRateModuleLogic$countContentLogic$1(this, continuation);
        }
        HeartRateModuleLogic$countContentLogic$1 heartRateModuleLogic$countContentLogic$2 = heartRateModuleLogic$countContentLogic$1;
        Object obj = heartRateModuleLogic$countContentLogic$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = heartRateModuleLogic$countContentLogic$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            g().clear();
            LocalDate anchorYesterday = localDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(anchorYesterday, "anchorYesterday");
            RelativeDateRange relativeDateRangeT = o05.t(anchorYesterday);
            RelativeDateRange relativeDateRangeJ2 = o05.J(anchorYesterday);
            RelativeDateRange relativeDateRangeT2 = o05.t(localDate);
            relativeDateRangeJ = o05.J(localDate);
            long jX = o05.x(relativeDateRangeT.f());
            long jG = o05.g(localDate);
            heartRateModuleLogic$countContentLogic$2.L$0 = this;
            heartRateModuleLogic$countContentLogic$2.L$1 = relativeDateRangeT;
            heartRateModuleLogic$countContentLogic$2.L$2 = relativeDateRangeJ2;
            heartRateModuleLogic$countContentLogic$2.L$3 = relativeDateRangeT2;
            heartRateModuleLogic$countContentLogic$2.L$4 = relativeDateRangeJ;
            heartRateModuleLogic$countContentLogic$2.label = 1;
            Object objF = f(jX, jG, heartRateModuleLogic$countContentLogic$2);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
            relativeDateRange = relativeDateRangeJ2;
            relativeDateRange2 = relativeDateRangeT;
            obj = objF;
            relativeDateRange3 = relativeDateRangeT2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RelativeDateRange relativeDateRange4 = (RelativeDateRange) heartRateModuleLogic$countContentLogic$2.L$4;
            relativeDateRange3 = (RelativeDateRange) heartRateModuleLogic$countContentLogic$2.L$3;
            relativeDateRange = (RelativeDateRange) heartRateModuleLogic$countContentLogic$2.L$2;
            relativeDateRange2 = (RelativeDateRange) heartRateModuleLogic$countContentLogic$2.L$1;
            HeartRateModuleLogic heartRateModuleLogic = (HeartRateModuleLogic) heartRateModuleLogic$countContentLogic$2.L$0;
            ResultKt.throwOnFailure(obj);
            relativeDateRangeJ = relativeDateRange4;
            this = heartRateModuleLogic;
        }
        List list = (List) obj;
        pf9 pf9Var = new pf9(relativeDateRange2, relativeDateRange, list);
        if (pf9Var.n() != null) {
            Boxing.boxBoolean(this.g().add(pf9Var));
        }
        qf9 qf9Var = new qf9(relativeDateRange3, relativeDateRangeJ, list);
        if (qf9Var.n() != null) {
            Boxing.boxBoolean(this.g().add(qf9Var));
        }
        rf9 rf9Var = new rf9(relativeDateRange2, relativeDateRange, list);
        if (rf9Var.n() != null) {
            Boxing.boxBoolean(this.g().add(rf9Var));
        }
        return this.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object f(long j2, long j3, Continuation<? super List<? extends c49>> continuation) {
        HeartRateModuleLogic$fetchHeartRateData$1 heartRateModuleLogic$fetchHeartRateData$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof HeartRateModuleLogic$fetchHeartRateData$1) {
            heartRateModuleLogic$fetchHeartRateData$1 = (HeartRateModuleLogic$fetchHeartRateData$1) continuation;
            int i = heartRateModuleLogic$fetchHeartRateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heartRateModuleLogic$fetchHeartRateData$1.label = i - Integer.MIN_VALUE;
            } else {
                heartRateModuleLogic$fetchHeartRateData$1 = new HeartRateModuleLogic$fetchHeartRateData$1(this, continuation);
            }
        } else {
            heartRateModuleLogic$fetchHeartRateData$1 = new HeartRateModuleLogic$fetchHeartRateData$1(this, continuation);
        }
        Object obj = heartRateModuleLogic$fetchHeartRateData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = heartRateModuleLogic$fetchHeartRateData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            HeartRateModuleLogic$fetchHeartRateData$2 heartRateModuleLogic$fetchHeartRateData$2 = new HeartRateModuleLogic$fetchHeartRateData$2(objectRef2, this, j2, j3, 4, null);
            heartRateModuleLogic$fetchHeartRateData$1.L$0 = objectRef2;
            heartRateModuleLogic$fetchHeartRateData$1.label = 1;
            if (SupervisorKt.supervisorScope(heartRateModuleLogic$fetchHeartRateData$2, heartRateModuleLogic$fetchHeartRateData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) heartRateModuleLogic$fetchHeartRateData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    public final List<g11> g() {
        return (List) this.visibleContentLogics.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<c49> h(List<? extends c49> statusBeanList, List<? extends SleepIndex> sleepIndexList) {
        for (c49 c49Var : statusBeanList) {
            long jK = c49Var.k();
            long j2 = 86400000 + jK;
            if (c49Var.a() <= 0) {
                for (SleepIndex sleepIndex : sleepIndexList) {
                    if (sleepIndex.getDataTimestamp() >= jK && sleepIndex.getDataTimestamp() < j2) {
                        c49Var.m(eik.b(sleepIndex.getAvgSleepHeartRate()));
                        break;
                    }
                }
            }
        }
        return statusBeanList;
    }
}
