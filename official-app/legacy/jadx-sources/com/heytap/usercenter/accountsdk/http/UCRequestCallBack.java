package com.heytap.usercenter.accountsdk.http;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface UCRequestCallBack<T> {
    void onReqFinish(T t);

    Object onReqLoading(byte[] bArr);

    void onReqStart();
}
