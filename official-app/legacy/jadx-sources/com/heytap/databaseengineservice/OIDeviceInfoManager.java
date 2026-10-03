package com.heytap.databaseengineservice;

import com.heytap.databaseengine.apiv2.device.IDeviceInfoManager;
import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.g0b;
import com.oplus.aiunit.vision.jp6;

/* JADX INFO: loaded from: classes15.dex */
public class OIDeviceInfoManager extends IDeviceInfoManager.Stub {
    @Override // com.heytap.databaseengine.apiv2.device.IDeviceInfoManager
    public void getUserBoundDevices(ICommonListener iCommonListener) {
        g0b.a(iCommonListener, jp6.ERR_PERMISSION_DENY, null);
    }
}
