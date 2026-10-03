package com.heytap.nearx.tangramconfig.kit.client;

import com.heytap.msp.IMspCallback;
import com.heytap.msp.ipc.annotation.IPCBridgeMethod;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;

/* JADX INFO: loaded from: classes17.dex */
@IPCModule(authsOrActions = {MspKitConstants.KIT_SERVICE_ACTION}, ipcType = IPCType.SERVICE, targetComponentClass = MspKitConstants.TARGET_SERVICE_CLASS, targetModuleClass = MspKitConstants.TARGET_SERVICE_MODULE_CLASS)
public interface ICloudCtrlServiceModule {
    @IPCBridgeMethod(methodId = 4)
    void checkUpdateConfig(String str, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 3)
    void gatewayUpdate(String str, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 2)
    void getConfigData(String str, String str2, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 1)
    void getDynamicCondition(String str, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 5)
    void registerCallbacks(String str, IMspCallback iMspCallback);
}
