package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.h7g, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/h7g;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "a", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "b", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "settings", "Lcom/oplus/aiunit/vision/db0;", "Lcom/oplus/aiunit/vision/db0;", "()Lcom/oplus/aiunit/vision/db0;", "appInstallBean", "<init>", "(Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;Lcom/oplus/aiunit/vision/db0;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SHSettingHomeData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final DeviceSettings settings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final AppInstallBean appInstallBean;

    public SHSettingHomeData(@NotNull DeviceSettings settings, @NotNull AppInstallBean appInstallBean) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(appInstallBean, "appInstallBean");
        this.settings = settings;
        this.appInstallBean = appInstallBean;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AppInstallBean getAppInstallBean() {
        return this.appInstallBean;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DeviceSettings getSettings() {
        return this.settings;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SHSettingHomeData)) {
            return false;
        }
        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) other;
        return Intrinsics.areEqual(this.settings, sHSettingHomeData.settings) && Intrinsics.areEqual(this.appInstallBean, sHSettingHomeData.appInstallBean);
    }

    public int hashCode() {
        return (this.settings.hashCode() * 31) + this.appInstallBean.hashCode();
    }

    @NotNull
    public String toString() {
        return "SHSettingHomeData(settings=" + this.settings + ", appInstallBean=" + this.appInstallBean + ")";
    }
}
