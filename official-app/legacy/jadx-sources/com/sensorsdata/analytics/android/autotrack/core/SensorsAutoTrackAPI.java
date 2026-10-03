package com.sensorsdata.analytics.android.autotrack.core;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol;

/* JADX INFO: loaded from: classes10.dex */
public class SensorsAutoTrackAPI implements SAModuleProtocol {
    private AutoTrackContextHelper mAutoTrackHelper;
    private boolean mEnable = false;

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public String getModuleName() {
        return Modules.AutoTrack.MODULE_NAME;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public int getPriority() {
        return 5;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void install(SAContextManager sAContextManager) {
        try {
            this.mAutoTrackHelper = new AutoTrackContextHelper(sAContextManager);
            setModuleState(!sAContextManager.getInternalConfigs().saConfigOptions.isDisableSDK());
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public <T> T invokeModuleFunction(String str, Object... objArr) {
        return (T) this.mAutoTrackHelper.invokeModuleFunction(str, objArr);
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
