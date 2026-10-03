package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$SpecialResultCode implements Internal.EnumLite {
    RESULT_CODE_DEFAULT(0),
    RESULT_SUCCESS(1),
    RESULT_ING(2),
    RESULT_PAUSE(3),
    RESULT_INSTALL_ING(4),
    RESULT_INSTALL_SUCCESS(5),
    RESULT_AUTHORIZED(6),
    RESULT_NETWORK(7),
    RESULT_MEMORY(8),
    RESULT_OTHER(9),
    RESULT_INSTALL_CANCEL(10),
    RESULT_INSTALL_MEMORY(11),
    RESULT_INSTALL_OTHER(12),
    UNRECOGNIZED(-1);

    public static final int RESULT_AUTHORIZED_VALUE = 6;
    public static final int RESULT_CODE_DEFAULT_VALUE = 0;
    public static final int RESULT_ING_VALUE = 2;
    public static final int RESULT_INSTALL_CANCEL_VALUE = 10;
    public static final int RESULT_INSTALL_ING_VALUE = 4;
    public static final int RESULT_INSTALL_MEMORY_VALUE = 11;
    public static final int RESULT_INSTALL_OTHER_VALUE = 12;
    public static final int RESULT_INSTALL_SUCCESS_VALUE = 5;
    public static final int RESULT_MEMORY_VALUE = 8;
    public static final int RESULT_NETWORK_VALUE = 7;
    public static final int RESULT_OTHER_VALUE = 9;
    public static final int RESULT_PAUSE_VALUE = 3;
    public static final int RESULT_SUCCESS_VALUE = 1;
    private static final Internal.EnumLiteMap<WatchAppProto$SpecialResultCode> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$SpecialResultCode>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$SpecialResultCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$SpecialResultCode findValueByNumber(int i) {
            return WatchAppProto$SpecialResultCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$SpecialResultCode.forNumber(i) != null;
        }
    }

    WatchAppProto$SpecialResultCode(int i) {
        this.value = i;
    }

    public static WatchAppProto$SpecialResultCode forNumber(int i) {
        switch (i) {
            case 0:
                return RESULT_CODE_DEFAULT;
            case 1:
                return RESULT_SUCCESS;
            case 2:
                return RESULT_ING;
            case 3:
                return RESULT_PAUSE;
            case 4:
                return RESULT_INSTALL_ING;
            case 5:
                return RESULT_INSTALL_SUCCESS;
            case 6:
                return RESULT_AUTHORIZED;
            case 7:
                return RESULT_NETWORK;
            case 8:
                return RESULT_MEMORY;
            case 9:
                return RESULT_OTHER;
            case 10:
                return RESULT_INSTALL_CANCEL;
            case 11:
                return RESULT_INSTALL_MEMORY;
            case 12:
                return RESULT_INSTALL_OTHER;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<WatchAppProto$SpecialResultCode> internalGetValueMap() {
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
    public static WatchAppProto$SpecialResultCode valueOf(int i) {
        return forNumber(i);
    }
}
