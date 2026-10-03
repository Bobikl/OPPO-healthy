package com.heytap.health.telecom.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum TelecomProto$HfpCmdId implements Internal.EnumLite {
    CMD_ID_HFP_UNDEFINE(0),
    CMD_ID_HFP_PHONE_CALL_CHANGE_STATUS(1),
    CMD_ID_HFP_WATCH_CALL_CHANGE_STATUS(2),
    CMD_ID_HFP_CONTROL_PHONE_PLACE_CALL(3),
    CMD_ID_HFP_PHONE_SIM_STATE_CHANGE(6),
    CMD_ID_CALL_EXTRA_INFO(7),
    CMD_ID_HFP_PHONE_SET_CALL_AUDIO_STATE(8),
    CMD_ID_HFP_WATCH_SET_CALL_AUDIO_STATE(9),
    CMD_ID_HFP_WATCH_SUPPORT_AUDIO_SWITCH(10),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_CALL_EXTRA_INFO_VALUE = 7;
    public static final int CMD_ID_HFP_CONTROL_PHONE_PLACE_CALL_VALUE = 3;
    public static final int CMD_ID_HFP_PHONE_CALL_CHANGE_STATUS_VALUE = 1;
    public static final int CMD_ID_HFP_PHONE_SET_CALL_AUDIO_STATE_VALUE = 8;
    public static final int CMD_ID_HFP_PHONE_SIM_STATE_CHANGE_VALUE = 6;
    public static final int CMD_ID_HFP_UNDEFINE_VALUE = 0;
    public static final int CMD_ID_HFP_WATCH_CALL_CHANGE_STATUS_VALUE = 2;
    public static final int CMD_ID_HFP_WATCH_SET_CALL_AUDIO_STATE_VALUE = 9;
    public static final int CMD_ID_HFP_WATCH_SUPPORT_AUDIO_SWITCH_VALUE = 10;
    private static final Internal.EnumLiteMap<TelecomProto$HfpCmdId> internalValueMap = new Internal.EnumLiteMap<TelecomProto$HfpCmdId>() { // from class: com.heytap.health.telecom.proto.TelecomProto$HfpCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TelecomProto$HfpCmdId findValueByNumber(int i) {
            return TelecomProto$HfpCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TelecomProto$HfpCmdId.forNumber(i) != null;
        }
    }

    TelecomProto$HfpCmdId(int i) {
        this.value = i;
    }

    public static TelecomProto$HfpCmdId forNumber(int i) {
        switch (i) {
            case 0:
                return CMD_ID_HFP_UNDEFINE;
            case 1:
                return CMD_ID_HFP_PHONE_CALL_CHANGE_STATUS;
            case 2:
                return CMD_ID_HFP_WATCH_CALL_CHANGE_STATUS;
            case 3:
                return CMD_ID_HFP_CONTROL_PHONE_PLACE_CALL;
            case 4:
            case 5:
            default:
                return null;
            case 6:
                return CMD_ID_HFP_PHONE_SIM_STATE_CHANGE;
            case 7:
                return CMD_ID_CALL_EXTRA_INFO;
            case 8:
                return CMD_ID_HFP_PHONE_SET_CALL_AUDIO_STATE;
            case 9:
                return CMD_ID_HFP_WATCH_SET_CALL_AUDIO_STATE;
            case 10:
                return CMD_ID_HFP_WATCH_SUPPORT_AUDIO_SWITCH;
        }
    }

    public static Internal.EnumLiteMap<TelecomProto$HfpCmdId> internalGetValueMap() {
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
    public static TelecomProto$HfpCmdId valueOf(int i) {
        return forNumber(i);
    }
}
