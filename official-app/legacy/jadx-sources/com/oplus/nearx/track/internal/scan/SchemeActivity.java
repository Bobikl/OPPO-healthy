package com.oplus.nearx.track.internal.scan;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.oplus.aiunit.vision.js5;
import com.oplus.aiunit.vision.nfg;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes8.dex */
public class SchemeActivity extends Activity {
    public static boolean isPopWindow = false;
    public boolean i = false;

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d("SchemeActivity", "onCreate");
        try {
            requestWindowFeature(1);
            setTheme(R.style.Theme.DeviceDefault.Light);
        } catch (Exception e2) {
            Log.e("SchemeActivity", e2.toString());
        }
        nfg.d(this, getIntent());
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        PushAutoTrackHelper.onNewIntent(this, intent);
        super.onNewIntent(intent);
        nfg.d(this, getIntent());
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Log.i("SchemeActivity", "onPause");
        if (isPopWindow) {
            isPopWindow = false;
            this.i = true;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Log.i("SchemeActivity", "onResume");
        if (this.i) {
            this.i = false;
            js5.c(this);
        }
    }
}
