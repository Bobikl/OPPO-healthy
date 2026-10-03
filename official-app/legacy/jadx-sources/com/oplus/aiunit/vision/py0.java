package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import org.spongycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes11.dex */
public class py0 {
    public static final hm6 a = new ry0();

    public static byte[] a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 + 2) / 3) * 4);
        try {
            a.a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new EncoderException("exception encoding base64 string: " + e2.getMessage(), e2);
        }
    }
}
