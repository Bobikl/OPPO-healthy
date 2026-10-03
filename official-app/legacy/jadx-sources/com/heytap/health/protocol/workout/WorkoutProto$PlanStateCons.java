package com.heytap.health.protocol.workout;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum WorkoutProto$PlanStateCons implements Internal.EnumLite {
    PLAN_STATE_NAN(0),
    PLAN_STATE_RUNNING(1),
    PLAN_STATE_FINISH(2),
    PLAN_STATE_QUIT(3),
    UNRECOGNIZED(-1);

    public static final int PLAN_STATE_FINISH_VALUE = 2;
    public static final int PLAN_STATE_NAN_VALUE = 0;
    public static final int PLAN_STATE_QUIT_VALUE = 3;
    public static final int PLAN_STATE_RUNNING_VALUE = 1;
    private static final Internal.EnumLiteMap<WorkoutProto$PlanStateCons> internalValueMap = new Internal.EnumLiteMap<WorkoutProto$PlanStateCons>() { // from class: com.heytap.health.protocol.workout.WorkoutProto$PlanStateCons.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkoutProto$PlanStateCons findValueByNumber(int i) {
            return WorkoutProto$PlanStateCons.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WorkoutProto$PlanStateCons.forNumber(i) != null;
        }
    }

    WorkoutProto$PlanStateCons(int i) {
        this.value = i;
    }

    public static WorkoutProto$PlanStateCons forNumber(int i) {
        if (i == 0) {
            return PLAN_STATE_NAN;
        }
        if (i == 1) {
            return PLAN_STATE_RUNNING;
        }
        if (i == 2) {
            return PLAN_STATE_FINISH;
        }
        if (i != 3) {
            return null;
        }
        return PLAN_STATE_QUIT;
    }

    public static Internal.EnumLiteMap<WorkoutProto$PlanStateCons> internalGetValueMap() {
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
    public static WorkoutProto$PlanStateCons valueOf(int i) {
        return forNumber(i);
    }
}
