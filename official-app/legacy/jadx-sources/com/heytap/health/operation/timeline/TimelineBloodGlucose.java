package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.ck1;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
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
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineBloodGlucose;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarWarning;", "c", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineBloodGlucose extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineBloodGlucose$fetchData$1 timelineBloodGlucose$fetchData$1;
        List list;
        final long j3;
        List list2;
        if (continuation instanceof TimelineBloodGlucose$fetchData$1) {
            timelineBloodGlucose$fetchData$1 = (TimelineBloodGlucose$fetchData$1) continuation;
            int i = timelineBloodGlucose$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineBloodGlucose$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineBloodGlucose$fetchData$1 = new TimelineBloodGlucose$fetchData$1(this, continuation);
            }
        } else {
            timelineBloodGlucose$fetchData$1 = new TimelineBloodGlucose$fetchData$1(this, continuation);
        }
        Object obj = timelineBloodGlucose$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineBloodGlucose$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            timelineBloodGlucose$fetchData$1.L$0 = arrayList;
            timelineBloodGlucose$fetchData$1.L$1 = arrayList2;
            timelineBloodGlucose$fetchData$1.J$0 = j2;
            timelineBloodGlucose$fetchData$1.label = 1;
            Object objC = c(j2, timelineBloodGlucose$fetchData$1);
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
            j3 = timelineBloodGlucose$fetchData$1.J$0;
            list2 = (List) timelineBloodGlucose$fetchData$1.L$1;
            list = (List) timelineBloodGlucose$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineBloodGlucose$fetchData$onClick$1
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
                x0.d().b("/blood_glucose/BloodGlucoseHistoryActivity").withString("date", String.valueOf(o05.B(o05.D(j3)))).navigation();
            }
        };
        boolean z = false;
        boolean z2 = false;
        for (BloodSugarWarning bloodSugarWarning : (List) obj) {
            a aVar = new a(NodeType.BLOOD_GLUCOSE, bloodSugarWarning.getTimestamp(), 0L, 4, null);
            aVar.r(R$drawable.operation_timeline_blood_glucose);
            aVar.s(function0);
            if (bloodSugarWarning.getWarningType() == 2) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(qtf.l(R$string.home_tl_blood_glucose_warning_high_value), Arrays.copyOf(new Object[]{bloodSugarWarning.getValue()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                aVar.p(str);
                aVar.t(R$string.home_timeline_sticky_heart_warning);
                list.add(aVar);
                z = true;
            } else if (bloodSugarWarning.getWarningType() == 1) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format(qtf.l(R$string.home_tl_blood_glucose_warning_low_value), Arrays.copyOf(new Object[]{bloodSugarWarning.getValue()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                aVar.p(str2);
                aVar.t(R$string.home_timeline_sticky_heart_warning);
                list.add(aVar);
                z2 = true;
            }
        }
        if (z) {
            list2.add(new ck1(qtf.l(R$string.home_tl_tag_blood_glucose_warning_high), function0));
        }
        if (z2) {
            list2.add(new ck1(qtf.l(R$string.home_tl_tag_blood_glucose_warning_low), function0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("blood glucose nodes result > ");
        sb.append(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("blood glucose tags result > ");
        sb2.append(list2);
        return new TimelineData(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j2, Continuation<? super List<BloodSugarWarning>> continuation) {
        TimelineBloodGlucose$queryBloodGlucoseWarning$1 timelineBloodGlucose$queryBloodGlucoseWarning$1;
        if (continuation instanceof TimelineBloodGlucose$queryBloodGlucoseWarning$1) {
            timelineBloodGlucose$queryBloodGlucoseWarning$1 = (TimelineBloodGlucose$queryBloodGlucoseWarning$1) continuation;
            int i = timelineBloodGlucose$queryBloodGlucoseWarning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineBloodGlucose$queryBloodGlucoseWarning$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineBloodGlucose$queryBloodGlucoseWarning$1 = new TimelineBloodGlucose$queryBloodGlucoseWarning$1(this, continuation);
            }
        } else {
            timelineBloodGlucose$queryBloodGlucoseWarning$1 = new TimelineBloodGlucose$queryBloodGlucoseWarning$1(this, continuation);
        }
        Object objC = timelineBloodGlucose$queryBloodGlucoseWarning$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineBloodGlucose$queryBloodGlucoseWarning$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(1060);
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineBloodGlucose$queryBloodGlucoseWarning$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineBloodGlucose$queryBloodGlucoseWarning$1);
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
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning>");
        return listB;
    }
}
