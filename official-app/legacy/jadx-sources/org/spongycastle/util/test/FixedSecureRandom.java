package org.spongycastle.util.test;

import com.oplus.aiunit.vision.h2e;
import com.oplus.aiunit.vision.v79;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public class FixedSecureRandom extends SecureRandom {
    private static final boolean isAndroidStyle;
    private static final boolean isClasspathStyle;
    private static final boolean isRegularStyle;
    private byte[] _data;
    private int _index;
    private static BigInteger REGULAR = new BigInteger("01020304ffffffff0506070811111111", 16);
    private static BigInteger ANDROID = new BigInteger("1111111105060708ffffffff01020304", 16);
    private static BigInteger CLASSPATH = new BigInteger("3020104ffffffff05060708111111", 16);

    public static class DummyProvider extends Provider {
        public DummyProvider() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class RandomChecker extends SecureRandom {
        byte[] data;
        int index;

        public RandomChecker() {
            super(null, new DummyProvider());
            this.data = v79.a("01020304ffffffff0506070811111111");
            this.index = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void nextBytes(byte[] bArr) {
            System.arraycopy(this.data, this.index, bArr, 0, bArr.length);
            this.index += bArr.length;
        }
    }

    public static class a extends c {
        public a(byte[] bArr) {
            super(bArr);
        }

        public a(int i, byte[] bArr) {
            super(FixedSecureRandom.expandToBitLength(i, bArr));
        }
    }

    public static class b extends c {
        public b(byte[] bArr) {
            super(bArr);
        }
    }

    public static class c {
        public byte[] a;

        public c(byte[] bArr) {
            this.a = bArr;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(128, new RandomChecker());
        BigInteger bigInteger2 = new BigInteger(120, new RandomChecker());
        isAndroidStyle = bigInteger.equals(ANDROID);
        isRegularStyle = bigInteger.equals(REGULAR);
        isClasspathStyle = bigInteger2.equals(CLASSPATH);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new c[]{new b(bArr)});
    }

    private static b[] buildDataArray(byte[][] bArr) {
        b[] bVarArr = new b[bArr.length];
        for (int i = 0; i != bArr.length; i++) {
            bVarArr[i] = new b(bArr[i]);
        }
        return bVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] expandToBitLength(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4 = (i + 7) / 8;
        if (i4 <= bArr.length) {
            if (isAndroidStyle && i < bArr.length * 8 && (i2 = i % 8) != 0) {
                h2e.c(h2e.a(bArr, 0) << (8 - i2), bArr, 0);
            }
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, i4 - bArr.length, bArr.length);
        if (isAndroidStyle && (i3 = i % 8) != 0) {
            h2e.c(h2e.a(bArr2, 0) << (8 - i3), bArr2, 0);
        }
        return bArr2;
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i = this._index;
        this._index = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        return nextValue() | (nextValue() << 24) | 0 | (nextValue() << 16) | (nextValue() << 8);
    }

    @Override // java.util.Random
    public long nextLong() {
        return (((long) nextValue()) << 56) | 0 | (((long) nextValue()) << 48) | (((long) nextValue()) << 40) | (((long) nextValue()) << 32) | (((long) nextValue()) << 24) | (((long) nextValue()) << 16) | (((long) nextValue()) << 8) | ((long) nextValue());
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(buildDataArray(bArr));
    }

    public FixedSecureRandom(c[] cVarArr) {
        super(null, new DummyProvider());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        if (isRegularStyle) {
            if (isClasspathStyle) {
                while (i != cVarArr.length) {
                    try {
                        c cVar = cVarArr[i];
                        if (cVar instanceof a) {
                            byte[] bArr = cVar.a;
                            int length = bArr.length - (bArr.length % 4);
                            for (int length2 = (bArr.length - length) - 1; length2 >= 0; length2--) {
                                byteArrayOutputStream.write(bArr[length2]);
                            }
                            for (int length3 = bArr.length - length; length3 < bArr.length; length3 += 4) {
                                byteArrayOutputStream.write(bArr, length3, 4);
                            }
                        } else {
                            byteArrayOutputStream.write(cVar.a);
                        }
                        i++;
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("can't save value source.");
                    }
                }
            } else {
                while (i != cVarArr.length) {
                    try {
                        byteArrayOutputStream.write(cVarArr[i].a);
                        i++;
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("can't save value source.");
                    }
                }
            }
        } else if (isAndroidStyle) {
            for (int i2 = 0; i2 != cVarArr.length; i2++) {
                try {
                    c cVar2 = cVarArr[i2];
                    if (cVar2 instanceof a) {
                        byte[] bArr2 = cVar2.a;
                        int length4 = bArr2.length - (bArr2.length % 4);
                        int i3 = 0;
                        while (i3 < length4) {
                            i3 += 4;
                            byteArrayOutputStream.write(bArr2, bArr2.length - i3, 4);
                        }
                        if (bArr2.length - length4 != 0) {
                            for (int i4 = 0; i4 != 4 - (bArr2.length - length4); i4++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i5 = 0; i5 != bArr2.length - length4; i5++) {
                            byteArrayOutputStream.write(bArr2[length4 + i5]);
                        }
                    } else {
                        byteArrayOutputStream.write(cVar2.a);
                    }
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            throw new IllegalStateException("Unrecognized BigInteger implementation");
        }
        this._data = byteArrayOutputStream.toByteArray();
    }
}
