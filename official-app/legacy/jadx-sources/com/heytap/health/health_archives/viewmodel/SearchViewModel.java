package com.heytap.health.health_archives.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health_archives.bean.ArchiveDetailNavigationData;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.c8l;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\u00148\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00148\u0006¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/SearchViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", SearchIntents.EXTRA_QUERY, "", UserInfo.SEX_FEMALE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "docId", "D", ExifInterface.LONGITUDE_EAST, "", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "archivesList", "x", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "j", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "Lcom/heytap/health/base/livedata/OLiveData;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", c8l.KEY_B, "()Lcom/heytap/health/base/livedata/OLiveData;", "mRecordList", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorStat;", LogFieldKey.LEVEL_KEY, "z", "mIndicatorStatList", "", LogFieldKey.MESSAGE_KEY, "A", "mNeedUpdateHistory", "", "n", "C", "mShowFragmentIndex", "o", "getMHealthArchiveDetail", "mHealthArchiveDetail", "Lcom/heytap/health/health_archives/bean/ArchiveDetailNavigationData;", LogFieldKey.PROCESS_NAME_KEY, "y", "mArchiveDetailNavigationData", "<init>", "()V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchViewModel.kt\ncom/heytap/health/health_archives/viewmodel/SearchViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1855#2,2:100\n1855#2,2:102\n*S KotlinDebug\n*F\n+ 1 SearchViewModel.kt\ncom/heytap/health/health_archives/viewmodel/SearchViewModel\n*L\n43#1:100,2\n48#1:102,2\n*E\n"})
public final class SearchViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "SearchViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<HealthArchiveRecord>> mRecordList = new OLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<List<IndicatorStat>> mIndicatorStatList = new OLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<Boolean> mNeedUpdateHistory = new OLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<Integer> mShowFragmentIndex = new OLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<HealthArchiveRecord> mHealthArchiveDetail = new OLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<ArchiveDetailNavigationData> mArchiveDetailNavigationData = new OLiveData<>();

    @NotNull
    public final OLiveData<Boolean> A() {
        return this.mNeedUpdateHistory;
    }

    @NotNull
    public final OLiveData<List<HealthArchiveRecord>> B() {
        return this.mRecordList;
    }

    @NotNull
    public final OLiveData<Integer> C() {
        return this.mShowFragmentIndex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object D(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        SearchViewModel$getRecordDetail$1 searchViewModel$getRecordDetail$1;
        if (continuation instanceof SearchViewModel$getRecordDetail$1) {
            searchViewModel$getRecordDetail$1 = (SearchViewModel$getRecordDetail$1) continuation;
            int i = searchViewModel$getRecordDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchViewModel$getRecordDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                searchViewModel$getRecordDetail$1 = new SearchViewModel$getRecordDetail$1(this, continuation);
            }
        } else {
            searchViewModel$getRecordDetail$1 = new SearchViewModel$getRecordDetail$1(this, continuation);
        }
        Object objA = searchViewModel$getRecordDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = searchViewModel$getRecordDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            searchViewModel$getRecordDetail$1.L$0 = this;
            searchViewModel$getRecordDetail$1.label = 1;
            objA = healthArchivesRepository.A(str, searchViewModel$getRecordDetail$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (SearchViewModel) searchViewModel$getRecordDetail$1.L$0;
            ResultKt.throwOnFailure(objA);
        }
        this.mHealthArchiveDetail.postValue((HealthArchiveRecord) objA);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object E(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SearchViewModel$prepareArchiveDetailNavigation$2(this, str, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[LOOP:0: B:33:0x00df->B:35:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object F(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        SearchViewModel$searchByQuery$1 searchViewModel$searchByQuery$1;
        SearchViewModel searchViewModel;
        List<HealthArchiveRecord> list;
        String str2;
        List<IndicatorStat> list2;
        Iterator it;
        if (continuation instanceof SearchViewModel$searchByQuery$1) {
            searchViewModel$searchByQuery$1 = (SearchViewModel$searchByQuery$1) continuation;
            int i = searchViewModel$searchByQuery$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchViewModel$searchByQuery$1.label = i - Integer.MIN_VALUE;
            } else {
                searchViewModel$searchByQuery$1 = new SearchViewModel$searchByQuery$1(this, continuation);
            }
        } else {
            searchViewModel$searchByQuery$1 = new SearchViewModel$searchByQuery$1(this, continuation);
        }
        Object objH = searchViewModel$searchByQuery$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = searchViewModel$searchByQuery$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) searchViewModel$searchByQuery$1.L$1;
                this = (SearchViewModel) searchViewModel$searchByQuery$1.L$0;
                ResultKt.throwOnFailure(objH);
            } else if (i2 == 2) {
                list = (List) searchViewModel$searchByQuery$1.L$2;
                String str3 = (String) searchViewModel$searchByQuery$1.L$1;
                SearchViewModel searchViewModel2 = (SearchViewModel) searchViewModel$searchByQuery$1.L$0;
                ResultKt.throwOnFailure(objH);
                str2 = str3;
                searchViewModel = searchViewModel2;
                HealthArchivesRepository healthArchivesRepository = searchViewModel.mRepository;
                searchViewModel$searchByQuery$1.L$0 = searchViewModel;
                searchViewModel$searchByQuery$1.L$1 = list;
                searchViewModel$searchByQuery$1.L$2 = null;
                searchViewModel$searchByQuery$1.label = 3;
                objH = healthArchivesRepository.I(str2, searchViewModel$searchByQuery$1);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) searchViewModel$searchByQuery$1.L$1;
                searchViewModel = (SearchViewModel) searchViewModel$searchByQuery$1.L$0;
                ResultKt.throwOnFailure(objH);
            }
            list2 = (List) objH;
            it = list2.iterator();
            while (it.hasNext()) {
                String indicatorName = ((IndicatorStat) it.next()).getIndicatorName();
                StringBuilder sb = new StringBuilder();
                sb.append("stat indicatorName : ");
                sb.append(indicatorName);
            }
            searchViewModel.mIndicatorStatList.postValue(list2);
            if ((!list2.isEmpty()) && (!list.isEmpty())) {
                searchViewModel.mShowFragmentIndex.postValue(Boxing.boxInt(1));
            } else {
                searchViewModel.mShowFragmentIndex.postValue(Boxing.boxInt(0));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objH);
        HealthArchivesRepository healthArchivesRepository2 = this.mRepository;
        searchViewModel$searchByQuery$1.L$0 = this;
        searchViewModel$searchByQuery$1.L$1 = str;
        searchViewModel$searchByQuery$1.label = 1;
        objH = healthArchivesRepository2.H(str, searchViewModel$searchByQuery$1);
        if (objH == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<HealthArchiveRecord> list3 = (List) objH;
        for (HealthArchiveRecord healthArchiveRecord : list3) {
            String name = healthArchiveRecord.getName();
            String owner = healthArchiveRecord.getOwner();
            String institute = healthArchiveRecord.getInstitute();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("record name : ");
            sb2.append(name);
            sb2.append(", owner : ");
            sb2.append(owner);
            sb2.append(", institute:");
            sb2.append(institute);
        }
        searchViewModel$searchByQuery$1.L$0 = this;
        searchViewModel$searchByQuery$1.L$1 = str;
        searchViewModel$searchByQuery$1.L$2 = list3;
        searchViewModel$searchByQuery$1.label = 2;
        if (this.x(list3, searchViewModel$searchByQuery$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str4 = str;
        searchViewModel = this;
        list = list3;
        str2 = str4;
        HealthArchivesRepository healthArchivesRepository3 = searchViewModel.mRepository;
        searchViewModel$searchByQuery$1.L$0 = searchViewModel;
        searchViewModel$searchByQuery$1.L$1 = list;
        searchViewModel$searchByQuery$1.L$2 = null;
        searchViewModel$searchByQuery$1.label = 3;
        objH = healthArchivesRepository3.I(str2, searchViewModel$searchByQuery$1);
        if (objH == coroutine_suspended) {
            return coroutine_suspended;
        }
        list2 = (List) objH;
        it = list2.iterator();
        while (it.hasNext()) {
            String indicatorName2 = ((IndicatorStat) it.next()).getIndicatorName();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("stat indicatorName : ");
            sb3.append(indicatorName2);
        }
        searchViewModel.mIndicatorStatList.postValue(list2);
        if (!list2.isEmpty()) {
            searchViewModel.mShowFragmentIndex.postValue(Boxing.boxInt(0));
        } else {
            searchViewModel.mShowFragmentIndex.postValue(Boxing.boxInt(1));
        }
        return Unit.INSTANCE;
    }

    public final void G() {
        this.mNeedUpdateHistory.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009e -> B:20:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x(java.util.List<com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord> r23, p010kotlin.coroutines.Continuation<? super p010kotlin.Unit> r24) {
        /*
            r22 = this;
            r0 = r24
            boolean r1 = r0 instanceof com.heytap.health.health_archives.viewmodel.SearchViewModel$getAbnormalNumber$1
            if (r1 == 0) goto L17
            r1 = r0
            com.heytap.health.health_archives.viewmodel.SearchViewModel$getAbnormalNumber$1 r1 = (com.heytap.health.health_archives.viewmodel.SearchViewModel$getAbnormalNumber$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r2 = r22
            goto L1e
        L17:
            com.heytap.health.health_archives.viewmodel.SearchViewModel$getAbnormalNumber$1 r1 = new com.heytap.health.health_archives.viewmodel.SearchViewModel$getAbnormalNumber$1
            r2 = r22
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L4e
            if (r4 != r5) goto L46
            int r2 = r1.I$1
            int r4 = r1.I$0
            java.lang.Object r6 = r1.L$2
            com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord r6 = (com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord) r6
            java.lang.Object r7 = r1.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$0
            com.heytap.health.health_archives.viewmodel.SearchViewModel r8 = (com.heytap.health.health_archives.viewmodel.SearchViewModel) r8
            p010kotlin.ResultKt.throwOnFailure(r0)
            r21 = r3
            r3 = r2
            r2 = r8
            r8 = r6
            r6 = r21
            goto La5
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4e:
            p010kotlin.ResultKt.throwOnFailure(r0)
            int r0 = r23.size()
            r4 = 0
            r15 = r4
            r4 = r3
            r3 = r0
            r0 = r23
        L5b:
            if (r15 >= r3) goto Lb3
            java.lang.Object r6 = r0.get(r15)
            r14 = r6
            com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord r14 = (com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord) r14
            com.heytap.health.health_archives.model.HealthArchivesRepository r6 = r2.mRepository
            java.lang.Object r7 = r0.get(r15)
            com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord r7 = (com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord) r7
            java.lang.String r7 = r7.getDocId()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            java.lang.Integer r11 = p010kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 238(0xee, float:3.34E-43)
            r18 = 0
            r1.L$0 = r2
            r1.L$1 = r0
            r1.L$2 = r14
            r1.I$0 = r15
            r1.I$1 = r3
            r1.label = r5
            r19 = r14
            r14 = r16
            r20 = r15
            r15 = r1
            r16 = r17
            r17 = r18
            java.lang.Object r6 = com.heytap.health.health_archives.model.HealthArchivesRepository.p(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r6 != r4) goto L9e
            return r4
        L9e:
            r7 = r0
            r0 = r6
            r8 = r19
            r6 = r4
            r4 = r20
        La5:
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r8.setAbnormalNumber(r0)
            int r15 = r4 + 1
            r4 = r6
            r0 = r7
            goto L5b
        Lb3:
            com.heytap.health.base.livedata.OLiveData<java.util.List<com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord>> r1 = r2.mRecordList
            r1.postValue(r0)
            kotlin.Unit r0 = p010kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.health_archives.viewmodel.SearchViewModel.x(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final OLiveData<ArchiveDetailNavigationData> y() {
        return this.mArchiveDetailNavigationData;
    }

    @NotNull
    public final OLiveData<List<IndicatorStat>> z() {
        return this.mIndicatorStatList;
    }
}
