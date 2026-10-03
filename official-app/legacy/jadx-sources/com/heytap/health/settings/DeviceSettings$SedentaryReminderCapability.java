package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$SedentaryReminderCapability implements Internal.EnumLite {
    SEDENTARY_REMINDER_NONE(0),
    SEDENTARY_REMINDER_ENABLED(1),
    SEDENTARY_REMINDER_DISABLED(2),
    SEDENTARY_REMINDER_ACTIVITY_RECOVERY(4),
    UNRECOGNIZED(-1);

    public static final int SEDENTARY_REMINDER_ACTIVITY_RECOVERY_VALUE = 4;
    public static final int SEDENTARY_REMINDER_DISABLED_VALUE = 2;
    public static final int SEDENTARY_REMINDER_ENABLED_VALUE = 1;
    public static final int SEDENTARY_REMINDER_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<DeviceSettings$SedentaryReminderCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$SedentaryReminderCapability>() { // from class: com.heytap.health.settings.DeviceSettings$SedentaryReminderCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$SedentaryReminderCapability findValueByNumber(int i) {
            return DeviceSettings$SedentaryReminderCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$SedentaryReminderCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$SedentaryReminderCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$SedentaryReminderCapability forNumber(int i) {
        if (i == 0) {
            return SEDENTARY_REMINDER_NONE;
        }
        if (i == 1) {
            return SEDENTARY_REMINDER_ENABLED;
        }
        if (i == 2) {
            return SEDENTARY_REMINDER_DISABLED;
        }
        if (i != 4) {
            return null;
        }
        return SEDENTARY_REMINDER_ACTIVITY_RECOVERY;
    }

    public static Internal.EnumLiteMap<DeviceSettings$SedentaryReminderCapability> internalGetValueMap() {
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
    public static DeviceSettings$SedentaryReminderCapability valueOf(int i) {
        return forNumber(i);
    }
}
