package com.heytap.health.protocol.debug;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DebugProto$DebugCmdId implements Internal.EnumLite {
    HOLDER(0),
    ADB_CMD(1),
    ADB_STATE(2),
    UNRECOGNIZED(-1);

    public static final int ADB_CMD_VALUE = 1;
    public static final int ADB_STATE_VALUE = 2;
    public static final int HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<DebugProto$DebugCmdId> internalValueMap = new Internal.EnumLiteMap<DebugProto$DebugCmdId>() { // from class: com.heytap.health.protocol.debug.DebugProto$DebugCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DebugProto$DebugCmdId findValueByNumber(int i) {
            return DebugProto$DebugCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DebugProto$DebugCmdId.forNumber(i) != null;
        }
    }

    DebugProto$DebugCmdId(int i) {
        this.value = i;
    }

    public static DebugProto$DebugCmdId forNumber(int i) {
        if (i == 0) {
            return HOLDER;
        }
        if (i == 1) {
            return ADB_CMD;
        }
        if (i != 2) {
            return null;
        }
        return ADB_STATE;
    }

    public static Internal.EnumLiteMap<DebugProto$DebugCmdId> internalGetValueMap() {
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
    public static DebugProto$DebugCmdId valueOf(int i) {
        return forNumber(i);
    }
}
