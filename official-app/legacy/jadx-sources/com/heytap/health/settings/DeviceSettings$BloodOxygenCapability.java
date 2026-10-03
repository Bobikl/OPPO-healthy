package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$BloodOxygenCapability implements Internal.EnumLite {
    BloodOxygen_NONE(0),
    ALL_DAY_BLOOD_OXYGEN_MONITORING(1),
    LOW_BLOOD_OXYGEN_WARNING(2),
    WARNING_VALUE(3),
    UNRECOGNIZED(-1);

    public static final int ALL_DAY_BLOOD_OXYGEN_MONITORING_VALUE = 1;
    public static final int BloodOxygen_NONE_VALUE = 0;
    public static final int LOW_BLOOD_OXYGEN_WARNING_VALUE = 2;
    public static final int WARNING_VALUE_VALUE = 3;
    private static final Internal.EnumLiteMap<DeviceSettings$BloodOxygenCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$BloodOxygenCapability>() { // from class: com.heytap.health.settings.DeviceSettings$BloodOxygenCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$BloodOxygenCapability findValueByNumber(int i) {
            return DeviceSettings$BloodOxygenCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$BloodOxygenCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$BloodOxygenCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$BloodOxygenCapability forNumber(int i) {
        if (i == 0) {
            return BloodOxygen_NONE;
        }
        if (i == 1) {
            return ALL_DAY_BLOOD_OXYGEN_MONITORING;
        }
        if (i == 2) {
            return LOW_BLOOD_OXYGEN_WARNING;
        }
        if (i != 3) {
            return null;
        }
        return WARNING_VALUE;
    }

    public static Internal.EnumLiteMap<DeviceSettings$BloodOxygenCapability> internalGetValueMap() {
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
    public static DeviceSettings$BloodOxygenCapability valueOf(int i) {
        return forNumber(i);
    }
}
