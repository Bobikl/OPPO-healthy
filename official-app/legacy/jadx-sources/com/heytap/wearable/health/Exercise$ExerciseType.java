package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseType implements Internal.EnumLite {
    EXERCISE_TYPE_UNKNOWN(0),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_TYPE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$ExerciseType> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseType>() { // from class: com.heytap.wearable.health.Exercise$ExerciseType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseType findValueByNumber(int i) {
            return Exercise$ExerciseType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseType.forNumber(i) != null;
        }
    }

    Exercise$ExerciseType(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseType forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return EXERCISE_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseType> internalGetValueMap() {
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
    public static Exercise$ExerciseType valueOf(int i) {
        return forNumber(i);
    }
}
