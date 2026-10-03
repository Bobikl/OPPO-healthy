package com.sensorsdata.analytics.android.sdk.visual;

import android.app.Activity;
import android.os.Bundle;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes10.dex */
public class HeatMapService {
    private static HeatMapService instance;
    private static HeatMapViewCrawler mVTrack;

    private HeatMapService() {
    }

    public static HeatMapService getInstance() {
        if (instance == null) {
            instance = new HeatMapService();
        }
        return instance;
    }

    public boolean isServiceRunning() {
        HeatMapViewCrawler heatMapViewCrawler = mVTrack;
        if (heatMapViewCrawler != null) {
            return heatMapViewCrawler.isServiceRunning();
        }
        return false;
    }

    public void resume() {
        try {
            HeatMapViewCrawler heatMapViewCrawler = mVTrack;
            if (heatMapViewCrawler != null) {
                heatMapViewCrawler.startUpdates();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void start(Activity activity, String str, String str2) {
        try {
            SALog.i("HeatMapService", "HeatMapService service");
            Bundle bundle = activity.getApplicationContext().getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            String string = bundle.getString("com.sensorsdata.analytics.android.ResourcePackageName");
            if (string == null) {
                string = activity.getPackageName();
            }
            HeatMapViewCrawler heatMapViewCrawler = new HeatMapViewCrawler(activity, string, str, str2);
            mVTrack = heatMapViewCrawler;
            heatMapViewCrawler.startUpdates();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void stop() {
        try {
            HeatMapViewCrawler heatMapViewCrawler = mVTrack;
            if (heatMapViewCrawler != null) {
                heatMapViewCrawler.stopUpdates(false);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
