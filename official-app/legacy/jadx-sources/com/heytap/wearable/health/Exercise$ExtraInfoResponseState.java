package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExtraInfoResponseState implements Internal.EnumLite {
    EXTRA_INFO_RESPONSE_STATE_UNKNOWN(0),
    SUCCESS(1),
    INDEX_ERROR(2),
    CRC_ERROR(3),
    LENGTH_ERROR(4),
    UNRECOGNIZED(-1);

    public static final int CRC_ERROR_VALUE = 3;
    public static final int EXTRA_INFO_RESPONSE_STATE_UNKNOWN_VALUE = 0;
    public static final int INDEX_ERROR_VALUE = 2;
    public static final int LENGTH_ERROR_VALUE = 4;
    public static final int SUCCESS_VALUE = 1;
    private static final Internal.EnumLiteMap<Exercise$ExtraInfoResponseState> internalValueMap = new Internal.EnumLiteMap<Exercise$ExtraInfoResponseState>() { // from class: com.heytap.wearable.health.Exercise$ExtraInfoResponseState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExtraInfoResponseState findValueByNumber(int i) {
            return Exercise$ExtraInfoResponseState.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExtraInfoResponseState.forNumber(i) != null;
        }
    }

    Exercise$ExtraInfoResponseState(int i) {
        this.value = i;
    }

    public static Exercise$ExtraInfoResponseState forNumber(int i) {
        if (i == 0) {
            return EXTRA_INFO_RESPONSE_STATE_UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return INDEX_ERROR;
        }
        if (i == 3) {
            return CRC_ERROR;
        }
        if (i != 4) {
            return null;
        }
        return LENGTH_ERROR;
    }

    public static Internal.EnumLiteMap<Exercise$ExtraInfoResponseState> internalGetValueMap() {
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
    public static Exercise$ExtraInfoResponseState valueOf(int i) {
        return forNumber(i);
    }
}
