package com.oplus.oms.split.full.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.oplus.aiunit.vision.l7i;
import com.oplus.oms.split.full.splitinstall.b;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ObtainUserConfirmationDialog extends Activity {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19991j;
    public List<String> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l7i f19992l;

    public boolean checkInternParametersIllegal() {
        List<String> list;
        return this.i == 0 || this.f19991j <= 0 || (list = this.k) == null || list.isEmpty();
    }

    public List<String> getModuleNames() {
        return this.k;
    }

    public long getRealTotalBytesNeedToDownload() {
        return this.f19991j;
    }

    @Override // android.app.Activity
    @SuppressLint({"IntentDosDetector"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = getIntent().getIntExtra("sessionId", 0);
        this.f19991j = getIntent().getLongExtra("realTotalBytesNeedToDownload", 0L);
        this.k = getIntent().getStringArrayListExtra("moduleNames");
        this.f19992l = b.E();
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }

    public void onUserCancel() {
        l7i l7iVar = this.f19992l;
        if (l7iVar != null) {
            if (l7iVar.e(this.i)) {
                setResult(0);
            }
            finish();
        }
    }

    public void onUserConfirm() {
        l7i l7iVar = this.f19992l;
        if (l7iVar != null) {
            if (l7iVar.f(this.i)) {
                setResult(-1);
            }
            finish();
        }
    }
}
