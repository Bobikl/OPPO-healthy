package com.heytap.health.core.provider.auth;

import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.xvj;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class AuthorityScopeType {
    public static final List<String> AUTH_LIST;
    private static final String READ = "READ";
    private static final String READ_AUDITION_DATA = "READ_AUDITION_DATA";
    private static final String READ_BLOOD_OXYGEN_DATA = "READ_BLOOD_OXYGEN_DATA";
    private static final String READ_BLOOD_PRESSURE_DATA = "READ_BLOOD_PRESSURE_DATA";
    private static final String READ_BODY_WEIGHT_DATA = "READ_BODY_WEIGHT_DATA";
    private static final String READ_DAILY_ACTIVITY = "READ_DAILY_ACTIVITY";
    private static final String READ_DEVICE_DATA = "READ_DEVICE_DATA";
    private static final String READ_ECG = "READ_CARDIOGRAM_DATA";
    private static final String READ_HEART_RATE = "READ_HEART_RATE";
    private static final String READ_PHYSIOLOGICAL_DATA = "READ_PHYSIOLOGICAL_DATA";
    private static final String READ_PRESSURE = "READ_PRESSURE";
    private static final String READ_PROFILE = "READ_PROFILE";
    private static final String READ_RELAX_DATA = "READ_RELAX_DATA";
    private static final String READ_SLEEP_DATA = "READ_SLEEP_DATA";
    private static final String READ_SPORT_METADATA_DATA = "READ_SPORT_METADATA_DATA";
    private static final String READ_SPORT_RECORD = "READ_SPORT_RECORD";
    private static final String TAG = "AuthorityScopeType";
    private static final String WRITE = "WRITE";
    private static final String WRITE_PHYSIOLOGICAL_DATA = "WRITE_PHYSIOLOGICAL_DATA";
    private static final String WRITE_SPORT_METADATA_DATA = "WRITE_SPORT_METADATA_DATA";
    private static final Map<String, String> map;

    static {
        HashMap map2 = new HashMap();
        map = map2;
        AUTH_LIST = Arrays.asList(READ_PROFILE, READ_DEVICE_DATA, READ_DAILY_ACTIVITY, READ_SPORT_RECORD, READ_HEART_RATE, READ_SLEEP_DATA, READ_ECG, READ_BLOOD_OXYGEN_DATA, READ_PRESSURE, READ_AUDITION_DATA, READ_RELAX_DATA, READ_BLOOD_PRESSURE_DATA, READ_BODY_WEIGHT_DATA, READ_SPORT_METADATA_DATA, WRITE_SPORT_METADATA_DATA, READ_PHYSIOLOGICAL_DATA, WRITE_PHYSIOLOGICAL_DATA);
        map2.put("1001READ", READ_DAILY_ACTIVITY);
        map2.put("1002READ", READ_DAILY_ACTIVITY);
        map2.put("1003READ", READ_SPORT_RECORD);
        map2.put("1005READ", READ_SPORT_RECORD);
        map2.put("1008READ", READ_HEART_RATE);
        map2.put("1009READ", READ_HEART_RATE);
        map2.put("1010READ", READ_SLEEP_DATA);
        map2.put("1011READ", READ_SLEEP_DATA);
        map2.put("1012READ", READ_ECG);
        map2.put("1014READ", READ_BLOOD_OXYGEN_DATA);
        map2.put("1015READ", READ_BLOOD_OXYGEN_DATA);
        map2.put("1017READ", READ_PRESSURE);
        map2.put("1018READ", READ_PRESSURE);
        map2.put("1038READ", READ_AUDITION_DATA);
        map2.put("1039READ", READ_AUDITION_DATA);
        map2.put("1024READ", READ_RELAX_DATA);
        map2.put("1025READ", READ_RELAX_DATA);
        map2.put("1036READ", READ_BLOOD_PRESSURE_DATA);
        map2.put("1037READ", READ_BLOOD_PRESSURE_DATA);
        map2.put("1021READ", READ_BODY_WEIGHT_DATA);
        map2.put("1004READ", READ_SPORT_METADATA_DATA);
        map2.put("1004WRITE", WRITE_SPORT_METADATA_DATA);
        map2.put("1061READ", READ_PHYSIOLOGICAL_DATA);
        map2.put("1062READ", READ_PHYSIOLOGICAL_DATA);
        map2.put("1061WRITE", WRITE_PHYSIOLOGICAL_DATA);
        map2.put("1062WRITE", WRITE_PHYSIOLOGICAL_DATA);
        map2.put(READ_PROFILE, READ_PROFILE);
        map2.put(READ_DEVICE_DATA, READ_DEVICE_DATA);
    }

    public static boolean authorityCheck(String str) {
        if (new xvj(b78.a()).a(map.get(str))) {
            return true;
        }
        a7b.b(TAG, "permission check fail");
        return false;
    }

    public static String getREAD() {
        return "READ";
    }

    public static String getReadAuditionData() {
        return READ_AUDITION_DATA;
    }

    public static String getReadBloodOxygenData() {
        return READ_BLOOD_OXYGEN_DATA;
    }

    public static String getReadBloodPressureData() {
        return READ_BLOOD_PRESSURE_DATA;
    }

    public static String getReadBodyWeightData() {
        return READ_BODY_WEIGHT_DATA;
    }

    public static String getReadDailyActivity() {
        return READ_DAILY_ACTIVITY;
    }

    public static String getReadDeviceData() {
        return READ_DEVICE_DATA;
    }

    public static String getReadEcg() {
        return READ_ECG;
    }

    public static String getReadHeartRate() {
        return READ_HEART_RATE;
    }

    public static String getReadPhysiological() {
        return READ_PHYSIOLOGICAL_DATA;
    }

    public static String getReadPressure() {
        return READ_PRESSURE;
    }

    public static String getReadProfile() {
        return READ_PROFILE;
    }

    public static String getReadRelaxData() {
        return READ_RELAX_DATA;
    }

    public static String getReadSleepData() {
        return READ_SLEEP_DATA;
    }

    public static String getReadSportRecord() {
        return READ_SPORT_RECORD;
    }

    public static String getScope(String str) {
        return map.get(str);
    }

    public static String getWRITE() {
        return "WRITE";
    }

    public static String getWritePhysiological() {
        return WRITE_PHYSIOLOGICAL_DATA;
    }
}
