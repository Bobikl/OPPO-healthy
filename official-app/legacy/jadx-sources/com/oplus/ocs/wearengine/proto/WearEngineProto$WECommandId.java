package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum WearEngineProto$WECommandId implements Internal.EnumLite {
    CMD_ID_WEARABLE_UNDEFINE(0),
    CMD_ID_WEARABLE_REQUEST(1),
    CMD_ID_WEARABLE_RESPONSE(2),
    CMD_ID_WEARABLE_PRI_REQUEST(3),
    CMD_ID_WEARABLE_PRI_RESPONSE(4),
    CMD_ID_WEARABLE_REQUEST_AWAKE(5),
    CMD_ID_WEARABLE_RESPONSE_AWAKE(6),
    CMD_ID_WEARABLE_PRI_REQUEST_AWAKE(7),
    CMD_ID_WEARABLE_PRI_RESPONSE_AWAKE(8),
    CMD_ID_WEARABLE_SYNC_PERMISSION(9),
    CMD_ID_WEARABLE_SYNC_WORKOUT_DATA(101),
    CMD_ID_WEARABLE_SYNC_WORKOUT_DATA_RESPONSE(102),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_WEARABLE_PRI_REQUEST_AWAKE_VALUE = 7;
    public static final int CMD_ID_WEARABLE_PRI_REQUEST_VALUE = 3;
    public static final int CMD_ID_WEARABLE_PRI_RESPONSE_AWAKE_VALUE = 8;
    public static final int CMD_ID_WEARABLE_PRI_RESPONSE_VALUE = 4;
    public static final int CMD_ID_WEARABLE_REQUEST_AWAKE_VALUE = 5;
    public static final int CMD_ID_WEARABLE_REQUEST_VALUE = 1;
    public static final int CMD_ID_WEARABLE_RESPONSE_AWAKE_VALUE = 6;
    public static final int CMD_ID_WEARABLE_RESPONSE_VALUE = 2;
    public static final int CMD_ID_WEARABLE_SYNC_PERMISSION_VALUE = 9;
    public static final int CMD_ID_WEARABLE_SYNC_WORKOUT_DATA_RESPONSE_VALUE = 102;
    public static final int CMD_ID_WEARABLE_SYNC_WORKOUT_DATA_VALUE = 101;
    public static final int CMD_ID_WEARABLE_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<WearEngineProto$WECommandId> internalValueMap = new Internal.EnumLiteMap<WearEngineProto$WECommandId>() { // from class: com.oplus.ocs.wearengine.proto.WearEngineProto$WECommandId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WearEngineProto$WECommandId findValueByNumber(int i) {
            return WearEngineProto$WECommandId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WearEngineProto$WECommandId.forNumber(i) != null;
        }
    }

    WearEngineProto$WECommandId(int i) {
        this.value = i;
    }

    public static WearEngineProto$WECommandId forNumber(int i) {
        if (i == 101) {
            return CMD_ID_WEARABLE_SYNC_WORKOUT_DATA;
        }
        if (i == 102) {
            return CMD_ID_WEARABLE_SYNC_WORKOUT_DATA_RESPONSE;
        }
        switch (i) {
            case 0:
                return CMD_ID_WEARABLE_UNDEFINE;
            case 1:
                return CMD_ID_WEARABLE_REQUEST;
            case 2:
                return CMD_ID_WEARABLE_RESPONSE;
            case 3:
                return CMD_ID_WEARABLE_PRI_REQUEST;
            case 4:
                return CMD_ID_WEARABLE_PRI_RESPONSE;
            case 5:
                return CMD_ID_WEARABLE_REQUEST_AWAKE;
            case 6:
                return CMD_ID_WEARABLE_RESPONSE_AWAKE;
            case 7:
                return CMD_ID_WEARABLE_PRI_REQUEST_AWAKE;
            case 8:
                return CMD_ID_WEARABLE_PRI_RESPONSE_AWAKE;
            case 9:
                return CMD_ID_WEARABLE_SYNC_PERMISSION;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<WearEngineProto$WECommandId> internalGetValueMap() {
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
    public static WearEngineProto$WECommandId valueOf(int i) {
        return forNumber(i);
    }
}
