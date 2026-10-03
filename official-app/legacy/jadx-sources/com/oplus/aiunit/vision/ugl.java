package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class ugl {
    public static final int WATCH_V2_OTA2 = 43;

    public static boolean a(String str, int i) {
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        if (boundDeviceInfos.size() == 0) {
            return false;
        }
        for (UserDeviceInfo userDeviceInfo : boundDeviceInfos) {
            if (TextUtils.equals(userDeviceInfo.getMac(), str)) {
                return e(userDeviceInfo.getFirmwareVersion(), i);
            }
        }
        return false;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 3) {
            return -1;
        }
        try {
            return Integer.parseInt(strArrSplit[1]);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int c(String str) {
        try {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length < 4 || strArrSplit[2].length() <= 2) {
                return 0;
            }
            return Integer.parseInt(strArrSplit[2].substring(2));
        } catch (Exception e2) {
            a7b.b("WatchVersionUtil", "getDeviceVersion error=" + e2);
            return 0;
        }
    }

    public static boolean d(String str) {
        return b(str) >= 614;
    }

    public static boolean e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            a7b.b("WatchVersionUtil", "isOverThanVersion version is empty");
            return false;
        }
        try {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length >= 4 && strArrSplit[2].length() > 2) {
                int i2 = Integer.parseInt(strArrSplit[2].substring(2));
                a7b.f("WatchVersionUtil", "isSupportAutoSportRecognize:" + str + ",int:" + i2);
                if (i2 >= i) {
                    return true;
                }
            }
        } catch (Exception e2) {
            a7b.b("WatchVersionUtil", "isOverThanVersion error=" + e2);
        }
        return false;
    }

    public static boolean f(String str, String str2, int i) {
        try {
            Matcher matcher = Pattern.compile("\\w+_\\d+_(\\w+).(\\d+)_.*").matcher(str);
            if (!matcher.find()) {
                return false;
            }
            String strReplaceAll = matcher.replaceAll("$1");
            String strReplaceAll2 = matcher.replaceAll("$2");
            a7b.f("WatchVersionUtil", "isOverThanVersionAndTag:" + str + ",matcherTag:" + strReplaceAll + ",matcherVersion:" + strReplaceAll2 + ",expectTag:" + str2 + ",expectVersion:" + i);
            return Pattern.compile(str2).matcher(strReplaceAll).find() && Integer.parseInt(strReplaceAll2) >= i;
        } catch (Exception e2) {
            a7b.b("WatchVersionUtil", "isOverThanVersionAndTag error=" + e2);
            return false;
        }
    }

    public static boolean g(String str) {
        return e(str, 37);
    }

    public static boolean h(String str) {
        return e(str, 46);
    }

    public static boolean i(String str) {
        return e(str, 44);
    }
}
