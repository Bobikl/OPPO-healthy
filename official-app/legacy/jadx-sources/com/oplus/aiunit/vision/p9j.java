package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class p9j {
    public static final String ASSESSMENT_RECORD = "ASSESSMENT_RECORD";
    public static final String ATRIAL_FIBRIL_DETAIL = "ATRIAL_FIBRIL_DETAIL";
    public static final String ATRIAL_FIBRIL_WARN = "ATRIAL_FIBRIL_WARN";
    public static final int BIG_DATA_COUNT = 20;
    public static final String BLOOD_OXYGEN_DETAIL = "BLOOD_OXYGEN_DETAIL";
    public static final String BLOOD_OXYGEN_STAT = "BLOOD_OXYGEN_STAT";
    public static final String BLOOD_PRESSURE_DETAIL = "BLOOD_PRESSURE_DETAIL";
    public static final String BLOOD_PRESSURE_STAT = "BLOOD_PRESSURE_STAT";
    public static final String BLOOD_SUGAR = "BLOOD_SUGAR";
    public static final String BLOOD_SUGAR_STAT = "BLOOD_SUGAR_STAT";
    public static final String BLOOD_SUGAR_WARNING = "BLOOD_SUGAR_WARNING";
    public static final String BREATH_RATE = "BREATH_RATE";
    public static final String CERVICAL_SPINE = "CERVICAL_SPINE";
    public static final String CERVICAL_SPINE_ACTION = "CERVICAL_SPINE_ACTION";
    public static final String COURSE_STAT = "THIRD_PART_FIT_COURSE";
    public static final String DB_SP_SYNC_FILE = "DB_SP_SYNC_FILE";
    public static final String DISTURB_SLEEP_STAT = "DISTURB_SLEEP_STAT";
    public static final String ECG = "ECG";
    public static final String EXERCISE_INTENSITY = "EXERCISE_INTENSITY";
    public static final String FIT_COURSE = "FIT_COURSE";
    public static final String FIT_PLAN = "FIT_PLAN";
    public static final String HEALTH_ARCHIVE_RECORD = "HEALTH_ARCHIVE_RECORD";
    public static final String HEALTH_DISEASE_RISK = "HEALTH_DISEASE_RISK";
    public static final String HEALTH_INDICATOR_DETAIL = "HEALTH_INDICATOR_DETAIL";
    public static final String HEALTH_INDICATOR_FOCUS = "HEALTH_INDICATOR_FOCUS";
    public static final String HEALTH_INDICATOR_STAT = "HEALTH_INDICATOR_STAT";
    public static final String HEALTH_REVIEW_PLAN = "HEALTH_REVIEW_PLAN";
    public static final String HEARING_HEALTH_DETAIL = "HEARING_HEALTH_DETAIL";
    public static final String HEARING_HEALTH_STAT = "HEARING_HEALTH_STAT";
    public static final String HEART_RATE_DETAIL = "HEART_RATE_DETAIL";
    public static final String HEART_RATE_STAT = "HEART_RATE_STAT";
    public static final String HEART_RATE_WARNING = "HEART_RATE_WARNING";
    public static final String HRV_DATA = "HRV_DATA";
    public static final int MEDIUM_DATA_COUNT = 200;
    public static final String MENSTRUAL_CYCLE = "MENSTRUAL_CYCLE";
    public static final String MENSTRUAL_CYCLE_SYMPTOM = "MENSTRUAL_CYCLE_SYMPTOM";
    public static final int OLD_DATA_UPDATED_FALSE = 0;
    public static final int OLD_DATA_UPDATED_TRUE = 1;
    public static final String ONE_TIME_SPORT = "ONE_TIME_SPORT";
    public static final int ONE_TIME_SPORT_DEL_TRUE = 1;
    public static final int ONE_TIME_SPORT_DETAIL_DATA_UPDATE = 2;
    public static final String ONE_TIME_SPORT_STAT = "ONE_TIME_SPORT_STAT";
    public static final String ORIGIN_DETAIL = "ORIGIN_DETAIL";
    public static final String OSA_RESULT = "OSA_RESULT";
    public static final String OVULATION = "OVULATION";
    public static final String PHYSICAL_MENTAL = "PHYSICAL_MENTAL";
    public static final String PHYSICAL_MENTAL_ACHIEVEMENT = "PHYSICAL_MENTAL_ACHIEVEMENT";
    public static final String PHYSICAL_MENTAL_STAT = "PHYSICAL_MENTAL_STAT";
    public static final String RELAX_DETAIL = "RELAX_DETAIL";
    public static final String SEDENTARY = "SEDENTARY";
    public static final String SENSOR_OSA = "SENSOR_OSA";
    public static final long SEVEN_DAYS_TOTAL_MILLIS = 604800000;
    public static final String SLEEP_ADVICE = "SLEEP_ADVICE";
    public static final String SLEEP_DAY_STAT = "SLEEP_DAY_STAT";
    public static final String SLEEP_DETAIL = "SLEEP_DETAIL";
    public static final String SLEEP_HEART_RATE_STAT = "SLEEP_HEART_RATE_STAT";
    public static final String SLEEP_INDEX = "SLEEP_INDEX";
    public static final String SLEEP_RR_INTERVAL = "SLEEP_RR_INTERVAL";
    public static final String SLEEP_STAT = "SLEEP_STAT";
    public static final int SMALL_DATA_COUNT = 5000;
    public static final String SNORE_ENV_NOISE = "SNORE_ENV_NOISE";
    public static final String SNORE_FEATURE = "SNORE_FEATURE";
    public static final String SNORE_OSA_MODEL = "SNORE_OSA_MODEL";
    public static final String SNORE_OSA_SUM = "SNORE_OSA_SUM";
    public static final String SPO2_WARNING = "SPO2_WARNING";
    public static final String SPORT_DETAIL = "SPORT_DETAIL";
    public static final String SPORT_STAT = "SPORT_STAT";
    public static final String STRESS_DETAIL = "STRESS_DETAIL";
    public static final String STRESS_STAT = "STRESS_STAT";
    public static final String SUNSHINE_DETAIL = "SUNSHINE_DETAIL";
    public static final String SUNSHINE_STAT = "SUNSHINE_STAT";
    public static final int SYNC_FIRST_DONE = 2;
    public static final String THIRD_IMPORT_SPORT_RECORD = "THIRD_IMPORT_SPORT_RECORD";
    public static final String TUMBLE_RECORD = "TUMBLE_RECORD";
    public static final String VITAMIN = "VITAMIN";
    public static final String WRIST_TEMPERATURE = "WRIST_TEMPERATURE";
    public static final String WRIST_TEMPERATURE_STAT = "WRIST_TEMPERATURE_STAT";

    public static List<Long> a(String str, String str2) {
        List<Long> listD = sc8.d(qa2.spData.R(DB_SP_SYNC_FILE, str + "_VERSIONS:" + str2, "0"), Long.class);
        return listD != null ? listD : new ArrayList();
    }

    public static void b(String str, List<Long> list, String str2) {
        if (list == null) {
            cj4.b("SyncConstant", "versions is null");
            return;
        }
        qa2.spData.t(DB_SP_SYNC_FILE, str + "_VERSIONS:" + str2, sc8.g(list));
    }
}
