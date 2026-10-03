package com.heytap.health.protocol.device_breeno;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceBreenoProto$DeviceBreenoCmdId implements Internal.EnumLite {
    CID_DEVICE_BREENO_UNDEFINE(0),
    CID_DEVICE_BREENO_LOCATION(1),
    CID_DEVICE_BREENO_SKILL_CMD(2),
    CID_DEVICE_BREENO_CAR_BIND(3),
    CID_DEVICE_BREENO_NAV_CAR_BIND(4),
    UNRECOGNIZED(-1);

    public static final int CID_DEVICE_BREENO_CAR_BIND_VALUE = 3;
    public static final int CID_DEVICE_BREENO_LOCATION_VALUE = 1;
    public static final int CID_DEVICE_BREENO_NAV_CAR_BIND_VALUE = 4;
    public static final int CID_DEVICE_BREENO_SKILL_CMD_VALUE = 2;
    public static final int CID_DEVICE_BREENO_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<DeviceBreenoProto$DeviceBreenoCmdId> internalValueMap = new Internal.EnumLiteMap<DeviceBreenoProto$DeviceBreenoCmdId>() { // from class: com.heytap.health.protocol.device_breeno.DeviceBreenoProto$DeviceBreenoCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceBreenoProto$DeviceBreenoCmdId findValueByNumber(int i) {
            return DeviceBreenoProto$DeviceBreenoCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceBreenoProto$DeviceBreenoCmdId.forNumber(i) != null;
        }
    }

    DeviceBreenoProto$DeviceBreenoCmdId(int i) {
        this.value = i;
    }

    public static DeviceBreenoProto$DeviceBreenoCmdId forNumber(int i) {
        if (i == 0) {
            return CID_DEVICE_BREENO_UNDEFINE;
        }
        if (i == 1) {
            return CID_DEVICE_BREENO_LOCATION;
        }
        if (i == 2) {
            return CID_DEVICE_BREENO_SKILL_CMD;
        }
        if (i == 3) {
            return CID_DEVICE_BREENO_CAR_BIND;
        }
        if (i != 4) {
            return null;
        }
        return CID_DEVICE_BREENO_NAV_CAR_BIND;
    }

    public static Internal.EnumLiteMap<DeviceBreenoProto$DeviceBreenoCmdId> internalGetValueMap() {
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
    public static DeviceBreenoProto$DeviceBreenoCmdId valueOf(int i) {
        return forNumber(i);
    }
}
