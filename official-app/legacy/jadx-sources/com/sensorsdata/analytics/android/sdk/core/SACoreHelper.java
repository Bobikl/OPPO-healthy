package com.sensorsdata.analytics.android.sdk.core;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.TrackTaskManager;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;

/* JADX INFO: loaded from: classes10.dex */
public class SACoreHelper {
    private static final String TAG = "SA.EventManager";
    private static volatile SACoreHelper mSingleton;

    private SACoreHelper() {
    }

    public static SACoreHelper getInstance() {
        if (mSingleton == null) {
            synchronized (SACoreHelper.class) {
                if (mSingleton == null) {
                    mSingleton = new SACoreHelper();
                }
            }
        }
        return mSingleton;
    }

    public void trackEvent(InputData inputData) {
        try {
            SensorsDataAPI.sharedInstance().getSAContextManager().trackEvent(inputData);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void trackQueueEvent(Runnable runnable) {
        try {
            TrackTaskManager.getInstance().addTrackEventTask(runnable);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
