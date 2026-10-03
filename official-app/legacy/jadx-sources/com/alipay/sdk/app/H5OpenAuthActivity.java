package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.sgm;

/* JADX INFO: loaded from: classes12.dex */
public class H5OpenAuthActivity extends H5PayActivity {
    public boolean q = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.q) {
            try {
                qam qamVarA = qam.a.a(getIntent());
                if (qamVarA != null) {
                    l9m.g(this, qamVarA, "", qamVarA.d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            qam qamVarA = qam.a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th) {
                String string = (intent == null || intent.getData() == null) ? "null" : intent.getData().toString();
                if (qamVarA != null) {
                    l9m.e(qamVarA, sgm.f16581l, sgm.p0, th, string);
                }
                this.q = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
