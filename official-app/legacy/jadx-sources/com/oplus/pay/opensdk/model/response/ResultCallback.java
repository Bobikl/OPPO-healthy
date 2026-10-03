package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface ResultCallback<T> {
    void onFailed(Exception exc);

    void onSuccess(T t);
}
