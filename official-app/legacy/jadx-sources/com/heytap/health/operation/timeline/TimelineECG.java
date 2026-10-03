package com.heytap.health.operation.timeline;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.heytap.health.operation.operation.OperationWebViewActivity;
import com.heytap.health.operations.router.providers.IECGService;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.hb6;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.nc6;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.s04;
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
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineECG;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/ECGRecord;", "c", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineECG extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineECG$fetchData$1 timelineECG$fetchData$1;
        List list;
        List list2;
        if (continuation instanceof TimelineECG$fetchData$1) {
            timelineECG$fetchData$1 = (TimelineECG$fetchData$1) continuation;
            int i = timelineECG$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineECG$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineECG$fetchData$1 = new TimelineECG$fetchData$1(this, continuation);
            }
        } else {
            timelineECG$fetchData$1 = new TimelineECG$fetchData$1(this, continuation);
        }
        Object obj = timelineECG$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineECG$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            timelineECG$fetchData$1.L$0 = arrayList;
            timelineECG$fetchData$1.L$1 = arrayList2;
            timelineECG$fetchData$1.label = 1;
            Object objC = c(j2, timelineECG$fetchData$1);
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
            list2 = (List) timelineECG$fetchData$1.L$1;
            list = (List) timelineECG$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        TimelineECG$fetchData$onClick$1 timelineECG$fetchData$onClick$1 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineECG$fetchData$onClick$1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((IECGService) x0.d().h(IECGService.class)).M(true, null);
            }
        };
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"1", "2", "3", "4", "5", "6", "7", s04.VIA_SHARE_TYPE_PUBLISHVIDEO});
        boolean z = false;
        for (final ECGRecord eCGRecord : (List) obj) {
            if (nc6.b(eCGRecord)) {
                a aVar = new a(NodeType.ECG, eCGRecord.getStartTimestamp(), 0L, 4, null);
                aVar.r(R$drawable.operation_timeline_ecg);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(qtf.l(R$string.home_tl_ecg_result), Arrays.copyOf(new Object[]{eCGRecord.getEcgResultName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                aVar.p(str);
                aVar.t(R$string.home_timeline_sticky_ecg);
                aVar.s(new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineECG$fetchData$2
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
                        Context contextA = b78.a();
                        Intent intent = new Intent(contextA, (Class<?>) OperationWebViewActivity.class);
                        intent.addFlags(268435456);
                        intent.putExtra("jumpUrl", "ecg/index.html?page=EcgRecord&id=" + eCGRecord.getClientDataId());
                        contextA.startActivity(intent);
                    }
                });
                list.add(aVar);
                if (!z && !TextUtils.isEmpty(eCGRecord.getEcgResultId()) && listListOf.contains(eCGRecord.getEcgResultId())) {
                    z = true;
                }
            }
        }
        if (z) {
            list2.add(new hb6(timelineECG$fetchData$onClick$1));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ecg nodes result > ");
        sb.append(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ecg tags result > ");
        sb2.append(list2);
        return new TimelineData(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j2, Continuation<? super List<? extends ECGRecord>> continuation) {
        TimelineECG$fetchEcgRecord$1 timelineECG$fetchEcgRecord$1;
        if (continuation instanceof TimelineECG$fetchEcgRecord$1) {
            timelineECG$fetchEcgRecord$1 = (TimelineECG$fetchEcgRecord$1) continuation;
            int i = timelineECG$fetchEcgRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineECG$fetchEcgRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineECG$fetchEcgRecord$1 = new TimelineECG$fetchEcgRecord$1(this, continuation);
            }
        } else {
            timelineECG$fetchEcgRecord$1 = new TimelineECG$fetchEcgRecord$1(this, continuation);
        }
        Object objC = timelineECG$fetchEcgRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineECG$fetchEcgRecord$1.label;
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
            dataReadOption.setDataTable(1012);
            dataReadOption.setEndTime(jC);
            dataReadOption.setStartTime(jD);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            timelineECG$fetchEcgRecord$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineECG$fetchEcgRecord$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…hData(option).awaitOnce()");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.ECGRecord>");
        return listB;
    }
}
