package com.heytap.health.wallet.ui;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.heytap.health.wallet.BaseActivity;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.t6b;

/* JADX INFO: loaded from: classes18.dex */
public class WalletBaseActivity extends BaseActivity {
    public static String t;
    public String s = "WalletBaseActivity";

    public static String v7() {
        return t;
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public void hideSoftInput(View view) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e2) {
            t6b.d(this.s, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t6b.a(this.s + " onCreate");
        t = getClass().getSimpleName();
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        t6b.a(getClass().getSimpleName() + " onResume");
        t = getClass().getSimpleName();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        t6b.a(getClass().getSimpleName() + " onStop");
    }

    public WalletBaseActivity w7() {
        return this;
    }

    public void x7() {
        if (sr6.c().j(this)) {
            return;
        }
        sr6.c().p(this);
    }

    public void y7() {
        if (sr6.c().j(this)) {
            sr6.c().r(this);
        }
    }
}
