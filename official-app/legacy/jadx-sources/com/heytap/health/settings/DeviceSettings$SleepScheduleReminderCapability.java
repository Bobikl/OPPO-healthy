package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$SleepScheduleReminderCapability implements Internal.EnumLite {
    SLEEP_SCHEDULE_REMINDER_NONE(0),
    SLEEP_SCHEDULE_REMINDER_SCHEDULE(1),
    SLEEP_SCHEDULE_REMINDER_SETTING(2),
    SLEEP_SCHEDULE_REMINDER_PHONE_DND(4),
    SLEEP_SCHEDULE_REMINDER_SLEEP_GOAL(8),
    SLEEP_SCHEDULE_REMINDER_SLEEP_REMINDER(16),
    SLEEP_SCHEDULE_REMINDER_LATE_NIGHT(32),
    SLEEP_SCHEDULE_REMINDER_MUSIC_PAUSE(64),
    SLEEP_SCHEDULE_REMINDER_NAP_SILENT(128),
    UNRECOGNIZED(-1);

    public static final int SLEEP_SCHEDULE_REMINDER_LATE_NIGHT_VALUE = 32;
    public static final int SLEEP_SCHEDULE_REMINDER_MUSIC_PAUSE_VALUE = 64;
    public static final int SLEEP_SCHEDULE_REMINDER_NAP_SILENT_VALUE = 128;
    public static final int SLEEP_SCHEDULE_REMINDER_NONE_VALUE = 0;
    public static final int SLEEP_SCHEDULE_REMINDER_PHONE_DND_VALUE = 4;
    public static final int SLEEP_SCHEDULE_REMINDER_SCHEDULE_VALUE = 1;
    public static final int SLEEP_SCHEDULE_REMINDER_SETTING_VALUE = 2;
    public static final int SLEEP_SCHEDULE_REMINDER_SLEEP_GOAL_VALUE = 8;
    public static final int SLEEP_SCHEDULE_REMINDER_SLEEP_REMINDER_VALUE = 16;
    private static final Internal.EnumLiteMap<DeviceSettings$SleepScheduleReminderCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$SleepScheduleReminderCapability>() { // from class: com.heytap.health.settings.DeviceSettings$SleepScheduleReminderCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$SleepScheduleReminderCapability findValueByNumber(int i) {
            return DeviceSettings$SleepScheduleReminderCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$SleepScheduleReminderCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$SleepScheduleReminderCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$SleepScheduleReminderCapability forNumber(int i) {
        if (i == 0) {
            return SLEEP_SCHEDULE_REMINDER_NONE;
        }
        if (i == 1) {
            return SLEEP_SCHEDULE_REMINDER_SCHEDULE;
        }
        if (i == 2) {
            return SLEEP_SCHEDULE_REMINDER_SETTING;
        }
        if (i == 4) {
            return SLEEP_SCHEDULE_REMINDER_PHONE_DND;
        }
        if (i == 8) {
            return SLEEP_SCHEDULE_REMINDER_SLEEP_GOAL;
        }
        if (i == 16) {
            return SLEEP_SCHEDULE_REMINDER_SLEEP_REMINDER;
        }
        if (i == 32) {
            return SLEEP_SCHEDULE_REMINDER_LATE_NIGHT;
        }
        if (i == 64) {
            return SLEEP_SCHEDULE_REMINDER_MUSIC_PAUSE;
        }
        if (i != 128) {
            return null;
        }
        return SLEEP_SCHEDULE_REMINDER_NAP_SILENT;
    }

    public static Internal.EnumLiteMap<DeviceSettings$SleepScheduleReminderCapability> internalGetValueMap() {
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
    public static DeviceSettings$SleepScheduleReminderCapability valueOf(int i) {
        return forNumber(i);
    }
}
