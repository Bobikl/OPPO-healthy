package com.heytap.accessory.pair.utils;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.common.CoreConstants;
import java.util.Base64;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class HexUtils {
    private static final int MAC_LENGTH = 6;
    private static final int RADIX_16 = 16;

    public static byte[] base642Byte(String str) {
        return Base64.getDecoder().decode(str);
    }

    public static String byte2Base64(byte[] bArr) {
        return Base64.getEncoder().encodeToString(bArr);
    }

    public static String byteArrayToHex(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0 || i < 0 || i2 <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[i2];
        SystemUtils.arraycopy(bArr, i, bArr2, 0, i2);
        StringBuilder sb = new StringBuilder(i2 * 3);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr2[i3];
            sb.append((b > 15 || b < 0) ? Integer.toHexString(bArr2[i3] & 255) + ":" : "0" + Integer.toHexString(bArr2[i3] & 255) + ":");
        }
        return sb.toString();
    }

    public static String byteArrayToHexStr(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = charArray[i2 >>> 4];
            cArr[i3 + 1] = charArray[i2 & 15];
        }
        return new String(cArr);
    }

    public static String byteToHexStr(byte b) {
        return byteArrayToHexStr(new byte[]{b});
    }

    public static int computeCrc(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            i4 = CoreConstants.CHECKSUM_TABLE[(i4 ^ bArr[i]) & 255] ^ (i4 >>> 8);
            i3++;
            i++;
        }
        return i4;
    }

    @Nullable
    public static byte[] hexStrToByteArray(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        try {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
            }
            return bArr;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String macByteToStr(byte[] bArr) {
        if (bArr == null || bArr.length != 6) {
            return null;
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[17];
        for (int i = 0; i < 6; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 3;
            cArr[i3] = charArray[i2 >>> 4];
            cArr[i3 + 1] = charArray[i2 & 15];
            if (i != 5) {
                cArr[i3 + 2] = ':';
            }
        }
        return new String(cArr);
    }

    public static byte[] macStrToByte(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains(":")) {
            return hexStrToByteArray(str.replace(":", ""));
        }
        if (str.contains(".")) {
            return hexStrToByteArray(str.replace(".", ""));
        }
        return null;
    }

    public static String toString(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bundle value {");
        for (String str : bundle.keySet()) {
            sb.append(str);
            sb.append(" = ");
            sb.append(bundle.get(str));
            sb.append("; ");
        }
        sb.append("}");
        return sb.toString();
    }
}
