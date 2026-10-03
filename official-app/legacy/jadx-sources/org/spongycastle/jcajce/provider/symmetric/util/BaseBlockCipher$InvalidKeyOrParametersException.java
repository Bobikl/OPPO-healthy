package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes11.dex */
class BaseBlockCipher$InvalidKeyOrParametersException extends InvalidKeyException {
    private final Throwable cause;

    public BaseBlockCipher$InvalidKeyOrParametersException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
