package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface PrimitiveWrapper<B, P> {
    Class<B> getInputPrimitiveClass();

    Class<P> getPrimitiveClass();

    P wrap(PrimitiveSet<B> primitiveSet) throws GeneralSecurityException;
}
