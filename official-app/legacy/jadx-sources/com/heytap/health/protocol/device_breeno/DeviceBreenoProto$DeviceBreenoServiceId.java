package com.heytap.health.protocol.device_breeno;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceBreenoProto$DeviceBreenoServiceId implements Internal.EnumLite {
    SID_DEVICE_BREENO_UNDEFINE(0),
    SID_DEVICE_BREENO(19),
    UNRECOGNIZED(-1);

    public static final int SID_DEVICE_BREENO_UNDEFINE_VALUE = 0;
    public static final int SID_DEVICE_BREENO_VALUE = 19;
    private static final Internal.EnumLiteMap<DeviceBreenoProto$DeviceBreenoServiceId> internalValueMap = new Internal.EnumLiteMap<DeviceBreenoProto$DeviceBreenoServiceId>() { // from class: com.heytap.health.protocol.device_breeno.DeviceBreenoProto$DeviceBreenoServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceBreenoProto$DeviceBreenoServiceId findValueByNumber(int i) {
            return DeviceBreenoProto$DeviceBreenoServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceBreenoProto$DeviceBreenoServiceId.forNumber(i) != null;
        }
    }

    DeviceBreenoProto$DeviceBreenoServiceId(int i) {
        this.value = i;
    }

    public static DeviceBreenoProto$DeviceBreenoServiceId forNumber(int i) {
        if (i == 0) {
            return SID_DEVICE_BREENO_UNDEFINE;
        }
        if (i != 19) {
            return null;
        }
        return SID_DEVICE_BREENO;
    }

    public static Internal.EnumLiteMap<DeviceBreenoProto$DeviceBreenoServiceId> internalGetValueMap() {
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
    public static DeviceBreenoProto$DeviceBreenoServiceId valueOf(int i) {
        return forNumber(i);
    }
}
