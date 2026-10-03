package com.platform.usercenter.tools.os;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.platform.usercenter.basic.provider.UCSystemInfoXor8Provider;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;

/* JADX INFO: loaded from: classes9.dex */
public class UCOSVersionUtil {
    public static final int COLOR_OS_1_0 = 1;
    public static final int COLOR_OS_1_2 = 2;
    public static final int COLOR_OS_1_4 = 3;
    public static final int COLOR_OS_2_0 = 4;
    public static final int COLOR_OS_2_1 = 5;
    public static final int COLOR_OS_3_0 = 6;
    public static final int COLOR_OS_3_1 = 7;
    public static final int COLOR_OS_3_2 = 8;
    public static final int COLOR_OS_5_0 = 9;
    public static final int COLOR_OS_5_1 = 10;
    public static final int COLOR_OS_5_2 = 11;
    public static final int COLOR_OS_6_0 = 12;
    public static final int COLOR_OS_6_1 = 13;
    public static final int COLOR_OS_6_2 = 14;
    public static final int COLOR_OS_6_7 = 15;
    public static final int COLOR_OS_7_0 = 16;
    public static final int COLOR_OS_7_1 = 17;
    public static final int COLOR_OS_7_2 = 18;
    public static final String DEFAULT_NULL = "";
    public static final String DEFAULT_REGION = "CN";
    public static final int OplusOS_11_0 = 19;
    public static final int OplusOS_11_1 = 20;
    public static final int OplusOS_11_2 = 21;
    public static final int OplusOS_11_3 = 22;
    public static final int OplusOS_12_0 = 23;
    public static final int OplusOS_12_1 = 24;
    public static final int OplusOS_12_2 = 25;
    public static final int OplusOS_13_0_0 = 26;
    public static final int OplusOS_13_1_0 = 27;
    public static final int OplusOS_13_1_1 = 28;
    public static final int OplusOS_13_2_0 = 29;
    public static final int OplusOS_14_0_0 = 30;
    public static final int OplusOS_14_0_1 = 31;
    public static final int OplusOS_14_0_2 = 32;
    public static final int OplusOS_14_1_0 = 33;
    public static final int OplusOS_1_0 = 1;
    public static final int OplusOS_1_2 = 2;
    public static final int OplusOS_1_4 = 3;
    public static final int OplusOS_2_0 = 4;
    public static final int OplusOS_2_1 = 5;
    public static final int OplusOS_3_0 = 6;
    public static final int OplusOS_3_1 = 7;
    public static final int OplusOS_3_2 = 8;
    public static final int OplusOS_5_0 = 9;
    public static final int OplusOS_5_1 = 10;
    public static final int OplusOS_5_2 = 11;
    public static final int OplusOS_6_0 = 12;
    public static final int OplusOS_6_1 = 13;
    public static final int OplusOS_6_2 = 14;
    public static final int OplusOS_6_7 = 15;
    public static final int OplusOS_7_0 = 16;
    public static final int OplusOS_7_1 = 17;
    public static final int OplusOS_7_2 = 18;
    public static final int UNKNOWN = 0;

    private UCOSVersionUtil() {
    }

    public static String getCurRegion() {
        return UCDeviceInfoUtil.getCurRegion();
    }

    public static String getDeviceName(Context context) {
        try {
            Class<?> cls = Class.forName(UCSystemInfoXor8Provider.clazzColorSysBuild());
            return (String) cls.getDeclaredMethod("getDeviceName", new Class[0]).invoke(cls, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getOSVersionCode() {
        try {
            Class<?> cls = Class.forName(UCSystemInfoXor8Provider.clazzColorSysBuild());
            return ((Integer) cls.getDeclaredMethod(UCSystemInfoXor8Provider.methodColorSysVersion(), new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getOsVersion() {
        String str = SystemPropertyUtils.get(UCSystemInfoXor8Provider.romVersionPropertyOPlusSystemName(), "");
        return "".equals(str) ? SystemPropertyUtils.get(UCSystemInfoXor8Provider.romVersionPropertySystemName(), "") : str;
    }

    public static String getRomBuildDisplay() {
        String str = SystemPropertyUtils.get("ro.build.time.fix", "");
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get("sys.build.display.full_id", "");
        }
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        return TextUtils.isEmpty(str) ? Build.DISPLAY : str;
    }

    public static boolean isOnOs12() {
        return getOSVersionCode() >= 23;
    }
}
