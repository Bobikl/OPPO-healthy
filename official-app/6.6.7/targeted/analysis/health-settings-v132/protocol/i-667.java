package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.q3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mzb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/i;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/b;", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/oplus/aiunit/vision/q3;", "g", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m$c;", "j", "k", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class i extends b {
    public static final int $stable = 0;

    @Override // com.oplus.aiunit.model.q3
    @Nullable
    public MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        m8b.f(getTAG(), "build settings pb msg, setting name=STRESS_HIGH_NOTIFY_ENABLE value=" + byk.e(getSwitchEnable()));
        return mzb.l0(getSwitchEnable(), e(deviceModel));
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new i();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.b
    @Nullable
    public m.c j(@NotNull m deviceSettings) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        i0 i0VarC = deviceSettings.C();
        if (i0VarC != null) {
            return i0VarC.a();
        }
        return null;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.b
    @NotNull
    public SportHealthSetting k() {
        return SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE;
    }
}