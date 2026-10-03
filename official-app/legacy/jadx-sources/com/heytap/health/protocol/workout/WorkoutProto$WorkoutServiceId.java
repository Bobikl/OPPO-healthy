package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$WorkoutServiceId implements Internal.EnumLite {
    WORKOUT_SERVICE_PLACE_HOLDER(0),
    SID_WORKOUT(4),
    UNRECOGNIZED(-1);

    public static final int SID_WORKOUT_VALUE = 4;
    public static final int WORKOUT_SERVICE_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<WorkoutProto$WorkoutServiceId> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$WorkoutServiceId>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$WorkoutServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$WorkoutServiceId findValueByNumber(int i) {
            return WorkoutProto$WorkoutServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$WorkoutServiceId.forNumber(i) != null;
        }
    }

    WorkoutProto$WorkoutServiceId(int i) {
        this.value = i;
    }

    public static WorkoutProto$WorkoutServiceId forNumber(int i) {
        if (i == 0) {
            return WORKOUT_SERVICE_PLACE_HOLDER;
        }
        if (i != 4) {
            return null;
        }
        return SID_WORKOUT;
    }

    public static Internal.EnumLiteMap<WorkoutProto$WorkoutServiceId> internalGetValueMap() {
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
    public static WorkoutProto$WorkoutServiceId valueOf(int i) {
        return forNumber(i);
    }
}
