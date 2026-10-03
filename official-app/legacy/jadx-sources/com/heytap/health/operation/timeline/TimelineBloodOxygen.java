package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.Spo2Warning;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.tm1;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import com.oplus.onet.IONetService;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineBloodOxygen;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/Spo2Warning;", "c", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineBloodOxygen extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(final long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineBloodOxygen$fetchData$1 timelineBloodOxygen$fetchData$1;
        List list;
        List list2;
        if (continuation instanceof TimelineBloodOxygen$fetchData$1) {
            timelineBloodOxygen$fetchData$1 = (TimelineBloodOxygen$fetchData$1) continuation;
            int i = timelineBloodOxygen$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineBloodOxygen$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineBloodOxygen$fetchData$1 = new TimelineBloodOxygen$fetchData$1(this, continuation);
            }
        } else {
            timelineBloodOxygen$fetchData$1 = new TimelineBloodOxygen$fetchData$1(this, continuation);
        }
        Object obj = timelineBloodOxygen$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineBloodOxygen$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            timelineBloodOxygen$fetchData$1.L$0 = arrayList;
            timelineBloodOxygen$fetchData$1.L$1 = arrayList2;
            timelineBloodOxygen$fetchData$1.J$0 = j2;
            timelineBloodOxygen$fetchData$1.label = 1;
            Object objC = c(j2, timelineBloodOxygen$fetchData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            obj = objC;
            list2 = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = timelineBloodOxygen$fetchData$1.J$0;
            list2 = (List) timelineBloodOxygen$fetchData$1.L$1;
            list = (List) timelineBloodOxygen$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineBloodOxygen$fetchData$onClick$1
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
                x0.d().b("/bloodoxygen/BloodOxygenHistoryActivity").withString("date", String.valueOf(o05.B(o05.D(j2)))).navigation();
            }
        };
        boolean z = false;
        for (Spo2Warning spo2Warning : (List) obj) {
            a aVar = new a(NodeType.BLOOD_OXYGEN, spo2Warning.getStartTimestamp(), 0L, 4, null);
            aVar.r(R$drawable.operation_timeline_blood_oxygen);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(qtf.l(R$string.home_blood_oxygen_low_value), Arrays.copyOf(new Object[]{spo2Warning.getLowestValue() + "%", spo2Warning.getHighestValue() + "%"}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            aVar.p(str);
            aVar.t(R$string.home_timeline_sticky_heart_warning);
            aVar.s(function0);
            list.add(aVar);
            z = true;
        }
        if (z) {
            list2.add(new tm1(function0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("oxygen nodes result > ");
        sb.append(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("oxygen tags result > ");
        sb2.append(list2);
        return new TimelineData(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j2, Continuation<? super List<? extends Spo2Warning>> continuation) {
        TimelineBloodOxygen$fetchSpo2Warning$1 timelineBloodOxygen$fetchSpo2Warning$1;
        if (continuation instanceof TimelineBloodOxygen$fetchSpo2Warning$1) {
            timelineBloodOxygen$fetchSpo2Warning$1 = (TimelineBloodOxygen$fetchSpo2Warning$1) continuation;
            int i = timelineBloodOxygen$fetchSpo2Warning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineBloodOxygen$fetchSpo2Warning$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineBloodOxygen$fetchSpo2Warning$1 = new TimelineBloodOxygen$fetchSpo2Warning$1(this, continuation);
            }
        } else {
            timelineBloodOxygen$fetchSpo2Warning$1 = new TimelineBloodOxygen$fetchSpo2Warning$1(this, continuation);
        }
        Object objC = timelineBloodOxygen$fetchSpo2Warning$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineBloodOxygen$fetchSpo2Warning$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_removeSenselessConnectionCallback);
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setSortOrder(1);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineBloodOxygen$fetchSpo2Warning$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineBloodOxygen$fetchSpo2Warning$1);
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
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.Spo2Warning>");
        return listB;
    }
}
