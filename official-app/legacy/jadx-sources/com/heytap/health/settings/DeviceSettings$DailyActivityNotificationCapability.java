package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$DailyActivityNotificationCapability implements Internal.EnumLite {
    DAILY_ACTIVITY_NOTIFICATION_NONE(0),
    DAILY_ACTIVITY_NOTIFICATION_GOAL_REACHED(1),
    DAILY_ACTIVITY_NOTIFICATION_MOTIVATION(2),
    DAILY_ACTIVITY_NOTIFICATION_DAILY_REPORT(4),
    DAILY_ACTIVITY_NOTIFICATION_WEEKLY_REPORT(8),
    UNRECOGNIZED(-1);

    public static final int DAILY_ACTIVITY_NOTIFICATION_DAILY_REPORT_VALUE = 4;
    public static final int DAILY_ACTIVITY_NOTIFICATION_GOAL_REACHED_VALUE = 1;
    public static final int DAILY_ACTIVITY_NOTIFICATION_MOTIVATION_VALUE = 2;
    public static final int DAILY_ACTIVITY_NOTIFICATION_NONE_VALUE = 0;
    public static final int DAILY_ACTIVITY_NOTIFICATION_WEEKLY_REPORT_VALUE = 8;
    private static final Internal.EnumLiteMap<DeviceSettings$DailyActivityNotificationCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$DailyActivityNotificationCapability>() { // from class: com.heytap.health.settings.DeviceSettings$DailyActivityNotificationCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$DailyActivityNotificationCapability findValueByNumber(int i) {
            return DeviceSettings$DailyActivityNotificationCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$DailyActivityNotificationCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$DailyActivityNotificationCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$DailyActivityNotificationCapability forNumber(int i) {
        if (i == 0) {
            return DAILY_ACTIVITY_NOTIFICATION_NONE;
        }
        if (i == 1) {
            return DAILY_ACTIVITY_NOTIFICATION_GOAL_REACHED;
        }
        if (i == 2) {
            return DAILY_ACTIVITY_NOTIFICATION_MOTIVATION;
        }
        if (i == 4) {
            return DAILY_ACTIVITY_NOTIFICATION_DAILY_REPORT;
        }
        if (i != 8) {
            return null;
        }
        return DAILY_ACTIVITY_NOTIFICATION_WEEKLY_REPORT;
    }

    public static Internal.EnumLiteMap<DeviceSettings$DailyActivityNotificationCapability> internalGetValueMap() {
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
    public static DeviceSettings$DailyActivityNotificationCapability valueOf(int i) {
        return forNumber(i);
    }
}
