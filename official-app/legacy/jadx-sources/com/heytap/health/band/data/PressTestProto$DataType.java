package com.heytap.health.band.data;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum PressTestProto$DataType implements Internal.EnumLite {
    UNDEFINE(0),
    RANDOM(1),
    CUSTOM(2),
    UNRECOGNIZED(-1);

    public static final int CUSTOM_VALUE = 2;
    public static final int RANDOM_VALUE = 1;
    public static final int UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<PressTestProto$DataType> internalValueMap = new Internal.EnumLiteMap<PressTestProto$DataType>() { // from class: com.heytap.health.band.data.PressTestProto$DataType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PressTestProto$DataType findValueByNumber(int i) {
            return PressTestProto$DataType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PressTestProto$DataType.forNumber(i) != null;
        }
    }

    PressTestProto$DataType(int i) {
        this.value = i;
    }

    public static PressTestProto$DataType forNumber(int i) {
        if (i == 0) {
            return UNDEFINE;
        }
        if (i == 1) {
            return RANDOM;
        }
        if (i != 2) {
            return null;
        }
        return CUSTOM;
    }

    public static Internal.EnumLiteMap<PressTestProto$DataType> internalGetValueMap() {
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
    public static PressTestProto$DataType valueOf(int i) {
        return forNumber(i);
    }
}
