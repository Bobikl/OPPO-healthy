package com.platform.usercenter.network.interceptor;

import com.platform.usercenter.network.header.IBizHeaderManager;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class UCSecurityRequestInterceptor extends SecurityRequestInterceptor {
    public UCSecurityRequestInterceptor() {
        this(null);
    }

    public UCSecurityRequestInterceptor(IBizHeaderManager iBizHeaderManager) {
        super(iBizHeaderManager);
    }
}
