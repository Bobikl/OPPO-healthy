package com.platform.sdk.center.deprecated;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public interface AcRequestCallBack<T> {
    void onReqFinish(T t);

    Object onReqLoading(byte[] bArr);

    void onReqStart();
}
