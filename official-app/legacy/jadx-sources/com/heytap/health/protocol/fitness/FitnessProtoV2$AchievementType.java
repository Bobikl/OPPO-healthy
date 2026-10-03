package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProtoV2$AchievementType implements Internal.EnumLite {
    unknown(0),
    mentalState(1),
    regular_bedtime(2),
    sleep_duration(3),
    step(4),
    exercise_duration(5),
    calorie(6),
    activity_count(7),
    relax_duration(8),
    sunshine_duration(9),
    UNRECOGNIZED(-1);

    public static final int activity_count_VALUE = 7;
    public static final int calorie_VALUE = 6;
    public static final int exercise_duration_VALUE = 5;
    private static final Internal.EnumLiteMap<FitnessProtoV2$AchievementType> internalValueMap = new Internal.EnumLiteMap<FitnessProtoV2$AchievementType>() { // from class: com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProtoV2$AchievementType findValueByNumber(int i) {
            return FitnessProtoV2$AchievementType.forNumber(i);
        }
    };
    public static final int mentalState_VALUE = 1;
    public static final int regular_bedtime_VALUE = 2;
    public static final int relax_duration_VALUE = 8;
    public static final int sleep_duration_VALUE = 3;
    public static final int step_VALUE = 4;
    public static final int sunshine_duration_VALUE = 9;
    public static final int unknown_VALUE = 0;
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProtoV2$AchievementType.forNumber(i) != null;
        }
    }

    FitnessProtoV2$AchievementType(int i) {
        this.value = i;
    }

    public static FitnessProtoV2$AchievementType forNumber(int i) {
        switch (i) {
            case 0:
                return unknown;
            case 1:
                return mentalState;
            case 2:
                return regular_bedtime;
            case 3:
                return sleep_duration;
            case 4:
                return step;
            case 5:
                return exercise_duration;
            case 6:
                return calorie;
            case 7:
                return activity_count;
            case 8:
                return relax_duration;
            case 9:
                return sunshine_duration;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<FitnessProtoV2$AchievementType> internalGetValueMap() {
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
    public static FitnessProtoV2$AchievementType valueOf(int i) {
        return forNumber(i);
    }
}
