package com.platform.account.webview.api;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface IWebViewCallback {
    void onError(int i, String str);

    void onSuccess(String str);
}
