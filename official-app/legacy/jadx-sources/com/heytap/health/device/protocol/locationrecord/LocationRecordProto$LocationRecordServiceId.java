package com.heytap.health.device.protocol.locationrecord;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LocationRecordProto$LocationRecordServiceId implements Internal.EnumLite {
    SERVICE_ID_LOCATION_RECORD_UNDEFINE(0),
    SERVICE_ID_LOCATION_RECORD_SETTING(37),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_LOCATION_RECORD_SETTING_VALUE = 37;
    public static final int SERVICE_ID_LOCATION_RECORD_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<LocationRecordProto$LocationRecordServiceId> internalValueMap = new Internal.EnumLiteMap<LocationRecordProto$LocationRecordServiceId>() { // from class: com.heytap.health.device.protocol.locationrecord.LocationRecordProto$LocationRecordServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationRecordProto$LocationRecordServiceId findValueByNumber(int i) {
            return LocationRecordProto$LocationRecordServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LocationRecordProto$LocationRecordServiceId.forNumber(i) != null;
        }
    }

    LocationRecordProto$LocationRecordServiceId(int i) {
        this.value = i;
    }

    public static LocationRecordProto$LocationRecordServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_LOCATION_RECORD_UNDEFINE;
        }
        if (i != 37) {
            return null;
        }
        return SERVICE_ID_LOCATION_RECORD_SETTING;
    }

    public static Internal.EnumLiteMap<LocationRecordProto$LocationRecordServiceId> internalGetValueMap() {
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
    public static LocationRecordProto$LocationRecordServiceId valueOf(int i) {
        return forNumber(i);
    }
}
