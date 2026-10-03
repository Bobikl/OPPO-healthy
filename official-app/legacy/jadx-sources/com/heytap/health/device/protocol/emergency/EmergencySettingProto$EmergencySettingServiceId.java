package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum EmergencySettingProto$EmergencySettingServiceId implements Internal.EnumLite {
    SERVICE_ID_EMERGENCY_UNDEFINE(0),
    SERVICE_ID_EMERGENCY_SETTING(31),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_EMERGENCY_SETTING_VALUE = 31;
    public static final int SERVICE_ID_EMERGENCY_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<EmergencySettingProto$EmergencySettingServiceId> internalValueMap = new Internal.EnumLiteMap<EmergencySettingProto$EmergencySettingServiceId>() { // from class: com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencySettingServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EmergencySettingProto$EmergencySettingServiceId findValueByNumber(int i) {
            return EmergencySettingProto$EmergencySettingServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return EmergencySettingProto$EmergencySettingServiceId.forNumber(i) != null;
        }
    }

    EmergencySettingProto$EmergencySettingServiceId(int i) {
        this.value = i;
    }

    public static EmergencySettingProto$EmergencySettingServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_EMERGENCY_UNDEFINE;
        }
        if (i != 31) {
            return null;
        }
        return SERVICE_ID_EMERGENCY_SETTING;
    }

    public static Internal.EnumLiteMap<EmergencySettingProto$EmergencySettingServiceId> internalGetValueMap() {
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
    public static EmergencySettingProto$EmergencySettingServiceId valueOf(int i) {
        return forNumber(i);
    }
}
