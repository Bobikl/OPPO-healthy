package com.platform.account.oauth.web.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f1a;
import com.platform.account.oauth.web.ui.OAuthWebActivity;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AuthWebViewManager {
    private static final String TAG = "AuthWebViewManager";

    public static class b {
        public static AuthWebViewManager a = new AuthWebViewManager();
    }

    public static AuthWebViewManager getInstance() {
        return b.a;
    }

    public void openWebView(Context context, String str, f1a f1aVar) {
        if (context == null || TextUtils.isEmpty(str)) {
            AcOauthLogUtil.e(TAG, "openWebView but context = " + context + " url = " + str);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) OAuthWebActivity.class);
        intent.putExtra("url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("callback", new WebViewResultReceiver(f1aVar, null));
        context.startActivity(intent);
    }

    private AuthWebViewManager() {
    }
}
