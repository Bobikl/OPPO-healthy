package com.oplus.aiunit.vision;

import com.heytap.health.settings.band.settings.sporthealthsetting.bean.SportHealthSetting;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class cuk {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            a = iArr;
            try {
                iArr[SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SportHealthSetting.AUTO_PAUSE_ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SportHealthSetting.OXIMETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNITION_SPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportHealthSetting.HEART_RATE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportHealthSetting.SEDENTARY_REMIND_ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SportHealthSetting.DISABLE_IN_LUNCH_BREAK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SportHealthSetting.EXPERIENCE_PLAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SportHealthSetting.HIGH_RATE_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SportHealthSetting.QUIET_RATE_VALUE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[SportHealthSetting.OXIMETRY_TYPE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[SportHealthSetting.CALORIE_GOAL_VALUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static String a(SportHealthSetting sportHealthSetting) {
        switch (a.a[sportHealthSetting.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "0";
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "1";
            case 11:
                return "190";
            case 12:
                return "120";
            case 13:
                return "1";
            case 14:
                return "300";
            default:
                return "";
        }
    }

    public static String b(int i) {
        return String.valueOf(i);
    }

    public static int c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            a7b.f("Band-ValueFormatUtils", "Parse setting string to int fail, string=" + str);
            return 0;
        }
    }
}
