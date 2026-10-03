package com.heytap.health.health_archives.viewmodel;

import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.health_archives.autosync.ArchiveUploadHelper;
import com.heytap.health.health_archives.bean.ArchiveSettingBean;
import com.heytap.health.health_archives.bean.ArchiveSettingRequestBean;
import com.heytap.health.health_archives.helper.ArchivesRetrofitHelper;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.hfg;
import com.oplus.aiunit.vision.km8;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.u61;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\u0006\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/HealthArchivesViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", c8l.KEY_B, "C", "y", "", "", "z", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gender", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "records", "D", "A", "Lcom/oplus/aiunit/vision/km8;", "j", "Lcom/oplus/aiunit/vision/km8;", "mService", MapSchema.FIELD_NAME_KEY, "mEncryptService", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "<init>", "()V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthArchivesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchivesViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n766#2:151\n857#2,2:152\n*S KotlinDebug\n*F\n+ 1 HealthArchivesViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesViewModel\n*L\n90#1:151\n90#1:152,2\n*E\n"})
public final class HealthArchivesViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "HealthArchivesViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final km8 mService = (km8) ArchivesRetrofitHelper.b(km8.class);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final km8 mEncryptService = (km8) ArchivesRetrofitHelper.c(km8.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"com/heytap/health/health_archives/viewmodel/HealthArchivesViewModel$b", "Lcom/oplus/aiunit/vision/u61;", "", "Lcom/heytap/health/health_archives/bean/ArchiveSettingBean;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthArchivesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchivesViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesViewModel$queryHealthArchiveSetting$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1855#2,2:151\n*S KotlinDebug\n*F\n+ 1 HealthArchivesViewModel.kt\ncom/heytap/health/health_archives/viewmodel/HealthArchivesViewModel$queryHealthArchiveSetting$1\n*L\n133#1:151,2\n*E\n"})
    public static final class b extends u61<List<? extends ArchiveSettingBean>> {
        @Override // com.oplus.aiunit.vision.u61
        public void b(@Nullable Throwable e2, @Nullable String errMsg) {
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable List<ArchiveSettingBean> result) {
            List<ArchiveSettingBean> list = result;
            if (list == null || list.isEmpty()) {
                a7b.b("HealthArchivesViewModel", "remove local setting key!");
                qg0.i().a0(qg0.HEALTH_DOC_SETTING_KEY);
            } else {
                for (ArchiveSettingBean archiveSettingBean : result) {
                    if (archiveSettingBean.getSettingValue().length() > 0) {
                        qg0.i().U(archiveSettingBean.getSettingKey(), archiveSettingBean.getSettingValue());
                    }
                }
            }
            ArchiveUploadHelper.q();
        }
    }

    public final void A() {
        this.mService.r(new ArchiveSettingRequestBean(null, 1, null)).L0(hfg.d()).subscribe(new b());
    }

    public final void B() {
        this.mRepository.J();
    }

    public final void C() {
        this.mRepository.K().c();
    }

    public final void D(@NotNull String gender, @NotNull List<HealthArchiveRecord> records) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(records, "records");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HealthArchivesViewModel$updateOwnerGender$1(records, gender, this, null), 3, null);
    }

    public final void y() {
        this.mRepository.f().c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object z(@NotNull Continuation<? super List<String>> continuation) {
        HealthArchivesViewModel$getAllOwners$1 healthArchivesViewModel$getAllOwners$1;
        if (continuation instanceof HealthArchivesViewModel$getAllOwners$1) {
            healthArchivesViewModel$getAllOwners$1 = (HealthArchivesViewModel$getAllOwners$1) continuation;
            int i = healthArchivesViewModel$getAllOwners$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                healthArchivesViewModel$getAllOwners$1.label = i - Integer.MIN_VALUE;
            } else {
                healthArchivesViewModel$getAllOwners$1 = new HealthArchivesViewModel$getAllOwners$1(this, continuation);
            }
        } else {
            healthArchivesViewModel$getAllOwners$1 = new HealthArchivesViewModel$getAllOwners$1(this, continuation);
        }
        Object objJ = healthArchivesViewModel$getAllOwners$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = healthArchivesViewModel$getAllOwners$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJ);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            healthArchivesViewModel$getAllOwners$1.label = 1;
            objJ = healthArchivesRepository.j(healthArchivesViewModel$getAllOwners$1);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJ);
        }
        List list = (List) objJ;
        if (!(!list.isEmpty())) {
            return list;
        }
        String mineName = qg0.e().E("archives_belonged", "");
        if ((mineName == null || mineName.length() == 0) || list.indexOf(mineName) < 0) {
            return list;
        }
        Intrinsics.checkNotNullExpressionValue(mineName, "mineName");
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(mineName);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual((String) obj, mineName)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }
}
