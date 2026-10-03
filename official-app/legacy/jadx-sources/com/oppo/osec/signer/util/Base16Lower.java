package com.oppo.osec.signer.util;

import com.oplus.aiunit.vision.ny0;

/* JADX INFO: loaded from: classes9.dex */
public enum Base16Lower {
    ;

    private static final ny0 codec = new ny0(false);

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        return codec.a(bArr, CodecUtils.sanitize(str, bArr));
    }

    public static byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : codec.b(bArr);
    }

    public static String encodeAsString(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.toStringDirect(codec.b(bArr));
    }

    public static byte[] decode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : codec.a(bArr, bArr.length);
    }
}
