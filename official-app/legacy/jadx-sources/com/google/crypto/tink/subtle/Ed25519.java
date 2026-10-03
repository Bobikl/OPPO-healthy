package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes14.dex */
final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        public CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        public void copyConditional(CachedXYT cachedXYT, int i) {
            Curve25519.copyConditional(this.yPlusX, cachedXYT.yPlusX, i);
            Curve25519.copyConditional(this.yMinusX, cachedXYT.yMinusX, i);
            Curve25519.copyConditional(this.t2d, cachedXYT.t2d, i);
        }

        public void multByZ(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public CachedXYT(long[] jArr, long[] jArr2, long[] jArr3) {
            this.yPlusX = jArr;
            this.yMinusX = jArr2;
            this.t2d = jArr3;
        }

        public CachedXYT(CachedXYT cachedXYT) {
            this.yPlusX = Arrays.copyOf(cachedXYT.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(cachedXYT.yMinusX, 10);
            this.t2d = Arrays.copyOf(cachedXYT.t2d, 10);
        }
    }

    public static class CachedXYZT extends CachedXYT {
        private final long[] z;

        public CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] jArr, long[] jArr2) {
            Field25519.mult(jArr, jArr2, this.z);
        }

        public CachedXYZT(XYZT xyzt) {
            this();
            long[] jArr = this.yPlusX;
            XYZ xyz = xyzt.xyz;
            Field25519.sum(jArr, xyz.y, xyz.x);
            long[] jArr2 = this.yMinusX;
            XYZ xyz2 = xyzt.xyz;
            Field25519.sub(jArr2, xyz2.y, xyz2.x);
            System.arraycopy(xyzt.xyz.z, 0, this.z, 0, 10);
            Field25519.mult(this.t2d, xyzt.t, Ed25519Constants.D2);
        }

        public CachedXYZT(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.z = jArr3;
        }
    }

    public static class PartialXYZT {
        final long[] t;
        final XYZ xyz;

        public PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        public PartialXYZT(XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.t = jArr;
        }

        public PartialXYZT(PartialXYZT partialXYZT) {
            this.xyz = new XYZ(partialXYZT.xyz);
            this.t = Arrays.copyOf(partialXYZT.t, 10);
        }
    }

    public static class XYZ {
        final long[] x;
        final long[] y;
        final long[] z;

        public XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        public static XYZ fromPartialXYZT(XYZ xyz, PartialXYZT partialXYZT) {
            Field25519.mult(xyz.x, partialXYZT.xyz.x, partialXYZT.t);
            long[] jArr = xyz.y;
            XYZ xyz2 = partialXYZT.xyz;
            Field25519.mult(jArr, xyz2.y, xyz2.z);
            Field25519.mult(xyz.z, partialXYZT.xyz.z, partialXYZT.t);
            return xyz;
        }

        public boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }

        public byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.z);
            Field25519.mult(jArr2, this.x, jArr);
            Field25519.mult(jArr3, this.y, jArr);
            byte[] bArrContract = Field25519.contract(jArr3);
            bArrContract[31] = (byte) (bArrContract[31] ^ (Ed25519.getLsb(jArr2) << 7));
            return bArrContract;
        }

        public XYZ(long[] jArr, long[] jArr2, long[] jArr3) {
            this.x = jArr;
            this.y = jArr2;
            this.z = jArr3;
        }

        public XYZ(XYZ xyz) {
            this.x = Arrays.copyOf(xyz.x, 10);
            this.y = Arrays.copyOf(xyz.y, 10);
            this.z = Arrays.copyOf(xyz.z, 10);
        }

        public XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    public static class XYZT {
        final long[] t;
        final XYZ xyz;

        public XYZT() {
            this(new XYZ(), new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrExpand = Field25519.expand(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, jArrExpand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (Ed25519.isNonZeroVarTime(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
            }
            if (!Ed25519.isNonZeroVarTime(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (Ed25519.getLsb(jArr) == ((bArr[31] & 255) >> 7)) {
                Ed25519.neg(jArr, jArr);
            }
            Field25519.mult(jArr3, jArr, jArrExpand);
            return new XYZT(new XYZ(jArr, jArrExpand, jArr2), jArr3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromPartialXYZT(XYZT xyzt, PartialXYZT partialXYZT) {
            Field25519.mult(xyzt.xyz.x, partialXYZT.xyz.x, partialXYZT.t);
            long[] jArr = xyzt.xyz.y;
            XYZ xyz = partialXYZT.xyz;
            Field25519.mult(jArr, xyz.y, xyz.z);
            Field25519.mult(xyzt.xyz.z, partialXYZT.xyz.z, partialXYZT.t);
            long[] jArr2 = xyzt.t;
            XYZ xyz2 = partialXYZT.xyz;
            Field25519.mult(jArr2, xyz2.x, xyz2.y);
            return xyzt;
        }

        public XYZT(XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.t = jArr;
        }

        public XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    private static void add(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.xyz.x;
        XYZ xyz = xyzt.xyz;
        Field25519.sum(jArr2, xyz.y, xyz.x);
        long[] jArr3 = partialXYZT.xyz.y;
        XYZ xyz2 = xyzt.xyz;
        Field25519.sub(jArr3, xyz2.y, xyz2.x);
        long[] jArr4 = partialXYZT.xyz.y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yMinusX);
        XYZ xyz3 = partialXYZT.xyz;
        Field25519.mult(xyz3.z, xyz3.x, cachedXYT.yPlusX);
        Field25519.mult(partialXYZT.t, xyzt.t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.x, xyzt.xyz.z);
        long[] jArr5 = partialXYZT.xyz.x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.x, xyz4.z, xyz4.y);
        XYZ xyz5 = partialXYZT.xyz;
        long[] jArr6 = xyz5.y;
        Field25519.sum(jArr6, xyz5.z, jArr6);
        Field25519.sum(partialXYZT.xyz.z, jArr, partialXYZT.t);
        long[] jArr7 = partialXYZT.t;
        Field25519.sub(jArr7, jArr, jArr7);
    }

    private static XYZ doubleScalarMultVarTime(byte[] bArr, XYZT xyzt, byte[] bArr2) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(xyzt);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, xyzt);
        XYZT xyzt2 = new XYZT(partialXYZT);
        for (int i = 1; i < 8; i++) {
            add(partialXYZT, xyzt2, cachedXYZTArr[i - 1]);
            cachedXYZTArr[i] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] bArrSlide = slide(bArr);
        byte[] bArrSlide2 = slide(bArr2);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt3 = new XYZT();
        int i2 = 255;
        while (i2 >= 0 && bArrSlide[i2] == 0 && bArrSlide2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            byte b = bArrSlide[i2];
            if (b > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[bArrSlide[i2] / 2]);
            } else if (b < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[(-bArrSlide[i2]) / 2]);
            }
            byte b2 = bArrSlide2[i2];
            if (b2 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.B2[bArrSlide2[i2] / 2]);
            } else if (b2 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.B2[(-bArrSlide2[i2]) / 2]);
            }
            i2--;
        }
        return new XYZ(partialXYZT2);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ xyz) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.xyz.x, xyz.x);
        Field25519.square(partialXYZT.xyz.z, xyz.y);
        Field25519.square(partialXYZT.t, xyz.z);
        long[] jArr2 = partialXYZT.t;
        Field25519.sum(jArr2, jArr2, jArr2);
        Field25519.sum(partialXYZT.xyz.y, xyz.x, xyz.y);
        Field25519.square(jArr, partialXYZT.xyz.y);
        XYZ xyz2 = partialXYZT.xyz;
        Field25519.sum(xyz2.y, xyz2.z, xyz2.x);
        XYZ xyz3 = partialXYZT.xyz;
        long[] jArr3 = xyz3.z;
        Field25519.sub(jArr3, jArr3, xyz3.x);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.x, jArr, xyz4.y);
        long[] jArr4 = partialXYZT.t;
        Field25519.sub(jArr4, jArr4, partialXYZT.xyz.z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT xyzt) {
        doubleXYZ(partialXYZT, xyzt.xyz);
    }

    private static int eq(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    public static byte[] getHashedScalar(byte[] bArr) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(MessageDigestAlgorithms.SHA_512);
        engineFactory.update(bArr, 0, 32);
        byte[] bArrDigest = engineFactory.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b = (byte) (bArrDigest[31] & ByteCompanionObject.MAX_VALUE);
        bArrDigest[31] = b;
        bArrDigest[31] = (byte) (b | 64);
        return bArrDigest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] jArr) {
        return Field25519.contract(jArr)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Field25519.reduceCoefficients(jArr2);
        for (byte b : Field25519.contract(jArr2)) {
            if (b != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSmallerThanGroupOrder(byte[] bArr) {
        for (int i = 31; i >= 0; i--) {
            int i2 = bArr[i] & 255;
            int i3 = GROUP_ORDER[i] & 255;
            if (i2 != i3) {
                return i2 < i3;
            }
        }
        return false;
    }

    private static long load3(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    private static long load4(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | load3(bArr, i);
    }

    private static void mulAdd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long jLoad3 = load3(bArr2, 0) & 2097151;
        long jLoad4 = (load4(bArr2, 2) >> 5) & 2097151;
        long jLoad5 = (load3(bArr2, 5) >> 2) & 2097151;
        long jLoad6 = (load4(bArr2, 7) >> 7) & 2097151;
        long jLoad7 = (load4(bArr2, 10) >> 4) & 2097151;
        long jLoad8 = (load3(bArr2, 13) >> 1) & 2097151;
        long jLoad9 = (load4(bArr2, 15) >> 6) & 2097151;
        long jLoad10 = (load3(bArr2, 18) >> 3) & 2097151;
        long jLoad11 = load3(bArr2, 21) & 2097151;
        long jLoad12 = (load4(bArr2, 23) >> 5) & 2097151;
        long jLoad13 = (load3(bArr2, 26) >> 2) & 2097151;
        long jLoad14 = load4(bArr2, 28) >> 7;
        long jLoad15 = load3(bArr3, 0) & 2097151;
        long jLoad16 = (load4(bArr3, 2) >> 5) & 2097151;
        long jLoad17 = (load3(bArr3, 5) >> 2) & 2097151;
        long jLoad18 = (load4(bArr3, 7) >> 7) & 2097151;
        long jLoad19 = (load4(bArr3, 10) >> 4) & 2097151;
        long jLoad20 = (load3(bArr3, 13) >> 1) & 2097151;
        long jLoad21 = (load4(bArr3, 15) >> 6) & 2097151;
        long jLoad22 = (load3(bArr3, 18) >> 3) & 2097151;
        long jLoad23 = load3(bArr3, 21) & 2097151;
        long jLoad24 = (load4(bArr3, 23) >> 5) & 2097151;
        long jLoad25 = (load3(bArr3, 26) >> 2) & 2097151;
        long jLoad26 = load4(bArr3, 28) >> 7;
        long jLoad27 = load3(bArr4, 0) & 2097151;
        long jLoad28 = (load4(bArr4, 2) >> 5) & 2097151;
        long jLoad29 = (load3(bArr4, 5) >> 2) & 2097151;
        long jLoad30 = (load4(bArr4, 7) >> 7) & 2097151;
        long jLoad31 = (load4(bArr4, 10) >> 4) & 2097151;
        long jLoad32 = (load3(bArr4, 13) >> 1) & 2097151;
        long jLoad33 = (load4(bArr4, 15) >> 6) & 2097151;
        long jLoad34 = (load3(bArr4, 18) >> 3) & 2097151;
        long jLoad35 = load3(bArr4, 21) & 2097151;
        long j2 = jLoad27 + (jLoad3 * jLoad15);
        long j3 = jLoad28 + (jLoad3 * jLoad16) + (jLoad4 * jLoad15);
        long j4 = jLoad29 + (jLoad3 * jLoad17) + (jLoad4 * jLoad16) + (jLoad5 * jLoad15);
        long j5 = jLoad30 + (jLoad3 * jLoad18) + (jLoad4 * jLoad17) + (jLoad5 * jLoad16) + (jLoad6 * jLoad15);
        long j6 = jLoad31 + (jLoad3 * jLoad19) + (jLoad4 * jLoad18) + (jLoad5 * jLoad17) + (jLoad6 * jLoad16) + (jLoad7 * jLoad15);
        long j7 = jLoad32 + (jLoad3 * jLoad20) + (jLoad4 * jLoad19) + (jLoad5 * jLoad18) + (jLoad6 * jLoad17) + (jLoad7 * jLoad16) + (jLoad8 * jLoad15);
        long j8 = jLoad33 + (jLoad3 * jLoad21) + (jLoad4 * jLoad20) + (jLoad5 * jLoad19) + (jLoad6 * jLoad18) + (jLoad7 * jLoad17) + (jLoad8 * jLoad16) + (jLoad9 * jLoad15);
        long j9 = jLoad34 + (jLoad3 * jLoad22) + (jLoad4 * jLoad21) + (jLoad5 * jLoad20) + (jLoad6 * jLoad19) + (jLoad7 * jLoad18) + (jLoad8 * jLoad17) + (jLoad9 * jLoad16) + (jLoad10 * jLoad15);
        long j10 = jLoad35 + (jLoad3 * jLoad23) + (jLoad4 * jLoad22) + (jLoad5 * jLoad21) + (jLoad6 * jLoad20) + (jLoad7 * jLoad19) + (jLoad8 * jLoad18) + (jLoad9 * jLoad17) + (jLoad10 * jLoad16) + (jLoad11 * jLoad15);
        long jLoad36 = ((load4(bArr4, 23) >> 5) & 2097151) + (jLoad3 * jLoad24) + (jLoad4 * jLoad23) + (jLoad5 * jLoad22) + (jLoad6 * jLoad21) + (jLoad7 * jLoad20) + (jLoad8 * jLoad19) + (jLoad9 * jLoad18) + (jLoad10 * jLoad17) + (jLoad11 * jLoad16) + (jLoad12 * jLoad15);
        long jLoad37 = ((load3(bArr4, 26) >> 2) & 2097151) + (jLoad3 * jLoad25) + (jLoad4 * jLoad24) + (jLoad5 * jLoad23) + (jLoad6 * jLoad22) + (jLoad7 * jLoad21) + (jLoad8 * jLoad20) + (jLoad9 * jLoad19) + (jLoad10 * jLoad18) + (jLoad11 * jLoad17) + (jLoad12 * jLoad16) + (jLoad13 * jLoad15);
        long jLoad38 = (load4(bArr4, 28) >> 7) + (jLoad3 * jLoad26) + (jLoad4 * jLoad25) + (jLoad5 * jLoad24) + (jLoad6 * jLoad23) + (jLoad7 * jLoad22) + (jLoad8 * jLoad21) + (jLoad9 * jLoad20) + (jLoad10 * jLoad19) + (jLoad11 * jLoad18) + (jLoad12 * jLoad17) + (jLoad13 * jLoad16) + (jLoad15 * jLoad14);
        long j11 = (jLoad4 * jLoad26) + (jLoad5 * jLoad25) + (jLoad6 * jLoad24) + (jLoad7 * jLoad23) + (jLoad8 * jLoad22) + (jLoad9 * jLoad21) + (jLoad10 * jLoad20) + (jLoad11 * jLoad19) + (jLoad12 * jLoad18) + (jLoad13 * jLoad17) + (jLoad16 * jLoad14);
        long j12 = (jLoad5 * jLoad26) + (jLoad6 * jLoad25) + (jLoad7 * jLoad24) + (jLoad8 * jLoad23) + (jLoad9 * jLoad22) + (jLoad10 * jLoad21) + (jLoad11 * jLoad20) + (jLoad12 * jLoad19) + (jLoad13 * jLoad18) + (jLoad17 * jLoad14);
        long j13 = (jLoad6 * jLoad26) + (jLoad7 * jLoad25) + (jLoad8 * jLoad24) + (jLoad9 * jLoad23) + (jLoad10 * jLoad22) + (jLoad11 * jLoad21) + (jLoad12 * jLoad20) + (jLoad13 * jLoad19) + (jLoad18 * jLoad14);
        long j14 = (jLoad7 * jLoad26) + (jLoad8 * jLoad25) + (jLoad9 * jLoad24) + (jLoad10 * jLoad23) + (jLoad11 * jLoad22) + (jLoad12 * jLoad21) + (jLoad13 * jLoad20) + (jLoad19 * jLoad14);
        long j15 = (jLoad8 * jLoad26) + (jLoad9 * jLoad25) + (jLoad10 * jLoad24) + (jLoad11 * jLoad23) + (jLoad12 * jLoad22) + (jLoad13 * jLoad21) + (jLoad20 * jLoad14);
        long j16 = (jLoad9 * jLoad26) + (jLoad10 * jLoad25) + (jLoad11 * jLoad24) + (jLoad12 * jLoad23) + (jLoad13 * jLoad22) + (jLoad21 * jLoad14);
        long j17 = (jLoad10 * jLoad26) + (jLoad11 * jLoad25) + (jLoad12 * jLoad24) + (jLoad13 * jLoad23) + (jLoad22 * jLoad14);
        long j18 = (jLoad11 * jLoad26) + (jLoad12 * jLoad25) + (jLoad13 * jLoad24) + (jLoad23 * jLoad14);
        long j19 = (jLoad12 * jLoad26) + (jLoad13 * jLoad25) + (jLoad24 * jLoad14);
        long j20 = (jLoad13 * jLoad26) + (jLoad25 * jLoad14);
        long j21 = jLoad14 * jLoad26;
        long j22 = (j2 + 1048576) >> 21;
        long j23 = j3 + j22;
        long j24 = j2 - (j22 << 21);
        long j25 = (j4 + 1048576) >> 21;
        long j26 = j5 + j25;
        long j27 = j4 - (j25 << 21);
        long j28 = (j6 + 1048576) >> 21;
        long j29 = j7 + j28;
        long j30 = j6 - (j28 << 21);
        long j31 = (j8 + 1048576) >> 21;
        long j32 = j9 + j31;
        long j33 = j8 - (j31 << 21);
        long j34 = (j10 + 1048576) >> 21;
        long j35 = jLoad36 + j34;
        long j36 = j10 - (j34 << 21);
        long j37 = (jLoad37 + 1048576) >> 21;
        long j38 = jLoad38 + j37;
        long j39 = jLoad37 - (j37 << 21);
        long j40 = (j11 + 1048576) >> 21;
        long j41 = j12 + j40;
        long j42 = j11 - (j40 << 21);
        long j43 = (j13 + 1048576) >> 21;
        long j44 = j14 + j43;
        long j45 = j13 - (j43 << 21);
        long j46 = (j15 + 1048576) >> 21;
        long j47 = j16 + j46;
        long j48 = j15 - (j46 << 21);
        long j49 = (j17 + 1048576) >> 21;
        long j50 = j18 + j49;
        long j51 = j17 - (j49 << 21);
        long j52 = (j19 + 1048576) >> 21;
        long j53 = j20 + j52;
        long j54 = j19 - (j52 << 21);
        long j55 = (j21 + 1048576) >> 21;
        long j56 = j55 + 0;
        long j57 = j21 - (j55 << 21);
        long j58 = (j23 + 1048576) >> 21;
        long j59 = j27 + j58;
        long j60 = j23 - (j58 << 21);
        long j61 = (j26 + 1048576) >> 21;
        long j62 = j30 + j61;
        long j63 = j26 - (j61 << 21);
        long j64 = (j29 + 1048576) >> 21;
        long j65 = j33 + j64;
        long j66 = j29 - (j64 << 21);
        long j67 = (j32 + 1048576) >> 21;
        long j68 = j36 + j67;
        long j69 = j32 - (j67 << 21);
        long j70 = (j35 + 1048576) >> 21;
        long j71 = j39 + j70;
        long j72 = j35 - (j70 << 21);
        long j73 = (j38 + 1048576) >> 21;
        long j74 = j42 + j73;
        long j75 = j38 - (j73 << 21);
        long j76 = (j41 + 1048576) >> 21;
        long j77 = j45 + j76;
        long j78 = j41 - (j76 << 21);
        long j79 = (j44 + 1048576) >> 21;
        long j80 = j48 + j79;
        long j81 = j44 - (j79 << 21);
        long j82 = (j47 + 1048576) >> 21;
        long j83 = j51 + j82;
        long j84 = j47 - (j82 << 21);
        long j85 = (j50 + 1048576) >> 21;
        long j86 = j54 + j85;
        long j87 = j50 - (j85 << 21);
        long j88 = (j53 + 1048576) >> 21;
        long j89 = j57 + j88;
        long j90 = j53 - (j88 << 21);
        long j91 = j80 - (j56 * 683901);
        long j92 = ((j77 - (j56 * 997805)) + (j89 * 136657)) - (j90 * 683901);
        long j93 = ((((j74 + (j56 * 470296)) + (j89 * 654183)) - (j90 * 997805)) + (j86 * 136657)) - (j87 * 683901);
        long j94 = j65 + (j83 * 666643);
        long j95 = j69 + (j87 * 666643) + (j83 * 470296);
        long j96 = j68 + (j86 * 666643) + (j87 * 470296) + (j83 * 654183);
        long j97 = (((j72 + (j90 * 666643)) + (j86 * 470296)) + (j87 * 654183)) - (j83 * 997805);
        long j98 = ((((j71 + (j89 * 666643)) + (j90 * 470296)) + (j86 * 654183)) - (j87 * 997805)) + (j83 * 136657);
        long j99 = (((((j75 + (j56 * 666643)) + (j89 * 470296)) + (j90 * 654183)) - (j86 * 997805)) + (j87 * 136657)) - (j83 * 683901);
        long j100 = (j94 + 1048576) >> 21;
        long j101 = j95 + j100;
        long j102 = j94 - (j100 << 21);
        long j103 = (j96 + 1048576) >> 21;
        long j104 = j97 + j103;
        long j105 = j96 - (j103 << 21);
        long j106 = (j98 + 1048576) >> 21;
        long j107 = j99 + j106;
        long j108 = j98 - (j106 << 21);
        long j109 = (j93 + 1048576) >> 21;
        long j110 = ((((j78 + (j56 * 654183)) - (j89 * 997805)) + (j90 * 136657)) - (j86 * 683901)) + j109;
        long j111 = j93 - (j109 << 21);
        long j112 = (j92 + 1048576) >> 21;
        long j113 = ((j81 + (j56 * 136657)) - (j89 * 683901)) + j112;
        long j114 = j92 - (j112 << 21);
        long j115 = (j91 + 1048576) >> 21;
        long j116 = j84 + j115;
        long j117 = j91 - (j115 << 21);
        long j118 = (j101 + 1048576) >> 21;
        long j119 = j105 + j118;
        long j120 = j101 - (j118 << 21);
        long j121 = (j104 + 1048576) >> 21;
        long j122 = j108 + j121;
        long j123 = j104 - (j121 << 21);
        long j124 = (j107 + 1048576) >> 21;
        long j125 = j111 + j124;
        long j126 = j107 - (j124 << 21);
        long j127 = (j110 + 1048576) >> 21;
        long j128 = j114 + j127;
        long j129 = j110 - (j127 << 21);
        long j130 = (j113 + 1048576) >> 21;
        long j131 = j117 + j130;
        long j132 = j113 - (j130 << 21);
        long j133 = j122 - (j116 * 683901);
        long j134 = ((j119 - (j116 * 997805)) + (j131 * 136657)) - (j132 * 683901);
        long j135 = ((((j102 + (j116 * 470296)) + (j131 * 654183)) - (j132 * 997805)) + (j128 * 136657)) - (j129 * 683901);
        long j136 = j24 + (j125 * 666643);
        long j137 = j60 + (j129 * 666643) + (j125 * 470296);
        long j138 = j59 + (j128 * 666643) + (j129 * 470296) + (j125 * 654183);
        long j139 = (((j63 + (j132 * 666643)) + (j128 * 470296)) + (j129 * 654183)) - (j125 * 997805);
        long j140 = ((((j62 + (j131 * 666643)) + (j132 * 470296)) + (j128 * 654183)) - (j129 * 997805)) + (j125 * 136657);
        long j141 = (((((j66 + (j116 * 666643)) + (j131 * 470296)) + (j132 * 654183)) - (j128 * 997805)) + (j129 * 136657)) - (j125 * 683901);
        long j142 = (j136 + 1048576) >> 21;
        long j143 = j137 + j142;
        long j144 = j136 - (j142 << 21);
        long j145 = (j138 + 1048576) >> 21;
        long j146 = j139 + j145;
        long j147 = j138 - (j145 << 21);
        long j148 = (j140 + 1048576) >> 21;
        long j149 = j141 + j148;
        long j150 = j140 - (j148 << 21);
        long j151 = (j135 + 1048576) >> 21;
        long j152 = ((((j120 + (j116 * 654183)) - (j131 * 997805)) + (j132 * 136657)) - (j128 * 683901)) + j151;
        long j153 = j135 - (j151 << 21);
        long j154 = (j134 + 1048576) >> 21;
        long j155 = ((j123 + (j116 * 136657)) - (j131 * 683901)) + j154;
        long j156 = j134 - (j154 << 21);
        long j157 = (j133 + 1048576) >> 21;
        long j158 = j126 + j157;
        long j159 = j133 - (j157 << 21);
        long j160 = (j143 + 1048576) >> 21;
        long j161 = j147 + j160;
        long j162 = j143 - (j160 << 21);
        long j163 = (j146 + 1048576) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + 1048576) >> 21;
        long j167 = j153 + j166;
        long j168 = j149 - (j166 << 21);
        long j169 = (j152 + 1048576) >> 21;
        long j170 = j156 + j169;
        long j171 = j152 - (j169 << 21);
        long j172 = (j155 + 1048576) >> 21;
        long j173 = j159 + j172;
        long j174 = j155 - (j172 << 21);
        long j175 = (1048576 + j158) >> 21;
        long j176 = 0 + j175;
        long j177 = j144 + (j176 * 666643);
        long j178 = j162 + (j176 * 470296);
        long j179 = j161 + (j176 * 654183);
        long j180 = j165 - (j176 * 997805);
        long j181 = j164 + (j176 * 136657);
        long j182 = j168 - (j176 * 683901);
        long j183 = j177 >> 21;
        long j184 = j178 + j183;
        long j185 = j177 - (j183 << 21);
        long j186 = j184 >> 21;
        long j187 = j179 + j186;
        long j188 = j184 - (j186 << 21);
        long j189 = j187 >> 21;
        long j190 = j180 + j189;
        long j191 = j187 - (j189 << 21);
        long j192 = j190 >> 21;
        long j193 = j181 + j192;
        long j194 = j190 - (j192 << 21);
        long j195 = j193 >> 21;
        long j196 = j182 + j195;
        long j197 = j193 - (j195 << 21);
        long j198 = j196 >> 21;
        long j199 = j167 + j198;
        long j200 = j196 - (j198 << 21);
        long j201 = j199 >> 21;
        long j202 = j171 + j201;
        long j203 = j199 - (j201 << 21);
        long j204 = j202 >> 21;
        long j205 = j170 + j204;
        long j206 = j202 - (j204 << 21);
        long j207 = j205 >> 21;
        long j208 = j174 + j207;
        long j209 = j205 - (j207 << 21);
        long j210 = j208 >> 21;
        long j211 = j173 + j210;
        long j212 = j208 - (j210 << 21);
        long j213 = j211 >> 21;
        long j214 = (j158 - (j175 << 21)) + j213;
        long j215 = j211 - (j213 << 21);
        long j216 = j214 >> 21;
        long j217 = 0 + j216;
        long j218 = j214 - (j216 << 21);
        long j219 = j185 + (666643 * j217);
        long j220 = j219 >> 21;
        long j221 = j188 + (470296 * j217) + j220;
        long j222 = j219 - (j220 << 21);
        long j223 = j221 >> 21;
        long j224 = j191 + (654183 * j217) + j223;
        long j225 = j221 - (j223 << 21);
        long j226 = j224 >> 21;
        long j227 = (j194 - (997805 * j217)) + j226;
        long j228 = j224 - (j226 << 21);
        long j229 = j227 >> 21;
        long j230 = j197 + (136657 * j217) + j229;
        long j231 = j227 - (j229 << 21);
        long j232 = j230 >> 21;
        long j233 = (j200 - (j217 * 683901)) + j232;
        long j234 = j230 - (j232 << 21);
        long j235 = j233 >> 21;
        long j236 = j203 + j235;
        long j237 = j233 - (j235 << 21);
        long j238 = j236 >> 21;
        long j239 = j206 + j238;
        long j240 = j236 - (j238 << 21);
        long j241 = j239 >> 21;
        long j242 = j209 + j241;
        long j243 = j239 - (j241 << 21);
        long j244 = j242 >> 21;
        long j245 = j212 + j244;
        long j246 = j242 - (j244 << 21);
        long j247 = j245 >> 21;
        long j248 = j215 + j247;
        long j249 = j245 - (j247 << 21);
        long j250 = j248 >> 21;
        long j251 = j218 + j250;
        long j252 = j248 - (j250 << 21);
        bArr[0] = (byte) j222;
        bArr[1] = (byte) (j222 >> 8);
        bArr[2] = (byte) ((j222 >> 16) | (j225 << 5));
        bArr[3] = (byte) (j225 >> 3);
        bArr[4] = (byte) (j225 >> 11);
        bArr[5] = (byte) ((j225 >> 19) | (j228 << 2));
        bArr[6] = (byte) (j228 >> 6);
        bArr[7] = (byte) ((j228 >> 14) | (j231 << 7));
        bArr[8] = (byte) (j231 >> 1);
        bArr[9] = (byte) (j231 >> 9);
        bArr[10] = (byte) ((j231 >> 17) | (j234 << 4));
        bArr[11] = (byte) (j234 >> 4);
        bArr[12] = (byte) (j234 >> 12);
        bArr[13] = (byte) ((j234 >> 20) | (j237 << 1));
        bArr[14] = (byte) (j237 >> 7);
        bArr[15] = (byte) ((j237 >> 15) | (j240 << 6));
        bArr[16] = (byte) (j240 >> 2);
        bArr[17] = (byte) (j240 >> 10);
        bArr[18] = (byte) ((j240 >> 18) | (j243 << 3));
        bArr[19] = (byte) (j243 >> 5);
        bArr[20] = (byte) (j243 >> 13);
        bArr[21] = (byte) j246;
        bArr[22] = (byte) (j246 >> 8);
        bArr[23] = (byte) ((j246 >> 16) | (j249 << 5));
        bArr[24] = (byte) (j249 >> 3);
        bArr[25] = (byte) (j249 >> 11);
        bArr[26] = (byte) ((j249 >> 19) | (j252 << 2));
        bArr[27] = (byte) (j252 >> 6);
        bArr[28] = (byte) ((j252 >> 14) | (j251 << 7));
        bArr[29] = (byte) (j251 >> 1);
        bArr[30] = (byte) (j251 >> 9);
        bArr[31] = (byte) (j251 >> 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        Field25519.square(jArr3, jArr2);
        Field25519.square(jArr4, jArr3);
        Field25519.square(jArr4, jArr4);
        Field25519.mult(jArr4, jArr2, jArr4);
        Field25519.mult(jArr3, jArr3, jArr4);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i = 1; i < 5; i++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i2 = 1; i2 < 10; i2++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i3 = 1; i3 < 20; i3++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i4 = 1; i4 < 10; i4++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i5 = 1; i5 < 50; i5++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i6 = 1; i6 < 100; i6++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i7 = 1; i7 < 50; i7++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr, jArr3, jArr2);
    }

    private static void reduce(byte[] bArr) {
        long jLoad3 = load3(bArr, 0) & 2097151;
        long jLoad4 = (load4(bArr, 2) >> 5) & 2097151;
        long jLoad5 = (load3(bArr, 5) >> 2) & 2097151;
        long jLoad6 = (load4(bArr, 7) >> 7) & 2097151;
        long jLoad7 = (load4(bArr, 10) >> 4) & 2097151;
        long jLoad8 = (load3(bArr, 13) >> 1) & 2097151;
        long jLoad9 = (load4(bArr, 15) >> 6) & 2097151;
        long jLoad10 = (load3(bArr, 18) >> 3) & 2097151;
        long jLoad11 = load3(bArr, 21) & 2097151;
        long jLoad12 = (load4(bArr, 23) >> 5) & 2097151;
        long jLoad13 = (load3(bArr, 26) >> 2) & 2097151;
        long jLoad14 = (load4(bArr, 28) >> 7) & 2097151;
        long jLoad15 = (load4(bArr, 31) >> 4) & 2097151;
        long jLoad16 = (load3(bArr, 34) >> 1) & 2097151;
        long jLoad17 = (load4(bArr, 36) >> 6) & 2097151;
        long jLoad18 = (load3(bArr, 39) >> 3) & 2097151;
        long jLoad19 = load3(bArr, 42) & 2097151;
        long jLoad20 = (load4(bArr, 44) >> 5) & 2097151;
        long jLoad21 = (load3(bArr, 47) >> 2) & 2097151;
        long jLoad22 = (load4(bArr, 49) >> 7) & 2097151;
        long jLoad23 = (load4(bArr, 52) >> 4) & 2097151;
        long jLoad24 = (load3(bArr, 55) >> 1) & 2097151;
        long jLoad25 = (load4(bArr, 57) >> 6) & 2097151;
        long jLoad26 = load4(bArr, 60) >> 3;
        long j2 = jLoad19 - (jLoad26 * 683901);
        long j3 = ((jLoad17 - (jLoad26 * 997805)) + (jLoad25 * 136657)) - (jLoad24 * 683901);
        long j4 = ((((jLoad15 + (jLoad26 * 470296)) + (jLoad25 * 654183)) - (jLoad24 * 997805)) + (jLoad23 * 136657)) - (jLoad22 * 683901);
        long j5 = jLoad9 + (jLoad21 * 666643);
        long j6 = jLoad10 + (jLoad22 * 666643) + (jLoad21 * 470296);
        long j7 = jLoad11 + (jLoad23 * 666643) + (jLoad22 * 470296) + (jLoad21 * 654183);
        long j8 = (((jLoad12 + (jLoad24 * 666643)) + (jLoad23 * 470296)) + (jLoad22 * 654183)) - (jLoad21 * 997805);
        long j9 = ((((jLoad13 + (jLoad25 * 666643)) + (jLoad24 * 470296)) + (jLoad23 * 654183)) - (jLoad22 * 997805)) + (jLoad21 * 136657);
        long j10 = (((((jLoad14 + (jLoad26 * 666643)) + (jLoad25 * 470296)) + (jLoad24 * 654183)) - (jLoad23 * 997805)) + (jLoad22 * 136657)) - (jLoad21 * 683901);
        long j11 = (j5 + 1048576) >> 21;
        long j12 = j6 + j11;
        long j13 = j5 - (j11 << 21);
        long j14 = (j7 + 1048576) >> 21;
        long j15 = j8 + j14;
        long j16 = j7 - (j14 << 21);
        long j17 = (j9 + 1048576) >> 21;
        long j18 = j10 + j17;
        long j19 = j9 - (j17 << 21);
        long j20 = (j4 + 1048576) >> 21;
        long j21 = ((((jLoad16 + (jLoad26 * 654183)) - (jLoad25 * 997805)) + (jLoad24 * 136657)) - (jLoad23 * 683901)) + j20;
        long j22 = j4 - (j20 << 21);
        long j23 = (j3 + 1048576) >> 21;
        long j24 = ((jLoad18 + (jLoad26 * 136657)) - (jLoad25 * 683901)) + j23;
        long j25 = j3 - (j23 << 21);
        long j26 = (j2 + 1048576) >> 21;
        long j27 = jLoad20 + j26;
        long j28 = j2 - (j26 << 21);
        long j29 = (j12 + 1048576) >> 21;
        long j30 = j16 + j29;
        long j31 = j12 - (j29 << 21);
        long j32 = (j15 + 1048576) >> 21;
        long j33 = j19 + j32;
        long j34 = j15 - (j32 << 21);
        long j35 = (j18 + 1048576) >> 21;
        long j36 = j22 + j35;
        long j37 = j18 - (j35 << 21);
        long j38 = (j21 + 1048576) >> 21;
        long j39 = j25 + j38;
        long j40 = j21 - (j38 << 21);
        long j41 = (j24 + 1048576) >> 21;
        long j42 = j28 + j41;
        long j43 = j24 - (j41 << 21);
        long j44 = j33 - (j27 * 683901);
        long j45 = ((j30 - (j27 * 997805)) + (j42 * 136657)) - (j43 * 683901);
        long j46 = ((((j13 + (j27 * 470296)) + (j42 * 654183)) - (j43 * 997805)) + (j39 * 136657)) - (j40 * 683901);
        long j47 = jLoad3 + (j36 * 666643);
        long j48 = jLoad4 + (j40 * 666643) + (j36 * 470296);
        long j49 = jLoad5 + (j39 * 666643) + (j40 * 470296) + (j36 * 654183);
        long j50 = (((jLoad6 + (j43 * 666643)) + (j39 * 470296)) + (j40 * 654183)) - (j36 * 997805);
        long j51 = ((((jLoad7 + (j42 * 666643)) + (j43 * 470296)) + (j39 * 654183)) - (j40 * 997805)) + (j36 * 136657);
        long j52 = (((((jLoad8 + (j27 * 666643)) + (j42 * 470296)) + (j43 * 654183)) - (j39 * 997805)) + (j40 * 136657)) - (j36 * 683901);
        long j53 = (j47 + 1048576) >> 21;
        long j54 = j48 + j53;
        long j55 = j47 - (j53 << 21);
        long j56 = (j49 + 1048576) >> 21;
        long j57 = j50 + j56;
        long j58 = j49 - (j56 << 21);
        long j59 = (j51 + 1048576) >> 21;
        long j60 = j52 + j59;
        long j61 = j51 - (j59 << 21);
        long j62 = (j46 + 1048576) >> 21;
        long j63 = ((((j31 + (j27 * 654183)) - (j42 * 997805)) + (j43 * 136657)) - (j39 * 683901)) + j62;
        long j64 = j46 - (j62 << 21);
        long j65 = (j45 + 1048576) >> 21;
        long j66 = ((j34 + (j27 * 136657)) - (j42 * 683901)) + j65;
        long j67 = j45 - (j65 << 21);
        long j68 = (j44 + 1048576) >> 21;
        long j69 = j37 + j68;
        long j70 = j44 - (j68 << 21);
        long j71 = (j54 + 1048576) >> 21;
        long j72 = j58 + j71;
        long j73 = j54 - (j71 << 21);
        long j74 = (j57 + 1048576) >> 21;
        long j75 = j61 + j74;
        long j76 = j57 - (j74 << 21);
        long j77 = (j60 + 1048576) >> 21;
        long j78 = j64 + j77;
        long j79 = j60 - (j77 << 21);
        long j80 = (j63 + 1048576) >> 21;
        long j81 = j67 + j80;
        long j82 = j63 - (j80 << 21);
        long j83 = (j66 + 1048576) >> 21;
        long j84 = j70 + j83;
        long j85 = j66 - (j83 << 21);
        long j86 = (j69 + 1048576) >> 21;
        long j87 = j86 + 0;
        long j88 = j55 + (j87 * 666643);
        long j89 = j73 + (j87 * 470296);
        long j90 = j72 + (j87 * 654183);
        long j91 = j76 - (j87 * 997805);
        long j92 = j75 + (j87 * 136657);
        long j93 = j79 - (j87 * 683901);
        long j94 = j88 >> 21;
        long j95 = j89 + j94;
        long j96 = j88 - (j94 << 21);
        long j97 = j95 >> 21;
        long j98 = j90 + j97;
        long j99 = j95 - (j97 << 21);
        long j100 = j98 >> 21;
        long j101 = j91 + j100;
        long j102 = j98 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = j92 + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j93 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j78 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j82 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = j81 + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j85 + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = j84 + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = (j69 - (j86 << 21)) + j124;
        long j126 = j122 - (j124 << 21);
        long j127 = j125 >> 21;
        long j128 = j127 + 0;
        long j129 = j125 - (j127 << 21);
        long j130 = j96 + (666643 * j128);
        long j131 = j130 >> 21;
        long j132 = j99 + (470296 * j128) + j131;
        long j133 = j130 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = j102 + (654183 * j128) + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = (j105 - (997805 * j128)) + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = j108 + (136657 * j128) + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = (j111 - (j128 * 683901)) + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = j114 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = j117 + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = j120 + j152;
        long j154 = j150 - (j152 << 21);
        long j155 = j153 >> 21;
        long j156 = j123 + j155;
        long j157 = j153 - (j155 << 21);
        long j158 = j156 >> 21;
        long j159 = j126 + j158;
        long j160 = j156 - (j158 << 21);
        long j161 = j159 >> 21;
        long j162 = j129 + j161;
        long j163 = j159 - (j161 << 21);
        bArr[0] = (byte) j133;
        bArr[1] = (byte) (j133 >> 8);
        bArr[2] = (byte) ((j133 >> 16) | (j136 << 5));
        bArr[3] = (byte) (j136 >> 3);
        bArr[4] = (byte) (j136 >> 11);
        bArr[5] = (byte) ((j136 >> 19) | (j139 << 2));
        bArr[6] = (byte) (j139 >> 6);
        bArr[7] = (byte) ((j139 >> 14) | (j142 << 7));
        bArr[8] = (byte) (j142 >> 1);
        bArr[9] = (byte) (j142 >> 9);
        bArr[10] = (byte) ((j142 >> 17) | (j145 << 4));
        bArr[11] = (byte) (j145 >> 4);
        bArr[12] = (byte) (j145 >> 12);
        bArr[13] = (byte) ((j145 >> 20) | (j148 << 1));
        bArr[14] = (byte) (j148 >> 7);
        bArr[15] = (byte) ((j148 >> 15) | (j151 << 6));
        bArr[16] = (byte) (j151 >> 2);
        bArr[17] = (byte) (j151 >> 10);
        bArr[18] = (byte) ((j151 >> 18) | (j154 << 3));
        bArr[19] = (byte) (j154 >> 5);
        bArr[20] = (byte) (j154 >> 13);
        bArr[21] = (byte) j157;
        bArr[22] = (byte) (j157 >> 8);
        bArr[23] = (byte) ((j157 >> 16) | (j160 << 5));
        bArr[24] = (byte) (j160 >> 3);
        bArr[25] = (byte) (j160 >> 11);
        bArr[26] = (byte) ((j160 >> 19) | (j163 << 2));
        bArr[27] = (byte) (j163 >> 6);
        bArr[28] = (byte) ((j163 >> 14) | (j162 << 7));
        bArr[29] = (byte) (j162 >> 1);
        bArr[30] = (byte) (j162 >> 9);
        bArr[31] = (byte) (j162 >> 17);
    }

    private static XYZ scalarMultWithBase(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr2[i3 + 0] = (byte) (((bArr[i2] & 255) >> 0) & 15);
            bArr2[i3 + 1] = (byte) (((bArr[i2] & 255) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i = 1; i < 64; i += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i / 2, bArr2[i]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i7 = 0; i7 < 64; i7 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i7 / 2, bArr2[i7]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz2 = new XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] scalarMultWithBaseToBytes(byte[] bArr) {
        return scalarMultWithBase(bArr).toBytes();
    }

    private static void select(CachedXYT cachedXYT, int i, byte b) {
        int i2 = (b & 255) >> 7;
        int i3 = b - (((-i2) & b) << 1);
        CachedXYT[][] cachedXYTArr = Ed25519Constants.B_TABLE;
        cachedXYT.copyConditional(cachedXYTArr[i][0], eq(i3, 1));
        cachedXYT.copyConditional(cachedXYTArr[i][1], eq(i3, 2));
        cachedXYT.copyConditional(cachedXYTArr[i][2], eq(i3, 3));
        cachedXYT.copyConditional(cachedXYTArr[i][3], eq(i3, 4));
        cachedXYT.copyConditional(cachedXYTArr[i][4], eq(i3, 5));
        cachedXYT.copyConditional(cachedXYTArr[i][5], eq(i3, 6));
        cachedXYT.copyConditional(cachedXYTArr[i][6], eq(i3, 7));
        cachedXYT.copyConditional(cachedXYTArr[i][7], eq(i3, 8));
        long[] jArrCopyOf = Arrays.copyOf(cachedXYT.yMinusX, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(cachedXYT.yPlusX, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(cachedXYT.t2d, 10);
        neg(jArrCopyOf3, jArrCopyOf3);
        cachedXYT.copyConditional(new CachedXYT(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }

    public static byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(MessageDigestAlgorithms.SHA_512);
        engineFactory.update(bArr3, 32, 32);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(bArrDigest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(bArrCopyOfRange2);
        engineFactory.update(bArr2);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest2 = engineFactory.digest();
        reduce(bArrDigest2);
        byte[] bArr4 = new byte[32];
        mulAdd(bArr4, bArrDigest2, bArr3, bArrDigest);
        return Bytes.concat(bArrCopyOfRange2, bArr4);
    }

    private static byte[] slide(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        if ((b << i4) + b2 > 15) {
                            if (b2 - (b << i4) < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) (b2 - (b << i4));
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) (b2 + (b << i4));
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void sub(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.xyz.x;
        XYZ xyz = xyzt.xyz;
        Field25519.sum(jArr2, xyz.y, xyz.x);
        long[] jArr3 = partialXYZT.xyz.y;
        XYZ xyz2 = xyzt.xyz;
        Field25519.sub(jArr3, xyz2.y, xyz2.x);
        long[] jArr4 = partialXYZT.xyz.y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yPlusX);
        XYZ xyz3 = partialXYZT.xyz;
        Field25519.mult(xyz3.z, xyz3.x, cachedXYT.yMinusX);
        Field25519.mult(partialXYZT.t, xyzt.t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.x, xyzt.xyz.z);
        long[] jArr5 = partialXYZT.xyz.x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.x, xyz4.z, xyz4.y);
        XYZ xyz5 = partialXYZT.xyz;
        long[] jArr6 = xyz5.y;
        Field25519.sum(jArr6, xyz5.z, jArr6);
        Field25519.sub(partialXYZT.xyz.z, jArr, partialXYZT.t);
        long[] jArr7 = partialXYZT.t;
        Field25519.sum(jArr7, jArr, jArr7);
    }

    public static boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!isSmallerThanGroupOrder(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(MessageDigestAlgorithms.SHA_512);
        engineFactory.update(bArr2, 0, 32);
        engineFactory.update(bArr3);
        engineFactory.update(bArr);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bytes = doubleScalarMultVarTime(bArrDigest, XYZT.fromBytesNegateVarTime(bArr3), bArrCopyOfRange).toBytes();
        for (int i = 0; i < 32; i++) {
            if (bytes[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
