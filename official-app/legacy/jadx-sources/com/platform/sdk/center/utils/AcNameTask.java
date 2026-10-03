package com.platform.sdk.center.utils;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcNameTask {

    @Keep
    public interface onReqAccountCallback<T> {
        void onReqFinish(T t);

        void onReqLoading();

        void onReqStart();
    }
}
