package com.heytap.accessory.pair.logging;

import android.text.TextUtils;
import com.heytap.accessory.logging.CommonLog;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.MD5Utils;
import com.oplus.aiunit.vision.veb;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SensitiveLogUtils {
    private static final String DEBUG_DEFAULT_MSG = "DEBUG NOT PRINT.";
    private static final int LENGTH_MAX_MD5 = 4;
    private static final String SUFFIX_MD5 = "(md5)";

    private static boolean checkLevel(int i) {
        return i >= 4 || CommonLog.isDevelopMode();
    }

    private static String md5(String str) {
        return md5(TextUtils.isEmpty(str) ? null : str.getBytes());
    }

    private static String toHidden(byte[] bArr) {
        return toHidden(HexUtils.byteArrayToHexStr(bArr));
    }

    public static String toHiddenIfNeed(long j) {
        return toHiddenIfNeed(j, 3);
    }

    public static String toMd5IfNeed(byte[] bArr) {
        return toMd5IfNeed(bArr, 3);
    }

    private static String md5(byte[] bArr) {
        return HexUtils.byteArrayToHexStr(MD5Utils.md5(bArr, 4)) + SUFFIX_MD5;
    }

    private static String toHidden(long j) {
        return toHidden(String.valueOf(j));
    }

    public static String toHiddenIfNeed(long j, int i) {
        return !checkLevel(i) ? DEBUG_DEFAULT_MSG : toHidden(j);
    }

    public static String toMd5IfNeed(byte[] bArr, int i) {
        return !checkLevel(i) ? DEBUG_DEFAULT_MSG : md5(bArr);
    }

    public static String toHidden(List<byte[]> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("List:[");
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            sb.append(toHidden(it.next()));
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toHiddenIfNeed(byte[] bArr) {
        return toHiddenIfNeed(bArr, 3);
    }

    public static String toMd5IfNeed(String str) {
        return toMd5IfNeed(str, 3);
    }

    public static String toHiddenIfNeed(byte[] bArr, int i) {
        return !checkLevel(i) ? DEBUG_DEFAULT_MSG : toHidden(bArr);
    }

    public static String toMd5IfNeed(String str, int i) {
        return !checkLevel(i) ? DEBUG_DEFAULT_MSG : md5(str);
    }

    public static String toHiddenIfNeed(List<byte[]> list) {
        return toHiddenIfNeed(list, 3);
    }

    public static String toHiddenIfNeed(List<byte[]> list, int i) {
        return !checkLevel(i) ? DEBUG_DEFAULT_MSG : toHidden(list);
    }

    private static String toHidden(String str) {
        int length;
        if (TextUtils.isEmpty(str) || (length = str.length()) == 1) {
            return str;
        }
        if (length <= 8) {
            StringBuilder sb = new StringBuilder();
            int i = length - (length / 2);
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 < i) {
                    sb.append("*");
                } else {
                    sb.append(str.charAt(i2));
                }
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("*(");
        int i3 = length - 4;
        sb2.append(i3);
        sb2.append(")");
        StringBuilder sb3 = new StringBuilder(sb2.toString());
        while (i3 < length) {
            sb3.append(str.charAt(i3));
            i3++;
        }
        return sb3.toString();
    }

    public static String toHiddenIfNeed(String str) {
        return toHiddenIfNeed(str, 3);
    }

    public static String toHiddenIfNeed(String str, int i) {
        return veb.a(str);
    }
}
