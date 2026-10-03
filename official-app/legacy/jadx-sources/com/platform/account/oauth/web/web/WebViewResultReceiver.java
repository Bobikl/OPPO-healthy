package com.platform.account.oauth.web.web;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f1a;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class WebViewResultReceiver extends ResultReceiver {
    private static final String TAG = "WebViewResultReceiver";
    private final f1a mCallback;
    private boolean mResultReceived;

    public WebViewResultReceiver(f1a f1aVar, Handler handler) {
        super(handler);
        this.mResultReceived = false;
        this.mCallback = f1aVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        f1a f1aVar = this.mCallback;
        if (f1aVar == null) {
            AcOauthLogUtil.e(TAG, "mWebViewCallback is null");
            return;
        }
        if (this.mResultReceived) {
            AcOauthLogUtil.e(TAG, "already received result, ignored. resultCode = " + i);
            return;
        }
        this.mResultReceived = true;
        if (i == 0) {
            ResponseEnum responseEnum = ResponseEnum.CANCEL;
            f1aVar.onError(responseEnum.getCode(), responseEnum.getRemark());
            return;
        }
        if (i == -1) {
            if (bundle == null) {
                ResponseEnum responseEnum2 = ResponseEnum.OAUTH_H5_DATA_ERROR;
                f1aVar.onError(responseEnum2.getCode(), responseEnum2.getRemark());
                return;
            }
            String string = bundle.getString("key_webview_result");
            if (!TextUtils.isEmpty(string)) {
                this.mCallback.onSuccess(string);
                return;
            }
            f1a f1aVar2 = this.mCallback;
            ResponseEnum responseEnum3 = ResponseEnum.OAUTH_H5_DATA_ERROR;
            f1aVar2.onError(responseEnum3.getCode(), responseEnum3.getRemark());
        }
    }
}
