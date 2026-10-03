package com.heytap.accessory.utils;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.heytap.accessory.logging.SdkLog;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class HexUtils {
    private static final int MAC_LENGTH = 6;
    private static final int RADIX_16 = 16;
    private static final int SHOW_LENGTH_ADDRESS = 5;
    private static final int SHOW_LENGTH_DEFAULT = 4;

    @RequiresApi(api = 26)
    public static byte[] base642Byte(String str) {
        return Base64.getDecoder().decode(str);
    }

    @RequiresApi(api = 26)
    public static String byte2Base64(byte[] bArr) {
        return Base64.getEncoder().encodeToString(bArr);
    }

    public static List<String> byteArrayToHexFragmentStr(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length != 0) {
            int i2 = 0;
            while (i2 < bArr.length) {
                arrayList.add(byteArrayToHexStr(bArr, i2, Math.min(i, bArr.length - i2)));
                i2 += i;
            }
        }
        return arrayList;
    }

    public static String byteArrayToHexStr(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return byteArrayToHexStr(bArr, 0, bArr.length);
    }

    public static String byteToHexStr(byte b) {
        return byteArrayToHexStr(new byte[]{b});
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

    public static String hide(long j) {
        return hide(String.valueOf(j), 4);
    }

    public static String hideAddress(String str) {
        return hide(str, 5);
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
            return "bundle is null.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bundle value {");
        try {
            for (String str : bundle.keySet()) {
                sb.append(str);
                sb.append(" = ");
                sb.append(bundle.get(str));
                sb.append("; ");
            }
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            SdkLog.w("bundle toString error.", e);
            return "bundle toString occurred an exception.";
        }
    }

    public static String hide(List<byte[]> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("List:[");
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            sb.append(hide(it.next()));
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String byteArrayToHexStr(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        if (i + i2 > bArr.length) {
            return "convert byte array, out of index, offset:" + i + ", length:" + i2 + ", byteLength:" + bArr.length;
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[i2 * 2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            int i5 = i3 * 2;
            cArr[i5] = charArray[i4 >>> 4];
            cArr[i5 + 1] = charArray[i4 & 15];
        }
        return new String(cArr);
    }

    public static String hide(byte[] bArr) {
        return hide(byteArrayToHexStr(bArr), 4);
    }

    public static String hide(String str) {
        return hide(str, 4);
    }

    public static String hide(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("***");
        for (int iMin = Math.min(str.length(), i); iMin > 0; iMin--) {
            sb.append(str.charAt(str.length() - iMin));
        }
        return sb.toString();
    }
}
