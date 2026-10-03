package com.sensorsdata.analytics.android.sdk.advert.impl;

import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol;

/* JADX INFO: loaded from: classes10.dex */
public class SensorsAdvertProtocolAPI implements SAModuleProtocol {
    private SAAdvertProtocolImpl mAdvertProtocolImpl;
    private boolean mEnable = false;

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public String getModuleName() {
        return Modules.Advert.MODULE_NAME;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public int getPriority() {
        return 5;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void install(SAContextManager sAContextManager) {
        this.mAdvertProtocolImpl = new SAAdvertProtocolImpl(sAContextManager);
        if (sAContextManager.getInternalConfigs().saConfigOptions.isDisableSDK()) {
            return;
        }
        setModuleState(true);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public <T> T invokeModuleFunction(String str, Object... objArr) {
        return (T) this.mAdvertProtocolImpl.invokeModuleFunction(str, objArr);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public boolean isEnable() {
        return this.mEnable;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void setModuleState(boolean z) {
        if (this.mEnable != z) {
            if (z) {
                this.mAdvertProtocolImpl.delayInitTask();
                this.mAdvertProtocolImpl.registerLifeCallback();
                this.mAdvertProtocolImpl.registerPropertyPlugin();
                this.mAdvertProtocolImpl.delayExecution();
            } else {
                this.mAdvertProtocolImpl.unregisterLifecycleCallback();
                this.mAdvertProtocolImpl.unregisterPropertyPlugin();
            }
            this.mEnable = z;
        }
    }
}
