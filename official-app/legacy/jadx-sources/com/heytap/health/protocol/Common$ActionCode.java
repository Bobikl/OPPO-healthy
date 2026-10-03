package com.heytap.health.protocol;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum Common$ActionCode implements Internal.EnumLite {
    ACTION_HOLDER(0),
    ACTION_SUCCESS(100000),
    ACTION_FAIL(100001),
    UNRECOGNIZED(-1);

    public static final int ACTION_FAIL_VALUE = 100001;
    public static final int ACTION_HOLDER_VALUE = 0;
    public static final int ACTION_SUCCESS_VALUE = 100000;
    private static final Internal.EnumLiteMap<Common$ActionCode> internalValueMap = new Internal.EnumLiteMap<Common$ActionCode>() { // from class: com.heytap.health.protocol.Common$ActionCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Common$ActionCode findValueByNumber(int i) {
            return Common$ActionCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Common$ActionCode.forNumber(i) != null;
        }
    }

    Common$ActionCode(int i) {
        this.value = i;
    }

    public static Common$ActionCode forNumber(int i) {
        if (i == 0) {
            return ACTION_HOLDER;
        }
        switch (i) {
            case 100000:
                return ACTION_SUCCESS;
            case 100001:
                return ACTION_FAIL;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Common$ActionCode> internalGetValueMap() {
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
    public static Common$ActionCode valueOf(int i) {
        return forNumber(i);
    }
}
