package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProto$HR_ZONES_TYPE implements Internal.EnumLite {
    ZONES_NULL(0),
    ZONES_WARN_UP(1),
    ZONES_FAT_LOSS(2),
    ZONES_ENDURANCE(3),
    ZONES_ANAEROBIC(4),
    ZONES_LIMIT(5),
    ZONES_CUSTOM(6),
    ZONES_MAX(7),
    UNRECOGNIZED(-1);

    public static final int ZONES_ANAEROBIC_VALUE = 4;
    public static final int ZONES_CUSTOM_VALUE = 6;
    public static final int ZONES_ENDURANCE_VALUE = 3;
    public static final int ZONES_FAT_LOSS_VALUE = 2;
    public static final int ZONES_LIMIT_VALUE = 5;
    public static final int ZONES_MAX_VALUE = 7;
    public static final int ZONES_NULL_VALUE = 0;
    public static final int ZONES_WARN_UP_VALUE = 1;
    private static final Internal.EnumLiteMap<FitnessProto$HR_ZONES_TYPE> internalValueMap = new Internal.EnumLiteMap<FitnessProto$HR_ZONES_TYPE>() { // from class: com.heytap.health.protocol.fitness.FitnessProto$HR_ZONES_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProto$HR_ZONES_TYPE findValueByNumber(int i) {
            return FitnessProto$HR_ZONES_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProto$HR_ZONES_TYPE.forNumber(i) != null;
        }
    }

    FitnessProto$HR_ZONES_TYPE(int i) {
        this.value = i;
    }

    public static FitnessProto$HR_ZONES_TYPE forNumber(int i) {
        switch (i) {
            case 0:
                return ZONES_NULL;
            case 1:
                return ZONES_WARN_UP;
            case 2:
                return ZONES_FAT_LOSS;
            case 3:
                return ZONES_ENDURANCE;
            case 4:
                return ZONES_ANAEROBIC;
            case 5:
                return ZONES_LIMIT;
            case 6:
                return ZONES_CUSTOM;
            case 7:
                return ZONES_MAX;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<FitnessProto$HR_ZONES_TYPE> internalGetValueMap() {
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
    public static FitnessProto$HR_ZONES_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
