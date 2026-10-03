package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$MODIFY_SOURCE_LOAD implements Internal.EnumLite {
    SOURCE_NONE(0),
    SOURCE_MCU(1),
    SOURCE_HOST(2),
    SOURCE_APP(3),
    UNRECOGNIZED(-1);

    public static final int SOURCE_APP_VALUE = 3;
    public static final int SOURCE_HOST_VALUE = 2;
    public static final int SOURCE_MCU_VALUE = 1;
    public static final int SOURCE_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<WorkoutProto$MODIFY_SOURCE_LOAD> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$MODIFY_SOURCE_LOAD>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$MODIFY_SOURCE_LOAD.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$MODIFY_SOURCE_LOAD findValueByNumber(int i) {
            return WorkoutProto$MODIFY_SOURCE_LOAD.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$MODIFY_SOURCE_LOAD.forNumber(i) != null;
        }
    }

    WorkoutProto$MODIFY_SOURCE_LOAD(int i) {
        this.value = i;
    }

    public static WorkoutProto$MODIFY_SOURCE_LOAD forNumber(int i) {
        if (i == 0) {
            return SOURCE_NONE;
        }
        if (i == 1) {
            return SOURCE_MCU;
        }
        if (i == 2) {
            return SOURCE_HOST;
        }
        if (i != 3) {
            return null;
        }
        return SOURCE_APP;
    }

    public static Internal.EnumLiteMap<WorkoutProto$MODIFY_SOURCE_LOAD> internalGetValueMap() {
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
    public static WorkoutProto$MODIFY_SOURCE_LOAD valueOf(int i) {
        return forNumber(i);
    }
}
