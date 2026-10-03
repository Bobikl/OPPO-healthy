package com.heytap.health.bodyfat.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/bodyfat/viewmodel/BodyfatDayViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "x", "w", "Ljava/time/LocalDate;", "date", "y", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "j", "Landroidx/lifecycle/MutableLiveData;", "_anchorDate", "Landroidx/lifecycle/LiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/LiveData;", "v", "()Landroidx/lifecycle/LiveData;", "anchorDate", "<init>", "()V", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
public final class BodyfatDayViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<LocalDate> _anchorDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final LiveData<LocalDate> anchorDate;

    public BodyfatDayViewModel() {
        MutableLiveData<LocalDate> mutableLiveData = new MutableLiveData<>(LocalDate.now());
        this._anchorDate = mutableLiveData;
        this.anchorDate = mutableLiveData;
    }

    @NotNull
    public final LiveData<LocalDate> v() {
        return this.anchorDate;
    }

    public final void w() {
        LocalDate value = this._anchorDate.getValue();
        if (value == null) {
            value = LocalDate.now();
        }
        this._anchorDate.setValue(value.plusDays(1L));
    }

    public final void x() {
        LocalDate value = this._anchorDate.getValue();
        if (value == null) {
            value = LocalDate.now();
        }
        this._anchorDate.setValue(value.minusDays(1L));
    }

    public final void y(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this._anchorDate.setValue(date);
    }
}
