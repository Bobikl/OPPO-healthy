package com.heytap.usercenter.accountsdk.http;

import androidx.annotation.Keep;
import com.platform.usercenter.network.NetworkModule;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public abstract class UCBaseNetworkManager {
    private NetworkModule mNetworkModule;

    private NetworkModule.Builder getNetworkBuilder(String str, boolean z) {
        return new NetworkModule.Builder(str).setIsDebug(z);
    }

    public NetworkModule getNetworkModule() {
        if (this.mNetworkModule == null) {
            this.mNetworkModule = getNetworkBuilder(getUrlByEnvironment(), false).build();
        }
        return this.mNetworkModule;
    }

    public abstract String getUrlByEnvironment();
}
