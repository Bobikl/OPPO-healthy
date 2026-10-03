package com.platform.usercenter.network.provider;

import com.oplus.aiunit.vision.ma4;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes9.dex */
public interface INetConfigProvider {
    ma4.a getConvertFactory();

    String getHostByEnvironment();

    HostnameVerifier getHostnameVerifier();

    SSLSocketFactory getSSLSocketFactory();

    X509TrustManager getTrustManager();

    boolean isDebug();

    boolean isEncryption();

    boolean isHttps();
}
