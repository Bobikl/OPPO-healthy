package org.oconscrypt;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes11.dex */
public interface ConscryptHostnameVerifier {
    boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession);
}
