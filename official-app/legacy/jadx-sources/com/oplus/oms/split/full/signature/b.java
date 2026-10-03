package com.oplus.oms.split.full.signature;

import com.oplus.aiunit.vision.w7i;
import java.io.IOException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes8.dex */
public class b {
    public static X509Certificate[][] a(String str) throws IOException {
        X509Certificate[][] x509CertificateArr;
        try {
            x509CertificateArr = new X509Certificate[][]{ApkSignatureSchemeV3Verifier.d(str).a};
        } catch (SignatureNotFoundException unused) {
            x509CertificateArr = null;
        }
        if (x509CertificateArr != null) {
            w7i.a("ApkSignatureVerifier", "APK Signature Scheme v3 signature in package", new Object[0]);
            return x509CertificateArr;
        }
        try {
            return a.e(str);
        } catch (SignatureNotFoundException unused2) {
            w7i.i("ApkSignatureVerifier", "No APK Signature Scheme v3 and v2 signature in package", new Object[0]);
            return x509CertificateArr;
        }
    }
}
