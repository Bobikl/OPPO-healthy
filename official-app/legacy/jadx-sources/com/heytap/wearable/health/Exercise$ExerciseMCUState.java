package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseMCUState implements Internal.EnumLite {
    EXERCISE_MCU_STATE_UNKNOWN(0),
    EXERCISE_MCU_STATE_ACTIVE(2),
    EXERCISE_MCU_STATE_PAUSED(3),
    EXERCISE_MCU_STATE_PREPARE(6),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_MCU_STATE_ACTIVE_VALUE = 2;
    public static final int EXERCISE_MCU_STATE_PAUSED_VALUE = 3;
    public static final int EXERCISE_MCU_STATE_PREPARE_VALUE = 6;
    public static final int EXERCISE_MCU_STATE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$ExerciseMCUState> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseMCUState>() { // from class: com.heytap.wearable.health.Exercise$ExerciseMCUState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseMCUState findValueByNumber(int i) {
            return Exercise$ExerciseMCUState.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseMCUState.forNumber(i) != null;
        }
    }

    Exercise$ExerciseMCUState(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseMCUState forNumber(int i) {
        if (i == 0) {
            return EXERCISE_MCU_STATE_UNKNOWN;
        }
        if (i == 6) {
            return EXERCISE_MCU_STATE_PREPARE;
        }
        if (i == 2) {
            return EXERCISE_MCU_STATE_ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return EXERCISE_MCU_STATE_PAUSED;
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseMCUState> internalGetValueMap() {
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
    public static Exercise$ExerciseMCUState valueOf(int i) {
        return forNumber(i);
    }
}
