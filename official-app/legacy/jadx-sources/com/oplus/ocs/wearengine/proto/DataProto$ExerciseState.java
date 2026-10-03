package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum DataProto$ExerciseState implements Internal.EnumLite {
    EXERCISE_STATE_UNKNOWN(0),
    EXERCISE_STATE_PREPARING(15),
    EXERCISE_STATE_USER_STARTING(1),
    EXERCISE_STATE_ACTIVE(2),
    EXERCISE_STATE_USER_PAUSING(3),
    EXERCISE_STATE_USER_PAUSED(4),
    EXERCISE_STATE_AUTO_PAUSING(5),
    EXERCISE_STATE_AUTO_PAUSED(6),
    EXERCISE_STATE_USER_RESUMING(7),
    EXERCISE_STATE_AUTO_RESUMING(8),
    EXERCISE_STATE_USER_ENDING(9),
    EXERCISE_STATE_USER_ENDED(10),
    EXERCISE_STATE_AUTO_ENDING(11),
    EXERCISE_STATE_AUTO_ENDED(12),
    EXERCISE_STATE_AUTO_ENDING_PERMISSION_LOST(16),
    EXERCISE_STATE_AUTO_ENDED_PERMISSION_LOST(17),
    EXERCISE_STATE_TERMINATING(13),
    EXERCISE_STATE_TERMINATED(14),
    EXERCISE_STATE_ENDED(18),
    EXERCISE_STATE_ENDING(19),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_STATE_ACTIVE_VALUE = 2;
    public static final int EXERCISE_STATE_AUTO_ENDED_PERMISSION_LOST_VALUE = 17;
    public static final int EXERCISE_STATE_AUTO_ENDED_VALUE = 12;
    public static final int EXERCISE_STATE_AUTO_ENDING_PERMISSION_LOST_VALUE = 16;
    public static final int EXERCISE_STATE_AUTO_ENDING_VALUE = 11;
    public static final int EXERCISE_STATE_AUTO_PAUSED_VALUE = 6;
    public static final int EXERCISE_STATE_AUTO_PAUSING_VALUE = 5;
    public static final int EXERCISE_STATE_AUTO_RESUMING_VALUE = 8;
    public static final int EXERCISE_STATE_ENDED_VALUE = 18;
    public static final int EXERCISE_STATE_ENDING_VALUE = 19;
    public static final int EXERCISE_STATE_PREPARING_VALUE = 15;
    public static final int EXERCISE_STATE_TERMINATED_VALUE = 14;
    public static final int EXERCISE_STATE_TERMINATING_VALUE = 13;
    public static final int EXERCISE_STATE_UNKNOWN_VALUE = 0;
    public static final int EXERCISE_STATE_USER_ENDED_VALUE = 10;
    public static final int EXERCISE_STATE_USER_ENDING_VALUE = 9;
    public static final int EXERCISE_STATE_USER_PAUSED_VALUE = 4;
    public static final int EXERCISE_STATE_USER_PAUSING_VALUE = 3;
    public static final int EXERCISE_STATE_USER_RESUMING_VALUE = 7;
    public static final int EXERCISE_STATE_USER_STARTING_VALUE = 1;
    private static final Internal.EnumLiteMap<DataProto$ExerciseState> internalValueMap = new Internal.EnumLiteMap<DataProto$ExerciseState>() { // from class: com.oplus.ocs.wearengine.proto.DataProto$ExerciseState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataProto$ExerciseState findValueByNumber(int i) {
            return DataProto$ExerciseState.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DataProto$ExerciseState.forNumber(i) != null;
        }
    }

    DataProto$ExerciseState(int i) {
        this.value = i;
    }

    public static DataProto$ExerciseState forNumber(int i) {
        switch (i) {
            case 0:
                return EXERCISE_STATE_UNKNOWN;
            case 1:
                return EXERCISE_STATE_USER_STARTING;
            case 2:
                return EXERCISE_STATE_ACTIVE;
            case 3:
                return EXERCISE_STATE_USER_PAUSING;
            case 4:
                return EXERCISE_STATE_USER_PAUSED;
            case 5:
                return EXERCISE_STATE_AUTO_PAUSING;
            case 6:
                return EXERCISE_STATE_AUTO_PAUSED;
            case 7:
                return EXERCISE_STATE_USER_RESUMING;
            case 8:
                return EXERCISE_STATE_AUTO_RESUMING;
            case 9:
                return EXERCISE_STATE_USER_ENDING;
            case 10:
                return EXERCISE_STATE_USER_ENDED;
            case 11:
                return EXERCISE_STATE_AUTO_ENDING;
            case 12:
                return EXERCISE_STATE_AUTO_ENDED;
            case 13:
                return EXERCISE_STATE_TERMINATING;
            case 14:
                return EXERCISE_STATE_TERMINATED;
            case 15:
                return EXERCISE_STATE_PREPARING;
            case 16:
                return EXERCISE_STATE_AUTO_ENDING_PERMISSION_LOST;
            case 17:
                return EXERCISE_STATE_AUTO_ENDED_PERMISSION_LOST;
            case 18:
                return EXERCISE_STATE_ENDED;
            case 19:
                return EXERCISE_STATE_ENDING;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<DataProto$ExerciseState> internalGetValueMap() {
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
    public static DataProto$ExerciseState valueOf(int i) {
        return forNumber(i);
    }
}
