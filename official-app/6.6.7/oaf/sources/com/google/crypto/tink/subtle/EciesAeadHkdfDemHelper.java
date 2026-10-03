package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface EciesAeadHkdfDemHelper {
    Aead getAead(byte[] bArr) throws GeneralSecurityException;

    int getSymmetricKeySizeInBytes();
}
