package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Deprecated
public final class HybridEncryptFactory {
    @Deprecated
    public static HybridEncrypt getPrimitive(KeysetHandle keysetHandle) throws GeneralSecurityException {
        return getPrimitive(keysetHandle, null);
    }

    @Deprecated
    public static HybridEncrypt getPrimitive(KeysetHandle keysetHandle, KeyManager<HybridEncrypt> keyManager) throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new HybridEncryptWrapper());
        return (HybridEncrypt) Registry.wrap(Registry.getPrimitives(keysetHandle, keyManager, HybridEncrypt.class));
    }
}
