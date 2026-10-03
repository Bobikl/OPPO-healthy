package com.lifesense.weidong.lzsimplenetlibs.net.invoker;

import android.text.TextUtils;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public class HttpsInvoker extends BaseApiInvoker {
    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.BaseApiInvoker
    public URLConnection getURLConnection(String str, String str2) throws ProtocolException {
        SSLContext sSLContext;
        SSLContext sSLContext2 = null;
        try {
            sSLContext = SSLContext.getInstance("TLS");
            try {
                sSLContext.init(new KeyManager[0], null, new SecureRandom());
            } catch (KeyManagementException | NoSuchAlgorithmException unused) {
                sSLContext2 = sSLContext;
                sSLContext = sSLContext2;
            }
        } catch (KeyManagementException | NoSuchAlgorithmException unused2) {
        }
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setSSLSocketFactory(socketFactory);
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpsInvoker.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str3, SSLSession sSLSession) {
                if (TextUtils.isEmpty(str3)) {
                    return false;
                }
                return str3.contains("lifesense") || str3.contains("leshiguang");
            }
        });
        httpsURLConnection.setRequestMethod(str2);
        httpsURLConnection.setDoInput(true);
        if ("POST".equals(str2)) {
            httpsURLConnection.setDoOutput(true);
        }
        return httpsURLConnection;
    }
}
