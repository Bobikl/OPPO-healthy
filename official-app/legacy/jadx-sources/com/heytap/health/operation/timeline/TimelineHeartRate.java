package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.HeartRateWarning;
import com.heytap.databaseengine.model.atrialfibril.AtrialFibrilWarn;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.um;
import com.oplus.onet.IONetService;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineHeartRate;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/HeartRateWarning;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/databaseengine/model/atrialfibril/AtrialFibrilWarn;", "d", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineHeartRate extends g0k {
    public static final int $stable = 0;

    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        return CoroutineScopeKt.coroutineScope(new TimelineHeartRate$fetchData$2(this, j2, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j2, Continuation<? super List<? extends AtrialFibrilWarn>> continuation) {
        TimelineHeartRate$fetchAtrialFibrilWarn$1 timelineHeartRate$fetchAtrialFibrilWarn$1;
        if (continuation instanceof TimelineHeartRate$fetchAtrialFibrilWarn$1) {
            timelineHeartRate$fetchAtrialFibrilWarn$1 = (TimelineHeartRate$fetchAtrialFibrilWarn$1) continuation;
            int i = timelineHeartRate$fetchAtrialFibrilWarn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineHeartRate$fetchAtrialFibrilWarn$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineHeartRate$fetchAtrialFibrilWarn$1 = new TimelineHeartRate$fetchAtrialFibrilWarn$1(this, continuation);
            }
        } else {
            timelineHeartRate$fetchAtrialFibrilWarn$1 = new TimelineHeartRate$fetchAtrialFibrilWarn$1(this, continuation);
        }
        Object objC = timelineHeartRate$fetchAtrialFibrilWarn$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineHeartRate$fetchAtrialFibrilWarn$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setSortOrder(1);
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_setAbilityCallback);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            timelineHeartRate$fetchAtrialFibrilWarn$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineHeartRate$fetchAtrialFibrilWarn$1);
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
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.atrialfibril.AtrialFibrilWarn>");
        return listB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j2, Continuation<? super List<? extends HeartRateWarning>> continuation) {
        TimelineHeartRate$fetchHeartRateWarning$1 timelineHeartRate$fetchHeartRateWarning$1;
        if (continuation instanceof TimelineHeartRate$fetchHeartRateWarning$1) {
            timelineHeartRate$fetchHeartRateWarning$1 = (TimelineHeartRate$fetchHeartRateWarning$1) continuation;
            int i = timelineHeartRate$fetchHeartRateWarning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineHeartRate$fetchHeartRateWarning$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineHeartRate$fetchHeartRateWarning$1 = new TimelineHeartRate$fetchHeartRateWarning$1(this, continuation);
            }
        } else {
            timelineHeartRate$fetchHeartRateWarning$1 = new TimelineHeartRate$fetchHeartRateWarning$1(this, continuation);
        }
        Object objC = timelineHeartRate$fetchHeartRateWarning$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineHeartRate$fetchHeartRateWarning$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setDataTable(1019);
            dataReadOption.setSortOrder(1);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineHeartRate$fetchHeartRateWarning$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineHeartRate$fetchHeartRateWarning$1);
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
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.HeartRateWarning>");
        return listB;
    }
}
