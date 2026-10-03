package com.heytap.health.insight.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v05;
import com.oplus.onet.IONetService;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/insight/data/repository/InsightIntroductionRepository;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "a", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/time/LocalDate;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "groupUnitType", "Lcom/heytap/databaseengine/model/SportDataStat;", "b", "(Ljava/time/LocalDate;Ljava/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/lang/String;", "getMSsoid", "()Ljava/lang/String;", "setMSsoid", "(Ljava/lang/String;)V", "mSsoid", "getTAG", "TAG", "<init>", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class InsightIntroductionRepository {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String mSsoid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: Multi-variable type inference failed */
    public InsightIntroductionRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object c(InsightIntroductionRepository insightIntroductionRepository, LocalDate localDate, LocalDate localDate2, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return insightIntroductionRepository.b(localDate, localDate2, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(long j2, long j3, @NotNull Continuation<? super List<SleepMainData>> continuation) {
        InsightIntroductionRepository$fetchSleepMainList$1 insightIntroductionRepository$fetchSleepMainList$1;
        if (continuation instanceof InsightIntroductionRepository$fetchSleepMainList$1) {
            insightIntroductionRepository$fetchSleepMainList$1 = (InsightIntroductionRepository$fetchSleepMainList$1) continuation;
            int i = insightIntroductionRepository$fetchSleepMainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                insightIntroductionRepository$fetchSleepMainList$1.label = i - Integer.MIN_VALUE;
            } else {
                insightIntroductionRepository$fetchSleepMainList$1 = new InsightIntroductionRepository$fetchSleepMainList$1(this, continuation);
            }
        } else {
            insightIntroductionRepository$fetchSleepMainList$1 = new InsightIntroductionRepository$fetchSleepMainList$1(this, continuation);
        }
        Object objC = insightIntroductionRepository$fetchSleepMainList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = insightIntroductionRepository$fetchSleepMainList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mSsoid);
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getAccountLoginIntent);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance()\n          …ortHealthData(readOption)");
            insightIntroductionRepository$fetchSleepMainList$1.L$0 = this;
            insightIntroductionRepository$fetchSleepMainList$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, insightIntroductionRepository$fetchSleepMainList$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (InsightIntroductionRepository) insightIntroductionRepository$fetchSleepMainList$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …a(readOption).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            a7b.f(this.TAG, "fetchSleepMainList error:" + commonBackBean.getErrorCode());
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object obj = commonBackBean.getObj();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.sleepdaystat.SleepMainData>");
        List list = (List) obj;
        a7b.f(this.TAG, "fetchSleepMainList size:" + list.size());
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, int i, @NotNull Continuation<? super List<? extends SportDataStat>> continuation) {
        InsightIntroductionRepository$queryStatInDailyActTable$1 insightIntroductionRepository$queryStatInDailyActTable$1;
        if (continuation instanceof InsightIntroductionRepository$queryStatInDailyActTable$1) {
            insightIntroductionRepository$queryStatInDailyActTable$1 = (InsightIntroductionRepository$queryStatInDailyActTable$1) continuation;
            int i2 = insightIntroductionRepository$queryStatInDailyActTable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                insightIntroductionRepository$queryStatInDailyActTable$1.label = i2 - Integer.MIN_VALUE;
            } else {
                insightIntroductionRepository$queryStatInDailyActTable$1 = new InsightIntroductionRepository$queryStatInDailyActTable$1(this, continuation);
            }
        } else {
            insightIntroductionRepository$queryStatInDailyActTable$1 = new InsightIntroductionRepository$queryStatInDailyActTable$1(this, continuation);
        }
        Object objC = insightIntroductionRepository$queryStatInDailyActTable$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = insightIntroductionRepository$queryStatInDailyActTable$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f(this.TAG, "queryStatInDailyActTable startDate:" + localDate + " endDate:" + localDate2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mSsoid);
            dataReadOption.setStartTime(n05.j(localDate));
            dataReadOption.setEndTime(n05.j(localDate2));
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setDataTable(1002);
            dataReadOption.setGroupUnitType(i);
            if (v05.i(System.currentTimeMillis()) <= v05.i(dataReadOption.getEndTime())) {
                dataReadOption.setIsParse(2);
            }
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            insightIntroductionRepository$queryStatInDailyActTable$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, insightIntroductionRepository$queryStatInDailyActTable$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…\n            .awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (commonBackBean.getErrorCode() != 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    public InsightIntroductionRepository(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.mSsoid = mSsoid;
        this.TAG = "InsightIntroductionRepository";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InsightIntroductionRepository(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(str, "getAccountManager().ssoid");
        }
        this(str);
    }
}
