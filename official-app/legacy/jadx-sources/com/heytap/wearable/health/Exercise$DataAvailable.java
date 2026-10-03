package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$DataAvailable implements Internal.EnumLite {
    DATA_AVAILABILITY_UNKNOWN(0),
    DATA_AVAILABILITY_UNAVAILABLE(1),
    DATA_AVAILABILITY_ACQUIRING(2),
    DATA_AVAILABILITY_AVAILABLE(3),
    UNRECOGNIZED(-1);

    public static final int DATA_AVAILABILITY_ACQUIRING_VALUE = 2;
    public static final int DATA_AVAILABILITY_AVAILABLE_VALUE = 3;
    public static final int DATA_AVAILABILITY_UNAVAILABLE_VALUE = 1;
    public static final int DATA_AVAILABILITY_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$DataAvailable> internalValueMap = new Internal.EnumLiteMap<Exercise$DataAvailable>() { // from class: com.heytap.wearable.health.Exercise$DataAvailable.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$DataAvailable findValueByNumber(int i) {
            return Exercise$DataAvailable.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$DataAvailable.forNumber(i) != null;
        }
    }

    Exercise$DataAvailable(int i) {
        this.value = i;
    }

    public static Exercise$DataAvailable forNumber(int i) {
        if (i == 0) {
            return DATA_AVAILABILITY_UNKNOWN;
        }
        if (i == 1) {
            return DATA_AVAILABILITY_UNAVAILABLE;
        }
        if (i == 2) {
            return DATA_AVAILABILITY_ACQUIRING;
        }
        if (i != 3) {
            return null;
        }
        return DATA_AVAILABILITY_AVAILABLE;
    }

    public static Internal.EnumLiteMap<Exercise$DataAvailable> internalGetValueMap() {
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
    public static Exercise$DataAvailable valueOf(int i) {
        return forNumber(i);
    }
}
