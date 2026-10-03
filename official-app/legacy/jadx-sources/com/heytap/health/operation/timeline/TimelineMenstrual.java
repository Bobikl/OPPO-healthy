package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual.data.PeriodCloseStatus;
import com.heytap.health.menstrual.inter.MenstrualService;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.Cycle;
import com.oplus.aiunit.vision.Period;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.iub;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineMenstrual;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/menstrual/inter/MenstrualService;", "Lkotlin/Lazy;", "b", "()Lcom/heytap/health/menstrual/inter/MenstrualService;", "menstrualService", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineMenstrual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineMenstrual.kt\ncom/heytap/health/operation/timeline/TimelineMenstrual\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n288#2,2:49\n*S KotlinDebug\n*F\n+ 1 TimelineMenstrual.kt\ncom/heytap/health/operation/timeline/TimelineMenstrual\n*L\n29#1:49,2\n*E\n"})
public final class TimelineMenstrual extends g0k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy menstrualService = LazyKt__LazyJVMKt.lazy(new Function0<MenstrualService>() { // from class: com.heytap.health.operation.timeline.TimelineMenstrual$menstrualService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MenstrualService invoke() {
            Object objNavigation = x0.d().b("/menstrual/MenstrualService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.menstrual.inter.MenstrualService");
            return (MenstrualService) objNavigation;
        }
    });
    public static final int $stable = 8;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineMenstrual$fetchData$1 timelineMenstrual$fetchData$1;
        List list;
        Object next;
        Cycle cycle;
        if (continuation instanceof TimelineMenstrual$fetchData$1) {
            timelineMenstrual$fetchData$1 = (TimelineMenstrual$fetchData$1) continuation;
            int i = timelineMenstrual$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineMenstrual$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineMenstrual$fetchData$1 = new TimelineMenstrual$fetchData$1(this, continuation);
            }
        } else {
            timelineMenstrual$fetchData$1 = new TimelineMenstrual$fetchData$1(this, continuation);
        }
        Object obj = timelineMenstrual$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineMenstrual$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            MenstrualService menstrualServiceB = b();
            timelineMenstrual$fetchData$1.L$0 = arrayList;
            timelineMenstrual$fetchData$1.J$0 = j2;
            timelineMenstrual$fetchData$1.label = 1;
            Object objV1 = menstrualServiceB.v1(timelineMenstrual$fetchData$1);
            if (objV1 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objV1;
            list = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = timelineMenstrual$fetchData$1.J$0;
            list = (List) timelineMenstrual$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Iterator it = ((List) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cycle = (Cycle) next;
        } while (!o05.l(j2, cycle.getStartDate(), cycle.getEndDate()));
        Cycle cycle2 = (Cycle) next;
        if (cycle2 == null) {
            return new TimelineData(CollectionsKt__CollectionsKt.emptyList(), list);
        }
        for (Period period : cycle2.e()) {
            if (o05.l(j2, period.getStartDate(), period.getEndDate()) && period.getCloseStatus() != PeriodCloseStatus.PREDICT) {
                list.add(new iub(qtf.m(R$string.home_menstrual_num_day, o05.d(period.getStartDate(), j2)), new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineMenstrual$fetchData$2
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        x0.d().b("/menstrual_period/MenstrualDetailActivity").navigation();
                    }
                }));
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("menstrual tag result > ");
        sb.append(list);
        return new TimelineData(CollectionsKt__CollectionsKt.emptyList(), list);
    }

    public final MenstrualService b() {
        return (MenstrualService) this.menstrualService.getValue();
    }
}
