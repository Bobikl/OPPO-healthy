package com.heytap.health.sleep.snore.week.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.oplus.aiunit.vision.zyh;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/sleep/snore/week/viewmodel/SnoreRangeControlModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/oplus/aiunit/vision/zyh;", "snoreRangeControlBean", "", "w", "Lcom/heytap/health/base/livedata/OLiveData;", "i", "Lcom/heytap/health/base/livedata/OLiveData;", "u", "()Lcom/heytap/health/base/livedata/OLiveData;", "refreshViewOLive", "", "j", "v", "showRequestLoadingOLive", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SnoreRangeControlModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<zyh> refreshViewOLive = new OLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<Boolean> showRequestLoadingOLive = new OLiveData<>();

    @NotNull
    public final OLiveData<zyh> u() {
        return this.refreshViewOLive;
    }

    @NotNull
    public final OLiveData<Boolean> v() {
        return this.showRequestLoadingOLive;
    }

    public final void w(@NotNull zyh snoreRangeControlBean) {
        Intrinsics.checkNotNullParameter(snoreRangeControlBean, "snoreRangeControlBean");
        this.refreshViewOLive.postValue(snoreRangeControlBean);
    }
}
