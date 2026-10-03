package com.oplus.oms.split.full.signature;

import android.os.Build;
import android.util.ArrayMap;
import android.util.Pair;
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
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

/* JADX INFO: loaded from: classes8.dex */
public class ApkSignatureSchemeV3Verifier {
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 3;
    public final RandomAccessFile a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OptionalInt f20004c = OptionalInt.empty();
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20005e;

    public static class PlatformNotSupportedException extends Exception {
        public PlatformNotSupportedException(String str) {
            super(str);
        }
    }

    public static class a {
        public final X509Certificate[] a;
        public final c.C0973c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f20006c;
        public final Map<Integer, byte[]> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20007e;

        public a(X509Certificate[] x509CertificateArr, c.C0973c c0973c, byte[] bArr, Map<Integer, byte[]> map, int i) {
            this.a = x509CertificateArr;
            this.b = c0973c;
            this.f20006c = bArr;
            this.d = map;
            this.f20007e = i;
        }
    }

    public ApkSignatureSchemeV3Verifier(RandomAccessFile randomAccessFile, boolean z) {
        this.a = randomAccessFile;
        this.b = z;
    }

    public static c3h a(RandomAccessFile randomAccessFile, int i) throws IOException, SignatureNotFoundException {
        return c.h(randomAccessFile, i);
    }

    public static a c(RandomAccessFile randomAccessFile, boolean z) throws SecurityException, IOException, SignatureNotFoundException {
        ApkSignatureSchemeV3Verifier apkSignatureSchemeV3Verifier = new ApkSignatureSchemeV3Verifier(randomAccessFile, z);
        try {
            return apkSignatureSchemeV3Verifier.b(a(randomAccessFile, 462663009), 462663009);
        } catch (PlatformNotSupportedException | SignatureNotFoundException unused) {
            try {
                return apkSignatureSchemeV3Verifier.b(a(randomAccessFile, -262969152), -262969152);
            } catch (PlatformNotSupportedException e2) {
                throw new SecurityException(e2);
            }
        }
    }

    public static a d(String str) throws SecurityException, IOException, SignatureNotFoundException {
        return e(str, true);
    }

    public static a e(String str, boolean z) throws IOException, SecurityException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            a aVarC = c(randomAccessFile, z);
            randomAccessFile.close();
            return aVarC;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final a b(c3h c3hVar, int i) throws PlatformNotSupportedException, SecurityException, IOException {
        this.f20005e = i;
        ArrayMap arrayMap = new ArrayMap();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferO = c.o(c3hVar.a);
                int i2 = 0;
                Pair<X509Certificate[], c.C0973c> pairG = null;
                while (byteBufferO.hasRemaining()) {
                    try {
                        pairG = g(c.o(byteBufferO), arrayMap, certificateFactory);
                        i2++;
                    } catch (PlatformNotSupportedException unused) {
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException("Failed to parse/verify signer #" + i2 + " block", e2);
                    }
                }
                if (i2 < 1 || pairG == null) {
                    if (i == -262969152) {
                        throw new SecurityException("No signers found");
                    }
                    throw new PlatformNotSupportedException("None of the signers support the current platform version");
                }
                if (i2 != 1) {
                    throw new SecurityException("APK Signature Scheme V3 only supports one signer: multiple signers found.");
                }
                if (arrayMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (this.b) {
                    c.x(arrayMap, this.a, c3hVar);
                }
                return new a((X509Certificate[]) pairG.first, (c.C0973c) pairG.second, arrayMap.containsKey(3) ? c.t(arrayMap.get(3), this.a.getChannel().size(), c3hVar) : null, arrayMap, i);
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    public final Pair<X509Certificate[], c.C0973c> f(ByteBuffer byteBuffer, List<X509Certificate> list, CertificateFactory certificateFactory) throws PlatformNotSupportedException, IOException {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
        c.C0973c c0973cA = null;
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferO = c.o(byteBuffer);
            if (byteBufferO.remaining() < 4) {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + byteBufferO.remaining());
            }
            int i = byteBufferO.getInt();
            if (i != -1029262406) {
                if (i != 1000370060) {
                    if (i != 1436519170) {
                        continue;
                    } else {
                        if (byteBufferO.remaining() < 4) {
                            throw new IOException("Remaining buffer too short to contain rotation minSdkVersion value. Remaining: " + byteBufferO.remaining());
                        }
                        int i2 = byteBufferO.getInt();
                        if (!this.f20004c.isPresent()) {
                            throw new SecurityException("Expected a v3.1 signing block targeting SDK version " + i2 + ", but a v3.1 block was not found");
                        }
                        int asInt = this.f20004c.getAsInt();
                        if (asInt != i2) {
                            throw new SecurityException("Expected a v3.1 signing block targeting SDK version " + i2 + ", but the v3.1 block was targeting " + asInt);
                        }
                    }
                } else {
                    if (c0973cA != null) {
                        throw new SecurityException("Encountered multiple Proof-of-rotation records when verifying APK Signature Scheme v3 signature");
                    }
                    c0973cA = c.A(byteBufferO, certificateFactory);
                    try {
                        if (c0973cA.a.size() > 0) {
                            List<X509Certificate> list2 = c0973cA.a;
                            if (!Arrays.equals(list2.get(list2.size() - 1).getEncoded(), x509CertificateArr[0].getEncoded())) {
                                throw new SecurityException("Terminal certificate in Proof-of-rotation record does not match APK signing certificate");
                            }
                        } else {
                            continue;
                        }
                    } catch (CertificateEncodingException e2) {
                        throw new SecurityException("Failed to encode certificate when comparing Proof-of-rotation record and signing certificate", e2);
                    }
                }
            } else if (this.f20005e == 462663009 && Build.VERSION.SDK_INT == this.d && "REL".equals(Build.VERSION.CODENAME)) {
                this.f20004c = OptionalInt.of(this.d);
                throw new PlatformNotSupportedException("The device is running a release version of " + this.d + ", but the signer is targeting a dev release");
            }
        }
        return Pair.create(x509CertificateArr, c0973cA);
    }

