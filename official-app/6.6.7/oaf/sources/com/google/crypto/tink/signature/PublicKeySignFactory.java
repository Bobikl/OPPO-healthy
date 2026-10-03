package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Deprecated
public final class PublicKeySignFactory {
    @Deprecated
    public static PublicKeySign getPrimitive(KeysetHandle keysetHandle) throws GeneralSecurityException {
        return getPrimitive(keysetHandle, null);
    }

    @Deprecated
    public static PublicKeySign getPrimitive(KeysetHandle keysetHandle, KeyManager<PublicKeySign> keyManager) throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new PublicKeySignWrapper());
        return (PublicKeySign) Registry.wrap(Registry.getPrimitives(keysetHandle, keyManager, PublicKeySign.class));
    }
}
