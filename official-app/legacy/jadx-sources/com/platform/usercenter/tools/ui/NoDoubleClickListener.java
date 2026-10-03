package com.platform.usercenter.tools.ui;

import android.os.SystemClock;
import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoDoubleClickListener implements View.OnClickListener {
    private static final int MIN_CLICK_DELAY_TIME = 600;
    private long lastClickTime = 0;

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.lastClickTime > 600) {
            this.lastClickTime = jUptimeMillis;
            onNoDoubleClick(view);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public abstract void onNoDoubleClick(View view);
}
