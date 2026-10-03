package com.heytap.sports.record.list.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.MetadataUnit;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.ul9;
import com.oplus.aiunit.vision.um;
import com.oplus.onet.IONetService;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JO\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/heytap/sports/record/list/model/SportRecordListRepository;", "", "", "sportType", "", "startTime", "endTime", "", "readConfigMap", "groupBy", "", "dataReadType", "sortOrder", "Lcom/heytap/sporthealth/blib/data/NetResult;", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "b", "(IJJLjava/util/Map;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trainType", "anchor", "count", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "(IJJIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/option/DataReadOption;", "d", "Lcom/oplus/aiunit/vision/ul9;", "Lcom/oplus/aiunit/vision/ul9;", "mAccountManager", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public class SportRecordListRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ul9 mAccountManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.sports.record.list.model.SportRecordListRepository$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/sports/record/list/model/SportRecordListRepository$a;", "", "Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@Nullable CommonBackBean commonBackBean) {
            Integer numValueOf = commonBackBean != null ? Integer.valueOf(commonBackBean.getErrorCode()) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("read db error , errorCode ：");
            sb.append(numValueOf);
            return (commonBackBean != null && commonBackBean.getErrorCode() == 0) && commonBackBean.getObj() != null;
        }
    }

    public SportRecordListRepository() {
        ul9 ul9VarC = um.c();
        Intrinsics.checkNotNullExpressionValue(ul9VarC, "getAccountManager()");
        this.mAccountManager = ul9VarC;
    }

    public static /* synthetic */ Object c(SportRecordListRepository sportRecordListRepository, int i, long j2, long j3, Map map, int i2, String str, int i3, Continuation continuation, int i4, Object obj) {
        if (obj == null) {
            return sportRecordListRepository.b(i, j2, j3, map, i2, (i4 & 32) != 0 ? null : str, (i4 & 64) != 0 ? 1 : i3, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findSportStatistic");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(int i, long j2, long j3, int i2, int i3, int i4, @NotNull Continuation<? super NetResult<List<TrackMetadataStat>>> continuation) {
        SportRecordListRepository$findHistoryRecords$1 sportRecordListRepository$findHistoryRecords$1;
        if (continuation instanceof SportRecordListRepository$findHistoryRecords$1) {
            sportRecordListRepository$findHistoryRecords$1 = (SportRecordListRepository$findHistoryRecords$1) continuation;
            int i5 = sportRecordListRepository$findHistoryRecords$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sportRecordListRepository$findHistoryRecords$1.label = i5 - Integer.MIN_VALUE;
            } else {
                sportRecordListRepository$findHistoryRecords$1 = new SportRecordListRepository$findHistoryRecords$1(this, continuation);
            }
        } else {
            sportRecordListRepository$findHistoryRecords$1 = new SportRecordListRepository$findHistoryRecords$1(this, continuation);
        }
        Object objC = sportRecordListRepository$findHistoryRecords$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = sportRecordListRepository$findHistoryRecords$1.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objC);
            StringBuilder sb = new StringBuilder();
            sb.append("findHistoryRecords：trainType ->");
            sb.append(i);
            DataReadOption dataReadOptionD = d();
            dataReadOptionD.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOptionD.setReadSportMode(i);
            dataReadOptionD.setStartTime(j2);
            dataReadOptionD.setEndTime(j3);
            dataReadOptionD.setGroupUnitType(0);
            dataReadOptionD.setSortOrder(i2);
            if (i4 > 0) {
                dataReadOptionD.setCount(i4);
            }
            dataReadOptionD.setAnchor(i3);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionD);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            sportRecordListRepository$findHistoryRecords$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, sportRecordListRepository$findHistoryRecords$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…hData(option).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (!INSTANCE.a(commonBackBean)) {
            NetResult netResultNewNetResultError = NetResult.newNetResultError("err:" + commonBackBean.getErrorCode());
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultError, "newNetResultError(\"err:\" + result.errorCode)");
            return netResultNewNetResultError;
        }
        Object obj = commonBackBean.getObj();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.TrackMetadataStat>");
        List list = (List) obj;
        if (!list.isEmpty()) {
            NetResult netResultNewNetResultSuccess = NetResult.newNetResultSuccess(list);
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultSuccess, "newNetResultSuccess(list)");
            return netResultNewNetResultSuccess;
        }
        NetResult netResultNewNetResultEmpty = NetResult.newNetResultEmpty();
        Intrinsics.checkNotNullExpressionValue(netResultNewNetResultEmpty, "newNetResultEmpty()");
        return netResultNewNetResultEmpty;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(int i, long j2, long j3, @NotNull Map<Integer, Integer> map, int i2, @Nullable String str, int i3, @NotNull Continuation<? super NetResult<List<MetadataUnit>>> continuation) {
        SportRecordListRepository$findSportStatistic$1 sportRecordListRepository$findSportStatistic$1;
        if (continuation instanceof SportRecordListRepository$findSportStatistic$1) {
            sportRecordListRepository$findSportStatistic$1 = (SportRecordListRepository$findSportStatistic$1) continuation;
            int i4 = sportRecordListRepository$findSportStatistic$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sportRecordListRepository$findSportStatistic$1.label = i4 - Integer.MIN_VALUE;
            } else {
                sportRecordListRepository$findSportStatistic$1 = new SportRecordListRepository$findSportStatistic$1(this, continuation);
            }
        } else {
            sportRecordListRepository$findSportStatistic$1 = new SportRecordListRepository$findSportStatistic$1(this, continuation);
        }
        Object objC = sportRecordListRepository$findSportStatistic$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = sportRecordListRepository$findSportStatistic$1.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objC);
            StringBuilder sb = new StringBuilder();
            sb.append("findSportStatistic：sportType ->");
            sb.append(i);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(this.mAccountManager.getSsoid());
            dataReadOptionV2.setDataTable(1065);
            dataReadOptionV2.setReadConfig(map);
            dataReadOptionV2.setReadSportMode(i);
            dataReadOptionV2.setStartTime(j2);
            dataReadOptionV2.setEndTime(j3);
            dataReadOptionV2.setGroupUnitType(i2);
            dataReadOptionV2.setSortOrder(i3);
            if (str != null) {
                dataReadOptionV2.setDataReadType(str);
            }
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            sportRecordListRepository$findSportStatistic$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, sportRecordListRepository$findSportStatistic$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…hData(option).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (!INSTANCE.a(commonBackBean)) {
            NetResult netResultNewNetResultError = NetResult.newNetResultError("err:" + commonBackBean.getErrorCode());
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultError, "newNetResultError(\"err:\" + result.errorCode)");
            return netResultNewNetResultError;
        }
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            NetResult netResultNewNetResultEmpty = NetResult.newNetResultEmpty();
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultEmpty, "newNetResultEmpty()");
            return netResultNewNetResultEmpty;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("findSportStatistic() data from db：");
        sb2.append(list);
        NetResult netResultNewNetResultSuccess = NetResult.newNetResultSuccess(list);
        Intrinsics.checkNotNullExpressionValue(netResultNewNetResultSuccess, "newNetResultSuccess(list)");
        return netResultNewNetResultSuccess;
    }

    public final DataReadOption d() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mAccountManager.getSsoid());
        return dataReadOption;
    }
}
