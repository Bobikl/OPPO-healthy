package com.heytap.sports.record.stat.model;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u001f\u0010 J}\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/heytap/sports/record/stat/model/SportStatRepository;", "", "", "sportType", "", "startTime", "endTime", "", "readConfigMap", "groupBy", "", "dataReadType", "count", "", "readValidCountData", "sortOrder", "Lcom/heytap/sporthealth/blib/data/NetResult;", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "c", "(IJJLjava/util/Map;ILjava/lang/String;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trainType", "anchor", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "(IJJIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(IJJILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/ul9;", "Lcom/oplus/aiunit/vision/ul9;", "mAccountManager", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportStatRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportStatRepository.kt\ncom/heytap/sports/record/stat/model/SportStatRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 SportStatRepository.kt\ncom/heytap/sports/record/stat/model/SportStatRepository\n*L\n85#1:138,2\n*E\n"})
public final class SportStatRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ul9 mAccountManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.sports.record.stat.model.SportStatRepository$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/sports/record/stat/model/SportStatRepository$a;", "", "Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
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

    public SportStatRepository() {
        ul9 ul9VarC = um.c();
        Intrinsics.checkNotNullExpressionValue(ul9VarC, "getAccountManager()");
        this.mAccountManager = ul9VarC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(int i, long j2, long j3, int i2, int i3, int i4, @NotNull Continuation<? super NetResult<List<TrackMetadataStat>>> continuation) {
        SportStatRepository$findHistoryRecords$1 sportStatRepository$findHistoryRecords$1;
        if (continuation instanceof SportStatRepository$findHistoryRecords$1) {
            sportStatRepository$findHistoryRecords$1 = (SportStatRepository$findHistoryRecords$1) continuation;
            int i5 = sportStatRepository$findHistoryRecords$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sportStatRepository$findHistoryRecords$1.label = i5 - Integer.MIN_VALUE;
            } else {
                sportStatRepository$findHistoryRecords$1 = new SportStatRepository$findHistoryRecords$1(this, continuation);
            }
        } else {
            sportStatRepository$findHistoryRecords$1 = new SportStatRepository$findHistoryRecords$1(this, continuation);
        }
        Object objC = sportStatRepository$findHistoryRecords$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = sportStatRepository$findHistoryRecords$1.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objC);
            StringBuilder sb = new StringBuilder();
            sb.append("findHistoryRecords：trainType ->");
            sb.append(i);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mAccountManager.getSsoid());
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOption.setReadSportMode(i);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            dataReadOption.setGroupUnitType(0);
            dataReadOption.setSortOrder(i2);
            if (i4 > 0) {
                dataReadOption.setCount(i4);
            }
            dataReadOption.setAnchor(i3);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            sportStatRepository$findHistoryRecords$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, sportStatRepository$findHistoryRecords$1);
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
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultError, "newNetResultError(\"err:\" + record.errorCode)");
            return netResultNewNetResultError;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TrackMetadataStat trackMetadataStatCopy = ((TrackMetadataStat) it.next()).copy();
                Intrinsics.checkNotNullExpressionValue(trackMetadataStatCopy, "it.copy()");
                arrayList.add(trackMetadataStatCopy);
            }
        }
        if (!arrayList.isEmpty()) {
            NetResult netResultNewNetResultSuccess = NetResult.newNetResultSuccess(arrayList);
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultSuccess, "newNetResultSuccess(list)");
            return netResultNewNetResultSuccess;
        }
        NetResult netResultNewNetResultEmpty = NetResult.newNetResultEmpty();
        Intrinsics.checkNotNullExpressionValue(netResultNewNetResultEmpty, "newNetResultEmpty()");
        return netResultNewNetResultEmpty;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(int i, long j2, long j3, int i2, @Nullable String str, @NotNull Continuation<? super NetResult<TrackMetadataStat>> continuation) {
        SportStatRepository$findRunBestRecord$1 sportStatRepository$findRunBestRecord$1;
        List listEmptyList;
        if (continuation instanceof SportStatRepository$findRunBestRecord$1) {
            sportStatRepository$findRunBestRecord$1 = (SportStatRepository$findRunBestRecord$1) continuation;
            int i3 = sportStatRepository$findRunBestRecord$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sportStatRepository$findRunBestRecord$1.label = i3 - Integer.MIN_VALUE;
            } else {
                sportStatRepository$findRunBestRecord$1 = new SportStatRepository$findRunBestRecord$1(this, continuation);
            }
        } else {
            sportStatRepository$findRunBestRecord$1 = new SportStatRepository$findRunBestRecord$1(this, continuation);
        }
        Object objC = sportStatRepository$findRunBestRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = sportStatRepository$findRunBestRecord$1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objC);
            StringBuilder sb = new StringBuilder();
            sb.append("findRunBestRecord：trainType ->");
            sb.append(i);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mAccountManager.getSsoid());
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOption.setReadSportMode(i);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            dataReadOption.setGroupUnitType(i2);
            dataReadOption.setSortOrder(1);
            dataReadOption.setCount(1);
            if (str != null) {
                if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() > 0) {
                    dataReadOption.setDataReadType(str);
                }
            }
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            sportStatRepository$findRunBestRecord$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, sportStatRepository$findRunBestRecord$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
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
        if (commonBackBean.getObj() instanceof List) {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            listEmptyList = (List) obj;
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            NetResult netResultNewNetResultEmpty = NetResult.newNetResultEmpty();
            Intrinsics.checkNotNullExpressionValue(netResultNewNetResultEmpty, "newNetResultEmpty()");
            return netResultNewNetResultEmpty;
        }
        Object obj2 = listEmptyList.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.heytap.databaseengine.model.TrackMetadataStat");
        TrackMetadataStat trackMetadataStat = (TrackMetadataStat) obj2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TrackMetadataStat data from db：");
        sb2.append(trackMetadataStat);
        NetResult netResultNewNetResultSuccess = NetResult.newNetResultSuccess(trackMetadataStat);
        Intrinsics.checkNotNullExpressionValue(netResultNewNetResultSuccess, "newNetResultSuccess(fitDayStat)");
        return netResultNewNetResultSuccess;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object c(int i, long j2, long j3, @NotNull Map<Integer, Integer> map, int i2, @Nullable String str, int i3, boolean z, int i4, @NotNull Continuation<? super NetResult<List<MetadataUnit>>> continuation) {
        SportStatRepository$findSportStatistic$1 sportStatRepository$findSportStatistic$1;
        if (continuation instanceof SportStatRepository$findSportStatistic$1) {
            sportStatRepository$findSportStatistic$1 = (SportStatRepository$findSportStatistic$1) continuation;
            int i5 = sportStatRepository$findSportStatistic$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sportStatRepository$findSportStatistic$1.label = i5 - Integer.MIN_VALUE;
            } else {
                sportStatRepository$findSportStatistic$1 = new SportStatRepository$findSportStatistic$1(this, continuation);
            }
        } else {
            sportStatRepository$findSportStatistic$1 = new SportStatRepository$findSportStatistic$1(this, continuation);
        }
        Object objC = sportStatRepository$findSportStatistic$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = sportStatRepository$findSportStatistic$1.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objC);
            StringBuilder sb = new StringBuilder();
            sb.append("findHistoryStatistic：sportType ->");
            sb.append(i);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(this.mAccountManager.getSsoid());
            dataReadOptionV2.setDataTable(1065);
            dataReadOptionV2.setReadConfig(map);
            dataReadOptionV2.setReadSportMode(i);
            dataReadOptionV2.setStartTime(j2);
            dataReadOptionV2.setEndTime(j3);
            dataReadOptionV2.setGroupUnitType(i2);
            dataReadOptionV2.setSortOrder(i4);
            if (i3 > 0) {
                dataReadOptionV2.setCount(i3);
            }
            if (str != null) {
                dataReadOptionV2.setDataReadType(str);
            }
            dataReadOptionV2.setReadValidCountData(z);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            sportStatRepository$findSportStatistic$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, sportStatRepository$findSportStatistic$1);
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
}
