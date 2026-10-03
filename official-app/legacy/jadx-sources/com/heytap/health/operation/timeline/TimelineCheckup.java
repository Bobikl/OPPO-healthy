package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.AssessmentRecord;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.health.cardiovascular.CardiovascularService;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y93;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006R\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineCheckup;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "d", "Lcom/heytap/health/health/cardiovascular/CardiovascularService;", "Lkotlin/Lazy;", "c", "()Lcom/heytap/health/health/cardiovascular/CardiovascularService;", "cardiovascularService", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineCheckup extends g0k {

    @NotNull
    public static final String KEY_INTENT_60S_RECORD = "KEY_INTENT_60S_RECORD";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy cardiovascularService = LazyKt__LazyJVMKt.lazy(new Function0<CardiovascularService>() { // from class: com.heytap.health.operation.timeline.TimelineCheckup$cardiovascularService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CardiovascularService invoke() {
            Object objNavigation = x0.d().b("/cardiovascular/CardiovascularService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.cardiovascular.CardiovascularService");
            return (CardiovascularService) objNavigation;
        }
    });
    public static final int $stable = 8;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineCheckup$fetchData$1 timelineCheckup$fetchData$1;
        List arrayList;
        List list;
        TimelineCheckup timelineCheckup = this;
        if (continuation instanceof TimelineCheckup$fetchData$1) {
            timelineCheckup$fetchData$1 = (TimelineCheckup$fetchData$1) continuation;
            int i = timelineCheckup$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineCheckup$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineCheckup$fetchData$1 = new TimelineCheckup$fetchData$1(timelineCheckup, continuation);
            }
        } else {
            timelineCheckup$fetchData$1 = new TimelineCheckup$fetchData$1(timelineCheckup, continuation);
        }
        Object obj = timelineCheckup$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineCheckup$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            timelineCheckup$fetchData$1.L$0 = timelineCheckup;
            timelineCheckup$fetchData$1.L$1 = arrayList2;
            timelineCheckup$fetchData$1.L$2 = arrayList;
            timelineCheckup$fetchData$1.label = 1;
            Object objD = timelineCheckup.d(j2, timelineCheckup$fetchData$1);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList2;
            obj = objD;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) timelineCheckup$fetchData$1.L$2;
            list = (List) timelineCheckup$fetchData$1.L$1;
            TimelineCheckup timelineCheckup2 = (TimelineCheckup) timelineCheckup$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
            arrayList = list2;
            timelineCheckup = timelineCheckup2;
        }
        TimelineCheckup$fetchData$onClick$1 timelineCheckup$fetchData$onClick$1 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineCheckup$fetchData$onClick$1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                x0.d().b("/cardiovascular/CardiovascularRecordsActivity").navigation();
            }
        };
        boolean z = false;
        for (final AssessmentRecord assessmentRecord : (List) obj) {
            Integer version = assessmentRecord.getVersion();
            if ((version == null ? 0 : version.intValue()) >= 2) {
                a aVar = new a(NodeType.CHECKUP, assessmentRecord.getEndTimestamp(), 0L, 4, null);
                aVar.r(R$drawable.operation_timeline_checkup);
                if (timelineCheckup.c().Y9(assessmentRecord)) {
                    aVar.p(qtf.l(R$string.home_tl_checkup_abnormal));
                    z = true;
                } else {
                    aVar.p(qtf.l(R$string.home_tl_checkup_no_abnormal));
                }
                aVar.t(R$string.home_timeline_sticky_ecg);
                aVar.s(new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineCheckup$fetchData$2
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
                        Integer version2 = assessmentRecord.getVersion();
                        Intrinsics.checkNotNullExpressionValue(version2, "data.version");
                        x0.d().b(version2.intValue() >= 3 ? "/cardiovascular/QuicklyCheckupDetailV2Activity" : "/cardiovascular/QuicklyCheckupDetailActivity").withParcelable("KEY_INTENT_60S_RECORD", assessmentRecord).navigation();
                    }
                });
                list.add(aVar);
            }
        }
        if (z) {
            arrayList.add(new y93(timelineCheckup$fetchData$onClick$1));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkup nodes result > ");
        sb.append(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkup tags result > ");
        sb2.append(arrayList);
        return new TimelineData(list, arrayList);
    }

    public final CardiovascularService c() {
        return (CardiovascularService) this.cardiovascularService.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j2, Continuation<? super List<? extends AssessmentRecord>> continuation) {
        TimelineCheckup$queryCardiovascularData$1 timelineCheckup$queryCardiovascularData$1;
        if (continuation instanceof TimelineCheckup$queryCardiovascularData$1) {
            timelineCheckup$queryCardiovascularData$1 = (TimelineCheckup$queryCardiovascularData$1) continuation;
            int i = timelineCheckup$queryCardiovascularData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineCheckup$queryCardiovascularData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineCheckup$queryCardiovascularData$1 = new TimelineCheckup$queryCardiovascularData$1(this, continuation);
            }
        } else {
            timelineCheckup$queryCardiovascularData$1 = new TimelineCheckup$queryCardiovascularData$1(this, continuation);
        }
        Object objC = timelineCheckup$queryCardiovascularData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineCheckup$queryCardiovascularData$1.label;
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
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_deInit);
            dataReadOption.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            timelineCheckup$queryCardiovascularData$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineCheckup$queryCardiovascularData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.AssessmentRecord>");
        return listB;
    }
}
