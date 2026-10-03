package com.heytap.health.device.ota.check;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device.ota.IOTAVersionCheckService;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.oplus.aiunit.vision.OTAVersionParam;
import com.oplus.aiunit.vision.r8d;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/deviceota/OTAVersionCheckService")
public class OTAVersionCheckServiceImpl implements IOTAVersionCheckService {
    @Override // com.heytap.health.device.ota.IOTAVersionCheckService
    public void O2(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo, String str, r8d r8dVar) {
        OTAVersionManager.k(dMProto$ConnectDeviceInfo, new OTAVersionParam(false, false, false, str), r8dVar);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
