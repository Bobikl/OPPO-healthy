package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum GameAssistantProto$GameAssistantCmdId implements Internal.EnumLite {
    GAME_ASSISTANT_CMD_PLACE_HOLDER(0),
    CMD_GAME_STATE_CHANGED(1),
    CMD_GAME_ROUND_STATE_CHANGED(2),
    CMD_GAME_VIBRATION(3),
    CMD_GAME_ROUND_DATA_REPORT(4),
    CMD_GAME_WEAR_CONFIG_TO_PHONE(5),
    CMD_GAME_PHONE_CONFIG_TO_WEAR(6),
    CMD_GAME_FLASHBACK_TO_WEAR(8),
    CMD_OPEN_GAME(9),
    CMD_REQUEST_CTA_PERMISSION(10),
    UNRECOGNIZED(-1);

    public static final int CMD_GAME_FLASHBACK_TO_WEAR_VALUE = 8;
    public static final int CMD_GAME_PHONE_CONFIG_TO_WEAR_VALUE = 6;
    public static final int CMD_GAME_ROUND_DATA_REPORT_VALUE = 4;
    public static final int CMD_GAME_ROUND_STATE_CHANGED_VALUE = 2;
    public static final int CMD_GAME_STATE_CHANGED_VALUE = 1;
    public static final int CMD_GAME_VIBRATION_VALUE = 3;
    public static final int CMD_GAME_WEAR_CONFIG_TO_PHONE_VALUE = 5;
    public static final int CMD_OPEN_GAME_VALUE = 9;
    public static final int CMD_REQUEST_CTA_PERMISSION_VALUE = 10;
    public static final int GAME_ASSISTANT_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<GameAssistantProto$GameAssistantCmdId> internalValueMap = new Internal.EnumLiteMap<GameAssistantProto$GameAssistantCmdId>() { // from class: com.heytap.health.protocol.fitness.GameAssistantProto$GameAssistantCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameAssistantProto$GameAssistantCmdId findValueByNumber(int i) {
            return GameAssistantProto$GameAssistantCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return GameAssistantProto$GameAssistantCmdId.forNumber(i) != null;
        }
    }

    GameAssistantProto$GameAssistantCmdId(int i) {
        this.value = i;
    }

    public static GameAssistantProto$GameAssistantCmdId forNumber(int i) {
        switch (i) {
            case 0:
                return GAME_ASSISTANT_CMD_PLACE_HOLDER;
            case 1:
                return CMD_GAME_STATE_CHANGED;
            case 2:
                return CMD_GAME_ROUND_STATE_CHANGED;
            case 3:
                return CMD_GAME_VIBRATION;
            case 4:
                return CMD_GAME_ROUND_DATA_REPORT;
            case 5:
                return CMD_GAME_WEAR_CONFIG_TO_PHONE;
            case 6:
                return CMD_GAME_PHONE_CONFIG_TO_WEAR;
            case 7:
            default:
                return null;
            case 8:
                return CMD_GAME_FLASHBACK_TO_WEAR;
            case 9:
                return CMD_OPEN_GAME;
            case 10:
                return CMD_REQUEST_CTA_PERMISSION;
        }
    }

    public static Internal.EnumLiteMap<GameAssistantProto$GameAssistantCmdId> internalGetValueMap() {
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
    public static GameAssistantProto$GameAssistantCmdId valueOf(int i) {
        return forNumber(i);
    }
}
