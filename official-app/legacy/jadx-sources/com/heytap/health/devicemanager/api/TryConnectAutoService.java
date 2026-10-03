package com.heytap.health.devicemanager.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.base.BaseActivity;

/* JADX INFO: loaded from: classes16.dex */
public interface TryConnectAutoService extends IProvider {
    public static final String SERVICE_CONNECT_AUTO = "/devicesetting/TryConnectAutoService";

    void Y3(BaseActivity baseActivity);

    void onDestroy();

    void y9();
}
