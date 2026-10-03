package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$AskStatusRespResultCode implements Internal.EnumLite {
    UNKNOWN(0),
    OK(1),
    LOW_POWER(2),
    LOW_MEMORY(3),
    KEY_ERROR(4),
    UNRECOGNIZED(-1);

    public static final int KEY_ERROR_VALUE = 4;
    public static final int LOW_MEMORY_VALUE = 3;
    public static final int LOW_POWER_VALUE = 2;
    public static final int OK_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Proto$AskStatusRespResultCode> internalValueMap = new Internal.EnumLiteMap<Proto$AskStatusRespResultCode>() { // from class: com.heytap.health.watch.watchface.proto.Proto$AskStatusRespResultCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$AskStatusRespResultCode findValueByNumber(int i) {
            return Proto$AskStatusRespResultCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$AskStatusRespResultCode.forNumber(i) != null;
        }
    }

    Proto$AskStatusRespResultCode(int i) {
        this.value = i;
    }

    public static Proto$AskStatusRespResultCode forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OK;
        }
        if (i == 2) {
            return LOW_POWER;
        }
        if (i == 3) {
            return LOW_MEMORY;
        }
        if (i != 4) {
            return null;
        }
        return KEY_ERROR;
    }

    public static Internal.EnumLiteMap<Proto$AskStatusRespResultCode> internalGetValueMap() {
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
    public static Proto$AskStatusRespResultCode valueOf(int i) {
        return forNumber(i);
    }
}
