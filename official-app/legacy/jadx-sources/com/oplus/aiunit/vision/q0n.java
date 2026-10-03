package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;

/* JADX INFO: loaded from: classes12.dex */
public final class q0n {
    public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', mla.SEPARATOR};
    public static final byte[] b = new byte[128];

    static {
        for (int i = 0; i < 128; i++) {
            b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            b[i3] = (byte) ((i3 - 97) + 26);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            b[i4] = (byte) ((i4 - 48) + 52);
        }
        byte[] bArr = b;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
    }

    public static String a(String str) {
        return w0n.g(g(str));
    }

    public static byte[] b(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(w0n.t("EQUVT"));
        if (keyGenerator == null) {
            return null;
        }
        keyGenerator.init(256);
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        PublicKey publicKeyW = w0n.w();
        if (publicKeyW == null) {
            return null;
        }
        byte[] bArrC = c(encoded, publicKeyW);
        byte[] bArrD = d(encoded, bArr);
        byte[] bArr2 = new byte[bArrC.length + bArrD.length];
        System.arraycopy(bArrC, 0, bArr2, 0, bArrC.length);
        System.arraycopy(bArrD, 0, bArr2, bArrC.length, bArrD.length);
        return bArr2;
    }

    public static byte[] c(byte[] bArr, Key key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(w0n.t("CUlNBL0VDQi9QS0NTMVBhZGRpbmc"));
        cipher.init(1, key);
        return cipher.doFinal(bArr);
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            return j(bArr, bArr2, w0n.u());
        } catch (Throwable th) {
            a2n.e(th, "er", "asEn");
            return null;
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, w0n.t("EQUVT"));
        Cipher cipher = Cipher.getInstance(w0n.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr2);
    }

    public static String f(byte[] bArr) {
        try {
            return k(bArr);
        } catch (Throwable th) {
            a2n.e(th, "er", "e64");
            return null;
        }
    }

    public static byte[] g(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3 = 0;
        if (str == null) {
            return new byte[0];
        }
        byte[] bArrN = w0n.n(str);
        int length = bArrN.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                b2 = b[bArrN[i3]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i3 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = b[bArrN[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (i2 != length) {
                int i4 = i2 + 1;
                byte b4 = bArrN[i2];
                if (b4 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b5 = b[b4];
                if (i4 >= length || b5 != -1) {
                    if (b5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(((b3 & 15) << 4) | ((b5 & 60) >>> 2));
                    while (i4 != length) {
                        int i5 = i4 + 1;
                        byte b6 = bArrN[i4];
                        if (b6 == 61) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byte b7 = b[b6];
                        if (i5 < length && b7 == -1) {
                            i4 = i5;
                        } else {
                            if (b7 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(b7 | ((b5 & 3) << 6));
                            i3 = i5;
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
                i2 = i4;
            }
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        return j(bArr, bArr2, bArr3);
    }

    public static String i(byte[] bArr) {
        try {
            return k(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, w0n.t("EQUVT"));
        Cipher cipher = Cipher.getInstance(w0n.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
        }
        return cipher.doFinal(bArr2);
    }

    public static String k(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                char[] cArr = a;
                stringBuffer.append(cArr[i3 >>> 2]);
                stringBuffer.append(cArr[(i3 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            if (i4 == length) {
                char[] cArr2 = a;
                stringBuffer.append(cArr2[i3 >>> 2]);
                stringBuffer.append(cArr2[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(i5 & 15) << 2]);
                stringBuffer.append(HttpUtils.EQUAL_SIGN);
                break;
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] & 255;
            char[] cArr3 = a;
            stringBuffer.append(cArr3[i3 >>> 2]);
            stringBuffer.append(cArr3[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
            stringBuffer.append(cArr3[i7 & 63]);
            i = i6;
        }
        return stringBuffer.toString();
    }
}
