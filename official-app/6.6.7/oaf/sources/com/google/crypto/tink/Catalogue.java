package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Deprecated
public interface Catalogue<P> {
    KeyManager<P> getKeyManager(String str, String str2, int i) throws GeneralSecurityException;

    PrimitiveWrapper<?, P> getPrimitiveWrapper() throws GeneralSecurityException;
}
