package com.heytap.health.wallet.bus.ui.activities;

import android.os.Bundle;
import android.view.View;
import com.heytap.health.wallet.bus.event.FinishBusEvent;
import com.heytap.health.wallet.web.LoadingWebActivity;
import com.oplus.aiunit.vision.u2j;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
public class BusLoadingWebActivity extends LoadingWebActivity {
    @Override // com.heytap.health.wallet.web.LoadingWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.web.LoadingWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v7();
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w7();
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void onNetworkChanged(FinishBusEvent finishBusEvent) {
        finish();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
