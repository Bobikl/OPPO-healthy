package com.heytap.health.health_archives.viewmodel;

import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrend;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import io.protostuff.MapSchema;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/AllAbnormalViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "v", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorStat;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "j", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "y", "()Ljava/lang/String;", "setMGender", "(Ljava/lang/String;)V", "mGender", "", "", LogFieldKey.LEVEL_KEY, "Ljava/util/Map;", "x", "()Ljava/util/Map;", "mAbnormalSystemMap", LogFieldKey.MESSAGE_KEY, "Ljava/util/List;", "A", "()Ljava/util/List;", "mSystemAbnormalList", "Lcom/heytap/health/base/livedata/OLiveData;", "", "n", "Lcom/heytap/health/base/livedata/OLiveData;", "z", "()Lcom/heytap/health/base/livedata/OLiveData;", "mNeedRefreshData", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAllAbnormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllAbnormalViewModel.kt\ncom/heytap/health/health_archives/viewmodel/AllAbnormalViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,85:1\n288#2,2:86\n766#2:88\n857#2,2:89\n372#3,7:91\n*S KotlinDebug\n*F\n+ 1 AllAbnormalViewModel.kt\ncom/heytap/health/health_archives/viewmodel/AllAbnormalViewModel\n*L\n52#1:86,2\n61#1:88\n61#1:89,2\n73#1:91,7\n*E\n"})
public final class AllAbnormalViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String mGender = "M";

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, List<IndicatorStat>> mAbnormalSystemMap = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<IndicatorStat> mSystemAbnormalList = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<Boolean> mNeedRefreshData = new OLiveData<>();

    @NotNull
    public final List<IndicatorStat> A() {
        return this.mSystemAbnormalList;
    }

    public final void v() {
        this.mSystemAbnormalList.clear();
        this.mAbnormalSystemMap.clear();
        this.mGender = "M";
        this.mNeedRefreshData.postValue(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x018b A[SYNTHETIC] */
    @Nullable
    public final Object w(@NotNull Continuation<? super List<IndicatorStat>> continuation) throws Throwable {
        AllAbnormalViewModel$getAbnormalIndicators$1 allAbnormalViewModel$getAbnormalIndicators$1;
        String str;
        Object next;
        AllAbnormalViewModel allAbnormalViewModel;
        LocalDateTime localDateTime;
        String sex;
        HealthArchiveRecord healthArchiveRecord;
        ArrayList<IndicatorStat> arrayList;
        String bodySystem;
        Map<String, List<IndicatorStat>> map;
        List<IndicatorStat> arrayList2;
        IndicatorStat indicatorStat;
        boolean z;
        boolean z2;
        boolean z3;
        AllAbnormalViewModel allAbnormalViewModel2 = this;
        if (continuation instanceof AllAbnormalViewModel$getAbnormalIndicators$1) {
            allAbnormalViewModel$getAbnormalIndicators$1 = (AllAbnormalViewModel$getAbnormalIndicators$1) continuation;
            int i = allAbnormalViewModel$getAbnormalIndicators$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allAbnormalViewModel$getAbnormalIndicators$1.label = i - Integer.MIN_VALUE;
            } else {
                allAbnormalViewModel$getAbnormalIndicators$1 = new AllAbnormalViewModel$getAbnormalIndicators$1(allAbnormalViewModel2, continuation);
            }
        } else {
            allAbnormalViewModel$getAbnormalIndicators$1 = new AllAbnormalViewModel$getAbnormalIndicators$1(allAbnormalViewModel2, continuation);
        }
        Object obj = allAbnormalViewModel$getAbnormalIndicators$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = allAbnormalViewModel$getAbnormalIndicators$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                String str2 = (String) allAbnormalViewModel$getAbnormalIndicators$1.L$1;
                AllAbnormalViewModel allAbnormalViewModel3 = (AllAbnormalViewModel) allAbnormalViewModel$getAbnormalIndicators$1.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                allAbnormalViewModel2 = allAbnormalViewModel3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                localDateTime = (LocalDateTime) allAbnormalViewModel$getAbnormalIndicators$1.L$1;
                allAbnormalViewModel = (AllAbnormalViewModel) allAbnormalViewModel$getAbnormalIndicators$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                indicatorStat = (IndicatorStat) obj2;
                if ((!indicatorStat.getTrendList().isEmpty()) || ((IndicatorTrend) CollectionsKt___CollectionsKt.last((List) indicatorStat.getTrendList())).getTime() <= localDateTime.minusYears(3L).toEpochSecond(ZoneOffset.UTC) * ((long) 1000)) {
                    z = false;
                } else {
                    z = true;
                }
                if (indicatorStat.getTag() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList.add(obj2);
                }
            }
            allAbnormalViewModel.mSystemAbnormalList.clear();
            allAbnormalViewModel.mSystemAbnormalList.addAll(arrayList);
            allAbnormalViewModel.mAbnormalSystemMap.clear();
            for (IndicatorStat indicatorStat2 : arrayList) {
                bodySystem = indicatorStat2.getBodySystem();
                if (bodySystem == null) {
                    bodySystem = "other";
                }
                map = allAbnormalViewModel.mAbnormalSystemMap;
                arrayList2 = map.get(bodySystem);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    map.put(bodySystem, arrayList2);
                }
                arrayList2.add(indicatorStat2);
            }
            allAbnormalViewModel.mNeedRefreshData.postValue(Boxing.boxBoolean(true));
            return arrayList;
        }
        ResultKt.throwOnFailure(obj);
        String strE = qg0.i().E(qg0.HEALTH_ARCHIVES_SELECT_OWNER, "");
        if (Intrinsics.areEqual(strE, qtf.l(R$string.health_archives_no_name))) {
            strE = "";
        }
        HealthArchivesRepository healthArchivesRepository = allAbnormalViewModel2.mRepository;
        allAbnormalViewModel$getAbnormalIndicators$1.L$0 = allAbnormalViewModel2;
        allAbnormalViewModel$getAbnormalIndicators$1.L$1 = strE;
        allAbnormalViewModel$getAbnormalIndicators$1.label = 1;
        Object objH = healthArchivesRepository.h((11 & 1) != 0 ? null : null, (11 & 2) != 0 ? null : null, (11 & 4) != 0 ? null : strE, (11 & 8) != 0 ? null : null, (11 & 16) != 0 ? 0 : 1, allAbnormalViewModel$getAbnormalIndicators$1);
        if (objH == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = strE;
        obj = objH;
        List list = (List) obj;
        String str3 = "M";
        if (!(!list.isEmpty())) {
            allAbnormalViewModel2.mGender = "M";
            allAbnormalViewModel2.mSystemAbnormalList.clear();
            allAbnormalViewModel2.mAbnormalSystemMap.clear();
            allAbnormalViewModel2.mNeedRefreshData.postValue(Boxing.boxBoolean(true));
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            healthArchiveRecord = (HealthArchiveRecord) next;
        } while (!((healthArchiveRecord.getSex() == null || Intrinsics.areEqual(healthArchiveRecord.getSex(), LanConstants.OPERATOR_UNKNOWN)) ? false : true));
        HealthArchiveRecord healthArchiveRecord2 = (HealthArchiveRecord) next;
        if (healthArchiveRecord2 != null && (sex = healthArchiveRecord2.getSex()) != null) {
            str3 = sex;
        }
        allAbnormalViewModel2.mGender = str3;
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        HealthArchivesRepository healthArchivesRepository2 = allAbnormalViewModel2.mRepository;
        Integer numBoxInt = Boxing.boxInt(2);
        allAbnormalViewModel$getAbnormalIndicators$1.L$0 = allAbnormalViewModel2;
        allAbnormalViewModel$getAbnormalIndicators$1.L$1 = localDateTimeNow;
        allAbnormalViewModel$getAbnormalIndicators$1.label = 2;
        Object objQ = healthArchivesRepository2.q((14 & 1) != 0 ? null : null, (14 & 2) != 0 ? null : str, (14 & 4) != 0 ? null : numBoxInt, (14 & 8) != 0 ? null : null, allAbnormalViewModel$getAbnormalIndicators$1);
        if (objQ == coroutine_suspended) {
            return coroutine_suspended;
        }
        allAbnormalViewModel = allAbnormalViewModel2;
        localDateTime = localDateTimeNow;
        obj = objQ;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            indicatorStat = (IndicatorStat) obj2;
            if (!indicatorStat.getTrendList().isEmpty()) {
                z = false;
            } else {
                z = false;
            }
            if (indicatorStat.getTag() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (z3) {
                arrayList.add(obj2);
            }
        }
        allAbnormalViewModel.mSystemAbnormalList.clear();
        allAbnormalViewModel.mSystemAbnormalList.addAll(arrayList);
        allAbnormalViewModel.mAbnormalSystemMap.clear();
        while (r0.hasNext()) {
            bodySystem = indicatorStat2.getBodySystem();
            if (bodySystem == null) {
                bodySystem = "other";
            }
            map = allAbnormalViewModel.mAbnormalSystemMap;
            arrayList2 = map.get(bodySystem);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                map.put(bodySystem, arrayList2);
            }
            arrayList2.add(indicatorStat2);
        }
        allAbnormalViewModel.mNeedRefreshData.postValue(Boxing.boxBoolean(true));
        return arrayList;
    }

    @NotNull
    public final Map<String, List<IndicatorStat>> x() {
        return this.mAbnormalSystemMap;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getMGender() {
        return this.mGender;
    }

    @NotNull
    public final OLiveData<Boolean> z() {
        return this.mNeedRefreshData;
    }
}
