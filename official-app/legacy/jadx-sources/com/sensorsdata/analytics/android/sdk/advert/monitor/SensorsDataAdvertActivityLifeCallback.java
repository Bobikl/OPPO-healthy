package com.sensorsdata.analytics.android.sdk.advert.monitor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager;
import com.sensorsdata.analytics.android.sdk.advert.utils.SAAdvertMarketHelper;
import com.sensorsdata.analytics.android.sdk.monitor.SensorsDataActivityLifecycleCallbacks;

/* JADX INFO: loaded from: classes10.dex */
public class SensorsDataAdvertActivityLifeCallback implements SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks {
    private SAConfigOptions mOptions;

    public SensorsDataAdvertActivityLifeCallback(SAConfigOptions sAConfigOptions) {
        this.mOptions = sAConfigOptions;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            SAAdvertMarketHelper.handleAdMarket(activity, this.mOptions.getAdvertConfig());
            DeepLinkManager.parseDeepLink(activity, this.mOptions.isSaveDeepLinkInfo());
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        DeepLinkManager.parseDeepLink(activity, this.mOptions.isSaveDeepLinkInfo());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        try {
            SAAdvertMarketHelper.handleAdMarket(activity, this.mOptions.getAdvertConfig());
            DeepLinkManager.parseDeepLink(activity, this.mOptions.isSaveDeepLinkInfo());
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.monitor.SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks
    public void onNewIntent(Intent intent) {
    }
}
