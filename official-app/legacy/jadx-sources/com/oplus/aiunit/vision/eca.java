package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public final class eca {
    public static final BigInteger a = BigInteger.valueOf(0);
    public static final BigInteger b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f10866c = BigInteger.valueOf(2);
    public static final BigInteger d = BigInteger.valueOf(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10867e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
    public static SecureRandom f = null;
    public static final int[] g = {0, 1, 0, -1, 0, -1, 0, 1};

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
