package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$RestingHeartRateWarningCapability implements Internal.EnumLite {
    RESTING_HEART_RATE_WARNING_NONE(0),
    RESTING_HEART_RATE_WARNING_BASIC(1),
    RESTING_HEART_RATE_WARNING_HIGH(2),
    RESTING_HEART_RATE_WARNING_LOW(4),
    UNRECOGNIZED(-1);

    public static final int RESTING_HEART_RATE_WARNING_BASIC_VALUE = 1;
    public static final int RESTING_HEART_RATE_WARNING_HIGH_VALUE = 2;
    public static final int RESTING_HEART_RATE_WARNING_LOW_VALUE = 4;
    public static final int RESTING_HEART_RATE_WARNING_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<DeviceSettings$RestingHeartRateWarningCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$RestingHeartRateWarningCapability>() { // from class: com.heytap.health.settings.DeviceSettings$RestingHeartRateWarningCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$RestingHeartRateWarningCapability findValueByNumber(int i) {
            return DeviceSettings$RestingHeartRateWarningCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$RestingHeartRateWarningCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$RestingHeartRateWarningCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$RestingHeartRateWarningCapability forNumber(int i) {
        if (i == 0) {
            return RESTING_HEART_RATE_WARNING_NONE;
        }
        if (i == 1) {
            return RESTING_HEART_RATE_WARNING_BASIC;
        }
        if (i == 2) {
            return RESTING_HEART_RATE_WARNING_HIGH;
        }
        if (i != 4) {
            return null;
        }
        return RESTING_HEART_RATE_WARNING_LOW;
    }

    public static Internal.EnumLiteMap<DeviceSettings$RestingHeartRateWarningCapability> internalGetValueMap() {
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
    public static DeviceSettings$RestingHeartRateWarningCapability valueOf(int i) {
        return forNumber(i);
    }
}
