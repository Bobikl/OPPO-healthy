package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class mif {
    public static int a(byte[] bArr) {
        try {
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
            long j2 = 0;
            for (int i = 0; i < length; i++) {
                short s = sArr[i];
                j2 += (long) (s * s);
            }
            double d = j2 / ((double) length);
            if (d <= 0.0d) {
                return 0;
            }
            return (int) (Math.log10(d) * 10.0d);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
