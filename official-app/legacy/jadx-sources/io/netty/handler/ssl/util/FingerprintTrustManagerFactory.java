package io.netty.handler.ssl.util;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.oplus.aiunit.vision.gc0;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.FastThreadLocal;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.hapjs.card.api.debug.CardDebugController;

/* JADX INFO: loaded from: classes10.dex */
public final class FingerprintTrustManagerFactory extends SimpleTrustManagerFactory {
    private static final Pattern FINGERPRINT_PATTERN = Pattern.compile("^[0-9a-fA-F:]+$");
    private static final Pattern FINGERPRINT_STRIP_PATTERN = Pattern.compile(":");
    private final byte[][] fingerprints;
    private final FastThreadLocal<MessageDigest> tlmd;
    private final TrustManager tm;

    @Deprecated
    public FingerprintTrustManagerFactory(Iterable<String> iterable) {
        this(gc0.SHA1, toFingerprintArray(iterable));
    }

    public static FingerprintTrustManagerFactoryBuilder builder(String str) {
        return new FingerprintTrustManagerFactoryBuilder(str);
    }

    public static byte[][] toFingerprintArray(Iterable<String> iterable) {
        String next;
        ObjectUtil.checkNotNull(iterable, "fingerprints");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (!FINGERPRINT_PATTERN.matcher(next).matches()) {
                throw new IllegalArgumentException("malformed fingerprint: " + next);
            }
            arrayList.add(StringUtil.decodeHexDump(FINGERPRINT_STRIP_PATTERN.matcher(next).replaceAll("")));
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    public TrustManager[] engineGetTrustManagers() {
        return new TrustManager[]{this.tm};
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    public void engineInit(KeyStore keyStore) throws Exception {
    }

    @Deprecated
    public FingerprintTrustManagerFactory(String... strArr) {
        this(gc0.SHA1, toFingerprintArray(Arrays.asList(strArr)));
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception {
    }

    @Deprecated
    public FingerprintTrustManagerFactory(byte[]... bArr) {
        this(gc0.SHA1, bArr);
    }

    public FingerprintTrustManagerFactory(final String str, byte[][] bArr) {
        this.tm = new X509TrustManager() { // from class: io.netty.handler.ssl.util.FingerprintTrustManagerFactory.1
            private void checkTrusted(String str2, X509Certificate[] x509CertificateArr) throws CertificateException {
                boolean z = false;
                X509Certificate x509Certificate = x509CertificateArr[0];
                byte[] bArrFingerprint = fingerprint(x509Certificate);
                for (byte[] bArr2 : FingerprintTrustManagerFactory.this.fingerprints) {
                    if (Arrays.equals(bArrFingerprint, bArr2)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
                throw new CertificateException(str2 + " certificate with unknown fingerprint: " + x509Certificate.getSubjectDN());
            }

            private byte[] fingerprint(X509Certificate x509Certificate) throws CertificateEncodingException {
                MessageDigest messageDigest = (MessageDigest) FingerprintTrustManagerFactory.this.tlmd.get();
                messageDigest.reset();
                return messageDigest.digest(x509Certificate.getEncoded());
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                checkTrusted("client", x509CertificateArr);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                checkTrusted(CardDebugController.EXTRA_SERVER, x509CertificateArr);
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return EmptyArrays.EMPTY_X509_CERTIFICATES;
            }
        };
        ObjectUtil.checkNotNull(str, ConnectIdLogic.PARAM_ALGORITHM);
        ObjectUtil.checkNotNull(bArr, "fingerprints");
        if (bArr.length != 0) {
            try {
                int digestLength = MessageDigest.getInstance(str).getDigestLength();
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte[] bArr2 : bArr) {
                    if (bArr2 == null) {
                        break;
                    }
                    if (bArr2.length == digestLength) {
                        arrayList.add(bArr2.clone());
                    } else {
                        throw new IllegalArgumentException(String.format("malformed fingerprint (length is %d but expected %d): %s", Integer.valueOf(bArr2.length), Integer.valueOf(digestLength), ByteBufUtil.hexDump(Unpooled.wrappedBuffer(bArr2))));
                    }
                }
                this.tlmd = new FastThreadLocal<MessageDigest>() { // from class: io.netty.handler.ssl.util.FingerprintTrustManagerFactory.2
                    @Override // io.netty.util.concurrent.FastThreadLocal
                    public MessageDigest initialValue() {
                        try {
                            return MessageDigest.getInstance(str);
                        } catch (NoSuchAlgorithmException e2) {
                            throw new IllegalArgumentException(String.format("Unsupported hash algorithm: %s", str), e2);
                        }
                    }
                };
                this.fingerprints = (byte[][]) arrayList.toArray(new byte[0][]);
                return;
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalArgumentException(String.format("Unsupported hash algorithm: %s", str), e2);
            }
        }
        throw new IllegalArgumentException("No fingerprints provided");
    }
}
