package com.heytap.health.wallet.entrance.ui.activities;

import android.os.Bundle;
import android.view.View;
import com.heytap.health.wallet.web.HybridWebActivity;
import com.oplus.aiunit.vision.gg7;
import com.oplus.aiunit.vision.u2j;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
public abstract class EntranceLoadingWebActivity extends HybridWebActivity implements View.OnClickListener {
    @u2j(threadMode = ThreadMode.MAIN)
    public void finishEntranceActivity(gg7 gg7Var) {
        finish();
    }

    @Override // com.heytap.health.wallet.web.HybridWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v7();
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w7();
    }
}
