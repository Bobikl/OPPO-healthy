package com.heytap.device.ui.weight.bpg;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.heytap.device.R$string;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.base.BaseApplication;
import com.oplus.aiunit.vision.vda;

/* JADX INFO: loaded from: classes15.dex */
public class BpgBaseActivity extends BaseActivity {
    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity
    public void k7(Class cls) {
        Intent intent = new Intent(this, (Class<?>) cls);
        intent.putExtras(getIntent());
        startActivity(intent);
    }

    public String l7(Intent intent) {
        String strK = intent != null ? vda.k(getIntent(), "bpg_title") : null;
        return TextUtils.isEmpty(strK) ? BaseApplication.a().getResources().getString(R$string.device_bpg_title) : strK;
    }
}
