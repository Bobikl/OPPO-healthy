package com.heytap.health.protocol.location;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LocationProto$LocationServiceId implements Internal.EnumLite {
    LOCATION_SERVICE_PLACE_HOLDER(0),
    SID_LOCATION(25),
    UNRECOGNIZED(-1);

    public static final int LOCATION_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_LOCATION_VALUE = 25;
    private static final Internal.EnumLiteMap<LocationProto$LocationServiceId> internalValueMap = new Internal.EnumLiteMap<LocationProto$LocationServiceId>() { // from class: com.heytap.health.protocol.location.LocationProto$LocationServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationProto$LocationServiceId findValueByNumber(int i) {
            return LocationProto$LocationServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LocationProto$LocationServiceId.forNumber(i) != null;
        }
    }

    LocationProto$LocationServiceId(int i) {
        this.value = i;
    }

    public static LocationProto$LocationServiceId forNumber(int i) {
        if (i == 0) {
            return LOCATION_SERVICE_PLACE_HOLDER;
        }
        if (i != 25) {
            return null;
        }
        return SID_LOCATION;
    }

    public static Internal.EnumLiteMap<LocationProto$LocationServiceId> internalGetValueMap() {
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
    public static LocationProto$LocationServiceId valueOf(int i) {
        return forNumber(i);
    }
}
