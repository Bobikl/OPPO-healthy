package com.heytap.health.health_archives.viewmodel;

import com.heytap.databaseengine.model.healtharchive.HealthIndicatorFocus;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/FocusIndicatorViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorFocus;", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uniformIndicatorName", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorStat;", "w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "j", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "x", "()Ljava/util/List;", "setMFocusIndicatorList", "(Ljava/util/List;)V", "mFocusIndicatorList", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class FocusIndicatorViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public List<HealthIndicatorFocus> mFocusIndicatorList;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v(@NotNull Continuation<? super List<HealthIndicatorFocus>> continuation) {
        FocusIndicatorViewModel$getFocusIndicators$1 focusIndicatorViewModel$getFocusIndicators$1;
        FocusIndicatorViewModel focusIndicatorViewModel;
        if (continuation instanceof FocusIndicatorViewModel$getFocusIndicators$1) {
            focusIndicatorViewModel$getFocusIndicators$1 = (FocusIndicatorViewModel$getFocusIndicators$1) continuation;
            int i = focusIndicatorViewModel$getFocusIndicators$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusIndicatorViewModel$getFocusIndicators$1.label = i - Integer.MIN_VALUE;
            } else {
                focusIndicatorViewModel$getFocusIndicators$1 = new FocusIndicatorViewModel$getFocusIndicators$1(this, continuation);
            }
        } else {
            focusIndicatorViewModel$getFocusIndicators$1 = new FocusIndicatorViewModel$getFocusIndicators$1(this, continuation);
        }
        Object objY = focusIndicatorViewModel$getFocusIndicators$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = focusIndicatorViewModel$getFocusIndicators$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objY);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            focusIndicatorViewModel$getFocusIndicators$1.L$0 = this;
            focusIndicatorViewModel$getFocusIndicators$1.L$1 = this;
            focusIndicatorViewModel$getFocusIndicators$1.label = 1;
            objY = HealthArchivesRepository.y(healthArchivesRepository, null, focusIndicatorViewModel$getFocusIndicators$1, 1, null);
            if (objY == coroutine_suspended) {
                return coroutine_suspended;
            }
            focusIndicatorViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (FocusIndicatorViewModel) focusIndicatorViewModel$getFocusIndicators$1.L$1;
            focusIndicatorViewModel = (FocusIndicatorViewModel) focusIndicatorViewModel$getFocusIndicators$1.L$0;
            ResultKt.throwOnFailure(objY);
        }
        this.mFocusIndicatorList = (List) objY;
        List<HealthIndicatorFocus> list = focusIndicatorViewModel.mFocusIndicatorList;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final Object w(@NotNull String str, @NotNull Continuation<? super List<IndicatorStat>> continuation) {
        return this.mRepository.q((14 & 1) != 0 ? null : str, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, continuation);
    }

    @Nullable
    public final List<HealthIndicatorFocus> x() {
        return this.mFocusIndicatorList;
    }
}
