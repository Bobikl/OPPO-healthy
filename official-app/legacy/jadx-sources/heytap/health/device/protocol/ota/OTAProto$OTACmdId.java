package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$OTACmdId implements Internal.EnumLite {
    CID_OTA_DEVICE_ERROR(0),
    CID_OTA_REQ_UPD(1),
    CID_OTA_RES_UPD(2),
    CID_OTA_REQ_UPD_NEGOTIATE(3),
    CID_OTA_RSP_UPD_NEGOTIATE(4),
    CID_OTA_REQ_UPD_FILE_DATA(5),
    CID_OTA_REQ_UPD_FILE_DATA_VERIFY(6),
    CID_OTA_RSP_UPD_FILE_DATA_VERIFY(7),
    CID_OTA_REQ_UPD_FILE_VERIFY(8),
    CID_OTA_RSP_UPD_FILE_VERIFY(9),
    CID_OTA_REQ_UPD_FINISH(10),
    CID_OTA_RSP_UPD_FINISH(11),
    CID_OTA_STATUS_REQUEST(12),
    CID_OTA_STATUS_RSP(13),
    CID_OTA_REQ_SETTINGS(14),
    CID_OTA_UPDATE_SETTINGS(15),
    CID_OTA_QUERY_UPDATE(16),
    CID_OTA_START_UPDATE(17),
    CID_OTA_REQUEST_TRANSFER(18),
    CID_OTA_SYNC_DOWNLOAD_PERCENT(19),
    UNRECOGNIZED(-1);

    public static final int CID_OTA_DEVICE_ERROR_VALUE = 0;
    public static final int CID_OTA_QUERY_UPDATE_VALUE = 16;
    public static final int CID_OTA_REQUEST_TRANSFER_VALUE = 18;
    public static final int CID_OTA_REQ_SETTINGS_VALUE = 14;
    public static final int CID_OTA_REQ_UPD_FILE_DATA_VALUE = 5;
    public static final int CID_OTA_REQ_UPD_FILE_DATA_VERIFY_VALUE = 6;
    public static final int CID_OTA_REQ_UPD_FILE_VERIFY_VALUE = 8;
    public static final int CID_OTA_REQ_UPD_FINISH_VALUE = 10;
    public static final int CID_OTA_REQ_UPD_NEGOTIATE_VALUE = 3;
    public static final int CID_OTA_REQ_UPD_VALUE = 1;
    public static final int CID_OTA_RES_UPD_VALUE = 2;
    public static final int CID_OTA_RSP_UPD_FILE_DATA_VERIFY_VALUE = 7;
    public static final int CID_OTA_RSP_UPD_FILE_VERIFY_VALUE = 9;
    public static final int CID_OTA_RSP_UPD_FINISH_VALUE = 11;
    public static final int CID_OTA_RSP_UPD_NEGOTIATE_VALUE = 4;
    public static final int CID_OTA_START_UPDATE_VALUE = 17;
    public static final int CID_OTA_STATUS_REQUEST_VALUE = 12;
    public static final int CID_OTA_STATUS_RSP_VALUE = 13;
    public static final int CID_OTA_SYNC_DOWNLOAD_PERCENT_VALUE = 19;
    public static final int CID_OTA_UPDATE_SETTINGS_VALUE = 15;
    private static final Internal.EnumLiteMap<OTAProto$OTACmdId> internalValueMap = new Internal.EnumLiteMap<OTAProto$OTACmdId>() { // from class: heytap.health.device.protocol.ota.OTAProto$OTACmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$OTACmdId findValueByNumber(int i) {
            return OTAProto$OTACmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$OTACmdId.forNumber(i) != null;
        }
    }

    OTAProto$OTACmdId(int i) {
        this.value = i;
    }

    public static OTAProto$OTACmdId forNumber(int i) {
        switch (i) {
            case 0:
                return CID_OTA_DEVICE_ERROR;
            case 1:
                return CID_OTA_REQ_UPD;
            case 2:
                return CID_OTA_RES_UPD;
            case 3:
                return CID_OTA_REQ_UPD_NEGOTIATE;
            case 4:
                return CID_OTA_RSP_UPD_NEGOTIATE;
            case 5:
                return CID_OTA_REQ_UPD_FILE_DATA;
            case 6:
                return CID_OTA_REQ_UPD_FILE_DATA_VERIFY;
            case 7:
                return CID_OTA_RSP_UPD_FILE_DATA_VERIFY;
            case 8:
                return CID_OTA_REQ_UPD_FILE_VERIFY;
            case 9:
                return CID_OTA_RSP_UPD_FILE_VERIFY;
            case 10:
                return CID_OTA_REQ_UPD_FINISH;
            case 11:
                return CID_OTA_RSP_UPD_FINISH;
            case 12:
                return CID_OTA_STATUS_REQUEST;
            case 13:
                return CID_OTA_STATUS_RSP;
            case 14:
                return CID_OTA_REQ_SETTINGS;
            case 15:
                return CID_OTA_UPDATE_SETTINGS;
            case 16:
                return CID_OTA_QUERY_UPDATE;
            case 17:
                return CID_OTA_START_UPDATE;
            case 18:
                return CID_OTA_REQUEST_TRANSFER;
            case 19:
                return CID_OTA_SYNC_DOWNLOAD_PERCENT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<OTAProto$OTACmdId> internalGetValueMap() {
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
    public static OTAProto$OTACmdId valueOf(int i) {
        return forNumber(i);
    }
}
