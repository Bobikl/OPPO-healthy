package com.heytap.health.stress.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.aiunit.vision.a0j;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.sta;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.uvi;
import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u0004\u0018\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R*\u0010\u001a\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/stress/viewmodel/StressStoreViewModel;", "Lcom/oplus/aiunit/vision/uvi;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/oplus/aiunit/vision/sta;", "lastDataListener", "", "b", "Lcom/heytap/databaseengine/model/CommonBackBean;", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", b2n.g, b2n.f, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "order", "Lcom/heytap/databaseengine/option/DataReadOption;", MapSchema.FIELD_NAME_ENTRY, "", "kotlin.jvm.PlatformType", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "getSsoid", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "ssoid", "<init>", "()V", "Companion", "a", "stress_release"}, k = 1, mv = {1, 8, 0})
public final class StressStoreViewModel extends uvi {

    @NotNull
    public static final String TAG = "StressStoreViewModel";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String ssoid = um.c().getSsoid();

    @Override // com.oplus.aiunit.vision.uvi
    public void b(@NotNull LifecycleOwner lifecycleOwner, @Nullable sta lastDataListener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), wq8.INSTANCE.e(), null, new StressStoreViewModel$fetchLastDataTime$1(this, lastDataListener, null), 2, null);
    }

    public final DataReadOption e(int order) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.ssoid);
        dataReadOption.setStartTime(1546272000000L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1018);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setSortOrder(order);
        return dataReadOption;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Continuation<? super StressDataStat> continuation) {
        StressStoreViewModel$fetchFirstDataTime$1 stressStoreViewModel$fetchFirstDataTime$1;
        if (continuation instanceof StressStoreViewModel$fetchFirstDataTime$1) {
            stressStoreViewModel$fetchFirstDataTime$1 = (StressStoreViewModel$fetchFirstDataTime$1) continuation;
            int i = stressStoreViewModel$fetchFirstDataTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stressStoreViewModel$fetchFirstDataTime$1.label = i - Integer.MIN_VALUE;
            } else {
                stressStoreViewModel$fetchFirstDataTime$1 = new StressStoreViewModel$fetchFirstDataTime$1(this, continuation);
            }
        } else {
            stressStoreViewModel$fetchFirstDataTime$1 = new StressStoreViewModel$fetchFirstDataTime$1(this, continuation);
        }
        Object objC = stressStoreViewModel$fetchFirstDataTime$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stressStoreViewModel$fetchFirstDataTime$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a0j.a("StressStoreViewModel", "fetchFirstDataTime");
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(e(0));
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance()\n          …ption(SortOrderType.ASC))");
            stressStoreViewModel$fetchFirstDataTime$1.L$0 = this;
            stressStoreViewModel$fetchFirstDataTime$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stressStoreViewModel$fetchFirstDataTime$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (StressStoreViewModel) stressStoreViewModel$fetchFirstDataTime$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …\n            .awaitOnce()");
        return this.h((CommonBackBean) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Continuation<? super StressDataStat> continuation) {
        StressStoreViewModel$fetchLastDataTime$2 stressStoreViewModel$fetchLastDataTime$2;
        if (continuation instanceof StressStoreViewModel$fetchLastDataTime$2) {
            stressStoreViewModel$fetchLastDataTime$2 = (StressStoreViewModel$fetchLastDataTime$2) continuation;
            int i = stressStoreViewModel$fetchLastDataTime$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stressStoreViewModel$fetchLastDataTime$2.label = i - Integer.MIN_VALUE;
            } else {
                stressStoreViewModel$fetchLastDataTime$2 = new StressStoreViewModel$fetchLastDataTime$2(this, continuation);
            }
        } else {
            stressStoreViewModel$fetchLastDataTime$2 = new StressStoreViewModel$fetchLastDataTime$2(this, continuation);
        }
        Object objC = stressStoreViewModel$fetchLastDataTime$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stressStoreViewModel$fetchLastDataTime$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a0j.a("StressStoreViewModel", "fetchLastDataTime");
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(e(1));
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance()\n          …tion(SortOrderType.DESC))");
            stressStoreViewModel$fetchLastDataTime$2.L$0 = this;
            stressStoreViewModel$fetchLastDataTime$2.label = 1;
            objC = RxExtendKt.c(sportHealthData, stressStoreViewModel$fetchLastDataTime$2);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (StressStoreViewModel) stressStoreViewModel$fetchLastDataTime$2.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …\n            .awaitOnce()");
        return this.h((CommonBackBean) objC);
    }

    public final StressDataStat h(CommonBackBean commonBackBean) {
        if (commonBackBean.getObj() == null) {
            return null;
        }
        a0j.c("StressStoreViewModel", "fetchLastDataTime result: " + commonBackBean.getObj());
        Object obj = commonBackBean.getObj();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.stress.StressDataStat>");
        List list = (List) obj;
        if (!(!list.isEmpty())) {
            return null;
        }
        a0j.c("StressStoreViewModel", "fetchLastDataTime result:" + v05.a(((StressDataStat) list.get(0)).getDate()));
        return (StressDataStat) CollectionsKt___CollectionsKt.first(list);
    }

    public final void i(String str) {
        this.ssoid = str;
    }
}
