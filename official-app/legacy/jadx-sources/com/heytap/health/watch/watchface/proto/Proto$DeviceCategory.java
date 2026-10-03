package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$DeviceCategory implements Internal.EnumLite {
    DEVICE_CATEGORY_DEFAULT(0),
    WATCH_OPLUS(1),
    BAND_LX(2),
    WATCH_RS(3),
    WATCH_OPLUS_V2(4),
    WATCH_FREE(5),
    WATCH_V3(6),
    BAND_V2(7),
    WATCH_V4(8),
    WATCH_ROUND(9),
    WATCH_ROUND_V2(11),
    WATCH_WEAR_OS_ROUND_V2(12),
    WATCH_COLUMBUS(13),
    WATCH_TAYCAN(14),
    UNRECOGNIZED(-1);

    public static final int BAND_LX_VALUE = 2;
    public static final int BAND_V2_VALUE = 7;
    public static final int DEVICE_CATEGORY_DEFAULT_VALUE = 0;
    public static final int WATCH_COLUMBUS_VALUE = 13;
    public static final int WATCH_FREE_VALUE = 5;
    public static final int WATCH_OPLUS_V2_VALUE = 4;
    public static final int WATCH_OPLUS_VALUE = 1;
    public static final int WATCH_ROUND_V2_VALUE = 11;
    public static final int WATCH_ROUND_VALUE = 9;
    public static final int WATCH_RS_VALUE = 3;
    public static final int WATCH_TAYCAN_VALUE = 14;
    public static final int WATCH_V3_VALUE = 6;
    public static final int WATCH_V4_VALUE = 8;
    public static final int WATCH_WEAR_OS_ROUND_V2_VALUE = 12;
    private static final Internal.EnumLiteMap<Proto$DeviceCategory> internalValueMap = new Internal.EnumLiteMap<Proto$DeviceCategory>() { // from class: com.heytap.health.watch.watchface.proto.Proto$DeviceCategory.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$DeviceCategory findValueByNumber(int i) {
            return Proto$DeviceCategory.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$DeviceCategory.forNumber(i) != null;
        }
    }

    Proto$DeviceCategory(int i) {
        this.value = i;
    }

    public static Proto$DeviceCategory forNumber(int i) {
        switch (i) {
            case 0:
                return DEVICE_CATEGORY_DEFAULT;
            case 1:
                return WATCH_OPLUS;
            case 2:
                return BAND_LX;
            case 3:
                return WATCH_RS;
            case 4:
                return WATCH_OPLUS_V2;
            case 5:
                return WATCH_FREE;
            case 6:
                return WATCH_V3;
            case 7:
                return BAND_V2;
            case 8:
                return WATCH_V4;
            case 9:
                return WATCH_ROUND;
            case 10:
            default:
                return null;
            case 11:
                return WATCH_ROUND_V2;
            case 12:
                return WATCH_WEAR_OS_ROUND_V2;
            case 13:
                return WATCH_COLUMBUS;
            case 14:
                return WATCH_TAYCAN;
        }
    }

    public static Internal.EnumLiteMap<Proto$DeviceCategory> internalGetValueMap() {
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
    public static Proto$DeviceCategory valueOf(int i) {
        return forNumber(i);
    }
}
