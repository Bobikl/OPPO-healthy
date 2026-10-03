package io.netty.handler.ssl;

import java.io.File;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class JdkSslServerContext extends JdkSslContext {
    @Deprecated
    public JdkSslServerContext(File file, File file2) throws SSLException {
        this(null, file, file2, null, null, IdentityCipherSuiteFilter.INSTANCE, JdkDefaultApplicationProtocolNegotiator.INSTANCE, 0L, 0L, null);
    }

    private static SSLContext newSSLContext(Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, long j2, long j3, String str2) throws SSLException {
        TrustManagerFactory trustManagerFactoryBuildTrustManagerFactory;
        if (privateKey == null && keyManagerFactory == null) {
            throw new NullPointerException("key, keyManagerFactory");
        }
        if (x509CertificateArr != null) {
            try {
                trustManagerFactoryBuildTrustManagerFactory = SslContext.buildTrustManagerFactory(x509CertificateArr, trustManagerFactory, str2);
            } catch (Exception e2) {
                if (e2 instanceof SSLException) {
                    throw ((SSLException) e2);
                }
                throw new SSLException("failed to initialize the server-side SSL context", e2);
            }
        } else {
            trustManagerFactoryBuildTrustManagerFactory = trustManagerFactory;
        }
        KeyManagerFactory keyManagerFactoryBuildKeyManagerFactory = privateKey != null ? SslContext.buildKeyManagerFactory(x509CertificateArr2, null, privateKey, str, keyManagerFactory, null) : keyManagerFactory;
        SSLContext sSLContext = provider == null ? SSLContext.getInstance("TLS") : SSLContext.getInstance("TLS", provider);
        sSLContext.init(keyManagerFactoryBuildKeyManagerFactory.getKeyManagers(), trustManagerFactoryBuildTrustManagerFactory == null ? null : trustManagerFactoryBuildTrustManagerFactory.getTrustManagers(), null);
        SSLSessionContext serverSessionContext = sSLContext.getServerSessionContext();
        if (j2 > 0) {
            serverSessionContext.setSessionCacheSize((int) Math.min(j2, 2147483647L));
        }
        if (j3 > 0) {
            serverSessionContext.setSessionTimeout((int) Math.min(j3, 2147483647L));
        }
        return sSLContext;
    }

    @Deprecated
    public JdkSslServerContext(File file, File file2, String str) throws SSLException {
        this(file, file2, str, (Iterable<String>) null, IdentityCipherSuiteFilter.INSTANCE, JdkDefaultApplicationProtocolNegotiator.INSTANCE, 0L, 0L);
    }

    @Deprecated
    public JdkSslServerContext(File file, File file2, String str, Iterable<String> iterable, Iterable<String> iterable2, long j2, long j3) throws SSLException {
        this(null, file, file2, str, iterable, IdentityCipherSuiteFilter.INSTANCE, JdkSslContext.toNegotiator(SslContext.toApplicationProtocolConfig(iterable2), true), j2, j3, KeyStore.getDefaultType());
    }

    @Deprecated
    public JdkSslServerContext(File file, File file2, String str, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        this(null, file, file2, str, iterable, cipherSuiteFilter, JdkSslContext.toNegotiator(applicationProtocolConfig, true), j2, j3, KeyStore.getDefaultType());
    }

    @Deprecated
    public JdkSslServerContext(File file, File file2, String str, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, long j2, long j3) throws SSLException {
        this(null, file, file2, str, iterable, cipherSuiteFilter, jdkApplicationProtocolNegotiator, j2, j3, KeyStore.getDefaultType());
    }

    public JdkSslServerContext(Provider provider, File file, File file2, String str, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, long j2, long j3, String str2) throws SSLException {
        super(newSSLContext(provider, null, null, SslContext.toX509CertificatesInternal(file), SslContext.toPrivateKeyInternal(file2, str), str, null, j2, j3, str2), false, iterable, cipherSuiteFilter, jdkApplicationProtocolNegotiator, ClientAuth.NONE, (String[]) null, false);
    }

    @Deprecated
    public JdkSslServerContext(File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        super(newSSLContext(null, SslContext.toX509CertificatesInternal(file), trustManagerFactory, SslContext.toX509CertificatesInternal(file2), SslContext.toPrivateKeyInternal(file3, str), str, keyManagerFactory, j2, j3, null), false, iterable, cipherSuiteFilter, applicationProtocolConfig, ClientAuth.NONE, (String[]) null, false);
    }

    @Deprecated
    public JdkSslServerContext(File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, long j2, long j3) throws SSLException {
        super(newSSLContext(null, SslContext.toX509CertificatesInternal(file), trustManagerFactory, SslContext.toX509CertificatesInternal(file2), SslContext.toPrivateKeyInternal(file3, str), str, keyManagerFactory, j2, j3, KeyStore.getDefaultType()), false, iterable, cipherSuiteFilter, jdkApplicationProtocolNegotiator, ClientAuth.NONE, (String[]) null, false);
    }

    public JdkSslServerContext(Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, ClientAuth clientAuth, String[] strArr, boolean z, String str2) throws SSLException {
        super(newSSLContext(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, j2, j3, str2), false, iterable, cipherSuiteFilter, JdkSslContext.toNegotiator(applicationProtocolConfig, true), clientAuth, strArr, z);
    }
}
