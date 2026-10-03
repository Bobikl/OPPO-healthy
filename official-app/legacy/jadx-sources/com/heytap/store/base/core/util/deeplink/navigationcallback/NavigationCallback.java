package com.heytap.store.base.core.util.deeplink.navigationcallback;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;

/* JADX INFO: loaded from: classes3.dex */
public interface NavigationCallback {
    void onArrival(DeepLinkInterpreter deepLinkInterpreter);

    void onInterrupt(DeepLinkInterpreter deepLinkInterpreter);

    void onUnArrival(DeepLinkInterpreter deepLinkInterpreter, String str);
}
