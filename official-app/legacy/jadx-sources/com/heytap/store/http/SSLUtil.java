package com.heytap.store.http;

import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.app.HostDomainCenter;
import com.oplus.aiunit.vision.efd;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes5.dex */
public class SSLUtil {
    public static HostnameVerifier getHostnameVerifier() {
        return new HostnameVerifier() { // from class: com.heytap.store.http.SSLUtil.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                if (UrlConfig.ENV.isRelease()) {
                    return HostDomainCenter.verifyServerApiHostWhiteList(str);
                }
                return true;
            }
        };
    }

    private static efd.a setCertificates(efd.a aVar, InputStream... inputStreamArr) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyStore keyStore = KeyStore.getInstance("PKCS12", "BC");
            keyStore.load(null);
            int length = inputStreamArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                InputStream inputStream = inputStreamArr[i];
                int i3 = i2 + 1;
                keyStore.setCertificateEntry(Integer.toString(i2), certificateFactory.generateCertificate(inputStream));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                i++;
                i2 = i3;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
            aVar.Z(sSLContext.getSocketFactory());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return aVar;
    }
}
