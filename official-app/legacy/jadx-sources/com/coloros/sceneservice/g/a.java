package com.coloros.sceneservice.g;

import android.content.Intent;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.BaseSceneBroadcastReceiver;
import com.coloros.sceneservice.sceneprovider.SceneTriggerDataHandler;

/* JADX INFO: loaded from: classes13.dex */
public class a implements Runnable {
    public final /* synthetic */ Intent Tb;
    public final /* synthetic */ BaseSceneBroadcastReceiver this$0;

    public a(BaseSceneBroadcastReceiver baseSceneBroadcastReceiver, Intent intent) {
        this.this$0 = baseSceneBroadcastReceiver;
        this.Tb = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            SceneTriggerDataHandler.parseSceneIntent(this.Tb, this.this$0.getSupportSceneIdList());
        } catch (Exception e2) {
            f.e(BaseSceneBroadcastReceiver.TAG, "parseSceneIntent error", e2);
        }
    }
}
