package com.heytap.sports.record.details.model;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.MetadataUnit;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.heytap.health.base.resource.ResourceBean;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.wq8;
import com.oplus.onet.IONetService;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007J6\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002J\u0013\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/sports/record/details/model/SportChartDataRepository;", "", "", "type", "Lcom/heytap/health/base/resource/ResourceBean;", MapSchema.FIELD_NAME_ENTRY, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/lbd;", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "", "startTime", "Lcom/heytap/databaseengine/model/MetadataUnit;", "b", "", "typeMap", "endTime", "count", "", "d", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportChartDataRepository {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Lcom/heytap/databaseengine/model/TrackMetadataStat;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrackMetadataStat apply(@Nullable CommonBackBean commonBackBean) {
            if (commonBackBean == null || commonBackBean.getObj() == null) {
                return new TrackMetadataStat();
            }
            if (commonBackBean.getErrorCode() != 0) {
                return new TrackMetadataStat();
            }
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) obj);
            TrackMetadataStat trackMetadataStat = objFirst instanceof TrackMetadataStat ? (TrackMetadataStat) objFirst : null;
            return trackMetadataStat == null ? new TrackMetadataStat() : trackMetadataStat;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Lcom/heytap/databaseengine/model/MetadataUnit;"}, k = 3, mv = {1, 8, 0})
    public static final class c<T, R> implements d08 {
        public static final c<T, R> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MetadataUnit apply(@Nullable CommonBackBean commonBackBean) {
            if (commonBackBean == null || commonBackBean.getObj() == null) {
                return new MetadataUnit(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
            }
            if (commonBackBean.getErrorCode() != 0) {
                return new MetadataUnit(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
            }
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) obj);
            MetadataUnit metadataUnit = objFirst instanceof MetadataUnit ? (MetadataUnit) objFirst : null;
            return metadataUnit == null ? new MetadataUnit(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null) : metadataUnit;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T, R> implements d08 {
        public static final d<T, R> INSTANCE = new d<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(@Nullable CommonBackBean commonBackBean) {
            if (commonBackBean == null || commonBackBean.getObj() == null || commonBackBean.getErrorCode() != 0) {
                return "";
            }
            List list = (List) commonBackBean.getObj();
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.TrackMetadataStat>");
            return ((TrackMetadataStat) list.get(0)).getClientDataId();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class e<T, R> implements d08 {
        public static final e<T, R> INSTANCE = new e<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<MetadataUnit> apply(@Nullable CommonBackBean commonBackBean) {
            if (commonBackBean == null || commonBackBean.getObj() == null) {
                return new ArrayList();
            }
            if (commonBackBean.getErrorCode() != 0) {
                return new ArrayList();
            }
            List<MetadataUnit> list = (List) commonBackBean.getObj();
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.MetadataUnit>");
            return list;
        }
    }

    @NotNull
    public final lbd<TrackMetadataStat> a() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setStartTime(0L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setReadSportMode(100);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
        dataReadOption.setDataReadType("fastest_avg_pace");
        dataReadOption.setGroupUnitType(1);
        lbd lbdVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(b.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "getInstance()\n          …adataStat()\n            }");
        return lbdVarJ0;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final lbd<MetadataUnit> b(long startTime) {
        DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
        dataReadOptionV2.setSsoid(um.c().getSsoid());
        dataReadOptionV2.setDataTable(1065);
        dataReadOptionV2.setReadConfig(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(600020, 3)));
        dataReadOptionV2.setReadSportMode(100);
        mq8 mq8Var = mq8.INSTANCE;
        dataReadOptionV2.setStartTime(mq8Var.l(startTime));
        dataReadOptionV2.setEndTime(mq8Var.k(startTime));
        dataReadOptionV2.setGroupUnitType(6);
        lbd lbdVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2).j0(c.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "getInstance()\n          …adataUnit()\n            }");
        return lbdVarJ0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull Continuation<? super String> continuation) {
        SportChartDataRepository$getLastedClientId$1 sportChartDataRepository$getLastedClientId$1;
        if (continuation instanceof SportChartDataRepository$getLastedClientId$1) {
            sportChartDataRepository$getLastedClientId$1 = (SportChartDataRepository$getLastedClientId$1) continuation;
            int i = sportChartDataRepository$getLastedClientId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportChartDataRepository$getLastedClientId$1.label = i - Integer.MIN_VALUE;
            } else {
                sportChartDataRepository$getLastedClientId$1 = new SportChartDataRepository$getLastedClientId$1(this, continuation);
            }
        } else {
            sportChartDataRepository$getLastedClientId$1 = new SportChartDataRepository$getLastedClientId$1(this, continuation);
        }
        Object objC = sportChartDataRepository$getLastedClientId$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportChartDataRepository$getLastedClientId$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOptionV2.setReadSportMode(100);
            dataReadOptionV2.setStartTime(0L);
            dataReadOptionV2.setEndTime(System.currentTimeMillis());
            dataReadOptionV2.setCount(1);
            dataReadOptionV2.setSortOrder(1);
            jdd jddVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2).j0(d.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(jddVarJ0, "getInstance()\n          …         \"\"\n            }");
            sportChartDataRepository$getLastedClientId$1.label = 1;
            objC = RxExtendKt.c(jddVarJ0, sportChartDataRepository$getLastedClientId$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …\n            .awaitOnce()");
        return objC;
    }

    @NotNull
    public final lbd<List<MetadataUnit>> d(@NotNull Map<Integer, Integer> typeMap, long endTime, int count) {
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
        dataReadOptionV2.setSsoid(um.c().getSsoid());
        dataReadOptionV2.setDataTable(1065);
        dataReadOptionV2.setReadConfig(typeMap);
        dataReadOptionV2.setReadSportMode(100);
        dataReadOptionV2.setStartTime(0L);
        dataReadOptionV2.setEndTime(endTime);
        dataReadOptionV2.setCount(count);
        dataReadOptionV2.setReadValidCountData(true);
        dataReadOptionV2.setSortOrder(1);
        dataReadOptionV2.setGroupUnitType(1);
        lbd lbdVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2).j0(e.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "getInstance()\n          …rayListOf()\n            }");
        return lbdVarJ0;
    }

    @Nullable
    public final Object e(int i, @NotNull Continuation<? super ResourceBean> continuation) {
        HashMap map = new HashMap();
        map.put("resourceType", Boxing.boxInt(i));
        return BuildersKt.withContext(wq8.INSTANCE.d(), new SportChartDataRepository$queryDescriptionResource$2(map, null), continuation);
    }
}
