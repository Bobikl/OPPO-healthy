package io.netty.handler.ssl.util;

import io.netty.util.internal.ObjectUtil;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.ManagerFactoryParameters;

/* JADX INFO: loaded from: classes10.dex */
public final class KeyManagerFactoryWrapper extends SimpleKeyManagerFactory {
    private final KeyManager km;

    public KeyManagerFactoryWrapper(KeyManager keyManager) {
        this.km = (KeyManager) ObjectUtil.checkNotNull(keyManager, "km");
    }

    @Override // io.netty.handler.ssl.util.SimpleKeyManagerFactory
    public KeyManager[] engineGetKeyManagers() {
        return new KeyManager[]{this.km};
    }

    @Override // io.netty.handler.ssl.util.SimpleKeyManagerFactory
    public void engineInit(KeyStore keyStore, char[] cArr) throws Exception {
    }

    @Override // io.netty.handler.ssl.util.SimpleKeyManagerFactory
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception {
    }
}
