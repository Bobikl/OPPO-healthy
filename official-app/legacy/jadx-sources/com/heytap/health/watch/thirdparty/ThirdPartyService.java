package com.heytap.health.watch.thirdparty;

import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseService;
import com.oplus.aiunit.vision.nvj;

/* JADX INFO: loaded from: classes19.dex */
public class ThirdPartyService extends BaseService {
    public ThirdPartyPresenter i;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.i.asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        nvj.c("ThirdPartyService", "onCreate()", new Object[0]);
        this.i = new ThirdPartyPresenter();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        nvj.c("ThirdPartyService", "onDestroy()", new Object[0]);
    }

    @Override // com.heytap.health.base.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
