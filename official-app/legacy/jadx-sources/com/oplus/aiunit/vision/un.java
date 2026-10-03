package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.webview.extension.fragment.WebExtFragment;
import com.heytap.webview.extension.fragment.WebViewClient;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class un extends WebViewClient {
    public un(@NonNull WebExtFragment webExtFragment) {
        super(webExtFragment);
    }

    @Override // com.heytap.webview.extension.fragment.WebViewClient, android.webkit.WebViewClient
    public void onReceivedSslError(@NonNull WebView webView, @NonNull SslErrorHandler sslErrorHandler, @NonNull SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        int primaryError = sslError.getPrimaryError();
        if (4 != primaryError) {
            if (3 == primaryError) {
                bn.b("AccountWebViewClient", "onReceivedSslError The certificate authority is not trusted");
                return;
            }
            return;
        }
        if (sslError.getCertificate() != null) {
            bn.b("AccountWebViewClient", "onReceivedSslError now = " + new Date());
            if (sslError.getCertificate().getValidNotBeforeDate() != null) {
                bn.b("AccountWebViewClient", "onReceivedSslError getValidNotBeforeDate = " + sslError.getCertificate().getValidNotBeforeDate().toString());
            }
            if (sslError.getCertificate().getValidNotAfterDate() != null) {
                bn.b("AccountWebViewClient", "onReceivedSslError getValidNotAfterDate = " + sslError.getCertificate().getValidNotAfterDate().toString());
            }
        }
    }

    @Override // com.heytap.webview.extension.fragment.WebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @Nullable String str) {
        if (str == null || !(str.endsWith(".apk") || str.contains(".apk?"))) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
