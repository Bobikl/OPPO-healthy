package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum NTFCmdId implements Internal.EnumLite {
    CID_NTF_UNDEFINE(0),
    CID_NTF_SYNC_POSTED(1),
    CID_NTF_SYNC_REMOVED(3),
    CID_NTF_SYNC_OPEN_AND_REMOVE(4),
    CID_NTF_SYNC_BAND_REPLY_TEXT(7),
    BREENO_COMMAND_ID_SCENE_COMMUTING_GOTO_WORK(16),
    BREENO_COMMAND_ID_SCENE_COMMUTING_OFF_WORK(17),
    BREENO_COMMAND_ID_SCENE_MOVIE_MUTE(18),
    BREENO_COMMAND_ID_SCENE_MOVIE_PICKUP_TICKET(19),
    BREENO_COMMAND_ID_SCENE_MOVIE_PREPARATION(20),
    BREENO_COMMAND_ID_SCENE_TRAIN_PREPARATION(21),
    BREENO_COMMAND_ID_SCENE_TRAIN_GOTO_STATION(22),
    BREENO_COMMAND_ID_SCENE_TRAIN_BOARDING(23),
    BREENO_COMMAND_ID_SCENE_FLIGHT_PREPARATION(24),
    BREENO_COMMAND_ID_SCENE_FLIGHT_GOTO_AIRPORT(25),
    BREENO_COMMAND_ID_SCENE_FLIGHT_BOARDING(32),
    BREENO_COMMAND_ID_SCENE_FLIGHT_GET_BAGGAGE(33),
    BREENO_COMMAND_ID_WTP_SET_PHONE_AUDIO_MUTE(34),
    CID_NTF_WX_LOGIN_STATUS(48),
    CID_NTF_SYNC_REPLY_TEXT(64),
    CID_NTF_SUPPORT_FEATURE(80),
    CID_NTF_SYNC_SWITCHES_DATA(84),
    CID_NTF_SYNC_FLASHBACK_DATA(112),
    CID_NTF_SYNC_FEATURE_SUPPORT(113),
    NOTIFICATION_FLASH_BACK_STATUS(114),
    NOTIFICATION_CROSS_SCREEN_STATE(115),
    CID_NTF_SYNC_WECHAT_CALL(128),
    CID_NTF_SYNC_WECHAT_CALL_FEATURE_SUPPORT(129),
    CID_NTF_SYNC_NEED_ICON(144),
    CID_NTF_SYNC_NEED_ALL_ICON(145),
    CID_NTF_SYNC_PHONE_SCREEN(146),
    CID_NTF_SYNC_ICON_LIST(150),
    UNRECOGNIZED(-1);

    public static final int BREENO_COMMAND_ID_SCENE_COMMUTING_GOTO_WORK_VALUE = 16;
    public static final int BREENO_COMMAND_ID_SCENE_COMMUTING_OFF_WORK_VALUE = 17;
    public static final int BREENO_COMMAND_ID_SCENE_FLIGHT_BOARDING_VALUE = 32;
    public static final int BREENO_COMMAND_ID_SCENE_FLIGHT_GET_BAGGAGE_VALUE = 33;
    public static final int BREENO_COMMAND_ID_SCENE_FLIGHT_GOTO_AIRPORT_VALUE = 25;
    public static final int BREENO_COMMAND_ID_SCENE_FLIGHT_PREPARATION_VALUE = 24;
    public static final int BREENO_COMMAND_ID_SCENE_MOVIE_MUTE_VALUE = 18;
    public static final int BREENO_COMMAND_ID_SCENE_MOVIE_PICKUP_TICKET_VALUE = 19;
    public static final int BREENO_COMMAND_ID_SCENE_MOVIE_PREPARATION_VALUE = 20;
    public static final int BREENO_COMMAND_ID_SCENE_TRAIN_BOARDING_VALUE = 23;
    public static final int BREENO_COMMAND_ID_SCENE_TRAIN_GOTO_STATION_VALUE = 22;
    public static final int BREENO_COMMAND_ID_SCENE_TRAIN_PREPARATION_VALUE = 21;
    public static final int BREENO_COMMAND_ID_WTP_SET_PHONE_AUDIO_MUTE_VALUE = 34;
    public static final int CID_NTF_SUPPORT_FEATURE_VALUE = 80;
    public static final int CID_NTF_SYNC_BAND_REPLY_TEXT_VALUE = 7;
    public static final int CID_NTF_SYNC_FEATURE_SUPPORT_VALUE = 113;
    public static final int CID_NTF_SYNC_FLASHBACK_DATA_VALUE = 112;
    public static final int CID_NTF_SYNC_ICON_LIST_VALUE = 150;
    public static final int CID_NTF_SYNC_NEED_ALL_ICON_VALUE = 145;
    public static final int CID_NTF_SYNC_NEED_ICON_VALUE = 144;
    public static final int CID_NTF_SYNC_OPEN_AND_REMOVE_VALUE = 4;
    public static final int CID_NTF_SYNC_PHONE_SCREEN_VALUE = 146;
    public static final int CID_NTF_SYNC_POSTED_VALUE = 1;
    public static final int CID_NTF_SYNC_REMOVED_VALUE = 3;
    public static final int CID_NTF_SYNC_REPLY_TEXT_VALUE = 64;
    public static final int CID_NTF_SYNC_SWITCHES_DATA_VALUE = 84;
    public static final int CID_NTF_SYNC_WECHAT_CALL_FEATURE_SUPPORT_VALUE = 129;
    public static final int CID_NTF_SYNC_WECHAT_CALL_VALUE = 128;
    public static final int CID_NTF_UNDEFINE_VALUE = 0;
    public static final int CID_NTF_WX_LOGIN_STATUS_VALUE = 48;
    public static final int NOTIFICATION_CROSS_SCREEN_STATE_VALUE = 115;
    public static final int NOTIFICATION_FLASH_BACK_STATUS_VALUE = 114;
    private static final Internal.EnumLiteMap<NTFCmdId> internalValueMap = new Internal.EnumLiteMap<NTFCmdId>() { // from class: com.heytap.health.watch.notification.NTFCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NTFCmdId findValueByNumber(int i) {
            return NTFCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return NTFCmdId.forNumber(i) != null;
        }
    }

    NTFCmdId(int i) {
        this.value = i;
    }

    public static NTFCmdId forNumber(int i) {
        if (i == 0) {
            return CID_NTF_UNDEFINE;
        }
        if (i == 1) {
            return CID_NTF_SYNC_POSTED;
        }
        if (i == 3) {
            return CID_NTF_SYNC_REMOVED;
        }
        if (i == 4) {
            return CID_NTF_SYNC_OPEN_AND_REMOVE;
        }
        if (i == 7) {
            return CID_NTF_SYNC_BAND_REPLY_TEXT;
        }
        if (i == 48) {
            return CID_NTF_WX_LOGIN_STATUS;
        }
        if (i == 64) {
            return CID_NTF_SYNC_REPLY_TEXT;
        }
        if (i == 80) {
            return CID_NTF_SUPPORT_FEATURE;
        }
        if (i == 84) {
            return CID_NTF_SYNC_SWITCHES_DATA;
        }
        if (i == 150) {
            return CID_NTF_SYNC_ICON_LIST;
        }
        if (i == 128) {
            return CID_NTF_SYNC_WECHAT_CALL;
        }
        if (i == 129) {
            return CID_NTF_SYNC_WECHAT_CALL_FEATURE_SUPPORT;
        }
        switch (i) {
            case 16:
                return BREENO_COMMAND_ID_SCENE_COMMUTING_GOTO_WORK;
            case 17:
                return BREENO_COMMAND_ID_SCENE_COMMUTING_OFF_WORK;
            case 18:
                return BREENO_COMMAND_ID_SCENE_MOVIE_MUTE;
            case 19:
                return BREENO_COMMAND_ID_SCENE_MOVIE_PICKUP_TICKET;
            case 20:
                return BREENO_COMMAND_ID_SCENE_MOVIE_PREPARATION;
            case 21:
                return BREENO_COMMAND_ID_SCENE_TRAIN_PREPARATION;
            case 22:
                return BREENO_COMMAND_ID_SCENE_TRAIN_GOTO_STATION;
            case 23:
                return BREENO_COMMAND_ID_SCENE_TRAIN_BOARDING;
            case 24:
                return BREENO_COMMAND_ID_SCENE_FLIGHT_PREPARATION;
            case 25:
                return BREENO_COMMAND_ID_SCENE_FLIGHT_GOTO_AIRPORT;
            default:
                switch (i) {
                    case 32:
                        return BREENO_COMMAND_ID_SCENE_FLIGHT_BOARDING;
                    case 33:
                        return BREENO_COMMAND_ID_SCENE_FLIGHT_GET_BAGGAGE;
                    case 34:
                        return BREENO_COMMAND_ID_WTP_SET_PHONE_AUDIO_MUTE;
                    default:
                        switch (i) {
                            case 112:
                                return CID_NTF_SYNC_FLASHBACK_DATA;
                            case 113:
                                return CID_NTF_SYNC_FEATURE_SUPPORT;
                            case 114:
                                return NOTIFICATION_FLASH_BACK_STATUS;
                            case 115:
                                return NOTIFICATION_CROSS_SCREEN_STATE;
                            default:
                                switch (i) {
                                    case 144:
                                        return CID_NTF_SYNC_NEED_ICON;
                                    case 145:
                                        return CID_NTF_SYNC_NEED_ALL_ICON;
                                    case 146:
                                        return CID_NTF_SYNC_PHONE_SCREEN;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static Internal.EnumLiteMap<NTFCmdId> internalGetValueMap() {
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
    public static NTFCmdId valueOf(int i) {
        return forNumber(i);
    }
}
