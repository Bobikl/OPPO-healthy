package com.heytap.health.wallet;

import android.os.Bundle;
import android.view.View;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.t6b;

/* JADX INFO: loaded from: classes18.dex */
public class BaseActivityEx extends BaseActivity {
    public String s = getClass().getSimpleName();

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t6b.a(getClass().getSimpleName() + " onCreate");
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        t6b.a(getClass().getSimpleName() + " onResume");
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        t6b.a(getClass().getSimpleName() + " onStop");
    }

    public void v7() {
        if (sr6.c().j(this)) {
            return;
        }
        sr6.c().p(this);
    }

    public void w7() {
        if (sr6.c().j(this)) {
            sr6.c().r(this);
        }
    }
}
