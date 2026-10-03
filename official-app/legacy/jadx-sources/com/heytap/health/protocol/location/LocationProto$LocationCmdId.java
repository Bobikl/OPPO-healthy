package com.heytap.health.protocol.location;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LocationProto$LocationCmdId implements Internal.EnumLite {
    LOCATION_CMDs_PLACE_HOLDER(0),
    CMD_DEVICE_GET_AGPS(5),
    CMD_RETURN_AGPS_FILE_INFO(6),
    CMD_SEND_AGPS_COMPLETE(7),
    CMD_DEVICE_RECEIVE_AGPS_RESULT(8),
    CMD_DEVICE_GET_PHONE_MOTION_STATE(10),
    UNRECOGNIZED(-1);

    public static final int CMD_DEVICE_GET_AGPS_VALUE = 5;
    public static final int CMD_DEVICE_GET_PHONE_MOTION_STATE_VALUE = 10;
    public static final int CMD_DEVICE_RECEIVE_AGPS_RESULT_VALUE = 8;
    public static final int CMD_RETURN_AGPS_FILE_INFO_VALUE = 6;
    public static final int CMD_SEND_AGPS_COMPLETE_VALUE = 7;
    public static final int LOCATION_CMDs_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<LocationProto$LocationCmdId> internalValueMap = new Internal.EnumLiteMap<LocationProto$LocationCmdId>() { // from class: com.heytap.health.protocol.location.LocationProto$LocationCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationProto$LocationCmdId findValueByNumber(int i) {
            return LocationProto$LocationCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LocationProto$LocationCmdId.forNumber(i) != null;
        }
    }

    LocationProto$LocationCmdId(int i) {
        this.value = i;
    }

    public static LocationProto$LocationCmdId forNumber(int i) {
        if (i == 0) {
            return LOCATION_CMDs_PLACE_HOLDER;
        }
        if (i == 10) {
            return CMD_DEVICE_GET_PHONE_MOTION_STATE;
        }
        if (i == 5) {
            return CMD_DEVICE_GET_AGPS;
        }
        if (i == 6) {
            return CMD_RETURN_AGPS_FILE_INFO;
        }
        if (i == 7) {
            return CMD_SEND_AGPS_COMPLETE;
        }
        if (i != 8) {
            return null;
        }
        return CMD_DEVICE_RECEIVE_AGPS_RESULT;
    }

    public static Internal.EnumLiteMap<LocationProto$LocationCmdId> internalGetValueMap() {
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
    public static LocationProto$LocationCmdId valueOf(int i) {
        return forNumber(i);
    }
}
