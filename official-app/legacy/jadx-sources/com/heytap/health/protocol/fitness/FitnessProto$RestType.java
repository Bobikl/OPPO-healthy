package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProto$RestType implements Internal.EnumLite {
    ONLY_ONCE(0),
    WORKING_DAY(1),
    CUSTOMIZE(2),
    UNRECOGNIZED(-1);

    public static final int CUSTOMIZE_VALUE = 2;
    public static final int ONLY_ONCE_VALUE = 0;
    public static final int WORKING_DAY_VALUE = 1;
    private static final Internal.EnumLiteMap<FitnessProto$RestType> internalValueMap = new Internal.EnumLiteMap<FitnessProto$RestType>() { // from class: com.heytap.health.protocol.fitness.FitnessProto$RestType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProto$RestType findValueByNumber(int i) {
            return FitnessProto$RestType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProto$RestType.forNumber(i) != null;
        }
    }

    FitnessProto$RestType(int i) {
        this.value = i;
    }

    public static FitnessProto$RestType forNumber(int i) {
        if (i == 0) {
            return ONLY_ONCE;
        }
        if (i == 1) {
            return WORKING_DAY;
        }
        if (i != 2) {
            return null;
        }
        return CUSTOMIZE;
    }

    public static Internal.EnumLiteMap<FitnessProto$RestType> internalGetValueMap() {
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
    public static FitnessProto$RestType valueOf(int i) {
        return forNumber(i);
    }
}