    public final Pair<X509Certificate[], c.C0973c> g(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws PlatformNotSupportedException, IOException, SecurityException {
        ByteBuffer byteBufferO = c.o(byteBuffer);
        int i = byteBuffer.getInt();
        int i2 = byteBuffer.getInt();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < i || i3 > i2) {
            if (this.f20005e == 462663009 && (!this.f20004c.isPresent() || this.f20004c.getAsInt() > i)) {
                this.f20004c = OptionalInt.of(i);
            }
            throw new PlatformNotSupportedException("Signer not supported by this platform version. This platform: " + i3 + ", signer minSdkVersion: " + i + ", maxSdkVersion: " + i2);
        }
        ByteBuffer byteBufferO2 = c.o(byteBuffer);
        byte[] bArrU = c.u(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i4 = -1;
        int i5 = 0;
        byte[] bArrU2 = null;
        while (true) {
            int i6 = 8;
            if (!byteBufferO2.hasRemaining()) {
                if (i4 == -1) {
                    if (i5 == 0) {
                        throw new SecurityException("No signatures found");
                    }
                    throw new SecurityException("No supported signatures found");
                }
                String strQ = c.q(i4);
                Pair<String, ? extends AlgorithmParameterSpec> pairR = c.r(i4);
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
                    if (!signature.verify(bArrU2)) {
                        throw new SecurityException(str + " signature did not verify");
                    }
                    byteBufferO.clear();
                    ByteBuffer byteBufferO3 = c.o(byteBufferO);
                    ArrayList arrayList2 = new ArrayList();
                    int i7 = 0;
                    byte[] bArrU3 = null;
                    while (byteBufferO3.hasRemaining()) {
                        i7++;
                        try {
                            ByteBuffer byteBufferO4 = c.o(byteBufferO3);
                            if (byteBufferO4.remaining() < i6) {
                                throw new IOException("Record too short");
                            }
                            int i8 = byteBufferO4.getInt();
                            arrayList2.add(Integer.valueOf(i8));
                            if (i8 == i4) {
                                bArrU3 = c.u(byteBufferO4);
                            }
                            i6 = 8;
                        } catch (IOException | BufferUnderflowException e2) {
                            throw new IOException("Failed to parse digest record #" + i7, e2);
                        }
                    }
                    if (!arrayList.equals(arrayList2)) {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                    int iP = c.p(i4);
                    byte[] bArrPut = map.put(Integer.valueOf(iP), bArrU3);
                    if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrU3)) {
                        throw new SecurityException(c.l(iP) + " contents digest does not match the digest specified by a preceding signer");
                    }
                    ByteBuffer byteBufferO5 = c.o(byteBufferO);
                    ArrayList arrayList3 = new ArrayList();
                    int i9 = 0;
                    while (byteBufferO5.hasRemaining()) {
                        i9++;
                        byte[] bArrU4 = c.u(byteBufferO5);
                        try {
                            arrayList3.add(new VerbatimX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrU4)), bArrU4));
                        } catch (CertificateException e3) {
                            throw new SecurityException("Failed to decode certificate #" + i9, e3);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        throw new SecurityException("No certificates listed");
                    }
                    if (!Arrays.equals(bArrU, arrayList3.get(0).getPublicKey().getEncoded())) {
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    int i10 = byteBufferO.getInt();
                    if (i10 != i) {
                        throw new SecurityException("minSdkVersion mismatch between signed and unsigned in v3 signer block.");
                    }
                    this.d = i10;
                    if (byteBufferO.getInt() == i2) {
                        return f(c.o(byteBufferO), arrayList3, certificateFactory);
                    }
                    throw new SecurityException("maxSdkVersion mismatch between signed and unsigned in v3 signer block.");
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                    throw new SecurityException("Failed to verify " + str + " signature", e4);
                }
            }
            i5++;
            try {
                ByteBuffer byteBufferO6 = c.o(byteBufferO2);
                if (byteBufferO6.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i11 = byteBufferO6.getInt();
                arrayList.add(Integer.valueOf(i11));
                if (c.s(i11) && (i4 == -1 || c.c(i11, i4) > 0)) {
                    bArrU2 = c.u(byteBufferO6);
                    i4 = i11;
                }
            } catch (IOException | BufferUnderflowException e5) {
                throw new SecurityException("Failed to parse signature record #" + i5, e5);
            }
        }
    }
}
