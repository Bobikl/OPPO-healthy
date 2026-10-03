package com.heytap.msp.sdk.base.callback;

import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.bean.Request;

/* JADX INFO: loaded from: classes19.dex */
public interface HookCallback<T extends BizResponse> {
    void callback(Request request, T t);
}
