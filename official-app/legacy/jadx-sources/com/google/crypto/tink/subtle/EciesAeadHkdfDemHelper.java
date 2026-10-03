package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes14.dex */
public interface EciesAeadHkdfDemHelper {
    Aead getAead(byte[] bArr) throws GeneralSecurityException;

    int getSymmetricKeySizeInBytes();
}
