package com.heytap.health.device.ota;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.oplus.aiunit.vision.r8d;

/* JADX INFO: loaded from: classes16.dex */
public interface IOTAVersionCheckService extends IProvider {
    void O2(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo, String str, r8d r8dVar);
}
