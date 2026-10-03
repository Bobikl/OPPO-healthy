package com.oplus.aiunit.vision;

import android.content.DialogInterface;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.unionpay.UPPayWapActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class e7n implements DialogInterface.OnClickListener {
    public final /* synthetic */ UPPayWapActivity i;

    public e7n(UPPayWapActivity uPPayWapActivity) {
        this.i = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    @SensorsDataInstrumented
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.i.k.dismiss();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }
}
