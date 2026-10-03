package com.heytap.usercenter.accountsdk.http;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCProviderRepository {
    public static <T> T provideAccountService(Class<T> cls) {
        return (T) UCNetworkManager.getInstance().getNetworkModule().provideNormalRetrofit().b(cls);
    }
}
