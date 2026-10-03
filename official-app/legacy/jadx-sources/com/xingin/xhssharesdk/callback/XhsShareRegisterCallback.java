package com.xingin.xhssharesdk.callback;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public interface XhsShareRegisterCallback {
    void onError(int i, String str, @Nullable Exception exc);

    void onSuccess();
}
