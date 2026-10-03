package com.xingin.xhssharesdk.a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public interface a {
        int a();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new c(bArr, 0, 0, false).c(0);
        } catch (m e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
