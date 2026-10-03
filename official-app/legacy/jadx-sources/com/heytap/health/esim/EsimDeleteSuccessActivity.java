package com.heytap.health.esim;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseActivity;

/* JADX INFO: loaded from: classes16.dex */
public class EsimDeleteSuccessActivity extends BaseActivity implements View.OnClickListener {
    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.tv_close) {
            finish();
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.esim_activity_esim_delete_success);
        findViewById(R$id.tv_close).setOnClickListener(this);
    }
}
