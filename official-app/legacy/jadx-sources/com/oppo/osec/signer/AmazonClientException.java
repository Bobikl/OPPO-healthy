package com.oppo.osec.signer;

/* JADX INFO: loaded from: classes9.dex */
public class AmazonClientException extends SdkBaseException {
    private static final long serialVersionUID = 1;

    public AmazonClientException(String str, Throwable th) {
        super(str, th);
    }

    public boolean isRetryable() {
        return true;
    }

    public AmazonClientException(String str) {
        super(str);
    }

    public AmazonClientException(Throwable th) {
        super(th);
    }
}
