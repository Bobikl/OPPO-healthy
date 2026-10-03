package com.coloros.sceneservice.sceneprovider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.coloros.sceneservice.g.a;
import com.coloros.sceneservice.m.f;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseSceneBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "BaseSceneBroadcastReceiver";
    public static final String k = "coloros.intent.action.POLICY_SCENE";
    public static final String m = "coloros.intent.action.SCENE_SERVICE_INIT_SUCCESS";
    public static ExecutorService p = Executors.newSingleThreadExecutor();

    @Keep
    public abstract List getSupportSceneIdList();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null) {
            f.e(TAG, "onReceive intent is null");
            return;
        }
        String action = intent.getAction();
        f.d(TAG, "onReceive intent action " + action);
        if (k.equals(action)) {
            p.execute(new a(this, intent));
        } else if (m.equals(action)) {
            sceneServiceInitSuccess();
        }
    }

    @Keep
    public abstract void sceneServiceInitSuccess();
}
