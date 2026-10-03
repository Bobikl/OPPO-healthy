package io.netty.handler.ssl;

import com.oplus.aiunit.vision.apj;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.util.AttributeMap;
import io.netty.util.DefaultAttributeMap;
import io.netty.util.internal.EmptyArrays;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SslContext {
    static final String ALIAS = "key";
    static final CertificateFactory X509_CERT_FACTORY;
    private final AttributeMap attributes;
    private final boolean startTls;

    /* JADX INFO: renamed from: io.netty.handler.ssl.SslContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$SslProvider;

        static {
            int[] iArr = new int[SslProvider.values().length];
            $SwitchMap$io$netty$handler$ssl$SslProvider = iArr;
            try {
                iArr[SslProvider.JDK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$SslProvider[SslProvider.OPENSSL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$SslProvider[SslProvider.OPENSSL_REFCNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        try {
            X509_CERT_FACTORY = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e2) {
            throw new IllegalStateException("unable to instance X.509 CertificateFactory", e2);
        }
    }

    public SslContext() {
        this(false);
    }

    public static KeyManagerFactory buildKeyManagerFactory(X509Certificate[] x509CertificateArr, String str, PrivateKey privateKey, String str2, KeyManagerFactory keyManagerFactory, String str3) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        if (str == null) {
            str = KeyManagerFactory.getDefaultAlgorithm();
        }
        char[] cArrKeyStorePassword = keyStorePassword(str2);
        return buildKeyManagerFactory(buildKeyStore(x509CertificateArr, privateKey, cArrKeyStorePassword, str3), str, cArrKeyStorePassword, keyManagerFactory);
    }

    public static KeyStore buildKeyStore(X509Certificate[] x509CertificateArr, PrivateKey privateKey, char[] cArr, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (str == null) {
            str = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(str);
        keyStore.load(null, null);
        keyStore.setKeyEntry("key", privateKey, cArr, x509CertificateArr);
        return keyStore;
    }

    @Deprecated
    public static TrustManagerFactory buildTrustManagerFactory(File file, TrustManagerFactory trustManagerFactory) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        return buildTrustManagerFactory(file, trustManagerFactory, (String) null);
    }

    public static SslProvider defaultClientProvider() {
        return defaultProvider();
    }

    private static SslProvider defaultProvider() {
        return OpenSsl.isAvailable() ? SslProvider.OPENSSL : SslProvider.JDK;
    }

    public static SslProvider defaultServerProvider() {
        return defaultProvider();
    }

    @Deprecated
    public static PKCS8EncodedKeySpec generateKeySpec(char[] cArr, byte[] bArr) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        if (cArr == null) {
            return new PKCS8EncodedKeySpec(bArr);
        }
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(bArr);
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance(encryptedPrivateKeyInfo.getAlgName()).generateSecret(new PBEKeySpec(cArr));
        Cipher cipher = Cipher.getInstance(encryptedPrivateKeyInfo.getAlgName());
        cipher.init(2, secretKeyGenerateSecret, encryptedPrivateKeyInfo.getAlgParameters());
        return encryptedPrivateKeyInfo.getKeySpec(cipher);
    }

    private static X509Certificate[] getCertificatesFromBuffers(ByteBuf[] byteBufArr) throws CertificateException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        X509Certificate[] x509CertificateArr = new X509Certificate[byteBufArr.length];
        int i = 0;
        for (int i2 = 0; i2 < byteBufArr.length; i2++) {
            try {
                ByteBufInputStream byteBufInputStream = new ByteBufInputStream(byteBufArr[i2], false);
                try {
                    x509CertificateArr[i2] = (X509Certificate) certificateFactory.generateCertificate(byteBufInputStream);
                    try {
                        byteBufInputStream.close();
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th) {
                    try {
                        byteBufInputStream.close();
                        throw th;
                    } catch (IOException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            } catch (Throwable th2) {
                int length = byteBufArr.length;
                while (i < length) {
                    byteBufArr[i].release();
                    i++;
                }
                throw th2;
            }
        }
        int length2 = byteBufArr.length;
        while (i < length2) {
            byteBufArr[i].release();
            i++;
        }
        return x509CertificateArr;
    }

    private static PrivateKey getPrivateKeyFromByteBuffer(ByteBuf byteBuf, String str) throws KeyException, InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidAlgorithmParameterException {
        byte[] bArr = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(bArr).release();
        PKCS8EncodedKeySpec pKCS8EncodedKeySpecGenerateKeySpec = generateKeySpec(str == null ? null : str.toCharArray(), bArr);
        try {
            try {
                try {
                    return KeyFactory.getInstance("RSA").generatePrivate(pKCS8EncodedKeySpecGenerateKeySpec);
                } catch (InvalidKeySpecException unused) {
                    return KeyFactory.getInstance("DSA").generatePrivate(pKCS8EncodedKeySpecGenerateKeySpec);
                }
            } catch (InvalidKeySpecException e2) {
                throw new InvalidKeySpecException("Neither RSA, DSA nor EC worked", e2);
            }
        } catch (InvalidKeySpecException unused2) {
            return KeyFactory.getInstance(apj.Thread_Type_Executor_Cached).generatePrivate(pKCS8EncodedKeySpecGenerateKeySpec);
        }
    }

    public static char[] keyStorePassword(String str) {
        return str == null ? EmptyArrays.EMPTY_CHARS : str.toCharArray();
    }

    @Deprecated
    public static SslContext newClientContext() throws SSLException {
        return newClientContext(null, null, null);
    }

    public static SslContext newClientContextInternal(SslProvider sslProvider, Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, String[] strArr, long j2, long j3, boolean z, String str2, Map.Entry<SslContextOption<?>, Object>... entryArr) throws SSLException {
        SslProvider sslProviderDefaultClientProvider = sslProvider == null ? defaultClientProvider() : sslProvider;
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider[sslProviderDefaultClientProvider.ordinal()];
        if (i == 1) {
            if (!z) {
                return new JdkSslClientContext(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, strArr, j2, j3, str2);
            }
            throw new IllegalArgumentException("OCSP is not supported with this SslProvider: " + sslProviderDefaultClientProvider);
        }
        if (i == 2) {
            verifyNullSslContextProvider(sslProviderDefaultClientProvider, provider);
            OpenSsl.ensureAvailability();
            return new OpenSslClientContext(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, strArr, j2, j3, z, str2, entryArr);
        }
        if (i != 3) {
            throw new Error(sslProviderDefaultClientProvider.toString());
        }
        verifyNullSslContextProvider(sslProviderDefaultClientProvider, provider);
        OpenSsl.ensureAvailability();
        return new ReferenceCountedOpenSslClientContext(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, strArr, j2, j3, z, str2, entryArr);
    }

    @Deprecated
    public static SslContext newServerContext(File file, File file2) throws SSLException {
        return newServerContext(file, file2, (String) null);
    }

    public static SslContext newServerContextInternal(SslProvider sslProvider, Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, ClientAuth clientAuth, String[] strArr, boolean z, boolean z2, String str2, Map.Entry<SslContextOption<?>, Object>... entryArr) throws SSLException {
        SslProvider sslProviderDefaultServerProvider = sslProvider == null ? defaultServerProvider() : sslProvider;
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider[sslProviderDefaultServerProvider.ordinal()];
        if (i == 1) {
            if (!z2) {
                return new JdkSslServerContext(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3, clientAuth, strArr, z, str2);
            }
            throw new IllegalArgumentException("OCSP is not supported with this SslProvider: " + sslProviderDefaultServerProvider);
        }
        if (i == 2) {
            verifyNullSslContextProvider(sslProviderDefaultServerProvider, provider);
            return new OpenSslServerContext(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3, clientAuth, strArr, z, z2, str2, entryArr);
        }
        if (i != 3) {
            throw new Error(sslProviderDefaultServerProvider.toString());
        }
        verifyNullSslContextProvider(sslProviderDefaultServerProvider, provider);
        return new ReferenceCountedOpenSslServerContext(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3, clientAuth, strArr, z, z2, str2, entryArr);
    }

    public static ApplicationProtocolConfig toApplicationProtocolConfig(Iterable<String> iterable) {
        return iterable == null ? ApplicationProtocolConfig.DISABLED : new ApplicationProtocolConfig(ApplicationProtocolConfig.Protocol.NPN_AND_ALPN, ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL, ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT, iterable);
    }

    public static PrivateKey toPrivateKey(File file, String str) throws KeyException, NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, IOException, InvalidAlgorithmParameterException {
        PrivateKey privateKey;
        if (file == null) {
            return null;
        }
        return (!BouncyCastlePemReader.isAvailable() || (privateKey = BouncyCastlePemReader.getPrivateKey(file, str)) == null) ? getPrivateKeyFromByteBuffer(PemReader.readPrivateKey(file), str) : privateKey;
    }

    public static PrivateKey toPrivateKeyInternal(File file, String str) throws SSLException {
        try {
            return toPrivateKey(file, str);
        } catch (Exception e2) {
            throw new SSLException(e2);
        }
    }

    public static X509Certificate[] toX509Certificates(File file) throws CertificateException {
        if (file == null) {
            return null;
        }
        return getCertificatesFromBuffers(PemReader.readCertificates(file));
    }

    public static X509Certificate[] toX509CertificatesInternal(File file) throws SSLException {
        try {
            return toX509Certificates(file);
        } catch (CertificateException e2) {
            throw new SSLException(e2);
        }
    }

    private static void verifyNullSslContextProvider(SslProvider sslProvider, Provider provider) {
        if (provider == null) {
            return;
        }
        throw new IllegalArgumentException("Java Security Provider unsupported for SslProvider: " + sslProvider);
    }

    public abstract ApplicationProtocolNegotiator applicationProtocolNegotiator();

    public final AttributeMap attributes() {
        return this.attributes;
    }

    public abstract List<String> cipherSuites();

    public abstract boolean isClient();

    public final boolean isServer() {
        return !isClient();
    }

    public abstract SSLEngine newEngine(ByteBufAllocator byteBufAllocator);

    public abstract SSLEngine newEngine(ByteBufAllocator byteBufAllocator, String str, int i);

    public final SslHandler newHandler(ByteBufAllocator byteBufAllocator) {
        return newHandler(byteBufAllocator, this.startTls);
    }

    @Deprecated
    public final List<String> nextProtocols() {
        return applicationProtocolNegotiator().protocols();
    }

    public long sessionCacheSize() {
        return sessionContext().getSessionCacheSize();
    }

    public abstract SSLSessionContext sessionContext();

    public long sessionTimeout() {
        return sessionContext().getSessionTimeout();
    }

    public SslContext(boolean z) {
        this.attributes = new DefaultAttributeMap();
        this.startTls = z;
    }

    public static TrustManagerFactory buildTrustManagerFactory(File file, TrustManagerFactory trustManagerFactory, String str) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        return buildTrustManagerFactory(toX509Certificates(file), trustManagerFactory, str);
    }

    @Deprecated
    public static SslContext newClientContext(File file) throws SSLException {
        return newClientContext((SslProvider) null, file);
    }

    @Deprecated
    public static SslContext newServerContext(File file, File file2, String str) throws SSLException {
        return newServerContext(null, file, file2, str);
    }

    public static X509Certificate[] toX509Certificates(InputStream inputStream) throws CertificateException {
        if (inputStream == null) {
            return null;
        }
        return getCertificatesFromBuffers(PemReader.readCertificates(inputStream));
    }

    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, boolean z) {
        return new SslHandler(newEngine(byteBufAllocator), z);
    }

    @Deprecated
    public static SslContext newClientContext(TrustManagerFactory trustManagerFactory) throws SSLException {
        return newClientContext(null, null, trustManagerFactory);
    }

    @Deprecated
    public static SslContext newServerContext(File file, File file2, String str, Iterable<String> iterable, Iterable<String> iterable2, long j2, long j3) throws SSLException {
        return newServerContext((SslProvider) null, file, file2, str, iterable, iterable2, j2, j3);
    }

    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, Executor executor) {
        return newHandler(byteBufAllocator, this.startTls, executor);
    }

    public static TrustManagerFactory buildTrustManagerFactory(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (str == null) {
            str = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(str);
        keyStore.load(null, null);
        int i = 1;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            keyStore.setCertificateEntry(Integer.toString(i), x509Certificate);
            i++;
        }
        if (trustManagerFactory == null) {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        }
        trustManagerFactory.init(keyStore);
        return trustManagerFactory;
    }

    @Deprecated
    public static SslContext newClientContext(File file, TrustManagerFactory trustManagerFactory) throws SSLException {
        return newClientContext(null, file, trustManagerFactory);
    }

    @Deprecated
    public static SslContext newServerContext(File file, File file2, String str, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        return newServerContext((SslProvider) null, file, file2, str, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3);
    }

    public static PrivateKey toPrivateKey(InputStream inputStream, String str) throws KeyException, NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, IOException, InvalidAlgorithmParameterException {
        if (inputStream == null) {
            return null;
        }
        if (BouncyCastlePemReader.isAvailable()) {
            if (!inputStream.markSupported()) {
                inputStream = new BufferedInputStream(inputStream);
            }
            inputStream.mark(1048576);
            PrivateKey privateKey = BouncyCastlePemReader.getPrivateKey(inputStream, str);
            if (privateKey != null) {
                return privateKey;
            }
            inputStream.reset();
        }
        return getPrivateKeyFromByteBuffer(PemReader.readPrivateKey(inputStream), str);
    }

    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, boolean z, Executor executor) {
        return new SslHandler(newEngine(byteBufAllocator), z, executor);
    }

    public static KeyManagerFactory buildKeyManagerFactory(KeyStore keyStore, String str, char[] cArr, KeyManagerFactory keyManagerFactory) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        if (keyManagerFactory == null) {
            if (str == null) {
                str = KeyManagerFactory.getDefaultAlgorithm();
            }
            keyManagerFactory = KeyManagerFactory.getInstance(str);
        }
        keyManagerFactory.init(keyStore, cArr);
        return keyManagerFactory;
    }

    @Deprecated
    public static SslContext newClientContext(File file, TrustManagerFactory trustManagerFactory, Iterable<String> iterable, Iterable<String> iterable2, long j2, long j3) throws SSLException {
        return newClientContext((SslProvider) null, file, trustManagerFactory, iterable, iterable2, j2, j3);
    }

    @Deprecated
    public static SslContext newServerContext(SslProvider sslProvider, File file, File file2) throws SSLException {
        return newServerContext(sslProvider, file, file2, null);
    }

    public final SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i) {
        return newHandler(byteBufAllocator, str, i, this.startTls);
    }

    @Deprecated
    public static SslContext newClientContext(File file, TrustManagerFactory trustManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        return newClientContext(null, file, trustManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3);
    }

    @Deprecated
    public static SslContext newServerContext(SslProvider sslProvider, File file, File file2, String str) throws SSLException {
        return newServerContext(sslProvider, file, file2, str, (Iterable<String>) null, IdentityCipherSuiteFilter.INSTANCE, (ApplicationProtocolConfig) null, 0L, 0L);
    }

    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i, boolean z) {
        return new SslHandler(newEngine(byteBufAllocator, str, i), z);
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider) throws SSLException {
        return newClientContext(sslProvider, null, null);
    }

    @Deprecated
    public static SslContext newServerContext(SslProvider sslProvider, File file, File file2, String str, Iterable<String> iterable, Iterable<String> iterable2, long j2, long j3) throws SSLException {
        return newServerContext(sslProvider, file, file2, str, iterable, IdentityCipherSuiteFilter.INSTANCE, toApplicationProtocolConfig(iterable2), j2, j3);
    }

    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i, Executor executor) {
        return newHandler(byteBufAllocator, str, i, this.startTls, executor);
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider, File file) throws SSLException {
        return newClientContext(sslProvider, file, null);
    }

    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i, boolean z, Executor executor) {
        return new SslHandler(newEngine(byteBufAllocator, str, i), z, executor);
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider, TrustManagerFactory trustManagerFactory) throws SSLException {
        return newClientContext(sslProvider, null, trustManagerFactory);
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider, File file, TrustManagerFactory trustManagerFactory) throws SSLException {
        return newClientContext(sslProvider, file, trustManagerFactory, null, IdentityCipherSuiteFilter.INSTANCE, null, 0L, 0L);
    }

    @Deprecated
    public static SslContext newServerContext(SslProvider sslProvider, File file, File file2, String str, TrustManagerFactory trustManagerFactory, Iterable<String> iterable, Iterable<String> iterable2, long j2, long j3) throws SSLException {
        return newServerContext(sslProvider, null, trustManagerFactory, file, file2, str, null, iterable, IdentityCipherSuiteFilter.INSTANCE, toApplicationProtocolConfig(iterable2), j2, j3);
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider, File file, TrustManagerFactory trustManagerFactory, Iterable<String> iterable, Iterable<String> iterable2, long j2, long j3) throws SSLException {
        return newClientContext(sslProvider, file, trustManagerFactory, null, null, null, null, iterable, IdentityCipherSuiteFilter.INSTANCE, toApplicationProtocolConfig(iterable2), j2, j3);
    }

    @Deprecated
    public static SslContext newServerContext(SslProvider sslProvider, File file, File file2, String str, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        return newServerContext(sslProvider, null, null, file, file2, str, null, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3, KeyStore.getDefaultType());
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider, File file, TrustManagerFactory trustManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        return newClientContext(sslProvider, file, trustManagerFactory, null, null, null, null, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3);
    }

    @Deprecated
    public static SslContext newClientContext(SslProvider sslProvider, File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        try {
            return newClientContextInternal(sslProvider, null, toX509Certificates(file), trustManagerFactory, toX509Certificates(file2), toPrivateKey(file3, str), str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, null, j2, j3, false, KeyStore.getDefaultType(), new Map.Entry[0]);
        } catch (Exception e2) {
            if (e2 instanceof SSLException) {
                throw ((SSLException) e2);
            }
            throw new SSLException("failed to initialize the client-side SSL context", e2);
        }
    }

    @Deprecated
    public static SslContext newServerContext(SslProvider sslProvider, File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3) throws SSLException {
        return newServerContext(sslProvider, file, trustManagerFactory, file2, file3, str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3, KeyStore.getDefaultType());
    }

    public static SslContext newServerContext(SslProvider sslProvider, File file, TrustManagerFactory trustManagerFactory, File file2, File file3, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, String str2) throws SSLException {
        try {
            return newServerContextInternal(sslProvider, null, toX509Certificates(file), trustManagerFactory, toX509Certificates(file2), toPrivateKey(file3, str), str, keyManagerFactory, iterable, cipherSuiteFilter, applicationProtocolConfig, j2, j3, ClientAuth.NONE, null, false, false, str2, new Map.Entry[0]);
        } catch (Exception e2) {
            if (e2 instanceof SSLException) {
                throw ((SSLException) e2);
            }
            throw new SSLException("failed to initialize the server-side SSL context", e2);
        }
    }
}
