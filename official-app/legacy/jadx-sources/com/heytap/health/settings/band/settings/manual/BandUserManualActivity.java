package com.heytap.health.settings.band.settings.manual;

import android.os.Bundle;
import android.view.View;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.js.function.JsDarkMode;
import com.oplus.aiunit.vision.z62;
import com.oplus.aiunit.vision.zv8;

/* JADX INFO: loaded from: classes17.dex */
public class BandUserManualActivity extends BaseBrowserActivity {
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
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return zv8.b.BAND_USER_GUIDE;
    }
}
