package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum DataProto$ExerciseTrackedStatus implements Internal.EnumLite {
    EXERCISE_TRACKED_STATUS_UNKNOWN(0),
    EXERCISE_TRACKED_STATUS_OTHER_APP_IN_PROGRESS(1),
    EXERCISE_TRACKED_STATUS_OWNED_EXERCISE_IN_PROGRESS(2),
    EXERCISE_TRACKED_STATUS_NO_EXERCISE_IN_PROGRESS(3),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_TRACKED_STATUS_NO_EXERCISE_IN_PROGRESS_VALUE = 3;
    public static final int EXERCISE_TRACKED_STATUS_OTHER_APP_IN_PROGRESS_VALUE = 1;
    public static final int EXERCISE_TRACKED_STATUS_OWNED_EXERCISE_IN_PROGRESS_VALUE = 2;
    public static final int EXERCISE_TRACKED_STATUS_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<DataProto$ExerciseTrackedStatus> internalValueMap = new Internal.EnumLiteMap<DataProto$ExerciseTrackedStatus>() { // from class: com.oplus.ocs.wearengine.proto.DataProto$ExerciseTrackedStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataProto$ExerciseTrackedStatus findValueByNumber(int i) {
            return DataProto$ExerciseTrackedStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DataProto$ExerciseTrackedStatus.forNumber(i) != null;
        }
    }

    DataProto$ExerciseTrackedStatus(int i) {
        this.value = i;
    }

    public static DataProto$ExerciseTrackedStatus forNumber(int i) {
        if (i == 0) {
            return EXERCISE_TRACKED_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return EXERCISE_TRACKED_STATUS_OTHER_APP_IN_PROGRESS;
        }
        if (i == 2) {
            return EXERCISE_TRACKED_STATUS_OWNED_EXERCISE_IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return EXERCISE_TRACKED_STATUS_NO_EXERCISE_IN_PROGRESS;
    }

    public static Internal.EnumLiteMap<DataProto$ExerciseTrackedStatus> internalGetValueMap() {
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
    public static DataProto$ExerciseTrackedStatus valueOf(int i) {
        return forNumber(i);
    }
}
