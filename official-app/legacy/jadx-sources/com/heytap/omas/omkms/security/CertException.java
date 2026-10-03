package com.heytap.omas.omkms.security;

/* JADX INFO: loaded from: classes19.dex */
public class CertException {

    public static class CertChainException extends Exception {
        public CertChainException(String str) {
            super(str);
        }
    }

    public static class CertChainVerifyException extends Exception {
        public CertChainVerifyException(String str) {
            super(str);
        }
    }

    public static class LoadEccCertException extends Exception {
        public LoadEccCertException(String str) {
            super(str);
        }
    }
}
