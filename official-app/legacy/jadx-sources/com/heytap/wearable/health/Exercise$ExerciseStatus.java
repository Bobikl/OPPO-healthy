package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseStatus implements Internal.EnumLite {
    STATUS_SUCCESS(0),
    STATUS_FAILED(1),
    UNRECOGNIZED(-1);

    public static final int STATUS_FAILED_VALUE = 1;
    public static final int STATUS_SUCCESS_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$ExerciseStatus> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseStatus>() { // from class: com.heytap.wearable.health.Exercise$ExerciseStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseStatus findValueByNumber(int i) {
            return Exercise$ExerciseStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseStatus.forNumber(i) != null;
        }
    }

    Exercise$ExerciseStatus(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseStatus forNumber(int i) {
        if (i == 0) {
            return STATUS_SUCCESS;
        }
        if (i != 1) {
            return null;
        }
        return STATUS_FAILED;
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseStatus> internalGetValueMap() {
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
    public static Exercise$ExerciseStatus valueOf(int i) {
        return forNumber(i);
    }
}
