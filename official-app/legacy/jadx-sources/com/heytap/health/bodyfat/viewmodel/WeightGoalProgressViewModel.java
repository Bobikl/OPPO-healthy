package com.heytap.health.bodyfat.viewmodel;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.databaseengine.model.weight.WeightGoal;
import com.heytap.health.base.base.BaseViewModel;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.ny1;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/bodyfat/viewmodel/WeightGoalProgressViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "userTagId", "", "A", "Lcom/heytap/databaseengine/model/weight/WeightGoal;", "oldGoal", "x", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "y", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/ny1;", "j", "Lcom/oplus/aiunit/vision/ny1;", "repository", "Landroidx/compose/runtime/MutableState;", "", MapSchema.FIELD_NAME_KEY, "Landroidx/compose/runtime/MutableState;", "z", "()Landroidx/compose/runtime/MutableState;", "goalListState", "<init>", "()V", "Companion", "a", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
public final class WeightGoalProgressViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ny1 repository = new ny1();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MutableState<List<WeightGoal>> goalListState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
    public static final int $stable = 8;

    public final void A(@Nullable String userTagId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WeightGoalProgressViewModel$loadGoalList$1(this, userTagId, null), 2, null);
    }

    public final void x(@NotNull WeightGoal oldGoal, @Nullable String userTagId) {
        Intrinsics.checkNotNullParameter(oldGoal, "oldGoal");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WeightGoalProgressViewModel$closeCurrentGoal$1(this, userTagId, oldGoal, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(String str, Continuation<? super WeightBodyFat> continuation) {
        WeightGoalProgressViewModel$fetchLatestWeight$1 weightGoalProgressViewModel$fetchLatestWeight$1;
        Object objM5287constructorimpl;
        if (continuation instanceof WeightGoalProgressViewModel$fetchLatestWeight$1) {
            weightGoalProgressViewModel$fetchLatestWeight$1 = (WeightGoalProgressViewModel$fetchLatestWeight$1) continuation;
            int i = weightGoalProgressViewModel$fetchLatestWeight$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                weightGoalProgressViewModel$fetchLatestWeight$1.label = i - Integer.MIN_VALUE;
            } else {
                weightGoalProgressViewModel$fetchLatestWeight$1 = new WeightGoalProgressViewModel$fetchLatestWeight$1(this, continuation);
            }
        } else {
            weightGoalProgressViewModel$fetchLatestWeight$1 = new WeightGoalProgressViewModel$fetchLatestWeight$1(this, continuation);
        }
        Object objC = weightGoalProgressViewModel$fetchLatestWeight$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = weightGoalProgressViewModel$fetchLatestWeight$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                if (str == null || str.length() == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("fetchLatestWeight skip empty userTagId=");
                    sb.append(str);
                    return null;
                }
                Result.Companion companion = Result.INSTANCE;
                lbd<List<WeightBodyFat>> lbdVarI = this.repository.I(str, System.currentTimeMillis(), 1, 1);
                Intrinsics.checkNotNullExpressionValue(lbdVarI, "repository.fetchWeightBo…erType.DESC\n            )");
                weightGoalProgressViewModel$fetchLatestWeight$1.label = 1;
                objC = RxExtendKt.c(lbdVarI, weightGoalProgressViewModel$fetchLatestWeight$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "repository.fetchWeightBo…            ).awaitOnce()");
            List list = (List) objC;
            Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fetchLatestWeight: ");
            sb2.append(objFirstOrNull);
            objM5287constructorimpl = Result.m5287constructorimpl((WeightBodyFat) CollectionsKt___CollectionsKt.firstOrNull(list));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.b("WeightGoalProgressVm", "fetchLatestWeight error: " + thM5290exceptionOrNullimpl.getMessage());
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            return null;
        }
        return objM5287constructorimpl;
    }

    @NotNull
    public final MutableState<List<WeightGoal>> z() {
        return this.goalListState;
    }
}
