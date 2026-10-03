package io.netty.handler.ssl.util;

import io.netty.util.internal.ObjectUtil;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes10.dex */
public final class TrustManagerFactoryWrapper extends SimpleTrustManagerFactory {
    private final TrustManager tm;

    public TrustManagerFactoryWrapper(TrustManager trustManager) {
        this.tm = (TrustManager) ObjectUtil.checkNotNull(trustManager, "tm");
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    public TrustManager[] engineGetTrustManagers() {
        return new TrustManager[]{this.tm};
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    public void engineInit(KeyStore keyStore) throws Exception {
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception {
    }
}
