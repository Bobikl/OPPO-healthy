package com.google.crypto.tink.daead;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class DeterministicAeadConfig {
    public static final String AES_SIV_TYPE_URL = new AesSivKeyManager().getKeyType();

    @Deprecated
    public static final RegistryConfig TINK_1_1_0 = RegistryConfig.getDefaultInstance();

    @Deprecated
    public static final RegistryConfig LATEST = RegistryConfig.getDefaultInstance();

    static {
        try {
            init();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private DeterministicAeadConfig() {
    }

    @Deprecated
    public static void init() throws GeneralSecurityException {
        register();
    }

    public static void register() throws GeneralSecurityException {
        AesSivKeyManager.register(true);
        DeterministicAeadWrapper.register();
    }
}
