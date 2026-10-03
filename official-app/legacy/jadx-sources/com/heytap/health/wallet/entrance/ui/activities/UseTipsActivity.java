package com.heytap.health.wallet.entrance.ui.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.wallet.entrance.R$layout;
import com.oplus.aiunit.vision.e2c;
import com.oplus.aiunit.vision.go6;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/useTips")
public class UseTipsActivity extends EntranceLoadingWebActivity {
    public boolean y;
    public View z;

    @Override // com.heytap.health.wallet.web.HybridWebActivity
    public void F7(View view) {
        this.z = view;
        H7();
        I7();
    }

    @Override // com.heytap.health.wallet.web.HybridWebActivity
    public int G7() {
        return R$layout.layout_use_tips;
    }

    public final void H7() {
        if (getIntent().hasExtra("TO_INDEX")) {
            this.y = getIntent().getBooleanExtra("TO_INDEX", false);
        }
    }

    public final void I7() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(e2c.c().a(), e2c.c().b());
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceLoadingWebActivity, com.heytap.health.wallet.web.HybridWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.y) {
            go6.b().f(this);
        } else {
            finish();
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceLoadingWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.heytap.health.wallet.web.HybridWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity
    public boolean x7() {
        return true;
    }
}
