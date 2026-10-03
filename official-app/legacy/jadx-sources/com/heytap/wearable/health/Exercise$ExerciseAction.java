package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseAction implements Internal.EnumLite {
    EXERCISE_ACTION_UNKNOWN(0),
    EXERCISE_ACTION_END(1),
    EXERCISE_ACTION_PAUSE(2),
    EXERCISE_ACTION_RESUME(3),
    EXERCISE_ACTION_MARK_LAP(4),
    EXERCISE_ACTION_PROCESS_KILLED(5),
    EXERCISE_ACTION_PROCESS_RESUMED(6),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_ACTION_END_VALUE = 1;
    public static final int EXERCISE_ACTION_MARK_LAP_VALUE = 4;
    public static final int EXERCISE_ACTION_PAUSE_VALUE = 2;
    public static final int EXERCISE_ACTION_PROCESS_KILLED_VALUE = 5;
    public static final int EXERCISE_ACTION_PROCESS_RESUMED_VALUE = 6;
    public static final int EXERCISE_ACTION_RESUME_VALUE = 3;
    public static final int EXERCISE_ACTION_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$ExerciseAction> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseAction>() { // from class: com.heytap.wearable.health.Exercise$ExerciseAction.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseAction findValueByNumber(int i) {
            return Exercise$ExerciseAction.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseAction.forNumber(i) != null;
        }
    }

    Exercise$ExerciseAction(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseAction forNumber(int i) {
        switch (i) {
            case 0:
                return EXERCISE_ACTION_UNKNOWN;
            case 1:
                return EXERCISE_ACTION_END;
            case 2:
                return EXERCISE_ACTION_PAUSE;
            case 3:
                return EXERCISE_ACTION_RESUME;
            case 4:
                return EXERCISE_ACTION_MARK_LAP;
            case 5:
                return EXERCISE_ACTION_PROCESS_KILLED;
            case 6:
                return EXERCISE_ACTION_PROCESS_RESUMED;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseAction> internalGetValueMap() {
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
    public static Exercise$ExerciseAction valueOf(int i) {
        return forNumber(i);
    }
}
