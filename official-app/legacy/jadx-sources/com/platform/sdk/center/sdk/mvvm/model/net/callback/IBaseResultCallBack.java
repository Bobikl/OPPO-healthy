package com.platform.sdk.center.sdk.mvvm.model.net.callback;

import com.oplus.aiunit.vision.xr2;
import com.platform.sdk.center.sdk.mvvm.model.data.AcAccount;

/* JADX INFO: loaded from: classes9.dex */
public interface IBaseResultCallBack {
    default void onAccountResult(AcAccount acAccount) {
    }

    default void onError(xr2 xr2Var, Throwable th, String str) {
    }
}
