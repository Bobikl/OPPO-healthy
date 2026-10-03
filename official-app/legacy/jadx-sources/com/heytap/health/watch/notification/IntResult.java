package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum IntResult implements Internal.EnumLite {
    RESULT_NTF_UNDEFINE(0),
    RESULT_NOTIFY_SUCCESS(1),
    RESULT_209_NEGOTIATE_FAIL(-5),
    RESULT_NET_ERROR_UNKNOWN(-4),
    RESULT_DEVICE_NET_ERROR(-3),
    RESULT_DEVICE_GUID_ERROR(-2),
    RESULT_DEVICE_REG_ID_ERROR(-1),
    UNRECOGNIZED(-1);

    public static final int RESULT_209_NEGOTIATE_FAIL_VALUE = -5;
    public static final int RESULT_DEVICE_GUID_ERROR_VALUE = -2;
    public static final int RESULT_DEVICE_NET_ERROR_VALUE = -3;
    public static final int RESULT_DEVICE_REG_ID_ERROR_VALUE = -1;
    public static final int RESULT_NET_ERROR_UNKNOWN_VALUE = -4;
    public static final int RESULT_NOTIFY_SUCCESS_VALUE = 1;
    public static final int RESULT_NTF_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<IntResult> internalValueMap = new Internal.EnumLiteMap<IntResult>() { // from class: com.heytap.health.watch.notification.IntResult.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntResult findValueByNumber(int i) {
            return IntResult.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IntResult.forNumber(i) != null;
        }
    }

    IntResult(int i) {
        this.value = i;
    }

    public static IntResult forNumber(int i) {
        switch (i) {
            case -5:
                return RESULT_209_NEGOTIATE_FAIL;
            case -4:
                return RESULT_NET_ERROR_UNKNOWN;
            case -3:
                return RESULT_DEVICE_NET_ERROR;
            case -2:
                return RESULT_DEVICE_GUID_ERROR;
            case -1:
                return RESULT_DEVICE_REG_ID_ERROR;
            case 0:
                return RESULT_NTF_UNDEFINE;
            case 1:
                return RESULT_NOTIFY_SUCCESS;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<IntResult> internalGetValueMap() {
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
    public static IntResult valueOf(int i) {
        return forNumber(i);
    }
}
