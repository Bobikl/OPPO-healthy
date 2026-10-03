package com.heytap.sports.coach.tips;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.MetadataUnit;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.oplus.aiunit.vision.HealthCommonDataBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.rfa;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.xj3;
import com.oplus.weatherservicesdk.data.Weather;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.LongProgression;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/coach/tips/CoachTipsHealthRepo;", "", "", "Lcom/oplus/aiunit/vision/dq8;", "c", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "count", "readHealthDataType", "dataTable", "b", "(JIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoachTipsHealthRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachTipsHealthRepo.kt\ncom/heytap/sports/coach/tips/CoachTipsHealthRepo\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n76#2:162\n96#2,5:163\n125#2:182\n152#2,2:183\n154#2:189\n1477#3:168\n1502#3,3:169\n1505#3,3:179\n766#3:186\n857#3,2:187\n1045#3:190\n372#4,7:172\n1#5:185\n*S KotlinDebug\n*F\n+ 1 CoachTipsHealthRepo.kt\ncom/heytap/sports/coach/tips/CoachTipsHealthRepo\n*L\n31#1:162\n31#1:163,5\n35#1:182\n35#1:183,2\n35#1:189\n33#1:168\n33#1:169,3\n33#1:179,3\n50#1:186\n50#1:187,2\n68#1:190\n33#1:172,7\n*E\n"})
public final class CoachTipsHealthRepo {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public final /* synthetic */ long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f7804j;

        public b(long j2, long j3) {
            this.i = j2;
            this.f7804j = j3;
        }

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<MetadataUnit> apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList();
            LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(this.i, this.f7804j), 86400000L);
            long first = longProgressionStep.getFirst();
            long last = longProgressionStep.getLast();
            long step = longProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    MetadataUnit metadataUnit = new MetadataUnit(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
                    metadataUnit.setStartTimestamp(first);
                    arrayList.add(metadataUnit);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoachTipsHealthRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachTipsHealthRepo.kt\ncom/heytap/sports/coach/tips/CoachTipsHealthRepo$queryDataList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1855#2:162\n1856#2:164\n1#3:163\n*S KotlinDebug\n*F\n+ 1 CoachTipsHealthRepo.kt\ncom/heytap/sports/coach/tips/CoachTipsHealthRepo$queryDataList$2\n*L\n150#1:162\n150#1:164\n*E\n"})
    public static final class c<T, R> implements d08 {
        public static final c<T, R> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> apply(@Nullable CommonBackBean commonBackBean) {
            Object obj;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            if (commonBackBean != null && commonBackBean.getErrorCode() == 0) {
                z = true;
            }
            if (z && (obj = commonBackBean.getObj()) != null) {
                List list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    for (T t : list) {
                        if (t != null) {
                            arrayList.add(t);
                        }
                    }
                }
            }
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder();
            sb.append("getHeartRateDataStat dataList ");
            sb.append(size);
            sb.append("}");
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T, R> implements d08 {
        public static final d<T, R> INSTANCE = new d<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoachTipsHealthRepo.kt\ncom/heytap/sports/coach/tips/CoachTipsHealthRepo\n*L\n1#1,328:1\n68#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HealthCommonDataBean) t).getStartTime()), Long.valueOf(((HealthCommonDataBean) t2).getStartTime()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object a(final long j2, final long j3, @NotNull Continuation<? super List<MetadataUnit>> continuation) {
        CoachTipsHealthRepo$getRunningDistance$1 coachTipsHealthRepo$getRunningDistance$1;
        if (continuation instanceof CoachTipsHealthRepo$getRunningDistance$1) {
            coachTipsHealthRepo$getRunningDistance$1 = (CoachTipsHealthRepo$getRunningDistance$1) continuation;
            int i = coachTipsHealthRepo$getRunningDistance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coachTipsHealthRepo$getRunningDistance$1.label = i - Integer.MIN_VALUE;
            } else {
                coachTipsHealthRepo$getRunningDistance$1 = new CoachTipsHealthRepo$getRunningDistance$1(this, continuation);
            }
        } else {
            coachTipsHealthRepo$getRunningDistance$1 = new CoachTipsHealthRepo$getRunningDistance$1(this, continuation);
        }
        CoachTipsHealthRepo$getRunningDistance$1 coachTipsHealthRepo$getRunningDistance$2 = coachTipsHealthRepo$getRunningDistance$1;
        Object objC = coachTipsHealthRepo$getRunningDistance$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = coachTipsHealthRepo$getRunningDistance$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(1065);
            dataReadOptionV2.setReadSportMode(100);
            dataReadOptionV2.setGroupUnitType(4);
            dataReadOptionV2.setStartTime(j2);
            dataReadOptionV2.setEndTime(j3);
            dataReadOptionV2.setCount(30);
            dataReadOptionV2.setSortOrder(1);
            dataReadOptionV2.setReadConfig(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(Boxing.boxInt(600027), Boxing.boxInt(1))));
            dataReadOptionV2.setDeviceCategoryList(rfa.a().h());
            lbd lbdVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2).j0(new d08() { // from class: com.heytap.sports.coach.tips.CoachTipsHealthRepo$getRunningDistance$2
                @Override // com.oplus.aiunit.vision.d08
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List<MetadataUnit> apply(@Nullable CommonBackBean commonBackBean) {
                    T next;
                    Object obj;
                    ArrayList arrayList = new ArrayList();
                    if (commonBackBean != null && (obj = commonBackBean.getObj()) != null && commonBackBean.getErrorCode() == 0) {
                        List list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            for (T t : list) {
                                if (t instanceof MetadataUnit) {
                                    arrayList.add(t);
                                }
                            }
                        }
                    }
                    String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, Weather.SEPARATOR, null, null, 0, null, new Function1<MetadataUnit, CharSequence>() { // from class: com.heytap.sports.coach.tips.CoachTipsHealthRepo$getRunningDistance$2.2
                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final CharSequence invoke(@NotNull MetadataUnit it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getClientDataId() + "," + it.getStartTimestamp() + "," + it.getValue();
                        }
                    }, 30, null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("getRunningDistance dataList ");
                    sb.append(strJoinToString$default);
                    ArrayList arrayList2 = new ArrayList();
                    LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(j2, j3), 86400000L);
                    long first = longProgressionStep.getFirst();
                    long last = longProgressionStep.getLast();
                    long step = longProgressionStep.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        while (true) {
                            Iterator<T> it = arrayList.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (!v05.x(first, ((MetadataUnit) next).getStartTimestamp()));
                            MetadataUnit metadataUnit = next;
                            if (metadataUnit != null) {
                                arrayList2.add(metadataUnit);
                            } else {
                                MetadataUnit metadataUnit2 = new MetadataUnit(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
                                metadataUnit2.setStartTimestamp(first);
                                arrayList2.add(metadataUnit2);
                            }
                            if (first == last) {
                                break;
                            }
                            first += step;
                        }
                    }
                    a7b.f("CoachTipsHealthRepo", "getRunningDistance resultList " + arrayList2.size());
                    return arrayList2;
                }
            }).t0(new b(j2, j3));
            Intrinsics.checkNotNullExpressionValue(lbdVarT0, "suspend fun getRunningDi…      }.awaitOnce()\n    }");
            coachTipsHealthRepo$getRunningDistance$2.label = 1;
            objC = RxExtendKt.c(lbdVarT0, coachTipsHealthRepo$getRunningDistance$2);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "suspend fun getRunningDi…      }.awaitOnce()\n    }");
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(long j2, int i, int i2, int i3, @NotNull Continuation<? super List<? extends Object>> continuation) {
        CoachTipsHealthRepo$queryDataList$1 coachTipsHealthRepo$queryDataList$1;
        if (continuation instanceof CoachTipsHealthRepo$queryDataList$1) {
            coachTipsHealthRepo$queryDataList$1 = (CoachTipsHealthRepo$queryDataList$1) continuation;
            int i4 = coachTipsHealthRepo$queryDataList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                coachTipsHealthRepo$queryDataList$1.label = i4 - Integer.MIN_VALUE;
            } else {
                coachTipsHealthRepo$queryDataList$1 = new CoachTipsHealthRepo$queryDataList$1(this, continuation);
            }
        } else {
            coachTipsHealthRepo$queryDataList$1 = new CoachTipsHealthRepo$queryDataList$1(this, continuation);
        }
        Object objC = coachTipsHealthRepo$queryDataList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = coachTipsHealthRepo$queryDataList$1.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objC);
            LocalDate localDateMinusDays = o05.D(j2).minusDays(i - 1);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "endTime.toLocalDate().mi…ays((count - 1).toLong())");
            long jX = o05.x(localDateMinusDays);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setStartTime(jX);
            dataReadOptionV2.setEndTime(j2);
            dataReadOptionV2.setReadHealthDataType(i2);
            dataReadOptionV2.setDataTable(i3);
            dataReadOptionV2.setGroupUnitType(4);
            dataReadOptionV2.setSortOrder(1);
            dataReadOptionV2.setDeviceCategoryList(rfa.a().h());
            lbd lbdVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2).j0(c.INSTANCE).t0(d.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(lbdVarT0, "getInstance().readSportH…bleListOf()\n            }");
            coachTipsHealthRepo$queryDataList$1.label = 1;
            objC = RxExtendKt.c(lbdVarT0, coachTipsHealthRepo$queryDataList$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…            }.awaitOnce()");
        return objC;
    }

    @NotNull
    public final List<HealthCommonDataBean> c() {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Map<Integer, List<MetadataUnit>> mapA = xj3.INSTANCE.a();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, List<MetadataUnit>>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, it.next().getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String clientDataId = ((MetadataUnit) obj2).getClientDataId();
            Object arrayList2 = linkedHashMap.get(clientDataId);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(clientDataId, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            List list2 = list;
            Iterator it3 = list2.iterator();
            do {
                obj = null;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(((MetadataUnit) next).getType() == 600040));
            MetadataUnit metadataUnit = (MetadataUnit) next;
            int value = metadataUnit != null ? (int) metadataUnit.getValue() : 0;
            Iterator it4 = list2.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!(((MetadataUnit) next2).getType() == 600011));
            MetadataUnit metadataUnit2 = (MetadataUnit) next2;
            float value2 = metadataUnit2 != null ? (float) metadataUnit2.getValue() : 0.0f;
            Iterator it5 = list2.iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (!(((MetadataUnit) next3).getType() == 600010));
            MetadataUnit metadataUnit3 = (MetadataUnit) next3;
            float value3 = metadataUnit3 != null ? (float) metadataUnit3.getValue() : 0.0f;
            for (Object obj3 : list2) {
                if (((MetadataUnit) obj3).getType() == 600030) {
                    obj = obj3;
                    break;
                }
            }
            MetadataUnit metadataUnit4 = (MetadataUnit) obj;
            int value4 = (metadataUnit4 != null ? (int) metadataUnit4.getValue() : 0) / 1000;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (SetsKt__SetsKt.setOf((Object[]) new Integer[]{600035, 600036, 600037, 600038}).contains(Integer.valueOf(((MetadataUnit) obj4).getType()))) {
                    arrayList4.add(obj4);
                }
            }
            Iterator it6 = arrayList4.iterator();
            int value5 = 0;
            while (it6.hasNext()) {
                value5 += (int) ((MetadataUnit) it6.next()).getValue();
            }
            boolean z = value4 >= 600 && value5 >= 60;
            MetadataUnit metadataUnit5 = (MetadataUnit) CollectionsKt___CollectionsKt.firstOrNull(list);
            arrayList3.add(new HealthCommonDataBean(metadataUnit5 != null ? metadataUnit5.getStartTimestamp() : 0L, value, new BigDecimal(String.valueOf(RangesKt___RangesKt.coerceAtLeast(value2, 0.0f))).setScale(1, RoundingMode.DOWN).floatValue(), new BigDecimal(String.valueOf(value3)).setScale(1, RoundingMode.DOWN).floatValue(), z));
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList3, new e());
    }
}
