package com.heytap.sports.record.details.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.SportMetaData;
import com.heytap.databaseengine.model.TrackMetaData;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.model.Vo2MaxExtra;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.sports.record.details.bean.HistoryData;
import com.heytap.sports.record.details.bean.LastData;
import com.heytap.sports.record.details.bean.SportAiRequestParams;
import com.heytap.sports.record.details.bean.SportSummary;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.um;
import com.oplus.onet.IONetService;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/record/details/model/SportRecordAIRepository;", "", "", "startTimeStamp", "endTimeStamp", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", MapSchema.FIELD_NAME_ENTRY, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datas30Days", "Lkotlin/Pair;", "Lcom/heytap/sports/record/details/bean/LastData;", "Lcom/heytap/sports/record/details/bean/HistoryData;", "d", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/OneTimeSport;", "oneTimeSport", "lastAndHistoryData", "Lcom/heytap/sports/record/details/bean/SportAiRequestParams;", "c", "f", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportRecordAIRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordAIRepository.kt\ncom/heytap/sports/record/details/model/SportRecordAIRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n766#2:260\n857#2,2:261\n766#2:263\n857#2,2:264\n1855#2:266\n1864#2,3:267\n1856#2:270\n766#2:271\n857#2,2:272\n1855#2:274\n1864#2,3:275\n1856#2:278\n1549#2:279\n1620#2,3:280\n766#2:283\n857#2,2:284\n*S KotlinDebug\n*F\n+ 1 SportRecordAIRepository.kt\ncom/heytap/sports/record/details/model/SportRecordAIRepository\n*L\n76#1:260\n76#1:261,2\n80#1:263\n80#1:264,2\n87#1:266\n91#1:267,3\n87#1:270\n99#1:271\n99#1:272,2\n101#1:274\n105#1:275,3\n101#1:278\n111#1:279\n111#1:280,3\n115#1:283\n115#1:284,2\n*E\n"})
public final class SportRecordAIRepository {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "Ljava/util/ArrayList;", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "Lkotlin/collections/ArrayList;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSportRecordAIRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordAIRepository.kt\ncom/heytap/sports/record/details/model/SportRecordAIRepository$findHistoryStats$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1855#2,2:260\n*S KotlinDebug\n*F\n+ 1 SportRecordAIRepository.kt\ncom/heytap/sports/record/details/model/SportRecordAIRepository$findHistoryStats$2\n*L\n57#1:260,2\n*E\n"})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<TrackMetadataStat> apply(@Nullable CommonBackBean commonBackBean) {
            ArrayList<TrackMetadataStat> arrayList = new ArrayList<>();
            if (commonBackBean != null && commonBackBean.getObj() != null && commonBackBean.getErrorCode() == 0) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (T t : (List) obj) {
                    if (t instanceof TrackMetadataStat) {
                        arrayList.add(t);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("findHistoryStatistic dataList:");
            sb.append(arrayList);
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "Ljava/util/ArrayList;", "Lcom/heytap/databaseengine/model/OneTimeSport;", "Lkotlin/collections/ArrayList;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSportRecordAIRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordAIRepository.kt\ncom/heytap/sports/record/details/model/SportRecordAIRepository$queryRecordDetail$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1855#2,2:260\n*S KotlinDebug\n*F\n+ 1 SportRecordAIRepository.kt\ncom/heytap/sports/record/details/model/SportRecordAIRepository$queryRecordDetail$2\n*L\n184#1:260,2\n*E\n"})
    public static final class c<T, R> implements d08 {
        public static final c<T, R> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<OneTimeSport> apply(@Nullable CommonBackBean commonBackBean) {
            ArrayList<OneTimeSport> arrayList = new ArrayList<>();
            if (commonBackBean != null && commonBackBean.getObj() != null && commonBackBean.getErrorCode() == 0) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (T t : (List) obj) {
                    if (t instanceof OneTimeSport) {
                        arrayList.add(t);
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(long j2, @NotNull Continuation<? super String> continuation) {
        SportRecordAIRepository$buildH5Data$1 sportRecordAIRepository$buildH5Data$1;
        SportRecordAIRepository sportRecordAIRepository;
        List list;
        Pair<LastData, HistoryData> pairD;
        SportAiRequestParams sportAiRequestParamsC;
        if (continuation instanceof SportRecordAIRepository$buildH5Data$1) {
            sportRecordAIRepository$buildH5Data$1 = (SportRecordAIRepository$buildH5Data$1) continuation;
            int i = sportRecordAIRepository$buildH5Data$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportRecordAIRepository$buildH5Data$1.label = i - Integer.MIN_VALUE;
            } else {
                sportRecordAIRepository$buildH5Data$1 = new SportRecordAIRepository$buildH5Data$1(this, continuation);
            }
        } else {
            sportRecordAIRepository$buildH5Data$1 = new SportRecordAIRepository$buildH5Data$1(this, continuation);
        }
        SportRecordAIRepository$buildH5Data$1 sportRecordAIRepository$buildH5Data$2 = sportRecordAIRepository$buildH5Data$1;
        Object objF = sportRecordAIRepository$buildH5Data$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportRecordAIRepository$buildH5Data$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = sportRecordAIRepository$buildH5Data$2.J$0;
                this = (SportRecordAIRepository) sportRecordAIRepository$buildH5Data$2.L$0;
                ResultKt.throwOnFailure(objF);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) sportRecordAIRepository$buildH5Data$2.L$1;
                sportRecordAIRepository = (SportRecordAIRepository) sportRecordAIRepository$buildH5Data$2.L$0;
                ResultKt.throwOnFailure(objF);
            }
            pairD = sportRecordAIRepository.d((List) objF);
            if (!list.isEmpty()) {
                sportAiRequestParamsC = sportRecordAIRepository.c((OneTimeSport) list.get(0), pairD);
            } else {
                sportAiRequestParamsC = null;
            }
            return String.valueOf(sportAiRequestParamsC != null ? ExpandKt.d(sportAiRequestParamsC) : null);
        }
        ResultKt.throwOnFailure(objF);
        sportRecordAIRepository$buildH5Data$2.L$0 = this;
        sportRecordAIRepository$buildH5Data$2.J$0 = j2;
        sportRecordAIRepository$buildH5Data$2.label = 1;
        objF = f(j2, sportRecordAIRepository$buildH5Data$2);
        if (objF == coroutine_suspended) {
            return coroutine_suspended;
        }
        List list2 = (List) objF;
        LocalDate localDateMinusDays = o05.D(j2).minusDays(30L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "startTimeStamp.toLocalDate().minusDays(30)");
        sportRecordAIRepository$buildH5Data$2.L$0 = this;
        sportRecordAIRepository$buildH5Data$2.L$1 = list2;
        sportRecordAIRepository$buildH5Data$2.label = 2;
        Object objE = this.e(o05.H(localDateMinusDays), j2 + ((long) 1000), sportRecordAIRepository$buildH5Data$2);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        sportRecordAIRepository = this;
        list = list2;
        objF = objE;
        pairD = sportRecordAIRepository.d((List) objF);
        if (!list.isEmpty()) {
            sportAiRequestParamsC = sportRecordAIRepository.c((OneTimeSport) list.get(0), pairD);
        } else {
            sportAiRequestParamsC = null;
        }
        return String.valueOf(sportAiRequestParamsC != null ? ExpandKt.d(sportAiRequestParamsC) : null);
    }

