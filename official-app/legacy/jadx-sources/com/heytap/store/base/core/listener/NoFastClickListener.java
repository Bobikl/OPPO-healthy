package com.heytap.store.base.core.listener;

import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NoFastClickListener implements View.OnClickListener {
    public static long FAST_CLICK_INTERVAL = 500;
    public static long FAST_CLICK_INTERVAL_300 = 300;
    public long delay;
    private long lastClickTime = 0;

    public NoFastClickListener(long j2) {
        this.delay = j2;
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastClickTime > this.delay) {
            this.lastClickTime = jCurrentTimeMillis;
            onNoFastClick(view);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public abstract void onNoFastClick(View view);
}
