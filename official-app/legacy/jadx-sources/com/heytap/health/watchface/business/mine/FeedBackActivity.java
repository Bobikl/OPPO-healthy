package com.heytap.health.watchface.business.mine;

import android.os.Bundle;
import android.view.View;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.oplus.aiunit.vision.vda;
import com.oplus.aiunit.vision.z62;

/* JADX INFO: loaded from: classes19.dex */
public class FeedBackActivity extends BaseBrowserActivity {
    public static final String BUNDLE_URL = "bundle_url";
    public static final String TAG = "FeedBackActivity";
    public String q;

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        return z62.P(this).J(browserView).L(false).C(true).N(true).P(10).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public void t7(Bundle bundle) {
        super.t7(bundle);
        this.q = vda.k(getIntent(), "bundle_url");
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return this.q;
    }
}
