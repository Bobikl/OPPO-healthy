package com.heytap.health.health_archives.viewmodel;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrend;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.ArchiveSettingBean;
import com.heytap.health.health_archives.helper.ArchivesRetrofitHelper;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.health.health_archives.util.ExampleDataUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.hfg;
import com.oplus.aiunit.vision.km8;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.u61;
import com.oplus.aiunit.vision.y0k;
import io.protostuff.MapSchema;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0013\u0010\t\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/HealthArchivesIllustrateViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "switchKey", "", "check", "", "y", "z", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/km8;", "j", "Lcom/oplus/aiunit/vision/km8;", "mService", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/heytap/health/health_archives/viewmodel/HealthArchivesIllustrateViewModel$SwitchUpdateResult;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "w", "()Lcom/heytap/health/base/livedata/OLiveData;", "mSetSwitchResult", "", LogFieldKey.MESSAGE_KEY, "x", "mShowOtherTip", "<init>", "()V", "Companion", "a", "SwitchUpdateResult", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthArchivesIllustrateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchivesIllustrateViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesIllustrateViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n766#2:127\n857#2,2:128\n*S KotlinDebug\n*F\n+ 1 HealthArchivesIllustrateViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesIllustrateViewModel\n*L\n118#1:127\n118#1:128,2\n*E\n"})
public final class HealthArchivesIllustrateViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "HealthArchivesIllustrateViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final km8 mService = (km8) ArchivesRetrofitHelper.b(km8.class);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<SwitchUpdateResult> mSetSwitchResult = new OLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<Boolean> mShowOtherTip = new OLiveData<>();

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/HealthArchivesIllustrateViewModel$SwitchUpdateResult;", "", "switchKey", "", "success", "", "(Ljava/lang/String;Z)V", "getSuccess", "()Z", "getSwitchKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SwitchUpdateResult {
        private final boolean success;

        @NotNull
        private final String switchKey;

        public SwitchUpdateResult(@NotNull String switchKey, boolean z) {
            Intrinsics.checkNotNullParameter(switchKey, "switchKey");
            this.switchKey = switchKey;
            this.success = z;
        }

        public static /* synthetic */ SwitchUpdateResult copy$default(SwitchUpdateResult switchUpdateResult, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = switchUpdateResult.switchKey;
            }
            if ((i & 2) != 0) {
                z = switchUpdateResult.success;
            }
            return switchUpdateResult.copy(str, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSwitchKey() {
            return this.switchKey;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final SwitchUpdateResult copy(@NotNull String switchKey, boolean success) {
            Intrinsics.checkNotNullParameter(switchKey, "switchKey");
            return new SwitchUpdateResult(switchKey, success);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwitchUpdateResult)) {
                return false;
            }
            SwitchUpdateResult switchUpdateResult = (SwitchUpdateResult) other;
            return Intrinsics.areEqual(this.switchKey, switchUpdateResult.switchKey) && this.success == switchUpdateResult.success;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final String getSwitchKey() {
            return this.switchKey;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iHashCode = this.switchKey.hashCode() * 31;
            boolean z = this.success;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "SwitchUpdateResult(switchKey=" + this.switchKey + ", success=" + this.success + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/health_archives/viewmodel/HealthArchivesIllustrateViewModel$b", "Lcom/oplus/aiunit/vision/u61;", "", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends u61<String> {
        public final /* synthetic */ Map<String, Integer> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ HealthArchivesIllustrateViewModel f4578j;
        public final /* synthetic */ String k;

        public b(Map<String, Integer> map, HealthArchivesIllustrateViewModel healthArchivesIllustrateViewModel, String str) {
            this.i = map;
            this.f4578j = healthArchivesIllustrateViewModel;
            this.k = str;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@Nullable Throwable e2, @Nullable String errMsg) {
            a7b.b(HealthArchivesIllustrateViewModel.TAG, "setAutoInterpretationSwitch error, switchKey: " + this.k + ", errMsg: " + errMsg);
            y0k.i(qtf.l(R$string.health_archives_net_error));
            this.f4578j.w().postValue(new SwitchUpdateResult(this.k, false));
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable String result) {
            qg0.m(GsonUtil.e(this.i));
            this.f4578j.w().postValue(new SwitchUpdateResult(this.k, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        HealthArchivesIllustrateViewModel$getAbnormalIndicators$1 healthArchivesIllustrateViewModel$getAbnormalIndicators$1;
        LocalDateTime localDateTimeNow;
        Object objQ;
        if (continuation instanceof HealthArchivesIllustrateViewModel$getAbnormalIndicators$1) {
            healthArchivesIllustrateViewModel$getAbnormalIndicators$1 = (HealthArchivesIllustrateViewModel$getAbnormalIndicators$1) continuation;
            int i = healthArchivesIllustrateViewModel$getAbnormalIndicators$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                healthArchivesIllustrateViewModel$getAbnormalIndicators$1.label = i - Integer.MIN_VALUE;
            } else {
                healthArchivesIllustrateViewModel$getAbnormalIndicators$1 = new HealthArchivesIllustrateViewModel$getAbnormalIndicators$1(this, continuation);
            }
        } else {
            healthArchivesIllustrateViewModel$getAbnormalIndicators$1 = new HealthArchivesIllustrateViewModel$getAbnormalIndicators$1(this, continuation);
        }
        HealthArchivesIllustrateViewModel$getAbnormalIndicators$1 healthArchivesIllustrateViewModel$getAbnormalIndicators$2 = healthArchivesIllustrateViewModel$getAbnormalIndicators$1;
        Object obj = healthArchivesIllustrateViewModel$getAbnormalIndicators$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = healthArchivesIllustrateViewModel$getAbnormalIndicators$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!qg0.j() || ExampleDataUtil.e() != 2) {
                this.mShowOtherTip.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            String strE = qg0.e().E("archives_belonged", "");
            StringBuilder sb = new StringBuilder();
            sb.append("storeOwner: ");
            sb.append(strE);
            localDateTimeNow = LocalDateTime.now();
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            Integer numBoxInt = Boxing.boxInt(2);
            healthArchivesIllustrateViewModel$getAbnormalIndicators$2.L$0 = this;
            healthArchivesIllustrateViewModel$getAbnormalIndicators$2.L$1 = localDateTimeNow;
            healthArchivesIllustrateViewModel$getAbnormalIndicators$2.label = 1;
            objQ = healthArchivesRepository.q((14 & 1) != 0 ? null : null, (14 & 2) != 0 ? null : strE, (14 & 4) != 0 ? null : numBoxInt, (14 & 8) != 0 ? null : null, healthArchivesIllustrateViewModel$getAbnormalIndicators$2);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LocalDateTime localDateTime = (LocalDateTime) healthArchivesIllustrateViewModel$getAbnormalIndicators$2.L$1;
            HealthArchivesIllustrateViewModel healthArchivesIllustrateViewModel = (HealthArchivesIllustrateViewModel) healthArchivesIllustrateViewModel$getAbnormalIndicators$2.L$0;
            ResultKt.throwOnFailure(obj);
            objQ = obj;
            localDateTimeNow = localDateTime;
            this = healthArchivesIllustrateViewModel;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objQ) {
            IndicatorStat indicatorStat = (IndicatorStat) obj2;
            if ((indicatorStat.getTrendList().isEmpty() ^ true) && ((IndicatorTrend) CollectionsKt___CollectionsKt.last((List) indicatorStat.getTrendList())).getTime() > localDateTimeNow.minusYears(3L).toEpochSecond(ZoneOffset.UTC) * ((long) 1000)) {
                arrayList.add(obj2);
            }
        }
        this.mShowOtherTip.postValue(Boxing.boxBoolean(!arrayList.isEmpty()));
        return Unit.INSTANCE;
    }

    @NotNull
    public final OLiveData<SwitchUpdateResult> w() {
        return this.mSetSwitchResult;
    }

    @NotNull
    public final OLiveData<Boolean> x() {
        return this.mShowOtherTip;
    }

    public final void y(@NotNull String switchKey, int check) {
        Intrinsics.checkNotNullParameter(switchKey, "switchKey");
        Map mapMapOf = (Map) GsonUtil.b(qg0.b(), new TypeToken<Map<String, ? extends Integer>>() { // from class: com.heytap.health.health_archives.viewmodel.HealthArchivesIllustrateViewModel$setAutoInterpretationSwitch$savedMap$1
        }.getType());
        if (mapMapOf == null || mapMapOf.isEmpty()) {
            mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(switchKey, Integer.valueOf(check)));
        } else {
            mapMapOf.put(switchKey, Integer.valueOf(check));
        }
        km8 km8Var = this.mService;
        String packageName = b78.a().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getAppContext().packageName");
        String strE = GsonUtil.e(mapMapOf);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(switchMap)");
        km8Var.n(new ArchiveSettingBean(packageName, qg0.HEALTH_DOC_SETTING_KEY, strE)).L0(hfg.d()).n0(f30.c()).subscribe(new b(mapMapOf, this, switchKey));
    }

    public final void z() {
        this.mRepository.J();
    }
}
