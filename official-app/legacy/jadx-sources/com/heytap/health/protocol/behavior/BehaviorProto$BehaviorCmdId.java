package com.heytap.health.protocol.behavior;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum BehaviorProto$BehaviorCmdId implements Internal.EnumLite {
    BEHAVIOR_CMD_PLACE_HOLDER(0),
    BEHAVIOR_SEND_STATUS(1),
    BEHAVIOR_GET_STATUS(2),
    UNRECOGNIZED(-1);

    public static final int BEHAVIOR_CMD_PLACE_HOLDER_VALUE = 0;
    public static final int BEHAVIOR_GET_STATUS_VALUE = 2;
    public static final int BEHAVIOR_SEND_STATUS_VALUE = 1;
    private static final Internal.EnumLiteMap<BehaviorProto$BehaviorCmdId> internalValueMap = new Internal.EnumLiteMap<BehaviorProto$BehaviorCmdId>() { // from class: com.heytap.health.protocol.behavior.BehaviorProto$BehaviorCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BehaviorProto$BehaviorCmdId findValueByNumber(int i) {
            return BehaviorProto$BehaviorCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return BehaviorProto$BehaviorCmdId.forNumber(i) != null;
        }
    }

    BehaviorProto$BehaviorCmdId(int i) {
        this.value = i;
    }

    public static BehaviorProto$BehaviorCmdId forNumber(int i) {
        if (i == 0) {
            return BEHAVIOR_CMD_PLACE_HOLDER;
        }
        if (i == 1) {
            return BEHAVIOR_SEND_STATUS;
        }
        if (i != 2) {
            return null;
        }
        return BEHAVIOR_GET_STATUS;
    }

    public static Internal.EnumLiteMap<BehaviorProto$BehaviorCmdId> internalGetValueMap() {
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
    public static BehaviorProto$BehaviorCmdId valueOf(int i) {
        return forNumber(i);
    }
}
