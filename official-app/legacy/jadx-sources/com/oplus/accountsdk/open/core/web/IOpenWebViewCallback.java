package com.oplus.accountsdk.open.core.web;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface IOpenWebViewCallback {
    void onError(int i, String str, List<String> list);

    void onSuccess(String str);
}
