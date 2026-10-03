package com.heytap.store.base.core.util.deeplink.navigationcallback;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavCallback implements NavigationCallback {
    @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
    public void onArrival(DeepLinkInterpreter deepLinkInterpreter) {
    }

    @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
    public void onInterrupt(DeepLinkInterpreter deepLinkInterpreter) {
    }

    @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
    public void onUnArrival(DeepLinkInterpreter deepLinkInterpreter, String str) {
    }
}
