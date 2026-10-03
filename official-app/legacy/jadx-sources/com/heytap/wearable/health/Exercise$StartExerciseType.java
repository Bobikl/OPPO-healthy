package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$StartExerciseType implements Internal.EnumLite {
    START_UNKNOWN(0),
    PRE_START(1),
    START_SPORT(2),
    UNRECOGNIZED(-1);

    public static final int PRE_START_VALUE = 1;
    public static final int START_SPORT_VALUE = 2;
    public static final int START_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$StartExerciseType> internalValueMap = new Internal.EnumLiteMap<Exercise$StartExerciseType>() { // from class: com.heytap.wearable.health.Exercise$StartExerciseType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$StartExerciseType findValueByNumber(int i) {
            return Exercise$StartExerciseType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$StartExerciseType.forNumber(i) != null;
        }
    }

    Exercise$StartExerciseType(int i) {
        this.value = i;
    }

    public static Exercise$StartExerciseType forNumber(int i) {
        if (i == 0) {
            return START_UNKNOWN;
        }
        if (i == 1) {
            return PRE_START;
        }
        if (i != 2) {
            return null;
        }
        return START_SPORT;
    }

    public static Internal.EnumLiteMap<Exercise$StartExerciseType> internalGetValueMap() {
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
    public static Exercise$StartExerciseType valueOf(int i) {
        return forNumber(i);
    }
}
