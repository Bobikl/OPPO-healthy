package com.heytap.usercenter.accountsdk.http;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountNameTask {

    @Keep
    public interface onReqAccountCallback<T> {
        void onReqFinish(T t);

        void onReqLoading();

        void onReqStart();
    }
}
