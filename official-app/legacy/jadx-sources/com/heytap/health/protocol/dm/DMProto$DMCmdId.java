package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$DMCmdId implements Internal.EnumLite {
    CID_DM_UNDEFINE(0),
    CID_DM_DEVICE_VERSION(7),
    CID_DM_DEVICE_BATTERY(8),
    CID_DM_PULL_UP_DEVICE_APP(31),
    CID_PRESENTATION_MODE_INFO(32),
    CID_DEVICE_FEATURE_SET(33),
    CID_FIND_DEVICE(40),
    CID_DM_DEVICE_WECHAT_PAY_KEY(41),
    CID_DM_DEVICE_WECHAT_PAY_KEY_RSP(42),
    CID_NOTIFY_DISCONNECT_REQ(43),
    CID_NOTIFY_DISCONNECT_RSP(44),
    CIM_DM_GET_CONTROL_CENTER(47),
    CIM_DM_SET_CONTROL_CENTER(48),
    CID_DM_WEARING_STATE(56),
    CID_FIND_DEVICE_MCU(57),
    CID_DM_MARKET_MODE_AREA_INFOS(119),
    CID_DM_MARKET_MODE_REPORT_INFOS(120),
    CID_DM_MARKET_MODE_STATUS(121),
    CID_DM_FLASH_BACK_STATUS(114),
    CID_DM_CROSS_SCREEN_STATUS(115),
    CIM_DM_WIFI_PUBLIC_KEY(116),
    CIM_DM_WIFI_INFO(117),
    CIM_DM_RECV_NOTIFY(49),
    CIM_DM_OPEN_SOURCE_APP_LIST(118),
    CIM_DM_SYNC_PHONE_KEEP_ALIVE(73),
    CIM_DM_GET_QUICK_CENTER(74),
    CIM_DM_SET_QUICK_CENTER(75),
    CID_FEATURE_PERMISSION_SYNC(100),
    CID_DM_WECHAT_PAY_KEY_DEVICE_REQ(103),
    CID_DM_WIFI_SYNC_DEVICE_REQ(105),
    CID_MCU_FEATURE_PERMISSION_SYNC(106),
    CID_DM_PHONE_DISPLAY_TO_WATCH(132),
    CID_DM_PULL_UP_DEVICE_APP_SMALL(141),
    CID_DM_DEVICE_PASSWORD_STATUS(154),
    CID_DM_SYNC_PHONE_KEEP_ALIVE_SMALL(CID_DM_SYNC_PHONE_KEEP_ALIVE_SMALL_VALUE),
    CID_DM_CHECK_P2P_PERMISSION(158),
    CID_DM_VOICE_PACKET_INFO(159),
    CID_DM_VOICE_PACKET_SUMMARY(160),
    CID_DM_GET_CUSTOM_IP_SETTING(161),
    CID_DM_SET_CUSTOM_IP_SETTING(162),
    CID_DM_CUSTOM_IP_SETTING_NOTIFY(163),
    CID_DM_VOICE_PACKET_INFO_NOTIFY(164),
    CID_DM_RECOVER_TRANSMISSION(165),
    CID_DM_ACCOUNT_TICKET_INFO(167),
    CMD_DM_PHONE_MUSIC_HEADSET_STATE(169),
    UNRECOGNIZED(-1);

    public static final int CID_DEVICE_FEATURE_SET_VALUE = 33;
    public static final int CID_DM_ACCOUNT_TICKET_INFO_VALUE = 167;
    public static final int CID_DM_CHECK_P2P_PERMISSION_VALUE = 158;
    public static final int CID_DM_CROSS_SCREEN_STATUS_VALUE = 115;
    public static final int CID_DM_CUSTOM_IP_SETTING_NOTIFY_VALUE = 163;
    public static final int CID_DM_DEVICE_BATTERY_VALUE = 8;
    public static final int CID_DM_DEVICE_PASSWORD_STATUS_VALUE = 154;
    public static final int CID_DM_DEVICE_VERSION_VALUE = 7;
    public static final int CID_DM_DEVICE_WECHAT_PAY_KEY_RSP_VALUE = 42;
    public static final int CID_DM_DEVICE_WECHAT_PAY_KEY_VALUE = 41;
    public static final int CID_DM_FLASH_BACK_STATUS_VALUE = 114;
    public static final int CID_DM_GET_CUSTOM_IP_SETTING_VALUE = 161;
    public static final int CID_DM_MARKET_MODE_AREA_INFOS_VALUE = 119;
    public static final int CID_DM_MARKET_MODE_REPORT_INFOS_VALUE = 120;
    public static final int CID_DM_MARKET_MODE_STATUS_VALUE = 121;
    public static final int CID_DM_PHONE_DISPLAY_TO_WATCH_VALUE = 132;
    public static final int CID_DM_PULL_UP_DEVICE_APP_SMALL_VALUE = 141;
    public static final int CID_DM_PULL_UP_DEVICE_APP_VALUE = 31;
    public static final int CID_DM_RECOVER_TRANSMISSION_VALUE = 165;
    public static final int CID_DM_SET_CUSTOM_IP_SETTING_VALUE = 162;
    public static final int CID_DM_SYNC_PHONE_KEEP_ALIVE_SMALL_VALUE = 1073;
    public static final int CID_DM_UNDEFINE_VALUE = 0;
    public static final int CID_DM_VOICE_PACKET_INFO_NOTIFY_VALUE = 164;
    public static final int CID_DM_VOICE_PACKET_INFO_VALUE = 159;
    public static final int CID_DM_VOICE_PACKET_SUMMARY_VALUE = 160;
    public static final int CID_DM_WEARING_STATE_VALUE = 56;
    public static final int CID_DM_WECHAT_PAY_KEY_DEVICE_REQ_VALUE = 103;
    public static final int CID_DM_WIFI_SYNC_DEVICE_REQ_VALUE = 105;
    public static final int CID_FEATURE_PERMISSION_SYNC_VALUE = 100;
    public static final int CID_FIND_DEVICE_MCU_VALUE = 57;
    public static final int CID_FIND_DEVICE_VALUE = 40;
    public static final int CID_MCU_FEATURE_PERMISSION_SYNC_VALUE = 106;
    public static final int CID_NOTIFY_DISCONNECT_REQ_VALUE = 43;
    public static final int CID_NOTIFY_DISCONNECT_RSP_VALUE = 44;
    public static final int CID_PRESENTATION_MODE_INFO_VALUE = 32;
    public static final int CIM_DM_GET_CONTROL_CENTER_VALUE = 47;
    public static final int CIM_DM_GET_QUICK_CENTER_VALUE = 74;
    public static final int CIM_DM_OPEN_SOURCE_APP_LIST_VALUE = 118;
    public static final int CIM_DM_RECV_NOTIFY_VALUE = 49;
    public static final int CIM_DM_SET_CONTROL_CENTER_VALUE = 48;
    public static final int CIM_DM_SET_QUICK_CENTER_VALUE = 75;
    public static final int CIM_DM_SYNC_PHONE_KEEP_ALIVE_VALUE = 73;
    public static final int CIM_DM_WIFI_INFO_VALUE = 117;
    public static final int CIM_DM_WIFI_PUBLIC_KEY_VALUE = 116;
    public static final int CMD_DM_PHONE_MUSIC_HEADSET_STATE_VALUE = 169;
    private static final Internal.EnumLiteMap<DMProto$DMCmdId> internalValueMap = new Internal.EnumLiteMap<DMProto$DMCmdId>() { // from class: com.heytap.health.protocol.dm.DMProto$DMCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$DMCmdId findValueByNumber(int i) {
            return DMProto$DMCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$DMCmdId.forNumber(i) != null;
        }
    }

    DMProto$DMCmdId(int i) {
        this.value = i;
    }

    public static DMProto$DMCmdId forNumber(int i) {
        if (i == 0) {
            return CID_DM_UNDEFINE;
        }
        if (i == 100) {
            return CID_FEATURE_PERMISSION_SYNC;
        }
        if (i == 103) {
            return CID_DM_WECHAT_PAY_KEY_DEVICE_REQ;
        }
        if (i == 132) {
            return CID_DM_PHONE_DISPLAY_TO_WATCH;
        }
        if (i == 141) {
            return CID_DM_PULL_UP_DEVICE_APP_SMALL;
        }
        if (i == 154) {
            return CID_DM_DEVICE_PASSWORD_STATUS;
        }
        if (i == 167) {
            return CID_DM_ACCOUNT_TICKET_INFO;
        }
        if (i == 169) {
            return CMD_DM_PHONE_MUSIC_HEADSET_STATE;
        }
        if (i == 1073) {
            return CID_DM_SYNC_PHONE_KEEP_ALIVE_SMALL;
        }
        if (i == 7) {
            return CID_DM_DEVICE_VERSION;
        }
        if (i == 8) {
            return CID_DM_DEVICE_BATTERY;
        }
        if (i == 56) {
            return CID_DM_WEARING_STATE;
        }
        if (i == 57) {
            return CID_FIND_DEVICE_MCU;
        }
        if (i == 105) {
            return CID_DM_WIFI_SYNC_DEVICE_REQ;
        }
        if (i == 106) {
            return CID_MCU_FEATURE_PERMISSION_SYNC;
        }
        switch (i) {
            case 31:
                return CID_DM_PULL_UP_DEVICE_APP;
            case 32:
                return CID_PRESENTATION_MODE_INFO;
            case 33:
                return CID_DEVICE_FEATURE_SET;
            default:
                switch (i) {
                    case 40:
                        return CID_FIND_DEVICE;
                    case 41:
                        return CID_DM_DEVICE_WECHAT_PAY_KEY;
                    case 42:
                        return CID_DM_DEVICE_WECHAT_PAY_KEY_RSP;
                    case 43:
                        return CID_NOTIFY_DISCONNECT_REQ;
                    case 44:
                        return CID_NOTIFY_DISCONNECT_RSP;
                    default:
                        switch (i) {
                            case 47:
                                return CIM_DM_GET_CONTROL_CENTER;
                            case 48:
                                return CIM_DM_SET_CONTROL_CENTER;
                            case 49:
                                return CIM_DM_RECV_NOTIFY;
                            default:
                                switch (i) {
                                    case 73:
                                        return CIM_DM_SYNC_PHONE_KEEP_ALIVE;
                                    case 74:
                                        return CIM_DM_GET_QUICK_CENTER;
                                    case 75:
                                        return CIM_DM_SET_QUICK_CENTER;
                                    default:
                                        switch (i) {
                                            case 114:
                                                return CID_DM_FLASH_BACK_STATUS;
                                            case 115:
                                                return CID_DM_CROSS_SCREEN_STATUS;
                                            case 116:
                                                return CIM_DM_WIFI_PUBLIC_KEY;
                                            case 117:
                                                return CIM_DM_WIFI_INFO;
                                            case 118:
                                                return CIM_DM_OPEN_SOURCE_APP_LIST;
                                            case 119:
                                                return CID_DM_MARKET_MODE_AREA_INFOS;
                                            case 120:
                                                return CID_DM_MARKET_MODE_REPORT_INFOS;
                                            case 121:
                                                return CID_DM_MARKET_MODE_STATUS;
                                            default:
                                                switch (i) {
                                                    case 158:
                                                        return CID_DM_CHECK_P2P_PERMISSION;
                                                    case 159:
                                                        return CID_DM_VOICE_PACKET_INFO;
                                                    case 160:
                                                        return CID_DM_VOICE_PACKET_SUMMARY;
                                                    case 161:
                                                        return CID_DM_GET_CUSTOM_IP_SETTING;
                                                    case 162:
                                                        return CID_DM_SET_CUSTOM_IP_SETTING;
                                                    case 163:
                                                        return CID_DM_CUSTOM_IP_SETTING_NOTIFY;
                                                    case 164:
                                                        return CID_DM_VOICE_PACKET_INFO_NOTIFY;
                                                    case 165:
                                                        return CID_DM_RECOVER_TRANSMISSION;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static Internal.EnumLiteMap<DMProto$DMCmdId> internalGetValueMap() {
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
    public static DMProto$DMCmdId valueOf(int i) {
        return forNumber(i);
    }
}
