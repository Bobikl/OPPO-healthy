package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public enum GMS_CMD implements Internal.EnumLite {
    GMS_CMD_UNDEFINE(0),
    GMS_CMD_GET_MAC(1),
    GMS_CMD_PING(2),
    UNRECOGNIZED(-1);

    public static final int GMS_CMD_GET_MAC_VALUE = 1;
    public static final int GMS_CMD_PING_VALUE = 2;
    public static final int GMS_CMD_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<GMS_CMD> internalValueMap = new Internal.EnumLiteMap<GMS_CMD>() { // from class: com.oplus.wearable.linkservice.transport.consult.proto.GMS_CMD.1
        public GMS_CMD findValueByNumber(int i) {
            return GMS_CMD.forNumber(i);
        }
    };
    private final int value;

    public static final class GMS_CMDVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new GMS_CMDVerifier();

        private GMS_CMDVerifier() {
        }

        public boolean isInRange(int i) {
            return GMS_CMD.forNumber(i) != null;
        }
    }

    GMS_CMD(int i) {
        this.value = i;
    }

    public static GMS_CMD forNumber(int i) {
        if (i == 0) {
            return GMS_CMD_UNDEFINE;
        }
        if (i == 1) {
            return GMS_CMD_GET_MAC;
        }
        if (i != 2) {
            return null;
        }
        return GMS_CMD_PING;
    }

    public static Internal.EnumLiteMap<GMS_CMD> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return GMS_CMDVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static GMS_CMD valueOf(int i) {
        return forNumber(i);
    }
}
