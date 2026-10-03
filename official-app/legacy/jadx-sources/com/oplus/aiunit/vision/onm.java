package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes12.dex */
public class onm {
    public static String a(byte[] bArr) {
        return String.format("%032x", new BigInteger(1, bArr));
    }
}
