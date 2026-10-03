package com.heytap.health.sleep.day.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.oplus.aiunit.vision.pkh;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/heytap/health/sleep/day/viewmodel/SleepMeasureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/heytap/health/base/livedata/OLiveData;", "", "u", "", "v", "Lcom/oplus/aiunit/vision/pkh;", "i", "Lcom/oplus/aiunit/vision/pkh;", "repository", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepMeasureViewModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final pkh repository = new pkh();

    @NotNull
    public final OLiveData<Long> u() {
        return this.repository.b();
    }

    public final void v() {
        this.repository.c();
    }
}
