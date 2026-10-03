package com.heytap.health.bodyfat.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.f04;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/bodyfat/viewmodel/BodyfatYearViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "x", "w", "Ljava/time/LocalDate;", "date", "y", "Landroidx/lifecycle/MutableLiveData;", "j", "Landroidx/lifecycle/MutableLiveData;", "_startDate", "Landroidx/lifecycle/LiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/LiveData;", "v", "()Landroidx/lifecycle/LiveData;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, LogFieldKey.LEVEL_KEY, "_endDate", LogFieldKey.MESSAGE_KEY, "getEndDate", "endDate", "<init>", "()V", "Companion", "a", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
public final class BodyfatYearViewModel extends BaseViewModel {
    public static final long DAYS_IN_YEAR_VIEW = 366;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<LocalDate> _startDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final LiveData<LocalDate> startDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<LocalDate> _endDate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final LiveData<LocalDate> endDate;
    public static final int $stable = 8;

    public BodyfatYearViewModel() {
        MutableLiveData<LocalDate> mutableLiveData = new MutableLiveData<>();
        this._startDate = mutableLiveData;
        this.startDate = mutableLiveData;
        MutableLiveData<LocalDate> mutableLiveData2 = new MutableLiveData<>();
        this._endDate = mutableLiveData2;
        this.endDate = mutableLiveData2;
        LocalDate localDateOf = LocalDate.of(LocalDate.now().getYear(), 1, 1);
        mutableLiveData.setValue(localDateOf);
        mutableLiveData2.setValue(localDateOf.plusDays(366L));
    }

    @NotNull
    public final LiveData<LocalDate> v() {
        return this.startDate;
    }

    public final void w() {
        LocalDate value = this._startDate.getValue();
        if (value == null) {
            value = LocalDate.now();
        }
        LocalDate localDateOf = LocalDate.of(value.getYear() + 1, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(start.year + 1, 1, 1)");
        y(localDateOf);
    }

    public final void x() {
        LocalDate value = this._startDate.getValue();
        if (value == null) {
            value = LocalDate.now();
        }
        LocalDate localDateOf = LocalDate.of(value.getYear() - 1, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(start.year - 1, 1, 1)");
        y(localDateOf);
    }

    public final void y(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWithDayOfMonth = date.withDayOfMonth(1);
        this._startDate.postValue(localDateWithDayOfMonth);
        this._endDate.postValue(localDateWithDayOfMonth.plusDays(366L));
    }
}
