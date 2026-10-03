package com.oplus.oms.split.full.signature;

import android.util.ArrayMap;
import android.util.Pair;
import com.leon.channel.common.verify.ApkSignatureSchemeV2Verifier;
import com.oplus.aiunit.vision.apj;
import com.oplus.aiunit.vision.c3h;
import com.oplus.aiunit.vision.gd2;
import com.oplus.aiunit.vision.id2;
import com.oplus.aiunit.vision.qw4;
import com.oplus.aiunit.vision.y7m;
import com.oplus.aiunit.vision.zs4;
import com.oplus.mydevices.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final int CONTENT_DIGEST_CHUNKED_SHA256 = 1;
    public static final int CONTENT_DIGEST_CHUNKED_SHA512 = 2;
    public static final int CONTENT_DIGEST_SHA256 = 4;
    public static final int CONTENT_DIGEST_VERITY_CHUNKED_SHA256 = 3;

    public class a implements id2 {
        @Override // com.oplus.aiunit.vision.id2
        public ByteBuffer create(int i) {
            return ByteBuffer.allocate(i);
        }
    }

    public static class b implements zs4 {
        public final MessageDigest[] a;

        public b(MessageDigest[] messageDigestArr) {
            this.a = messageDigestArr;
        }

        @Override // com.oplus.aiunit.vision.zs4
        public void a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            for (MessageDigest messageDigest : this.a) {
                byteBufferSlice.position(0);
                messageDigest.update(byteBufferSlice);
            }
        }
    }

    /* JADX INFO: renamed from: com.oplus.oms.split.full.signature.c$c, reason: collision with other inner class name */
    public static class C0973c {
        public final List<X509Certificate> a;
        public final List<Integer> b;

        public C0973c(List<X509Certificate> list, List<Integer> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    public static C0973c A(ByteBuffer byteBuffer, CertificateFactory certificateFactory) throws SecurityException, IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        try {
            byteBuffer.getInt();
            HashSet hashSet = new HashSet();
            int i2 = -1;
            VerbatimX509Certificate verbatimX509Certificate = null;
            while (byteBuffer.hasRemaining()) {
                i++;
                ByteBuffer byteBufferO = o(byteBuffer);
                ByteBuffer byteBufferO2 = o(byteBufferO);
                int i3 = byteBufferO.getInt();
                int i4 = byteBufferO.getInt();
                byte[] bArrU = u(byteBufferO);
                if (verbatimX509Certificate != null) {
                    Pair<String, ? extends AlgorithmParameterSpec> pairR = r(i2);
                    PublicKey publicKey = verbatimX509Certificate.getPublicKey();
                    Signature signature = Signature.getInstance((String) pairR.first);
                    signature.initVerify(publicKey);
                    Object obj = pairR.second;
                    if (obj != null) {
                        signature.setParameter((AlgorithmParameterSpec) obj);
                    }
                    signature.update(byteBufferO2);
                    if (!signature.verify(bArrU)) {
                        throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + ((String) pairR.first) + " when verifying Proof-of-rotation record");
                    }
                }
                byteBufferO2.rewind();
                byte[] bArrU2 = u(byteBufferO2);
                int i5 = byteBufferO2.getInt();
                if (verbatimX509Certificate != null && i2 != i5) {
                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + i + " when verifying Proof-of-rotation record");
                }
                verbatimX509Certificate = new VerbatimX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrU2)), bArrU2);
                if (hashSet.contains(verbatimX509Certificate)) {
                    throw new SecurityException("Encountered duplicate entries in Proof-of-rotation record at certificate #" + i + ".  All signing certificates should be unique");
                }
                hashSet.add(verbatimX509Certificate);
                arrayList.add(verbatimX509Certificate);
                arrayList2.add(Integer.valueOf(i3));
                i2 = i4;
            }
            return new C0973c(arrayList, arrayList2);
        } catch (IOException | BufferUnderflowException e2) {
            throw new IOException("Failed to parse Proof-of-rotation record", e2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e3) {
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e3);
        } catch (CertificateException e4) {
            throw new SecurityException("Failed to decode certificate #0 when verifying Proof-of-rotation record", e4);
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int b(int i, int i2) {
        if (i == 1) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2 || i2 == 3) {
                return -1;
            }
            throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
        }
        if (i == 2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 0;
                }
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
                }
            }
            return 1;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unknown digestAlgorithm1: " + i);
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return -1;
        }
        if (i2 == 3) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
    }

    public static int c(int i, int i2) {
        return b(p(i), p(i2));
    }

    public static byte[][] d(int[] iArr, FileDescriptor fileDescriptor, c3h c3hVar) throws DigestException {
        qw4 qw4VarA = qw4.a(fileDescriptor, 0L, c3hVar.b);
        long j2 = c3hVar.f9939c;
        qw4 qw4VarA2 = qw4.a(fileDescriptor, j2, c3hVar.d - j2);
        ByteBuffer byteBufferDuplicate = c3hVar.f9940e.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        y7m.k(byteBufferDuplicate, c3hVar.b);
        return e(iArr, new qw4[]{qw4VarA, qw4VarA2, new gd2(byteBufferDuplicate)});
    }

    public static byte[][] e(int[] iArr, qw4[] qw4VarArr) throws DigestException {
        String str;
        qw4[] qw4VarArr2 = qw4VarArr;
        long j2 = 0;
        int i = 0;
        long jK = 0;
        for (qw4 qw4Var : qw4VarArr2) {
            jK += k(qw4Var.size());
        }
        if (jK >= 2097151) {
            throw new DigestException("Too many chunks: " + jK);
        }
        int i2 = (int) jK;
        byte[][] bArr = new byte[iArr.length][];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            byte[] bArr2 = new byte[(m(iArr[i3]) * i2) + 5];
            bArr2[0] = 90;
            v(i2, bArr2, 1);
            bArr[i3] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length = iArr.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i4 = 0;
        while (true) {
            str = " digest not supported";
            if (i4 >= iArr.length) {
                break;
            }
            String strL = l(iArr[i4]);
            try {
                messageDigestArr[i4] = MessageDigest.getInstance(strL);
                i4++;
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(strL + " digest not supported", e2);
            }
        }
        b bVar = new b(messageDigestArr);
        int length2 = qw4VarArr2.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length2) {
            qw4 qw4Var2 = qw4VarArr2[i5];
            int i7 = length2;
            String str2 = str;
            long j3 = j2;
            b bVar2 = bVar;
            long size = qw4Var2.size();
            while (size > j2) {
                int iMin = (int) Math.min(size, 1048576L);
                v(iMin, bArr3, 1);
                for (int i8 = 0; i8 < length; i8++) {
                    messageDigestArr[i8].update(bArr3);
                }
                b bVar3 = bVar2;
                try {
                    qw4Var2.b(bVar3, j3, iMin);
                    bVar2 = bVar3;
                    int i9 = 0;
                    while (i9 < iArr.length) {
                        int i10 = iArr[i9];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i9];
                        int iM = m(i10);
                        int i11 = length;
                        MessageDigest messageDigest = messageDigestArr[i9];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i6 * iM) + 5, iM);
                        if (iDigest != iM) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i9++;
                        bArr3 = bArr4;
                        length = i11;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j4 = iMin;
                    j3 += j4;
                    size -= j4;
                    i6++;
                    bArr3 = bArr3;
                    j2 = 0;
                } catch (IOException e3) {
                    throw new DigestException("Failed to digest chunk #" + i6 + " of section #" + i, e3);
                }
            }
            i++;
            i5++;
            qw4VarArr2 = qw4VarArr;
            bVar = bVar2;
            str = str2;
            length2 = i7;
            j2 = 0;
        }
        String str3 = str;
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            byte[] bArr7 = bArr[i12];
            String strL2 = l(i13);
            try {
                bArr6[i12] = MessageDigest.getInstance(strL2).digest(bArr7);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strL2 + str3, e4);
            }
        }
        return bArr6;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, int i) throws SignatureNotFoundException {
        a(byteBuffer);
        ByteBuffer byteBufferW = w(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (byteBufferW.hasRemaining()) {
            i2++;
            if (byteBufferW.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i2);
            }
            long j2 = byteBufferW.getLong();
            if (j2 < 4 || j2 > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i2 + " size out of range: " + j2);
            }
            int i3 = (int) j2;
            int iPosition = byteBufferW.position() + i3;
            if (i3 > byteBufferW.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferW.remaining());
            }
            if (byteBufferW.getInt() == i) {
                return i(byteBufferW, i3 - 4);
            }
            byteBufferW.position(iPosition);
        }
        throw new SignatureNotFoundException("No block with ID " + i + " in APK Signing Block.");
    }

    public static Pair<ByteBuffer, Long> g(RandomAccessFile randomAccessFile, long j2) throws IOException, SignatureNotFoundException {
        if (j2 < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != ApkSignatureSchemeV2Verifier.APK_SIG_BLOCK_MAGIC_LO || byteBufferAllocate.getLong(16) != ApkSignatureSchemeV2Verifier.APK_SIG_BLOCK_MAGIC_HI) {
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
            throw new SignatureNotFoundException("APK Signing Block size out of range: " + j3);
        }
        int i = (int) (8 + j3);
        long j4 = j2 - ((long) i);
        if (j4 < 0) {
            throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j4);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 == j3) {
            return Pair.create(byteBufferAllocate2, Long.valueOf(j4));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
    }

    public static c3h h(RandomAccessFile randomAccessFile, int i) throws IOException, SignatureNotFoundException {
        Pair<ByteBuffer, Long> pairN = n(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) pairN.first;
        long jLongValue = ((Long) pairN.second).longValue();
        if (y7m.i(randomAccessFile, jLongValue)) {
            throw new SignatureNotFoundException("ZIP64 APK not supported");
        }
        long j2 = j(byteBuffer, jLongValue);
        Pair<ByteBuffer, Long> pairG = g(randomAccessFile, j2);
        ByteBuffer byteBuffer2 = (ByteBuffer) pairG.first;
        return new c3h(f(byteBuffer2, i), ((Long) pairG.second).longValue(), j2, jLongValue, byteBuffer);
    }

    public static ByteBuffer i(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            throw new IllegalArgumentException("size: " + i);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static long j(ByteBuffer byteBuffer, long j2) throws SignatureNotFoundException {
        long jG = y7m.g(byteBuffer);
        if (jG <= j2) {
            if (y7m.h(byteBuffer) + jG == j2) {
                return jG;
            }
            throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + jG + ". ZIP End of Central Directory offset: " + j2);
    }

    public static long k(long j2) {
        return ((j2 + 1048576) - 1) / 1048576;
    }

    public static String l(int i) {
        if (i == 1) {
            return MessageDigestAlgorithms.SHA_256;
        }
        if (i == 2) {
            return MessageDigestAlgorithms.SHA_512;
        }
        if (i == 3) {
            return MessageDigestAlgorithms.SHA_256;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    public static int m(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        if (i == 3) {
            return 32;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    public static Pair<ByteBuffer, Long> n(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
        Pair<ByteBuffer, Long> pairC = y7m.c(randomAccessFile);
        if (pairC != null) {
            return pairC;
        }
        throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static ByteBuffer o(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return i(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    public static int p(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        if (i == 1057 || i == 1059 || i == 1061) {
            return 3;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case Constants.LINKAGE_SET_ACTIVE /* 260 */:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
        }
    }

    public static String q(int i) {
        if (i == 513 || i == 514) {
            return apj.Thread_Type_Executor_Cached;
        }
        if (i == 769) {
            return "DSA";
        }
        if (i == 1057) {
            return "RSA";
        }
        if (i == 1059) {
            return apj.Thread_Type_Executor_Cached;
        }
        if (i == 1061) {
            return "DSA";
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case Constants.LINKAGE_SET_ACTIVE /* 260 */:
                return "RSA";
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
        }
    }

    public static Pair<String, ? extends AlgorithmParameterSpec> r(int i) {
        if (i != 513) {
            if (i == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i != 769) {
                if (i != 1057) {
                    if (i != 1059) {
                        if (i != 1061) {
                            switch (i) {
                                case 257:
                                    return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(MessageDigestAlgorithms.SHA_256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                case 258:
                                    return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec(MessageDigestAlgorithms.SHA_512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                case 259:
                                    break;
                                case Constants.LINKAGE_SET_ACTIVE /* 260 */:
                                    return Pair.create("SHA512withRSA", null);
                                default:
                                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
                            }
                        }
                    }
                }
                return Pair.create("SHA256withRSA", null);
            }
            return Pair.create("SHA256withDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    public static boolean s(int i) {
        if (i == 513 || i == 514 || i == 769 || i == 1057 || i == 1059 || i == 1061) {
            return true;
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case Constants.LINKAGE_SET_ACTIVE /* 260 */:
                return true;
            default:
                return false;
        }
    }

    public static byte[] t(byte[] bArr, long j2, c3h c3hVar) throws SecurityException {
        if (bArr.length != 40) {
            throw new SecurityException("Verity digest size is wrong: " + bArr.length);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(32);
        if (byteBufferOrder.getLong() == j2 - (c3hVar.f9939c - c3hVar.b)) {
            return Arrays.copyOfRange(bArr, 0, 32);
        }
        throw new SecurityException("APK content size did not verify");
    }

    public static byte[] u(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    public static void v(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >>> 24) & 255);
    }

    public static ByteBuffer w(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i2 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static void x(Map<Integer, byte[]> map, RandomAccessFile randomAccessFile, c3h c3hVar) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        ArrayMap arrayMap = new ArrayMap();
        boolean z = true;
        if (map.containsKey(1)) {
            arrayMap.put(1, map.get(1));
        }
        if (map.containsKey(2)) {
            arrayMap.put(2, map.get(2));
        }
        boolean z2 = false;
        if (!arrayMap.isEmpty()) {
            try {
                y(arrayMap, randomAccessFile.getFD(), c3hVar);
                z = false;
            } catch (IOException e2) {
                throw new SecurityException("Cannot get FD", e2);
            }
        }
        if (map.containsKey(3)) {
            z(map.get(3), randomAccessFile, c3hVar);
        } else {
            z2 = z;
        }
        if (z2) {
            throw new SecurityException("No known digest exists for integrity check");
        }
    }

    public static void y(Map<Integer, byte[]> map, FileDescriptor fileDescriptor, c3h c3hVar) throws SecurityException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        try {
            byte[][] bArrD = d(iArr, fileDescriptor, c3hVar);
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i3)), bArrD[i2])) {
                    throw new SecurityException(l(i3) + " digest of contents did not verify");
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    public static void z(byte[] bArr, RandomAccessFile randomAccessFile, c3h c3hVar) throws SecurityException {
        try {
            if (Arrays.equals(t(bArr, randomAccessFile.getChannel().size(), c3hVar), d.f(randomAccessFile, c3hVar, new a()).f20011c)) {
            } else {
                throw new SecurityException("APK verity digest of contents did not verify");
            }
        } catch (IOException | DigestException | NoSuchAlgorithmException e2) {
            throw new SecurityException("Error during verification", e2);
        }
    }
}
