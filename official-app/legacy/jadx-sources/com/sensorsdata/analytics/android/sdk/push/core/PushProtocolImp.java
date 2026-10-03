package com.sensorsdata.analytics.android.sdk.push.core;

import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol;
import com.sensorsdata.analytics.android.sdk.monitor.SensorsDataLifecycleMonitorManager;

/* JADX INFO: loaded from: classes10.dex */
public class PushProtocolImp implements SAModuleProtocol {
    private boolean mEnable = false;

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public String getModuleName() {
        return Modules.Push.MODULE_NAME;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public int getPriority() {
        return 5;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void install(SAContextManager sAContextManager) {
        if (sAContextManager.getInternalConfigs().saConfigOptions.isEnableTrackPush()) {
            SensorsDataLifecycleMonitorManager.getInstance().addActivityLifeCallback(new PushLifecycleCallbacks());
        }
        setModuleState(!sAContextManager.getInternalConfigs().saConfigOptions.isDisableSDK());
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public <T> T invokeModuleFunction(String str, Object... objArr) {
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public boolean isEnable() {
        return this.mEnable;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void setModuleState(boolean z) {
        if (this.mEnable != z) {
            this.mEnable = z;
        }
    }
}
