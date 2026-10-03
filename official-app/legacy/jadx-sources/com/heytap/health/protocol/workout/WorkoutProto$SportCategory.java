package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$SportCategory implements Internal.EnumLite {
    SPORT_CATEGORY_PLACE_HOLDER(0),
    OUTDOOR_SPORTS(1),
    INDOOR_SPORTS(2),
    WATER_SPORTS(3),
    UNRECOGNIZED(-1);

    public static final int INDOOR_SPORTS_VALUE = 2;
    public static final int OUTDOOR_SPORTS_VALUE = 1;
    public static final int SPORT_CATEGORY_PLACE_HOLDER_VALUE = 0;
    public static final int WATER_SPORTS_VALUE = 3;
    private static final Internal.EnumLiteMap<WorkoutProto$SportCategory> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$SportCategory>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$SportCategory.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$SportCategory findValueByNumber(int i) {
            return WorkoutProto$SportCategory.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$SportCategory.forNumber(i) != null;
        }
    }

    WorkoutProto$SportCategory(int i) {
        this.value = i;
    }

    public static WorkoutProto$SportCategory forNumber(int i) {
        if (i == 0) {
            return SPORT_CATEGORY_PLACE_HOLDER;
        }
        if (i == 1) {
            return OUTDOOR_SPORTS;
        }
        if (i == 2) {
            return INDOOR_SPORTS;
        }
        if (i != 3) {
            return null;
        }
        return WATER_SPORTS;
    }

    public static Internal.EnumLiteMap<WorkoutProto$SportCategory> internalGetValueMap() {
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
    public static WorkoutProto$SportCategory valueOf(int i) {
        return forNumber(i);
    }
}
