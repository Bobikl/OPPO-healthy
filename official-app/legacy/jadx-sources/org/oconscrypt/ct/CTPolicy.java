package org.oconscrypt.ct;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes11.dex */
public interface CTPolicy {
    boolean doesResultConformToPolicy(CTVerificationResult cTVerificationResult, String str, X509Certificate[] x509CertificateArr);
}
