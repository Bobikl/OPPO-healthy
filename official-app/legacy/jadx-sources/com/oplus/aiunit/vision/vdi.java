package com.oplus.aiunit.vision;

import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;

/* JADX INFO: loaded from: classes16.dex */
public interface vdi {
    public static final int AFib = 16;
    public static final int ASSESSMENT_RECORD = 24;
    public static final int BLOOD_SUGAR = 25;
    public static final int BLOOD_SUGAR_DEVICE = 27;
    public static final int BLOOD_SUGAR_NOTICE = 26;
    public static final int BREATHE_RATE = 20;
    public static final int DAILY_ACTIVITY = 1;
    public static final int DAILY_ACTIVITY_STATE = 34;
    public static final int ECG = 12;
    public static final int FITNESS_RECORD = 9;
    public static final int HEART_RATE = 2;
    public static final int HEART_RATE_NOTICE = 13;
    public static final int HEART_RATE_STAT = 14;
    public static final int HRV = 15;
    public static final int MENSTRUAL_CYCLE_SYMPTOMS = 30;
    public static final int PHYSICAL_MENTAL_HEALTH = 32;
    public static final int PHYSICAL_MENTAL_HEALTH_INDEX = 33;
    public static final int RELAX = 10;
    public static final int REST_HEART_RATE = 6;
    public static final int SENSOR_OSA = 22;
    public static final int SLEEP = 3;
    public static final int SLEEP_RR_INTERVAL = 31;
    public static final int SLEEP_SPO2 = 23;
    public static final int SLEEP_STATISTICS = 21;
    public static final int SPO2 = 4;
    public static final int SPO2_NOTICE = 19;
    public static final int SPORTS_RECOVERY_HR = 18;
    public static final int SPORT_RECORD = 5;
    public static final int SPORT_STAT_HIS = 11;
    public static final int SPORT_STAT_TODAY = 7;
    public static final int STRESS = 8;
    public static final int SUNLIGHT_DETAIL = 35;
    public static final int SUNLIGHT_STAT = 36;
    public static final int TUMBLE = 17;
    public static final int WRIST_TEMPERATURE = 28;
    public static final int WRIST_TEMPERATURE_INDEX = 29;

    static String a(int i) {
        switch (i) {
            case 1:
                return HeytapHealthParams.DAILY_ACTIVITY;
            case 2:
                return HeytapHealthParams.HEART_RATE;
            case 3:
                return HeytapHealthParams.SLEEP;
            case 4:
                return HeytapHealthParams.SPO2;
            case 5:
                return "SPORT_RECORD";
            case 6:
                return "REST_HEART_RATE";
            case 7:
                return p9j.SPORT_STAT;
            case 8:
                return "STRESS";
            case 9:
                return "FITNESS_RECORD";
            case 10:
                return "RELAX";
            case 11:
                return "DAILY_ACTIVITY_STAT";
            case 12:
                return "ECG";
            case 13:
                return "HEART_RATE_NOTICE";
            case 14:
                return p9j.HEART_RATE_STAT;
            case 15:
                return "HRV";
            case 16:
                return "AFib";
            case 17:
                return "TUMBLE";
            case 18:
                return "RECOVERY_HR";
            case 19:
                return "SPO2_NOTICE";
            case 20:
                return "BREATHE_RATE";
            case 21:
                return "SLEEP_STATISTICS";
            case 22:
                return p9j.SENSOR_OSA;
            case 23:
                return "SLEEP_SPO2";
            case 24:
                return p9j.ASSESSMENT_RECORD;
            case 25:
                return p9j.BLOOD_SUGAR;
            case 26:
                return "BLOOD_SUGAR_NOTICE";
            case 27:
                return "BLOOD_SUGAR_DEVICE";
            case 28:
                return p9j.WRIST_TEMPERATURE;
            case 29:
                return "WRIST_TEMPERATURE_INDEX";
            case 30:
                return "MENSTRUAL_CYCLE_SYMPTOMS";
            case 31:
                return p9j.SLEEP_RR_INTERVAL;
            case 32:
                return "PHYSICAL_MENTAL_HEALTH";
            case 33:
                return "PHYSICAL_MENTAL_HEALTH_INDEX";
            case 34:
                return "DAILY_ACTIVITY_STATE";
            case 35:
                return "SUNLIGHT_DETAIL";
            case 36:
                return "SUNLIGHT_STAT";
            default:
                return LanConstants.OPERATOR_UNKNOWN;
        }
    }
}
