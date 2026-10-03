package com.heytap.health.settings.me.setting;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.js.function.JsLocale;
import com.oplus.aiunit.vision.s3k;
import com.oplus.aiunit.vision.ykd;
import com.oplus.aiunit.vision.z62;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/settings/NetWorkOfficeWebViewActivity")
public class NetWorkOfficeWebViewActivity extends BaseBrowserActivity implements s3k, ykd {
    public static final String EXTRA_ADOPT_SCREEN = "adoptScreen";
    public static final String EXTRA_SUPPORT_DARK_MODE = "supportDarkMode";
    public static final String EXTRA_THEME = "theme";
    public static final String EXTRA_TITLE = "title";
    public static final String EXTRA_WEBSITE = "website";
    public static final String EXTRA_WHITELIST = "whitelist";

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        String stringExtra = getIntent().getStringExtra("title");
        return z62.P(this).J(browserView).O(getIntent().getIntExtra("theme", 0)).R(stringExtra).C(getIntent().hasExtra(EXTRA_ADOPT_SCREEN) ? getIntent().getBooleanExtra(EXTRA_ADOPT_SCREEN, true) : true).N(true).L(getIntent().hasExtra(EXTRA_SUPPORT_DARK_MODE) ? getIntent().getBooleanExtra(EXTRA_SUPPORT_DARK_MODE, false) : false).P(10).S(getIntent().getStringArrayExtra(EXTRA_WHITELIST)).B(new JsLocale(getApplicationContext())).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return getIntent().getStringExtra(EXTRA_WEBSITE);
    }
}
