package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$WorkoutCmdId implements Internal.EnumLite {
    WORKOUT_CMD_PLACE_HOLDER(0),
    CMD_SPORT(1),
    CMD_SPORT_DETAIL(2),
    CMD_FIT_CONTROL_TO_DEVICE(3),
    CMD_FIT_CONTROL_FROM_DEVICE(4),
    CMD_FIT_REAL_TIME_DATA_FROM_DEVICE(5),
    CMD_FIT_RESULT_DATA_FROM_DEVICE(6),
    CMD_FITNESS_DATA(9),
    CMD_RUN3KM_TIME(12),
    CMD_AIR_PRESSURE(14),
    CMD_DEVICE_SPORT(16),
    CMD_ADD_OR_UPDATE_CUSTOM(17),
    CMD_DEVICE_CUSTOM(18),
    CMD_DELETE_CUSTOM(19),
    CMD_MEDAL_DATA(21),
    CMD_MEDAL_RES_DOWNLOAD_REQ(22),
    CMD_PLAN_DETAIL(25),
    CMD_RECOM_FATRE(26),
    CMD_PLAN_CONFIG(27),
    CMD_PLAN_CONFIG_CHANGE(28),
    CMD_PLAN_DETAIL_CHANGE(29),
    CMD_GET_WEAR_MOTION_STATE(20),
    CMD_WEAR_REPORT_MOTION_STATE(34),
    CMD_START_PHONE_APP(36),
    CMD_QUIT_FAT_LOSS_TRACK(38),
    CMD_DEVICE_SPORT_DATA_CHANGED_NOTIFY(39),
    CMD_RECOVERY_HR(41),
    CMD_RECOVERY_HR_DETAIL(42),
    CMD_SEND_VO2MAX(44),
    CMD_SEND_STARTSPORT(45),
    CMD_MEDAL_CLOUD_DATA(46),
    CMD_DEVICE_GET_HF_GPS_FILE(50),
    CMD_SEND_STARTSPORT_MCU(51),
    CMD_SUB_AMOUNT_OF_EXERCIESE_RECOMMEND_MCU(52),
    CMD_SEND_SUB_RECOMMEND_SPORT_MCU(53),
    CMD_SEND_HF_GPS_FILE_SUMMARY(55),
    CMD_EXERCISE_INTENSITY_SYNC(61),
    CMD_EXERCISE_INTENSITY_REPORT(62),
    CMD_DEVICE_SPORT_MCU(63),
    CMD_ADD_OR_UPDATE_CUSTOM_MCU(64),
    CMD_DEVICE_CUSTOM_MCU(65),
    CMD_DELETE_CUSTOM_MCU(66),
    CMD_HR_ONLINE_LEARNING_MCU(67),
    CMD_EXERCISE_LOAD_RATIO_SYNC(68),
    CMD_EXERCISE_LOAD_RATIO_REQUEST(69),
    CMD_VMEDIA_AUDIO_CHUNK(74),
    CMD_VMEDIA_AUDIO_EOS(75),
    CMD_VMEDIA_AUDIO_STOP(76),
    CMD_VMEDIA_GET_VOICE_PACK(84),
    CMD_VMEDIA_VOICE_PLAYBACK(85),
    CMD_VMEDIA_VOICE_PLAYBACK_END(86),
    CMD_VMEDIA_VOICE_STOP(87),
    UNRECOGNIZED(-1);

    public static final int CMD_ADD_OR_UPDATE_CUSTOM_MCU_VALUE = 64;
    public static final int CMD_ADD_OR_UPDATE_CUSTOM_VALUE = 17;
    public static final int CMD_AIR_PRESSURE_VALUE = 14;
    public static final int CMD_DELETE_CUSTOM_MCU_VALUE = 66;
    public static final int CMD_DELETE_CUSTOM_VALUE = 19;
    public static final int CMD_DEVICE_CUSTOM_MCU_VALUE = 65;
    public static final int CMD_DEVICE_CUSTOM_VALUE = 18;
    public static final int CMD_DEVICE_GET_HF_GPS_FILE_VALUE = 50;
    public static final int CMD_DEVICE_SPORT_DATA_CHANGED_NOTIFY_VALUE = 39;
    public static final int CMD_DEVICE_SPORT_MCU_VALUE = 63;
    public static final int CMD_DEVICE_SPORT_VALUE = 16;
    public static final int CMD_EXERCISE_INTENSITY_REPORT_VALUE = 62;
    public static final int CMD_EXERCISE_INTENSITY_SYNC_VALUE = 61;
    public static final int CMD_EXERCISE_LOAD_RATIO_REQUEST_VALUE = 69;
    public static final int CMD_EXERCISE_LOAD_RATIO_SYNC_VALUE = 68;
    public static final int CMD_FITNESS_DATA_VALUE = 9;
    public static final int CMD_FIT_CONTROL_FROM_DEVICE_VALUE = 4;
    public static final int CMD_FIT_CONTROL_TO_DEVICE_VALUE = 3;
    public static final int CMD_FIT_REAL_TIME_DATA_FROM_DEVICE_VALUE = 5;
    public static final int CMD_FIT_RESULT_DATA_FROM_DEVICE_VALUE = 6;
    public static final int CMD_GET_WEAR_MOTION_STATE_VALUE = 20;
    public static final int CMD_HR_ONLINE_LEARNING_MCU_VALUE = 67;
    public static final int CMD_MEDAL_CLOUD_DATA_VALUE = 46;
    public static final int CMD_MEDAL_DATA_VALUE = 21;
    public static final int CMD_MEDAL_RES_DOWNLOAD_REQ_VALUE = 22;
    public static final int CMD_PLAN_CONFIG_CHANGE_VALUE = 28;
    public static final int CMD_PLAN_CONFIG_VALUE = 27;
    public static final int CMD_PLAN_DETAIL_CHANGE_VALUE = 29;
    public static final int CMD_PLAN_DETAIL_VALUE = 25;
    public static final int CMD_QUIT_FAT_LOSS_TRACK_VALUE = 38;
    public static final int CMD_RECOM_FATRE_VALUE = 26;
    public static final int CMD_RECOVERY_HR_DETAIL_VALUE = 42;
    public static final int CMD_RECOVERY_HR_VALUE = 41;
    public static final int CMD_RUN3KM_TIME_VALUE = 12;
    public static final int CMD_SEND_HF_GPS_FILE_SUMMARY_VALUE = 55;
    public static final int CMD_SEND_STARTSPORT_MCU_VALUE = 51;
    public static final int CMD_SEND_STARTSPORT_VALUE = 45;
    public static final int CMD_SEND_SUB_RECOMMEND_SPORT_MCU_VALUE = 53;
    public static final int CMD_SEND_VO2MAX_VALUE = 44;
    public static final int CMD_SPORT_DETAIL_VALUE = 2;
    public static final int CMD_SPORT_VALUE = 1;
    public static final int CMD_START_PHONE_APP_VALUE = 36;
    public static final int CMD_SUB_AMOUNT_OF_EXERCIESE_RECOMMEND_MCU_VALUE = 52;
    public static final int CMD_VMEDIA_AUDIO_CHUNK_VALUE = 74;
    public static final int CMD_VMEDIA_AUDIO_EOS_VALUE = 75;
    public static final int CMD_VMEDIA_AUDIO_STOP_VALUE = 76;
    public static final int CMD_VMEDIA_GET_VOICE_PACK_VALUE = 84;
    public static final int CMD_VMEDIA_VOICE_PLAYBACK_END_VALUE = 86;
    public static final int CMD_VMEDIA_VOICE_PLAYBACK_VALUE = 85;
    public static final int CMD_VMEDIA_VOICE_STOP_VALUE = 87;
    public static final int CMD_WEAR_REPORT_MOTION_STATE_VALUE = 34;
    public static final int WORKOUT_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<WorkoutProto$WorkoutCmdId> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$WorkoutCmdId>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$WorkoutCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$WorkoutCmdId findValueByNumber(int i) {
            return WorkoutProto$WorkoutCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$WorkoutCmdId.forNumber(i) != null;
        }
    }

    WorkoutProto$WorkoutCmdId(int i) {
        this.value = i;
    }

    public static WorkoutProto$WorkoutCmdId forNumber(int i) {
        switch (i) {
            case 0:
                return WORKOUT_CMD_PLACE_HOLDER;
            case 1:
                return CMD_SPORT;
            case 2:
                return CMD_SPORT_DETAIL;
            case 3:
                return CMD_FIT_CONTROL_TO_DEVICE;
            case 4:
                return CMD_FIT_CONTROL_FROM_DEVICE;
            case 5:
                return CMD_FIT_REAL_TIME_DATA_FROM_DEVICE;
            case 6:
                return CMD_FIT_RESULT_DATA_FROM_DEVICE;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 23:
            case 24:
            case 30:
            case 31:
            case 32:
            case 33:
            case 35:
            case 37:
            case 40:
            case 43:
            case 47:
            case 48:
            case 49:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 70:
            case 71:
            case 72:
            case 73:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            default:
                return null;
            case 9:
                return CMD_FITNESS_DATA;
            case 12:
                return CMD_RUN3KM_TIME;
            case 14:
                return CMD_AIR_PRESSURE;
            case 16:
                return CMD_DEVICE_SPORT;
            case 17:
                return CMD_ADD_OR_UPDATE_CUSTOM;
            case 18:
                return CMD_DEVICE_CUSTOM;
            case 19:
                return CMD_DELETE_CUSTOM;
            case 20:
                return CMD_GET_WEAR_MOTION_STATE;
            case 21:
                return CMD_MEDAL_DATA;
            case 22:
                return CMD_MEDAL_RES_DOWNLOAD_REQ;
            case 25:
                return CMD_PLAN_DETAIL;
            case 26:
                return CMD_RECOM_FATRE;
            case 27:
                return CMD_PLAN_CONFIG;
            case 28:
                return CMD_PLAN_CONFIG_CHANGE;
            case 29:
                return CMD_PLAN_DETAIL_CHANGE;
            case 34:
                return CMD_WEAR_REPORT_MOTION_STATE;
            case 36:
                return CMD_START_PHONE_APP;
            case 38:
                return CMD_QUIT_FAT_LOSS_TRACK;
            case 39:
                return CMD_DEVICE_SPORT_DATA_CHANGED_NOTIFY;
            case 41:
                return CMD_RECOVERY_HR;
            case 42:
                return CMD_RECOVERY_HR_DETAIL;
            case 44:
                return CMD_SEND_VO2MAX;
            case 45:
                return CMD_SEND_STARTSPORT;
            case 46:
                return CMD_MEDAL_CLOUD_DATA;
            case 50:
                return CMD_DEVICE_GET_HF_GPS_FILE;
            case 51:
                return CMD_SEND_STARTSPORT_MCU;
            case 52:
                return CMD_SUB_AMOUNT_OF_EXERCIESE_RECOMMEND_MCU;
            case 53:
                return CMD_SEND_SUB_RECOMMEND_SPORT_MCU;
            case 55:
                return CMD_SEND_HF_GPS_FILE_SUMMARY;
            case 61:
                return CMD_EXERCISE_INTENSITY_SYNC;
            case 62:
                return CMD_EXERCISE_INTENSITY_REPORT;
            case 63:
                return CMD_DEVICE_SPORT_MCU;
            case 64:
                return CMD_ADD_OR_UPDATE_CUSTOM_MCU;
            case 65:
                return CMD_DEVICE_CUSTOM_MCU;
            case 66:
                return CMD_DELETE_CUSTOM_MCU;
            case 67:
                return CMD_HR_ONLINE_LEARNING_MCU;
            case 68:
                return CMD_EXERCISE_LOAD_RATIO_SYNC;
            case 69:
                return CMD_EXERCISE_LOAD_RATIO_REQUEST;
            case 74:
                return CMD_VMEDIA_AUDIO_CHUNK;
            case 75:
                return CMD_VMEDIA_AUDIO_EOS;
            case 76:
                return CMD_VMEDIA_AUDIO_STOP;
            case 84:
                return CMD_VMEDIA_GET_VOICE_PACK;
            case 85:
                return CMD_VMEDIA_VOICE_PLAYBACK;
            case 86:
                return CMD_VMEDIA_VOICE_PLAYBACK_END;
            case 87:
                return CMD_VMEDIA_VOICE_STOP;
        }
    }

    public static Internal.EnumLiteMap<WorkoutProto$WorkoutCmdId> internalGetValueMap() {
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
    public static WorkoutProto$WorkoutCmdId valueOf(int i) {
        return forNumber(i);
    }
}
