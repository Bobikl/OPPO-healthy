package com.platform.sdk.center.sdk.mvvm.model.repository;

import com.heytap.usercenter.accountsdk.http.UCNetworkManager;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.network.NetworkModule;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcNetManager {

    public static class b {
        public static final AcNetManager a = new AcNetManager();
    }

    public static AcNetManager getInstance() {
        return b.a;
    }

    public NetworkModule getNetworkModule() {
        NetworkModule.Builder builder = new NetworkModule.Builder(UCNetworkManager.getInstance().getUrlByEnvironment());
        builder.setIsDebug(false);
        return builder.build();
    }

    private AcNetManager() {
    }
}
