package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExerciseActionResource implements Internal.EnumLite {
    RESOURCE_UNKNOWN(0),
    RESOURCE_AUTO(1),
    RESOURCE_USER(2),
    UNRECOGNIZED(-1);

    public static final int RESOURCE_AUTO_VALUE = 1;
    public static final int RESOURCE_UNKNOWN_VALUE = 0;
    public static final int RESOURCE_USER_VALUE = 2;
    private static final Internal.EnumLiteMap<Exercise$ExerciseActionResource> internalValueMap = new Internal.EnumLiteMap<Exercise$ExerciseActionResource>() { // from class: com.heytap.wearable.health.Exercise$ExerciseActionResource.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExerciseActionResource findValueByNumber(int i) {
            return Exercise$ExerciseActionResource.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExerciseActionResource.forNumber(i) != null;
        }
    }

    Exercise$ExerciseActionResource(int i) {
        this.value = i;
    }

    public static Exercise$ExerciseActionResource forNumber(int i) {
        if (i == 0) {
            return RESOURCE_UNKNOWN;
        }
        if (i == 1) {
            return RESOURCE_AUTO;
        }
        if (i != 2) {
            return null;
        }
        return RESOURCE_USER;
    }

    public static Internal.EnumLiteMap<Exercise$ExerciseActionResource> internalGetValueMap() {
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
    public static Exercise$ExerciseActionResource valueOf(int i) {
        return forNumber(i);
    }
}
