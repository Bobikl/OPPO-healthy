package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$QueryResultCode implements Internal.EnumLite {
    RESULT_CODE_UNDEFINED(0),
    RESULT_CODE_NEW_VERSION(1),
    RESULT_CODE_NONE_NEW_VERSION(2),
    RESULT_CODE_FAIL(3),
    RESULT_CODE_NONE_AUTO_DOWNLOAD(4),
    RESULT_CODE_DOWNLOAD_FAIL(5),
    RESULT_CODE_PRIVACY_NOT_ALLOW(6),
    RESULT_CODE_MOBILE_NETWORK(7),
    UNRECOGNIZED(-1);

    public static final int RESULT_CODE_DOWNLOAD_FAIL_VALUE = 5;
    public static final int RESULT_CODE_FAIL_VALUE = 3;
    public static final int RESULT_CODE_MOBILE_NETWORK_VALUE = 7;
    public static final int RESULT_CODE_NEW_VERSION_VALUE = 1;
    public static final int RESULT_CODE_NONE_AUTO_DOWNLOAD_VALUE = 4;
    public static final int RESULT_CODE_NONE_NEW_VERSION_VALUE = 2;
    public static final int RESULT_CODE_PRIVACY_NOT_ALLOW_VALUE = 6;
    public static final int RESULT_CODE_UNDEFINED_VALUE = 0;
    private static final Internal.EnumLiteMap<OTAProto$QueryResultCode> internalValueMap = new Internal.EnumLiteMap<OTAProto$QueryResultCode>() { // from class: heytap.health.device.protocol.ota.OTAProto$QueryResultCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$QueryResultCode findValueByNumber(int i) {
            return OTAProto$QueryResultCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$QueryResultCode.forNumber(i) != null;
        }
    }

    OTAProto$QueryResultCode(int i) {
        this.value = i;
    }

    public static OTAProto$QueryResultCode forNumber(int i) {
        switch (i) {
            case 0:
                return RESULT_CODE_UNDEFINED;
            case 1:
                return RESULT_CODE_NEW_VERSION;
            case 2:
                return RESULT_CODE_NONE_NEW_VERSION;
            case 3:
                return RESULT_CODE_FAIL;
            case 4:
                return RESULT_CODE_NONE_AUTO_DOWNLOAD;
            case 5:
                return RESULT_CODE_DOWNLOAD_FAIL;
            case 6:
                return RESULT_CODE_PRIVACY_NOT_ALLOW;
            case 7:
                return RESULT_CODE_MOBILE_NETWORK;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<OTAProto$QueryResultCode> internalGetValueMap() {
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
    public static OTAProto$QueryResultCode valueOf(int i) {
        return forNumber(i);
    }
}
