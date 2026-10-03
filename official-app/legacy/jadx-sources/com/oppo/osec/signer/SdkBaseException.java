package com.oppo.osec.signer;

/* JADX INFO: loaded from: classes9.dex */
public class SdkBaseException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public SdkBaseException(String str, Throwable th) {
        super(str, th);
    }

    public SdkBaseException(String str) {
        super(str);
    }

    public SdkBaseException(Throwable th) {
        super(th);
    }
}
