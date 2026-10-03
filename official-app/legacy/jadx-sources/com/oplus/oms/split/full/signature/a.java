package com.oplus.oms.split.full.signature;

import android.util.ArrayMap;
import android.util.Pair;
import com.leon.channel.common.verify.ApkSignatureSchemeV2Verifier;
import com.oplus.aiunit.vision.c3h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: com.oplus.oms.split.full.signature.a$a, reason: collision with other inner class name */
    public static class C0972a {
        public final X509Certificate[][] a;
        public final byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<Integer, byte[]> f20008c;

        public C0972a(X509Certificate[][] x509CertificateArr, byte[] bArr, Map<Integer, byte[]> map) {
            this.a = x509CertificateArr;
            this.b = bArr;
            this.f20008c = map;
        }
    }

    public static c3h a(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
        return c.h(randomAccessFile, ApkSignatureSchemeV2Verifier.APK_SIGNATURE_SCHEME_V2_BLOCK_ID);
    }

    public static C0972a b(RandomAccessFile randomAccessFile, c3h c3hVar, boolean z) throws SecurityException, IOException {
        ArrayMap arrayMap = new ArrayMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferO = c.o(c3hVar.a);
                int i = 0;
                while (byteBufferO.hasRemaining()) {
                    i++;
                    if (i > 10) {
                        throw new SecurityException("APK Signature Scheme v2 only supports a maximum of 10 signers");
                    }
                    try {
                        arrayList.add(g(c.o(byteBufferO), arrayMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e2);
                    }
                }
                if (i < 1) {
                    throw new SecurityException("No signers found");
                }
                if (arrayMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (z) {
                    c.x(arrayMap, randomAccessFile, c3hVar);
                }
                return new C0972a((X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]), arrayMap.containsKey(3) ? c.t((byte[]) arrayMap.get(3), randomAccessFile.getChannel().size(), c3hVar) : null, arrayMap);
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    public static C0972a c(RandomAccessFile randomAccessFile, boolean z) throws SecurityException, IOException, SignatureNotFoundException {
        return b(randomAccessFile, a(randomAccessFile), z);
    }

    public static C0972a d(String str, boolean z) throws IOException, SecurityException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            C0972a c0972aC = c(randomAccessFile, z);
            randomAccessFile.close();
            return c0972aC;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static X509Certificate[][] e(String str) throws SecurityException, IOException, SignatureNotFoundException {
        return d(str, true).a;
    }

    public static void f(ByteBuffer byteBuffer) throws IOException, SecurityException {
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferO = c.o(byteBuffer);
            if (byteBufferO.remaining() < 4) {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + byteBufferO.remaining());
            }
            if (byteBufferO.getInt() == -1091571699) {
                if (byteBufferO.remaining() < 4) {
                    throw new IOException("V2 Signature Scheme Stripping Protection Attribute  value too small.  Expected 4 bytes, but found " + byteBufferO.remaining());
                }
                if (byteBufferO.getInt() == 3) {
                    throw new SecurityException("V2 signature indicates APK is signed using APK Signature Scheme v3, but none was found. Signature stripped?");
                }
            }
        }
    }

    public static X509Certificate[] g(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        ByteBuffer byteBufferO = c.o(byteBuffer);
        ByteBuffer byteBufferO2 = c.o(byteBuffer);
        byte[] bArrU = c.u(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrU2 = null;
        int i = 0;
        int i2 = -1;
        byte[] bArrU3 = null;
        while (byteBufferO2.hasRemaining()) {
            i++;
            try {
                ByteBuffer byteBufferO3 = c.o(byteBufferO2);
                if (byteBufferO3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferO3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (c.s(i3) && (i2 == -1 || c.c(i3, i2) > 0)) {
                    bArrU3 = c.u(byteBufferO3);
                    i2 = i3;
                }
            } catch (IOException | BufferUnderflowException e2) {
                throw new SecurityException("Failed to parse signature record #" + i, e2);
            }
        }
        if (i2 == -1) {
            if (i == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        String strQ = c.q(i2);
        Pair<String, ? extends AlgorithmParameterSpec> pairR = c.r(i2);
        String str = (String) pairR.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairR.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(strQ).generatePublic(new X509EncodedKeySpec(bArrU));
            Signature signature = Signature.getInstance(str);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferO);
            if (!signature.verify(bArrU3)) {
                throw new SecurityException(str + " signature did not verify");
            }
            byteBufferO.clear();
            ByteBuffer byteBufferO4 = c.o(byteBufferO);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferO4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferO5 = c.o(byteBufferO4);
                    if (byteBufferO5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferO5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i2) {
                        bArrU2 = c.u(byteBufferO5);
                    }
                } catch (IOException | BufferUnderflowException e3) {
                    throw new IOException("Failed to parse digest record #" + i4, e3);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iP = c.p(i2);
            byte[] bArrPut = map.put(Integer.valueOf(iP), bArrU2);
            if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrU2)) {
                throw new SecurityException(c.l(iP) + " contents digest does not match the digest specified by a preceding signer");
            }
            ByteBuffer byteBufferO6 = c.o(byteBufferO);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferO6.hasRemaining()) {
                i6++;
                byte[] bArrU4 = c.u(byteBufferO6);
                try {
                    arrayList3.add(new VerbatimX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrU4)), bArrU4));
                } catch (CertificateException e4) {
                    throw new SecurityException("Failed to decode certificate #" + i6, e4);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (!Arrays.equals(bArrU, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                throw new SecurityException("Public key mismatch between certificate and signature record");
            }
            f(c.o(byteBufferO));
            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e5) {
            throw new SecurityException("Failed to verify " + str + " signature", e5);
        }
    }
}
