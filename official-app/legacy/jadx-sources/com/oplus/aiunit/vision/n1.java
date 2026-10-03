package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public class n1 extends r1 {
    public static final ConcurrentMap<a, n1> k = new ConcurrentHashMap();
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f14287j;

    public static class a {
        public final int a;
        public final byte[] b;

        public a(byte[] bArr) {
            this.a = eh0.p(bArr);
            this.b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return eh0.a(this.b, ((a) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public n1(byte[] bArr) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigIntegerShiftLeft = null;
        int i2 = 0;
        long j2 = 0;
        while (i2 != bArr.length) {
            int i3 = bArr[i2] & 255;
            if (j2 <= 72057594037927808L) {
                i = i2;
                long j3 = j2 + ((long) (i3 & 127));
                if ((i3 & 128) == 0) {
                    if (z) {
                        if (j3 < 40) {
                            stringBuffer.append('0');
                        } else if (j3 < 80) {
                            stringBuffer.append('1');
                            j3 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j3 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j3);
                    j2 = 0;
                } else {
                    j2 = j3 << 7;
                }
            } else {
                i = i2;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j2) : bigIntegerShiftLeft).or(BigInteger.valueOf(i3 & 127));
                if ((i3 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j2 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            i2 = i + 1;
        }
        this.i = stringBuffer.toString();
        this.f14287j = eh0.e(bArr);
    }

    public static n1 o(byte[] bArr) {
        n1 n1Var = k.get(new a(bArr));
        return n1Var == null ? new n1(bArr) : n1Var;
    }

    public static n1 r(y1 y1Var, boolean z) {
        r1 r1VarN = y1Var.n();
        return (z || (r1VarN instanceof n1)) ? s(r1VarN) : o(o1.n(y1Var.n()).o());
    }

    public static n1 s(Object obj) {
        if (obj == null || (obj instanceof n1)) {
            return (n1) obj;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (f1Var.c() instanceof n1) {
                return (n1) f1Var.c();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (n1) r1.i((byte[]) obj);
        } catch (IOException e2) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e2.getMessage());
        }
    }

    public static boolean u(String str, int i) {
        boolean z;
        char cCharAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    public static boolean v(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return u(str, 2);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var == this) {
            return true;
        }
        if (r1Var instanceof n1) {
            return this.i.equals(((n1) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        byte[] bArrP = p();
        q1Var.c(6);
        q1Var.i(bArrP.length);
        q1Var.d(bArrP);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        int length = p().length;
        return lwi.a(length) + 1 + length;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return this.i.hashCode();
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }

    public n1 m(String str) {
        return new n1(this, str);
    }

    public final void n(ByteArrayOutputStream byteArrayOutputStream) {
        q1d q1dVar = new q1d(this.i);
        int i = Integer.parseInt(q1dVar.b()) * 40;
        String strB = q1dVar.b();
        if (strB.length() <= 18) {
            w(byteArrayOutputStream, ((long) i) + Long.parseLong(strB));
        } else {
            x(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i)));
        }
        while (q1dVar.a()) {
            String strB2 = q1dVar.b();
            if (strB2.length() <= 18) {
                w(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                x(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
    }

    public final synchronized byte[] p() {
        if (this.f14287j == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            n(byteArrayOutputStream);
            this.f14287j = byteArrayOutputStream.toByteArray();
        }
        return this.f14287j;
    }

    public String q() {
        return this.i;
    }

    public n1 t() {
        a aVar = new a(p());
        ConcurrentMap<a, n1> concurrentMap = k;
        n1 n1Var = concurrentMap.get(aVar);
        if (n1Var != null) {
            return n1Var;
        }
        n1 n1VarPutIfAbsent = concurrentMap.putIfAbsent(aVar, this);
        return n1VarPutIfAbsent == null ? this : n1VarPutIfAbsent;
    }

    public String toString() {
        return q();
    }

    public final void w(ByteArrayOutputStream byteArrayOutputStream, long j2) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j2) & 127);
        while (j2 >= 128) {
            j2 >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j2) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public final void x(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public n1(String str) {
        if (str != null) {
            if (v(str)) {
                this.i = str;
                return;
            }
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public n1(n1 n1Var, String str) {
        if (u(str, 0)) {
            this.i = n1Var.q() + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }
}
