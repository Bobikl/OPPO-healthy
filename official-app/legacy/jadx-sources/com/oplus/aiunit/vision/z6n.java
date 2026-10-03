package com.oplus.aiunit.vision;

import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.unionpay.UPPayWapActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class z6n implements View.OnClickListener {
    public final /* synthetic */ UPPayWapActivity i;

    public z6n(UPPayWapActivity uPPayWapActivity) {
        this.i = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public final void onClick(View view) {
        UPPayWapActivity.m(this.i);
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }
}
