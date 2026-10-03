package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$UpdFileStatus implements Internal.EnumLite {
    UPD_FILE_STATUS_OK(0),
    UPD_FILE_STATUS_UPDATING(1),
    UPD_FILE_STATUS_ERROR_FILE(2),
    UNRECOGNIZED(-1);

    public static final int UPD_FILE_STATUS_ERROR_FILE_VALUE = 2;
    public static final int UPD_FILE_STATUS_OK_VALUE = 0;
    public static final int UPD_FILE_STATUS_UPDATING_VALUE = 1;
    private static final Internal.EnumLiteMap<OTAProto$UpdFileStatus> internalValueMap = new Internal.EnumLiteMap<OTAProto$UpdFileStatus>() { // from class: heytap.health.device.protocol.ota.OTAProto$UpdFileStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$UpdFileStatus findValueByNumber(int i) {
            return OTAProto$UpdFileStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$UpdFileStatus.forNumber(i) != null;
        }
    }

    OTAProto$UpdFileStatus(int i) {
        this.value = i;
    }

    public static OTAProto$UpdFileStatus forNumber(int i) {
        if (i == 0) {
            return UPD_FILE_STATUS_OK;
        }
        if (i == 1) {
            return UPD_FILE_STATUS_UPDATING;
        }
        if (i != 2) {
            return null;
        }
        return UPD_FILE_STATUS_ERROR_FILE;
    }

    public static Internal.EnumLiteMap<OTAProto$UpdFileStatus> internalGetValueMap() {
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
    public static OTAProto$UpdFileStatus valueOf(int i) {
        return forNumber(i);
    }
}
