package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$ExerciseHeartRateWarningCapability implements Internal.EnumLite {
    EXERCISE_HEART_RATE_WARNING_NONE(0),
    EXERCISE_HEART_RATE_WARNING_BASIC(1),
    EXERCISE_HEART_RATE_WARNING_HIGH(2),
    UNRECOGNIZED(-1);

    public static final int EXERCISE_HEART_RATE_WARNING_BASIC_VALUE = 1;
    public static final int EXERCISE_HEART_RATE_WARNING_HIGH_VALUE = 2;
    public static final int EXERCISE_HEART_RATE_WARNING_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<DeviceSettings$ExerciseHeartRateWarningCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$ExerciseHeartRateWarningCapability>() { // from class: com.heytap.health.settings.DeviceSettings$ExerciseHeartRateWarningCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$ExerciseHeartRateWarningCapability findValueByNumber(int i) {
            return DeviceSettings$ExerciseHeartRateWarningCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$ExerciseHeartRateWarningCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$ExerciseHeartRateWarningCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$ExerciseHeartRateWarningCapability forNumber(int i) {
        if (i == 0) {
            return EXERCISE_HEART_RATE_WARNING_NONE;
        }
        if (i == 1) {
            return EXERCISE_HEART_RATE_WARNING_BASIC;
        }
        if (i != 2) {
            return null;
        }
        return EXERCISE_HEART_RATE_WARNING_HIGH;
    }

    public static Internal.EnumLiteMap<DeviceSettings$ExerciseHeartRateWarningCapability> internalGetValueMap() {
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
    public static DeviceSettings$ExerciseHeartRateWarningCapability valueOf(int i) {
        return forNumber(i);
    }
}
