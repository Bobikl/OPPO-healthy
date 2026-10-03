package com.heytap.health.settings.me.setting;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.js.function.JsLocale;
import com.heytap.health.device_settings.R$string;
import com.oplus.aiunit.vision.s3k;
import com.oplus.aiunit.vision.z62;
import com.oplus.aiunit.vision.zv8;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/settings/AgreementActivity")
public class AgreementActivity extends BaseBrowserActivity implements s3k {
    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        return z62.P(this).J(browserView).O(0).Q(R$string.settings_user_agreement).C(true).N(true).P(10).S(new String[]{zv8.H5_PATH, zv8.b.PRIVACY_FEEDBACK_URL}).B(new JsLocale(getApplicationContext())).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return zv8.b.USER_AGREEMENT_URL;
    }
}
