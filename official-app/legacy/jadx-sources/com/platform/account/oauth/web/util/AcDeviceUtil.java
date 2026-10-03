package com.platform.account.oauth.web.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.aiunit.vision.alf;
import com.oplus.smartenginehelper.ParserTag;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;
import com.platform.usercenter.oauth.util.AcOauthSystemPropertyUtils;
import com.platform.usercenter.oauth.util.AcXORUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcDeviceUtil {
    private static final String CLASS_NAME_COLOR_SYS_BUILD_XOR8 = "kge&kgdgz&g{&KgdgzJ}adl";
    public static final int COLOR_OS_5_0 = 9;
    public static final int COLOR_OS_7_2 = 18;
    public static final String DEFAULT_REGION = "CN";
    private static final String METHOD_NAME_GET_OS_VERSION_XOR8 = "om|KgdgzG[^MZ[AGF";
    public static final int OPLUS_OS_12_1 = 24;
    public static final String TAG = "UCDeviceInfoUtil";
    private static final String CLASS_NAME_COLOR_SYS_BUILD_ON_RED = AcXORUtils.encrypt("kge&gxd}{&g{&Gxd}{J}adl", 8);
    private static final String METHOD_NAME_GET_OS_VERSION_ON_RED = AcXORUtils.encrypt("om|Gxd}{G[^MZ[AGF", 8);
    private static final String PROPERTY_SYSTEM_REGION_MARK_12_1 = AcXORUtils.encrypt("zg&gxd}{&xaxmdafm&zmoagf", 8);
    private static final String PROPERTY_SYSTEM_REGION_MARK_GREEN_RED = AcXORUtils.encrypt("zg&~mflgz&gxd}{&zmoagfeizc", 8);
    private static final String PROPERTY_SYSTEM_REGION_MARK_GREEN = AcXORUtils.encrypt("zg&gxxg&zmoagfeizc", 8);
    private static final String PROPERTY_SYSTEM_REGION_MARK_GREEN_OLD = AcXORUtils.encrypt("zg&gxxg&in|mz{idm&zmoagf", 8);
    private static final String PROPERTY_SYSTEM_GET_EXP_FEATURE = AcXORUtils.encrypt("gxxg&~mz{agf&mpx", 8);
    private static final String PROPERTY_SYSTEM_EXP_FEATURE = AcXORUtils.encrypt("zg&gxxg&~mz{agf", 8);
    private static volatile Method get = null;

    public static String clazzColorSysBuild() {
        return Build.VERSION.SDK_INT >= 30 ? CLASS_NAME_COLOR_SYS_BUILD_ON_RED : AcXORUtils.encrypt(CLASS_NAME_COLOR_SYS_BUILD_XOR8);
    }

    private static String getAfterSaleRegion() {
        String str = AcOauthSystemPropertyUtils.get(PROPERTY_SYSTEM_REGION_MARK_GREEN_OLD, "CN");
        return "OC".equalsIgnoreCase(str) ? "CN" : str;
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getLanguageTag(Context context) {
        String string = isExp(context) ? "en-US" : "zh-CN";
        if (getOSVersionCode() < 24) {
            String languageTag = Locale.getDefault().toLanguageTag();
            if ("id-ID".equalsIgnoreCase(languageTag)) {
                string = "in-ID";
            } else {
                Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
                string = localeForLanguageTag.getLanguage() + "-" + localeForLanguageTag.getCountry();
            }
        } else {
            if (context == null) {
                throw new NullPointerException("context is null.");
            }
            try {
                int identifier = context.getResources().getIdentifier("language_values_exam", TypedValues.Custom.S_STRING, "oplus");
                if (identifier != -1) {
                    string = context.getResources().getString(identifier);
                }
            } catch (Exception e2) {
                AcOauthLogUtil.e("UCDeviceInfoUtil", "getLanguageTag " + e2.getMessage());
            }
        }
        AcOauthLogUtil.e("UCDeviceInfoUtil", "languageTag:" + string);
        return string;
    }

    public static int getOSVersionCode() {
        try {
            Class<?> cls = Class.forName(clazzColorSysBuild());
            return ((Integer) cls.getDeclaredMethod(methodColorSysVersion(), new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getRegionMark() {
        String str = AcOauthSystemPropertyUtils.get(regionMarkGreenSystemName(), "CN");
        if (TextUtils.isEmpty(str)) {
            return getAfterSaleRegion();
        }
        return "OC".equalsIgnoreCase(str) ? "CN" : str;
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            if (get == null) {
                synchronized (AcDeviceUtil.class) {
                    if (get == null) {
                        get = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) get.invoke(null, str, str2);
        } catch (Throwable th) {
            AcOauthLogUtil.e("UCDeviceInfoUtil", "get system properties failed! exception:" + th.getMessage());
            return str2;
        }
    }

    public static boolean isExp(Context context) {
        boolean z;
        boolean z2;
        boolean zIsRedExpOs = isRedExpOs();
        int oSVersionCode = getOSVersionCode();
        if (oSVersionCode > 18) {
            z2 = !"CN".equalsIgnoreCase(getRegionMark());
            z = false;
        } else {
            z = oSVersionCode <= 9 ? alf.US.equalsIgnoreCase(getSystemProperty(PROPERTY_SYSTEM_EXP_FEATURE, "")) || zIsRedExpOs : context.getPackageManager().hasSystemFeature(PROPERTY_SYSTEM_GET_EXP_FEATURE) || zIsRedExpOs;
            z2 = false;
        }
        return zIsRedExpOs || z || z2;
    }

    public static boolean isRedExpOs() {
        return "OverSeas".equalsIgnoreCase(getSystemProperty("persist.sys.oem.region", ""));
    }

    public static String methodColorSysVersion() {
        return Build.VERSION.SDK_INT >= 30 ? METHOD_NAME_GET_OS_VERSION_ON_RED : AcXORUtils.encrypt(METHOD_NAME_GET_OS_VERSION_XOR8);
    }

    public static String regionMarkGreenSystemName() {
        if (getOSVersionCode() >= 24) {
            return PROPERTY_SYSTEM_REGION_MARK_12_1;
        }
        return Build.VERSION.SDK_INT >= 30 ? PROPERTY_SYSTEM_REGION_MARK_GREEN_RED : PROPERTY_SYSTEM_REGION_MARK_GREEN;
    }
}
