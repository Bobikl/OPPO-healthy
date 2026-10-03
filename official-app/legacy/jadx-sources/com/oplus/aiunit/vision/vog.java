package com.oplus.aiunit.vision;

import com.oplus.backup.sdk.common.utils.ModuleType;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class vog {
    public static final long[] a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i3 + i4] = jArr[i + i4] ^ jArr2[i2 + i4];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void c(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static long[] g(BigInteger bigInteger) {
        long[] jArrD = ffc.d(bigInteger);
        r(jArrD, 0);
        return jArrD;
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        i(jArr, p(jArr2), jArr3);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                c(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            gfc.H(16, jArr3, 0, 8, 0L);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                c(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5);
            }
            if (i4 > 0) {
                gfc.H(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void j(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            lea.c(jArr[i], jArr2, i << 1);
        }
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (ffc.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = ffc.a();
        long[] jArrA2 = ffc.a();
        long[] jArrA3 = ffc.a();
        t(jArr, jArrA3);
        t(jArrA3, jArrA);
        t(jArrA, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA, 2, jArrA2);
        l(jArrA, jArrA2, jArrA);
        l(jArrA, jArrA3, jArrA);
        v(jArrA, 5, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA2, 5, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA, 15, jArrA2);
        l(jArrA, jArrA2, jArrA3);
        v(jArrA3, 30, jArrA);
        v(jArrA, 30, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA, 60, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA2, 60, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA, 180, jArrA2);
        l(jArrA, jArrA2, jArrA);
        v(jArrA2, 180, jArrA2);
        l(jArrA, jArrA2, jArrA);
        l(jArrA, jArrA3, jArr2);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = ffc.b();
        h(jArr, jArr2, jArrB);
        q(jArrB, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = ffc.b();
        h(jArr, jArr2, jArrB);
        e(jArr3, jArrB, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = ffc.b();
        i(jArr, jArr2, jArrB);
        q(jArrB, jArr3);
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = ffc.b();
        i(jArr, jArr2, jArrB);
        e(jArr3, jArrB, jArr3);
    }

    public static long[] p(long[] jArr) {
        long[] jArr2 = new long[ModuleType.TYPE_CLOCK];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        while (i2 > 0) {
            int i3 = i + 18;
            gfc.E(9, jArr2, i3 >>> 1, 0L, jArr2, i3);
            r(jArr2, i3);
            a(jArr2, 9, jArr2, i3, jArr2, i3 + 9);
            i2--;
            i = i3;
        }
        gfc.I(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void q(long[] jArr, long[] jArr2) {
        long j2 = jArr[9];
        long j3 = jArr[17];
        long j4 = (((j2 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j5 = (j3 << 15) ^ (((jArr[8] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        for (int i = 16; i >= 10; i--) {
            long j6 = jArr[i];
            jArr2[i - 8] = (((j5 ^ (j6 >>> 59)) ^ (j6 >>> 57)) ^ (j6 >>> 54)) ^ (j6 >>> 49);
            j5 = (((jArr[i - 9] ^ (j6 << 5)) ^ (j6 << 7)) ^ (j6 << 10)) ^ (j6 << 15);
        }
        jArr2[1] = (((j5 ^ (j4 >>> 59)) ^ (j4 >>> 57)) ^ (j4 >>> 54)) ^ (j4 >>> 49);
        long j7 = (j4 << 15) ^ (((jArr[0] ^ (j4 << 5)) ^ (j4 << 7)) ^ (j4 << 10));
        long j8 = jArr2[8];
        long j9 = j8 >>> 59;
        jArr2[0] = (((j7 ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 10);
        jArr2[8] = 576460752303423487L & j8;
    }

    public static void r(long[] jArr, int i) {
        int i2 = i + 8;
        long j2 = jArr[i2];
        long j3 = j2 >>> 59;
        jArr[i] = ((j3 << 10) ^ (((j3 << 2) ^ j3) ^ (j3 << 5))) ^ jArr[i];
        jArr[i2] = j2 & 576460752303423487L;
    }

    public static void s(long[] jArr, long[] jArr2) {
        long[] jArrA = ffc.a();
        long[] jArrA2 = ffc.a();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jE = lea.e(jArr[i]);
            i = i3 + 1;
            long jE2 = lea.e(jArr[i3]);
            jArrA[i2] = (4294967295L & jE) | (jE2 << 32);
            jArrA2[i2] = (jE >>> 32) | ((-4294967296L) & jE2);
        }
        long jE3 = lea.e(jArr[i]);
        jArrA[4] = 4294967295L & jE3;
        jArrA2[4] = jE3 >>> 32;
        l(jArrA2, a, jArr2);
        b(jArr2, jArrA, jArr2);
    }

    public static void t(long[] jArr, long[] jArr2) {
        long[] jArrB = ffc.b();
        j(jArr, jArrB);
        q(jArrB, jArr2);
    }

    public static void u(long[] jArr, long[] jArr2) {
        long[] jArrB = ffc.b();
        j(jArr, jArrB);
        e(jArr2, jArrB, jArr2);
    }

    public static void v(long[] jArr, int i, long[] jArr2) {
        long[] jArrB = ffc.b();
        j(jArr, jArrB);
        q(jArrB, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            j(jArr2, jArrB);
            q(jArrB, jArr2);
        }
    }
}