    @NotNull
    public final SportAiRequestParams c(@NotNull OneTimeSport oneTimeSport, @NotNull Pair<LastData, HistoryData> lastAndHistoryData) {
        int recoveryTime;
        float f;
        float f2;
        Vo2MaxExtra vo2MaxExtra;
        Intrinsics.checkNotNullParameter(oneTimeSport, "oneTimeSport");
        Intrinsics.checkNotNullParameter(lastAndHistoryData, "lastAndHistoryData");
        TrackMetaData trackMetaData = (TrackMetaData) GsonUtil.a(oneTimeSport.getMetaData(), TrackMetaData.class);
        RunExtra runExtra = (RunExtra) GsonUtil.a(trackMetaData.getRunExtra(), RunExtra.class);
        if (runExtra == null) {
            runExtra = new RunExtra(0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, null, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0.0f, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0.0f, 0.0f, null, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 63, null);
        }
        SportMetaData sportMetaData = (SportMetaData) GsonUtil.a(oneTimeSport.getMetaData(), SportMetaData.class);
        if (sportMetaData == null || (vo2MaxExtra = sportMetaData.getVo2MaxExtra()) == null) {
            recoveryTime = -1;
            f = -1.0f;
            f2 = -1.0f;
        } else {
            float vo2max = vo2MaxExtra.getVo2max();
            float aerobicTE = vo2MaxExtra.getAerobicTE();
            recoveryTime = vo2MaxExtra.getRecoveryTime();
            f = vo2max;
            f2 = aerobicTE;
        }
        long startTimestamp = oneTimeSport.getStartTimestamp();
        long totalTime = trackMetaData.getTotalTime();
        int sportMode = oneTimeSport.getSportMode();
        long totalCal = runExtra.getTotalCal();
        int totalDistance = trackMetaData.getTotalDistance();
        int totalSteps = trackMetaData.getTotalSteps();
        long totalCalories = trackMetaData.getTotalCalories();
        List<Integer> hrZone = runExtra.getHrZone();
        if (hrZone == null) {
            hrZone = CollectionsKt__CollectionsKt.emptyList();
        }
        return new SportAiRequestParams(new SportSummary(startTimestamp, totalTime, sportMode, totalCal, totalDistance, totalSteps, totalCalories, hrZone, f, trackMetaData.getMaxHeartRate(), trackMetaData.getAvgHeartRate(), trackMetaData.getAvgPace(), trackMetaData.getBestPace(), f2, recoveryTime, trackMetaData.getAvgStepRate(), trackMetaData.getBestStepRate(), runExtra.getStride(), runExtra.getMaxStride(), runExtra.getAvgStance(), runExtra.getAvgBalance(), runExtra.getAvgVertical(), runExtra.getAvgVerticalRatio(), runExtra.getFatBurning(), runExtra.getAvgFatBurningRate(), runExtra.getSugarConsumption(), runExtra.getSugarConsumptionRate(), trackMetaData.getTotalTime() == 0 ? 0 : (int) (((long) ((runExtra.getBestFatBurningDuration() * 1000) * 100)) / trackMetaData.getTotalTime()), trackMetaData.getTotalClimb(), runExtra.getElevation(), runExtra.getWarnUpHrmLower(), runExtra.getWarnUpHrmUpper(), runExtra.getReducingFatHrmUpper(), runExtra.getStaminaHrmUpper(), runExtra.getAerobicHrmUpper(), runExtra.getLimitHrmUpper()), lastAndHistoryData.getFirst(), lastAndHistoryData.getSecond());
    }

