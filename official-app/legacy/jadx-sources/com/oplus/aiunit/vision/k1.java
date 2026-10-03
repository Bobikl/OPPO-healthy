package com.oplus.aiunit.vision;

import java.io.IOException;
import java.math.BigInteger;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public class k1 extends r1 {
    public final byte[] i;

    public k1(long j2) {
        this.i = BigInteger.valueOf(j2).toByteArray();
    }

    public static k1 m(Object obj) {
        if (obj == null || (obj instanceof k1)) {
            return (k1) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (k1) r1.i((byte[]) obj);
        } catch (Exception e2) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e2.toString());
        }
    }

    public static boolean p(byte[] bArr) {
        if (bArr.length > 1) {
            byte b = bArr[0];
            if (b == 0 && (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) {
                return true;
            }
            if (b == -1 && (bArr[1] & ByteCompanionObject.MIN_VALUE) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof k1) {
            return eh0.a(this.i, ((k1) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.g(2, this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return lwi.a(this.i.length) + 1 + this.i.length;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.i;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }

    public BigInteger n() {
        return new BigInteger(1, this.i);
    }

    public BigInteger o() {
        return new BigInteger(this.i);
    }

    public String toString() {
        return o().toString();
    }

    public k1(BigInteger bigInteger) {
        this.i = bigInteger.toByteArray();
    }

    public k1(byte[] bArr, boolean z) {
        if (!wye.c("org.spongycastle.asn1.allow_unsafe_integer") && p(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.i = z ? eh0.e(bArr) : bArr;
    }
}
