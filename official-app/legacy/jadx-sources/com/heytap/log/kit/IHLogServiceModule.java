package com.heytap.log.kit;

import android.os.Bundle;
import com.heytap.msp.IMspCallback;
import com.heytap.msp.ipc.annotation.IPCBridgeMethod;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;

/* JADX INFO: loaded from: classes19.dex */
@IPCModule(authsOrActions = {"com.heytap.htms.action.HLOG_SERVICE"}, ipcType = IPCType.SERVICE, targetComponentClass = "com.heytap.msp.hlog.kit.ipc.HLogService", targetModuleClass = "com.heytap.msp.hlog.kit.ipc.HLogServiceModule")
public interface IHLogServiceModule {
    @IPCBridgeMethod(methodId = 6)
    void activeNotifyLogFileReady(Bundle bundle, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 5)
    void activeReportTask(Bundle bundle, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 7)
    void activeSalvageTask(Bundle bundle, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 1)
    void queryConfig(Bundle bundle, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 3)
    void queryLogDirection(Bundle bundle, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 4)
    void raiseUploadTask(Bundle bundle, IMspCallback iMspCallback);

    @IPCBridgeMethod(methodId = 2)
    void syncSalvageTask(Bundle bundle, IMspCallback iMspCallback);
}
