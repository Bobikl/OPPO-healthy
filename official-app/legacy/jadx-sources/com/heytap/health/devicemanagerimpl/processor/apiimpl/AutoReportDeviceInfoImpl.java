package com.heytap.health.devicemanagerimpl.processor.apiimpl;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.api.AutoReportDeviceInfoService;
import com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager;
import com.oplus.aiunit.vision.d93;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = AutoReportDeviceInfoService.SERVICE_AUTO_REPORT_DEVICEINFO)
public class AutoReportDeviceInfoImpl implements AutoReportDeviceInfoService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.devicemanager.api.AutoReportDeviceInfoService
    public void z(d93 d93Var) {
        AutoReportDeviceInfoManager.INSTANCE.n(d93Var);
    }
}
