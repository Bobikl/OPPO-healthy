package com.heytap.health.main.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.main.viewmodel.StepGoalRepository;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ao0;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0013\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\rJ.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002R\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/heytap/health/main/viewmodel/StepGoalRepository;", "", "Lcom/heytap/health/base/livedata/OLiveData;", "", "observableStepGoal", "", b2n.f, "Ljava/time/LocalDate;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "f", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeDbList", "", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", "j", "", b2n.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/SportDataStat;", "c", "Lcom/heytap/databaseengine/model/SportDataDetail;", "sportDetails", "i", "list", "", "startTime", "endTime", "d", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class StepGoalRepository {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "StepGoalRepository";

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/main/viewmodel/StepGoalRepository$a", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "onError", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f4965j;
        public final /* synthetic */ StepGoalRepository k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ OLiveData<String> f4966l;

        public a(Ref.ObjectRef<String> objectRef, StepGoalRepository stepGoalRepository, OLiveData<String> oLiveData) {
            this.f4965j = objectRef;
            this.k = stepGoalRepository;
            this.f4966l = oLiveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            if (commonBackBean.getErrorCode() != 0) {
                String unused = this.k.TAG;
                int errorCode = commonBackBean.getErrorCode();
                StringBuilder sb = new StringBuilder();
                sb.append("queryStepGoal error ");
                sb.append(errorCode);
            } else if (commonBackBean.getObj() != null) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.UserGoalInfo?>");
                List list = (List) obj;
                if (list.get(0) != null) {
                    UserGoalInfo userGoalInfo = (UserGoalInfo) list.get(0);
                    this.f4965j.element = userGoalInfo != null ? userGoalInfo.getValue() : 0;
                    String unused2 = this.k.TAG;
                    String str = this.f4965j.element;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("queryStepGoal Success:");
                    sb2.append((Object) str);
                } else {
                    String unused3 = this.k.TAG;
                }
            } else {
                String unused4 = this.k.TAG;
            }
            this.f4966l.postValue(this.f4965j.element);
            String unused5 = this.k.TAG;
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            super.onError(e2);
            a7b.b(this.k.TAG, "obtain queryStepGoal error, msg : " + e2.getMessage());
            this.f4966l.postValue(this.f4965j.element);
        }
    }

    public static final int e(TimeStampedData lhs, TimeStampedData rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        long timestamp = lhs.getTimestamp();
        long timestamp2 = rhs.getTimestamp();
        if (timestamp > timestamp2) {
            return 1;
        }
        return timestamp < timestamp2 ? -1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, @NotNull Continuation<? super List<? extends SportDataStat>> continuation) {
        StepGoalRepository$fetchStepDayStatData$1 stepGoalRepository$fetchStepDayStatData$1;
        long j2;
        List listEmptyList;
        if (continuation instanceof StepGoalRepository$fetchStepDayStatData$1) {
            stepGoalRepository$fetchStepDayStatData$1 = (StepGoalRepository$fetchStepDayStatData$1) continuation;
            int i = stepGoalRepository$fetchStepDayStatData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepGoalRepository$fetchStepDayStatData$1.label = i - Integer.MIN_VALUE;
            } else {
                stepGoalRepository$fetchStepDayStatData$1 = new StepGoalRepository$fetchStepDayStatData$1(this, continuation);
            }
        } else {
            stepGoalRepository$fetchStepDayStatData$1 = new StepGoalRepository$fetchStepDayStatData$1(this, continuation);
        }
        Object objC = stepGoalRepository$fetchStepDayStatData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepGoalRepository$fetchStepDayStatData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            j2 = n05.j(localDate);
            LocalDate localDatePlusDays = localDate2.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "endDate.plusDays(1)");
            long j3 = n05.j(localDatePlusDays);
            a7b.f(this.TAG, "fetchStepDayStatData");
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            dataReadOption.setDataTable(1002);
            dataReadOption.setGroupUnitType(4);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepGoalRepository$fetchStepDayStatData$1.L$0 = this;
            stepGoalRepository$fetchStepDayStatData$1.J$0 = j2;
            stepGoalRepository$fetchStepDayStatData$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepGoalRepository$fetchStepDayStatData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = stepGoalRepository$fetchStepDayStatData$1.J$0;
            StepGoalRepository stepGoalRepository = (StepGoalRepository) stepGoalRepository$fetchStepDayStatData$1.L$0;
            ResultKt.throwOnFailure(objC);
            j2 = j4;
            this = stepGoalRepository;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        a7b.f(this.TAG, "fetchStepDayStatData = " + commonBackBean.getErrorCode());
        if (commonBackBean.getErrorCode() == 0 && (commonBackBean.getObj() instanceof List)) {
            Object obj = commonBackBean.getObj();
            listEmptyList = obj instanceof List ? (List) obj : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        a7b.f(this.TAG, "queryTodayStep " + j2 + ", data size = " + listEmptyList.size() + " cost:" + (System.currentTimeMillis() - j2));
        return listEmptyList;
    }

    public final List<TimeStampedData> d(List<TimeStampedData> list, long startTime, long endTime) {
        List list2;
        if (list == null || list.isEmpty()) {
            list2 = list;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TimeStampedData(endTime, 0.0f));
            list2 = arrayList;
        }
        list2 = list;
        ArrayList arrayList2 = new ArrayList();
        long jN = x05.n(endTime) + (((long) 25) * 3600000);
        long jN2 = x05.n(startTime);
        if (!list2.isEmpty()) {
            Collections.sort(list2, new Comparator() { // from class: com.oplus.aiunit.vision.vri
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StepGoalRepository.e((TimeStampedData) obj, (TimeStampedData) obj2);
                }
            });
            jN2 = Math.min(jN2, x05.n(((TimeStampedData) list2.get(0)).getTimestamp()));
        }
        for (long j2 = jN2; j2 < jN; j2 += 3600000) {
            arrayList2.add(new TimeStampedData(j2, 0.0f));
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int timestamp = (int) ((((TimeStampedData) list2.get(i)).getTimestamp() - jN2) / 3600000);
            if (timestamp < 0) {
                return new ArrayList();
            }
            arrayList2.set(timestamp, list2.get(i));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object f(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, @NotNull Continuation<? super List<? extends TimeStampedData>> continuation) {
        StepGoalRepository$queryDetail$1 stepGoalRepository$queryDetail$1;
        long jCurrentTimeMillis;
        StepGoalRepository stepGoalRepository;
        List listEmptyList;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        if (continuation instanceof StepGoalRepository$queryDetail$1) {
            stepGoalRepository$queryDetail$1 = (StepGoalRepository$queryDetail$1) continuation;
            int i = stepGoalRepository$queryDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepGoalRepository$queryDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                stepGoalRepository$queryDetail$1 = new StepGoalRepository$queryDetail$1(this, continuation);
            }
        } else {
            stepGoalRepository$queryDetail$1 = new StepGoalRepository$queryDetail$1(this, continuation);
        }
        Object objC = stepGoalRepository$queryDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepGoalRepository$queryDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f(this.TAG, "queryDetail " + localDate3 + " - " + localDate4 + ", " + jCurrentTimeMillis);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(n05.j(localDate));
            LocalDate localDatePlusDays = localDate4.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "endDate.plusDays(1)");
            dataReadOption.setEndTime(n05.j(localDatePlusDays));
            dataReadOption.setDataTable(1001);
            dataReadOption.setGroupUnitType(3);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setIsParse(Intrinsics.areEqual(localDate4, LocalDate.now()) ? 2 : 0);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepGoalRepository$queryDetail$1.L$0 = this;
            stepGoalRepository$queryDetail$1.L$1 = localDate3;
            stepGoalRepository$queryDetail$1.L$2 = localDate4;
            stepGoalRepository$queryDetail$1.J$0 = jCurrentTimeMillis;
            stepGoalRepository$queryDetail$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepGoalRepository$queryDetail$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            stepGoalRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = stepGoalRepository$queryDetail$1.J$0;
            localDate4 = (LocalDate) stepGoalRepository$queryDetail$1.L$2;
            LocalDate localDate5 = (LocalDate) stepGoalRepository$queryDetail$1.L$1;
            StepGoalRepository stepGoalRepository2 = (StepGoalRepository) stepGoalRepository$queryDetail$1.L$0;
            ResultKt.throwOnFailure(objC);
            jCurrentTimeMillis = j2;
            stepGoalRepository = stepGoalRepository2;
            localDate3 = localDate5;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        a7b.f(stepGoalRepository.TAG, "queryDetail = " + commonBackBean.getErrorCode());
        if (commonBackBean.getErrorCode() == 0 && (commonBackBean.getObj() instanceof List)) {
            Object obj = commonBackBean.getObj();
            listEmptyList = obj instanceof List ? (List) obj : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        a7b.f(stepGoalRepository.TAG, "queryDetail " + localDate3 + ", data size = " + listEmptyList.size() + " cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        LocalDate localDatePlusDays2 = localDate4.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "endDate.plusDays(1)");
        List<TimeStampedData> listI = stepGoalRepository.i(localDate3, localDatePlusDays2, CollectionsKt___CollectionsKt.toMutableList((Collection) listEmptyList));
        long j3 = n05.j(localDate3);
        LocalDate localDatePlusDays3 = localDate4.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays3, "endDate.plusDays(1)");
        return stepGoalRepository.d(listI, j3, n05.j(localDatePlusDays3));
    }

    public final void g(@NotNull OLiveData<String> observableStepGoal) {
        Intrinsics.checkNotNullParameter(observableStepGoal, "observableStepGoal");
        String ssoid = um.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().getSsoid()");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "8000";
        SportHealthDataAPI.getInstance().getUserGoalInfo(ssoid, 0).L0(su8.c()).subscribe(new a(objectRef, this, observableStepGoal));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object h(@NotNull Continuation<? super Boolean> continuation) {
        StepGoalRepository$queryStepStat$1 stepGoalRepository$queryStepStat$1;
        long j2;
        List listEmptyList;
        if (continuation instanceof StepGoalRepository$queryStepStat$1) {
            stepGoalRepository$queryStepStat$1 = (StepGoalRepository$queryStepStat$1) continuation;
            int i = stepGoalRepository$queryStepStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepGoalRepository$queryStepStat$1.label = i - Integer.MIN_VALUE;
            } else {
                stepGoalRepository$queryStepStat$1 = new StepGoalRepository$queryStepStat$1(this, continuation);
            }
        } else {
            stepGoalRepository$queryStepStat$1 = new StepGoalRepository$queryStepStat$1(this, continuation);
        }
        Object objC = stepGoalRepository$queryStepStat$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepGoalRepository$queryStepStat$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            long jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f(this.TAG, "queryStepStat");
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(1546272000000L);
            dataReadOption.setEndTime(jCurrentTimeMillis);
            dataReadOption.setDataTable(1002);
            dataReadOption.setGroupUnitType(4);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setCount(1);
            dataReadOption.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepGoalRepository$queryStepStat$1.L$0 = this;
            stepGoalRepository$queryStepStat$1.J$0 = 1546272000000L;
            stepGoalRepository$queryStepStat$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepGoalRepository$queryStepStat$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = 1546272000000L;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = stepGoalRepository$queryStepStat$1.J$0;
            this = (StepGoalRepository) stepGoalRepository$queryStepStat$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        a7b.f(this.TAG, "queryStepStat = " + commonBackBean.getErrorCode());
        if (commonBackBean.getErrorCode() == 0 && (commonBackBean.getObj() instanceof List)) {
            Object obj = commonBackBean.getObj();
            listEmptyList = obj instanceof List ? (List) obj : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        a7b.f(this.TAG, "queryStepStat " + j2 + ", data size = " + listEmptyList.size() + " cost:" + (System.currentTimeMillis() - j2));
        return Boxing.boxBoolean(!listEmptyList.isEmpty());
    }

    public final List<TimeStampedData> i(LocalDate startDate, LocalDate endDate, List<SportDataDetail> sportDetails) {
        ArrayList arrayList = new ArrayList();
        List<SportDataDetail> list = sportDetails;
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        SportDataDetail sportDataDetail = sportDetails.get(0);
        while (startDate.isBefore(endDate)) {
            for (SportDataDetail sportDataDetail2 : sportDetails) {
                LocalDate localDateG = n05.g(sportDataDetail2.getStartTimestamp());
                if (Intrinsics.areEqual(startDate, localDateG)) {
                    arrayList.add(new TimeStampedData(sportDataDetail2.getStartTimestamp(), sportDataDetail2.getSteps()));
                    sportDataDetail = sportDataDetail2;
                } else if (localDateG.isAfter(startDate) || sportDataDetail2 == CollectionsKt___CollectionsKt.last((List) sportDetails)) {
                    if (!Intrinsics.areEqual(n05.g(sportDataDetail.getStartTimestamp()), startDate)) {
                        if (!Intrinsics.areEqual(startDate, endDate.minusDays(1L))) {
                            arrayList.add(new TimeStampedData(n05.j(startDate), 0.0f));
                            break;
                        }
                        break;
                    }
                }
            }
            startDate = startDate.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(startDate, "tempDate.plusDays(1)");
        }
        return arrayList;
    }

    @NotNull
    public final List<HealthSingleBarEntry> j(@NotNull List<? extends TimeStampedData> timeDbList) {
        Intrinsics.checkNotNullParameter(timeDbList, "timeDbList");
        ArrayList arrayList = new ArrayList();
        if (timeDbList.isEmpty()) {
            for (int i = 0; i < 24; i++) {
                arrayList.add(new HealthSingleBarEntry(i, 0.0f, 0));
            }
        } else {
            for (TimeStampedData timeStampedData : timeDbList) {
                int hour = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedData.getTimestamp()), ZoneId.systemDefault()).getHour();
                if (arrayList.isEmpty()) {
                    arrayList.add(new HealthSingleBarEntry(hour, timeStampedData.getY(), rg7.b(R$color.health_FF29CD68)));
                } else {
                    HealthSingleBarEntry healthSingleBarEntry = (HealthSingleBarEntry) arrayList.get(arrayList.size() - 1);
                    float f = hour;
                    if (healthSingleBarEntry.getX() == f) {
                        healthSingleBarEntry.setY(Math.max(healthSingleBarEntry.getY(), timeStampedData.getY()));
                        healthSingleBarEntry.setColor(rg7.b(R$color.health_FF29CD68));
                    } else {
                        arrayList.add(new HealthSingleBarEntry(f, timeStampedData.getY(), rg7.b(R$color.health_FF29CD68)));
                    }
                }
            }
        }
        return arrayList;
    }
}
