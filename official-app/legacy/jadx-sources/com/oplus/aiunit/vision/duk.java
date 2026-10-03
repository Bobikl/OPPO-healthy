package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.menstrual.inter.MenstrualService;
import com.heytap.wsport.data.SleepSettingBean;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class duk {
    public static final int DEFAULT_BED_TIME = 15;
    public static final int DEFAULT_DAY_MIN_TIME = 0;
    public static final int DEFAULT_GUIDE_STAY_UP_BED_TIME = 30;
    public static final int DEFAULT_SLEEP_TIME = 0;
    public static final String VALUE_12 = "12";
    public static final String VALUE_FALSE = "0";
    public static final String VALUE_TRUE = "1";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            a = iArr;
            try {
                iArr[SportHealthSetting.STEP_GOAL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SportHealthSetting.CALORIE_GOAL_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SportHealthSetting.EXERCISE_TIME_GOAL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportHealthSetting.ACTIVITY_GOAL_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportHealthSetting.EXPERIENCE_PLAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SportHealthSetting.SEDENTARY_REMIND_ENABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SportHealthSetting.DISABLE_IN_LUNCH_BREAK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RUN_ENABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[SportHealthSetting.SPORTS_VOICE_BROADCAST_ENABLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[SportHealthSetting.SLEEP_BREATHING_RATE_ENABLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_ENABLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_ENABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[SportHealthSetting.WRIST_TEMPERATURE_ENABLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[SportHealthSetting.CONTINUE_SPORT_REMINDER_ENABLE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[SportHealthSetting.END_SPORT_REMINDER_ENABLE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_WALK_ENABLE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[SportHealthSetting.AUTO_PAUSE_SPORT_ENABLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ENABLE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[SportHealthSetting.DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_ENABLE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[SportHealthSetting.HEART_RATE_TYPE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[SportHealthSetting.SLEEP_REM_ENABLE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[SportHealthSetting.FALL_DOWN_ENABLE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[SportHealthSetting.LOW_SPO2_WARNING_ENABLE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[SportHealthSetting.AFIB_ENABLE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[SportHealthSetting.OSA_ENABLE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[SportHealthSetting.SLEEP_APNEA_MONITORING.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[SportHealthSetting.OXIMETRY.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[SportHealthSetting.BUTTON_TO_PAUSE_OR_RESUME_ENABLE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_CLIMBE_ENABLE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ROWING_ENABLE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ELLIPTICAL_ENABLE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_SWIM_ENABLE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RIDE_ENABLE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[SportHealthSetting.OXIMETRY_TYPE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[SportHealthSetting.HIGH_RATE_VALUE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[SportHealthSetting.QUIET_RATE_VALUE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                a[SportHealthSetting.QUIET_RATE_LOW_VALUE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                a[SportHealthSetting.USER_REST_NEW.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                a[SportHealthSetting.USER_REST.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                a[SportHealthSetting.SLEEP_MODEL_SETTINGS.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                a[SportHealthSetting.SPO2_WARNING_VALUE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RUN_RECORDTYPE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_WALK_RECORDTYPE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ROWING_RECORDTYPE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ELLIPTICAL_RECORDTYPE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RIDE_RECORDTYPE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_SWIM_RECORDTYPE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                a[SportHealthSetting.AUTO_RECOGNIZE_SPORT_CLIMB_RECORDTYPE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                a[SportHealthSetting.MEDITATION_BREATH_VALUE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                a[SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_VALUE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                a[SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_VALUE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                a[SportHealthSetting.BLOOD_SUGAR_TIME_VALUE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                a[SportHealthSetting.SPORTS_GOAL_VALUE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                a[SportHealthSetting.MENSTRUAL_CYCLE_ENABLE.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                a[SportHealthSetting.BED_TIME.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                a[SportHealthSetting.CLOSE_MUSIC.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                a[SportHealthSetting.BED_TIME_SWITCH.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME_SWITCH.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                a[SportHealthSetting.HAS_SHOWED_SLEEP_SETTING_GUIDE.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                a[SportHealthSetting.SILENCE_NOTIFICATIONS_DURING_NAP_SWITCH.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                a[SportHealthSetting.SLEEP_GOAL.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                a[SportHealthSetting.NAP_START_TIME.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                a[SportHealthSetting.NAP_DURATION.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
        }
    }

    public static int d(boolean z) {
        return z ? 1 : 0;
    }

    public static String e(boolean z) {
        return z ? "1" : "0";
    }

    public static String f(SportHealthSetting sportHealthSetting, String str, String str2) {
        int iU = u(str);
        int i = a.a[sportHealthSetting.ordinal()];
        if (i == 57) {
            return (iU < 80 || iU > 90) ? l(sportHealthSetting, str2) : str;
        }
        switch (i) {
            case 51:
                return (iU < 100 || iU > 220) ? l(sportHealthSetting, str2) : str;
            case 52:
                return (iU < 100 || iU > 150) ? l(sportHealthSetting, str2) : str;
            case 53:
                return (iU < 40 || iU > 50) ? l(sportHealthSetting, str2) : str;
            default:
                return str;
        }
    }

    public static int g(String str) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            int year = localDate.getYear();
            int monthValue = localDate.getMonthValue();
            int dayOfMonth = localDate.getDayOfMonth();
            LocalDate localDateNow = LocalDate.now();
            int year2 = localDateNow.getYear();
            int monthValue2 = localDateNow.getMonthValue();
            int dayOfMonth2 = localDateNow.getDayOfMonth();
            int i = year2 - year;
            if (monthValue2 <= monthValue) {
                return (monthValue2 != monthValue || dayOfMonth2 < dayOfMonth) ? i - 1 : i;
            }
            return i;
        } catch (DateTimeParseException unused) {
            a7b.b("ValueFormatUtils", "data format exception");
            return 30;
        }
    }

    public static long h() {
        return Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public static String i() {
        SleepModelSettings sleepModelSettings = new SleepModelSettings();
        sleepModelSettings.setTimestamp(h());
        sleepModelSettings.setStartNow(0);
        sleepModelSettings.setAccordRestSwitch(0);
        return s(sleepModelSettings);
    }

    public static String j() {
        SleepSettingBean.SleepRestSetting sleepRestSetting = new SleepSettingBean.SleepRestSetting();
        sleepRestSetting.setSleepRestSwitch(0);
        sleepRestSetting.setSleepRests(new ArrayList());
        return t(sleepRestSetting);
    }

    public static String k(SportHealthSetting sportHealthSetting) {
        int i = a.a[sportHealthSetting.ordinal()];
        if (i == 54) {
            return j();
        }
        if (i == 56) {
            return i();
        }
        switch (i) {
            case 71:
                return o(15);
            case 72:
                return o(30);
            case 73:
                return "1";
            case 74:
            case 75:
            case 76:
            case 77:
                return "0";
            case 78:
                return o(0);
            case 79:
                return "13:00";
            case 80:
                return UserGoalInfo.WORKOUT_GOAL_DEFAULT;
            default:
                return "";
        }
    }

    public static String l(SportHealthSetting sportHealthSetting, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("item=");
        sb.append(sportHealthSetting.name());
        sb.append(" deviceModel=");
        sb.append(str);
        switch (a.a[sportHealthSetting.ordinal()]) {
            case 1:
                return vm5.b(str).k() ? UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT : "8000";
            case 2:
                return vm5.b(str).k() ? "100" : "300";
            case 3:
                return vm5.b(str).k() ? "10" : String.valueOf(30);
            case 4:
                return vm5.b(str).k() ? "10" : "12";
            case 26:
                if (vm5.b(str).z8()) {
                    return "0";
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return "1";
            case 27:
            case 28:
            case 29:
                return ((Boolean) lc5.d(str).a(new g6d())).booleanValue() ? "0" : "1";
            case 30:
                return ((Boolean) lc5.d(str).a(new Function1() { // from class: com.oplus.aiunit.vision.ytk
                    @Override // p010kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return duk.p((DeviceModel) obj);
                    }
                })).booleanValue() ? "0" : "1";
            case 31:
                if (((Boolean) lc5.d(str).a(new Function1() { // from class: com.oplus.aiunit.vision.ztk
                    @Override // p010kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return duk.q((DeviceModel) obj);
                    }
                })).booleanValue()) {
                    return String.valueOf(1);
                }
                return ((Boolean) lc5.d(str).a(new Function1() { // from class: com.oplus.aiunit.vision.auk
                    @Override // p010kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return duk.r((DeviceModel) obj);
                    }
                })).booleanValue() ? String.valueOf(2) : String.valueOf(3);
            case 32:
                return ((Boolean) lc5.d(str).a(new rq5())).booleanValue() ? "0" : "1";
            case 33:
                return ((Boolean) lc5.d(str).a(new Function1() { // from class: com.oplus.aiunit.vision.buk
                    @Override // p010kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((DeviceModel) obj).B9());
                    }
                })).booleanValue() ? "0" : "1";
            case 49:
                if (vm5.b(str).L4()) {
                    return "1";
                }
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                return "0";
            case 50:
                return String.valueOf(1);
            case 51:
                return "190";
            case 52:
                return "120";
            case 53:
                return j70.SPORTS_TIPS_SWITCH;
            case 54:
            case 55:
                return j();
            case 56:
                return i();
            case 57:
                return "90";
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                return "1";
            case 66:
            case 67:
                return gra.SWITCH_ESIM_AC_CODE_BLACKLIST;
            case 68:
                return "22:00";
            case 69:
                return "0";
            case 70:
                return ((MenstrualService) x0.d().b("/menstrual/MenstrualService").navigation()).F0() ? "1" : "0";
            default:
                return "";
        }
    }

    public static String m(SportHealthSetting sportHealthSetting, int i) {
        int i2 = a.a[sportHealthSetting.ordinal()];
        if (i2 != 34) {
            return i2 != 51 ? "190" : String.valueOf(220 - i);
        }
        return i > 55 ? "1" : "0";
    }

    public static boolean n(int i) {
        return i == 1;
    }

    public static String o(int i) {
        return String.valueOf(i);
    }

    public static /* synthetic */ Boolean p(DeviceModel deviceModel) {
        return Boolean.valueOf(deviceModel.A9() || deviceModel.fa() || deviceModel.E9());
    }

    public static /* synthetic */ Boolean q(DeviceModel deviceModel) {
        return Boolean.valueOf(deviceModel.A9() || deviceModel.M9());
    }

    public static /* synthetic */ Boolean r(DeviceModel deviceModel) {
        return Boolean.valueOf(deviceModel.E9() || deviceModel.fa());
    }

    public static String s(SleepModelSettings sleepModelSettings) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        String json = gsonBuilder.create().toJson(sleepModelSettings);
        a7b.f("ValueFormatUtils", "modelSettingsJson: " + json);
        return json;
    }

    public static String t(SleepSettingBean.SleepRestSetting sleepRestSetting) {
        return new Gson().toJson(sleepRestSetting);
    }

    public static int u(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            a7b.b("ValueFormatUtils", "str to int error :" + str);
            return 0;
        }
    }

    public static int v(String str, SportHealthSetting sportHealthSetting, String str2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            a7b.b("ValueFormatUtils", "str to int error :" + str + " item = " + sportHealthSetting);
            return Integer.parseInt(l(sportHealthSetting, str2));
        }
    }

    public static boolean w(String str) {
        return TextUtils.equals(str, "1");
    }
}
