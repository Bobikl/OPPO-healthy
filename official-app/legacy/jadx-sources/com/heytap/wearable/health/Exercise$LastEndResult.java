package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$LastEndResult implements Internal.EnumLite {
    LAST_END_NO_DATA(0),
    LAST_END_HAS_DATA(1),
    UNRECOGNIZED(-1);

    public static final int LAST_END_HAS_DATA_VALUE = 1;
    public static final int LAST_END_NO_DATA_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$LastEndResult> internalValueMap = new Internal.EnumLiteMap<Exercise$LastEndResult>() { // from class: com.heytap.wearable.health.Exercise$LastEndResult.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$LastEndResult findValueByNumber(int i) {
            return Exercise$LastEndResult.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$LastEndResult.forNumber(i) != null;
        }
    }

    Exercise$LastEndResult(int i) {
        this.value = i;
    }

    public static Exercise$LastEndResult forNumber(int i) {
        if (i == 0) {
            return LAST_END_NO_DATA;
        }
        if (i != 1) {
            return null;
        }
        return LAST_END_HAS_DATA;
    }

    public static Internal.EnumLiteMap<Exercise$LastEndResult> internalGetValueMap() {
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
    public static Exercise$LastEndResult valueOf(int i) {
        return forNumber(i);
    }
}
