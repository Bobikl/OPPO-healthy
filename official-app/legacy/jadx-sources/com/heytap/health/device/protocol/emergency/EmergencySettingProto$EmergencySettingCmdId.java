package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum EmergencySettingProto$EmergencySettingCmdId implements Internal.EnumLite {
    CMD_ID_EMERGENCY_SETTING_UNDEFINE(0),
    CMD_ID_EMERGENCY_SWITCH_INFO(1),
    CMD_ID_EMERGENCY_SWITCH_REQUEST(2),
    CMD_ID_EMERGENCY_CONTACT_INFO(3),
    CMD_ID_EMERGENCY_CONTACT_REQUEST(4),
    CMD_ID_EMERGENCY_CARD_INFO(5),
    CMD_ID_EMERGENCY_CARD_REQUEST(6),
    CMD_ID_EMERGENCY_ESIM_NUMBER_INFO(7),
    CMD_ID_EMERGENCY_ESIM_NUMBER_REQUEST(8),
    CMD_ID_EMERGENCY_110(14),
    CMD_ID_EMERGENCY_GET_110(15),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_EMERGENCY_110_VALUE = 14;
    public static final int CMD_ID_EMERGENCY_CARD_INFO_VALUE = 5;
    public static final int CMD_ID_EMERGENCY_CARD_REQUEST_VALUE = 6;
    public static final int CMD_ID_EMERGENCY_CONTACT_INFO_VALUE = 3;
    public static final int CMD_ID_EMERGENCY_CONTACT_REQUEST_VALUE = 4;
    public static final int CMD_ID_EMERGENCY_ESIM_NUMBER_INFO_VALUE = 7;
    public static final int CMD_ID_EMERGENCY_ESIM_NUMBER_REQUEST_VALUE = 8;
    public static final int CMD_ID_EMERGENCY_GET_110_VALUE = 15;
    public static final int CMD_ID_EMERGENCY_SETTING_UNDEFINE_VALUE = 0;
    public static final int CMD_ID_EMERGENCY_SWITCH_INFO_VALUE = 1;
    public static final int CMD_ID_EMERGENCY_SWITCH_REQUEST_VALUE = 2;
    private static final Internal.EnumLiteMap<EmergencySettingProto$EmergencySettingCmdId> internalValueMap = new Internal.EnumLiteMap<EmergencySettingProto$EmergencySettingCmdId>() { // from class: com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencySettingCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EmergencySettingProto$EmergencySettingCmdId findValueByNumber(int i) {
            return EmergencySettingProto$EmergencySettingCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return EmergencySettingProto$EmergencySettingCmdId.forNumber(i) != null;
        }
    }

    EmergencySettingProto$EmergencySettingCmdId(int i) {
        this.value = i;
    }

    public static EmergencySettingProto$EmergencySettingCmdId forNumber(int i) {
        if (i == 14) {
            return CMD_ID_EMERGENCY_110;
        }
        if (i == 15) {
            return CMD_ID_EMERGENCY_GET_110;
        }
        switch (i) {
            case 0:
                return CMD_ID_EMERGENCY_SETTING_UNDEFINE;
            case 1:
                return CMD_ID_EMERGENCY_SWITCH_INFO;
            case 2:
                return CMD_ID_EMERGENCY_SWITCH_REQUEST;
            case 3:
                return CMD_ID_EMERGENCY_CONTACT_INFO;
            case 4:
                return CMD_ID_EMERGENCY_CONTACT_REQUEST;
            case 5:
                return CMD_ID_EMERGENCY_CARD_INFO;
            case 6:
                return CMD_ID_EMERGENCY_CARD_REQUEST;
            case 7:
                return CMD_ID_EMERGENCY_ESIM_NUMBER_INFO;
            case 8:
                return CMD_ID_EMERGENCY_ESIM_NUMBER_REQUEST;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EmergencySettingProto$EmergencySettingCmdId> internalGetValueMap() {
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
    public static EmergencySettingProto$EmergencySettingCmdId valueOf(int i) {
        return forNumber(i);
    }
}
