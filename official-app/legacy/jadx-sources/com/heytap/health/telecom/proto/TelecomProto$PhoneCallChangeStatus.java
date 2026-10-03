package com.heytap.health.telecom.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum TelecomProto$PhoneCallChangeStatus implements Internal.EnumLite {
    PCCS_UNDEFINE(0),
    PCCS_STATUS_01(1),
    PCCS_STATUS_02(2),
    PCCS_STATUS_03(3),
    PCCS_STATUS_04(4),
    PCCS_STATUS_05(5),
    PCCS_STATUS_06(6),
    PCCS_STATUS_07(7),
    PCCS_STATUS_08(8),
    PCCS_STATUS_09(9),
    PCCS_STATUS_10(10),
    PCCS_STATUS_11(11),
    PCCS_STATUS_12(12),
    UNRECOGNIZED(-1);

    public static final int PCCS_STATUS_01_VALUE = 1;
    public static final int PCCS_STATUS_02_VALUE = 2;
    public static final int PCCS_STATUS_03_VALUE = 3;
    public static final int PCCS_STATUS_04_VALUE = 4;
    public static final int PCCS_STATUS_05_VALUE = 5;
    public static final int PCCS_STATUS_06_VALUE = 6;
    public static final int PCCS_STATUS_07_VALUE = 7;
    public static final int PCCS_STATUS_08_VALUE = 8;
    public static final int PCCS_STATUS_09_VALUE = 9;
    public static final int PCCS_STATUS_10_VALUE = 10;
    public static final int PCCS_STATUS_11_VALUE = 11;
    public static final int PCCS_STATUS_12_VALUE = 12;
    public static final int PCCS_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<TelecomProto$PhoneCallChangeStatus> internalValueMap = new Internal.EnumLiteMap<TelecomProto$PhoneCallChangeStatus>() { // from class: com.heytap.health.telecom.proto.TelecomProto$PhoneCallChangeStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TelecomProto$PhoneCallChangeStatus findValueByNumber(int i) {
            return TelecomProto$PhoneCallChangeStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TelecomProto$PhoneCallChangeStatus.forNumber(i) != null;
        }
    }

    TelecomProto$PhoneCallChangeStatus(int i) {
        this.value = i;
    }

    public static TelecomProto$PhoneCallChangeStatus forNumber(int i) {
        switch (i) {
            case 0:
                return PCCS_UNDEFINE;
            case 1:
                return PCCS_STATUS_01;
            case 2:
                return PCCS_STATUS_02;
            case 3:
                return PCCS_STATUS_03;
            case 4:
                return PCCS_STATUS_04;
            case 5:
                return PCCS_STATUS_05;
            case 6:
                return PCCS_STATUS_06;
            case 7:
                return PCCS_STATUS_07;
            case 8:
                return PCCS_STATUS_08;
            case 9:
                return PCCS_STATUS_09;
            case 10:
                return PCCS_STATUS_10;
            case 11:
                return PCCS_STATUS_11;
            case 12:
                return PCCS_STATUS_12;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<TelecomProto$PhoneCallChangeStatus> internalGetValueMap() {
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
    public static TelecomProto$PhoneCallChangeStatus valueOf(int i) {
        return forNumber(i);
    }
}
