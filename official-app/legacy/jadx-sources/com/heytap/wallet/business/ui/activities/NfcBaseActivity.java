package com.heytap.wallet.business.ui.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.heytap.health.wallet.ui.WalletBaseActivity;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.z0k;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes19.dex */
public abstract class NfcBaseActivity extends WalletBaseActivity {
    public String u;
    public int v = 0;

    public abstract void A7();

    public abstract int getLayoutId();

    @Override // com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public void init() {
    }

    @Override // com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getLayoutId() != 0) {
            setContentView(getLayoutId());
        }
        init();
        z7();
    }

    @Override // com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        t6b.b(this.s, "onResume");
    }

    public final void z7() {
        if ("CardPackageActivity".equals(WalletBaseActivity.v7())) {
            return;
        }
        this.u = aec.o();
        StringBuilder sb = new StringBuilder();
        sb.append("enter prepareServiceAndCplc,get cplc:");
        sb.append(this.u);
        if (!TextUtils.isEmpty(this.u)) {
            A7();
        } else {
            z0k.f(getApplicationContext()).o(R$string.network_not);
            finish();
        }
    }
}
