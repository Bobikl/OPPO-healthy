package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public interface ResultCallback<T> {
    void onFailed(Exception exc);

    void onSuccess(T t);
}
