package com.heytap.health.wallet.web;

import android.content.Context;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.oplus.aiunit.vision.rja;
import com.oplus.aiunit.vision.sr9;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z62;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/main/FullScreenWeb")
public class FullScreenWebActivity extends BaseBrowserActivity {

    @Autowired
    public String q;

    public class a extends sr9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.sr9
        public rja onMethodCall(Context context, String str, String str2) {
            try {
                if ("onBackPressed".equals(str)) {
                    FullScreenWebActivity.this.onBackPressed();
                    return rja.NO_RESULT;
                }
            } catch (Exception e2) {
                t6b.d("/main/FullScreenWeb", "catch exception = " + e2.getMessage());
            }
            return rja.NOT_INVOKED;
        }
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        x0.d().f(this);
        return z62.P(this).J(browserView).O(1).C(true).P(10).N(true).L(false).A(new a()).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public void u7() {
        super.u7();
        v7();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return this.q;
    }
}
