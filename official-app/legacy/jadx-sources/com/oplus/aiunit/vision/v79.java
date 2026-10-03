package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.DecoderException;
import org.spongycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes11.dex */
public class v79 {
    public static final hm6 a = new w79();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new DecoderException("exception decoding Hex string: " + e2.getMessage(), e2);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new EncoderException("exception encoding Hex string: " + e2.getMessage(), e2);
        }
    }

    public static String d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i, int i2) {
        return Strings.b(c(bArr, i, i2));
    }
}
