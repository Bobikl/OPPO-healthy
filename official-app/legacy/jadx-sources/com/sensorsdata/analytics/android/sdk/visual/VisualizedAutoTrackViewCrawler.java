package com.sensorsdata.analytics.android.sdk.visual;

import android.app.Activity;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes10.dex */
class VisualizedAutoTrackViewCrawler extends AbstractViewCrawler {
    private VisualDebugHelper mVisualDebugHelper;

    public VisualizedAutoTrackViewCrawler(Activity activity, String str, String str2, String str3, VisualDebugHelper visualDebugHelper) {
        super(activity, str, str2, str3, AbstractViewCrawler.TYPE_VISUAL);
        this.mVisualDebugHelper = visualDebugHelper;
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.AbstractViewCrawler, com.sensorsdata.analytics.android.sdk.visual.VTrack
    public void startUpdates() {
        try {
            super.startUpdates();
            VisualDebugHelper visualDebugHelper = this.mVisualDebugHelper;
            if (visualDebugHelper != null) {
                visualDebugHelper.stopMonitor();
                this.mVisualDebugHelper.startMonitor();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.AbstractViewCrawler, com.sensorsdata.analytics.android.sdk.visual.VTrack
    public void stopUpdates(boolean z) {
        try {
            super.stopUpdates(z);
            VisualDebugHelper visualDebugHelper = this.mVisualDebugHelper;
            if (visualDebugHelper != null) {
                visualDebugHelper.stopMonitor();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
