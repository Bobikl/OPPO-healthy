package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseStatsResState implements Internal.EnumLite {
    STATS_STATE_UNKNOWN(0),
    STATS_SUCCESS(1),
    STATS_INDEX_ERROR(2),
    UNRECOGNIZED(-1);

    public static final int STATS_INDEX_ERROR_VALUE = 2;
    public static final int STATS_STATE_UNKNOWN_VALUE = 0;
    public static final int STATS_SUCCESS_VALUE = 1;
    private static final Internal.EnumLiteMap<Exercise$ExerciseStatsResState> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseStatsResState>() { // from class: com.heytap.wearable.health.Exercise$ExerciseStatsResState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseStatsResState findValueByNumber(int i) {
            return Exercise$ExerciseStatsResState.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseStatsResState.forNumber(i) != null;
        }
    }

    Exercise$ExerciseStatsResState(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseStatsResState forNumber(int i) {
        if (i == 0) {
            return STATS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return STATS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return STATS_INDEX_ERROR;
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseStatsResState> internalGetValueMap() {
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
    public static Exercise$ExerciseStatsResState valueOf(int i) {
        return forNumber(i);
    }
}
