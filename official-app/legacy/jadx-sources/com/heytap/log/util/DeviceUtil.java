package com.heytap.log.util;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.wearable.support.watchface.common.Constants;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceUtil {
    private static long BOOT_TIME_INTERVAL = 600000;
    private static String BRAND_OS_VERSION = "";
    private static final String OS_VERSION_UNKNOWN = "0";
    private static final String TAG = "DeviceUtil";
    private static int mBrandOsVersion = -1;
    private static String sPhoneBrand;

    public static int getBrandOSVersion() {
        int iIntValue;
        String str;
        String str2;
        int i = mBrandOsVersion;
        if (i >= 0) {
            return i;
        }
        try {
            if (Build.VERSION.SDK_INT > 29) {
                str = "com.oplus.os.OplusBuild";
                str2 = ParserTag.TAG_GET + EraseBrandUtil.BRAND_OP1 + "VERSION";
            } else {
                str = "com." + EraseBrandUtil.BRAND_OS5 + ".os." + EraseBrandUtil.BRAND_OS6;
                str2 = ParserTag.TAG_GET + EraseBrandUtil.BRAND_OS1 + "VERSION";
            }
            iIntValue = ((Integer) ReflectHelp.invokeStatic(ReflectHelp.getClassFromName(str), str2, null, null)).intValue();
        } catch (Exception e2) {
            Log.e("DeviceUtil", "getBrandOSVersion : " + e2.toString());
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            try {
                String mobileRomVersion = getMobileRomVersion();
                if (mobileRomVersion.startsWith("V1.4")) {
                    return 3;
                }
                if (mobileRomVersion.startsWith(Constants.HeyBuildVersion.V2_0)) {
                    return 4;
                }
                if (mobileRomVersion.startsWith("V2.1")) {
                    return 5;
                }
            } catch (Exception e3) {
                Log.e("DeviceUtil", "getBrandOSVersion : " + e3.toString());
            }
        }
        mBrandOsVersion = iIntValue;
        return iIntValue;
    }

    private static String getBuildBrand() {
        return Build.BRAND;
    }

    public static String getMobileRomVersion() {
        if (isBrandO() || isBrandR()) {
            return getMobileRomVersionOld();
        }
        return isBrandP() ? BrandPBuildUtil.getVersionName() : LanConstants.OPERATOR_UNKNOWN;
    }

    public static String getMobileRomVersionOld() {
        if (TextUtils.isEmpty(BRAND_OS_VERSION)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Method method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
                String str = (String) method.invoke(cls, "ro.build.version.oplusrom", "0");
                BRAND_OS_VERSION = str;
                if (str.isEmpty() || BRAND_OS_VERSION.equals("0")) {
                    BRAND_OS_VERSION = (String) method.invoke(cls, "ro.build.version." + EraseBrandUtil.BRAND_O2 + HttpConst.ROM, "0");
                }
            } catch (Exception e2) {
                Log.e("DeviceUtil", "getMobileRomVersionOld : " + e2.toString());
            }
        }
        return BRAND_OS_VERSION;
    }

    public static String getOsVersion() {
        int brandOSVersion;
        if (isBrandO() || isBrandR()) {
            brandOSVersion = getBrandOSVersion();
        } else {
            brandOSVersion = isBrandP() ? BrandPBuildUtil.getOSVERSION() : -1;
        }
        return String.valueOf(brandOSVersion);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    public static String getPhoneBrand() {
        String subBrand;
        if (!TextUtils.isEmpty(sPhoneBrand)) {
            return sPhoneBrand;
        }
        String buildBrand = getBuildBrand();
        if (EraseBrandUtil.BRAND_O1.equalsIgnoreCase(buildBrand)) {
            subBrand = getSubBrand();
            if (!EraseBrandUtil.BRAND_R1.equalsIgnoreCase(subBrand)) {
                subBrand = buildBrand;
            }
        } else if (EraseBrandUtil.BRAND_R1.equalsIgnoreCase(buildBrand)) {
            subBrand = buildBrand;
        } else {
            subBrand = EraseBrandUtil.BRAND_P1;
            if (subBrand.equalsIgnoreCase(buildBrand)) {
                subBrand = buildBrand;
            } else {
                try {
                    if (!AppUtil.getAppContext().getPackageManager().hasSystemFeature("com." + EraseBrandUtil.BRAND_P2 + ".mobilephone")) {
                        subBrand = null;
                    }
                } catch (Throwable th) {
                    Log.e("DeviceUtil", "getPhoneBrand : " + th.toString());
                }
            }
        }
        if (!TextUtils.isEmpty(subBrand)) {
            buildBrand = subBrand;
        }
        sPhoneBrand = buildBrand;
        return buildBrand;
    }

    private static String getSubBrand() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, "ro.product.brand.sub", "");
        } catch (Exception e2) {
            Log.e("DeviceUtil", "getSubBrand : " + e2.toString());
            return "";
        }
    }

    public static boolean inBootTime() {
        return SystemClock.elapsedRealtime() < BOOT_TIME_INTERVAL;
    }

    public static boolean isBrandO() {
        return EraseBrandUtil.BRAND_O1.equalsIgnoreCase(TextUtils.isEmpty(sPhoneBrand) ? getPhoneBrand() : sPhoneBrand);
    }

    public static boolean isBrandP() {
        return EraseBrandUtil.BRAND_P1.equalsIgnoreCase(TextUtils.isEmpty(sPhoneBrand) ? getPhoneBrand() : sPhoneBrand);
    }

    public static boolean isBrandR() {
        return EraseBrandUtil.BRAND_R1.equalsIgnoreCase(TextUtils.isEmpty(sPhoneBrand) ? getPhoneBrand() : sPhoneBrand);
    }
}
