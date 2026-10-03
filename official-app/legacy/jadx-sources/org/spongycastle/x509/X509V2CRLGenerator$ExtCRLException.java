package org.spongycastle.x509;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes11.dex */
class X509V2CRLGenerator$ExtCRLException extends CRLException {
    Throwable cause;

    public X509V2CRLGenerator$ExtCRLException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
