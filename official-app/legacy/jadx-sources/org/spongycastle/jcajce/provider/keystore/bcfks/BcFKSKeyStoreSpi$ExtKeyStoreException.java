package org.spongycastle.jcajce.provider.keystore.bcfks;

import java.security.KeyStoreException;

/* JADX INFO: loaded from: classes11.dex */
class BcFKSKeyStoreSpi$ExtKeyStoreException extends KeyStoreException {
    private final Throwable cause;

    public BcFKSKeyStoreSpi$ExtKeyStoreException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
