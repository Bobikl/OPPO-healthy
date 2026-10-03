package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.n8i, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/n8i;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "a", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "b", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", DBAssessmentRecord.SPO2, "Lcom/oplus/aiunit/vision/db0;", "Lcom/oplus/aiunit/vision/db0;", "()Lcom/oplus/aiunit/vision/db0;", "appInstallBean", "<init>", "(Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;Lcom/oplus/aiunit/vision/db0;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Spo2DailyMonitorUiState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final com.heytap.health.settings.watch.sporthealthsettings.bean.z spo2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final AppInstallBean appInstallBean;

    public Spo2DailyMonitorUiState(@NotNull com.heytap.health.settings.watch.sporthealthsettings.bean.z spo2, @NotNull AppInstallBean appInstallBean) {
        Intrinsics.checkNotNullParameter(spo2, "spo2");
        Intrinsics.checkNotNullParameter(appInstallBean, "appInstallBean");
        this.spo2 = spo2;
        this.appInstallBean = appInstallBean;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AppInstallBean getAppInstallBean() {
        return this.appInstallBean;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.heytap.health.settings.watch.sporthealthsettings.bean.z getSpo2() {
        return this.spo2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spo2DailyMonitorUiState)) {
            return false;
        }
        Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) other;
        return Intrinsics.areEqual(this.spo2, spo2DailyMonitorUiState.spo2) && Intrinsics.areEqual(this.appInstallBean, spo2DailyMonitorUiState.appInstallBean);
    }

    public int hashCode() {
        return (this.spo2.hashCode() * 31) + this.appInstallBean.hashCode();
    }

    @NotNull
    public String toString() {
        return "Spo2DailyMonitorUiState(spo2=" + this.spo2 + ", appInstallBean=" + this.appInstallBean + ")";
    }
}
