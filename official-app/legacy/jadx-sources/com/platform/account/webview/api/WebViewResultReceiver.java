package com.platform.account.webview.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.oplus.aiunit.vision.bn;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewResultReceiver extends ResultReceiver {
    private static final String TAG = "WebViewResultReceiver";
    private boolean mResultReceived;
    private IWebViewCallback mWebViewCallback;

    public WebViewResultReceiver(IWebViewCallback iWebViewCallback) {
        this(iWebViewCallback, null);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        IWebViewCallback iWebViewCallback = this.mWebViewCallback;
        if (iWebViewCallback == null) {
            bn.c(TAG, "mWebViewCallback is null");
            return;
        }
        if (this.mResultReceived) {
            bn.c(TAG, "already received result, ignored. resultCode = " + i);
            return;
        }
        this.mResultReceived = true;
        if (i == 0) {
            WebViewError webViewError = WebViewError.CANCELED;
            iWebViewCallback.onError(webViewError.getErrorCode(), webViewError.getMessage());
            return;
        }
        if (i == -1) {
            if (bundle == null) {
                WebViewError webViewError2 = WebViewError.BUNDLE_IS_NULL;
                iWebViewCallback.onError(webViewError2.getErrorCode(), webViewError2.getMessage());
                return;
            }
            String string = bundle.getString("key_webview_result");
            if (!TextUtils.isEmpty(string)) {
                this.mWebViewCallback.onSuccess(string);
                return;
            }
            IWebViewCallback iWebViewCallback2 = this.mWebViewCallback;
            WebViewError webViewError3 = WebViewError.RESULT_IS_NULL;
            iWebViewCallback2.onError(webViewError3.getErrorCode(), webViewError3.getMessage());
        }
    }

    public WebViewResultReceiver(IWebViewCallback iWebViewCallback, Handler handler) {
        super(handler);
        this.mResultReceived = false;
        this.mWebViewCallback = iWebViewCallback;
    }
}
