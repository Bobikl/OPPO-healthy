package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class t18 {
    public final BigInteger a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f16844c;
    public final BigInteger d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger f16845e;
    public final BigInteger f;
    public final BigInteger g;
    public final BigInteger h;
    public final int i;

    public t18(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, com.alipay.sdk.m.x.c.d);
        this.a = bigInteger;
        this.b = bigInteger2;
        this.f16844c = bigIntegerArr[0];
        this.d = bigIntegerArr[1];
        this.f16845e = bigIntegerArr2[0];
        this.f = bigIntegerArr2[1];
        this.g = bigInteger3;
        this.h = bigInteger4;
        this.i = i;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public BigInteger b() {
        return this.a;
    }

    public int c() {
        return this.i;
    }

    public BigInteger d() {
        return this.g;
    }

    public BigInteger e() {
        return this.h;
    }

    public BigInteger f() {
        return this.f16844c;
    }

    public BigInteger g() {
        return this.d;
    }

    public BigInteger h() {
        return this.f16845e;
    }

    public BigInteger i() {
        return this.f;
    }
}
