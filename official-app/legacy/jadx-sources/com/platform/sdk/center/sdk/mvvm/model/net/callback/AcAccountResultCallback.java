package com.platform.sdk.center.sdk.mvvm.model.net.callback;

import com.platform.sdk.center.sdk.mvvm.model.data.AcCardOperationResult;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface AcAccountResultCallback extends IBaseResultCallBack {
    default void onCTACallback() {
    }

    default void onOperationResult(AcCardOperationResult acCardOperationResult) {
    }
}
