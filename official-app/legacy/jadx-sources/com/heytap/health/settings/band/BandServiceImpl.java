package com.heytap.health.settings.band;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_settings.band.IBandService;
import com.oplus.aiunit.vision.jw0;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/device_settings/band/BandServiceImpl")
public class BandServiceImpl implements IBandService {
    public static final String TAG = "BandServiceImpl";

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        jw0.d(TAG, "[init] --> app start , trigger weather sync listener");
        BandSyncApp.a(context);
    }
}
