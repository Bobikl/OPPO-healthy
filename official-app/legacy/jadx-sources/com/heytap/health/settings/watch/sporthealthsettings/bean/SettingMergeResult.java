package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "phoneSettings", "(Ljava/util/List;Ljava/util/List;)V", "getDeviceSettings", "()Ljava/util/List;", "getPhoneSettings", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SettingMergeResult {
    public static final int $stable = 8;

    @NotNull
    private final List<SportHealthSetting> deviceSettings;

    @NotNull
    private final List<SportHealthSetting> phoneSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingMergeResult(@NotNull List<? extends SportHealthSetting> deviceSettings, @NotNull List<? extends SportHealthSetting> phoneSettings) {
        Intrinsics.checkNotNullParameter(deviceSettings, "deviceSettings");
        Intrinsics.checkNotNullParameter(phoneSettings, "phoneSettings");
        this.deviceSettings = deviceSettings;
        this.phoneSettings = phoneSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingMergeResult copy$default(SettingMergeResult settingMergeResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = settingMergeResult.deviceSettings;
        }
        if ((i & 2) != 0) {
            list2 = settingMergeResult.phoneSettings;
        }
        return settingMergeResult.copy(list, list2);
    }

    @NotNull
    public final List<SportHealthSetting> component1() {
        return this.deviceSettings;
    }

    @NotNull
    public final List<SportHealthSetting> component2() {
        return this.phoneSettings;
    }

    @NotNull
    public final SettingMergeResult copy(@NotNull List<? extends SportHealthSetting> deviceSettings, @NotNull List<? extends SportHealthSetting> phoneSettings) {
        Intrinsics.checkNotNullParameter(deviceSettings, "deviceSettings");
        Intrinsics.checkNotNullParameter(phoneSettings, "phoneSettings");
        return new SettingMergeResult(deviceSettings, phoneSettings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingMergeResult)) {
            return false;
        }
        SettingMergeResult settingMergeResult = (SettingMergeResult) other;
        return Intrinsics.areEqual(this.deviceSettings, settingMergeResult.deviceSettings) && Intrinsics.areEqual(this.phoneSettings, settingMergeResult.phoneSettings);
    }

    @NotNull
    public final List<SportHealthSetting> getDeviceSettings() {
        return this.deviceSettings;
    }

    @NotNull
    public final List<SportHealthSetting> getPhoneSettings() {
        return this.phoneSettings;
    }

    public int hashCode() {
        return (this.deviceSettings.hashCode() * 31) + this.phoneSettings.hashCode();
    }

    @NotNull
    public String toString() {
        return "SettingMergeResult(deviceSettings=" + this.deviceSettings + ", phoneSettings=" + this.phoneSettings + ")";
    }
}
