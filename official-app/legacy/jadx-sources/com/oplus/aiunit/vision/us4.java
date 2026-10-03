package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes18.dex */
public class us4 {
    public static short a(byte b, byte b2) {
        return (short) (((b & 255) << 8) | (b2 & 255));
    }

    public static byte[] b(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    public static short[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        short[] sArr = new short[bArr.length / 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        return sArr;
    }
}
