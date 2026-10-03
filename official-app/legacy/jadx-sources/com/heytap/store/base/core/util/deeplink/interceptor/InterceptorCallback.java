package com.heytap.store.base.core.util.deeplink.interceptor;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;

/* JADX INFO: loaded from: classes3.dex */
public interface InterceptorCallback {
    void onContinue(DeepLinkInterpreter deepLinkInterpreter);

    void onInterrupt(DeepLinkInterpreter deepLinkInterpreter);
}
