package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$IMPROVE_TYPE implements Internal.EnumLite {
    IMPROVE_HEALTH(0),
    SCIENTIFIC_EXERCISE(1),
    UNRECOGNIZED(-1);

    public static final int IMPROVE_HEALTH_VALUE = 0;
    public static final int SCIENTIFIC_EXERCISE_VALUE = 1;
    private static final Internal.EnumLiteMap<WorkoutProto$IMPROVE_TYPE> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$IMPROVE_TYPE>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$IMPROVE_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$IMPROVE_TYPE findValueByNumber(int i) {
            return WorkoutProto$IMPROVE_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$IMPROVE_TYPE.forNumber(i) != null;
        }
    }

    WorkoutProto$IMPROVE_TYPE(int i) {
        this.value = i;
    }

    public static WorkoutProto$IMPROVE_TYPE forNumber(int i) {
        if (i == 0) {
            return IMPROVE_HEALTH;
        }
        if (i != 1) {
            return null;
        }
        return SCIENTIFIC_EXERCISE;
    }

    public static Internal.EnumLiteMap<WorkoutProto$IMPROVE_TYPE> internalGetValueMap() {
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
    public static WorkoutProto$IMPROVE_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
