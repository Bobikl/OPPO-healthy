package com.heytap.health.core.provider.model;

import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.core.provider.adapter.open.HeartRateAdapter;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.wq8;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/core/provider/model/HeartRateModel;", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/lbd;", "", "Lcom/heytap/databaseengine/model/HeartRate;", "c", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateModel {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/HeartRate;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements d08 {
        public static final a<T, R> INSTANCE = new a<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<HeartRate> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            ArrayList arrayList = new ArrayList();
            if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.HeartRate>");
                arrayList.addAll((List) obj);
            }
            a7b.f(HeartRateAdapter.TAG, "getLastHeartRateData code:" + commonBackBean.getErrorCode() + ", size:" + arrayList.size());
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/HeartRate;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<HeartRate> apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a7b.f(HeartRateAdapter.TAG, "getLastHeartRateData error:" + it.getMessage());
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Continuation<? super String> continuation) throws Throwable {
        HeartRateModel$getLastHeartRateData$1 heartRateModel$getLastHeartRateData$1;
        if (continuation instanceof HeartRateModel$getLastHeartRateData$1) {
            heartRateModel$getLastHeartRateData$1 = (HeartRateModel$getLastHeartRateData$1) continuation;
            int i = heartRateModel$getLastHeartRateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heartRateModel$getLastHeartRateData$1.label = i - Integer.MIN_VALUE;
            } else {
                heartRateModel$getLastHeartRateData$1 = new HeartRateModel$getLastHeartRateData$1(this, continuation);
            }
        } else {
            heartRateModel$getLastHeartRateData$1 = new HeartRateModel$getLastHeartRateData$1(this, continuation);
        }
        Object objWithContext = heartRateModel$getLastHeartRateData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = heartRateModel$getLastHeartRateData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("HRProvider");
            HeartRateModel$getLastHeartRateData$2 heartRateModel$getLastHeartRateData$2 = new HeartRateModel$getLastHeartRateData$2(this, null);
            heartRateModel$getLastHeartRateData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, heartRateModel$getLastHeartRateData$2, heartRateModel$getLastHeartRateData$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun getLastHeart…       \"\"\n        }\n    }");
        return objWithContext;
    }

    public final lbd<List<HeartRate>> c() {
        a7b.f(HeartRateAdapter.TAG, "getLastHeartRateData start...");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setStartTime(0L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1008);
        dataReadOption.setSortOrder(1);
        dataReadOption.setDataReadType("one_day_or_one_data");
        lbd<List<HeartRate>> lbdVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(a.INSTANCE).t0(b.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarT0, "getInstance()\n          …bleListOf()\n            }");
        return lbdVarT0;
    }
}
