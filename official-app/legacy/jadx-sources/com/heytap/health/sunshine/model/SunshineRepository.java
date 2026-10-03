package com.heytap.health.sunshine.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.sunshine.SunshineDetail;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.databaseengine.model.sunshine.Vitamin;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.op5;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.uy9;
import com.oplus.aiunit.vision.v05;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/heytap/health/sunshine/model/SunshineRepository;", "Lcom/oplus/aiunit/vision/uy9;", "", "ssoid", "", "j", "", "groupUnitType", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/sunshine/SunshineDetail;", MapSchema.FIELD_NAME_ENTRY, "(IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", b2n.f, "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "d", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "intakeIU", "timestampMillis", "", "i", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/lbd;", "a", "Ljava/lang/String;", "<init>", "()V", "Companion", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class SunshineRepository implements uy9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String ssoid;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            if (commonBackBean.getObj() != null) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.sunshine.SunshineStat>");
                List list = (List) obj;
                a7b.f("SunshineRepository", "queryLastDataTime result: dataList.size() is " + list.size());
                if (!list.isEmpty()) {
                    return Long.valueOf(v05.a(((SunshineStat) list.get(0)).getDate()));
                }
            }
            return Long.MIN_VALUE;
        }
    }

    public SunshineRepository() {
        String ssoid = um.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
        this.ssoid = ssoid;
    }

    public static /* synthetic */ Object c(SunshineRepository sunshineRepository, long j2, long j3, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return sunshineRepository.b(j2, j3, i, continuation);
    }

    @Override // com.oplus.aiunit.vision.uy9
    @NotNull
    public lbd<Long> a() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.ssoid);
        dataReadOption.setStartTime(0L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1081);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setReadHealthDataType(1);
        dataReadOption.setSortOrder(1);
        lbd lbdVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(b.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "getInstance()\n          …T_DATA_TIME\n            }");
        return lbdVarJ0;
    }

    @Nullable
    public final Object b(long j2, long j3, int i, @NotNull Continuation<? super List<SunshineDetail>> continuation) {
        a7b.f("SunshineRepository", "fetchChartData startTime: " + j2 + ", endTime: " + j3);
        return e(i, j2, j3, continuation);
    }

    @Nullable
    public final Object d(long j2, long j3, @NotNull Continuation<? super List<SunshineStat>> continuation) {
        a7b.f("SunshineRepository", "fetchDayData");
        return g(j2, j3, 4, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(int i, long j2, long j3, @NotNull Continuation<? super List<SunshineDetail>> continuation) {
        SunshineRepository$fetchDayDetailData$1 sunshineRepository$fetchDayDetailData$1;
        List list;
        if (continuation instanceof SunshineRepository$fetchDayDetailData$1) {
            sunshineRepository$fetchDayDetailData$1 = (SunshineRepository$fetchDayDetailData$1) continuation;
            int i2 = sunshineRepository$fetchDayDetailData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sunshineRepository$fetchDayDetailData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sunshineRepository$fetchDayDetailData$1 = new SunshineRepository$fetchDayDetailData$1(this, continuation);
            }
        } else {
            sunshineRepository$fetchDayDetailData$1 = new SunshineRepository$fetchDayDetailData$1(this, continuation);
        }
        Object obj = sunshineRepository$fetchDayDetailData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sunshineRepository$fetchDayDetailData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            a7b.f("SunshineRepository", "fetchDayDetailData , startTime = " + fn9.g(j2, "yyyMMMdd HH:mm") + ", endTime = " + fn9.g(j3, "yyyMMMdd HH:mm"));
            ArrayList arrayList = new ArrayList();
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.ssoid);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            dataReadOption.setGroupUnitType(i);
            dataReadOption.setDataTable(1080);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            sunshineRepository$fetchDayDetailData$1.L$0 = arrayList;
            sunshineRepository$fetchDayDetailData$1.label = 1;
            Object objC = RxExtendKt.c(sportHealthData, sunshineRepository$fetchDayDetailData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objC;
            list = arrayList;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) sunshineRepository$fetchDayDetailData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CommonBackBean commonBackBean = (CommonBackBean) obj;
        if (commonBackBean.getErrorCode() == 0) {
            Object obj2 = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.sunshine.SunshineDetail>");
            list.addAll((List) obj2);
            StringBuilder sb = new StringBuilder();
            sb.append("fetchDayDetailData data: ");
            sb.append(list);
        } else {
            a7b.b("SunshineRepository", "fetchDayDetailData failed errorCode: " + commonBackBean.getErrorCode());
        }
        return list;
    }

    @Nullable
    public final Object f(long j2, long j3, @NotNull Continuation<? super List<SunshineStat>> continuation) {
        a7b.f("SunshineRepository", "fetchMonthData");
        return g(j2, j3, 6, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(long j2, long j3, int i, @NotNull Continuation<? super List<SunshineStat>> continuation) {
        SunshineRepository$fetchStatData$1 sunshineRepository$fetchStatData$1;
        long j4;
        int i2;
        List<SunshineStat> list;
        if (continuation instanceof SunshineRepository$fetchStatData$1) {
            sunshineRepository$fetchStatData$1 = (SunshineRepository$fetchStatData$1) continuation;
            int i3 = sunshineRepository$fetchStatData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sunshineRepository$fetchStatData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                sunshineRepository$fetchStatData$1 = new SunshineRepository$fetchStatData$1(this, continuation);
            }
        } else {
            sunshineRepository$fetchStatData$1 = new SunshineRepository$fetchStatData$1(this, continuation);
        }
        SunshineRepository$fetchStatData$1 sunshineRepository$fetchStatData$2 = sunshineRepository$fetchStatData$1;
        Object objD = sunshineRepository$fetchStatData$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = sunshineRepository$fetchStatData$2.label;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = sunshineRepository$fetchStatData$2.I$0;
                long j5 = sunshineRepository$fetchStatData$2.J$1;
                j2 = sunshineRepository$fetchStatData$2.J$0;
                List<SunshineStat> list2 = (List) sunshineRepository$fetchStatData$2.L$0;
                ResultKt.throwOnFailure(objD);
                list = list2;
                j4 = j5;
                i2 = i5;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objD);
            }
        }
        ResultKt.throwOnFailure(objD);
        a7b.f("SunshineRepository", "fetchStatData , startTime = " + fn9.g(j2, "yyyMMMdd HH:mm") + ", endTime = " + fn9.g(j3, "yyyMMMdd HH:mm"));
        ArrayList arrayList = new ArrayList();
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.ssoid);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        if (i == 6) {
            dataReadOption.setGroupUnitType(i);
        }
        dataReadOption.setDataTable(1081);
        lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
        Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
        sunshineRepository$fetchStatData$2.L$0 = arrayList;
        sunshineRepository$fetchStatData$2.J$0 = j2;
        sunshineRepository$fetchStatData$2.J$1 = j3;
        sunshineRepository$fetchStatData$2.I$0 = i;
        sunshineRepository$fetchStatData$2.label = 1;
        Object objC = RxExtendKt.c(sportHealthData, sunshineRepository$fetchStatData$2);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        j4 = j3;
        i2 = i;
        list = arrayList;
        objD = objC;
        CommonBackBean commonBackBean = (CommonBackBean) objD;
        if (commonBackBean.getErrorCode() == 0) {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.sunshine.SunshineStat>");
            list.addAll((List) obj);
            StringBuilder sb = new StringBuilder();
            sb.append("fetchStatData data: ");
            sb.append(list);
        } else {
            a7b.b("SunshineRepository", "fetchStatData failed errorCode: " + commonBackBean.getErrorCode());
        }
        SunshineDataProcess sunshineDataProcess = new SunshineDataProcess();
        sunshineRepository$fetchStatData$2.L$0 = null;
        sunshineRepository$fetchStatData$2.label = 2;
        objD = sunshineDataProcess.d(j2, j4, list, i2, sunshineRepository$fetchStatData$2);
        return objD == coroutine_suspended ? coroutine_suspended : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object i(int i, long j2, @NotNull Continuation<? super Boolean> continuation) {
        SunshineRepository$saveVitaminDIntakeRecord$1 sunshineRepository$saveVitaminDIntakeRecord$1;
        if (continuation instanceof SunshineRepository$saveVitaminDIntakeRecord$1) {
            sunshineRepository$saveVitaminDIntakeRecord$1 = (SunshineRepository$saveVitaminDIntakeRecord$1) continuation;
            int i2 = sunshineRepository$saveVitaminDIntakeRecord$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sunshineRepository$saveVitaminDIntakeRecord$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sunshineRepository$saveVitaminDIntakeRecord$1 = new SunshineRepository$saveVitaminDIntakeRecord$1(this, continuation);
            }
        } else {
            sunshineRepository$saveVitaminDIntakeRecord$1 = new SunshineRepository$saveVitaminDIntakeRecord$1(this, continuation);
        }
        Object objC = sunshineRepository$saveVitaminDIntakeRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sunshineRepository$saveVitaminDIntakeRecord$1.label;
        boolean z = true;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objC);
                a7b.f("SunshineRepository", "saveVitaminDIntakeRecord intakeIU: " + i + ", timestampMillis: " + j2);
                Vitamin vitamin = new Vitamin(null, null, null, 0, 0, 0, 0L, 0, 255, null);
                String ssoid = um.c().getSsoid();
                Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
                vitamin.setSsoid(ssoid);
                String strG = ilj.g();
                Intrinsics.checkNotNullExpressionValue(strG, "getDataClient()");
                vitamin.setDataClient(strG);
                vitamin.setClientModel(op5.PHONE);
                vitamin.setDataCreatedTimestamp(j2);
                vitamin.setDosage(i);
                DataInsertOption dataInsertOption = new DataInsertOption();
                dataInsertOption.setDatas(CollectionsKt__CollectionsJVMKt.listOf(vitamin));
                dataInsertOption.setDataTable(1083);
                lbd<CommonBackBean> lbdVarInsertSportHealthData = SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption);
                Intrinsics.checkNotNullExpressionValue(lbdVarInsertSportHealthData, "getInstance()\n          …lthData(dataInsertOption)");
                sunshineRepository$saveVitaminDIntakeRecord$1.label = 1;
                objC = RxExtendKt.c(lbdVarInsertSportHealthData, sunshineRepository$saveVitaminDIntakeRecord$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …             .awaitOnce()");
            boolean z2 = ((CommonBackBean) objC).getErrorCode() == 0;
            a7b.f("SunshineRepository", "saveVitaminDIntakeRecord result: " + (z2));
            if (!z2) {
                z = false;
            }
            return Boxing.boxBoolean(z);
        } catch (Exception e2) {
            a7b.b("SunshineRepository", "saveVitaminDIntakeRecord error: " + e2.getMessage());
            return Boxing.boxBoolean(false);
        }
    }

    public final void j(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
    }
}
