package com.oplus.accountsdk.open.core.web;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.gd;
import com.platform.account.webview.api.WebViewError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewOpenResultReceiver extends ResultReceiver {
    private static final String TAG = "WebViewOpenResultReceiver";
    private boolean mResultReceived;
    private final IOpenWebViewCallback mWebViewCallback;
    private final List<String> traceIdList;

    public WebViewOpenResultReceiver(IOpenWebViewCallback iOpenWebViewCallback) {
        this(iOpenWebViewCallback, null);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString(gd.CALL_BACK_ID_TRACE_ID_KEY);
            if (!TextUtils.isEmpty(string)) {
                AcLogUtil.i(TAG, "add traceId" + string, true);
                this.traceIdList.add(string);
                return;
            }
        }
        if (this.mResultReceived) {
            AcLogUtil.e(TAG, "already received result, ignored. resultCode = " + i, true);
            return;
        }
        this.mResultReceived = true;
        IOpenWebViewCallback iOpenWebViewCallback = this.mWebViewCallback;
        if (iOpenWebViewCallback == null) {
            AcLogUtil.e(TAG, "mWebViewCallback is null", true);
            return;
        }
        if (bundle == null) {
            WebViewError webViewError = WebViewError.BUNDLE_IS_NULL;
            iOpenWebViewCallback.onError(webViewError.getErrorCode(), webViewError.getMessage(), this.traceIdList);
            return;
        }
        if (i == 0) {
            WebViewError webViewError2 = WebViewError.CANCELED;
            iOpenWebViewCallback.onError(webViewError2.getErrorCode(), webViewError2.getMessage(), this.traceIdList);
            return;
        }
        if (i == -1) {
            String string2 = bundle.getString("key_webview_result");
            if (!TextUtils.isEmpty(string2)) {
                this.mWebViewCallback.onSuccess(string2);
                return;
            }
            IOpenWebViewCallback iOpenWebViewCallback2 = this.mWebViewCallback;
            WebViewError webViewError3 = WebViewError.RESULT_IS_NULL;
            iOpenWebViewCallback2.onError(webViewError3.getErrorCode(), webViewError3.getMessage(), this.traceIdList);
            return;
        }
        AcLogUtil.e(TAG, "unexpected resultCode = " + i, true);
        this.mWebViewCallback.onError(WebViewError.CANCELED.getErrorCode(), "unexpected resultCode: " + i, this.traceIdList);
    }

    public WebViewOpenResultReceiver(IOpenWebViewCallback iOpenWebViewCallback, Handler handler) {
        super(handler);
        this.traceIdList = new ArrayList();
        this.mResultReceived = false;
        this.mWebViewCallback = iOpenWebViewCallback;
    }
}
