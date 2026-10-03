package com.heytap.health.device.protocol.locationrecord;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LocationRecordProto$LocationRecordCmdId implements Internal.EnumLite {
    CMD_ID_LOCATION_RECORD_SETTING_UNDEFINE(0),
    CMD_ID_SYNC_CLOUD_LOCATION_CONFIG(1),
    CMD_ID_SYNC_CLOUD_LOCATION_CONFIG_REQUEST(2),
    CMD_ID_SYNC_CLOUD_LOCATION_PERMISSION_SET(3),
    CMD_ID_SYNC_CLOUD_LOCATION_PERMISSION_REQUEST(4),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_LOCATION_RECORD_SETTING_UNDEFINE_VALUE = 0;
    public static final int CMD_ID_SYNC_CLOUD_LOCATION_CONFIG_REQUEST_VALUE = 2;
    public static final int CMD_ID_SYNC_CLOUD_LOCATION_CONFIG_VALUE = 1;
    public static final int CMD_ID_SYNC_CLOUD_LOCATION_PERMISSION_REQUEST_VALUE = 4;
    public static final int CMD_ID_SYNC_CLOUD_LOCATION_PERMISSION_SET_VALUE = 3;
    private static final Internal.EnumLiteMap<LocationRecordProto$LocationRecordCmdId> internalValueMap = new Internal.EnumLiteMap<LocationRecordProto$LocationRecordCmdId>() { // from class: com.heytap.health.device.protocol.locationrecord.LocationRecordProto$LocationRecordCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationRecordProto$LocationRecordCmdId findValueByNumber(int i) {
            return LocationRecordProto$LocationRecordCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LocationRecordProto$LocationRecordCmdId.forNumber(i) != null;
        }
    }

    LocationRecordProto$LocationRecordCmdId(int i) {
        this.value = i;
    }

    public static LocationRecordProto$LocationRecordCmdId forNumber(int i) {
        if (i == 0) {
            return CMD_ID_LOCATION_RECORD_SETTING_UNDEFINE;
        }
        if (i == 1) {
            return CMD_ID_SYNC_CLOUD_LOCATION_CONFIG;
        }
        if (i == 2) {
            return CMD_ID_SYNC_CLOUD_LOCATION_CONFIG_REQUEST;
        }
        if (i == 3) {
            return CMD_ID_SYNC_CLOUD_LOCATION_PERMISSION_SET;
        }
        if (i != 4) {
            return null;
        }
        return CMD_ID_SYNC_CLOUD_LOCATION_PERMISSION_REQUEST;
    }

    public static Internal.EnumLiteMap<LocationRecordProto$LocationRecordCmdId> internalGetValueMap() {
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
    public static LocationRecordProto$LocationRecordCmdId valueOf(int i) {
        return forNumber(i);
    }
}
