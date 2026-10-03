package com.heytap.health.protocol.spirit;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum HealthSpiritProto$SpiritCmdId implements Internal.EnumLite {
    HEALTH_SPIRIT_CMD_PLACE_HOLDER(0),
    CMD_HEALTH_SPIRIT_ARCHIVE_SAVE(1),
    CMD_HEALTH_SPIRIT_ARCHIVE_GET(2),
    CMD_HEALTH_SPIRIT_TASK_GET(3),
    UNRECOGNIZED(-1);

    public static final int CMD_HEALTH_SPIRIT_ARCHIVE_GET_VALUE = 2;
    public static final int CMD_HEALTH_SPIRIT_ARCHIVE_SAVE_VALUE = 1;
    public static final int CMD_HEALTH_SPIRIT_TASK_GET_VALUE = 3;
    public static final int HEALTH_SPIRIT_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<HealthSpiritProto$SpiritCmdId> internalValueMap = new Internal.EnumLiteMap<HealthSpiritProto$SpiritCmdId>() { // from class: com.heytap.health.protocol.spirit.HealthSpiritProto$SpiritCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HealthSpiritProto$SpiritCmdId findValueByNumber(int i) {
            return HealthSpiritProto$SpiritCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return HealthSpiritProto$SpiritCmdId.forNumber(i) != null;
        }
    }

    HealthSpiritProto$SpiritCmdId(int i) {
        this.value = i;
    }

    public static HealthSpiritProto$SpiritCmdId forNumber(int i) {
        if (i == 0) {
            return HEALTH_SPIRIT_CMD_PLACE_HOLDER;
        }
        if (i == 1) {
            return CMD_HEALTH_SPIRIT_ARCHIVE_SAVE;
        }
        if (i == 2) {
            return CMD_HEALTH_SPIRIT_ARCHIVE_GET;
        }
        if (i != 3) {
            return null;
        }
        return CMD_HEALTH_SPIRIT_TASK_GET;
    }

    public static Internal.EnumLiteMap<HealthSpiritProto$SpiritCmdId> internalGetValueMap() {
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
    public static HealthSpiritProto$SpiritCmdId valueOf(int i) {
        return forNumber(i);
    }
}
