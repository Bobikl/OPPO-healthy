package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.stress.Stress;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.n0j;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineStress;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/stress/Stress;", "c", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineStress extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineStress$fetchData$1 timelineStress$fetchData$1;
        List list;
        final long j3;
        List list2;
        if (continuation instanceof TimelineStress$fetchData$1) {
            timelineStress$fetchData$1 = (TimelineStress$fetchData$1) continuation;
            int i = timelineStress$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineStress$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineStress$fetchData$1 = new TimelineStress$fetchData$1(this, continuation);
            }
        } else {
            timelineStress$fetchData$1 = new TimelineStress$fetchData$1(this, continuation);
        }
        Object obj = timelineStress$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineStress$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            timelineStress$fetchData$1.L$0 = arrayList;
            timelineStress$fetchData$1.L$1 = arrayList2;
            timelineStress$fetchData$1.J$0 = j2;
            timelineStress$fetchData$1.label = 1;
            Object objC = c(j2, timelineStress$fetchData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            obj = objC;
            j3 = j2;
            list2 = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = timelineStress$fetchData$1.J$0;
            list2 = (List) timelineStress$fetchData$1.L$1;
            list = (List) timelineStress$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<Stress> list3 = (List) obj;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineStress$fetchData$onClick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                x0.d().b("/stress/StressHistoryActivity").withString("date", String.valueOf(o05.B(o05.D(j3)))).navigation();
            }
        };
        int i3 = qe0.E() ? 80 : 50;
        boolean z = false;
        long startTimestamp = 0;
        for (Stress stress : list3) {
            int stressValue = stress.getStressValue();
            if (stressValue >= i3 && stress.getStartTimestamp() - startTimestamp > 5400000) {
                startTimestamp = stress.getStartTimestamp();
                a aVar = new a(NodeType.STRESS, stress.getStartTimestamp(), 0L, 4, null);
                aVar.r(R$drawable.operation_timeline_stress);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(qtf.l(R$string.home_tl_stress_value), Arrays.copyOf(new Object[]{Boxing.boxInt(stressValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                aVar.p(str);
                aVar.t(R$string.home_timeline_sticky_stress);
                aVar.s(function0);
                list.add(aVar);
                z = true;
            }
        }
        if (z) {
            list2.add(new n0j(function0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("stress nodes result > ");
        sb.append(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stress tags result > ");
        sb2.append(list2);
        return new TimelineData(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j2, Continuation<? super List<? extends Stress>> continuation) {
        TimelineStress$fetchStressData$1 timelineStress$fetchStressData$1;
        if (continuation instanceof TimelineStress$fetchStressData$1) {
            timelineStress$fetchStressData$1 = (TimelineStress$fetchStressData$1) continuation;
            int i = timelineStress$fetchStressData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineStress$fetchStressData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineStress$fetchStressData$1 = new TimelineStress$fetchStressData$1(this, continuation);
            }
        } else {
            timelineStress$fetchStressData$1 = new TimelineStress$fetchStressData$1(this, continuation);
        }
        Object objC = timelineStress$fetchStressData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineStress$fetchStressData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            if (n05Var.m(j2, System.currentTimeMillis())) {
                jC = System.currentTimeMillis();
            }
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(1017);
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setSortOrder(0);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineStress$fetchStressData$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineStress$fetchStressData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…a(readOption).awaitOnce()");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.stress.Stress>");
        return listB;
    }
}
