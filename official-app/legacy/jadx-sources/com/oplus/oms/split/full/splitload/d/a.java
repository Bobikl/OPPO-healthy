package com.oplus.oms.split.full.splitload.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.w7i;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes8.dex */
public class a extends Activity {
    public static final String a = "FakeActivity";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int identifier = getResources().getIdentifier("Theme.noAnimation", Const.Arguments.Open.STYLE, getPackageName());
        if (identifier > 0) {
            getTheme().applyStyle(identifier, true);
        } else {
            w7i.i(a, "R.style.Theme_noAnimation not found!", new Object[0]);
        }
        super.onCreate(bundle);
        setRequestedOrientation(-1);
        if (getIntent() != null) {
            setIntent(null);
        }
        finish();
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }
}
