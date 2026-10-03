package com.sensorsdata.analytics.android.sdk.encrypt.impl;

import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol;

/* JADX INFO: loaded from: classes10.dex */
public class SAEncryptProtocolImpl implements SAModuleProtocol {
    private boolean mEnable = false;
    private SAEncryptAPIImpl mEncryptAPIImpl;

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public String getModuleName() {
        return Modules.Encrypt.MODULE_NAME;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public int getPriority() {
        return 6;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void install(SAContextManager sAContextManager) {
        this.mEncryptAPIImpl = new SAEncryptAPIImpl(sAContextManager);
        if (sAContextManager.getInternalConfigs().saConfigOptions.isDisableSDK()) {
            return;
        }
        setModuleState(true);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public <T> T invokeModuleFunction(String str, Object... objArr) {
        return (T) this.mEncryptAPIImpl.invokeModuleFunction(str, objArr);
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
