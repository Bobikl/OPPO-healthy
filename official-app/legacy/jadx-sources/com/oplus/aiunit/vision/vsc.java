package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.view.View;
import com.oplus.smartenginehelper.ParserTag;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vsc implements View.OnClickListener {
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17975j;

    public vsc() {
        this(600);
    }

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (Math.abs(jUptimeMillis - this.i) > this.f17975j) {
            AcOauthLogUtil.i("NoDoubleClickListener", ParserTag.TAG_ONCLICK);
            this.i = jUptimeMillis;
            a(view);
        } else {
            AcOauthLogUtil.i("NoDoubleClickListener", "onClick ignore");
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public vsc(int i) {
        this.i = 0L;
        this.f17975j = i;
    }
}
