package com.heytap.health.menstrual_period.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/CycleCalendarViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/MutableLiveData;", "", "i", "Lkotlin/Lazy;", "u", "()Landroidx/lifecycle/MutableLiveData;", "editModeLiveData", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CycleCalendarViewModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy editModeLiveData = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<Boolean>>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleCalendarViewModel$editModeLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    });

    @NotNull
    public final MutableLiveData<Boolean> u() {
        return (MutableLiveData) this.editModeLiveData.getValue();
    }
}
