package com.heytap.connect.cipher;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class CryptoUtil {
    private static final String DEFAULT_CHARSET = "UTF-8";
    public static final String PASSWORD = "kb1n4FUkFict+EsP";

    private static String getDesKey() {
        byte[] bArrSwapBytes = swapBytes(getUTF8Bytes(Constants.DES_KEY));
        return bArrSwapBytes != null ? new String(bArrSwapBytes, Charset.forName("UTF-8")) : "";
    }

    public static byte[] getUTF8Bytes(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            try {
                return str.getBytes("UTF-8");
            } catch (IOException unused) {
                return new byte[0];
            }
        } catch (UnsupportedEncodingException unused2) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeUTF(str);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            dataOutputStream.close();
            int length = byteArray.length - 2;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 2, bArr, 0, length);
            return bArr;
        }
    }

    public static String parseByte2HexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return sb.toString();
    }

    public static byte[] parseHexStr2Byte(String str) {
        if (str.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }

    public static byte[] swapBytes(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
