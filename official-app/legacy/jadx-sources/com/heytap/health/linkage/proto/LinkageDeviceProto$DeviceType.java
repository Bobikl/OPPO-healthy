package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$DeviceType implements Internal.EnumLite {
    TV(0),
    WATCH(1),
    WRISTBAND(2),
    HEADSET(3),
    COMPUTER(4),
    PAD(5),
    CAR(6),
    PHONE(7),
    DEVICETYPE_UNKNOWN(8),
    UNRECOGNIZED(-1);

    public static final int CAR_VALUE = 6;
    public static final int COMPUTER_VALUE = 4;
    public static final int DEVICETYPE_UNKNOWN_VALUE = 8;
    public static final int HEADSET_VALUE = 3;
    public static final int PAD_VALUE = 5;
    public static final int PHONE_VALUE = 7;
    public static final int TV_VALUE = 0;
    public static final int WATCH_VALUE = 1;
    public static final int WRISTBAND_VALUE = 2;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$DeviceType> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$DeviceType>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$DeviceType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$DeviceType findValueByNumber(int i) {
            return LinkageDeviceProto$DeviceType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$DeviceType.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$DeviceType(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$DeviceType forNumber(int i) {
        switch (i) {
            case 0:
                return TV;
            case 1:
                return WATCH;
            case 2:
                return WRISTBAND;
            case 3:
                return HEADSET;
            case 4:
                return COMPUTER;
            case 5:
                return PAD;
            case 6:
                return CAR;
            case 7:
                return PHONE;
            case 8:
                return DEVICETYPE_UNKNOWN;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$DeviceType> internalGetValueMap() {
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
    public static LinkageDeviceProto$DeviceType valueOf(int i) {
        return forNumber(i);
    }
}
