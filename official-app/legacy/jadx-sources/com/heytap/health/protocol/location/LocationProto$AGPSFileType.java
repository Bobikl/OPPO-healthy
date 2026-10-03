package com.heytap.health.protocol.location;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LocationProto$AGPSFileType implements Internal.EnumLite {
    AGPS_FILE_TYPE_HOLDER(0),
    AGPS_FILE_TYPE_BEIDOU(2),
    AGPS_FILE_TYPE_GALILEO(4),
    AGPS_FILE_TYPE_GPS_GL(9),
    AGPS_FILE_TYPE_GALILEO_3DAYS(5),
    AGPS_FILE_TYPE_BEIDOU_3DAYS(6),
    AGPS_FILE_TYPE_WATCH4(7),
    AGPS_FILE_TYPE_IONOSPHERE(8),
    AGPS_FILE_TYPE_RTO(10),
    UNRECOGNIZED(-1);

    public static final int AGPS_FILE_TYPE_BEIDOU_3DAYS_VALUE = 6;
    public static final int AGPS_FILE_TYPE_BEIDOU_VALUE = 2;
    public static final int AGPS_FILE_TYPE_GALILEO_3DAYS_VALUE = 5;
    public static final int AGPS_FILE_TYPE_GALILEO_VALUE = 4;
    public static final int AGPS_FILE_TYPE_GPS_GL_VALUE = 9;
    public static final int AGPS_FILE_TYPE_HOLDER_VALUE = 0;
    public static final int AGPS_FILE_TYPE_IONOSPHERE_VALUE = 8;
    public static final int AGPS_FILE_TYPE_RTO_VALUE = 10;
    public static final int AGPS_FILE_TYPE_WATCH4_VALUE = 7;
    private static final Internal.EnumLiteMap<LocationProto$AGPSFileType> internalValueMap = new Internal.EnumLiteMap<LocationProto$AGPSFileType>() { // from class: com.heytap.health.protocol.location.LocationProto$AGPSFileType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationProto$AGPSFileType findValueByNumber(int i) {
            return LocationProto$AGPSFileType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LocationProto$AGPSFileType.forNumber(i) != null;
        }
    }

    LocationProto$AGPSFileType(int i) {
        this.value = i;
    }

    public static LocationProto$AGPSFileType forNumber(int i) {
        if (i == 0) {
            return AGPS_FILE_TYPE_HOLDER;
        }
        if (i == 2) {
            return AGPS_FILE_TYPE_BEIDOU;
        }
        switch (i) {
            case 4:
                return AGPS_FILE_TYPE_GALILEO;
            case 5:
                return AGPS_FILE_TYPE_GALILEO_3DAYS;
            case 6:
                return AGPS_FILE_TYPE_BEIDOU_3DAYS;
            case 7:
                return AGPS_FILE_TYPE_WATCH4;
            case 8:
                return AGPS_FILE_TYPE_IONOSPHERE;
            case 9:
                return AGPS_FILE_TYPE_GPS_GL;
            case 10:
                return AGPS_FILE_TYPE_RTO;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<LocationProto$AGPSFileType> internalGetValueMap() {
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
    public static LocationProto$AGPSFileType valueOf(int i) {
        return forNumber(i);
    }
}
