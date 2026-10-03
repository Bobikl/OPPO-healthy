package org.oconscrypt;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
class OpenSSLXECParameterSpec implements AlgorithmParameterSpec {
    public static final String X25519 = "1.3.101.110";
    private final String oid;

    public OpenSSLXECParameterSpec(String str) {
        this.oid = str;
    }

    public String getOid() {
        return this.oid;
    }
}
