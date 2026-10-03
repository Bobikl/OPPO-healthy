package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseRemindType implements Internal.EnumLite {
    REMIND_UNKNOWN(0),
    REMIND_ACTION(1),
    UNRECOGNIZED(-1);

    public static final int REMIND_ACTION_VALUE = 1;
    public static final int REMIND_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$ExerciseRemindType> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseRemindType>() { // from class: com.heytap.wearable.health.Exercise$ExerciseRemindType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseRemindType findValueByNumber(int i) {
            return Exercise$ExerciseRemindType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseRemindType.forNumber(i) != null;
        }
    }

    Exercise$ExerciseRemindType(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseRemindType forNumber(int i) {
        if (i == 0) {
            return REMIND_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return REMIND_ACTION;
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseRemindType> internalGetValueMap() {
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
    public static Exercise$ExerciseRemindType valueOf(int i) {
        return forNumber(i);
    }
}
