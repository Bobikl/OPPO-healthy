package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$GoalSettingCapability implements Internal.EnumLite {
    GOAL_SETTING_NONE(0),
    GOAL_SETTING_STEP_GOAL(1),
    GOAL_SETTING_ACTIVITY_COUNT(2),
    GOAL_SETTING_BREATHING_RELAXATION(4),
    UNRECOGNIZED(-1);

    public static final int GOAL_SETTING_ACTIVITY_COUNT_VALUE = 2;
    public static final int GOAL_SETTING_BREATHING_RELAXATION_VALUE = 4;
    public static final int GOAL_SETTING_NONE_VALUE = 0;
    public static final int GOAL_SETTING_STEP_GOAL_VALUE = 1;
    private static final Internal.EnumLiteMap<DeviceSettings$GoalSettingCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$GoalSettingCapability>() { // from class: com.heytap.health.settings.DeviceSettings$GoalSettingCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$GoalSettingCapability findValueByNumber(int i) {
            return DeviceSettings$GoalSettingCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$GoalSettingCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$GoalSettingCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$GoalSettingCapability forNumber(int i) {
        if (i == 0) {
            return GOAL_SETTING_NONE;
        }
        if (i == 1) {
            return GOAL_SETTING_STEP_GOAL;
        }
        if (i == 2) {
            return GOAL_SETTING_ACTIVITY_COUNT;
        }
        if (i != 4) {
            return null;
        }
        return GOAL_SETTING_BREATHING_RELAXATION;
    }

    public static Internal.EnumLiteMap<DeviceSettings$GoalSettingCapability> internalGetValueMap() {
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
    public static DeviceSettings$GoalSettingCapability valueOf(int i) {
        return forNumber(i);
    }
}
