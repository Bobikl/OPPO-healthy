package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.t49, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/t49;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "a", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "autoSwitch", "", "Lcom/oplus/aiunit/vision/g69;", "b", "Ljava/util/List;", "()Ljava/util/List;", "decectTypes", "<init>", "(Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;Ljava/util/List;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HeartRateDetect {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final com.heytap.health.settings.watch.sporthealthsettings.bean.g autoSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<HeartRateSettingBean> decectTypes;

    public HeartRateDetect(@NotNull com.heytap.health.settings.watch.sporthealthsettings.bean.g autoSwitch, @NotNull List<HeartRateSettingBean> decectTypes) {
        Intrinsics.checkNotNullParameter(autoSwitch, "autoSwitch");
        Intrinsics.checkNotNullParameter(decectTypes, "decectTypes");
        this.autoSwitch = autoSwitch;
        this.decectTypes = decectTypes;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.heytap.health.settings.watch.sporthealthsettings.bean.g getAutoSwitch() {
        return this.autoSwitch;
    }

    @NotNull
    public final List<HeartRateSettingBean> b() {
        return this.decectTypes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateDetect)) {
            return false;
        }
        HeartRateDetect heartRateDetect = (HeartRateDetect) other;
        return Intrinsics.areEqual(this.autoSwitch, heartRateDetect.autoSwitch) && Intrinsics.areEqual(this.decectTypes, heartRateDetect.decectTypes);
    }

    public int hashCode() {
        return (this.autoSwitch.hashCode() * 31) + this.decectTypes.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeartRateDetect(autoSwitch=" + this.autoSwitch + ", decectTypes=" + this.decectTypes + ")";
    }
}
