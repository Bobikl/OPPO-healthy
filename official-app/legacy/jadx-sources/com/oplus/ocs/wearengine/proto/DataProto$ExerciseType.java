package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum DataProto$ExerciseType implements Internal.EnumLite {
    EXERCISE_TYPE_UNKNOWN(0),
    EXERCISE_TYPE_TRAIL_HIKING(10001),
    EXERCISE_TYPE_MOUNTAIN_HIKING(10002),
    EXERCISE_TYPE_OUTDOOR_CYCLE(10003),
    EXERCISE_TYPE_OUTDOOR_RUN(10004),
    EXERCISE_TYPE_BASIC(10005),
    EXERCISE_TYPE_SKIING(10006),
    EXERCISE_TYPE_BADMINTON(10007),
    EXERCISE_TYPE_TENNIS(10008),
    EXERCISE_TYPE_TRAIL_RUN(10009),
    EXERCISE_TYPE_ROPE_SKIPPING(10010),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_TYPE_BADMINTON_VALUE = 10007;
    public static final int EXERCISE_TYPE_BASIC_VALUE = 10005;
    public static final int EXERCISE_TYPE_MOUNTAIN_HIKING_VALUE = 10002;
    public static final int EXERCISE_TYPE_OUTDOOR_CYCLE_VALUE = 10003;
    public static final int EXERCISE_TYPE_OUTDOOR_RUN_VALUE = 10004;
    public static final int EXERCISE_TYPE_ROPE_SKIPPING_VALUE = 10010;
    public static final int EXERCISE_TYPE_SKIING_VALUE = 10006;
    public static final int EXERCISE_TYPE_TENNIS_VALUE = 10008;
    public static final int EXERCISE_TYPE_TRAIL_HIKING_VALUE = 10001;
    public static final int EXERCISE_TYPE_TRAIL_RUN_VALUE = 10009;
    public static final int EXERCISE_TYPE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<DataProto$ExerciseType> internalValueMap = new Internal.EnumLiteMap<DataProto$ExerciseType>() { // from class: com.oplus.ocs.wearengine.proto.DataProto$ExerciseType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataProto$ExerciseType findValueByNumber(int i) {
            return DataProto$ExerciseType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DataProto$ExerciseType.forNumber(i) != null;
        }
    }

    DataProto$ExerciseType(int i) {
        this.value = i;
    }

    public static DataProto$ExerciseType forNumber(int i) {
        if (i == 0) {
            return EXERCISE_TYPE_UNKNOWN;
        }
        switch (i) {
            case 10001:
                return EXERCISE_TYPE_TRAIL_HIKING;
            case 10002:
                return EXERCISE_TYPE_MOUNTAIN_HIKING;
            case 10003:
                return EXERCISE_TYPE_OUTDOOR_CYCLE;
            case 10004:
                return EXERCISE_TYPE_OUTDOOR_RUN;
            case 10005:
                return EXERCISE_TYPE_BASIC;
            case 10006:
                return EXERCISE_TYPE_SKIING;
            case 10007:
                return EXERCISE_TYPE_BADMINTON;
            case 10008:
                return EXERCISE_TYPE_TENNIS;
            case 10009:
                return EXERCISE_TYPE_TRAIL_RUN;
            case 10010:
                return EXERCISE_TYPE_ROPE_SKIPPING;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<DataProto$ExerciseType> internalGetValueMap() {
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
    public static DataProto$ExerciseType valueOf(int i) {
        return forNumber(i);
    }
}
