package com.glyphix.mas.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.glyphix.mas.flover.XfaithAmapWearableConnectProvider;
import com.glyphix.mas.service.version.MasFeatureMan;

/* JADX INFO: loaded from: classes13.dex */
public class WearEngineService extends Service {
    private com.glyphix.mas.b glyphixMasExecutor;
    private MasFeatureMan masFeatureMan = new a();

    public class a implements MasFeatureMan {
        public a() {
        }

        @Override // com.glyphix.mas.service.version.MasFeatureMan
        public com.glyphix.mas.b getFeature() {
            return WearEngineService.this.glyphixMasExecutor;
        }

        @Override // com.glyphix.mas.service.version.MasFeatureMan
        public void setFeature(com.glyphix.mas.b bVar) {
            WearEngineService.this.glyphixMasExecutor = bVar;
            WearEngineService.initAmapProvider(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initAmapProvider(com.glyphix.mas.b bVar) {
        try {
            XfaithAmapWearableConnectProvider.class.getMethod("init", com.glyphix.mas.b.class).invoke(null, bVar);
        } catch (Throwable th) {
            com.glyphix.mas.utils.b.c().e("initAmapProvider failed", th.toString());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new com.glyphix.mas.service.version.b(intent.getStringExtra("packageName"), intent.getStringExtra("appId"), intent.getStringExtra("license"), this.masFeatureMan);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
