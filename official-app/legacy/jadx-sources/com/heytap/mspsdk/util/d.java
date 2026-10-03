package com.heytap.mspsdk.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.msp.sdk.base.common.BrandConstant;
import com.heytap.mspsdk.log.MspLog;
import com.oplus.smartenginehelper.ParserTag;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class d {
    public static String a() {
        String strB = b(String.valueOf(Base64.decode("cm8uYnVpbGQudmVyc2lvbi5vcHBvcm9t", 0)), "");
        return TextUtils.isEmpty(strB) ? b("ro.build.version.oplusrom", "") : strB;
    }

    public static String b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            MspLog.e("DeviceUtils", "getProperty: " + e2.getMessage());
            return str2;
        }
    }

    public static String c() {
        int i = 0;
        while (true) {
            String[] strArr = com.heytap.mspsdk.constants.a.REGION_ARRAY;
            if (i >= strArr.length) {
                return h.b("ro.boot.regionmark", "");
            }
            String strB = g.b(strArr[i]);
            if (!TextUtils.isEmpty(strB)) {
                String strB2 = h.b(strB, "");
                if (!TextUtils.isEmpty(strB2)) {
                    MspLog.d("DeviceUtils", String.format("==== getRegion:%s from %s", strB, strB2));
                    return strB2;
                }
            }
            i++;
        }
    }

    public static boolean d() {
        return TextUtils.isEmpty(a());
    }

    public static boolean e() {
        String strC = c();
        return ("CN".equalsIgnoreCase(strC) || "OC".equalsIgnoreCase(strC)) ? false : true;
    }

    public static boolean f() {
        try {
            String strC = com.heytap.mspsdk.util.md5.a.c(Build.BRAND.toUpperCase());
            return TextUtils.equals(BrandConstant.OWN_BRAND, strC) || TextUtils.equals(BrandConstant.RM_BRAND, strC) || TextUtils.equals(BrandConstant.OP_BRAND, strC);
        } catch (IOException e2) {
            MspLog.e("Md5Util", "isOwnBrand: " + e2.getMessage());
            return false;
        }
    }
}
