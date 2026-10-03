package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$customizeSportTypes implements Internal.EnumLite {
    SPORT_ALL(0),
    SPORT_DEVICE(1),
    SPORT_CUSTOM(2),
    UNRECOGNIZED(-1);

    public static final int SPORT_ALL_VALUE = 0;
    public static final int SPORT_CUSTOM_VALUE = 2;
    public static final int SPORT_DEVICE_VALUE = 1;
    private static final Internal.EnumLiteMap<WorkoutProto$customizeSportTypes> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$customizeSportTypes>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$customizeSportTypes.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$customizeSportTypes findValueByNumber(int i) {
            return WorkoutProto$customizeSportTypes.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$customizeSportTypes.forNumber(i) != null;
        }
    }

    WorkoutProto$customizeSportTypes(int i) {
        this.value = i;
    }

    public static WorkoutProto$customizeSportTypes forNumber(int i) {
        if (i == 0) {
            return SPORT_ALL;
        }
        if (i == 1) {
            return SPORT_DEVICE;
        }
        if (i != 2) {
            return null;
        }
        return SPORT_CUSTOM;
    }

    public static Internal.EnumLiteMap<WorkoutProto$customizeSportTypes> internalGetValueMap() {
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
    public static WorkoutProto$customizeSportTypes valueOf(int i) {
        return forNumber(i);
    }
}
