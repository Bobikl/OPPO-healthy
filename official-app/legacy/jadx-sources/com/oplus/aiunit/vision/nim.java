package com.oplus.aiunit.vision;

import android.net.http.X509TrustManagerExtensions;
import android.text.TextUtils;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes10.dex */
public final class nim implements X509TrustManager {
    public X509TrustManager a;
    public X509TrustManagerExtensions b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14532c;

    public nim(String str) throws NoSuchAlgorithmException, KeyStoreException {
        this.b = null;
        this.f14532c = str;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 0) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.a = (X509TrustManager) trustManagers[0];
        this.b = new X509TrustManagerExtensions(this.a);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManager x509TrustManager = this.a;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        boolean z;
        X509TrustManagerExtensions x509TrustManagerExtensions = this.b;
        if (x509TrustManagerExtensions != null) {
            x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, "");
        } else {
            X509TrustManager x509TrustManager = this.a;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
        boolean z2 = false;
        try {
            X500Principal issuerX500Principal = x509CertificateArr[0].getIssuerX500Principal();
            ArrayList arrayList = new ArrayList(0);
            arrayList.add(".*(GeoTrust|VeriSign|Symantec|GlobalSign|CFCA|Entrust|Thawte|DigiCert).*");
            if (!TextUtils.isEmpty(this.f14532c)) {
                arrayList.add(this.f14532c);
            }
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    z = false;
                    break;
                } else {
                    if (Pattern.compile((String) arrayList.get(i), 2).matcher(issuerX500Principal.getName()).matches()) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                throw new CertificateException();
            }
            X500Principal subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal();
            ArrayList arrayList2 = new ArrayList(0);
            arrayList2.add(".*CN=.*(\\.cup\\.com\\.cn|\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net)(,.*|$)");
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (Pattern.compile((String) arrayList2.get(i2), 2).matcher(subjectX500Principal.getName()).matches()) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                throw new CertificateException();
            }
        } catch (Exception unused) {
            throw new CertificateException();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.getAcceptedIssuers();
    }
}
