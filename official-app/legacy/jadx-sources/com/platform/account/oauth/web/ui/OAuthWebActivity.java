package com.platform.account.oauth.web.ui;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.Window;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.platform.account.oauth.web.R$color;
import com.platform.account.oauth.web.R$drawable;
import com.platform.account.oauth.web.R$id;
import com.platform.account.oauth.web.R$layout;
import com.platform.account.oauth.web.util.AcOauthDarkUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OAuthWebActivity extends AppCompatActivity {
    public static final String OPEN_URL_KEY = "url";
    public static final String RESULT_KEY = "key_webview_result";
    private static final String TAG = "OAuthWebActivity";
    private ResultReceiver mResultReceiver;

    @Override // android.app.Activity
    public void finish() {
        ResultReceiver resultReceiver = this.mResultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(0, new Bundle());
        }
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.ac_oauth_web_activity_oauth_web);
        getWindow().addFlags(Integer.MIN_VALUE);
        Window window = getWindow();
        int i = R$color.web_sdk_global_bg;
        window.setStatusBarColor(ContextCompat.getColor(this, i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        if (AcOauthDarkUtil.isNightMode(this)) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        } else {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
        getWindow().setBackgroundDrawable(ContextCompat.getDrawable(this, R$drawable.web_sdk_transparent));
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        OAuthWebFragment oAuthWebFragment = new OAuthWebFragment();
        if (getIntent() != null) {
            this.mResultReceiver = (ResultReceiver) getIntent().getParcelableExtra("callback");
            oAuthWebFragment.setArguments(getIntent().getExtras());
        }
        fragmentTransactionBeginTransaction.replace(R$id.fragment_container_view, oAuthWebFragment);
        fragmentTransactionBeginTransaction.commit();
    }
}
