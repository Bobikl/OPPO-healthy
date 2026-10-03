package com.oplus.omes.srp.sysintegrity;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface ISrpCallback<T> {
    void onFailure(SrpException srpException);

    void onFinish(T t);
}
