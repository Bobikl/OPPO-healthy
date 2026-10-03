package com.heytap.health.blood.glucose.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.oplus.aiunit.vision.v9g;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u0007\u001a\u00020\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseChartStyleViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "v", "Landroidx/lifecycle/LiveData;", "", "x", "w", "Landroidx/lifecycle/MutableLiveData;", "j", "Landroidx/lifecycle/MutableLiveData;", "mChartStyleLiveData", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class BloodGlucoseChartStyleViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> mChartStyleLiveData = new MutableLiveData<>(Boolean.valueOf(v9g.x("health_blood_glucose_share_preference").r("blood_glucose_chart_type", true)));

    public final void v() {
        boolean z = !w();
        v9g.x("health_blood_glucose_share_preference").W("blood_glucose_chart_type", z);
        this.mChartStyleLiveData.postValue(Boolean.valueOf(z));
    }

    public final boolean w() {
        Boolean value = this.mChartStyleLiveData.getValue();
        if (value == null) {
            return true;
        }
        return value.booleanValue();
    }

    @NotNull
    public final LiveData<Boolean> x() {
        return this.mChartStyleLiveData;
    }
}
