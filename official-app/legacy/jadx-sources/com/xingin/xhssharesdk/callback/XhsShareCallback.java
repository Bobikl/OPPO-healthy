package com.xingin.xhssharesdk.callback;

import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public interface XhsShareCallback {
    @MainThread
    @Deprecated
    void onError(@NonNull String str, int i, @NonNull String str2, @Nullable Throwable th);

    @MainThread
    default void onError2(@NonNull String str, int i, @Deprecated int i2, @NonNull String str2, @Nullable Throwable th) {
        onError(str, i2, str2, th);
    }

    @MainThread
    void onSuccess(String str);
}
