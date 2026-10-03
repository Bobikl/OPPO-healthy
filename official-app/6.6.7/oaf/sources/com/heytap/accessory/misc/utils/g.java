package com.heytap.accessory.misc.utils;

import android.text.TextUtils;
import com.heytap.accessory.utils.ByteUtils;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.statis.StatisticsTpForStandard;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class g {
    public static b a;

    public static class b {
        public String a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public int h;
        public String i;

        public b() {
        }
    }

    public static void a(String str, String str2) {
        if (a(str)) {
            a.i = str2;
        }
    }

    public static void b(String str, String str2) {
        b bVar = new b();
        a = bVar;
        bVar.a = str;
        System.currentTimeMillis();
        StatisticsTpForStandard.onConnectStart();
    }

    public static String c(String str) {
        return a(TextUtils.isEmpty(str) ? null : str.getBytes());
    }

    public static void d(String str) {
        if (a(str)) {
            return;
        }
        com.heytap.accessory.base.logging.a.e("StatisticsUtils", "tp statistics error, acc:" + str);
    }

    public static void e(String str) {
        if (a(str)) {
            a.e = System.currentTimeMillis();
        }
    }

    public static void f(String str) {
        if (a(str)) {
            a.b = System.currentTimeMillis();
        }
    }

    public static void g(String str) {
        if (a(str)) {
            a.f = System.currentTimeMillis();
        }
    }

    public static void h(String str) {
        if (a(str)) {
            a.c = System.currentTimeMillis();
        }
    }

    public static void a(String str, int i) {
        if (a(str)) {
            a.g = System.currentTimeMillis();
            a.h = i;
        }
    }

    public static void b(String str) {
        if (a(str)) {
            a.d = System.currentTimeMillis();
        }
    }

    public static boolean a(String str) {
        b bVar = a;
        if (bVar == null || str == null) {
            return false;
        }
        return str.equals(bVar.a);
    }

    public static String a(byte[] bArr) {
        return HexUtils.byteArrayToHexStr(a(bArr, 4)) + "(md5)";
    }

    public static byte[] a(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        if (ByteUtils.isEmpty(bArr)) {
            return ByteUtils.EMPTY_BYTES;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr, 0, bArr.length);
            byte[] bArrDigest = messageDigest.digest();
            if (ByteUtils.isEmpty(bArrDigest)) {
                return ByteUtils.EMPTY_BYTES;
            }
            return bArrDigest.length > i ? Arrays.copyOfRange(bArrDigest, 0, i) : bArrDigest;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
