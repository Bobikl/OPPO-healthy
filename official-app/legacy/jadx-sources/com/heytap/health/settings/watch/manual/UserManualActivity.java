package com.heytap.health.settings.watch.manual;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.js.function.JsDarkMode;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.z62;

/* JADX INFO: loaded from: classes18.dex */
public class UserManualActivity extends BaseBrowserActivity {
    public static final String KEY_URL_PATH = "KeyUrlPath";
    public static final String TAG = "UserManualActivity";
    public String q = null;

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        return z62.P(this).J(browserView).C(true).L(false).P(10).N(false).B(new JsDarkMode()).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public void t7(Bundle bundle) {
        super.t7(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.q = intent.getStringExtra(KEY_URL_PATH);
        } else {
            a7b.m(TAG, "intent is null");
            finish();
        }
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return this.q;
    }
}
