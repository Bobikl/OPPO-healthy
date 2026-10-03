package com.heytap.health.health_archives.viewmodel;

import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrend;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.HealthArchivesMergedDataBean;
import com.heytap.health.health_archives.helper.ArchivesRetrofitHelper;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.health.health_archives.util.ExampleDataUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.km8;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.Grouping;
import p010kotlin.collections.GroupingKt__GroupingJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/HealthArchivesCardViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "w", "eyeStatus", "y", "Lcom/oplus/aiunit/vision/km8;", "j", "Lcom/oplus/aiunit/vision/km8;", "mService", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/heytap/health/health_archives/bean/HealthArchivesMergedDataBean;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "x", "()Lcom/heytap/health/base/livedata/OLiveData;", "mObserverMergedData", "<init>", "()V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthArchivesCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchivesCardViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesCardViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n1477#2:101\n1502#2,3:102\n1505#2,3:112\n766#2:115\n857#2,2:116\n1536#2:118\n372#3,7:105\n*S KotlinDebug\n*F\n+ 1 HealthArchivesCardViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesCardViewModel\n*L\n59#1:101\n59#1:102,3\n59#1:112,3\n68#1:115\n68#1:116,2\n84#1:118\n59#1:105,7\n*E\n"})
public final class HealthArchivesCardViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "HealthArchivesCardViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final km8 mService = (km8) ArchivesRetrofitHelper.b(km8.class);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<HealthArchivesMergedDataBean> mObserverMergedData = new OLiveData<>();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "sourceIterator", "element", "keyOf", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 HealthArchivesCardViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesCardViewModel\n*L\n1#1,3683:1\n85#2:3684\n*E\n"})
    public static final class b implements Grouping<IndicatorStat, String> {
        public final /* synthetic */ Iterable a;

        public b(Iterable iterable) {
            this.a = iterable;
        }

        @Override // p010kotlin.collections.Grouping
        public String keyOf(IndicatorStat element) {
            IndicatorStat indicatorStat = element;
            String category = indicatorStat.getCategory();
            if ((category == null || category.length() == 0) || Intrinsics.areEqual(indicatorStat.getCategory(), qtf.d().getString(R$string.health_archives_other))) {
                return qtf.l(R$string.health_archives_other_category);
            }
            String category2 = indicatorStat.getCategory();
            Intrinsics.checkNotNull(category2);
            return category2;
        }

        @Override // p010kotlin.collections.Grouping
        @NotNull
        public Iterator<IndicatorStat> sourceIterator() {
            return this.a.iterator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    /* JADX WARN: Code duplicated, block: B:64:0x01af  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object v(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1 healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1;
        String str;
        List list;
        String str2;
        List list2;
        HealthArchivesCardViewModel healthArchivesCardViewModel;
        LocalDateTime localDateTime;
        String owner;
        ArrayList arrayList;
        HealthArchivesMergedDataBean healthArchivesMergedDataBean;
        long dataCreatedTimestamp;
        IndicatorStat indicatorStat;
        boolean z;
        HealthArchivesCardViewModel healthArchivesCardViewModel2 = this;
        if (continuation instanceof HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1) {
            healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1 = (HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1) continuation;
            int i = healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.label = i - Integer.MIN_VALUE;
            } else {
                healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1 = new HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1(healthArchivesCardViewModel2, continuation);
            }
        } else {
            healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1 = new HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1(healthArchivesCardViewModel2, continuation);
        }
        Object obj = healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                String str3 = (String) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$1;
                HealthArchivesCardViewModel healthArchivesCardViewModel3 = (HealthArchivesCardViewModel) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$0;
                ResultKt.throwOnFailure(obj);
                str = str3;
                healthArchivesCardViewModel2 = healthArchivesCardViewModel3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                localDateTime = (LocalDateTime) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$4;
                list2 = (List) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$3;
                list = (List) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$2;
                str2 = (String) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$1;
                healthArchivesCardViewModel = (HealthArchivesCardViewModel) healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$0;
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
                if (z) {
                    arrayList.add(obj2);
                }
            }
            healthArchivesMergedDataBean = new HealthArchivesMergedDataBean(0, 0L, null, 7, null);
            healthArchivesMergedDataBean.setRecordCount(list.size());
            if (!list.isEmpty()) {
                dataCreatedTimestamp = ((HealthArchiveRecord) CollectionsKt___CollectionsKt.first(list)).getDataCreatedTimestamp();
            } else {
                dataCreatedTimestamp = 0;
            }
            healthArchivesMergedDataBean.setLatestFileTime(dataCreatedTimestamp);
            if (CollectionsKt___CollectionsKt.contains(list2, str2) && (!arrayList.isEmpty())) {
                healthArchivesMergedDataBean.setIndicators(GroupingKt__GroupingJVMKt.eachCount(new b(arrayList)));
            }
            healthArchivesCardViewModel.mObserverMergedData.postValue(healthArchivesMergedDataBean);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!qg0.j() && ExampleDataUtil.e() == 0) {
            healthArchivesCardViewModel2.mRepository.C();
        }
        if (!qg0.j() || ExampleDataUtil.e() != 2) {
            healthArchivesCardViewModel2.mObserverMergedData.postValue(new HealthArchivesMergedDataBean(0, 0L, null, 7, null));
            return Unit.INSTANCE;
        }
        String strE = qg0.e().E("archives_belonged", "");
        HealthArchivesRepository healthArchivesRepository = healthArchivesCardViewModel2.mRepository;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$0 = healthArchivesCardViewModel2;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$1 = strE;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.label = 1;
        Object objH = healthArchivesRepository.h((11 & 1) != 0 ? null : null, (11 & 2) != 0 ? null : null, (11 & 4) != 0 ? null : null, (11 & 8) != 0 ? null : null, (11 & 16) != 0 ? 0 : 1, healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1);
        if (objH == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = strE;
        obj = objH;
        List list3 = (List) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("storeOwner: ");
        sb.append(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list3) {
            HealthArchiveRecord healthArchiveRecord = (HealthArchiveRecord) obj3;
            String owner2 = healthArchiveRecord.getOwner();
            if (owner2 == null || owner2.length() == 0) {
                owner = qtf.l(R$string.health_archives_no_name);
            } else {
                owner = healthArchiveRecord.getOwner();
                Intrinsics.checkNotNull(owner);
            }
            Object arrayList2 = linkedHashMap.get(owner);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(owner, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        List list4 = CollectionsKt___CollectionsKt.toList(linkedHashMap.keySet());
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        HealthArchivesRepository healthArchivesRepository2 = healthArchivesCardViewModel2.mRepository;
        Integer numBoxInt = Boxing.boxInt(2);
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$0 = healthArchivesCardViewModel2;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$1 = str;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$2 = list3;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$3 = list4;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.L$4 = localDateTimeNow;
        healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1.label = 2;
        Object objQ = healthArchivesRepository2.q((14 & 1) != 0 ? null : null, (14 & 2) != 0 ? null : str, (14 & 4) != 0 ? null : numBoxInt, (14 & 8) != 0 ? null : null, healthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1);
        if (objQ == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list3;
        obj = objQ;
        str2 = str;
        list2 = list4;
        healthArchivesCardViewModel = healthArchivesCardViewModel2;
        localDateTime = localDateTimeNow;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            indicatorStat = (IndicatorStat) obj2;
            if (!indicatorStat.getTrendList().isEmpty()) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj2);
            }
        }
        healthArchivesMergedDataBean = new HealthArchivesMergedDataBean(0, 0L, null, 7, null);
        healthArchivesMergedDataBean.setRecordCount(list.size());
        if (!list.isEmpty()) {
            dataCreatedTimestamp = ((HealthArchiveRecord) CollectionsKt___CollectionsKt.first(list)).getDataCreatedTimestamp();
        } else {
            dataCreatedTimestamp = 0;
        }
        healthArchivesMergedDataBean.setLatestFileTime(dataCreatedTimestamp);
        if (CollectionsKt___CollectionsKt.contains(list2, str2)) {
            healthArchivesMergedDataBean.setIndicators(GroupingKt__GroupingJVMKt.eachCount(new b(arrayList)));
        }
        healthArchivesCardViewModel.mObserverMergedData.postValue(healthArchivesMergedDataBean);
        return Unit.INSTANCE;
    }

    public final int w() {
        return qg0.e().z(qg0.HEALTH_CARD_PRIVACY_MODE, 0);
    }

    @NotNull
    public final OLiveData<HealthArchivesMergedDataBean> x() {
        return this.mObserverMergedData;
    }

    public final void y(int eyeStatus) {
        qg0.e().S(qg0.HEALTH_CARD_PRIVACY_MODE, eyeStatus);
    }
}
