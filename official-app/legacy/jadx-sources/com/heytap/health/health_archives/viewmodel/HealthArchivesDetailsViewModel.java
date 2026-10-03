package com.heytap.health.health_archives.viewmodel;

import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.databaseengine.model.healtharchive.HealthReviewPlan;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrend;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.bean.ArchiveSettingBean;
import com.heytap.health.health_archives.bean.ReviewPlanTipBean;
import com.heytap.health.health_archives.helper.ArchivesRetrofitHelper;
import com.heytap.health.health_archives.helper.ReviewPlanHelperKt;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.hfg;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.km8;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.u61;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u001b\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/HealthArchivesDetailsViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "docId", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "v", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrend;", "x", "", c8l.KEY_B, "z", "record", "y", "(Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthReviewPlan;", "planList", "A", "Lcom/oplus/aiunit/vision/km8;", "j", "Lcom/oplus/aiunit/vision/km8;", "mService", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/heytap/health/health_archives/bean/ReviewPlanTipBean;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "w", "()Lcom/heytap/health/base/livedata/OLiveData;", "mPlanTipBean", "<init>", "()V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthArchivesDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchivesDetailsViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesDetailsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1855#2,2:127\n*S KotlinDebug\n*F\n+ 1 HealthArchivesDetailsViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesDetailsViewModel\n*L\n121#1:127,2\n*E\n"})
public final class HealthArchivesDetailsViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "HealthArchivesDetailsViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final km8 mService = (km8) ArchivesRetrofitHelper.b(km8.class);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<ReviewPlanTipBean> mPlanTipBean = new OLiveData<>();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/health_archives/viewmodel/HealthArchivesDetailsViewModel$b", "Lcom/oplus/aiunit/vision/u61;", "", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends u61<String> {
        public final /* synthetic */ Map<String, Integer> i;

        public b(Map<String, Integer> map) {
            this.i = map;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@Nullable Throwable e2, @Nullable String errMsg) {
            a7b.b(HealthArchivesIllustrateViewModel.TAG, "setAutoReportInterpretation error : " + errMsg);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable String result) {
            qg0.m(GsonUtil.e(this.i));
        }
    }

    public final void A(@Nullable List<HealthReviewPlan> planList) {
        List<HealthReviewPlan> list = planList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = planList.iterator();
        while (it.hasNext()) {
            ((HealthReviewPlan) it.next()).setIgnoreState(1);
        }
        this.mRepository.G(planList).c();
    }

    public final void B() {
        a aVarC = this.mRepository.K().c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "mRepository.syncHealthArchivesData().subscribe()");
        u(aVarC);
    }

    @Nullable
    public final Object v(@NotNull String str, @NotNull Continuation<? super HealthArchiveRecord> continuation) {
        return this.mRepository.A(str, continuation);
    }

    @NotNull
    public final OLiveData<ReviewPlanTipBean> w() {
        return this.mPlanTipBean;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object x(@NotNull String str, @NotNull Continuation<? super List<IndicatorTrend>> continuation) throws Throwable {
        HealthArchivesDetailsViewModel$getMriIndicator$1 healthArchivesDetailsViewModel$getMriIndicator$1;
        String str2;
        if (continuation instanceof HealthArchivesDetailsViewModel$getMriIndicator$1) {
            healthArchivesDetailsViewModel$getMriIndicator$1 = (HealthArchivesDetailsViewModel$getMriIndicator$1) continuation;
            int i = healthArchivesDetailsViewModel$getMriIndicator$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                healthArchivesDetailsViewModel$getMriIndicator$1.label = i - Integer.MIN_VALUE;
            } else {
                healthArchivesDetailsViewModel$getMriIndicator$1 = new HealthArchivesDetailsViewModel$getMriIndicator$1(this, continuation);
            }
        } else {
            healthArchivesDetailsViewModel$getMriIndicator$1 = new HealthArchivesDetailsViewModel$getMriIndicator$1(this, continuation);
        }
        HealthArchivesDetailsViewModel$getMriIndicator$1 healthArchivesDetailsViewModel$getMriIndicator$2 = healthArchivesDetailsViewModel$getMriIndicator$1;
        Object objO = healthArchivesDetailsViewModel$getMriIndicator$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = healthArchivesDetailsViewModel$getMriIndicator$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objO);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            Integer numBoxInt = Boxing.boxInt(1);
            str2 = str;
            healthArchivesDetailsViewModel$getMriIndicator$2.L$0 = str2;
            healthArchivesDetailsViewModel$getMriIndicator$2.label = 1;
            objO = healthArchivesRepository.o((238 & 1) != 0 ? null : str, (238 & 2) != 0 ? null : null, (238 & 4) != 0 ? null : null, (238 & 8) != 0 ? null : c8l.IMAGE_KEY, (238 & 16) != 0 ? null : null, (238 & 32) != 0 ? null : numBoxInt, (238 & 64) != 0 ? null : null, (238 & 128) != 0 ? null : null, healthArchivesDetailsViewModel$getMriIndicator$2);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) healthArchivesDetailsViewModel$getMriIndicator$2.L$0;
            ResultKt.throwOnFailure(objO);
        }
        List<IndicatorStat> list = (List) objO;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IndicatorStat indicatorStat : list) {
            arrayList.add(new IndicatorTrend(str2, indicatorStat.getDataCreatedTimestamp(), indicatorStat.getUniformValue(), indicatorStat.getValue(), null, indicatorStat.getInstitute(), indicatorStat.getRefer(), indicatorStat.getValueState(), indicatorStat.getRemind(), indicatorStat.getUniformUnit(), 0, false, k18.GL_SCISSOR_BOX, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y(@NotNull HealthArchiveRecord healthArchiveRecord, @NotNull Continuation<? super Unit> continuation) {
        HealthArchivesDetailsViewModel$getReviewPlan$1 healthArchivesDetailsViewModel$getReviewPlan$1;
        if (continuation instanceof HealthArchivesDetailsViewModel$getReviewPlan$1) {
            healthArchivesDetailsViewModel$getReviewPlan$1 = (HealthArchivesDetailsViewModel$getReviewPlan$1) continuation;
            int i = healthArchivesDetailsViewModel$getReviewPlan$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                healthArchivesDetailsViewModel$getReviewPlan$1.label = i - Integer.MIN_VALUE;
            } else {
                healthArchivesDetailsViewModel$getReviewPlan$1 = new HealthArchivesDetailsViewModel$getReviewPlan$1(this, continuation);
            }
        } else {
            healthArchivesDetailsViewModel$getReviewPlan$1 = new HealthArchivesDetailsViewModel$getReviewPlan$1(this, continuation);
        }
        Object objA = healthArchivesDetailsViewModel$getReviewPlan$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = healthArchivesDetailsViewModel$getReviewPlan$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            healthArchivesDetailsViewModel$getReviewPlan$1.L$0 = this;
            healthArchivesDetailsViewModel$getReviewPlan$1.label = 1;
            objA = ReviewPlanHelperKt.a(healthArchiveRecord, healthArchivesRepository, healthArchivesDetailsViewModel$getReviewPlan$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (HealthArchivesDetailsViewModel) healthArchivesDetailsViewModel$getReviewPlan$1.L$0;
            ResultKt.throwOnFailure(objA);
        }
        this.mPlanTipBean.postValue((ReviewPlanTipBean) objA);
        return Unit.INSTANCE;
    }

    public final void z() {
        Map linkedHashMap;
        String strB = qg0.b();
        boolean z = true;
        if (strB != null && strB.length() != 0) {
            z = false;
        }
        if (z) {
            linkedHashMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(qg0.AUTO_REPORT_INTERPRETATION_SWITCH, 1));
        } else {
            linkedHashMap = (Map) GsonUtil.b(strB, new TypeToken<Map<String, ? extends Integer>>() { // from class: com.heytap.health.health_archives.viewmodel.HealthArchivesDetailsViewModel$setAutoReportInterpretation$switchMap$savedMap$1
            }.getType());
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(qg0.AUTO_REPORT_INTERPRETATION_SWITCH, 1);
        }
        km8 km8Var = this.mService;
        String packageName = b78.a().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getAppContext().packageName");
        String strE = GsonUtil.e(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(switchMap)");
        km8Var.n(new ArchiveSettingBean(packageName, qg0.HEALTH_DOC_SETTING_KEY, strE)).L0(hfg.d()).n0(f30.c()).subscribe(new b(linkedHashMap));
    }
}
