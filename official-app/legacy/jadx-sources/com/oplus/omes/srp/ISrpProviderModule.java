package com.oplus.omes.srp;

import androidx.annotation.Keep;
import com.heytap.msp.ipc.annotation.IPCBridgeMethod;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;
import com.oplus.omes.srp.sysintegrity.cmm.SrpProviderModule$Client;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@IPCModule(authsOrActions = {"${applicationId}.SrpProvider", "com.oplus.omes.srp.SAFETY_CHECK"}, ipcType = IPCType.PROVIDER, targetComponentClass = "com.oplus.omes.srp.SrpProvider", targetModuleClass = SrpProviderModule$Client.TARGET_CLASS, targetPackage = "com.heytap.htms")
public interface ISrpProviderModule {
    @IPCBridgeMethod(methodId = 1)
    String getResult(String str, String str2);
}
