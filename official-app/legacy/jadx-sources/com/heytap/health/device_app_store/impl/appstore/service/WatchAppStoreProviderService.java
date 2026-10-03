package com.heytap.health.device_app_store.impl.appstore.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_app_store.internal.AppStoreProvider;
import com.oplus.aiunit.vision.s5l;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/device_app_store/getAppUpdateCount")
public class WatchAppStoreProviderService implements AppStoreProvider {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        s5l.a("WatchAppUpdateCountService", "[init] ...");
    }
}
