package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$HeartRateAutoMonitoringCapability implements Internal.EnumLite {
    HEART_RATE_AUTO_MONITORING_NONE(0),
    HEART_RATE_AUTO_MONITORING_BASIC(1),
    HEART_RATE_AUTO_MONITORING_SMART(2),
    HEART_RATE_AUTO_MONITORING_REAL_TIME(4),
    HEART_RATE_AUTO_MONITORING_6MIN(8),
    HEART_RATE_AUTO_MONITORING_2MIN(16),
    UNRECOGNIZED(-1);

    public static final int HEART_RATE_AUTO_MONITORING_2MIN_VALUE = 16;
    public static final int HEART_RATE_AUTO_MONITORING_6MIN_VALUE = 8;
    public static final int HEART_RATE_AUTO_MONITORING_BASIC_VALUE = 1;
    public static final int HEART_RATE_AUTO_MONITORING_NONE_VALUE = 0;
    public static final int HEART_RATE_AUTO_MONITORING_REAL_TIME_VALUE = 4;
    public static final int HEART_RATE_AUTO_MONITORING_SMART_VALUE = 2;
    private static final Internal.EnumLiteMap<DeviceSettings$HeartRateAutoMonitoringCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$HeartRateAutoMonitoringCapability>() { // from class: com.heytap.health.settings.DeviceSettings$HeartRateAutoMonitoringCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$HeartRateAutoMonitoringCapability findValueByNumber(int i) {
            return DeviceSettings$HeartRateAutoMonitoringCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$HeartRateAutoMonitoringCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$HeartRateAutoMonitoringCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$HeartRateAutoMonitoringCapability forNumber(int i) {
        if (i == 0) {
            return HEART_RATE_AUTO_MONITORING_NONE;
        }
        if (i == 1) {
            return HEART_RATE_AUTO_MONITORING_BASIC;
        }
        if (i == 2) {
            return HEART_RATE_AUTO_MONITORING_SMART;
        }
        if (i == 4) {
            return HEART_RATE_AUTO_MONITORING_REAL_TIME;
        }
        if (i == 8) {
            return HEART_RATE_AUTO_MONITORING_6MIN;
        }
        if (i != 16) {
            return null;
        }
        return HEART_RATE_AUTO_MONITORING_2MIN;
    }

    public static Internal.EnumLiteMap<DeviceSettings$HeartRateAutoMonitoringCapability> internalGetValueMap() {
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
    public static DeviceSettings$HeartRateAutoMonitoringCapability valueOf(int i) {
        return forNumber(i);
    }
}
