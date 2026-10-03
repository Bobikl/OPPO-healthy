package com.heytap.health.device_settings.impl;

import androidx.annotation.Keep;
import com.heytap.health.settings.watch.sporthealthsettings2.SHSettingsSyncMonitor;
import com.oplus.aiunit.vision.a8a;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DeviceSettingsTransprortInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 10;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterPrivacyAgreed() {
        SHSettingsSyncMonitor.INSTANCE.l();
    }
}
