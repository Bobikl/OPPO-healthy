package com.heytap.health.wallet.web;

import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.js.function.JsDarkMode;
import com.oplus.aiunit.vision.wuc;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z62;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/main/ToolbarScreenWeb")
public class NormalToolbarWebActivity extends BaseBrowserActivity {

    @Autowired
    public String q;

    @Autowired
    public String r;

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        x0.d().f(this);
        return z62.P(this).J(browserView).G(new wuc(this, this.r)).C(true).N(true).L(false).B(new JsDarkMode()).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return this.q;
    }
}
