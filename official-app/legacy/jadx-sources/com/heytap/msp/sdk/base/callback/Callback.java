package com.heytap.msp.sdk.base.callback;

import com.heytap.msp.bean.BizResponse;

/* JADX INFO: loaded from: classes19.dex */
public interface Callback<T extends BizResponse> {
    void callback(T t);
}
