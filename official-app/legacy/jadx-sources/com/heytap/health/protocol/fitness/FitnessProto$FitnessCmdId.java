package com.heytap.health.protocol.fitness;

import com.garmin.fit.e;
import com.garmin.fit.i;
import com.google.protobuf.Internal;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.yo3;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProto$FitnessCmdId implements Internal.EnumLite {
    FITNESS_CMD_PLACE_HOLDER(0),
    CMD_DAILY_ACTIVITY(9),
    CMD_DAILY_ACTIVITY_DETAIL(10),
    CMD_HR(11),
    CMD_HR_DETAIL(12),
    CMD_REST_HR(17),
    CMD_REST_HR_DETAIL(18),
    CMD_SLEEP(13),
    CMD_SLEEP_DETAIL(14),
    CMD_ECG(15),
    CMD_ECG_DETAIL(16),
    CMD_DAILY_TOTAL_RECORD(21),
    CMD_SPO2(23),
    CMD_SPO2_DETAIL(24),
    CMD_SPO2_MANUAL_DATA_SYNC(25),
    CMD_SLEEP_STATE_CHANGE(32),
    CMD_STRESS(34),
    CMD_STRESS_DETAIL(35),
    CMD_DEVICE_PULL_ACTIVITY_DATA(39),
    CMD_DEVICE_PUSH_HEALTH_NOTICE_DATA(40),
    CMD_APP_PUSH_HEALTH_NOTICE_TO_DEVICE(41),
    CMD_APP_PUSH_FAMILY_MEMBER_INFO_TO_DEVICE(42),
    CMD_DEVICE_PULL_FAMILY_MEMBER_INFO(43),
    CMD_HR_NOTICE(46),
    CMD_HR_NOTICE_DETAIL(47),
    CMD_SCREEN_DATA(48),
    CMD_SCREEN_DATA_DETAIL(49),
    CMD_WEAR_SPORT_HEALTH_CONFIG(50),
    CMD_SLEEP_REM_ENABLE(51),
    CMD_SYNC_CALORIES_TO_WEAR(52),
    CMD_SYNC_HEART_RATE_STAT(53),
    CMD_DAILY_TOTAL_RECORD_LIST(54),
    CMD_SYNC_WEIGHT_TARGET_TO_WEAR(55),
    CMD_SYNC_WEIGHT_TARGET_FROM_WEAR(56),
    CMD_HRV(57),
    CMD_HRV_DETAIL(58),
    CMD_AFIB_SWITCH(59),
    CMD_AFIB_DATA(60),
    CMD_AFIB_DATA_DETAIL(61),
    CMD_RECORD_AUDIO_SWITCH(62),
    CMD_FALL_DOWN_SWITCH(63),
    CMD_WEAR_RECORD_UPLOAD(64),
    CMD_DEVICE_HEALTH_DATA_CHANGED_NOTIFY(65),
    CMD_DEVICE_GET_USER_WEIGHT_DATA(66),
    CMD_FALL_DATA(67),
    CMD_FALL_DATA_DETAIL(68),
    CMD_SEND_OSA_RESULT(69),
    CMD_SEND_SLEEP_FIX_DATA(70),
    CMD_READ_SPORT_HEALTH_SETTING(71),
    CMD_REMIND_POP_UP(72),
    CMD_GET_DEVICES_SLEEP_MODEL_SETTING(73),
    CMD_SEND_SLEEP_MODE_SETTING_TO_DEVICES(74),
    CMD_SLEEP_USER_REST_LIST(75),
    CMD_SLEEP_SETTING_CLOSE_MUSIC(76),
    CMD_BED_TIME_REMINDER(77),
    CMD_STAY_UP_BED_TIME_REMINDER(78),
    CMD_DEVICE_REPORT_SLEEP_MODEL(79),
    CMD_GET_DEVICES_SLEEP_MODEL_SETTING_ACK(80),
    CMD_SLEEP_GOAL(81),
    CMD_SPO2_NOTICE(82),
    CMD_SPO2_NOTICE_DETAIL(83),
    CMD_SPO2_V2(84),
    CMD_SPO2_V2_DETAIL(85),
    CMD_SLEEP_SPO2_V2(86),
    CMD_SLEEP_SPO2_V2_DETAIL(87),
    CMD_RESUME_ACTIVITY_REMINDER(88),
    CMD_OSA(89),
    CMD_BREATHE_RATE(90),
    CMD_SPO2_ALL_DAY_MONITOR(91),
    CMD_SPO2_LOW_WARNING_SWITCH(92),
    CMD_SPORTS_VOICE_BROADCAST(93),
    CMD_BUTTON_TO_PAUSE_OR_RESUME(94),
    CMD_SLEEP_SCORE(95),
    CMD_BREATHE_RATE_DATA(96),
    CMD_BREATHE_RATE_DATA_DETAIL(97),
    CMD_SLEEP_STATISTICS_DATA(98),
    CMD_SLEEP_STATISTICS_DATA_DETAIL(99),
    CMD_SENSOR_OSA_DATA(100),
    CMD_SENSOR_OSA_DATA_DETAIL(101),
    CMD_AUTO_RECOGNIZE_SPORT_TYPE_SWITCH(102),
    CMD_STRESS_CALIBRATION(103),
    CMD_SLEEP_CALIBRATION_DATA(104),
    CMD_ASSESSMENT_RECORD(105),
    CMD_ASSESSMENT_RECORD_DETAIL(106),
    CMD_ECG_ACTIVE_STATE(107),
    CMD_SEND_CARDIOVASCULAR_PREPARE_STATE(108),
    CMD_CARDIOVASCULAR_PREPARE_REMIND(109),
    CMD_EXERCISE_TIME_GOAL(110),
    CMD_ACTIVITY_GOAL(111),
    CMD_DOUBLE_CLICK_SCREEN_VOICE_BROADCAST(112),
    CMD_BLOOD_SUGAR_DATA(114),
    CMD_BLOOD_SUGAR_DATA_DETAIL(115),
    CMD_BLOOD_SUGAR_NOTICE_DATA(116),
    CMD_BLOOD_SUGAR_NOTICE_DATA_DETAIL(117),
    CMD_BLOOD_SUGAR_SETTING(118),
    CMD_BLOOD_SUGAR_DEVICE_STATE(119),
    CMD_WRIST_TEMPERATURE_DATA(120),
    CMD_WRIST_TEMPERATURE_DATA_DETAIL(121),
    CMD_WRIST_TEMPERATURE_INDEX_DATA(122),
    CMD_WRIST_TEMPERATURE_INDEX_DATA_DETAIL(123),
    CMD_WRIST_TEMPERATURE_STATE(124),
    CMD_WRIST_TEMPERATURE_MONITOR(127),
    CMD_SCIENCE_INFO(113),
    CMD_MENSTRUAL_REMIND_SWITCH_SEND(125),
    CMD_MENSTRUAL_SETTING_SEND(126),
    CMD_MENSTRUAL_SYMPTOM_MODIFIED_TIME_SYNC(128),
    CMD_MENSTRUAL_CYCLE_ASK(129),
    CMD_MENSTRUAL_CYCLE_SEND(130),
    CMD_MENSTRUAL_SYMPTOM_SELECTED_SEND(133),
    CMD_MENSTRUAL_SYMPTOM_RANGE_REQUEST(134),
    CMD_MENSTRUAL_SYMPTOM_MODIFIED_ASK(131),
    CMD_MENSTRUAL_SYMPTOM_MODIFIED_SEND(132),
    CMD_INSIGHT_DATA_SEND(135),
    CMD_DAILY_ACTIVITY_STATISTICS(139),
    CMD_SYNC_ACCOUNT_BODY_INFO(161),
    CMD_SYNC_PROJECT_JOIN_STATE(162),
    CMD_SLEEP_RR_INTERVAL_DATA(163),
    CMD_SLEEP_RR_INTERVAL_DATA_DETAIL(164),
    CMD_PHONE_STATE_TO_DEVICE(165),
    CMD_OSA_RESULT_WEEK_REQUEST(200),
    CMD_OSA_RESULT_WEEK(201),
    CMD_SNORE_ACTIVE_STATE_TO_DEVICE(202),
    CMD_SNORE_ACTIVE_STATE_FROM_DEVICE(203),
    CMD_ECG_BIG_CORE(166),
    CMD_ECG_BIG_CORE_DETAIL(167),
    CMD_BLOOD_SUGAR_DATA_BIG_CORE_DETAIL(168),
    CMD_BLOOD_SUGAR_NOTICE_DATA_BIG_CORE_DETAIL(169),
    CMD_BLOOD_SUGAR_DEVICE_STATE_BIG_CORE(170),
    CMD_RELAX_DATA_BIG_CORE_DETAIL(171),
    CMD_MCU_STEP_GOAL(172),
    CMD_MCU_CALORIE_GOAL(173),
    CMD_MCU_EXERCISE_TIME_GOAL(174),
    CMD_MCU_ACTIVITY_GOAL(175),
    CMD_MCU_SEDENTARY_REMIND(176),
    CMD_MCU_RESUME_ACTIVITY_REMINDER(177),
    CMD_MCU_ACTIVITY_NOTIFY_STATE(178),
    CMD_MCU_FALL_DOWN(179),
    CMD_MCU_HR_AUTO_MEASURE(180),
    CMD_MCU_QUITE_HR_WARN(181),
    CMD_MCU_SPROT_HR_WARN(182),
    CMD_MCU_AFIB(183),
    CMD_MCU_STRESS_AUTO_MEASURE(184),
    CMD_MCU_STRESS_HIGH_NOTIFY(185),
    CMD_MCU_SPO2_ALL_DAY_MONITOR(186),
    CMD_MCU_SPO2_LOW_WARNING(187),
    CMD_MCU_OSA(188),
    CMD_MCU_BREATHE_RATE(CMD_MCU_BREATHE_RATE_VALUE),
    CMD_MCU_SLEEP_REM(190),
    CMD_MCU_AUTO_PAUSE_SPORT(CMD_MCU_AUTO_PAUSE_SPORT_VALUE),
    CMD_MCU_AUTO_RECOGNIZE_SPORT(192),
    CMD_MCU_AUTO_RECOGNIZE_SPORT_TYPE(193),
    CMD_MCU_SPORTS_VOICE_BROADCAST(194),
    CMD_MCU_DOUBLE_CLICK_VOICE_BROADCAST(195),
    CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME(CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE),
    CMD_MCU_READ_SPORT_HEALTH_SETTING(197),
    CMD_PHYSICAL_MENTAL_HEALTH_DATA(198),
    CMD_PHYSICAL_MENTAL_HEALTH_INDEX_DATA(199),
    CMD_MCU_GET_DEVICES_SLEEP_MODEL_SETTING(204),
    CMD_MCU_SEND_SLEEP_MODE_SETTING_TO_DEVICES(205),
    CMD_MCU_SLEEP_USER_REST_LIST(206),
    CMD_MCU_SLEEP_SETTING_CLOSE_MUSIC(207),
    CMD_MCU_BED_TIME_REMINDER(208),
    CMD_MCU_DEVICE_REPORT_SLEEP_MODEL(209),
    CMD_MCU_SLEEP_GOAL(210),
    CMD_MCU_SPORT_GOAL(216),
    CMD_MCU_MEDITATION_BREATHING_GOAL(217),
    CMD_MCU_DAILY_ACTIVITY_STATE(218),
    CMD_MCU_DAILY_ACTIVITY_STATE_TO_DEVICE(219),
    CMD_DEVICE_OPEN_PAGE(220),
    CMD_MCU_ACHIEVEMENT_REMINDER_SETTING(221),
    CMD_MCU_SEND_LEGAL_HOLIDAY_TO_DEVICE(222),
    CMD_MCU_SYNC_FALL_DATA(223),
    CMD_SYNC_CLOUD_STATUS_TO_DEVICE(225),
    CMD_AUTO_SPORT_STATUS_TO_DEVICE(226),
    CMD_REMIND_CONFIG_READ(227),
    CMD_REMIND_CONFIG_SET(228),
    CMD_DATA_NEWEST_TIMESTAMP_READ(229),
    CMD_SYNC_180DAYS_WTT_TO_DEVICE(230),
    CMD_MENSTRUAL_PERIOD_DATA(233),
    CMD_SEND_BLOOD_PRESSURE_TO_DEVICE(234),
    HRV_SKIP_TODAY(235),
    CMD_SUNLIGHT_DETAIL(CMD_SUNLIGHT_DETAIL_VALUE),
    CMD_SUNLIGHT_STAT(CMD_SUNLIGHT_STAT_VALUE),
    HRV_SKIP_TODAY_DEV(246),
    HRV_SKIP_TODAY_DEV_RESULT(247),
    CMD_RELAX_DATA_MCU_DETAIL(249),
    CMD_MENSTRUAL_SETTINGS_DATA(248),
    CMD_SEND_GEO_FENCE_TO_DEVICE(255),
    UNRECOGNIZED(-1);

    public static final int CMD_ACTIVITY_GOAL_VALUE = 111;
    public static final int CMD_AFIB_DATA_DETAIL_VALUE = 61;
    public static final int CMD_AFIB_DATA_VALUE = 60;
    public static final int CMD_AFIB_SWITCH_VALUE = 59;
    public static final int CMD_APP_PUSH_FAMILY_MEMBER_INFO_TO_DEVICE_VALUE = 42;
    public static final int CMD_APP_PUSH_HEALTH_NOTICE_TO_DEVICE_VALUE = 41;
    public static final int CMD_ASSESSMENT_RECORD_DETAIL_VALUE = 106;
    public static final int CMD_ASSESSMENT_RECORD_VALUE = 105;
    public static final int CMD_AUTO_RECOGNIZE_SPORT_TYPE_SWITCH_VALUE = 102;
    public static final int CMD_AUTO_SPORT_STATUS_TO_DEVICE_VALUE = 226;
    public static final int CMD_BED_TIME_REMINDER_VALUE = 77;
    public static final int CMD_BLOOD_SUGAR_DATA_BIG_CORE_DETAIL_VALUE = 168;
    public static final int CMD_BLOOD_SUGAR_DATA_DETAIL_VALUE = 115;
    public static final int CMD_BLOOD_SUGAR_DATA_VALUE = 114;
    public static final int CMD_BLOOD_SUGAR_DEVICE_STATE_BIG_CORE_VALUE = 170;
    public static final int CMD_BLOOD_SUGAR_DEVICE_STATE_VALUE = 119;
    public static final int CMD_BLOOD_SUGAR_NOTICE_DATA_BIG_CORE_DETAIL_VALUE = 169;
    public static final int CMD_BLOOD_SUGAR_NOTICE_DATA_DETAIL_VALUE = 117;
    public static final int CMD_BLOOD_SUGAR_NOTICE_DATA_VALUE = 116;
    public static final int CMD_BLOOD_SUGAR_SETTING_VALUE = 118;
    public static final int CMD_BREATHE_RATE_DATA_DETAIL_VALUE = 97;
    public static final int CMD_BREATHE_RATE_DATA_VALUE = 96;
    public static final int CMD_BREATHE_RATE_VALUE = 90;
    public static final int CMD_BUTTON_TO_PAUSE_OR_RESUME_VALUE = 94;
    public static final int CMD_CARDIOVASCULAR_PREPARE_REMIND_VALUE = 109;
    public static final int CMD_DAILY_ACTIVITY_DETAIL_VALUE = 10;
    public static final int CMD_DAILY_ACTIVITY_STATISTICS_VALUE = 139;
    public static final int CMD_DAILY_ACTIVITY_VALUE = 9;
    public static final int CMD_DAILY_TOTAL_RECORD_LIST_VALUE = 54;
    public static final int CMD_DAILY_TOTAL_RECORD_VALUE = 21;
    public static final int CMD_DATA_NEWEST_TIMESTAMP_READ_VALUE = 229;
    public static final int CMD_DEVICE_GET_USER_WEIGHT_DATA_VALUE = 66;
    public static final int CMD_DEVICE_HEALTH_DATA_CHANGED_NOTIFY_VALUE = 65;
    public static final int CMD_DEVICE_OPEN_PAGE_VALUE = 220;
    public static final int CMD_DEVICE_PULL_ACTIVITY_DATA_VALUE = 39;
    public static final int CMD_DEVICE_PULL_FAMILY_MEMBER_INFO_VALUE = 43;
    public static final int CMD_DEVICE_PUSH_HEALTH_NOTICE_DATA_VALUE = 40;
    public static final int CMD_DEVICE_REPORT_SLEEP_MODEL_VALUE = 79;
    public static final int CMD_DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_VALUE = 112;
    public static final int CMD_ECG_ACTIVE_STATE_VALUE = 107;
    public static final int CMD_ECG_BIG_CORE_DETAIL_VALUE = 167;
    public static final int CMD_ECG_BIG_CORE_VALUE = 166;
    public static final int CMD_ECG_DETAIL_VALUE = 16;
    public static final int CMD_ECG_VALUE = 15;
    public static final int CMD_EXERCISE_TIME_GOAL_VALUE = 110;
    public static final int CMD_FALL_DATA_DETAIL_VALUE = 68;
    public static final int CMD_FALL_DATA_VALUE = 67;
    public static final int CMD_FALL_DOWN_SWITCH_VALUE = 63;
    public static final int CMD_GET_DEVICES_SLEEP_MODEL_SETTING_ACK_VALUE = 80;
    public static final int CMD_GET_DEVICES_SLEEP_MODEL_SETTING_VALUE = 73;
    public static final int CMD_HRV_DETAIL_VALUE = 58;
    public static final int CMD_HRV_VALUE = 57;
    public static final int CMD_HR_DETAIL_VALUE = 12;
    public static final int CMD_HR_NOTICE_DETAIL_VALUE = 47;
    public static final int CMD_HR_NOTICE_VALUE = 46;
    public static final int CMD_HR_VALUE = 11;
    public static final int CMD_INSIGHT_DATA_SEND_VALUE = 135;
    public static final int CMD_MCU_ACHIEVEMENT_REMINDER_SETTING_VALUE = 221;
    public static final int CMD_MCU_ACTIVITY_GOAL_VALUE = 175;
    public static final int CMD_MCU_ACTIVITY_NOTIFY_STATE_VALUE = 178;
    public static final int CMD_MCU_AFIB_VALUE = 183;
    public static final int CMD_MCU_AUTO_PAUSE_SPORT_VALUE = 191;
    public static final int CMD_MCU_AUTO_RECOGNIZE_SPORT_TYPE_VALUE = 193;
    public static final int CMD_MCU_AUTO_RECOGNIZE_SPORT_VALUE = 192;
    public static final int CMD_MCU_BED_TIME_REMINDER_VALUE = 208;
    public static final int CMD_MCU_BREATHE_RATE_VALUE = 189;
    public static final int CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE = 196;
    public static final int CMD_MCU_CALORIE_GOAL_VALUE = 173;
    public static final int CMD_MCU_DAILY_ACTIVITY_STATE_TO_DEVICE_VALUE = 219;
    public static final int CMD_MCU_DAILY_ACTIVITY_STATE_VALUE = 218;
    public static final int CMD_MCU_DEVICE_REPORT_SLEEP_MODEL_VALUE = 209;
    public static final int CMD_MCU_DOUBLE_CLICK_VOICE_BROADCAST_VALUE = 195;
    public static final int CMD_MCU_EXERCISE_TIME_GOAL_VALUE = 174;
    public static final int CMD_MCU_FALL_DOWN_VALUE = 179;
    public static final int CMD_MCU_GET_DEVICES_SLEEP_MODEL_SETTING_VALUE = 204;
    public static final int CMD_MCU_HR_AUTO_MEASURE_VALUE = 180;
    public static final int CMD_MCU_MEDITATION_BREATHING_GOAL_VALUE = 217;
    public static final int CMD_MCU_OSA_VALUE = 188;
    public static final int CMD_MCU_QUITE_HR_WARN_VALUE = 181;
    public static final int CMD_MCU_READ_SPORT_HEALTH_SETTING_VALUE = 197;
    public static final int CMD_MCU_RESUME_ACTIVITY_REMINDER_VALUE = 177;
    public static final int CMD_MCU_SEDENTARY_REMIND_VALUE = 176;
    public static final int CMD_MCU_SEND_LEGAL_HOLIDAY_TO_DEVICE_VALUE = 222;
    public static final int CMD_MCU_SEND_SLEEP_MODE_SETTING_TO_DEVICES_VALUE = 205;
    public static final int CMD_MCU_SLEEP_GOAL_VALUE = 210;
    public static final int CMD_MCU_SLEEP_REM_VALUE = 190;
    public static final int CMD_MCU_SLEEP_SETTING_CLOSE_MUSIC_VALUE = 207;
    public static final int CMD_MCU_SLEEP_USER_REST_LIST_VALUE = 206;
    public static final int CMD_MCU_SPO2_ALL_DAY_MONITOR_VALUE = 186;
    public static final int CMD_MCU_SPO2_LOW_WARNING_VALUE = 187;
    public static final int CMD_MCU_SPORTS_VOICE_BROADCAST_VALUE = 194;
    public static final int CMD_MCU_SPORT_GOAL_VALUE = 216;
    public static final int CMD_MCU_SPROT_HR_WARN_VALUE = 182;
    public static final int CMD_MCU_STEP_GOAL_VALUE = 172;
    public static final int CMD_MCU_STRESS_AUTO_MEASURE_VALUE = 184;
    public static final int CMD_MCU_STRESS_HIGH_NOTIFY_VALUE = 185;
    public static final int CMD_MCU_SYNC_FALL_DATA_VALUE = 223;
    public static final int CMD_MENSTRUAL_CYCLE_ASK_VALUE = 129;
    public static final int CMD_MENSTRUAL_CYCLE_SEND_VALUE = 130;
    public static final int CMD_MENSTRUAL_PERIOD_DATA_VALUE = 233;
    public static final int CMD_MENSTRUAL_REMIND_SWITCH_SEND_VALUE = 125;
    public static final int CMD_MENSTRUAL_SETTINGS_DATA_VALUE = 248;
    public static final int CMD_MENSTRUAL_SETTING_SEND_VALUE = 126;
    public static final int CMD_MENSTRUAL_SYMPTOM_MODIFIED_ASK_VALUE = 131;
    public static final int CMD_MENSTRUAL_SYMPTOM_MODIFIED_SEND_VALUE = 132;
    public static final int CMD_MENSTRUAL_SYMPTOM_MODIFIED_TIME_SYNC_VALUE = 128;
    public static final int CMD_MENSTRUAL_SYMPTOM_RANGE_REQUEST_VALUE = 134;
    public static final int CMD_MENSTRUAL_SYMPTOM_SELECTED_SEND_VALUE = 133;
    public static final int CMD_OSA_RESULT_WEEK_REQUEST_VALUE = 200;
    public static final int CMD_OSA_RESULT_WEEK_VALUE = 201;
    public static final int CMD_OSA_VALUE = 89;
    public static final int CMD_PHONE_STATE_TO_DEVICE_VALUE = 165;
    public static final int CMD_PHYSICAL_MENTAL_HEALTH_DATA_VALUE = 198;
    public static final int CMD_PHYSICAL_MENTAL_HEALTH_INDEX_DATA_VALUE = 199;
    public static final int CMD_READ_SPORT_HEALTH_SETTING_VALUE = 71;
    public static final int CMD_RECORD_AUDIO_SWITCH_VALUE = 62;
    public static final int CMD_RELAX_DATA_BIG_CORE_DETAIL_VALUE = 171;
    public static final int CMD_RELAX_DATA_MCU_DETAIL_VALUE = 249;
    public static final int CMD_REMIND_CONFIG_READ_VALUE = 227;
    public static final int CMD_REMIND_CONFIG_SET_VALUE = 228;
    public static final int CMD_REMIND_POP_UP_VALUE = 72;
    public static final int CMD_REST_HR_DETAIL_VALUE = 18;
    public static final int CMD_REST_HR_VALUE = 17;
    public static final int CMD_RESUME_ACTIVITY_REMINDER_VALUE = 88;
    public static final int CMD_SCIENCE_INFO_VALUE = 113;
    public static final int CMD_SCREEN_DATA_DETAIL_VALUE = 49;
    public static final int CMD_SCREEN_DATA_VALUE = 48;
    public static final int CMD_SEND_BLOOD_PRESSURE_TO_DEVICE_VALUE = 234;
    public static final int CMD_SEND_CARDIOVASCULAR_PREPARE_STATE_VALUE = 108;
    public static final int CMD_SEND_GEO_FENCE_TO_DEVICE_VALUE = 255;
    public static final int CMD_SEND_OSA_RESULT_VALUE = 69;
    public static final int CMD_SEND_SLEEP_FIX_DATA_VALUE = 70;
    public static final int CMD_SEND_SLEEP_MODE_SETTING_TO_DEVICES_VALUE = 74;
    public static final int CMD_SENSOR_OSA_DATA_DETAIL_VALUE = 101;
    public static final int CMD_SENSOR_OSA_DATA_VALUE = 100;
    public static final int CMD_SLEEP_CALIBRATION_DATA_VALUE = 104;
    public static final int CMD_SLEEP_DETAIL_VALUE = 14;
    public static final int CMD_SLEEP_GOAL_VALUE = 81;
    public static final int CMD_SLEEP_REM_ENABLE_VALUE = 51;
    public static final int CMD_SLEEP_RR_INTERVAL_DATA_DETAIL_VALUE = 164;
    public static final int CMD_SLEEP_RR_INTERVAL_DATA_VALUE = 163;
    public static final int CMD_SLEEP_SCORE_VALUE = 95;
    public static final int CMD_SLEEP_SETTING_CLOSE_MUSIC_VALUE = 76;
    public static final int CMD_SLEEP_SPO2_V2_DETAIL_VALUE = 87;
    public static final int CMD_SLEEP_SPO2_V2_VALUE = 86;
    public static final int CMD_SLEEP_STATE_CHANGE_VALUE = 32;
    public static final int CMD_SLEEP_STATISTICS_DATA_DETAIL_VALUE = 99;
    public static final int CMD_SLEEP_STATISTICS_DATA_VALUE = 98;
    public static final int CMD_SLEEP_USER_REST_LIST_VALUE = 75;
    public static final int CMD_SLEEP_VALUE = 13;
    public static final int CMD_SNORE_ACTIVE_STATE_FROM_DEVICE_VALUE = 203;
    public static final int CMD_SNORE_ACTIVE_STATE_TO_DEVICE_VALUE = 202;
    public static final int CMD_SPO2_ALL_DAY_MONITOR_VALUE = 91;
    public static final int CMD_SPO2_DETAIL_VALUE = 24;
    public static final int CMD_SPO2_LOW_WARNING_SWITCH_VALUE = 92;
    public static final int CMD_SPO2_MANUAL_DATA_SYNC_VALUE = 25;
    public static final int CMD_SPO2_NOTICE_DETAIL_VALUE = 83;
    public static final int CMD_SPO2_NOTICE_VALUE = 82;
    public static final int CMD_SPO2_V2_DETAIL_VALUE = 85;
    public static final int CMD_SPO2_V2_VALUE = 84;
    public static final int CMD_SPO2_VALUE = 23;
    public static final int CMD_SPORTS_VOICE_BROADCAST_VALUE = 93;
    public static final int CMD_STAY_UP_BED_TIME_REMINDER_VALUE = 78;
    public static final int CMD_STRESS_CALIBRATION_VALUE = 103;
    public static final int CMD_STRESS_DETAIL_VALUE = 35;
    public static final int CMD_STRESS_VALUE = 34;
    public static final int CMD_SUNLIGHT_DETAIL_VALUE = 236;
    public static final int CMD_SUNLIGHT_STAT_VALUE = 237;
    public static final int CMD_SYNC_180DAYS_WTT_TO_DEVICE_VALUE = 230;
    public static final int CMD_SYNC_ACCOUNT_BODY_INFO_VALUE = 161;
    public static final int CMD_SYNC_CALORIES_TO_WEAR_VALUE = 52;
    public static final int CMD_SYNC_CLOUD_STATUS_TO_DEVICE_VALUE = 225;
    public static final int CMD_SYNC_HEART_RATE_STAT_VALUE = 53;
    public static final int CMD_SYNC_PROJECT_JOIN_STATE_VALUE = 162;
    public static final int CMD_SYNC_WEIGHT_TARGET_FROM_WEAR_VALUE = 56;
    public static final int CMD_SYNC_WEIGHT_TARGET_TO_WEAR_VALUE = 55;
    public static final int CMD_WEAR_RECORD_UPLOAD_VALUE = 64;
    public static final int CMD_WEAR_SPORT_HEALTH_CONFIG_VALUE = 50;
    public static final int CMD_WRIST_TEMPERATURE_DATA_DETAIL_VALUE = 121;
    public static final int CMD_WRIST_TEMPERATURE_DATA_VALUE = 120;
    public static final int CMD_WRIST_TEMPERATURE_INDEX_DATA_DETAIL_VALUE = 123;
    public static final int CMD_WRIST_TEMPERATURE_INDEX_DATA_VALUE = 122;
    public static final int CMD_WRIST_TEMPERATURE_MONITOR_VALUE = 127;
    public static final int CMD_WRIST_TEMPERATURE_STATE_VALUE = 124;
    public static final int FITNESS_CMD_PLACE_HOLDER_VALUE = 0;
    public static final int HRV_SKIP_TODAY_DEV_RESULT_VALUE = 247;
    public static final int HRV_SKIP_TODAY_DEV_VALUE = 246;
    public static final int HRV_SKIP_TODAY_VALUE = 235;
    private static final Internal.EnumLiteMap<FitnessProto$FitnessCmdId> internalValueMap = new Internal.EnumLiteMap<FitnessProto$FitnessCmdId>() { // from class: com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProto$FitnessCmdId findValueByNumber(int i) {
            return FitnessProto$FitnessCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProto$FitnessCmdId.forNumber(i) != null;
        }
    }

    FitnessProto$FitnessCmdId(int i) {
        this.value = i;
    }

    public static FitnessProto$FitnessCmdId forNumber(int i) {
        switch (i) {
            case 0:
                return FITNESS_CMD_PLACE_HOLDER;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 19:
            case 20:
            case 22:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 36:
            case 37:
            case 38:
            case 44:
            case 45:
            case 136:
            case 137:
            case ATDataProfile.CMD_BLOOD_OXYGEN_RECORD /* 138 */:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case i.O2ToxicityFieldNum /* 155 */:
            case 156:
            case e.TotalFractionalDescentFieldNum /* 157 */:
            case 158:
            case 159:
            case 160:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case oei.TAI_CHI /* 224 */:
            case yo3.FILE_SEND_FAIL /* 231 */:
            case 232:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER /* 244 */:
            case CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE:
            case 250:
            case Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER /* 251 */:
            case 252:
            case 253:
            case 254:
            default:
                return null;
            case 9:
                return CMD_DAILY_ACTIVITY;
            case 10:
                return CMD_DAILY_ACTIVITY_DETAIL;
            case 11:
                return CMD_HR;
            case 12:
                return CMD_HR_DETAIL;
            case 13:
                return CMD_SLEEP;
            case 14:
                return CMD_SLEEP_DETAIL;
            case 15:
                return CMD_ECG;
            case 16:
                return CMD_ECG_DETAIL;
            case 17:
                return CMD_REST_HR;
            case 18:
                return CMD_REST_HR_DETAIL;
            case 21:
                return CMD_DAILY_TOTAL_RECORD;
            case 23:
                return CMD_SPO2;
            case 24:
                return CMD_SPO2_DETAIL;
            case 25:
                return CMD_SPO2_MANUAL_DATA_SYNC;
            case 32:
                return CMD_SLEEP_STATE_CHANGE;
            case 34:
                return CMD_STRESS;
            case 35:
                return CMD_STRESS_DETAIL;
            case 39:
                return CMD_DEVICE_PULL_ACTIVITY_DATA;
            case 40:
                return CMD_DEVICE_PUSH_HEALTH_NOTICE_DATA;
            case 41:
                return CMD_APP_PUSH_HEALTH_NOTICE_TO_DEVICE;
            case 42:
                return CMD_APP_PUSH_FAMILY_MEMBER_INFO_TO_DEVICE;
            case 43:
                return CMD_DEVICE_PULL_FAMILY_MEMBER_INFO;
            case 46:
                return CMD_HR_NOTICE;
            case 47:
                return CMD_HR_NOTICE_DETAIL;
            case 48:
                return CMD_SCREEN_DATA;
            case 49:
                return CMD_SCREEN_DATA_DETAIL;
            case 50:
                return CMD_WEAR_SPORT_HEALTH_CONFIG;
            case 51:
                return CMD_SLEEP_REM_ENABLE;
            case 52:
                return CMD_SYNC_CALORIES_TO_WEAR;
            case 53:
                return CMD_SYNC_HEART_RATE_STAT;
            case 54:
                return CMD_DAILY_TOTAL_RECORD_LIST;
            case 55:
                return CMD_SYNC_WEIGHT_TARGET_TO_WEAR;
            case 56:
                return CMD_SYNC_WEIGHT_TARGET_FROM_WEAR;
            case 57:
                return CMD_HRV;
            case 58:
                return CMD_HRV_DETAIL;
            case 59:
                return CMD_AFIB_SWITCH;
            case 60:
                return CMD_AFIB_DATA;
            case 61:
                return CMD_AFIB_DATA_DETAIL;
            case 62:
                return CMD_RECORD_AUDIO_SWITCH;
            case 63:
                return CMD_FALL_DOWN_SWITCH;
            case 64:
                return CMD_WEAR_RECORD_UPLOAD;
            case 65:
                return CMD_DEVICE_HEALTH_DATA_CHANGED_NOTIFY;
            case 66:
                return CMD_DEVICE_GET_USER_WEIGHT_DATA;
            case 67:
                return CMD_FALL_DATA;
            case 68:
                return CMD_FALL_DATA_DETAIL;
            case 69:
                return CMD_SEND_OSA_RESULT;
            case 70:
                return CMD_SEND_SLEEP_FIX_DATA;
            case 71:
                return CMD_READ_SPORT_HEALTH_SETTING;
            case 72:
                return CMD_REMIND_POP_UP;
            case 73:
                return CMD_GET_DEVICES_SLEEP_MODEL_SETTING;
            case 74:
                return CMD_SEND_SLEEP_MODE_SETTING_TO_DEVICES;
            case 75:
                return CMD_SLEEP_USER_REST_LIST;
            case 76:
                return CMD_SLEEP_SETTING_CLOSE_MUSIC;
            case 77:
                return CMD_BED_TIME_REMINDER;
            case 78:
                return CMD_STAY_UP_BED_TIME_REMINDER;
            case 79:
                return CMD_DEVICE_REPORT_SLEEP_MODEL;
            case 80:
                return CMD_GET_DEVICES_SLEEP_MODEL_SETTING_ACK;
            case 81:
                return CMD_SLEEP_GOAL;
            case 82:
                return CMD_SPO2_NOTICE;
            case 83:
                return CMD_SPO2_NOTICE_DETAIL;
            case 84:
                return CMD_SPO2_V2;
            case 85:
                return CMD_SPO2_V2_DETAIL;
            case 86:
                return CMD_SLEEP_SPO2_V2;
            case 87:
                return CMD_SLEEP_SPO2_V2_DETAIL;
            case 88:
                return CMD_RESUME_ACTIVITY_REMINDER;
            case 89:
                return CMD_OSA;
            case 90:
                return CMD_BREATHE_RATE;
            case 91:
                return CMD_SPO2_ALL_DAY_MONITOR;
            case 92:
                return CMD_SPO2_LOW_WARNING_SWITCH;
            case 93:
                return CMD_SPORTS_VOICE_BROADCAST;
            case 94:
                return CMD_BUTTON_TO_PAUSE_OR_RESUME;
            case 95:
                return CMD_SLEEP_SCORE;
            case 96:
                return CMD_BREATHE_RATE_DATA;
            case 97:
                return CMD_BREATHE_RATE_DATA_DETAIL;
            case 98:
                return CMD_SLEEP_STATISTICS_DATA;
            case 99:
                return CMD_SLEEP_STATISTICS_DATA_DETAIL;
            case 100:
                return CMD_SENSOR_OSA_DATA;
            case 101:
                return CMD_SENSOR_OSA_DATA_DETAIL;
            case 102:
                return CMD_AUTO_RECOGNIZE_SPORT_TYPE_SWITCH;
            case 103:
                return CMD_STRESS_CALIBRATION;
            case 104:
                return CMD_SLEEP_CALIBRATION_DATA;
            case 105:
                return CMD_ASSESSMENT_RECORD;
            case 106:
                return CMD_ASSESSMENT_RECORD_DETAIL;
            case 107:
                return CMD_ECG_ACTIVE_STATE;
            case 108:
                return CMD_SEND_CARDIOVASCULAR_PREPARE_STATE;
            case 109:
                return CMD_CARDIOVASCULAR_PREPARE_REMIND;
            case 110:
                return CMD_EXERCISE_TIME_GOAL;
            case 111:
                return CMD_ACTIVITY_GOAL;
            case 112:
                return CMD_DOUBLE_CLICK_SCREEN_VOICE_BROADCAST;
            case 113:
                return CMD_SCIENCE_INFO;
            case 114:
                return CMD_BLOOD_SUGAR_DATA;
            case 115:
                return CMD_BLOOD_SUGAR_DATA_DETAIL;
            case 116:
                return CMD_BLOOD_SUGAR_NOTICE_DATA;
            case 117:
                return CMD_BLOOD_SUGAR_NOTICE_DATA_DETAIL;
            case 118:
                return CMD_BLOOD_SUGAR_SETTING;
            case 119:
                return CMD_BLOOD_SUGAR_DEVICE_STATE;
            case 120:
                return CMD_WRIST_TEMPERATURE_DATA;
            case 121:
                return CMD_WRIST_TEMPERATURE_DATA_DETAIL;
            case 122:
                return CMD_WRIST_TEMPERATURE_INDEX_DATA;
            case 123:
                return CMD_WRIST_TEMPERATURE_INDEX_DATA_DETAIL;
            case 124:
                return CMD_WRIST_TEMPERATURE_STATE;
            case 125:
                return CMD_MENSTRUAL_REMIND_SWITCH_SEND;
            case 126:
                return CMD_MENSTRUAL_SETTING_SEND;
            case 127:
                return CMD_WRIST_TEMPERATURE_MONITOR;
            case 128:
                return CMD_MENSTRUAL_SYMPTOM_MODIFIED_TIME_SYNC;
            case 129:
                return CMD_MENSTRUAL_CYCLE_ASK;
            case 130:
                return CMD_MENSTRUAL_CYCLE_SEND;
            case 131:
                return CMD_MENSTRUAL_SYMPTOM_MODIFIED_ASK;
            case 132:
                return CMD_MENSTRUAL_SYMPTOM_MODIFIED_SEND;
            case 133:
                return CMD_MENSTRUAL_SYMPTOM_SELECTED_SEND;
            case 134:
                return CMD_MENSTRUAL_SYMPTOM_RANGE_REQUEST;
            case 135:
                return CMD_INSIGHT_DATA_SEND;
            case 139:
                return CMD_DAILY_ACTIVITY_STATISTICS;
            case 161:
                return CMD_SYNC_ACCOUNT_BODY_INFO;
            case 162:
                return CMD_SYNC_PROJECT_JOIN_STATE;
            case 163:
                return CMD_SLEEP_RR_INTERVAL_DATA;
            case 164:
                return CMD_SLEEP_RR_INTERVAL_DATA_DETAIL;
            case 165:
                return CMD_PHONE_STATE_TO_DEVICE;
            case 166:
                return CMD_ECG_BIG_CORE;
            case 167:
                return CMD_ECG_BIG_CORE_DETAIL;
            case 168:
                return CMD_BLOOD_SUGAR_DATA_BIG_CORE_DETAIL;
            case 169:
                return CMD_BLOOD_SUGAR_NOTICE_DATA_BIG_CORE_DETAIL;
            case 170:
                return CMD_BLOOD_SUGAR_DEVICE_STATE_BIG_CORE;
            case 171:
                return CMD_RELAX_DATA_BIG_CORE_DETAIL;
            case 172:
                return CMD_MCU_STEP_GOAL;
            case 173:
                return CMD_MCU_CALORIE_GOAL;
            case 174:
                return CMD_MCU_EXERCISE_TIME_GOAL;
            case 175:
                return CMD_MCU_ACTIVITY_GOAL;
            case 176:
                return CMD_MCU_SEDENTARY_REMIND;
            case 177:
                return CMD_MCU_RESUME_ACTIVITY_REMINDER;
            case 178:
                return CMD_MCU_ACTIVITY_NOTIFY_STATE;
            case 179:
                return CMD_MCU_FALL_DOWN;
            case 180:
                return CMD_MCU_HR_AUTO_MEASURE;
            case 181:
                return CMD_MCU_QUITE_HR_WARN;
            case 182:
                return CMD_MCU_SPROT_HR_WARN;
            case 183:
                return CMD_MCU_AFIB;
            case 184:
                return CMD_MCU_STRESS_AUTO_MEASURE;
            case 185:
                return CMD_MCU_STRESS_HIGH_NOTIFY;
            case 186:
                return CMD_MCU_SPO2_ALL_DAY_MONITOR;
            case 187:
                return CMD_MCU_SPO2_LOW_WARNING;
            case 188:
                return CMD_MCU_OSA;
            case CMD_MCU_BREATHE_RATE_VALUE:
                return CMD_MCU_BREATHE_RATE;
            case 190:
                return CMD_MCU_SLEEP_REM;
            case CMD_MCU_AUTO_PAUSE_SPORT_VALUE:
                return CMD_MCU_AUTO_PAUSE_SPORT;
            case 192:
                return CMD_MCU_AUTO_RECOGNIZE_SPORT;
            case 193:
                return CMD_MCU_AUTO_RECOGNIZE_SPORT_TYPE;
            case 194:
                return CMD_MCU_SPORTS_VOICE_BROADCAST;
            case 195:
                return CMD_MCU_DOUBLE_CLICK_VOICE_BROADCAST;
            case CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE:
                return CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME;
            case 197:
                return CMD_MCU_READ_SPORT_HEALTH_SETTING;
            case 198:
                return CMD_PHYSICAL_MENTAL_HEALTH_DATA;
            case 199:
                return CMD_PHYSICAL_MENTAL_HEALTH_INDEX_DATA;
            case 200:
                return CMD_OSA_RESULT_WEEK_REQUEST;
            case 201:
                return CMD_OSA_RESULT_WEEK;
            case 202:
                return CMD_SNORE_ACTIVE_STATE_TO_DEVICE;
            case 203:
                return CMD_SNORE_ACTIVE_STATE_FROM_DEVICE;
            case 204:
                return CMD_MCU_GET_DEVICES_SLEEP_MODEL_SETTING;
            case 205:
                return CMD_MCU_SEND_SLEEP_MODE_SETTING_TO_DEVICES;
            case 206:
                return CMD_MCU_SLEEP_USER_REST_LIST;
            case 207:
                return CMD_MCU_SLEEP_SETTING_CLOSE_MUSIC;
            case 208:
                return CMD_MCU_BED_TIME_REMINDER;
            case 209:
                return CMD_MCU_DEVICE_REPORT_SLEEP_MODEL;
            case 210:
                return CMD_MCU_SLEEP_GOAL;
            case 216:
                return CMD_MCU_SPORT_GOAL;
            case 217:
                return CMD_MCU_MEDITATION_BREATHING_GOAL;
            case 218:
                return CMD_MCU_DAILY_ACTIVITY_STATE;
            case 219:
                return CMD_MCU_DAILY_ACTIVITY_STATE_TO_DEVICE;
            case 220:
                return CMD_DEVICE_OPEN_PAGE;
            case 221:
                return CMD_MCU_ACHIEVEMENT_REMINDER_SETTING;
            case 222:
                return CMD_MCU_SEND_LEGAL_HOLIDAY_TO_DEVICE;
            case 223:
                return CMD_MCU_SYNC_FALL_DATA;
            case 225:
                return CMD_SYNC_CLOUD_STATUS_TO_DEVICE;
            case 226:
                return CMD_AUTO_SPORT_STATUS_TO_DEVICE;
            case 227:
                return CMD_REMIND_CONFIG_READ;
            case 228:
                return CMD_REMIND_CONFIG_SET;
            case 229:
                return CMD_DATA_NEWEST_TIMESTAMP_READ;
            case 230:
                return CMD_SYNC_180DAYS_WTT_TO_DEVICE;
            case 233:
                return CMD_MENSTRUAL_PERIOD_DATA;
            case 234:
                return CMD_SEND_BLOOD_PRESSURE_TO_DEVICE;
            case 235:
                return HRV_SKIP_TODAY;
            case CMD_SUNLIGHT_DETAIL_VALUE:
                return CMD_SUNLIGHT_DETAIL;
            case CMD_SUNLIGHT_STAT_VALUE:
                return CMD_SUNLIGHT_STAT;
            case 246:
                return HRV_SKIP_TODAY_DEV;
            case 247:
                return HRV_SKIP_TODAY_DEV_RESULT;
            case 248:
                return CMD_MENSTRUAL_SETTINGS_DATA;
            case 249:
                return CMD_RELAX_DATA_MCU_DETAIL;
            case 255:
                return CMD_SEND_GEO_FENCE_TO_DEVICE;
        }
    }

    public static Internal.EnumLiteMap<FitnessProto$FitnessCmdId> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FitnessProto$FitnessCmdId valueOf(int i) {
        return forNumber(i);
    }
}