    @NotNull
    public final Pair<LastData, HistoryData> d(@NotNull List<? extends TrackMetadataStat> datas30Days) {
        Object obj;
        Intrinsics.checkNotNullParameter(datas30Days, "datas30Days");
        List<? extends TrackMetadataStat> list = datas30Days;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            long startTimestamp = ((TrackMetadataStat) next).getStartTimestamp();
            LocalDate localDateMinusDays = o05.D(System.currentTimeMillis()).minusDays(6L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "currentTimeMillis().toLocalDate().minusDays(6)");
            if (startTimestamp >= o05.H(localDateMinusDays)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TrackMetadataStat) obj2).getStartTimestamp() >= o05.H(o05.D(System.currentTimeMillis()))) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        long totalCalories = 0;
        while (it2.hasNext()) {
            totalCalories += ((TrackMetadataStat) it2.next()).getTotalCalories();
        }
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0, 0, 0, 0, 0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            RunExtra runExtra = (RunExtra) GsonUtil.a(((TrackMetadataStat) it3.next()).getRunExtra(), RunExtra.class);
            List<Integer> hrZone = runExtra != null ? runExtra.getHrZone() : null;
            if (hrZone != null && hrZone.size() == 5) {
                int i = 0;
                for (Object obj3 : hrZone) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    listMutableListOf.set(i, Integer.valueOf(((Number) listMutableListOf.get(i)).intValue() + ((Number) obj3).intValue()));
                    i = i2;
                }
            }
        }
        List listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0, 0, 0, 0, 0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((TrackMetadataStat) obj4).getStartTimestamp() >= o05.H(o05.D(System.currentTimeMillis()))) {
                arrayList3.add(obj4);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            RunExtra runExtra2 = (RunExtra) GsonUtil.a(((TrackMetadataStat) it4.next()).getRunExtra(), RunExtra.class);
            List<Integer> hrZone2 = runExtra2 != null ? runExtra2.getHrZone() : null;
            if (hrZone2 != null && hrZone2.size() == 5) {
                int i3 = 0;
                for (Object obj5 : hrZone2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    listMutableListOf2.set(i3, Integer.valueOf(((Number) listMutableListOf2.get(i3)).intValue() + ((Number) obj5).intValue()));
                    i3 = i4;
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(o05.D(((TrackMetadataStat) it5.next()).getStartTimestamp()));
        }
        int size = CollectionsKt___CollectionsKt.distinct(arrayList4).size();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (oei.j(((TrackMetadataStat) obj6).getSportMode())) {
                arrayList5.add(obj6);
            }
        }
        Iterator it6 = arrayList5.iterator();
        long totalDistance = 0;
        while (it6.hasNext()) {
            totalDistance += ((TrackMetadataStat) it6.next()).getTotalDistance();
        }
        Iterator it7 = arrayList.iterator();
        long totalTime = 0;
        while (it7.hasNext()) {
            totalTime += ((TrackMetadataStat) it7.next()).getTotalTime() / ((long) 1000);
        }
        LastData lastData = new LastData(0L, Integer.MIN_VALUE);
        if (!datas30Days.isEmpty()) {
            List listTake = CollectionsKt___CollectionsKt.take(list, datas30Days.size() - 1);
            ListIterator listIterator = listTake.listIterator(listTake.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (((TrackMetadataStat) objPrevious).getTotalDistance() > 1000) {
                    obj = objPrevious;
                    break;
                }
            }
            TrackMetadataStat trackMetadataStat = (TrackMetadataStat) obj;
            if (trackMetadataStat != null) {
                lastData = new LastData(trackMetadataStat.getStartTimestamp(), trackMetadataStat.getSportMode());
            }
        }
        HistoryData historyData = new HistoryData(totalCalories, listMutableListOf, size, (int) totalDistance, (int) totalTime);
        StringBuilder sb = new StringBuilder();
        sb.append("buildLastAndHistoryData lastData:");
        sb.append(lastData);
        sb.append(", historyData:");
        sb.append(historyData);
        return new Pair<>(lastData, historyData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(long j2, long j3, @NotNull Continuation<? super List<? extends TrackMetadataStat>> continuation) {
        SportRecordAIRepository$findHistoryStats$1 sportRecordAIRepository$findHistoryStats$1;
        if (continuation instanceof SportRecordAIRepository$findHistoryStats$1) {
            sportRecordAIRepository$findHistoryStats$1 = (SportRecordAIRepository$findHistoryStats$1) continuation;
            int i = sportRecordAIRepository$findHistoryStats$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportRecordAIRepository$findHistoryStats$1.label = i - Integer.MIN_VALUE;
            } else {
                sportRecordAIRepository$findHistoryStats$1 = new SportRecordAIRepository$findHistoryStats$1(this, continuation);
            }
        } else {
            sportRecordAIRepository$findHistoryStats$1 = new SportRecordAIRepository$findHistoryStats$1(this, continuation);
        }
        Object objC = sportRecordAIRepository$findHistoryStats$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportRecordAIRepository$findHistoryStats$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("SportRecordAIRepository", "findHistoryStats");
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            dataReadOption.setSortOrder(1);
            jdd jddVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(b.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(jddVarJ0, "getInstance()\n          …   dataList\n            }");
            sportRecordAIRepository$findHistoryStats$1.label = 1;
            objC = RxExtendKt.c(jddVarJ0, sportRecordAIRepository$findHistoryStats$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …            }.awaitOnce()");
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j2, Continuation<? super List<? extends OneTimeSport>> continuation) {
        SportRecordAIRepository$queryRecordDetail$1 sportRecordAIRepository$queryRecordDetail$1;
        if (continuation instanceof SportRecordAIRepository$queryRecordDetail$1) {
            sportRecordAIRepository$queryRecordDetail$1 = (SportRecordAIRepository$queryRecordDetail$1) continuation;
            int i = sportRecordAIRepository$queryRecordDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportRecordAIRepository$queryRecordDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                sportRecordAIRepository$queryRecordDetail$1 = new SportRecordAIRepository$queryRecordDetail$1(this, continuation);
            }
        } else {
            sportRecordAIRepository$queryRecordDetail$1 = new SportRecordAIRepository$queryRecordDetail$1(this, continuation);
        }
        Object objC = sportRecordAIRepository$queryRecordDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportRecordAIRepository$queryRecordDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("SportRecordAIRepository", "queryRecordDetails");
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(1004);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j2 + ((long) 1000));
            dataReadOption.setSortOrder(1);
            dataReadOption.setCount(1);
            jdd jddVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(c.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(jddVarJ0, "getInstance()\n          …   dataList\n            }");
            sportRecordAIRepository$queryRecordDetail$1.label = 1;
            objC = RxExtendKt.c(jddVarJ0, sportRecordAIRepository$queryRecordDetail$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance()\n          …            }.awaitOnce()");
        return objC;
    }
}
