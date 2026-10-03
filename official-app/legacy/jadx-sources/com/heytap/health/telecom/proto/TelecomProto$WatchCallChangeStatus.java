package com.heytap.health.telecom.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum TelecomProto$WatchCallChangeStatus implements Internal.EnumLite {
    WCCS_UNDEFINE(0),
    WCCS_STATUS_01(1),
    WCCS_STATUS_02(2),
    WCCS_STATUS_03(3),
    WCCS_STATUS_04(4),
    WCCS_STATUS_05(5),
    WCCS_STATUS_06(6),
    WCCS_STATUS_07(7),
    UNRECOGNIZED(-1);

    public static final int WCCS_STATUS_01_VALUE = 1;
    public static final int WCCS_STATUS_02_VALUE = 2;
    public static final int WCCS_STATUS_03_VALUE = 3;
    public static final int WCCS_STATUS_04_VALUE = 4;
    public static final int WCCS_STATUS_05_VALUE = 5;
    public static final int WCCS_STATUS_06_VALUE = 6;
    public static final int WCCS_STATUS_07_VALUE = 7;
    public static final int WCCS_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<TelecomProto$WatchCallChangeStatus> internalValueMap = new Internal.EnumLiteMap<TelecomProto$WatchCallChangeStatus>() { // from class: com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TelecomProto$WatchCallChangeStatus findValueByNumber(int i) {
            return TelecomProto$WatchCallChangeStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TelecomProto$WatchCallChangeStatus.forNumber(i) != null;
        }
    }

    TelecomProto$WatchCallChangeStatus(int i) {
        this.value = i;
    }

    public static TelecomProto$WatchCallChangeStatus forNumber(int i) {
        switch (i) {
            case 0:
                return WCCS_UNDEFINE;
            case 1:
                return WCCS_STATUS_01;
            case 2:
                return WCCS_STATUS_02;
            case 3:
                return WCCS_STATUS_03;
            case 4:
                return WCCS_STATUS_04;
            case 5:
                return WCCS_STATUS_05;
            case 6:
                return WCCS_STATUS_06;
            case 7:
                return WCCS_STATUS_07;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<TelecomProto$WatchCallChangeStatus> internalGetValueMap() {
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
    public static TelecomProto$WatchCallChangeStatus valueOf(int i) {
        return forNumber(i);
    }
}
