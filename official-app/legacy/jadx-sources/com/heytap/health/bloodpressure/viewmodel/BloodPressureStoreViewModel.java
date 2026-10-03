package com.heytap.health.bloodpressure.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.bloodPressure.BloodPressure;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.lq0;
import com.oplus.aiunit.vision.sta;
import com.oplus.aiunit.vision.uvi;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wq8;
import com.oplus.onet.IONetService;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0015\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000e\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/bloodpressure/viewmodel/BloodPressureStoreViewModel;", "Lcom/oplus/aiunit/vision/uvi;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/oplus/aiunit/vision/sta;", "lastDataListener", "", "b", "Lcom/heytap/databaseengine/model/bloodPressure/BloodPressure;", b2n.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b2n.f, "Lcom/heytap/databaseengine/model/CommonBackBean;", "i", "", "order", "Lcom/heytap/databaseengine/option/DataReadOption;", "f", "", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public final class BloodPressureStoreViewModel extends uvi {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "BloodPressureStoreViewModel";

    @Override // com.oplus.aiunit.vision.uvi
    public void b(@NotNull LifecycleOwner lifecycleOwner, @NotNull sta lastDataListener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(lastDataListener, "lastDataListener");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), wq8.INSTANCE.e(), null, new BloodPressureStoreViewModel$fetchLastDataTime$1(this, lastDataListener, null), 2, null);
    }

    public final DataReadOption f(int order) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(v9g.w().D("user_ssoid"));
        dataReadOption.setStartTime(1546272000000L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_unregisterContinuousSearch);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setSortOrder(order);
        return dataReadOption;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Continuation<? super BloodPressure> continuation) {
        BloodPressureStoreViewModel$fetchFirstDataTime$1 bloodPressureStoreViewModel$fetchFirstDataTime$1;
        if (continuation instanceof BloodPressureStoreViewModel$fetchFirstDataTime$1) {
            bloodPressureStoreViewModel$fetchFirstDataTime$1 = (BloodPressureStoreViewModel$fetchFirstDataTime$1) continuation;
            int i = bloodPressureStoreViewModel$fetchFirstDataTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bloodPressureStoreViewModel$fetchFirstDataTime$1.label = i - Integer.MIN_VALUE;
            } else {
                bloodPressureStoreViewModel$fetchFirstDataTime$1 = new BloodPressureStoreViewModel$fetchFirstDataTime$1(this, continuation);
            }
        } else {
            bloodPressureStoreViewModel$fetchFirstDataTime$1 = new BloodPressureStoreViewModel$fetchFirstDataTime$1(this, continuation);
        }
        Object objC = bloodPressureStoreViewModel$fetchFirstDataTime$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bloodPressureStoreViewModel$fetchFirstDataTime$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            lq0.c(this.TAG, "fetchFirstDataTime");
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(f(0));
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance()\n          …ption(SortOrderType.ASC))");
            bloodPressureStoreViewModel$fetchFirstDataTime$1.L$0 = this;
            bloodPressureStoreViewModel$fetchFirstDataTime$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, bloodPressureStoreViewModel$fetchFirstDataTime$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (BloodPressureStoreViewModel) bloodPressureStoreViewModel$fetchFirstDataTime$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …derType.ASC)).awaitOnce()");
        return this.i((CommonBackBean) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Continuation<? super BloodPressure> continuation) {
        BloodPressureStoreViewModel$fetchLastDataTime$2 bloodPressureStoreViewModel$fetchLastDataTime$2;
        if (continuation instanceof BloodPressureStoreViewModel$fetchLastDataTime$2) {
            bloodPressureStoreViewModel$fetchLastDataTime$2 = (BloodPressureStoreViewModel$fetchLastDataTime$2) continuation;
            int i = bloodPressureStoreViewModel$fetchLastDataTime$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bloodPressureStoreViewModel$fetchLastDataTime$2.label = i - Integer.MIN_VALUE;
            } else {
                bloodPressureStoreViewModel$fetchLastDataTime$2 = new BloodPressureStoreViewModel$fetchLastDataTime$2(this, continuation);
            }
        } else {
            bloodPressureStoreViewModel$fetchLastDataTime$2 = new BloodPressureStoreViewModel$fetchLastDataTime$2(this, continuation);
        }
        Object objC = bloodPressureStoreViewModel$fetchLastDataTime$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bloodPressureStoreViewModel$fetchLastDataTime$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            lq0.c(this.TAG, "fetchLastDataTime");
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(f(1));
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance()\n          …tion(SortOrderType.DESC))");
            bloodPressureStoreViewModel$fetchLastDataTime$2.L$0 = this;
            bloodPressureStoreViewModel$fetchLastDataTime$2.label = 1;
            objC = RxExtendKt.c(sportHealthData, bloodPressureStoreViewModel$fetchLastDataTime$2);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (BloodPressureStoreViewModel) bloodPressureStoreViewModel$fetchLastDataTime$2.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …erType.DESC)).awaitOnce()");
        return this.i((CommonBackBean) objC);
    }

    public final BloodPressure i(CommonBackBean commonBackBean) {
        if (commonBackBean.getObj() == null) {
            return null;
        }
        lq0.a(this.TAG, "fetchLastDataTime result: " + commonBackBean.getObj());
        Object obj = commonBackBean.getObj();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.bloodPressure.BloodPressure>");
        List list = (List) obj;
        if (!list.isEmpty()) {
            return (BloodPressure) CollectionsKt___CollectionsKt.first(list);
        }
        return null;
    }
}
