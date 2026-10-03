package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Immutable
public abstract class PrfSet {
    public byte[] computePrimary(byte[] bArr, int i) throws GeneralSecurityException {
        return getPrfs().get(Integer.valueOf(getPrimaryId())).compute(bArr, i);
    }

    public abstract Map<Integer, Prf> getPrfs() throws GeneralSecurityException;

    public abstract int getPrimaryId();
}
