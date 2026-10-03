package com.heytap.device.sleep;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_data_sync.sleep.IDoNotDisturbService;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/device_data_sync/DoNotDisturbServiceImpl")
public class DoNotDisturbServiceImpl implements IDoNotDisturbService {
    @Override // com.heytap.health.device_data_sync.sleep.IDoNotDisturbService
    public boolean F1() {
        return DoNotDisturbManager.INSTANCE.k();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
