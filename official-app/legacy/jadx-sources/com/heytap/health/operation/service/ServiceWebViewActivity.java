package com.heytap.health.operation.service;

import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.operation.R$layout;
import com.oplus.aiunit.vision.k72;
import com.oplus.aiunit.vision.z62;
import com.oplus.aiunit.vision.zv8;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/operation/ServiceWebViewActivity")
public class ServiceWebViewActivity extends BaseBrowserActivity {
    public String q;

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
        return z62.P(this).J(browserView).G(new k72(this, R$layout.operation_fragment_service_presentation, null, true)).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public void t7(Bundle bundle) {
        super.t7(bundle);
        if (getIntent() != null) {
            this.q = getIntent().getStringExtra("jumpUrl");
        }
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return zv8.H5_PATH + this.q;
    }
}
