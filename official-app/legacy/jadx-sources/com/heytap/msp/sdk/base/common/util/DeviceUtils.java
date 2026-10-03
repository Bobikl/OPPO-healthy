package com.heytap.msp.sdk.base.common.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.msp.sdk.base.common.BrandConstant;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.oplus.smartenginehelper.ParserTag;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceUtils {
    private static final String TAG = "DeviceUtils";

    public static String getDeviceBrand() {
        return Build.BRAND;
    }

    public static String getPhoneModels() {
        String str = Build.MANUFACTURER;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String getProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            MspLog.e(TAG, "getProperty: " + e2.getMessage());
            return str2;
        }
    }

    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getVvx20ComponentXor8() {
        return Md5Util.xor8("kge&~a~g&ixxnad|mz&ik|a~a|q&[|iz|}xEifiomzIk|a~a|qZge;8");
    }

    public static String getVvx20PackageXor8() {
        return Md5Util.xor8("kge&~a~g&ixxnad|mz");
    }

    public static boolean isBrand(String str) {
        try {
            return TextUtils.equals(str, Md5Util.md5Digest(Build.BRAND.toUpperCase()));
        } catch (IOException e2) {
            MspLog.e(TAG, "isBrand: " + e2.getMessage());
            return false;
        }
    }

    public static boolean isOwnBrand() {
        try {
            String strMd5Digest = Md5Util.md5Digest(Build.BRAND.toUpperCase());
            return TextUtils.equals(BrandConstant.OWN_BRAND, strMd5Digest) || TextUtils.equals(BrandConstant.RM_BRAND, strMd5Digest) || TextUtils.equals(BrandConstant.OP_BRAND, strMd5Digest);
        } catch (IOException e2) {
            MspLog.e(TAG, "isOwnBrand: " + e2.getMessage());
            return false;
        }
    }

    public static boolean isSupport(Context context, String str) {
        MspLog.d(TAG, "isSupport:" + str);
        try {
            return (TextUtils.isEmpty(str) || context.getPackageManager().getPackageInfo(str, 0) == null) ? false : true;
        } catch (Exception e2) {
            MspLog.d(TAG, "isSupport error:" + e2.getMessage());
            return false;
        }
    }
}
