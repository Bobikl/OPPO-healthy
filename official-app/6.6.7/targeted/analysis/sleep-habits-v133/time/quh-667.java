package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class quh {
    public static final int DEFAULT_BED_TIME = 15;
    public static final int DEFAULT_HIGHER_MINUTE = 2;
    public static final int DEFAULT_LOWER_MINUTE = 1;
    public static final int DEFAULT_MAX_MINUTE = 3;
    public static final int DEFAULT_MIN_MINUTE = 0;
    public static final int DEFAULT_SLEEP_GOAL_TIME = 2048;
    public static final int DEFAULT_SLEEP_TIME = 0;
    public static final int DEFAULT_STAY_UP_BED_TIME = 0;
    public static final int MAX_SLEEP_GOAL_TIME = 5632;
    public static final int MIN_STAY_UP_BED_TIME_TIME = 0;
    public static final String SLEEP_SETTING_CHANNEL_ID = "SleepSettingChannelId";
    public static final int VALUE_0 = 0;
    public static final int VALUE_1 = 1;
    public static final String VALUE_FALSE = "0";
    public static final String VALUE_ONE_STRING = "1";
    public static final String VALUE_TRUE = "1";
    public static final String VALUE_ZERO_STRING = "0";

    public static int a(int i) {
        return (i >> 8) & cd1.a.TYPE_MANUFACTURER_DATA;
    }

    public static int b(int i) {
        return i & cd1.a.TYPE_MANUFACTURER_DATA;
    }

    public static int c(int i, int i2) {
        return (i << 8) | i2;
    }

    public static boolean d(int i) {
        return i == 1;
    }

    public static String e(int i) {
        return String.valueOf(i);
    }

    public static boolean f(String str) {
        return "1".equals(str);
    }

    public static int g(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            m8b.b("SleepTimeUtils", "str to int error :" + str);
            return 0;
        }
    }

    public static int h(int i) {
        return (a(i) * 60) + b(i);
    }
}