package com.heytap.health.protocol.dnd;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DNDProto$DNDCmdId implements Internal.EnumLite {
    HEALTH_DND_CMD_PLACE_HOLDER(0),
    CMD_DND_READ_FROM_DEVICE(107),
    CMD_DND_SEND_TO_DEVICE(108),
    CMD_DND_NOTIFY_FROM_DEVICE(109),
    CMD_DND_SEND_IS_SUPPORT_TO_DEVICE(110),
    CMD_DND_CHANGE_NOTIFICATION_TO_DEVICE(168),
    UNRECOGNIZED(-1);

    public static final int CMD_DND_CHANGE_NOTIFICATION_TO_DEVICE_VALUE = 168;
    public static final int CMD_DND_NOTIFY_FROM_DEVICE_VALUE = 109;
    public static final int CMD_DND_READ_FROM_DEVICE_VALUE = 107;
    public static final int CMD_DND_SEND_IS_SUPPORT_TO_DEVICE_VALUE = 110;
    public static final int CMD_DND_SEND_TO_DEVICE_VALUE = 108;
    public static final int HEALTH_DND_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<DNDProto$DNDCmdId> internalValueMap = new Internal.EnumLiteMap<DNDProto$DNDCmdId>() { // from class: com.heytap.health.protocol.dnd.DNDProto$DNDCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DNDProto$DNDCmdId findValueByNumber(int i) {
            return DNDProto$DNDCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DNDProto$DNDCmdId.forNumber(i) != null;
        }
    }

    DNDProto$DNDCmdId(int i) {
        this.value = i;
    }

    public static DNDProto$DNDCmdId forNumber(int i) {
        if (i == 0) {
            return HEALTH_DND_CMD_PLACE_HOLDER;
        }
        if (i == 168) {
            return CMD_DND_CHANGE_NOTIFICATION_TO_DEVICE;
        }
        switch (i) {
            case 107:
                return CMD_DND_READ_FROM_DEVICE;
            case 108:
                return CMD_DND_SEND_TO_DEVICE;
            case 109:
                return CMD_DND_NOTIFY_FROM_DEVICE;
            case 110:
                return CMD_DND_SEND_IS_SUPPORT_TO_DEVICE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<DNDProto$DNDCmdId> internalGetValueMap() {
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
    public static DNDProto$DNDCmdId valueOf(int i) {
        return forNumber(i);
    }
}
