package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum DataProto$ExerciseEndReason implements Internal.EnumLite {
    EXERCISE_END_REASON_UNKNOWN(0),
    EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST(1),
    EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED(2),
    EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER(3),
    EXERCISE_END_REASON_USER_END(4),
    EXERCISE_END_REASON_AUTO_END_SUPERSEDED(5),
    EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED(6),
    EXERCISE_END_REASON_AUTO_END_MCU_ERROR(7),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_END_REASON_AUTO_END_MCU_ERROR_VALUE = 7;
    public static final int EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER_VALUE = 3;
    public static final int EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED_VALUE = 2;
    public static final int EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST_VALUE = 1;
    public static final int EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED_VALUE = 6;
    public static final int EXERCISE_END_REASON_AUTO_END_SUPERSEDED_VALUE = 5;
    public static final int EXERCISE_END_REASON_UNKNOWN_VALUE = 0;
    public static final int EXERCISE_END_REASON_USER_END_VALUE = 4;
    private static final Internal.EnumLiteMap<DataProto$ExerciseEndReason> internalValueMap = new Internal.EnumLiteMap<DataProto$ExerciseEndReason>() { // from class: com.oplus.ocs.wearengine.proto.DataProto$ExerciseEndReason.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataProto$ExerciseEndReason findValueByNumber(int i) {
            return DataProto$ExerciseEndReason.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DataProto$ExerciseEndReason.forNumber(i) != null;
        }
    }

    DataProto$ExerciseEndReason(int i) {
        this.value = i;
    }

    public static DataProto$ExerciseEndReason forNumber(int i) {
        switch (i) {
            case 0:
                return EXERCISE_END_REASON_UNKNOWN;
            case 1:
                return EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST;
            case 2:
                return EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED;
            case 3:
                return EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER;
            case 4:
                return EXERCISE_END_REASON_USER_END;
            case 5:
                return EXERCISE_END_REASON_AUTO_END_SUPERSEDED;
            case 6:
                return EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED;
            case 7:
                return EXERCISE_END_REASON_AUTO_END_MCU_ERROR;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<DataProto$ExerciseEndReason> internalGetValueMap() {
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
    public static DataProto$ExerciseEndReason valueOf(int i) {
        return forNumber(i);
    }
}
